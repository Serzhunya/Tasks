import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Дан упорядоченный по неубыванию массив целых 32-разрядных чисел.
Требуется удалить из него все повторения.

Первая строка входного файла содержит единственное число n, n ≤ 1000000.
На следующих n строк расположены числа — элементы массива,
по одному на строку. Числа отсортированы по неубыванию.


Выходной файл должен содержать следующие
в порядке возрастания уникальные элементы входного массива.

Input 	Output
5       2
2       4
4       8
8
8
8
*/

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
        array.stream().distinct().forEach(System.out::println);

    }
}