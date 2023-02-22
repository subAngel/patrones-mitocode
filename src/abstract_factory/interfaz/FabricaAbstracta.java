package abstract_factory.interfaz;

public interface FabricaAbstracta {
    IConexionDB getBD(String motor);
    IConexionREST getREST(String area);
}
