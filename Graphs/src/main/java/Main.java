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

public class Main {
    public static void main(String[] args){
        
        //node only has identifier number
        Node n1 = new Node(123);
        Node n2 = new Node(234);
        // edge only has start and end Node
        Edge e1 = new Edge(n1,n2);
        
        //a graph is a set of edges and nodes
        HashSet<Node> nodes = new HashSet<Node>();
        HashSet<Edge> edges = new HashSet<Edge>();
        
        nodes.add(n1);
        nodes.add(n2);
        edges.add(e1);
        
        Graph g1 = new Graph(nodes, edges);
        System.out.println(g1);
        
        for(int i = 0; i<10; i++){
            Node inode = new Node(i);
            nodes.add(inode);
            for(Node n:nodes){
                if(randomEdge()){
                    Edge ijedge = new Edge(inode, n);
                    edges.add(ijedge);
                }
            }
        }
        
        HashSet<Node> girls = new HashSet<Node>();
        HashSet<Edge> friendships = new HashSet<Edge>();
        girls.add(new Vnode("Becky"));
        girls.add(new Vnode("Jane"));
        girls.add(new Vnode("Sarah"));
        girls.add(new Vnode("Tracy"));
        
        for(Node g: girls){
            for(Node og: girls){
                if(randomEdge()){
                    friendships.add(new Edge(g, og));
                }
            }
        }
        Graph gGraph = new Graph(girls, friendships);
        
        System.out.println(gGraph);
        
        //city time
        HashSet<Node> cities = new HashSet<Node>();
        HashSet<Edge> roadways = new HashSet<Edge>();
        
        City kc = new City("Champs", 31);
        City sf = new City("NFC best", 20);
        City nash = new City("Best wildcard", 24);
        City gb = new City("Titletown", 20);
        cities.add(new Vnode(kc));
        cities.add(new Vnode(sf));
        cities.add(new Vnode(nash));
        cities.add(new Vnode(gb));
        
        for(Node g:cities){
            for(Node og: cities){
                if(randomEdge()){
                    roadways.add(new Edge(g,og));
                }
            }
        }
        Graph cGraph = new Graph(cities,roadways);
        System.out.println(cGraph);
        
    }
    public static boolean randomEdge(){
            return Math.random() > 0.5;
    }
}
