package app;

import graph.EdgeArrayGraphImpl;
import graph.Graph;

import java.util.ArrayList;
import java.util.List;

public class Exercises<T>{

    // c) ii)
    public void printGraph(Graph<T> graph) {
        for (int i = 0; i < graph.order(); i++) {
            System.out.println("Vertex: " + graph.getVertexes().get(i));
            StringBuilder str = new StringBuilder("Edges: ");
            for (int j = 0; j < graph.getAdjacencyList(graph.getVertexes().get(i)).size(); j++) {
                str.append(" -> ").append(graph.getAdjacencyList(graph.getVertexes().get(i)).get(j));
            }
        }
    }

    // d) i)
    public int sourceVertexes(Graph<T> graph){
        int counter = 0;
        for (T sourceVertex :graph.getVertexes()) {
            boolean isSource = true;
            for (T vertex:graph.getVertexes()) {
                if (graph.hasEdge(vertex, sourceVertex)) isSource = false;
            }
            if (isSource) counter++;
        }
        return counter;
    }

    // d) ii)
    public List<T> sinkVertexes(Graph<T> graph){
        List<T> sinkVertexes = new ArrayList<>();
        for (T sinkVertex:graph.getVertexes()) {
            boolean isSink = true;
            for (T vertex:graph.getVertexes()) {
                if (graph.hasEdge(sinkVertex, vertex)) isSink = false;
            }
            if (isSink) sinkVertexes.add(sinkVertex);
        }
        return sinkVertexes;
    }

    // d) iii)
    public List<T> vertexDistanceTwoOrLess(T v, Graph<T> graph){
        List<T> vertexDistanceTwoOrLess = new ArrayList<>();
        graph.getAdjacencyList(v).forEach(vertex -> {
            graph.getAdjacencyList(vertex).forEach(vertex2 -> {
                if (!vertex2.equals(v)) vertexDistanceTwoOrLess.add(vertex2);
            });
        });
        return vertexDistanceTwoOrLess;
    }

    // d) iv)

    // e)

    // f)



}
