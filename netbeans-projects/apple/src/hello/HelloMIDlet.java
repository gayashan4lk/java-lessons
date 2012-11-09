/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SimpleTableModel;
import org.netbeans.microedition.lcdui.TableItem;

//</editor-fold>

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">
/**
 * @author Home
 */
public class HelloMIDlet extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
private Command exitCommand;
private Command exit_alert;
private Command cancel_alert;
private Form form;
private StringItem stringItem;
private Image image1;
private SimpleTableModel tableModel1;
//</editor-fold>//GEN-END:|fields|0|
private Form gform;
    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
/**
 * Initializes the application.
 * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
 */
private void initialize () {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
/**
 * Performs an action assigned to the Mobile Device - MIDlet Started point.
 */
public void startMIDlet () {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable (null, getForm ());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
/**
 * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
 */
public void resumeMIDlet () {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
/**
 * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
 * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
 * @param nextDisplayable the Displayable to be set
 */
public void switchDisplayable (Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay ();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
if (alert == null) {
display.setCurrent (nextDisplayable);
} else {
display.setCurrent (alert, nextDisplayable);
}//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
/**
 * Called by a system to indicated that a command has been invoked on a particular displayable.
 * @param command the Command that was invoked
 * @param displayable the Displayable where the command was invoked
 */
public void commandAction (Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|19-preAction
if (command == exitCommand) {//GEN-END:|7-commandAction|1|19-preAction
                // write pre-action user code here
exitMIDlet ();//GEN-LINE:|7-commandAction|2|19-postAction
                // write post-action user code here
}//GEN-BEGIN:|7-commandAction|3|7-postCommandAction
}//GEN-END:|7-commandAction|3|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|4|19-postAction
//</editor-fold>//GEN-END:|7-commandAction|4|19-postAction


//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
/**
 * Returns an initiliazed instance of exitCommand component.
 * @return the initialized component instance
 */
public Command getExitCommand () {
if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
exitCommand = new Command ("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
return exitCommand;
}
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
/**
 * Returns an initiliazed instance of form component.
 * @return the initialized component instance
 */
public Form getForm () {
if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
form = new Form ("apple", new Item[] { getStringItem () });//GEN-BEGIN:|14-getter|1|14-postInit
form.addCommand (getExitCommand ());
form.setCommandListener (this);//GEN-END:|14-getter|1|14-postInit

}
}//GEN-BEGIN:|14-getter|2|
return form;
}
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|16-getter|0|16-preInit
/**
 * Returns an initiliazed instance of stringItem component.
 * @return the initialized component instance
 */
public StringItem getStringItem () {
if (stringItem == null) {//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
stringItem = new StringItem ("Hello", "Hello, World!");//GEN-LINE:|16-getter|1|16-postInit
            // write post-init user code here
}//GEN-BEGIN:|16-getter|2|
return stringItem;
}
//</editor-fold>//GEN-END:|16-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exit_alert ">//GEN-BEGIN:|23-getter|0|23-preInit
/**
 * Returns an initiliazed instance of exit_alert component.
 * @return the initialized component instance
 */
public Command getExit_alert () {
if (exit_alert == null) {//GEN-END:|23-getter|0|23-preInit
 // write pre-init user code here
exit_alert = new Command ("Exit", Command.EXIT, 0);//GEN-LINE:|23-getter|1|23-postInit
 // write post-init user code here
}//GEN-BEGIN:|23-getter|2|
return exit_alert;
}
//</editor-fold>//GEN-END:|23-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancel_alert ">//GEN-BEGIN:|25-getter|0|25-preInit
/**
 * Returns an initiliazed instance of cancel_alert component.
 * @return the initialized component instance
 */
public Command getCancel_alert () {
if (cancel_alert == null) {//GEN-END:|25-getter|0|25-preInit
 // write pre-init user code here
cancel_alert = new Command ("Cancel", Command.CANCEL, 0);//GEN-LINE:|25-getter|1|25-postInit
 // write post-init user code here
}//GEN-BEGIN:|25-getter|2|
return cancel_alert;
}
//</editor-fold>//GEN-END:|25-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|27-getter|0|27-preInit
/**
 * Returns an initiliazed instance of image1 component.
 * @return the initialized component instance
 */
public Image getImage1 () {
if (image1 == null) {//GEN-END:|27-getter|0|27-preInit
 // write pre-init user code here
image1 = Image.createImage (1, 1);//GEN-LINE:|27-getter|1|27-postInit
 // write post-init user code here
}//GEN-BEGIN:|27-getter|2|
return image1;
}
//</editor-fold>//GEN-END:|27-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableModel1 ">//GEN-BEGIN:|37-getter|0|37-preInit
/**
 * Returns an initiliazed instance of tableModel1 component.
 * @return the initialized component instance
 */
public SimpleTableModel getTableModel1 () {
if (tableModel1 == null) {//GEN-END:|37-getter|0|37-preInit
 // write pre-init user code here
tableModel1 = new SimpleTableModel (new java.lang.String[][] {//GEN-BEGIN:|37-getter|1|37-postInit
new java.lang.String[] { "path finder" },
new java.lang.String[] { "your area map" },
new java.lang.String[] { "downloader" },
new java.lang.String[] { "open OS" },
new java.lang.String[] { "" }}, new java.lang.String[] { "gApplication" });//GEN-END:|37-getter|1|37-postInit
 // write post-init user code here
}//GEN-BEGIN:|37-getter|2|
return tableModel1;
}
//</editor-fold>//GEN-END:|37-getter|2|

    /*
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
