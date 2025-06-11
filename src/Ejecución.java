public class Ejecución {
    public static void main(String[] args) {
        // Crear instancia de Peaje
        Peaje peaje = new Peaje("Peaje Rumiñahui", "Quito");

        // Motos
        Moto moto1 = new Moto("PA123B", "Suzuki");
        Moto moto2 = new Moto("PG456C", "Honda");
        Moto moto3 = new Moto("PP789D", "Yamaha");

        // Carros
        Carro carro1 = new Carro("PCW-4567", "Chevrolet sedán");
        Carro carro2 = new Carro("PDX-2381", "Mazda hatchback");
        Carro carro3 = new Carro("PFT-3342", "Volkswagen SUV");

        // Camiones
        Camión camion1 = new Camión("PAZ-1023", "Hino", 2);
        Camión camion2 = new Camión("PUZ-8745", "Isuzu", 2);
        Camión camion3 = new Camión("PAE-5319", "Freightliner", 3);
        Camión camion4 = new Camión("PUE-9042", "Mack", 4);
        Camión camion5 = new Camión("PXT-1178", "Mack", 5);

        // Añadir todos los vehículos al peaje
        peaje.añadirVehículo(moto1);
        peaje.añadirVehículo(moto2);
        peaje.añadirVehículo(moto3);
        peaje.añadirVehículo(carro1);
        peaje.añadirVehículo(carro2);
        peaje.añadirVehículo(carro3);
        peaje.añadirVehículo(camion1);
        peaje.añadirVehículo(camion2);
        peaje.añadirVehículo(camion3);
        peaje.añadirVehículo(camion4);
        peaje.añadirVehículo(camion5);

        // Imprimir el reporte final
        peaje.imprimir();
    }
}