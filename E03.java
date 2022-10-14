public class E03 {
    public static void main(String[] args) {
        Persona obj = new Persona();
        obj.setEdad(16);
        obj.setNombre("Jill");
        obj.setTelefono(101415);
        System.out.println(obj.getEdad());
        System.out.println(obj.getNombre());
        System.out.println(obj.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}
