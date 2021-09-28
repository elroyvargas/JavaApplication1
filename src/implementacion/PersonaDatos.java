
 
package implementacion;

import java.util.ArrayList;
import entidades.Persona;

public class PersonaDatos {
    ArrayList<Persona> lista = new ArrayList<>();
    
    public void Create(Persona p){
        System.out.println("insertando:"+ p.getNombres());
        
   
         lista.add(p);
    }
    public ArrayList<Persona> listaPersonas(){
        return lista;
    
    }
    public void eliminarPersonas(int id){
        for(Persona s : lista){
            if(id==s.getId()){
                System.out.println("Eliminando registro de:"+s.getNombres());
                lista.remove(s);
                break;
                       
                
            }
        }
            
    }
    public void actualizarPersona(int id, Persona p){
         for(Persona s : lista){
            if(id==s.getId()){
               s.setNombres(p.getNombres());
               s.setAp_paterno(p.getAp_paterno());
               s.setAp_materno(p.getAp_materno());
               s.setDireccion(p.getDireccion());
               s.setSexo(p.getSexo());
               
               
                
                       
                
            }
        }
    }
}
