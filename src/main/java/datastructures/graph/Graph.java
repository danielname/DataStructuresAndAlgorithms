package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public void removeEdge(String key1, String key2){
        if (adjList.get(key1).contains(key2) && adjList.get(key2).contains(key1)) {
            adjList.get(key1).remove(key2);
            adjList.get(key2).remove(key1);
        }
    }
    // WRITE REMOVEEDGE METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////

}