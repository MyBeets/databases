public class Matrix {

    private int[] arr;
    private int row_num;
    private int col_num;

    public Matrix(int[] arrin, int c_in){
        arr = arrin;
        col_num = c_in;
        row_num = arr.length/col_num;
    }
    public int getRow_num(){
        return row_num;
    }
    public int getCol_num(){
        return col_num;
    }
    public int[] getArr(){
        return arr;
    }

    public Matrix multiply(Matrix m){
        int[] out = new int[row_num*m.getCol_num()];
        //System.out.println(m.getCol_num());
        for(int i = 0; i<arr.length; i++){
            //int j =i%col_num;
            for(int c = 0; c<m.getCol_num(); c++){
                int j = (i%col_num)*m.getCol_num()+c;
                //System.out.println(i + ", " + j);
                int r = i/col_num;
                int x = r*m.getCol_num()+c;
                //System.out.println(r*row_num+c);
                out[x] += arr[i] * m.getArr()[j];
                //out[r*m.getCol_num()+c] += arr[i]*m.getArr()[j];
            }
        }

        return new Matrix(out,m.getCol_num());
    }

    public int dotproduct(Matrix m) throws Exception{
        int dot_product = 0;
        if(m.getCol_num() != 1 || this.getCol_num() !=1) throw new RuntimeException("this is not a vector. the dot product cannot be computed");
        if(m.getCol_num() != this.getCol_num()) throw new RuntimeException("these vectors do not have the same number of dimensions. the dot product cannot be computed");
        int[] m_arr = m.getArr();
        for(int i = 0; i<arr.length; i++){
            dot_product += arr[i]*m_arr[i];
        }
        return dot_product;
    }

    public String toString(){
        String out = "";
        for(int i = 0; i<arr.length; i++){
            out += " "+arr[i]+" ";
            if((i+1)%col_num==0) out+= "\n";
        }
        return out;
    }

}
