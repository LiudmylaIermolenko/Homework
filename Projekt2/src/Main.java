import study2.Lesson2;
import lesson3.Lesson3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lesson3 lesson3 = new Lesson3();

        System.out.print("write tut first number");
        int num1 = scanner.nextInt();
        lesson3.nonStaticNum = scanner.nextInt();
        System.out.print("write tut second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Summa:" + sum);
        System.out.println(lesson3.nonStaticNum);
    }


//        Lesson3 lesson3 = new Lesson3();
//        lesson3.nonStaticNum = 8;
//        lesson3.method();
//        System.out.println(lesson3.nonStaticNum);
//        System.out.println(Lesson3.number);
    }




