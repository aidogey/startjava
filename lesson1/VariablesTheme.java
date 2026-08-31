import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class VariablesTheme {
    public static void main(String[] args) {
        final long startNanoTime = System.nanoTime();
        final LocalTime startTime = LocalTime.now();

        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println(String.join("\n",
                "                     /\\",
                "   J    a  v     v  /  \\",
                "   J   a a  v   v  /_( )\\",
                "J  J  aaaaa  V V  /      \\",
                " JJ  a     a  V  /___/\\___\\"));
        System.out.println();

        System.out.println("""
                         /\\
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a""");
        System.out.println();

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");

        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discountRate = 0.11f;
        float totalPrice = penPrice + bookPrice;
        float discountAmount = totalPrice * discountRate;
        float discountedPrice = totalPrice - discountAmount;

        System.out.println("Первый способ:");
        System.out.println("Стоимость товаров без скидки: " + totalPrice + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Стоимость товаров со скидкой: " + discountedPrice + " руб.");
        System.out.println();

        BigDecimal penPriceBd = BigDecimal.valueOf(105.5);
        BigDecimal bookPriceBd = BigDecimal.valueOf(235.23);
        BigDecimal discountRateBd = BigDecimal.valueOf(0.11);
        BigDecimal totalPriceBd = penPriceBd.add(bookPriceBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountAmountBd = totalPriceBd.multiply(discountRateBd)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountedPriceBd = totalPriceBd.subtract(discountAmountBd)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("Второй способ:");
        System.out.println("Стоимость товаров без скидки: " + totalPriceBd + " руб.");
        System.out.println("Сумма скидки: " + discountAmountBd + " руб.");
        System.out.println("Стоимость товаров со скидкой: " + discountedPriceBd + " руб.");

        System.out.println();

        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");

        int a1 = 2;
        int b1 = 5;

        System.out.println("Исходные значения: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("Метод: третья переменная");
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("Метод: арифметические операции");
        a1 += b1;
        b1 = a1 - b1;
        a1 -= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("Метод: побитовый");
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println();

        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");

        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;

        char symbol1 = (char) code1;
        char symbol2 = (char) code2;
        char symbol3 = (char) code3;
        char symbol4 = (char) code4;
        char symbol5 = (char) code5;
        char symbol6 = (char) code6;

        System.out.printf("%-6d%-6d%-6d%-6d%-6d%-6d%n",
                code1, code2, code3, code4, code5, code6);
        System.out.printf("%-6c%-6c%-6c%-6c%-6c%-6c%n",
                symbol1, symbol2, symbol3, symbol4, symbol5, symbol6);

        System.out.println();

        System.out.println("5. АНАЛИЗ КОДА ТОВАРА");

        int productCode = 123;
        int productCategory = productCode / 100;
        int productSubcategory = productCode / 10 % 10;
        int packageType = productCode % 10;
        int checkSum = productCategory + productSubcategory + packageType;
        int verificationCode = productCategory * productSubcategory * packageType;

        System.out.printf("""
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d
                """,
                productCode, productCategory, productSubcategory, packageType,
                checkSum, verificationCode);

        System.out.println();

        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");

        byte temperature = Byte.MAX_VALUE;
        byte originalTemperature = temperature;
        temperature++;
        byte incrementedTemperature = temperature;
        temperature--;
        byte decrementedTemperature = temperature;

        System.out.printf("""
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """,
                originalTemperature, incrementedTemperature, decrementedTemperature);

        short pressure = Short.MAX_VALUE;
        short originalPressure = pressure;
        pressure++;
        short incrementedPressure = pressure;
        pressure--;
        short decrementedPressure = pressure;

        System.out.printf("""
                [Давление, мм рт. ст.]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """,
                originalPressure, incrementedPressure, decrementedPressure);

        char statusCode = Character.MAX_VALUE;
        int originalStatusCode = statusCode;
        statusCode++;
        int incrementedStatusCode = statusCode;
        statusCode--;
        int decrementedStatusCode = statusCode;

        System.out.printf("""
                [Код состояния системы]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """,
                originalStatusCode, incrementedStatusCode, decrementedStatusCode);

        int distance = Integer.MAX_VALUE;
        int originalDistance = distance;
        distance++;
        int incrementedDistance = distance;
        distance--;
        int decrementedDistance = distance;

        System.out.printf("""
                [Пройденное расстояние, м]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """,
                originalDistance, incrementedDistance, decrementedDistance);

        long elapsedTime = Long.MAX_VALUE;
        long originalElapsedTime = elapsedTime;
        elapsedTime++;
        long incrementedElapsedTime = elapsedTime;
        elapsedTime--;
        long decrementedElapsedTime = elapsedTime;

        System.out.printf("""
                [Время с момента старта, мс]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """,
                originalElapsedTime, incrementedElapsedTime, decrementedElapsedTime);

        System.out.println();

        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");

        int coreCount = Runtime.getRuntime().availableProcessors();
        long allocatedMemoryBytes = Runtime.getRuntime().totalMemory();
        long freeMemoryBytes = Runtime.getRuntime().freeMemory();
        long usedMemoryBytes = allocatedMemoryBytes - freeMemoryBytes;
        long maxMemoryBytes = Runtime.getRuntime().maxMemory();

        double allocatedMemoryMb = allocatedMemoryBytes / 1024.0 / 1024.0;
        double freeMemoryMb = freeMemoryBytes / 1024.0 / 1024.0;
        double usedMemoryMb = usedMemoryBytes / 1024.0 / 1024.0;
        double maxMemoryMb = maxMemoryBytes / 1024.0 / 1024.0;

        System.out.printf("""
                Характеристики JVM:
                  Доступное число ядер: %d
                  Выделенная память: %.1f МБ
                  Свободная память: %.1f МБ
                  Используемая память: %.1f МБ
                  Максимально доступная память: %.1f МБ
                """,
                coreCount, allocatedMemoryMb, freeMemoryMb, usedMemoryMb, maxMemoryMb);

        String systemDrive = System.getProperty("user.dir").substring(0, 1);
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");

        System.out.printf("""
                Параметры ОС:
                  Системный диск: %s
                  Версия ОС: %s %s
                  Версия Java: %s
                  Разделитель пути: %s
                """,
                systemDrive, osName, osVersion, javaVersion, fileSeparator);

        System.out.println();

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");

        long finishNanoTime = System.nanoTime();
        LocalTime finishTime = LocalTime.now();
        double elapsedSeconds = (finishNanoTime - startNanoTime) / 1_000_000_000.0;

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String formattedStartTime = startTime.format(timeFormatter);
        String formattedFinishTime = finishTime.format(timeFormatter);
        String formattedElapsedSeconds = String.format(
                Locale.forLanguageTag("ru"), "%.3f", elapsedSeconds);

        System.out.printf("""
                | Старт проверки | %s |
                +----------------+--------------+
                | Финиш проверки | %s |
                +----------------+--------------+
                | Время работы   | %s сек    |
                """,
                formattedStartTime, formattedFinishTime, formattedElapsedSeconds);
    }
}