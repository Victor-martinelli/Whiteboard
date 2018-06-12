package actions;

import com.opensymphony.xwork2.ActionContext;
import static com.opensymphony.xwork2.ActionContext.getContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import model.POJOs.Actividades;
import model.POJOs.Alumnos;
import model.POJOs.Entrega;
import model.POJOs.EntregaPK;
import model.POJOs.Usuario;
import static model.dao.DAOImpl.*;
import static org.apache.commons.lang3.StringUtils.stripAccents;
import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 *
 * @author Portatil
 */
public class EntregaActions extends ActionSupport {

    private File file;

    String fileContentType;

    String fileFileName;

    private String actividadId;
    
    private List<Entrega> all;
    
    private Actividades currentActividad;

    public EntregaActions() {
    }

    public String execute() throws Exception {
        Map session = (Map) ActionContext.getContext().get("session");
        Usuario current = (Usuario) session.get("usuario");
        
       
        //Find actividad
        Actividades actividad = findActividad(actividadId);

        String fullPath = getServletContext().getRealPath(File.separator)+(path + "/" + stripAccents(actividad.getAsignaturaId().getNombre()) + "/entregas/" + stripAccents(actividad.getNombre()) + "/" + current.getUsername());

        Entrega newEntrega = new Entrega();
        
        //Create folder to store entrega (lo hace dentro de glass fish)
        File saveFolder = new File(fullPath);

        saveFolder.mkdirs();
       
        file.renameTo(new File(fullPath+"/"+fileFileName));
       
        int startPath = (fullPath+"/"+fileFileName).indexOf("files");
        
        newEntrega.setAlumnos((Alumnos) current);
        newEntrega.setRutaArchivo((fullPath+"/"+fileFileName).substring(startPath));
        newEntrega.setActividades(actividad);
        newEntrega.setEntregaPK(new EntregaPK(current.getIdUsuario(),actividad.getActividadId()));
        
        crearEntrega(newEntrega);
        
        return SUCCESS;
    }

    public String getActividadId() {
        return actividadId;
    }

    public void setActividadId(String actividadId) {
        this.actividadId = actividadId;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
    
    public String getEntregasActividad()
    {
        all = getTodasEntregasActividad(actividadId);
        
         //Find actividad
        currentActividad = findActividad(actividadId);
        return SUCCESS;
    }

    public List<Entrega> getAll() {
        return all;
    }

    public void setAll(List<Entrega> all) {
        this.all = all;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public Actividades getCurrentActividad() {
        return currentActividad;
    }

    public void setCurrentActividad(Actividades currentActividad) {
        this.currentActividad = currentActividad;
    }

    
    
    

}
