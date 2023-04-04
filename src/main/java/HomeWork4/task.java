package HomeWork4;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class task {
    public static void main(String[] args) {
//  1. Реализовать консольное приложение, которое:
//  Принимает от пользователя и “запоминает” строки.
//  Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//  Если введено revert, удаляет предыдущую введенную строку из памяти.
        System.out.println("________________Task1__________________________");
        inputStrLinkedListToConsole();

//  2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        System.out.println("________________Task2__________________________");
        List<String> drinksList = new LinkedList<>();
        Collections.addAll(drinksList, "coffee", "tea", "juice", "beer", "wine", "lemonade", "water");

        System.out.println(invertedList(drinksList));

    }

    private static void inputStrLinkedListToConsole() {
        Scanner scanner = new Scanner(System.in);
        List<String> ourList = new LinkedList<>();
        while (true) {
            System.out.print("Введите текс: ");
            String str = scanner.nextLine();

            if (str.trim().length() == 0) {
                System.out.println("Вы ввели пустую строку!");
                continue;
            }
            if (str.equalsIgnoreCase("print")) {
                System.out.println(invertedList(ourList));
                continue;
            }
            if (str.equalsIgnoreCase("revert")) {
                int lastInd = ourList.size() - 1;
                ourList.remove(lastInd);
                System.out.println(invertedList(ourList));
                continue;
            }
            if (str.equalsIgnoreCase("stop")) {
                break;
            }

            ourList.add(str);
        }
        scanner.close();

    }
        static List invertedList(List<String> linkedList) {
            List<String> revers = new LinkedList<>();
            for (int i = linkedList.size() - 1; i >= 0; i--) {
                revers.add(linkedList.get(i));
            }
            return revers;
        }
}