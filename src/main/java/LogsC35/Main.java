package LogsC35;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.plusMonths(1));
        System.out.println(localDate.plusYears(1));
    }
}
