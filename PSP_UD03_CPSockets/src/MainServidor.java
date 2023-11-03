import java.io.IOException;

public class MainServidor
{
    public static void main(String[] args) throws IOException
    {
        Servidor serv = new Servidor(); //Se crea el servidor
        System.out.println("Iniciando servidor");
        serv.startServer(); //Se inicia el servidor
    }
}


