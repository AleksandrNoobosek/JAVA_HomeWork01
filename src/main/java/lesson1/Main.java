package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        test();
//        Hi();
        arrMax();
    }

    private static void test() {
        System.out.println("Apple");
        System.out.print("Apple");
        System.out.println();
        System.out.printf("%3d -- %.2f -- %s%n", 5, 5.45456456, "Hello");
    }

    private static void Hi() {
        //lowerCamelCase
        //UpperCamelCase
        Scanner in = new Scanner(System.in);
        System.out.printf("name: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
        in.close();


    }

    private static void arrMax() {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1};
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > temp) {
                    temp = count;
                }
            }
            else {
                    count = 0;

            }

        }
        System.out.println(temp);
        System.out.println(count);
    }
}



