

package agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        String nombrep,nombrem,telefono;
        int opcion=0;
        ArrayList<Persona> directorio = new ArrayList<Persona>(); 
        
        Scanner teclado= new Scanner(System.in);
        
        while(true){
        System.out.println("Ingrese la opcion de la Accion que desea realizar");
            System.out.println("1)Agregar Persona");
            System.out.println("2)Buscar Persona");
            System.out.println("3)Eliminar persona");
        try{
     
         opcion=teclado.nextInt();
         teclado.nextLine();
        
        switch(opcion){
            case 1:
                  
                System.out.println("Ingrese nombre de la Persona que desea agregar");
                nombrep=teclado.nextLine();
                System.out.println("Ingrese el numero de telefono");
                telefono=teclado.nextLine();
                System.out.println("Ingrese el nombre de su mascota");
                nombrem=teclado.nextLine();
                Persona p = new Persona(nombrep,nombrem,telefono);
                directorio.add(p);
            break;
            case 2:
                System.out.println("Ingrese el nombre de la persona que desea buscar");
                nombrep=teclado.nextLine();
               
    
                    for (int  i = 0; i < directorio.size(); i++) {
                        if(nombrep.equals(directorio.get(i).getNombre())){
                            
                            System.out.println(directorio.get(i).getNombre());
                            System.out.println(directorio.get(i).getNumero());
                            System.out.println(directorio.get(i).getM());
                        }
                       
                     }
                      break;
            case 3:
                System.out.println("Ingrese el nombre de la persona que desea buscar");
                nombrep=teclado.nextLine();
                    for (int  i = 0; i < directorio.size(); i++) {
                        if(nombrep.equals(directorio.get(i).getNombre())){
                        directorio.remove(i);   
                        }
                }
                      break;
            case 4:
                System.out.println("Ingrese el nombre de la persona que desea buscar");
                directorio.clear();
                      break;
        }}
            catch(Exception e){
           System.out.println("Ingrese un numero");
        }
                
                
          
        
        
        }}
        
    }
    

