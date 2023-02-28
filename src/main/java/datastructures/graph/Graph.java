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

    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public void removeVertex (String key){
        if (adjList.get(key) != null){
            String temp;
            for (int i = 0; i < adjList.get(key).size(); i++){
                temp = adjList.get(key).get(i);
                adjList.get(temp).remove(key);
            }
            adjList.remove(key);
        }
    }
    // WRITE REMOVEVERTEX METHOD HERE //
    //                                //
    //                                //
    //                                //
    //                                //
    ////////////////////////////////////

}