package uptc.edu.co.Vista;

import uptc.edu.co.Controlador.Central;
import uptc.edu.co.Modelo.ViajeDiurno;

public class Menu {
    public Central central;

    public Menu(){
        central=new Central();
    }

    public void iniciar(){


        System.out.println(central.agregar(new ViajeDiurno("Lola", "Cali", 8,120))
                ? "-> viaje creado correctamente."
                : "-> no se ha creado el viaje");
        central.agregar(new ViajeDiurno("Carlos", "Uptc", 2,20));
        central.agregar(new ViajeDiurno("Dani", "Centro", 3,30));

        System.out.println(central.getViajes());

        System.out.println("Se han realizado "+central.getCantidad()+" viajes");
        System.out.println("El viaje mas caro es el de: "+central.getMasCaro().getCliente()+" que costo "+central.getMasCaro().calcularTarifa());
    }
}
