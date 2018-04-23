package prebechat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Servidor extends Thread{
  private String nombreCliente;
  private static DataInputStream entrada;
  //private static String cadena="";
  private static int puerto;
  
  private static ArrayList<DataOutputStream> usuarios = new  ArrayList<DataOutputStream>();
  public static Iterator it;
  private static LinkedHashMap<String,Socket> usuario = new  LinkedHashMap<String,Socket>();
  private static Socket so;
    
  public Servidor(Socket s) throws IOException{
      try{
    entrada=new DataInputStream(s.getInputStream());
    nombreCliente=s.getInetAddress().getCanonicalHostName();
    System.out.println("Conexion aceptada desde "+s.getRemoteSocketAddress());
        } catch (IOException ex) {
    
                                               }}

  public static String recibir(){
      String str="No se recibio";
      try{
     str=entrada.readUTF();
           
      }
      catch(IOException ioe){}
      return str;
  }

  public void cerrarFlujo() throws  IOException{
    entrada.close();                            }
  public static void enviar(String msg,DataOutputStream sot) throws IOException{
    sot.writeUTF(msg);                                                      }
  public static void retardo(){
      try{   
          System.out.println("");///////////////////////////////////////////////////////Esperamos
                                    }
      catch(Exception e){}
                               }
  
  
  public String lista(Socket st){
      return String.format("%d  ",st.getPort());
      
  }
  @Override
  public void run(){

    try {
      String cadena="";
      do{
          ////////////////////////////////////////////////////////////////////////////
         cadena=recibir();   
         //////////////////////////////////////////////////////////////
       // int i = Integer.parseInt(cadena);                         //
       // retardo();
       // cadena=recibir();                                         //
        System.out.println(nombreCliente+" dice: "+cadena);      //
       // enviar(cadena,usuarios.get(i));                           //
                                 //
        //////////////////////////////////////////////////////////////
         switch(cadena){
        case "LIST":
         //   it = usuario.keySet().iterator();
           //     for(int j=0;j<usuario.size();j++){
             //       String key = (String)it.next();
                    System.out.println("Nombre :");
            //}
        break;
        case "QUIT":
            System.out.println("QUIT");
        break;
        case "TEXT":
            for(int i=0 ;i<usuarios.size();i++){
            // ps=new PrintStream(usuarios.get(i).getOutputStream()); 
           // ps.println(msg);
                System.out.println("TEXT");   
             }
        break;
        case "TEXT_TO":
            System.out.println("TEXT_TO");
        break;
        case "SEND_FILE":
            System.out.println("SEND_FILE");
        break;
         }
       
      }while (!cadena.equals("Salir"));
    } catch(Exception ioe) {
      System.out.println("Se cerro la conexion con "+nombreCliente);
    }finally{
      try{
        cerrarFlujo();
      }catch(IOException e){
        System.out.println("Errior al cerrar");
      }
    }
  }

  public static void main(String[] args) throws IOException{
    DataOutputStream ps;
    ServerSocket ss;
    Servidor hilo;
    
    String mensaje="";
    ss=new ServerSocket(0);
    System.out.println("Servidor aceptando conexiones en el puerto "+ss.getLocalPort());
    Socket cliente =ss.accept(); 
        
        while(true){    
      hilo = new Servidor(cliente);
      hilo.start();
      puerto=entrada.readInt();
     // Socket so = new Socket(cliente.getInetAddress().getHostName(),puerto);
      //ps=new DataOutputStream(so.getOutputStream());
      //usuarios.add(ps);
      //mensaje=entrada.readUTF();
      //usuario.put("mensaje",cliente);
      cliente =ss.accept();
                }
  }
                                        }