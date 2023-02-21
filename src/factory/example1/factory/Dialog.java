package factory.example1.factory;

import factory.example1.buttons.Button;

/**
 * base factory class. Note that "Factory" is merely a role for the class. It should
 * have some core business logic which needs different products to be created.
 */

public abstract class Dialog {
    public void renderWindow(){
        //... Other code ...
        Button okButon = createButton();
        okButon.render();
    }

    /**
     * subclasses will override this method in order to create specific button objects.
     */
    public abstract Button createButton();
}
