
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
/**
 *
 * @author Mark
 */


public class Main
{
    public static void main(String[] args) {
        int pass = 0;
        int fail = 0;
        
        /**
         * Node Class Tests
         */
        Node n1 = new Node(1);
        
        //test 1 
        if(n1.getNode() == 1)pass++;
        else fail++;
        
        //test 2
        String str = n1+"";
        if(str.equals("1")) pass++;
        else fail++;
        
        /**
         * Edge Class Tests
         */
        Node n2 = new Node(2);
        Edge e1 = new Edge(n1,n2);
        
        //test 3
        if(e1.getEdge()[0] == 1 && e1.getEdge()[1] == 2)pass++;
        else fail++;
         
        //test 4
        str = e1+"";
        if(str.equals("1-->2")) pass++;
        else fail++;
        
        /**
         * Graph Class Tests
         */
         
         /**
          * All connected
          */
         
         Node[] nodes = new Node[10];
         Edge[] edges = new Edge[10*10];
         for(int i = 0; i<10; i++) nodes[i] = new Node(i);
         for(int i = 0; i<10; i++)for(int j = 0; j<10; j++) edges[i*10+j] = new Edge(new Node(i), new Node(j));
         Graph g1 = new Graph(nodes, edges);
         //System.out.println(g1);
         
         //test 5 - testing toString
         String all = " true  true  true  true  true  true  true  true  true  true \n".repeat(10);
         str = g1 + "";
         if(str.equals(all)) pass++;
         else fail++;
         
         //test 6:15 - testing getConnectionsTo
         int idx = 0;
         for(int i = 0; i<10; i++){
             for(var a:g1.getConnectionsTo(new Node(i))) if(a==idx) idx++;
             if(idx == 10) pass++;
             else fail++;
         }
         
         //test 15:25 - testing getConnectionsTo
         idx = 0;
         for(int i = 0; i<10; i++){
             for(var a:g1.getConnectionsFrom(new Node(i))) if(a==idx) idx++;
             if(idx == 10) pass++;
             else fail++;
         }
         
         /**
          * none connected
          */
         
        System.out.println("Tests Passed: " + pass + "/" + (pass+fail));
    }
}
