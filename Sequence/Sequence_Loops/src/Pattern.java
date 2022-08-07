public class Pattern {
    public static void main(String[] args)
    {
        int a = 0;
        int b = 2;
        int n = 10;

        int term = 0;
        int change = 0;
        int constant = 0;
        int product = 0;

        for(int i = 1; i <= n; i++) {
            constant = a + (int) (Math.pow(2, 0) * b);
            change = 0;

            for(int j = 1; j < i; j++)
            {
                product = (int) (Math.pow(2, j) * b);
                change += product;
            }

            term = constant + change;

            System.out.print(term + " ");

        }
    }
}
