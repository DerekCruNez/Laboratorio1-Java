//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String n, int e, double no) {
        this.nombre = n;
        this.edad = e;
        this.nota = no;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNota() { return nota; }
}

public class Main {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("Ana", 20, 85.5));
        lista.add(new Estudiante("Carlos", 22, 90.0));
        lista.add(new Estudiante("María", 21, 78.5));

        double s = 0;
        for (Estudiante e : lista) {
            s += e.getNota();
        }
        System.out.println("Promedio: " + s / lista.size());
    }
}

/*
* Pregunta 1:¿Por qué main debe ser static? ¿Qué pasaría si no lo fuera? Relacionalo con lo que hace la JVM al iniciar tu programa.
*R\ La JVM al ejecutar busca por el metodo static main, al ser static la JVM no necesita crear un objeto.
* Si no fuera static la JVM no encontraria el metodo que marca el inicio del programa y daria error.
*
*Pregunta 2:¿Por qué usamos ArrayList<Estudiante> y no un arreglo Estudiante[]? ¿Qué ventaja tiene ArrayList?
*R\Un array list permite seguir agregando elementos pero un arreglo tiene un tamanio fijo.
*
* Pregunta 3:¿Dónde vive cada atributo de Estudiante en memoria? ¿En la Pila (Stack) o en el Montón (Heap)? Explicá por qué.
*R\Los atributos viven en el Heap esto debido a que forman parte de una instancia de un objeto y esto se aloja exclusivamente en el Heap junto con el objeto
* */