import java.util.Scanner;

public class Main {
    static boolean romanFlag = false;
    static boolean arabicFlag = false;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: '+', '-', '*','/'");

        /*
         * Для проверки умножения римских чисел for (int i = 0; i < 10; i++) { String
         * num = Calculator.values()[i].getTitle(); char ch = '*'; String secondNum =
         * null; for (int k = 0; k < 10; k++) { secondNum =
         * Calculator.values()[k].getTitle(); System.out.println(num + ch + secondNum);
         * String string = num + ch + secondNum; calc(string); } }
         */

        String input = scanner.nextLine();

        calc(input);

    }

    public static String calc(String input) throws Exception {

        String[] symbols = input.split("[+,-,*,/]");
        String output = null;
        int answer = 0;
        char ch = mathSymb(input);
        int[] toInt = intAuthentificator(symbols);
        if (ch == '+') {
            answer = toInt[0] + toInt[1];
        }
        if (ch == '-') {
            answer = toInt[0] - toInt[1];
        }
        if (ch == '*') {
            answer = toInt[0] * toInt[1];
        }
        if (ch == '/') {
            answer = toInt[0] / toInt[1];
        }
        output = "Ответ: " + Integer.toString(answer);
        if (romanFlag) {
            Calculator[] strings = Calculator.values();
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].toInt() == answer) {
                    output = "Ответ: " + strings[i].getTitle();
                }

            }
        }
        if (romanFlag && arabicFlag) {
            output = null;
            throw new Exception("используются одновременно разные системы счисления");
        }
        if (romanFlag && answer < 0) {
            output = null;
            throw new Exception("в римской системе нет отрицательных чисел");
        }
        if (toInt.length != 2) {
            output = null;
            throw new Exception(
                    "формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (Character.toString(ch) == null) {
            throw new Exception("строка не является математической операцией");
        }
        System.out.println(output);
        return output;
    }

    public static int[] intAuthentificator(String[] input) {
        int[] symb = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            try {
                int j = Integer.parseInt(input[i]);
                symb[i] = j;
                arabicFlag = true;

            } catch (NumberFormatException e) {

                for (int k = 0; k < 10; k++) {
                    if (input[i].equalsIgnoreCase(Calculator.values()[k].getTitle())) {
                        int j = Calculator.values()[k].toInt();
                        symb[i] = j;
                        romanFlag = true;
                    }
                }

            }

        }

        return symb;

    }

    public static char mathSymb(String input) {
        char[] c = input.toCharArray();
        for (Character ch : c) {
            Boolean returnValue = ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/');
            if (returnValue) {
                return ch;
            }
        }
        return 0;
    }
}
