import java.util.Arrays;
import java.util.Scanner;

/*
Даны две строки, состоящие из строчных латинских букв.
Требуется определить, являются ли эти строки анаграммами,
т. е. отличаются ли они только порядком следования символов.

Формат ввода:
Входной файл содержит две строки строчных латинских символов,
каждая не длиннее 100 000 символов. Строки разделяются символом перевода строки.

Формат вывода:
Выходной файл должен содержать единицу,
если строки являются анаграммами, и ноль в противном случае.

Ввод	Вывод
qiu     1
iuq

Ввод	Вывод
zprl    0
zprc
 */

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a1 = sc.next().toCharArray();
        char[] a2 = sc.next().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int res = 1;
        if(a1.length == a2.length) {
            for(int i = 0; i < a1.length; i++) {
                if(a1[i] != a2[i]) {
                    res = 0;
                }
            }
        } else {
            res = 0;
        }
        System.out.println(res);
    }
}

