import ru.netology.services.VacationService;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a income: ");
        int income = in.nextInt();

        System.out.print("Input a expenses: ");
        int expenses = in.nextInt();

        System.out.print("Input a threshold: ");
        int threshold = in.nextInt();

        VacationService service = new VacationService();
        int output = service.calculate(income, expenses, threshold);
        System.out.println("Count of vacation months: " + output);
        in.close();
    }
}
