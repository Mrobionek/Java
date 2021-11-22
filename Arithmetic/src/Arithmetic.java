public class Arithmetic {
    private int number1;
    private int number2;
    private int summNumber;
    private int functionNumber;
    private int minNumber;
    private int maxNumber;



    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void summ() {
       summNumber = number1 + number2;

    }

    public void function() {
        functionNumber = number1 * number2;

    }

    public void min() {
        if (number1 < number2) {
            minNumber = number1;
        }
        else
        minNumber = number2;

    }

    public void max() {
        if (number1 > number2) {
            maxNumber = number1;
        }
        else
        maxNumber = number2;

    }

    public void print(String String) {
        System.out.println("Число 1: " + number1);
        System.out.println("Число 2: " + number2);
        System.out.println("Сумма чисел: " + summNumber);
        System.out.println("Произведение чисел: " + functionNumber);
        System.out.println("Минимальное число: " + minNumber);
        System.out.println("Максимальное число: " + maxNumber);
    }
}
