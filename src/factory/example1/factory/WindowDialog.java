package factory.example1.factory;

import factory.example1.buttons.Button;
import factory.example1.buttons.WindowsButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
