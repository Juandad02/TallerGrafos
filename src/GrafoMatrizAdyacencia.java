
import java.util.Queue;
import java.util.LinkedList;

public class GrafoMatrizAdyacencia {

    // Almacena los nombres de los vertices.
    private final String[] vertices;

    // Matriz que representa las conexiones.
    private final int[][] matriz;

    // Constructor de la clase.
    public GrafoMatrizAdyacencia(String[] vertices) {

        // Guardamos los vertices del grafo.
        this.vertices = vertices.clone();

        // Creamos la matriz de adyacencia.
        int cantidad = vertices.length;
        this.matriz = new int[cantidad][cantidad];
    }
   
    // Busca la posicion de un vertice por su nombre.
    private int obtenerIndice(String nombre) {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].equals(nombre)) {
                return i;
            }
        }

        throw new IllegalArgumentException(
            "El vertice no existe: " + nombre
        );
    }

    // Agrega una conexion entre dos vertices.
    public void agregarArista(String origen, String destino) {
        int i = obtenerIndice(origen);
        int j = obtenerIndice(destino);

        // Evita conectar un vertice consigo mismo.
        if (i == j) {
            throw new IllegalArgumentException(
                "No se permiten conexiones al mismo vertice."
            );
        }

        matriz[i][j] = 1;
        matriz[j][i] = 1;
    }
 
   
    // Muestra la matriz de adyacencia.
    public void mostrarMatriz() {

        // Imprimir encabezado con los nombres.
        System.out.printf("%6s", "");

        for (String vertice : vertices) {
            System.out.printf("%6s", vertice);
        }

        System.out.println();

        // Recorrer las filas de la matriz.
        for (int i = 0; i < vertices.length; i++) {

            System.out.printf("%6s", vertices[i]);

            // Recorrer las columnas.
            for (int j = 0; j < vertices.length; j++) {
                System.out.printf("%6d", matriz[i][j]);
            }

            System.out.println();
        }
    }

    // Recorrido DFS desde un vertice inicial.
    public void recorrerDFS(String inicio) {
        boolean[] visitados = new boolean[vertices.length];

        int indiceInicio = obtenerIndice(inicio);

        System.out.print("Recorrido DFS: ");
        dfsRecursivo(indiceInicio, visitados);
        System.out.println();
    }

    // Metodo recursivo para explorar en profundidad.
    private void dfsRecursivo(int actual, boolean[] visitados) {

        // Marcar el vertice como visitado.
        visitados[actual] = true;
        System.out.print(vertices[actual] + " ");

        // Buscar vertices vecinos no visitados.
        for (int i = 0; i < vertices.length; i++) {
            if (matriz[actual][i] == 1 && !visitados[i]) {
                dfsRecursivo(i, visitados);
            }
        }
    }


    // Recorrido BFS desde un vertice inicial.
    public void recorrerBFS(String inicio) {

        boolean[] visitados = new boolean[vertices.length];

        // Crear una cola para recorrer los vertices.
        Queue<Integer> cola = new LinkedList<>();

        int indiceInicio = obtenerIndice(inicio);

        // Marcar y agregar el vertice inicial.
        visitados[indiceInicio] = true;
        cola.add(indiceInicio);

        System.out.print("Recorrido BFS: ");

        // Continuar mientras existan vertices en la cola.
        while (!cola.isEmpty()) {

            int actual = cola.poll();

            System.out.print(vertices[actual] + " ");

            // Buscar los vecinos del vertice actual.
            for (int i = 0; i < vertices.length; i++) {

                if (matriz[actual][i] == 1 && !visitados[i]) {

                    visitados[i] = true;
                    cola.add(i);
                }
            }
        }

        System.out.println();
    }


}
