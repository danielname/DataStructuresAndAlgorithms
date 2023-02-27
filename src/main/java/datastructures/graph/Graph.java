package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public void addVertex(String key){
        ArrayList<String> value = new ArrayList<>();
        adjList.put(key,value);
    }
    // WRITE ADDVERTEX METHOD HERE //
    //                             //
    //                             //
    //                             //
    //                             //
    /////////////////////////////////

}