public class Main {

    public static void main(String[] args) {

        System.out.println("Total: " + Dispositivo.getTotalCreados());

        Dispositivo laptop = new Dispositivo("Laptop", "Computadora");
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        Dispositivo router = new Dispositivo("Router", "Red");
        Dispositivo impresora = new Dispositivo("Impresora", "Periférico");
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        System.out.println("--- Datos de cada objeto ---");
        laptop.mostrarInformacion();
        router.mostrarInformacion();
        impresora.mostrarInformacion();

        System.out.println("--- Activar solo el router ---");
        router.activar();
        laptop.mostrarInformacion();
        router.mostrarInformacion();

        System.out.println("--- Nombre vacío ---");
        laptop.setNombre("");
        System.out.println(laptop.getNombre());

        System.out.println("--- Estado ---");
        router.mostrarEstado();
        laptop.mostrarEstado();

        // Descomenta para ver el error: 'nombre' has private access in 'Dispositivo'
        // laptop.nombre = "X";
    }
}