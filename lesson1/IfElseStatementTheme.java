import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");

        boolean maleGender = false;
        if (!maleGender) {
            System.out.println("Пол женский.");
        } else {
            System.out.println("Пол мужской.");
        }

        int age = 22;
        if (age > 18) {
            System.out.println("Возраст больше 18 лет.");
        } else {
            System.out.println("Возраст меньше или равно 18.");
        }

        double height = 1.63;
        if (height < 1.8) {
            System.out.println("Рост ниже 180 см.");
        } else {
            System.out.println("Рост выше или равно 180 см.");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");

        int yesterdayStepCount = 5769;
        int todayStepCount = 3748;
        System.out.println("Вчера: " + yesterdayStepCount + "\nCегодня: " +
                todayStepCount);

        if (todayStepCount > yesterdayStepCount) {
            System.out.println("Сегодня шагов больше");
        } else if (todayStepCount < yesterdayStepCount) {
            System.out.println("Сегодня шагов меньше");
        } else {
            System.out.println("Шагов одинаково");
        }
        System.out.println("В среднем: " + (yesterdayStepCount + todayStepCount) / 2.0);

        System.out.println("\n3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");

        int guestCount = 3;
        if (guestCount < 0) {
            System.out.println("Ошибка: гостей не может быть меньше нуля");
        } else if (guestCount == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestCount % 2 == 0) {
            System.out.println("Записалось " + guestCount +
                    " гостей. Можно формировать пары для конкурсов.");
        } else {
            System.out.println("Записалось " + guestCount +
                    " гостей. Нужны индивидуальные задания.");
        }

        System.out.println("\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");

        String nickname = "Aidana";
        char firstLetter = nickname.charAt(0);
        String message = "Имя " + nickname + " начинается с ";

        String characterType;
        if (firstLetter >= 'a' && firstLetter <= 'z') {
            characterType = "маленькой буквы";
        } else if (firstLetter >= 'A' && firstLetter <= 'Z') {
            characterType = "большой буквы";
        } else if (firstLetter >= '0' && firstLetter <= '9') {
            characterType = "цифры";
        } else {
            characterType = "символа";
        }
        System.out.println("Первый способ:");
        System.out.println(message + characterType + " '" + firstLetter + "'");

        if (Character.isLowerCase(firstLetter)) {
            characterType = "маленькой буквы";
        } else if (Character.isUpperCase(firstLetter)) {
            characterType = "большой буквы";
        } else if (Character.isDigit(firstLetter)) {
            characterType = "цифры";
        } else {
            characterType = "символа";
        }
        System.out.println("\nВторой способ:");
        System.out.println(message + characterType + " '" + firstLetter + "'");

        System.out.println("\n5. ИНВЕНТАРИЗАЦИЯ");

        int databaseSerialNumber = 123;
        int actualSerialNumber = 193;

        if (databaseSerialNumber == actualSerialNumber) {
            System.out.println("[№" + databaseSerialNumber +
                    "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            int databaseHundreds = databaseSerialNumber / 100;
            int databaseTens = databaseSerialNumber / 10 % 10;
            int databaseUnits = databaseSerialNumber % 10;
            int actualHundreds = actualSerialNumber / 100;
            int actualTens = actualSerialNumber / 10 % 10;
            int actualUnits = actualSerialNumber % 10;

            String maskedNumber =
                    (actualHundreds == databaseHundreds ? String.valueOf(actualHundreds) : "_") +
                    (actualTens == databaseTens ? String.valueOf(actualTens) : "_") +
                    (actualUnits == databaseUnits ? String.valueOf(actualUnits) : "_");

            if ("___".equals(maskedNumber)) {
                System.out.println("[№" + databaseSerialNumber +
                        "]: оборудование не идентифицировано");
            } else {
                System.out.printf("""
                        Нет полного совпадения:
                        База данных: [№%d]
                        Фактический: [№%s]
                        """, databaseSerialNumber, maskedNumber);
            }
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");

        float deposit = 321123.79f;
        float rate;
        if (deposit < 100_000) {
            rate = 0.05f;
        } else if (deposit <= 300_000) {
            rate = 0.07f;
        } else {
            rate = 0.1f;
        }
        float interest = deposit * rate;
        float totalDeposit = deposit + interest;

        System.out.println("Первый способ:");
        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Начисленный %: " + interest + " руб.");
        System.out.println("Итоговая сумма: " + totalDeposit + " руб.");

        BigDecimal depositBd = BigDecimal.valueOf(321123.79);
        BigDecimal rateBd;
        if (depositBd.compareTo(BigDecimal.valueOf(100_000)) < 0) {
            rateBd = BigDecimal.valueOf(0.05);
        } else if (depositBd.compareTo(BigDecimal.valueOf(300_000)) <= 0) {
            rateBd = BigDecimal.valueOf(0.07);
        } else {
            rateBd = BigDecimal.valueOf(0.1);
        }
        BigDecimal interestBd = depositBd.multiply(rateBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalDepositBd = depositBd.add(interestBd).setScale(2, RoundingMode.HALF_UP);

        System.out.println("\nВторой способ:");
        System.out.println("Сумма вклада: " + depositBd.setScale(2, RoundingMode.HALF_UP) +
                " руб.");
        System.out.println("Начисленный %: " + interestBd + " руб.");
        System.out.println("Итоговая сумма: " + totalDepositBd + " руб.");

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");

        int historyPercent = 59;
        int historyGrade;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else {
            historyGrade = 2;
        }
        System.out.println("История: " + historyGrade);

        int programmingPercent = 92;
        int programmingGrade;
        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        } else {
            programmingGrade = 2;
        }
        System.out.println("Программирование: " + programmingGrade);

        System.out.println("Средний балл: " + (historyGrade + programmingGrade) / 2.0);
        System.out.println("Средний %: " + (historyPercent + programmingPercent) / 2.0);

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");

        BigDecimal monthlyRevenue = BigDecimal.valueOf(13025.233);
        BigDecimal monthlyRent = BigDecimal.valueOf(5123.018);
        BigDecimal monthlyCost = BigDecimal.valueOf(9001.729);
        BigDecimal annualProfit = monthlyRevenue.subtract(monthlyRent).subtract(monthlyCost)
                .multiply(BigDecimal.valueOf(12))
                .setScale(2, RoundingMode.HALF_UP);

        String profitSign = annualProfit.signum() > 0 ? "+" : "";
        System.out.println("Прибыль за год: " + profitSign + annualProfit + " руб.");
    }
}