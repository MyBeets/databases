/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class Kstack {
    int[] array;
    int idx;
    
    public Kstack(){
        array = new int[1];
        idx = 0;
    }
    public void push(int a){
        array[idx] = a;
        idx++;
    }
    public int pop(){
        int a = 0;
        return a;
    }
}
