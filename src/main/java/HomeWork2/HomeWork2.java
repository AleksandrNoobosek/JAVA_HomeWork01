package HomeWork2;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class HomeWork2 {
    public static void main(String[] args) {

        // 1. Напишите метод, который принимает на вход строку (String) и определяет является ли
        // строка палиндромом (возвращает boolean значение).

        String s = inputText("Введите строку (String): ");
        System.out.println(palindromeText(s));


       // 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и
        //метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

        String Text = stringOfRepeated("TE$T");
        writeTextToFile(Text);

       /*3*.Напишите метод, который определит тип (расширение) файлов из
        текущей папки и выведет в консоль результат вида:
        1 Расширение файла: txt
        2 Расширение файла: pdf
        3 Расширение файла:
        4 Расширение файла: jpg
        */

        File file = new File("/G:\\учеба\\JAVA_Seminar\\program\\src\\main\\java\\HomeWork2\\Task2.txt");
        System.out.println("Расширение файла: " + getFileExtension(file));
        File file1 = new File("G:\\учеба\\JAVA_Seminar\\program\\src\\main\\java\\HomeWork2\\.gitignore");
        System.out.println("Расширение файла: " + getFileExtension(file1));
        File file2 = new File("G:\\учеба\\JAVA_Seminar\\program\\src\\main\\java\\HomeWork2\\HomeWork2.java");
        System.out.println("Расширение файла: " + getFileExtension(file2));

//          Расширение файла: txt
//          Расширение файла:
//          Расширение файла: java
    }

    private static String palindromeText(String s) {
        StringBuilder sb = new StringBuilder(s);
        String in = sb.reverse().toString();
        if (s.equals(in)) {
            return "Строка является палиндромом";
        } else {
            return "Строка не является палиндромом";
        }
    }
    private static String stringOfRepeated(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(s);
        }
        String str = sb.toString();
        return str;
    }
    private static void writeTextToFile(String s) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("G:\\учеба\\JAVA_Seminar\\program\\src\\main\\java\\HomeWork2\\Task2.txt");
            pw.print(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }
    }
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

    private static String inputText(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(s);
        String str = scanner.nextLine();
        return str;
    }

}
