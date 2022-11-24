package proyecto.programacion;

import java.util.Scanner;

public class Tecnico extends Empleado {

    public static int preciosServicio(int caso) {

        int precio=0;

        switch (caso) {
            case 1:
                precio = 25;
                //System.out.println("El servicio de limpieza tendrá un costo de $" + precio);
                break;
            case 2:
                precio = 35;
                //System.out.println("El servicio de revision tendrá un costo de $" + precio);
                break;
            case 3:
                precio = 80;
                //System.out.println("El servicio de reparacion tendrá un costo de $" + precio);
                break;
            case 4:
                precio = 30;
               // System.out.println("El servicio de optimizacion tendrá un costo de $" + precio);
                break;
            default:
                System.out.println("Esa opción de servicio no existe");
                break;
        }
        return precio;
    }
}
