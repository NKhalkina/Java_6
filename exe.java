package HW6;

import java.util.HashSet;
import java.util.Scanner;

public class exe {
    public static void main(String[] args) {
    laptop laptop1 = new laptop("acer", "windows", 16);
    laptop laptop2 = new laptop("asus", "linux", 8);
    laptop laptop3 = new laptop("apple", "macos", 4);

    HashSet<laptop> set = new HashSet<laptop>();
    set.add(laptop1);
    set.add(laptop2);
    set.add(laptop3);

    System.out.println("Выберите критерий сортировки:\n" +
    "1. OС;\n" +
    "2. ОЗУ.");
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();

    switch (number) {
        case  (1):
            System.out.println(("Введите требуюмую OС (windows, linux, macos): "));
            Scanner in1 = new Scanner(System.in);
            String nameOsStr = in1.nextLine();

            System.out.println(("По вашему вопросу найдены следующие модели: "));
            for (laptop i : set) {
                i.filterOs(nameOsStr);
                }      
            break;

        case  (2):
            System.out.println(("Введите минимальное значение ОЗУ: "));
            Scanner in2 = new Scanner(System.in);
            int minOzu = in2.nextInt();

            System.out.println(("По вашему вопросу найдены следующие модели: \n"));
            for (laptop i : set) {
                if((i.getOzu() >= minOzu)) {
                    System.out.println(i);
                }
            }      
            break;

        default:
            System.out.println("Попробуйте, пожалуйста, снова!");
            break;
        }
}
}
