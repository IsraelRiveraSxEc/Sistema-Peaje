public abstract class Vehículo {
    protected String placa;
    protected String marca;

    // Constructor de la clase base Vehículo
    public Vehículo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    // Método abstracto para obtener el valor del peaje según el tipo de vehículo
    public abstract int getValorPeaje();

    // Método abstracto para imprimir información del vehículo
    public abstract void imprimir();
}
