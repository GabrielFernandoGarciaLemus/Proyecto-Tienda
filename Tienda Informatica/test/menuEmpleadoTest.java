
import org.junit.Test;
import static org.junit.Assert.*;
import static junit.framework.Assert.assertEquals;
import org.junit.*;
import proyecto.programacion.Empleado;
import proyecto.programacion.Hardware;
import proyecto.programacion.Software;
import proyecto.programacion.Tecnico;
import proyecto.programacion.menuEmpleado;


public class menuEmpleadoTest {
        
    @Test
    public void testAdicionSoftware(){
        
        System.out.println("Adicion de Producto Software");
        
        String nombre = "Windows 10", marca = "Microsoft", modelo = "PRO";
        double precio = 19.99;
        int cantidad = 20, codigo = 12345;

        
        Software softwareDatos = new Software(nombre, marca, modelo, precio, cantidad, codigo);

        int expResult=1;
        int Result= new Software().Create(softwareDatos);
        assertEquals(expResult,Result);
    }
    
    @Test
    public void testAdicionHardware(){
        
        System.out.println("Adicion de Producto Hardware");
        
        String nombres = "Procesador", marcas = "Intel", modelos = "i5";
        double precios = 149.99;
        int cantidades = 10, codigos = 1998;

        
        Hardware hardwareDatos = new Hardware(nombres, marcas, modelos, precios, cantidades, codigos);

        int expResult=1;
        int Result= new Hardware().Create(hardwareDatos);
        assertEquals(expResult,Result);
    }
    
    
    @Test
    public void testAdicionHaEmpleado(){
        
        System.out.println("Adicion de Empleado a la Empresa");
        
        String nombre = "Juan", apellido = "Perez";

        int ID=123, fecha = 2000;
        char sexo ='M';
        
        Empleado empleadoDatos = new Empleado(nombre, apellido, ID, sexo, fecha);


        int expResult=1;
        int Result= new Empleado().Create(empleadoDatos);
        assertEquals(expResult,Result);
    }
    
    
        @Test
    public void testEliminacionSoftware(){
        System.out.println("Eliminacion de Producto Software");



        int expResult=1;
        int Result= new Software().Delete(12345);
        assertEquals(expResult,Result);
    }

    
           @Test
    public void testEliminacionHarddware(){
        System.out.println("Eliminacion de Producto Hradware");

        int expResult=1;
        int Result= new Hardware().Delete(12345);
        assertEquals(expResult,Result);
    }
    
           @Test
    public void testEliminacionEmpleado(){
        System.out.println("Eliminacion de Producto Software");

        Empleado empleadoDatos = new Empleado();


        int expResult=1;
        int Result= new Empleado().Delete(12345);
        assertEquals(expResult,Result);
    }
}
