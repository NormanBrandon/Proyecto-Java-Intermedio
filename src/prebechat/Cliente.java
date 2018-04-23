
package prebechat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.io.InputStreamReader;

public class Cliente{
  private PrintStream ps;
  private String host;
  private int port;

  public Cliente(int puerto, String host,String mensaje) throws IOException, InterruptedException{
       this.host=host;
       this.port=puerto;
       conectar();    
       ps.println(mensaje);
      
  }
  public void conectar() throws IOException{
        Socket s=new Socket(host,port);
        ps=new PrintStream(s.getOutputStream()); 
       
  }


}
