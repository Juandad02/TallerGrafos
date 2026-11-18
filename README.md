# Taller de Grafos No Dirigidos en Java

**Universidad:** Universidad Central

**Asignatura:** Programación y Lenguaje Computacional II

**Estudiante:** Juan Rodriguez

**Lenguaje:** Java

**Entorno de desarrollo:** Visual Studio Code y GitHub Copilot

**Repositorio público:** https://github.com/Juandad02/TallerGrafos

## 1. Descripción del proyecto

Este proyecto implementa un grafo no dirigido mediante una matriz de adyacencia en Java, aplicando principios de programación orientada a objetos.

También incorpora los algoritmos DFS (búsqueda en profundidad) y BFS (búsqueda en anchura), que permiten recorrer los vértices del grafo mediante diferentes estrategias.

## 2. Estructura del proyecto

- **GrafoMatrizAdyacencia.java:** contiene la matriz, los vértices, la inserción de aristas y los algoritmos de recorrido.
- **Main.java:** crea el grafo, establece las conexiones y ejecuta los recorridos DFS y BFS.

## 3. Matriz de adyacencia

La matriz de adyacencia representa las conexiones entre los vértices mediante valores enteros.

- **1:** existe una conexión entre dos vértices.
- **0:** no existe conexión.

Como el grafo es no dirigido, cada arista se registra en ambas direcciones, produciendo una matriz simétrica.

## 4. Algoritmo DFS

DFS utiliza recursividad para explorar los vértices en profundidad. Marca cada vértice como visitado y continúa recorriendo sus vecinos disponibles, evitando repetir vértices.

**Resultado obtenido:** A → B → D → C → E.

## 5. Algoritmo BFS

BFS utiliza una cola (*Queue*) para recorrer los vértices por niveles. Primero visita los vecinos cercanos al punto de inicio y después continúa con los siguientes niveles.

**Resultado obtenido:** A → B → C → D → E.

## 6. Resultados y conclusión

Se implementó y ejecutó correctamente un grafo de cinco vértices con cinco aristas.

La matriz permitió visualizar sus conexiones, mientras que los algoritmos DFS y BFS demostraron dos estrategias diferentes de recorrido.

El desarrollo permitió aplicar conceptos de estructuras de datos, matrices, recursividad, colas y programación orientada a objetos en Java.