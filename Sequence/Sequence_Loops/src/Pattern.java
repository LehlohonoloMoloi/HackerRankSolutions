import java.util.Scanner;

public class Pattern {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter input for letter A: ");
        int a = input.nextInt();
        input.nextLine();

        System.out.print("Enter input for letter B: ");
        int b = input.nextInt();
        input.nextLine();

        System.out.print("Enter input for letter N:");
        int n = input.nextInt();
        input.nextLine();

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
