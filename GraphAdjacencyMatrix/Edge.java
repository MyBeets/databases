public class Edge{
    private Node a;
    private Node b;
    public Edge(Node c, Node d){
        a=c;
        b=d;
    }
    public String toString(){
        return a+"-->"+b;
    }
    public int[] getEdge(){
        return new int[] {a.getNode(),b.getNode()};
    }
}
