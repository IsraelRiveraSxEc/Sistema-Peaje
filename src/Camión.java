public class Camión extends Vehiculo {
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private int numeroEjes;

    // Constructor de Camión
    public Camión(String placa, String marca, int numeroEjes) {
        super(placa, marca);
        this.numeroEjes = numeroEjes;
    }

    @Override
    public int getValorPeaje() {
        return numeroEjes; // $1 por cada eje
    }

    @Override
    public void imprimir() {
        System.out.println("Camión | Marca: " + marca + " | Placa: " + placa + " | Ejes: " + numeroEjes + " | Valor peaje: $" + getValorPeaje());
    }
}
