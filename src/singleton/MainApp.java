package singleton;

import singleton.application.Application;

import java.sql.Connection;

public class MainApp {
    public static void main(String[] args) {
        Application app = new Application();
//        app.conectar();
        app.visualizar();
        app.insertar("Descripcion del sexto articulo'", 1, 10);
        app.visualizar();


    }
}
