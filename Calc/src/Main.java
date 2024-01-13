import java.util.Scanner;       //импортирую класс Scanner для ввода данных с клавиатуры

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");  //запрашивую данные для мат. действий
        String[] operations = {"+", "-", "/", "*"}; //создаю массив с математическими действиями
        String inputStr = input.nextLine();       //считываю данные, введенные пользователем

        int operation = 5;
        for (int i = 0; i < operations.length; i++) {   //создаю цикл для того, чтобы проверить вводные данные
            if (inputStr.contains(operations[i])) {     //на наличие математических операторов
                operation = i;
                break;
            }
        }
        if (operation == 5) {
            System.out.println("Укажите математическое действие.");      //взял oper=5, т.к. на 5 итерации
            return;                                                     //не будет обнаружено ни одного мат. оператора
        }
    }
    public static String calc (String[] input){
        String[] operations1 = {"\\+", "-", "/", "\\*"}; //создаю массив с математическими действиями
        String[] inputInt = input.split(operations1);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //создаю массив чисел от 1 до 10 включительно

        int x = Integer.parseInt(inputInt[0]), y = Integer.parseInt(inputInt[1]);
        //т.к. я создал массив numbers как целочисленный, то и вводные данные в консоли должны быть приведены к целым числам
        int output;
        int number = 11;                                //по аналогии с operation=5
        for (int k = 0; k < numbers.length; k++) {
            if (x == numbers[k]) {                       //сравниваю свои данные с массивом целых чисел
                number = k;
                break;
            }
        }
        int number1 = 11;
        for (int j = 0; j < numbers.length; j++) {
            if (y == numbers[j]) {
                number1 = j;
                break;
            }
        }

        if (number == 11) {
            System.out.println("Введите числа от 1 до 10.");
            return;
        }
        if (number1 == 11) {
            System.out.println("Введите числа от 1 до 10.");
            return;
        }
        switch (input){
            case "+":
                output = x+y;
                System.out.println(output);
            default:
                System.out.println("Ни одно из предыдущих условий не подошло...");
        }
    }
}

