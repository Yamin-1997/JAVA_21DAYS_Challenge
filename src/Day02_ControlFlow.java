import java.util.Scanner;
public class Day02_ControlFlow {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("if function\n");
        System.out.println("Enter your age:");

        int age=input.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        System.out.println("Code after if....");

    }
}
