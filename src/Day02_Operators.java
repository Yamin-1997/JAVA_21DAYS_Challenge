public class Day02_Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // ==========================
        // Arithmetic Operators
        // ==========================
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // ==========================
        // Assignment Operators
        // ==========================
        System.out.println("\n=== Assignment Operators ===");

        int x = 5;

        x += 2;
        System.out.println("x += 2 : " + x);

        x -= 1;
        System.out.println("x -= 1 : " + x);

        x *= 3;
        System.out.println("x *= 3 : " + x);

        x /= 2;
        System.out.println("x /= 2 : " + x);

        x %= 4;
        System.out.println("x %= 4 : " + x);

        // ==========================
        // Comparison Operators
        // ==========================
        System.out.println("\n=== Comparison Operators ===");

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // ==========================
        // Logical Operators
        // ==========================
        System.out.println("\n=== Logical Operators ===");

        boolean isStudent = true;
        boolean hasCard = false;

        System.out.println("isStudent && hasCard : " + (isStudent && hasCard));
        System.out.println("isStudent || hasCard : " + (isStudent || hasCard));
        System.out.println("!isStudent : " + (!isStudent));

        // ==========================
        // Increment / Decrement
        // ==========================
        System.out.println("\n=== Increment / Decrement ===");

        int number = 10;

        System.out.println("Original : " + number);

        number++;
        System.out.println("After ++ : " + number);

        number--;
        System.out.println("After -- : " + number);

        System.out.print("Java\n");
        System.out.print("Programming");
    }
}