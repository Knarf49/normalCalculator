import java.util.Scanner;

public class Basicproblem {

    public void basicsolve(double First,double Second)
    {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("plus"))
        {
            System.out.println(First + Second);
        }
        else if(type.equalsIgnoreCase("minus"))
        {
            System.out.println(First - Second);
        }
        else if (type.equalsIgnoreCase("multiply"))
        {
            System.out.println(First * Second);
        }
        else if(type.equalsIgnoreCase("divide"))
        {
            System.out.println(First / Second);
        }
        else
        {
            System.out.println("We don't have that type");
        }
    }


}
