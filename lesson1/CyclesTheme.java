import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.printf("%-12s%-13s%s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i < 48; i += 2) {
            System.out.printf("%-12d%-13c%s%n", i, (char) i, Character.getName(i));
        }
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("%-12d%-13c%s%n", i, (char) i, Character.getName(i));
        }

        System.out.println("\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print('-');
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print('^');
            }
            System.out.println();
        }

        System.out.println("\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.print("  │");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n--+");
        for (int i = 2; i <= 9; i++) {
            System.out.print("---");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d │", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int numbersInLine = 5;
        int printedCount = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%2d ", i);
            if (++printedCount % numbersInLine == 0) {
                System.out.println();
            }
        }
        int missingCount = printedCount % numbersInLine == 0 ? 0 :
                numbersInLine - printedCount % numbersInLine;
        for (int i = 0; i < missingCount; i++) {
            System.out.printf("%2d ", 0);
        }
        if (missingCount > 0) {
            System.out.println();
        }

        System.out.println("\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX");
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;
        int max = firstNumber > secondNumber ? firstNumber : secondNumber;
        max = max > thirdNumber ? max : thirdNumber;
        int min = firstNumber < secondNumber ? firstNumber : secondNumber;
        min = min < thirdNumber ? min : thirdNumber;
        System.out.printf("Числа в интервале (%d, %d) по убыванию:", min, max);
        for (int i = max - 1; i > min; i--) {
            System.out.printf(" %d", i);
        }

        System.out.println("\n6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");
        int initialNumber = 2234321;
        int reversedNumber = 0;
        int twosCount = 0;
        int restOfInitial = initialNumber;
        while (restOfInitial > 0) {
            int digit = restOfInitial % 10;
            reversedNumber = reversedNumber * 10 + digit;
            if (digit == 2) {
                twosCount++;
            }
            restOfInitial /= 10;
        }
        System.out.println("Число в обратном порядке: " + reversedNumber);
        System.out.printf("%d - %sпалиндром с %s (%d) количеством двоек%n", initialNumber,
                initialNumber == reversedNumber ? "" : "не ",
                twosCount % 2 == 0 ? "четным" : "нечетным", twosCount);

        System.out.println("\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА");
        int originalNumber = 101002;
        int lastHalf = originalNumber % 1000;
        int firstHalf = originalNumber / 1000;
        int lastHalfSum = 0;
        int restOfLastHalf = lastHalf;
        while (restOfLastHalf > 0) {
            lastHalfSum += restOfLastHalf % 10;
            restOfLastHalf /= 10;
        }
        int firstHalfSum = 0;
        int restOfFirstHalf = firstHalf;
        while (restOfFirstHalf > 0) {
            firstHalfSum += restOfFirstHalf % 10;
            restOfFirstHalf /= 10;
        }
        System.out.printf("%d - %sсчастливое число%n", originalNumber,
                firstHalfSum == lastHalfSum ? "" : "не ");
        System.out.printf("Сумма цифр %03d = %d%n", lastHalf, lastHalfSum);
        System.out.printf("Сумма цифр %03d = %d%n", firstHalf, firstHalfSum);

        System.out.println("\n8. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ");
        int passwordLength = 8;
        Random random = new Random();
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialSymbol = false;
        System.out.print("Пароль: ");
        for (int i = 0; i < passwordLength; i++) {
            int code = random.nextInt(33, 127);
            if (code >= 'a' && code <= 'z') {
                hasLowerCase = true;
            } else if (code >= 'A' && code <= 'Z') {
                hasUpperCase = true;
            } else if (code >= '0' && code <= '9') {
                hasDigit = true;
            } else {
                hasSpecialSymbol = true;
            }
            System.out.print((char) code);
        }
        boolean isLongEnough = passwordLength >= 8;
        System.out.print("\nНадежность: ");
        if (isLongEnough && hasLowerCase && hasUpperCase && hasSpecialSymbol) {
            System.out.println("Надежный");
        } else if (isLongEnough && (hasUpperCase || hasDigit)) {
            System.out.println("Средний");
        } else {
            System.out.println("Слабый");
        }
    }
}