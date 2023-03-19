import java.util.Scanner;

public class Menu {
    public void greeting()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Welcome to Calculator program**");
        System.out.println("Choose option");
        System.out.println("[0] Cancel");
        System.out.println("[1] Multivariate Solving");
        System.out.println("[2] Find area of triangle");
        System.out.println("[3] Find Det");
        System.out.println("[4] Basic problem(plus minus multiply devide)");
    }
}
