package uptc.edu.co.Controlador;
import uptc.edu.co.Modelo.Viaje;

import java.util.ArrayList;

public class Central {
    private ArrayList<Viaje> viajes;

    public Central(){
        viajes=new ArrayList<>();
    }

    public boolean agregar(Viaje viaje){
        for (Viaje v : viajes){
            if (v.getCliente().equalsIgnoreCase(viaje.getCliente())){
                return false;
            }
        }

        viajes.add(viaje);
        return true;
    }
    public ArrayList<Viaje> getViajes(){
        return viajes;
    }
    public int getCantidad(){
        return viajes.size();
    }

    public Viaje getMasCaro(){
        Viaje mayor = viajes.get(0);
        for (Viaje v : viajes){
            if (mayor.calcularTarifa()<v.calcularTarifa()) {
                mayor = v;
            }
        }
        return mayor;
    }
}
