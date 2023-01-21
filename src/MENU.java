import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class MENU {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");
        int a,b;
        String option;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two no");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter option in words");
        sc.nextLine();
        option= sc.nextLine();
        switch (option)
        {
            case "ADD":System.out.println( "addition is "+(a+b));
            break;
            case "SUB":System.out.println("subtraction is " +(a-b));
                break;
            case "MUL":System.out.println("multiplication is " +(a*b));
                break;
            case "DIV":System.out.println("division is " +(a/b));
                break;
            default:
                System.out.println("invalid option");
                break;


        }
    }
}