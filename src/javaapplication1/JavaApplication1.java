
package javaapplication1;

import entidades.Persona;
import implementacion.PersonaDatos;
import java.util.ArrayList;
import java.util.Scanner;


public class JavaApplication1 {
               
    
     
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     PersonaDatos pd = new PersonaDatos();

int opt=0;
       do{
           System.out.print("elija la opcion   1.Crear   2.Listar   3.Eliminar   4.actualizar");
           opt= sc.nextInt();
 switch(opt){
               case 1:{
                   System.out.println("I.creando");
                   Persona p1 = new Persona();
                   System.out.println("ingrese id ");
                   p1.setId(sc.nextInt());
                   System.out.println("ingrese nombres");
                   p1.setNombres(sc.next());
                   System.out.println("ingrese apellidos paterno");
                   p1.setAp_paterno(sc.next());
                   System.out.println("ingrese apellido materno");
                   p1.setAp_materno(sc.next());
                   System.out.println("direccion");
                   p1.setDireccion(sc.next());
                  sc=new Scanner(System.in);
                   System.out.println("ingrese genero");
                   p1.setSexo(sc.next());
                   
                   pd.Create(p1);
                   
               }
               break;
               
               
               case 2:{
                   System.out.println("II.listando");
                   
                   for (Persona p :pd.listaPersonas()) {
                       System.out.println("----------");
                       System.out.println(p.getId());
                       System.out.println(p.getNombres());
                       System.out.println(p.getAp_paterno());
                       System.out.println(p.getAp_materno());
                       System.out.println(p.getDireccion());
                       System.out.println(p.getSexo());
                          
                       
                   }
                   
               }          
               break;
               
               case 3:
                   System.out.println("III.eliminando");
                   System.out.println("ingrese id");
                   int id = sc.nextInt();
                   pd.eliminarPersonas(id);
                   
               break;
               
               case 4:{
                   System.out.println("IV..actualizando");
                    Persona p1 = new Persona();
                   
                   System.out.println("ingrese id ");
                   p1.setId(sc.nextInt());
                   System.out.println("ingrese nombres");
                   p1.setNombres(sc.next());
                   System.out.println("ingrese apellidos paterno");
                   p1.setAp_paterno(sc.next());
                   System.out.println("ingrese apellido materno");
                   p1.setAp_materno(sc.next());
                   System.out.println("direccion");
                   p1.setDireccion(sc.next());
                  sc=new Scanner(System.in);
                   System.out.println("ingrese genero");
                   p1.setSexo(sc.next());
                   System.out.println("ingrese ID a cambiar");
                   pd.actualizarPersona(sc.nextInt(), p1);
                           
                   
               }
               break;
               
               
           }
       }while(opt!=0);
        
        
      
       
       Persona p1 = new Persona();
      
       p1.setId(1);
       p1.setNombres("Eder");
       p1.setAp_paterno("Gutierrez");
       p1.setAp_materno("Quispe");
       p1.setDireccion("jr huancane");
       p1.setSexo("M");
       
       
       Persona p2 = new Persona();
       p2.setId(2);
       p2.setNombres("Joselin");
       p2.setAp_paterno("Condori");
       p2.setAp_materno("Quispe");
       p2.setDireccion("jr Moquegua");
       p2.setSexo("F");
       
       
       
       Persona p3 = new Persona();
       p3.setId(3);
       p3.setNombres("Miguel");
       p3.setAp_paterno("Huayhua");
       p3.setAp_materno("Chambi");
       p3.setDireccion("jr Lambayeque");
       p3.setSexo("M");
       
       
       
       
       pd.Create(p1);
       pd.Create(p2);
       pd.Create(p3);
       
       System.out.println("Antes de eliminar::::::::::");
       
       for(Persona ps: pd.listaPersonas()){
           System.out.println(ps.getId()+" "+
                              ps.getNombres()+" "+ 
                              ps.getAp_paterno()+" "+
                              ps.getAp_materno()
           );
       }
       pd.eliminarPersonas(2);
      
       System.out.println("despues de eliminar:::::::::::");
       for(Persona ps: pd.listaPersonas()){
           System.out.println(ps.getId()+" "+
                              ps.getNombres()+" "+ 
                              ps.getAp_paterno()+" "+
                              ps.getAp_materno());
           
        }
    }
   
}


       

     
   
    

