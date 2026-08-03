import java.util.Scanner;
public class Day02_If_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number Checker");
        System.out.println(" Enter a number");

        int num = input.nextInt();

        if (num%2==0) {

            System.out.printf("%d is even number.",num);
        } else {

            System.out.printf("%d is odd number",num);
        }

        System.out.println("Sign in");
        System.out.println("_______________");
        System.out.println("enter your mail:");
        input.nextLine();//read

        String mail=input.nextLine().strip();
        System.out.println("Enter your password");
        String password= input.nextLine();

        //if coder`gmail.com and coder@1234 -> sign successfully
        //elseinvalid email password
        //strl.equals(strl2)
        //&& ->need to right for both of mail and password

        if (mail.equals("coder@gmail.com") && password.equals("coder@1234")){
            System.out.println(" Sign in succesfully");
        }else{
            System.out.println(" Invalid Email or password");
        }
        System.out.println("if else if \n");
        System.out.println("Enter the MARK");
        int mark = input.nextInt();

        if (mark>=90){
            System.out.println("Grade A");
        }else if(mark>=80){
            System.out.println("Grade B");
        }else if(mark>=60){
            System.out.println("Grade C");
        }else{
            System.out.println(" he Failed");
        }
    }
}