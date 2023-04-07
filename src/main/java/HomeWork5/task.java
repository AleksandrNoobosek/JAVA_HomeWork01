package HomeWork5;

import java.util.*;

public class task {

    public static void main(String[] args) {
        //    Реализуйте структуру телефонной книги с помощью HashMap,
        //    учитывая, что 1 человек может иметь несколько телефонов.
        Map<String, List<String>> phoneDirectory = new HashMap<>();
        inputNewEntry(phoneDirectory);
        printPhoneDirectory(phoneDirectory);


    }

    private static void printPhoneDirectory(Map<String, List<String>> phoneDirectory) {
        for (Map.Entry<String, List<String>> listEntry : phoneDirectory.entrySet()) {
            System.out.printf("%s - %s\n", listEntry.getKey(), listEntry.getValue());
        }

    }

    private static Map inputNewEntry(Map<String, List<String>> phoneDirectory) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Хотите добавить новый контакт? ДА/НЕТ");
            String text = scanner.nextLine();

            try {
                if (text.equalsIgnoreCase("ДА")) {
                    System.out.print("Введите фамилию: ");
                    String entryKey = scanner.nextLine();
                    System.out.print("Внесите все контакты пользователя через ',': ");
                    List<String> entryValue = Arrays.stream(scanner.nextLine().split(",")).toList();
                    phoneDirectory.put(entryKey, entryValue);
                } else if (text.equalsIgnoreCase("НЕТ")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Хотите добавить новый контакт? ДА/НЕТ");
            }
        }
        scanner.close();
        return phoneDirectory;
    }
}