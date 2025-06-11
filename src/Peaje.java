import java.util.ArrayList;

public class Peaje {
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private String nombre;
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private String cantón;
    private int totalPeaje = 0;
    @SuppressWarnings("FieldMayBeFinal")// Unicamente para evitar advertencias de campo final en mi vscode
    private ArrayList<Vehículo> vehículos = new ArrayList<>();

    // Constructor de Peaje
    public Peaje(String nombre, String cantón) {
        this.nombre = nombre;
        this.cantón = cantón;
    }

    // Añade un vehículo y suma su valor de peaje al total
    public void añadirVehículo(Vehículo vehículo) {
        int valor = vehículo.getValorPeaje();
        totalPeaje += valor;
        vehículos.add(vehículo);
    }

    // Imprime el listado de vehículos y el total recaudado
    public void imprimir() {
    int totalCarros = 0;
    int totalMotos = 0;
    int totalCamiones = 0;

    System.out.println("Peaje: " + nombre + " | Cantón: " + cantón);
    System.out.println("Vehículos que pasaron:");
    for (Vehículo v : vehículos) {
        v.imprimir();
        if (v instanceof Carro) totalCarros++;
        else if (v instanceof Moto) totalMotos++;
        else if (v instanceof Camión) totalCamiones++;
    }
    System.out.println("Total peaje recolectado: $" + totalPeaje);
    System.out.println("Cantidad de carros: " + totalCarros);
    System.out.println("Cantidad de motos: " + totalMotos);
    System.out.println("Cantidad de camiones: " + totalCamiones);
    }
}