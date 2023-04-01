import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Argen";

        final int NUM = 2008;

        String word = "Madaminov";

        String Argen = word + " tk " + NUM;
        System.out.println(Argen);

        String allVariables = Argen + word + NUM;
        System.out.println(allVariables);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }else  if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
