package factory.example1;

import factory.example1.factory.Dialog;
import factory.example1.factory.HTMLDialog;
import factory.example1.factory.WindowDialog;

/**
 * Demo class, Everything comes together here
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String args[]){
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or environment options
     */
    static void configure(){
        if(System.getProperty("os.name").equalsIgnoreCase("Windows 10")){
            dialog = new WindowDialog();
        }else{
            dialog = new HTMLDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through abstract
     * interfaces. This way it does not care which factory it works with and what kind of product
     * it returns
     */
    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
