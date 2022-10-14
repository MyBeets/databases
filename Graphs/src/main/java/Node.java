/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class Node {
    private int id;
    public Node(int id){
        this.id = id;
    }
    public String toString(){
        return((Integer)id).toString();
    }
}
