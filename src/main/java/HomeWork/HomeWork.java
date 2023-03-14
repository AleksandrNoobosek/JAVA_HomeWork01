package HomeWork;

import java.util.Scanner;
import java.time.LocalTime;

public class HomeWork {
    public static void main(String[] args) {

        //Задание 1 Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arr = {1, 2, 2, 1, 1, 1, 1, 4, 1, 4, 6, 1, 7, 1, 1};
        //System.out.println("Максимальное значение: " + arrMax(arr));
        //System.out.println("Минимальное значение: " + arrMin(arr));

        //Задание 22. Дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны
        // быть отличны от заданного, а остальные - равны ему.

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        //arrPrint((numberTransfer(nums, val)));

        //3. В консоли запросить имя пользователя. В зависимости от текущего времени,
        // вывести приветствие вида:
        //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
        //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
        //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        System.out.println("");
        inputNameAndPrintHi();


    }

    public static void inputNameAndPrintHi() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();
        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else if (hour < 5 || hour == 23) {
            System.out.printf("Доброй ночи, %s!", name);
        }
        System.out.println();
    }

    private static void arrPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int[] numberTransfer(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int temp;
        while (i < j) {
            if (nums[j] == val) {
                j--;
            }
            if (nums[i] == val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
        }
        return nums;
    }

    private static int arrMax(int[] array) {
        int maxx = array[0];
        for (int num : array) {
            if (num > maxx) {
                maxx = num;
            }

        }

        return maxx;
    }

    private static int arrMin(int[] array) {
        int minn = array[0];
        for (int num : array) {
            if (num < minn) {
                minn = num;
            }

        }

        return minn;
    }

}

