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
        int pass = 0;
        int fail = 0;
        //test 1 - empty constructor
        DAHT d1 = new DAHT();
        try{d1.insert(0,1); pass++;}
        catch(Exception e){fail++;}
        
        //test 2 insert int
        if(d1.getArray()[0]==1){pass++;}
        else{fail++;}
        
        //test 3 insert size limit. testing key out of bounds
        try{d1.insert(10,1); fail++;}
        catch(Exception e){pass++;}
        
        //test 4 - constructor with DAHT size provided
        DAHT d2 = new DAHT(11);
        try{d2.insert(11-1,1); pass++;}
        catch(Exception e){fail++;}
        
        //test 5 - search
        if(d2.search(11-1)==1) pass++;
        else fail++;
        
        
        //test 6 - search for key out of bounds
        try{d2.search(11); fail++;}
        catch(Exception e){pass++;}
        
        //test 7 - remove
        d2.remove(11-1);
        if(d2.getArray()[11-1]==0) pass++;
        else fail++;
        
        //test 8 - remove key out of bounds
        try{d2.remove(11); fail++;}
        catch(Exception e){pass++;}
        
        //end
        System.out.println("Tests passed: "+ pass + "/" + (pass+fail));
    }
}
