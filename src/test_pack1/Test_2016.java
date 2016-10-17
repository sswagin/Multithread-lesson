import java.util.Scanner;

public class Test_2016 {

    private static void main(String[] args) {
        int numberOfCorrectAnswers = 0;


        System.out.println("Тестирование java");
// 1
        System.out.println("1) История Java. Для чего создавался язык Java? " +
                "\n Вариант1: Для работы в web. " +
                "\n Вариант2: Как альтернатива C++ " +
                "\n Вариант3: Оба варианта верны");

        int oneAnswer = forConsole();
        switch (oneAnswer) {
            case 1:
                System.out.println("Верный ответ");
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: Изначально язык создавался из-за потребности в независящем от платформы языке(для микроволновок телевизиров). \n Но с развитием интернета java оказался подходящим решением для запуска ПО на различных компьюетрах. \n Вторая причина: Как альтернатива языка С++");
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: Изначально язык создавался из-за потребности в независящем от платформы языке(для микроволновок телевизиров). \n Но с развитием интернета java оказался подходящим решением для запуска ПО на различных компьюетрах");
                numberOfCorrectAnswers++;
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 2
        System.out.println("2) Обзор Java. Java это обьектно-ориентированный язык? " +
                "\n Вариант1: Да" +
                "\n Вариант2: Нет");

        int twoAnswer = forConsole();
        switch (twoAnswer) {
            case 1:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: Потому что он обьектно ориентированный :)");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1 или 2");
        }
// 3
        System.out.println("3) Обьектно-ориентированное программирование. Выберите три принцыпа ООП" +
                "\n Вариант1: Общий. Открытый. Популярынй" +
                "\n Вариант2: Инкапсуляция. Наследование. Полиморфизм" +
                "\n Вариант3: Абстракция. Ключевые слова. Типизация");

        int threeAnswer = forConsole();
        switch (threeAnswer) {
            case 1:
                System.out.println("Не верный ответ. Верный ответ 2. Почему: Все языки обьектно-ориентированного программирования представляют механизмы, которые облегчают реализацию обьектно-ориентированной модели. Этими механизмами являются инкапсуляция, наследование и полиморфизм.");
                break;
            case 2:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 2. Почему: Все языки обьектно-ориентированного программирования представляют механизмы, которые облегчают реализацию обьектно-ориентированной модели. Этими механизмами являются инкапсуляция, наследование и полиморфизм.");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 4
        System.out.println("4) Оператор if. Выберите простейшую форму для оператора if " +
                "\n Вариант1: оператор if (условие)" +
                "\n Вариант2: (условие) if оператор" +
                "\n Вариант3: if (условие) оператор");

        int fourAnswer = forConsole();
        switch (fourAnswer) {
            case 1:
                System.out.println("Не верный ответ. Верный ответ 3. Почему: Сначала идет сам оператор if, потом условие которое должно быть выполнено, далее оператор который мы хотим выполнить ");
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 3. Почему: Сначала идет сам оператор if, потом условие которое должно быть выполнено, далее оператор который мы хотим выполнить ");
                break;
            case 3:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 5
        System.out.println("5) Типы данных. Какой диапазон доступных значений имеет тип данных int " +
                "\n Вариант1: от -2147483648 до 2147483647, 32 бита" +
                "\n Вариант2: от -32768 до 32767, 16 бит" +
                "\n Вариант3: от - 100 до 100, 2 бит");

        int fiveAnswer = forConsole();
        switch (fiveAnswer) {
            case 1:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: от -2147483648 до 2147483647, 32 бита");
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: от -2147483648 до 2147483647, 32 бита");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 6
        System.out.println("6) Многомерные массивы. Выберите правильно написанный формат двумерного массива" +
                "\n Вариант1: int = new int [4][5]" +
                "\n Вариант2: double twoD[][] = new int [4][5]" +
                "\n Вариант3: int twoD[][] = new int [4][5]");

        int sixAnswer = forConsole();
        switch (sixAnswer) {
            case 1:
                System.out.println("Не верный ответ. Верный ответ 3. Почему: Пропущено название переменной");
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 3. Почему: указаны различные форматы double и int");
                break;
            case 3:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 7
        System.out.println("7) Арифметические операторы. Выберите правельные форматы арифместических операторов" +
                "\n Вариант1: + Инкримент. - Декримент. -= Сложение с вычитанием" +
                "\n Вариант2: %= Деление по модулю с присваиванием. += Сложение с присваиванием. -- Декримент" +
                "\n Вариант3: int Инкримент. char Деление по модулю. double корень числа");

        int sevenAnswer = forConsole();
        switch (sevenAnswer) {
            case 1:
                System.out.println("Не верный ответ. Верный ответ 2. Почему: верные операторы указаны в ответе 2 (смотри главу 4 Шилд");
                break;
            case 2:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 2. Почему: верные операторы указаны в ответе 2 (смотри главу 4 Шилд");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 8
        System.out.println("8) Логические операторы. Выберите правильно написанный формат логических операторов" +
                "\n Вариант1: a = 3, b = 5. a < b $ a != b" +
                "\n Вариант2: a = 3, b = 5. a < b $ a == b" +
                "\n Вариант3: a = 3, b = 5. a || b $$ a ^= b");

        int eightAnswer = forConsole();
        switch (eightAnswer) {
            case 1:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: a == b, здесь а должно быть равно b, но а(3) меньше(<) b(5)");
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: Операторы || (OR), ^= (XOR) применены не верно ");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 9
        System.out.println("9) Оператор switch. Укажите верную форму оператора switch" +
                "\n Вариант1: switch (выражение) { \n case значение1: \n // последовательность операторов \n break;  \n case выражениеN: \n // последовательность операторов \n break \n default : \n }" +
                "\n Вариант2: { \n case значение1:  \n // последовательность операторов  \n break; \n case выражениеN: \n // последовательность операторов \n break \n default : \n } \n switch (выражение) " +
                "\n Вариант3: Оба варианта верны");

        int nineAnswer = forConsole();
        switch (nineAnswer) {
            case 1:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: оператора switch пишеться вначале группы операторов case");
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: оператора switch пишеться вначале группы операторов case");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 10
        System.out.println("10) Операторы цыкла, цыкл while. Укажите верную форму цыкла while" +
                "\n Вариант1: while(инициализация; условие; повторение) { \n // тело цыкла \n }" +
                "\n Вариант2: while(условие) { \n // тело цыкла \n }" +
                "\n Вариант3: Оба варианта верны");

        int tenAnswer = forConsole();
        switch (tenAnswer) {
            case 1:
                System.out.println("Не верный ответ. Верный ответ 2. Почему: Во входящем параменте цыкла while, не может быть использовано инициализация и повторение");
                break;
            case 2:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 2. Почему: Во входящем параменте цыкла while, не может быть использовано инициализация и повторение");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 11
        System.out.println("11) Цыкл do-while. Укажите верную форму цыкла do-while" +
                "\n Вариант1: while(инициализация; условие; повторение) { \n // тело цыкла \n }" +
                "\n Вариант2: while(условие) { \n // тело цыкла \n do}" +
                "\n Вариант3: do { \n // тело цыкла \n } while (условие)");

        int elevenAnswer = forConsole();
        switch (elevenAnswer) {
            case 1:
                System.out.println("Не верный ответ. Верный ответ 3. Почему: в примеденном выражении нет do");
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 3. Почему: Оператор do пишеться вначале цыкла");
                break;
            case 3:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 12
        System.out.println("12) Цыкл for. Укажите верную форму цыкла for" +
                "\n Вариант1: for (;;) { \n // тело \n }" +
                "\n Вариант2: for (инициализация; условие; повторение) { \n // тело \n }" +
                "\n Вариант3: варианты 1 и 2 - верны");

        int     twelveAnswer = forConsole();
        switch (twelveAnswer) {
            case 1:
                System.out.println("Не верный ответ. Верный ответ 3. Почему: вы выбрали только вечный цыкл for, необходимо и его общую форму");
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 3. Почему: с помощью (;;) можно создать вечный цыкл");
                break;
            case 3:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 13
        System.out.println("13) Верия 'for-each' цыкла for. Укажите верную форму цыкла 'for-each'" +
                "\n Вариант1: for (тип итер_пер : коллекция) блок_операторов" +
                "\n Вариант2: for (инициализация; условие; повторение) { \n // тело \n }" +
                "\n Вариант3: варианты 1 и 2 - верны");

        int     thirteenAnswer = forConsole();
        switch (thirteenAnswer) {
            case 1:
                System.out.println("Ответ верный");
                numberOfCorrectAnswers++;
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: Вы выбрали стандартный цыкл for, а нужно было 'for-each'");
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: Во втором варианте указан стандартный цыкл for, а нужно было 'for-each'");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 14
        System.out.println("14) Операторы перехода. Для чего используется оператор break" +
                "\n Вариант1: 1. Завершение операторов switch 2. Выхожд из цыкла 3. Цывизованная форма оператора 'goto' " +
                "\n Вариант2: Остановки параллельных процессов" +
                "\n Вариант3: Оба варианта верны");

        int     fourteenAnswer = forConsole();
        switch (fourteenAnswer) {
            case 1:
                System.out.println("Ответ верный");
                numberOfCorrectAnswers++;
                break;
            case 2:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: В ответе 1 указаны верные методы использования оператора break");
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 1. Почему: В ответе 1 указаны верные методы использования оператора break");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }

// 15
        System.out.println("15) Операторы перехода. Для чего используется оператор continue" +
                "\n Вариант1: Если условие оператора верное - переход на следующий цыкл " +
                "\n Вариант2: Для более раннего повторения цыкла" +
                "\n Вариант3: Для продолжения работы цыкла");

        int     fifteenAnswer = forConsole();
        switch (fifteenAnswer) {
            case 1:
                System.out.println("Не верный ответ. Верный ответ 2. Почему: Оператор continue используется для более раннего повторения цыкла ");
                break;
            case 2:
                System.out.println("Верный ответ");
                numberOfCorrectAnswers++;
                break;
            case 3:
                System.out.println("Не верный ответ. Верный ответ 2. Почему: Оператор continue используется для более раннего повторения цыкла ");
                break;
            default:
                System.out.println("Achtung! Введите ответ в формате числа 1, 2 или 3");
        }


        System.out.println("Вы набрали " + numberOfCorrectAnswers + " баллов из 15");

    }

    private static int forConsole() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());

    }
}
