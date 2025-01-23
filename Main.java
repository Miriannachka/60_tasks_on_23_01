import java.util.*;
import java.util.regex.*;
import java.lang.Math;

// Custom exception classes
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class NumberFormatExceptionCustom extends Exception {
    public NumberFormatExceptionCustom(String message) {
        super(message);
    }
}

class IllegalArgumentExceptionCustom extends Exception {
    public IllegalArgumentExceptionCustom(String message) {
        super(message);
    }
}

class ArithmeticExceptionCustom extends Exception {
    public ArithmeticExceptionCustom(String message) {
        super(message);
    }
}

class IndexOutOfBoundsExceptionCustom extends Exception {
    public IndexOutOfBoundsExceptionCustom(String message) {
        super(message);
    }
}

class NullPointerExceptionCustom extends Exception {
    public NullPointerExceptionCustom(String message) {
        super(message);
    }
}

class DateTimeParseExceptionCustom extends Exception {
    public DateTimeParseExceptionCustom(String message) {
        super(message);
    }
}

public class Main {

    // 1. Function to find the maximum
    public static int findMax(int a, int b) throws IllegalArgumentExceptionCustom {
        if (a == b) {
            throw new IllegalArgumentExceptionCustom("Числа равны");
        }
        return a > b ? a : b;
    }

    // 2. Division calculator
    public static double divide(double a, double b) throws ArithmeticExceptionCustom {
        if (b == 0) {
            throw new ArithmeticExceptionCustom("Деление на ноль недопустимо");
        }
        return a / b;
    }

    // 3. String to integer converter
    public static int stringToInt(String str) throws NumberFormatExceptionCustom {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatExceptionCustom("Строка не может быть преобразована в целое число");
        }
    }

    // 4. Age checker
    public static void checkAge(int age) throws IllegalArgumentExceptionCustom {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentExceptionCustom("Недопустимый возраст");
        }
    }

    // 5. Square root finder
    public static double findSqrt(double num) throws IllegalArgumentExceptionCustom {
        if (num < 0) {
            throw new IllegalArgumentExceptionCustom("Нельзя извлечь корень из отрицательного числа");
        }
        return Math.sqrt(num);
    }

    // 6. Factorial
    public static int factorial(int n) throws IllegalArgumentExceptionCustom {
        if (n < 0) {
            throw new IllegalArgumentExceptionCustom("Факториал отрицательного числа не определен");
        }
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    // 7. Check array for zeroes
    public static void checkArrayForZeroes(List<Integer> arr) throws IllegalArgumentExceptionCustom {
        for (int num : arr) {
            if (num == 0) {
                throw new IllegalArgumentExceptionCustom("Массив содержит нули");
            }
        }
    }

    // 8. Power calculator
    public static double power(double base, int exponent) throws IllegalArgumentExceptionCustom {
        if (exponent < 0) {
            throw new IllegalArgumentExceptionCustom("Отрицательная степень не поддерживается");
        }
        return Math.pow(base, exponent);
    }

    // 9. String truncator
    public static String truncateString(String str, int numChars) throws IllegalArgumentExceptionCustom {
        if (numChars > str.length()) {
            throw new IllegalArgumentExceptionCustom("Число символов больше длины строки");
        }
        return str.substring(0, numChars);
    }

    // 10. Find element in array
    public static int findElement(List<Integer> arr, int element) throws IllegalArgumentExceptionCustom {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == element) {
                return i;
            }
        }
        throw new IllegalArgumentExceptionCustom("Элемент не найден в массиве");
    }

    // 11. Convert to binary
    public static String toBinary(int number) throws IllegalArgumentExceptionCustom {
        if (number < 0) {
            throw new IllegalArgumentExceptionCustom("Отрицательное число не может быть конвертировано в двоичное представление");
        }
        return Integer.toBinaryString(number);
    }

    // 12. Check divisibility
    public static boolean isDivisible(int a, int b) throws ArithmeticExceptionCustom {
        if (b == 0) {
            throw new ArithmeticExceptionCustom("Делитель не может быть равен нулю");
        }
        return a % b == 0;
    }

    // 13. Get element from list
    public static <T> T getElementFromList(List<T> list, int index) throws IndexOutOfBoundsExceptionCustom {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsExceptionCustom("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }

    // 14. Password strength checker
    public static void checkPasswordStrength(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль слишком короткий");
        }
    }

    // 15. Date validator
    public static void validateDate(String dateStr) throws DateTimeParseExceptionCustom {
        Pattern datePattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");
        Matcher matcher = datePattern.matcher(dateStr);
        if (!matcher.matches()) {
            throw new DateTimeParseExceptionCustom("Некорректный формат даты. Нужен формат dd.MM.yyyy");
        }
        String[] parts = dateStr.split("\\.");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (month < 1 || month > 12) {
            throw new DateTimeParseExceptionCustom("Некорректный формат даты. Месяц должен быть от 1 до 12");
        }
        if (day < 1 || day > 31) {
            throw new DateTimeParseExceptionCustom("Некорректный формат даты. День должен быть от 1 до 31");
        }

        if ((month == 2 && day > 29) ||
                ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31)) {
            throw new DateTimeParseExceptionCustom("Некорректный формат даты");
        }
    }

    // 16. String concatenation
    public static String concatenateStrings(String str1, String str2) throws NullPointerExceptionCustom {
        if (str1 == null || str2 == null) {
            throw new NullPointerExceptionCustom("Одна из строк равна null");
        }
        return str1 + str2;
    }

    // 17. Remainder calculator
    public static int getRemainder(int a, int b) throws ArithmeticExceptionCustom {
        if (b == 0) {
            throw new ArithmeticExceptionCustom("Делитель не может быть равен нулю");
        }
        return a % b;
    }

    // 18. Square root finder
    public static double findSquareRoot(double number) throws IllegalArgumentExceptionCustom {
        if (number < 0) {
            throw new IllegalArgumentExceptionCustom("Нельзя извлечь корень из отрицательного числа");
        }
        return Math.sqrt(number);
    }

    // 19. Temperature converter
    public static double celsiusToFahrenheit(double celsius) throws IllegalArgumentExceptionCustom {
        if (celsius < -273.15) {
            throw new IllegalArgumentExceptionCustom("Температура ниже абсолютного нуля");
        }
        return (celsius * 9/5) + 32;
    }

    // 20. Check string not empty
    public static void checkStringNotEmpty(String str) throws IllegalArgumentExceptionCustom {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentExceptionCustom("Строка пустая или равна null");
        }
    }

    public static void main(String[] args) {
        // Task 1
        try {
            System.out.println("Задача 1");
            int max = findMax(5, 3);
            System.out.println("Максимум: " + max);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 2
        try {
            System.out.println("Задача 2");
            double result = divide(10, 2);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 3
        try {
            System.out.println("Задача 3");
            int number = stringToInt("123");
            System.out.println("Число: " + number);
        } catch (NumberFormatExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 4
        try {
            System.out.println("Задача 4");
            checkAge(25);
            System.out.println("Возраст прошел проверку");
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 5
        try {
            System.out.println("Задача 5");
            double squareRoot = findSqrt(25);
            System.out.println("Квадратный корень: " + squareRoot);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 6
        try {
            System.out.println("Задача 6");
            int fact = factorial(5);
            System.out.println("Факториал: " + fact);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 7
        try {
            System.out.println("Задача 7");
            checkArrayForZeroes(Arrays.asList(1, 2, 3));
            System.out.println("Массив прошел проверку.");
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 8
        try {
            System.out.println("Задача 8");
            double res = power(2, 3);
            System.out.println("Возведение в степень: " + res);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 9
        try {
            System.out.println("Задача 9");
            String trimmed = truncateString("Hello world", 5);
            System.out.println("Обрезанная строка: " + trimmed);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 10
        try {
            System.out.println("Задача 10");
            int index = findElement(Arrays.asList(1, 2, 3, 4, 5), 3);
            System.out.println("Индекс элемента: " + index);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 11
        try {
            System.out.println("Задача 11");
            String binary = toBinary(10);
            System.out.println("Двоичное представление: " + binary);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 12
        try {
            System.out.println("Задача 12");
            boolean divisible = isDivisible(10, 2);
            System.out.println("Делится: " + divisible);
        } catch (ArithmeticExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 13
        try {
            System.out.println("Задача 13");
            List<Integer> list = Arrays.asList(1, 2, 3);
            int elem = getElementFromList(list, 1);
            System.out.println("Элемент списка: " + elem);
        } catch (IndexOutOfBoundsExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 14
        try {
            System.out.println("Задача 14");
            checkPasswordStrength("StrongPwd");
            System.out.println("Пароль прошел проверку");
        } catch (WeakPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 15
        try {
            System.out.println("Задача 15");
            validateDate("15.10.2023");
            System.out.println("Дата корректна");
        } catch (DateTimeParseExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 16
        try {
            System.out.println("Задача 16");
            String concat = concatenateStrings("Hello", "world");
            System.out.println("Результат конкатенации: " + concat);
        } catch (NullPointerExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 17
        try {
            System.out.println("Задача 17");
            int remainder = getRemainder(10, 3);
            System.out.println("Остаток от деления: " + remainder);
        } catch (ArithmeticExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 18
        try {
            System.out.println("Задача 18");
            double res = findSquareRoot(25);
            System.out.println("Квадратный корень: " + res);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 19
        try {
            System.out.println("Задача 19");
            double tempFahr = celsiusToFahrenheit(25);
            System.out.println("Температура в Фаренгейтах: " + tempFahr);
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("--------------------");

        // Task 20
        try {
            System.out.println("Задача 20");
            checkStringNotEmpty("test");
            System.out.println("Строка не пуста");
        } catch (IllegalArgumentExceptionCustom e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
