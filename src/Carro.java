public class Carro extends Vehiculo {
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private int valorPeaje = 2;

    // Constructor de Carro
    public Carro(String placa, String marca) {
        super(placa, marca);
    }

    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    @Override
    public void imprimir() {
        System.out.println("Carro | Marca: " + marca + " | Placa: " + placa + " | Valor peaje: $" + valorPeaje);
    }
}
