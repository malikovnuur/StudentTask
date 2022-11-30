import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionClass {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Write name: ");
            String name1 = scanner.nextLine();
            if (!name1.matches("[a-zA-Z,а-яА-Я]*")) {
                throw new ExceptionClass("WRITE LETTERS ONLY");
            }
            System.out.println("Write age: ");
            int age1 = scanner.nextInt();
            Student student = new Student(name1, age1);
            if (age1 < 0 || age1>130) {
                throw new ExceptionClass("Write upper 0 Or before 130");

            }
        }catch (InputMismatchException e){
            throw new ExceptionClass("WRITE NUMBERS ONLY");

            }

    }
}