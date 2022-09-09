/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    private static Logger LOGGER = Logger.getLogger(Main.class.getName());
    static int pass = 0;
    static int fail = 0;
    
    public static void main(String[] args){
        // start
        System.out.println("running");
        //LOGGER.log(Level.WARNING, "Failed stack construction expected empty got not empty");
        
        Kstack k1 = new Kstack();
        
        //test 1
        if(k1.empty())pass++;
        else{
            fail++;
            logConError();
        }
        //test 1
        if(k1.getidx()==0)pass++;
        else{
            fail++;
            logConError();
        }
        //test 2
        if(k1.getarr()[0]==0) pass++;
        else{
            fail++;
            logConError();
        }
        
        Kstack k2 = new Kstack(7);
        //test 3
        if(k2.getidx() == 0)pass++;
        else{
            fail++;
            logConError();
        }
        // test 4
        int check = 0;
        for(int i = 0; i<7; i++){
            if(k2.getarr()[i] == 0) check++;
        }
        if(check == 7) pass++;
        else{
            fail++;
            logConError();
        }
        
        //push tests
        //test 5
        try{ 
            k2.push("mingus");
            fail++;
            LOGGER.log(Level.WARNING, "Failed push expected int got not int");
        }
        catch(Exception e){pass++;}
        
        //test 6
        try{
            k2.push(true);
            fail++;
            LOGGER.log(Level.WARNING, "Failed push expected int got not int");
        }     
        catch(Exception e){pass++;}
        
        //test 7
        k2.push(1);
        if(k2.getarr()[k2.getidx()] == 0)pass++;
        else fail++;
        
        //test 8
        if(k2.getarr()[k2.getidx()-1]==1)pass++;
        else fail++;
        
        //test 9
        //THIS IS BROKEN
        try{
            k2.push(Integer.MAX_VALUE+1);
            fail++;
        }     
        catch(Exception e){pass++;}
        
        System.out.println(k2.getarr()[k2.getidx()-1]);
        
        
        //end
        System.out.println(pass + "/" + (pass+fail) + " Tests Passed");
    }
    public static void logConError(){
        LOGGER.log(Level.WARNING, "Failed stack construction expected empty got not empty");
    }
}
