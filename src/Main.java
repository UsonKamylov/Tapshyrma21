import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
        switch (dayOfWeek) {
            case MONDAY -> System.out.println(dayOfWeek.getSchedule());
            case TUESDAY -> System.out.println(dayOfWeek.getSchedule());
            case WEDNESDAY -> System.out.println(dayOfWeek.getSchedule());
            case THURSDAY -> System.out.println(dayOfWeek.getSchedule());
            case FRIDAY -> System.out.println(dayOfWeek.getSchedule());
            case SATURDAY -> System.out.println(dayOfWeek.getSchedule());
            case SUNDAY -> System.out.println(dayOfWeek.getSchedule());
        }
    }
}