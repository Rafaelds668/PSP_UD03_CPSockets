import java.io.IOException;

public class MainCliente
{
    public static void main(String[] args) throws IOException
    {
        Cliente cli = new Cliente(); //Se crea el cliente
        System.out.println("Iniciando cliente");
        cli.startClient(); //Se inicia el cliente
    }
}
