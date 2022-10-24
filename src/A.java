import java.util.Scanner;

/*
Требуется найти в бинарном векторе самую длинную
 последовательность единиц и вывести её длину.

Формат ввода:
Первая строка входного файла содержит одно число n, n ≤ 10000.
Каждая из следующих n строк содержит ровно одно число — очередной элемент массива.

Формат вывода:
Выходной файл должен содержать единственное число —
длину самой длинной последовательности единиц во входном массиве.

Ввод	Вывод
5       1
1
0
1
0
1

Желательно получить решение, работающее за линейное время
 и при этом проходящее по входному массиву только один раз.
 */

public class A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            int max_count = 0;
            int [] nums = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            for(int i = 1; i < n; i++) {
                if(nums[i] == 1 && nums[i - 1] == 1) {
                    if(count == 0) {
                        count = 1;
                    }
                    count++;
                } else if (nums[i] == 1 || nums[i - 1] == 1) {
                    count = 1;
                } else {
                    count = 0;
                }
                if(max_count < count) {
                    max_count = count;
                }
            }
            if(n == 1) {
                if(nums[0] == 1) {
                    max_count = 1;
                }
            }
            System.out.println(max_count);
        }
}
