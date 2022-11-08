import java.util.ArrayList;
public class Graph{
    private boolean[][] adjacency;
    public Graph(Node[] nodes, Edge[] edges){
        adjacency = new boolean [nodes.length][nodes.length];
        for(var e:edges){
            int[] c = e.getEdge();
            adjacency[c[0]][c[1]] = true;
            //this code only works for nodes in consecutive order, it's pretty easy to get it to work with nodes more different values,
            //but that would need a direct address hashtable and I didn't want to do that
        }
    }
    public String toString(){
        String out = "";
        for(var r:adjacency){
            for(var c: r){
                out += " "+c+" ";
            }
            out+="\n";
        }
        return out;
    }
    public ArrayList<Integer> getConnectionsTo(Node n){
        ArrayList<Integer> c = new  ArrayList<Integer>();
        for(int x = 0; x<adjacency.length; x++)if(adjacency[x][n.getNode()]) c.add(x);
        return c;
    }
    public ArrayList<Integer> getConnectionsFrom(Node n){
        ArrayList<Integer> c = new  ArrayList<Integer>();
        for(int x = 0; x<adjacency[0].length; x++)if(adjacency[n.getNode()][x]) c.add(x);
        return c;
    }
}
