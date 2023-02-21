package factory.example1.factory;

import factory.example1.buttons.Button;
import factory.example1.buttons.HTMLButton;

/**
 * HTML Dialog produce HTML buttons
 */
public class HTMLDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
