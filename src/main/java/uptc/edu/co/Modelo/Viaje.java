package uptc.edu.co.Modelo;

public abstract class Viaje {

    private String destino;
    private double kilometros;
    private int minutosDeEspera;
    private String cliente;

    public Viaje(String cliente, String destino, double kilometros, int minutosDeEspera) {
        this.destino = destino;
        this.kilometros = kilometros;
        this.minutosDeEspera = minutosDeEspera;
        this.cliente=cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDestino() {
        return destino;
    }

    public double getKilometros() {
        return kilometros;
    }

    public int getMinutosDeEspera() {
        return minutosDeEspera;
    }

    public abstract double calcularTarifa();

    @Override
    public String toString(){
        return cliente+" | "+destino+" | "+kilometros+"km | "+minutosDeEspera+"min"+" | $"+calcularTarifa();
    }
}
