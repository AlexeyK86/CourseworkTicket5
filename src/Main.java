import java.util.ArrayList;
import java.util.List;

public class Main {
    // Задача:
    // 1. Получаем на входе массив чисел.
    // 2. Все четные числа увеличиваем на единицу.
    // 3. Возвращаем кусок списка с 3-го по 7-й элемент.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> List = new ArrayList<>();

        for (int num : numbers) {
            List.add(num);
        }

        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) % 2 == 0) {
                List.set(i, List.get(i) + 1);
            }
        }

        List<Integer> resultList = List.subList(2, 7);
        System.out.println(resultList);
    }

}





