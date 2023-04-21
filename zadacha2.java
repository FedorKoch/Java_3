import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class zadacha2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        ArrayList < Integer > list = new ArrayList < Integer > ();
        System.out.println("Введите исходный список(для окончания ввода нажмите 'e'): ");
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
             list.get(i);
        }
        System.out.println("Исходный список" + list);
        int min = Collections.min(list);
        int max = Collections.max(list);

        double average = 0;
        if (list.size() > 0) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            average = (double) sum / list.size();
        }

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);

    }
}