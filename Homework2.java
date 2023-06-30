package hw2;

//Algorithms. Homework 2
//
//@author Tetiana Tatsenko
//@version 29 Jun 2023
//
//Tasks:
//
//        task #1
//        START
//        READ number n
//        IF n == 1 THEN return
//        FOR i = 1, i <= n, i + 1
//        FOR j = 1; j <= n, j + 1
//        print "*"
//        BREAK
//        END
// -----------------------
//        task #2
//        START
//        READ number n
//        numbers i = 0, j = 0, a = 0
//        FOR i = n/2, i <= n; i + 1
//        FOR j = 2, j <= n, j * 2
//        a = a + n / 2
//        END
//-----------------------
//        task #3
//        START
//        READ number n
//        number a = 0
//        FOR i = 0, i < n, i + 1
//        FOR j = n, j > i, j - 1
//        a = a + i + j
//        END
//-----------------------
//        task #4
//        START
//        READ number n
//        numbers a = 0, i = n
//        WHILE i > 0
//        a = a + i
//        i = i / 2
//        END
//-----------------------
//    Answers:

//    #task1
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n == 1) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
                break;
            }
            System.out.println();
        }
    }
}

//  #task2

//import java.util.Scanner;
//
//public class Homework2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();
//
//        int i = 0, j = 0, a = 0;
//
//        for (i = n / 2; i <= n; i++) {
//            for (j = 2; j <= n; j *= 2) {
//                a = a + n / 2;
//            }
//        }
//
//        System.out.println("Result: " + a);
//    }
//}

//  #task3
//
//import java.util.Scanner;
//
//public class Homework2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();
//
//        int a = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = n; j > i; j--) {
//                a = a + i + j;
//            }
//        }
//
//        System.out.println("Result: " + a);
//    }
//}

//  #task4

//START
//        READ number n
//        numbers a = 0, i = n
//        WHILE i > 0
//        a = a + i
//        i = i / 2
//        END

//import java.util.Scanner;
//public class Homework2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();
//
//        int a = 0, i = n;
//
//        while (i > 0) {
//            a = a + i;
//            i = i / 2;
//        }
//
//        System.out.println("Result: " + a);
//    }
//}
