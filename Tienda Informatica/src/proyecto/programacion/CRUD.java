package proyecto.programacion;

import java.util.List;

public interface CRUD <G> {
    
   public int Create (G g);
   
   public List<G> readAll();
    
   public List<G> Buscar(double key);
    
   public int Delete (int key);
}