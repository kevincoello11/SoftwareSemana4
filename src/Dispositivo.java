public class Dispositivo {

    private int id;
    private String nombre;
    private String tipo;
    private boolean activo;

    private static int contador = 0;

    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.activo = false;
        contador++;
        this.id = contador;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public void mostrarInformacion() {
        System.out.println("ID " + id + " - " + nombre + " - " + tipo + " - Activo: " + activo);
    }

    void mostrarEstado() {
        if (activo) {
            System.out.println(nombre + " está ACTIVO.");
        } else {
            System.out.println(nombre + " está INACTIVO.");
        }
    }
}
