
public class Main {

    public static void main(String[] args) {

        // Crear los vertices del grafo.
        String[] vertices = {"A", "B", "C", "D", "E"};

        // Crear el grafo con cinco vertices.
        GrafoMatrizAdyacencia grafo =
                new GrafoMatrizAdyacencia(vertices);

        // Agregar las conexiones entre vertices.
        grafo.agregarArista("A", "B");
        grafo.agregarArista("A", "C");
        grafo.agregarArista("B", "D");
        grafo.agregarArista("C", "D");
        grafo.agregarArista("D", "E");

        // Mostrar la matriz de adyacencia.
        System.out.println("Matriz de adyacencia:");
        grafo.mostrarMatriz();

        // Ejecutar recorrido en profundidad.
        grafo.recorrerDFS("A");
        // Ejecutar recorrido en anchura.
        grafo.recorrerBFS("A");
    }
}
