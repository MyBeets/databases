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
    public static void main(String[] args){
        System.out.println("running");
        int pass = 0;
        int fail = 0;
        Kstack k1 = new Kstack();
        //test 1
        if(k1.idx==0)pass++;
        else fail++;
        //test 2
        if(k1.array[0]==0) pass++;
        else fail++;
        
        //end
        System.out.println(pass + "/" + pass+fail + "Tests Passed");
    }
}
