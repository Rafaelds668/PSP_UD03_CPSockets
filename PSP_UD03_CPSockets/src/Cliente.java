import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cliente extends Conexion
{
    //Se usa el constructor para cliente de Conexion
    public Cliente() throws IOException{super("cliente");} 
    public void startClient() //M�todo para iniciar el cliente
    {
        try{
            //Flujo de datos hacia el servidor
           System.out.println("Esperando...");
           while (true){
               this.cs = this.ss.accept();
               System.out.println("Cliente em linea");
               this.salidaCliente = new DataOutputStream(this.cs.getOutputStream());
               this.salidaCliente.writeUTF("Petición recibida y aceptada");
               BufferedReader entrada = new BufferedReader(new InputStreamReader(this.cs.getInputStream()));

               while ((this.mensajeServidor = entrada.readLine()) != null){
                   System.out.println(this.mensajeServidor);
               }

               System.out.println("Fin de la Conexion");
           }
        }
        catch (Exception var2) {
            System.out.println(var2.getMessage());
        }

    }
}
