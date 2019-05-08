
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.ui.Gray;

import javax.swing.*;
import java.awt.*;


public class DarkifiedApplication implements ApplicationComponent {

    /*********************************************************************************************
     Types, Properties and iVars
     *********************************************************************************************/

    private static final Logger log = Logger.getInstance("net.morgankdavis.DraculaDarkified.DarkifiedApplication");

    /*********************************************************************************************
     ApplicationComponent
     *********************************************************************************************/

    @Override
    public void initComponent() {

        //this.log.setLevel(Level.DEBUG);

        log.debug("initComponent()");

        LookAndFeel dracula = new com.intellij.ide.ui.laf.darcula.DarculaLaf();
        try {
            UIManager.setLookAndFeel(dracula);
        }
        catch (UnsupportedLookAndFeelException e) {
            log.debug(e.getMessage());
        }

        Color selectionColor = Gray._54;
        Color backgroundColor = Gray._32;
        Color textColor = Gray._160;

        UIManager.put("Tree.background", backgroundColor);
        UIManager.put("Tree.textBackground", backgroundColor);
        UIManager.put("Tree.selectionBackground", selectionColor);
        UIManager.put("Tree.foreground", textColor);
    }

    @Override
    public  void disposeComponent() {
        log.debug("disposeComponent()");
    }
}
