// Получить количество сотрудников в компании
// Получить отработанные часы для текущего сотрудника
// Перейти к следующему сотруднику


// Переключение между ветками
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number_emp, count_emp;
        double hours, rate, pay, total_pay;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество сотрудников в компании: ");
        number_emp = input.nextInt();

        total_pay = 0.0;
        count_emp = 0;
        while (count_emp < number_emp) {
            System.out.print("Введите отработанные часы: ");
            hours = input.nextDouble();

            System.out.print("Введите часовую ставку в рублях: ");
            rate = input.nextDouble();

            pay = hours * rate;
            System.out.println("Зарплата равна " + pay + " руб.");

            total_pay += pay;

            ++count_emp;
        }
        System.out.println("\nВсе сотрудники обработаны.\n");

        System.out.println("Общая зарплата компании равна "
                + total_pay + " руб.");
    }
}
