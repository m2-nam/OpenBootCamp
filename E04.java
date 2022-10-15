public class E04 {
    public static void main(String[] args) {
        Cliente objCliente = new Cliente();
        objCliente.edad = 16;
        objCliente.nombre = "Jill";
        objCliente.telefono = 101511;
        objCliente.credito = 1000;
        System.out.println(objCliente.edad);
        System.out.println(objCliente.nombre);
        System.out.println(objCliente.telefono);
        System.out.println(objCliente.credito);
    }

    public class Persona {
        int edad;
        String nombre;
        int telefono;
    }

    class Cliente extends Persona {
        int credito;
    }

    class Trabajador extends Persona {
        float salario;
    }
}
