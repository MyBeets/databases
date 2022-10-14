/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Node> nodes;
    private Set<Edge> edges;
    
    public Graph(Set<Node> nodes, Set<Edge> edges){
        
        //deepcopy
        this.nodes = new HashSet<Node>();
        this.edges = new HashSet<Edge>();
        
        for(Node n: nodes) this.nodes.add(n);
        for(Edge e: edges) this.edges.add(e);
    }
    public String toString(){
        String out = "A graph with nodes as follows:\n";
        for(Node n:nodes) out +=n.toString()+" ";
        out+="\n and edges as follows: \n";
        for(Edge e: edges)out+=e.toString()+"\n";
        out+="\n";
        return out;
    }
}
