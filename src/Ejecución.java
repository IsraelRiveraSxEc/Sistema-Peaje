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
        peaje.añadirVehiculo(moto1);
        peaje.añadirVehiculo(moto2);
        peaje.añadirVehiculo(moto3);
        peaje.añadirVehiculo(carro1);
        peaje.añadirVehiculo(carro2);
        peaje.añadirVehiculo(carro3);
        peaje.añadirVehiculo(camion1);
        peaje.añadirVehiculo(camion2);
        peaje.añadirVehiculo(camion3);
        peaje.añadirVehiculo(camion4);
        peaje.añadirVehiculo(camion5);

        // Imprimir el reporte final
        peaje.imprimir();
    }
}
