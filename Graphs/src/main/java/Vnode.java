/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class Vnode extends Node {
    private Object value;
    public Vnode(Object v){
        super(v.hashCode());
        value = v;
    }
    public String toString(){
        return value.toString();
    }
}
