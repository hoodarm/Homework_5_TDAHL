public class Main {
    public static void main(String[] args) {
       int N = 6;
       int [][] P = new int[N][N];
       for (int R = 0; R<=N-1; R++) {
           P[R][0] = 1;
           for (int C = 1; C<=R; C++)
               P[R][C] = P[R-1][C] + P[R-1][C-1];
       }

       for (int [] element:P){
           for (int elementInside: element)
               System.out.print(elementInside + " ");
           System.out.println();
       }
    }
}