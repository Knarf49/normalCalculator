import java.util.Scanner;

public class Multivariate {
    public void solve()
    {
        Matrix matrix = new Matrix();
        Scanner sc = new Scanner(System.in);
        double[][] comat = new double[3][3];
        double[][] constmat = new double[3][1];
        double[][] d = new double[3][3];
        double[][] ans = new double[1][3];
        d = comat;

        //Input loop
        System.out.println("Insert coefficient Matrix :");
        for(int i=0;i<=2;i++)
        {
            for (int j=0;j<=2;j++)
            {
                comat[i][j] = sc.nextDouble();
            }
        }
        double dDet = matrix.FindDet(comat);
        //comat print
        for (int i = 0; i < comat.length; i++) {
            for (int j = 0; j < comat[i].length; j++) {
                System.out.print(comat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Insert const matrix :");
        for(int i=0;i<=2;i++)
        {
            constmat[i][0] = sc.nextDouble();
        }


        double[][] d1 = {
                {constmat[0][0],comat[0][1],comat[0][2]},
                {constmat[1][0],comat[1][1],comat[1][2]},
                {constmat[2][0],comat[2][1],comat[2][2]},

        };

        double[][] d2 = {
                {comat[0][0],constmat[0][0],comat[0][2]},
                {comat[1][0],constmat[1][0],comat[1][2]},
                {comat[2][0],constmat[2][0],comat[2][2]},

        };
        double[][] d3 = {
                {comat[0][0],comat[0][1],constmat[0][0]},
                {comat[1][0],comat[1][1],constmat[1][0]},
                {comat[2][0],comat[2][1],constmat[2][0]},

        };

        //All d print
        //d1 print
        for (int i = 0; i < constmat.length; i++) {
            for (int j = 0; j < constmat[i].length; j++) {
                System.out.print(constmat[i][j] + " ");
            }
            System.out.println();
        }
        double d1Det = matrix.FindDet(d1);
        double d2Det = matrix.FindDet(d2);
        double d3Det = matrix.FindDet(d3);

        double x =d1Det/dDet;
        double y =d2Det/dDet;
        double z =d3Det/dDet;

        System.out.println("Your answer is:");
        System.out.println("["+x+"]"+"["+y+"]"+"["+z+"]");

    }
}
