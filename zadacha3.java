import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zadacha3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        
        System.out.println("Введите числа: ");
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            numbers.add(i);
        }
        for (int l = 0; l < numbers.size(); l++) {
                numbers.get(l);
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
