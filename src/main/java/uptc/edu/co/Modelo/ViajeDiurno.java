package uptc.edu.co.Modelo;

public class ViajeDiurno extends Viaje{

    public ViajeDiurno(String cliente, String destino, double kilometros, int minutosDeEspera) {
        super(cliente,destino, kilometros, minutosDeEspera);
    }

    @Override
    public double calcularTarifa() {
        return 4400+getKilometros()*100+getMinutosDeEspera();
    }

}
