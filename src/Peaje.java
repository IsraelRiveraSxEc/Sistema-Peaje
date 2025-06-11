import java.util.ArrayList;

public class Peaje {
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private String nombre;
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private String canton;
    private int totalPeaje = 0;
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    // Constructor de Peaje
    public Peaje(String nombre, String canton) {
        this.nombre = nombre;
        this.canton = canton;
    }

    // Añade un vehículo y suma su valor de peaje al total
    public void añadirVehiculo(Vehiculo vehiculo) {
        int valor = vehiculo.getValorPeaje();
        totalPeaje += valor;
        vehiculos.add(vehiculo);
    }

    // Imprime el listado de vehículos y el total recaudado
    public void imprimir() {
        System.out.println("Peaje: " + nombre + " | Cantón: " + canton);
        System.out.println("Vehículos que pasaron:");
        for (Vehiculo v : vehiculos) {
            v.imprimir();
        }
        System.out.println("Total peaje recolectado: $" + totalPeaje);
    }
}
