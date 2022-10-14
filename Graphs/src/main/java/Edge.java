/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class Edge {
    private Node start,end;
    
    public Edge(Node start, Node end){
        this.start = start;
        this.end = end;
    }
    public String toString(){
        return start.toString() + "->" + end.toString();
    }
}
