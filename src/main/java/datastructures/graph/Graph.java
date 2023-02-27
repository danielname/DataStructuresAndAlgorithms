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

    public void addEdge(String key1, String key2){
        adjList.get(key1).add(key2);
        adjList.get(key2).add(key1);

    }
    // WRITE ADDEDGE METHOD HERE //
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////

}