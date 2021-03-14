
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;


public class DarkifiedProject implements ProjectComponent {

    /*********************************************************************************************
     Types, Properties and iVars
     *********************************************************************************************/

    private static final Logger log = Logger.getInstance("net.mkd.DraculaDarkified.DarkifiedProject");

    /*********************************************************************************************
     Lifecycle
     *********************************************************************************************/

    public DarkifiedProject(Project project) {

        //this.log.setLevel(Level.DEBUG);

        log.debug("DarkifiedProject(), project: " + project);
    }

    /*********************************************************************************************
     ProjectComponent
     *********************************************************************************************/

    @Override
    public void initComponent() {
        log.debug("initComponent()");
    }

    @Override
    public  void disposeComponent() {
        log.debug("disposeComponent()");
    }

    @Override
    public void projectOpened() {
        log.debug("projectOpened()");
    }

    @Override
    public void projectClosed() {
        log.debug("projectClosed()");
    }
}
