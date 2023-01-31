public class Main {
    public static void main(String[] args) {
        /*
        int[] a = {1,2,3,4,5,6};
        int b = 3;

        int[] c = {7,8,9,10,11,12};
        int d = 2;

        Matrix m1 = new Matrix(a, b);
        Matrix m2 = new Matrix(c,d);

        System.out.println(m1);
        System.out.println();
        System.out.println(m2);

        Matrix m3 = m1.multiply(m2);

        System.out.println();
        System.out.println(m3);
        */


        //100 percent, 10 percent, 1 percent, .1 percent, 1/log(n), 1/n^2, 1/e^n
        int size = 50;
        double[] percentages = {100, 10, 1, 0.1, 1/Math.log(size), 1/Math.pow(size,2), 1/Math.exp(size)};

        for(double n: percentages){
            for(int t = 0; t<10; t++) {
                //50x50 sizexsize
                int[] a = new int[50 * 50];
                for (int i = 0; i < a.length; i++) {
                    if (Math.random() < (1 * n / 100)) a[i] = 1;
                    else a[i] = 0;
                }
                Matrix m = new Matrix(a, 50);

                //50x1 sizex1
                int[] b = new int[50 * 1];
                for (int i = 0; i < b.length; i++) {
                    if (Math.random() < (1 / n)) b[i] = 1;
                    else b[i] = 0;
                }
                Matrix v = new Matrix(b, 1);
                long startTime = System.nanoTime();
                m.multiply(v);
                long endTime = System.nanoTime();
                System.out.println(n + ", " + (endTime - startTime));
            }
        }

    }
}