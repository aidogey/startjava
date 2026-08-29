import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class VariablesTheme {
    public static void main(String[] args) {
        // 0. Для замера времени выполнения кода
        final long startNanoTime = System.nanoTime();
        final LocalTime startTime = LocalTime.now();

        // 1. ВЫВОД ASCII-ГРАФИКИ
        // первый вариант
        System.out.println(String.join("\n",
                "                     /\\", 
                "   J    a  v     v  /  \\",
                "   J   a a  v   v  /_( )\\",
                "J  J  aaaaa  V V  /      \\",
                " JJ  a     a  V  /___/\\___\\"
        ));
        System.out.println();

        // второй вариант
        System.out.println("""
                         /\\            
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a""");
        System.out.println();

        // 2. РАСЧЕТ СТОИМОСТИ ТОВАРА

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
 
        // 3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ
 
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
 
        // 4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ
 
        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;
 
        char char1 = (char) code1;
        char char2 = (char) code2;
        char char3 = (char) code3;
        char char4 = (char) code4;
        char char5 = (char) code5;
        char char6 = (char) code6;
 
        System.out.printf("%-6d%-6d%-6d%-6d%-6d%-6d%n",
                code1, code2, code3, code4, code5, code6);
        System.out.printf("%-6c%-6c%-6c%-6c%-6c%-6c%n",
                char1, char2, char3, char4, char5, char6);
 
        System.out.println();
 
        // 5. АНАЛИЗ КОДА ТОВАРА
 
        int productCode = 123;
        int category = productCode / 100;
        int subcategory = productCode / 10 % 10;
        int packageType = productCode % 10;
        int checksum = category + subcategory + packageType;
        int verificationCode = category * subcategory * packageType;
 
        System.out.printf("""
                Код товара: %d
                 категория товара - %d
                 подкатегория - %d
                 тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d
                """,
                productCode, category, subcategory, packageType, checksum, verificationCode);
 
        System.out.println();
 
        // 6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ
 
        byte temperature = Byte.MAX_VALUE;
        byte temperatureOriginal = temperature;
        temperature++;
        byte temperatureIncremented = temperature;
        temperature--;
        byte temperatureDecremented = temperature;
 
        System.out.printf("""
                [Температура, °C]:
                 Исходное: %d
                 +1: %d
                 -1: %d
                """,
                temperatureOriginal, temperatureIncremented, temperatureDecremented);
 
        short pressure = Short.MAX_VALUE;
        short pressureOriginal = pressure;
        pressure++;
        short pressureIncremented = pressure;
        pressure--;
        short pressureDecremented = pressure;
 
        System.out.printf("""
                [Давление, мм рт. ст.]:
                 Исходное: %d
                 +1: %d
                 -1: %d
                """,
                pressureOriginal, pressureIncremented, pressureDecremented);
 
        char statusCode = Character.MAX_VALUE;
        int statusCodeOriginal = statusCode;
        statusCode++;
        int statusCodeIncremented = statusCode;
        statusCode--;
        int statusCodeDecremented = statusCode;
 
        System.out.printf("""
                [Код состояния системы]:
                 Исходное: %d
                 +1: %d
                 -1: %d
                """,
                statusCodeOriginal, statusCodeIncremented, statusCodeDecremented);
 
        int distance = Integer.MAX_VALUE;
        int distanceOriginal = distance;
        distance++;
        int distanceIncremented = distance;
        distance--;
        int distanceDecremented = distance;
 
        System.out.printf("""
                [Пройденное расстояние, м]:
                 Исходное: %d
                 +1: %d
                 -1: %d
                """,
                distanceOriginal, distanceIncremented, distanceDecremented);
 
        long elapsedTimeSensor = Long.MAX_VALUE;
        long elapsedTimeSensorOriginal = elapsedTimeSensor;
        elapsedTimeSensor++;
        long elapsedTimeSensorIncremented = elapsedTimeSensor;
        elapsedTimeSensor--;
        long elapsedTimeSensorDecremented = elapsedTimeSensor;
 
        System.out.printf("""
                [Время с момента старта, мс]:
                 Исходное: %d
                 +1: %d
                 -1: %d
                """,
                elapsedTimeSensorOriginal, elapsedTimeSensorIncremented, elapsedTimeSensorDecremented);
 
        System.out.println();
 
        // 7. ВЫВОД ПАРАМЕТРОВ JVM И ОС
 
        int availableProcessors = Runtime.getRuntime().availableProcessors();
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
                availableProcessors, allocatedMemoryMb, freeMemoryMb, usedMemoryMb, maxMemoryMb);
 
        String systemDrive = System.getProperty("user.dir").substring(0, 1);
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String pathSeparator = System.getProperty("file.separator");
 
        System.out.printf("""
                Параметры ОС:
                 Системный диск: %s
                 Версия ОС: %s %s
                 Версия Java: %s
                 Разделитель пути: %s
                """,
                systemDrive, osName, osVersion, javaVersion, pathSeparator);
 
        System.out.println();
 
        // 8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА
 
        long finishNanoTime = System.nanoTime();
        LocalTime finishTime = LocalTime.now();
        double elapsedSeconds = (finishNanoTime - startNanoTime) / 1_000_000_000.0;
 
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String startTimeFormatted = startTime.format(timeFormatter);
        String finishTimeFormatted = finishTime.format(timeFormatter);
        String elapsedSecondsFormatted = String.format(
                Locale.forLanguageTag("ru"), "%.3f", elapsedSeconds);
 
        System.out.printf("""
                | Старт проверки | %s |
                +----------------+--------------+
                | Финиш проверки | %s |
                +----------------+--------------+
                | Время работы   | %s сек       |
                +----------------+--------------+
                """,
                startTimeFormatted, finishTimeFormatted, elapsedSecondsFormatted);
    }
}




