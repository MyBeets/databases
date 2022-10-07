/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class Main {
    public static void main(String args[]){
        Hashtable h1 = new Hashtable(15);
        for(int i = 0; i<15; i++) h1.insert(0);
        try{
            h1.insert(2);
        }
        catch(Exception e){}
    }
}
