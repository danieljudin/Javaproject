package java_basics;

public class PrimitiveDataTypes {
    // main - это главный метод. Через него всё проходит и запускается. Хочешь написать программу - нужен всегда main метод.

    // Для начала надо понять какие тебе в этом языке программирования даны типы данных,
    // с которыми ты можешь работать.

    // Посмотри это видео:
    // https://youtu.be/cOt_Gulu2mE?si=F-yNi7VA_ZRHnJmi

    // выпиши в System.out.println -ах все примитивные типы данных, которые есть в Java. Как пример, вот байт
    // ЗАДАЧА:
    // В одной строке задекларируй и проинициализируй тип данных
    // Во второй строке добавь её в новый System.out.println

    public static void main(String[] args) {
        byte myByte = 100;
        System.out.println(myByte);
         byte num = 100; // 8бит    -128 + 127
         short num1 = 123; // 16 бит -32768 + 32767
         int num2 = 141; // 32 бит -2147483648 + 2147483648
         long num3 = 123; // 64бит -1 878 292 7639 +1 878 292 7639

         float num4 = 1.1f; // 32    1.123456   6-7
         double num5 = 1.11; // 64    15

        char sym = '\u+121212'; // ♣ 16 // бит

        boolean isTrue = false; // 1 бит true;

    }
}




