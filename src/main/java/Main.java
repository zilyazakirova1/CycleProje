import ru.netology.services.monthsCalcService;

public class Main {
    public static void main(String[] args) {
        monthsCalcService service = new monthsCalcService();
        int result = service.calculate(10000,3000,20000);
        System.out.println("Rest "+result+" months");
    }

}

