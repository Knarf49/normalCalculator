import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Multivariate Multivarsolve = new Multivariate();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        Triangle tr = new Triangle();
        Matrix matrix = new Matrix();
        Basicproblem basic = new Basicproblem();

        while(true)
        {
            menu.greeting();
            int option = sc.nextInt();
            switch(option)
            {
                case 0 :
                    return;
                case 1 :
                    Multivarsolve.solve();
                    break;

                case 2 :
                    System.out.println("Insert base and height");
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    System.out.println("Your triangle's area is: "+ tr.FindArea(base,height));
                    break;

                case 3 :
                    System.out.println("Insert your matrix ");
                    double[][] mat = new double[3][3];
                    //input loop
                    for(int i=0;i<=2;i++)
                    {
                        for (int j=0;j<=2;j++)
                        {
                            mat[i][j] = sc.nextDouble();
                        }
                    }
                    System.out.println("determinant of your matrix is: " + matrix.FindDet(mat));
                    break;

                case 4 :
                    System.out.println("insert First & Second :");
                    double first = sc.nextDouble();
                    double second = sc.nextDouble();
                    System.out.println("What type do you want?");
                    basic.basicsolve(first,second);
                    break;

                default:
                    System.out.println("Type only number 0-4");
                    break;
            }
        }

    }


}