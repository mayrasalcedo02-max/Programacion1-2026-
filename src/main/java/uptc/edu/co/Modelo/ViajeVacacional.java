package uptc.edu.co.Modelo;

public class ViajeVacacional extends Viaje{

        public ViajeVacacional(String cliente, String destino, double kilometros, int minutosDeEspera) {
            super(cliente, destino, kilometros, minutosDeEspera);
        }

        @Override
        public double calcularTarifa() {
            return 5000 + getKilometros() * 100 + getMinutosDeEspera();
        }
    }

