package factory.example1.buttons;

public class HTMLButton implements Button {
    @Override
    public void render(){
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick(){
        System.out.println("Click Buttons says - 'Hello world!'");
    }
}
