//* Declare una nueva clase Prestamo que implemente la interfaz PorPagar. La clase
Prestamo deberá tener los atributos numeroDeCuotas y montoDeCuota. Cree el el
constructor respectivo, metodos get, set y toString. El valor retornado por el método
obtenerMontoPago de la clase Prestamo estará dado por el producto de numeroDeCuotas
y montoDeCuota. Modifique la clase principal para que en los resultados mostrados se
incluya también el del objeto de la clase Prestamo.
//*
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

--------------------

// Definición de la interfaz PorPagar
interface PorPagar {
    double calcularPago();
}

// Clase abstracta que implementa la interfaz PorPagar
abstract class Factura implements PorPagar {
    private String numero;
    private double monto;

    public Factura(String numero, double monto) {
        this.numero = numero;
        this.monto = monto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    // Implementación del método calcularPago de la interfaz PorPagar
    @Override
    public double calcularPago() {
        return getMonto();
    }
}

// Clase Empleado que extiende de la clase Factura
class Empleado extends Factura {
    private String nombre;

    public Empleado(String numero, double monto, String nombre) {
        super(numero, monto);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

// Clase EmpleadoAsalariado que extiende de la clase Empleado
class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String numero, double monto, String nombre, double salarioMensual) {
        super(numero, monto, nombre);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    // Implementación del método calcularPago de la interfaz PorPagar
    @Override
    public double calcularPago() {
        return getSalarioMensual();
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto EmpleadoAsalariado
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("001", 2500.0, "Juan", 3000.0);

        // Calcular el pago del empleado
        double pagoEmpleado = empleadoAsalariado.calcularPago();

        // Imprimir el resultado
        System.out.println("El empleado " + empleadoAsalariado.getNombre() + " tiene un salario mensual de: $" + pagoEmpleado);
    }
}

