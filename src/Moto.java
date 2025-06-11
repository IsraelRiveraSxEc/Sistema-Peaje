public class Moto extends Vehiculo {
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private int valorPeaje = 1;

    // Constructor de Moto
    public Moto(String placa, String marca) {
        super(placa, marca);
    }

    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    @Override
    public void imprimir() {
        System.out.println("Moto | Marca: " + marca + " | Placa: " + placa + " | Valor peaje: $" + valorPeaje);
    }
}
