package HomeWork3;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
//  1. Пусть дан произвольный список целых чисел, удалить из
//  него четные числа (в языке уже есть что-то готовое для этого)

        System.out.println("_____________________Задача 1_________________");
        List<Integer> numbers = new ArrayList<>();
        System.out.println(fillDataArray(numbers, 20));
        System.out.println("Новый список данных: \n" + removeElementsEven(numbers));
//  2. Задан целочисленный список ArrayList. Найти минимальное,
//  максимальное и среднее арифметическое из этого списка.

        System.out.println("_____________________Задача 2_________________");
        System.out.println("Минимальное из списка: " + Collections.min(numbers));
        System.out.println("Максимальное из списка: " + Collections.max(numbers));
        System.out.println("Среднее арифметическое из списка: " + arithmeticMean(numbers));

//  3.Создать список типа ArrayList<String>. Поместить в него как
//  строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

        System.out.println("_____________________Задача 3_________________");
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("привет");
        newList.add("сегодня");
        newList.add("30");
        newList.add("03");
        newList.add("2023");
        newList.add("!");
        System.out.println(newList);
        System.out.println(deleteIntegersList(newList));

    }
    private static List deleteIntegersList(List<String> arrayList) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            try  {
                int temp = Integer.parseInt(arrayList.get(i));
            } catch (Exception e) {
                newList.add(arrayList.get(i));
            }
        }
        return newList;
    }
    private static Integer arithmeticMean(List<Integer> arrayList) {

        int summ = 0;
        for (int el: arrayList) {
            summ += el;
        }
        return summ/ arrayList.size();
    }
    private static List<Integer> removeElementsEven(List<Integer> arrayList) {
        arrayList.removeIf(i -> i % 2 == 0);
        return arrayList;
    }

    private static List<Integer> fillDataArray(List<Integer> arrayList, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }


}
