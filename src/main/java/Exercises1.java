public class Exercises1 {

    public static long factorial(int n) {
        int sum = 1;
        for(int i = 1 ; i <= n ; i++)
            sum *= i;
        return sum;
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];
        for(int i = 0 ; i < rows; i++){
            triangle[i] = new char[i + 1];
            for(int j = 0 ; j <= i ; j++){
                triangle[i][j] = '*';
            }
        }
        return triangle;
    }


    public static void main(String[] args) {
       System.out.println(factorial(5));
       System.out.println(fibonacci(6));
       char[][] tri = generateTriangle(5);
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j <= i; j++) {
               System.out.print(tri[i][j]);
           }
           System.out.println();
       }
    }

}