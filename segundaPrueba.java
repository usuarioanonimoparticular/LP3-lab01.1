//hola mundo 2023 

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("María", 30);

        persona1.saludar();
        persona2.saludar();
    }
}
