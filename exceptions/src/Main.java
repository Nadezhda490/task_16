import java.util.Scanner;

public class Main {

// 1. Деление на ноль
//    Попросите пользователя ввести два числа (делимое и делитель).
//    Если пользователь пытается выполнить деление на ноль, обработайте эту ситуацию, выведя сообщение об ошибке.

    public static double delenieNa0(double delimoe, double delitel) throws Exception {
        if (delitel == 0) {
            throw new Exception("На ноль делить нельзя");
        }
        return delimoe / delitel;
    }

// 2. Неверный формат числа
//    Запросите у пользователя ввод числа.
//    Если пользователь ввёл строку, не являющуюся числом, выбросьте исключение и выведите сообщение об ошибке.

    public static int formatCisla(String vvod) throws Exception {
        for (int i = 0; i < vvod.length(); i++) {
            char cislo = vvod.charAt(i);
            if (cislo < 48 || cislo > 57) {
                throw new Exception("Введено не число");
            }
        }
        return Integer.parseInt(vvod);
    }

// 3. Обращение к элементу массива
//    Создайте массив из 5 элементов.
//    Запросите у пользователя индекс и выведите элемент массива по этому индексу.
//    Обработайте ситуацию, когда индекс выходит за границы массива.

    public static int elementMassiva(int index) throws Exception {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                return arr[index];
            }
        }
        throw new Exception("Индекс выходит за границы массива ");
    }

// 4. Нахождение минимального числа
//    Запросите у пользователя несколько чисел (например, 5).
//    Если одно из введённых значений не является числом, выбросьте исключение и выведите сообщение об ошибке.

    public static int minCislo(int[] cislo) {
        int min = cislo[0];
        for (int i = 0; i < cislo.length; i++) {
            if (cislo[i] < min) {
                min = cislo[i];
            }
        }
        return min;
    }

// 5. Чтение строки с ограничением длины
//    Запросите у пользователя ввод строки.
//    Если длина строки превышает 10 символов, выбросьте исключение с сообщением, что строка слишком длинная.

    public static String ctenieStroki(String stroka) throws Exception {
        if (stroka.length() > 10) {
            throw new Exception("Строка слишком длинная");
        }
        return stroka;
    }

// 6. Поиск подстроки
//    Запросите у пользователя строку и символ.
//    Если строка не содержит указанный символ, выбросьте исключение и выведите сообщение об ошибке.

    public static int podstroka(String stroka, String simvol) throws Exception {
        if (simvol.length() != 1) {
            throw new Exception("Введено несколько символов");
        }
        char izmenyaem = simvol.charAt(0);
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == izmenyaem) {
                return i;
            }
        }
        throw new Exception("Строка не содержит указанный символ");
    }

    // 7. Число в диапазоне
//    Попросите пользователя ввести число.
//    Если введённое число меньше 1 или больше 100, выбросьте исключение с сообщением о некорректном диапазоне.
    public static int diapazon(int cislo) throws Exception {
        if (cislo < 1 || cislo > 100) {
            throw new Exception("Некорректный диапазон");
        }
        return cislo;
    }

// 8. Парсинг массива
//    Создайте массив строк.
//    Попробуйте преобразовать каждую строку в целое число.
//    Если преобразование невозможно, выбросьте исключение и выведите сообщение о некорректном значении.

    public static int massivStrok(String[] vvod) throws Exception {
        for (int i = 0; i < vvod.length; i++) {
            String str = vvod[i];
            for (int j = 0; j < str.length(); j++) {
                char arr = str.charAt(j);
                if (arr < 48 || arr > 57) {
                    throw new Exception("Строка " + arr + " не является числом");
                }
            }
            int cislo = Integer.parseInt(str);
            System.out.println("Преобразование: " + cislo);
        }
        return 0;
    }

// 9. Проверка делимости
//    Попросите пользователя ввести два числа.
//    Если второе число не является делителем первого, выбросьте исключение с сообщением: "Число не делится без остатка".

    public static int delimost(int cislo1, int cislo2) throws Exception {
        if (cislo2 == 0) {
            throw new Exception("На ноль делить нельзя");
        }
        if (cislo1 % cislo2 != 0) {
            throw new Exception("Число не делится без остатка");
        }
        return cislo1 / cislo2;
    }

// 10. Индексы и значение
//     Создайте массив из 10 элементов.
//     Попросите пользователя ввести индекс и значение для записи в массив.
//     Обработайте ситуации, когда индекс выходит за пределы массива или значение некорректно.

    public static int[] massiv(int[] arr, int index, int znachenie)throws Exception {
        if (index < 0 || index >= arr.length) {
            throw new Exception("Индекс выходит за пределы массива");
        }
        arr[index] = znachenie;
        return arr;
    }



    public static void main(String[] args) throws Exception {
        System.out.println();

        // 1
        // без сканера
        System.out.print("1. Деление на ноль: ");
        try {
            System.out.println(delenieNa0(10, 0));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // через сканер
//        System.out.println("1. Деление на ноль: ");
//        Scanner scanner1 = new Scanner(System.in);
//        try {
//            System.out.print("Введите делимое: ");
//            double delimoe = scanner1.nextDouble();
//            System.out.print("Введите делитель: ");
//            double delitel = scanner1.nextDouble();
//            double result1 = delenieNa0(delimoe, delitel);
//            System.out.println(result1);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

        // 2
        // без сканера
        System.out.print("2. Неверный формат числа: ");
        try {
            int result = formatCisla("Nadya");
            System.out.print(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // через сканер не получилось сделать

        // 3
        // без сканера
        System.out.print("3. Обращение к элементу массива: ");
        try {
            System.out.println(elementMassiva(3));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // через сканер не получилось сделать

        // 4
        // без сканера
        System.out.print("4. Нахождение минимального числа: ");
        int[] cislo = {8, 3, 5, 10, 6};
        try {
            int min = minCislo(cislo);
            System.out.println(min);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // через сканер
//        System.out.print("4. Нахождение минимального числа: ");
//        Scanner scanner4 = new Scanner(System.in);
//        try {
//            int[] cislo = new int[5];
//            for (int i = 0; i < cislo.length; i++) {
//                System.out.print("Введите число " + (i + 1) + ": ");
//                cislo[i] = scanner4.nextInt();
//            }
//            int min = minCislo(cislo);
//            System.out.println("Минимальное число: " + min);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

        // 5
        // без сканера
        System.out.print("5. Чтение строки с ограничением длины: ");
        try {
            System.out.println(ctenieStroki("Надя, привет"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // через сканер
//        System.out.print("5. Чтение строки с ограничением длины: ");
//        Scanner scanner5 = new Scanner(System.in);
//        try {
//            String input = scanner5.nextLine();
//            System.out.println(ctenieStroki(input));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

        // 6
        // без сканера
        System.out.print("6. Поиск подстроки: ");
        try {
            int index = podstroka("Nadya, ti, gde!", "!");
            System.out.println("Символ найден на " + index + " индексе");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // через сканер
//        System.out.println("6. Поиск подстроки: ");
//        Scanner scanner6 = new Scanner(System.in);
//        try {
//            System.out.println("Введите строку: ");
//            String stroka = scanner6.nextLine();
//            System.out.println("Введите символ: ");
//            String simvol = scanner6.nextLine();
//            int index = podstroka(stroka, simvol);
//            System.out.println("Символ найден на " + index + " индексе");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

        // 7
        // без сканера
        System.out.print("7. Число в диапазоне: ");
        try {
            System.out.println(diapazon(-7));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // через сканер
//        System.out.print("7. Число в диапазоне: ");
//        Scanner scanner7 = new Scanner(System.in);
//        try {
//            int cislo = scanner7.nextInt();
//            System.out.println(diapazon(cislo));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

        // 8
        System.out.println("8. Парсинг массива: ");
        String[] vvod = {"135", "Fred1", "Nadya"};
        try {
            System.out.println(massivStrok(vvod));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // 9
        // без сканера
        System.out.print("9. Проверка делимости: ");
        try {
            int result = delimost(10, 3);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // через сканер
//        System.out.print("9. Проверка делимости: ");
//        Scanner scanner9 = new Scanner(System.in);
//        try {
//            System.out.print("Введите первое число: ");
//            int cislo1 = scanner9.nextInt();
//            System.out.print("Введите второе число: ");
//            int cislo2 = scanner9.nextInt();
//            int result = delimost(cislo1, cislo2);
//            System.out.println("Результат: " + result);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

        // 10
        // без сканера
        System.out.print("10. Индексы и значение: ");
        int[] arr10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            int index = 9;
            int znachenie = 25;
            int[] mas = massiv(arr10, index, znachenie);
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // через сканер не получилось сделать

        System.out.println();
    }
}