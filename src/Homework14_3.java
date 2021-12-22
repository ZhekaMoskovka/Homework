import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Homework14_3 {
    static public void findTimeBetweenDays(int birthdayDate, int birthdayMonth, int birthdayYear) {
        GregorianCalendar calendar = new GregorianCalendar();
        int today = calendar.get(Calendar.DAY_OF_MONTH);
        int todaysMonth = calendar.get(Calendar.MONTH);
        int todaysYear = calendar.get(Calendar.YEAR);
        int hourNow = calendar.get(Calendar.HOUR_OF_DAY);
        int minuteNow = calendar.get(Calendar.MINUTE);
        int secondNow = calendar.get(Calendar.SECOND);
        int daysBetween = today - birthdayDate;
        int monthBetween = todaysMonth - birthdayMonth;
        int yearsBetween = todaysYear - birthdayYear;
        String day = " ";
        String month = " ";
        String year = " ";
        String hour = " ";
        String minute = " ";
        String second = " ";
        if (daysBetween < 0) {
            daysBetween = 30 + daysBetween;
            monthBetween -= 1;
        }
        if (monthBetween < 0) {
            monthBetween = 12 + monthBetween;
            yearsBetween -= 1;
        }
        switch (daysBetween % 10) {
            case 1:
                day = "день";
                break;
            case 2:
            case 3:
            case 4:
                day = "дня";
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                day = "дней";
                break;
        }
        switch (monthBetween % 10) {
            case 1:
                month = "месяц";
                break;
            case 2:
            case 3:
            case 4:
                month = "месяца";
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                month = "месяцев";
                break;
        }
        switch (yearsBetween % 10) {
            case 1:
                year = "год";
                break;
            case 2:
            case 3:
            case 4:
                year = "года";
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                year = "лет";
                break;
        }
        switch (hourNow % 10) {
            case 1:
                hour = "час";
                break;
            case 2:
            case 3:
            case 4:
                hour = "часа";
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                hour = "часов";
                break;
        }
        switch (minuteNow % 10) {
            case 1:
                minute = "минута";
                break;
            case 2:
            case 3:
            case 4:
                minute = "минуты";
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                minute = "минут";
                break;
        }
        switch (secondNow % 10) {
            case 1:
                second = "секунда";
                break;
            case 2:
            case 3:
            case 4:
                second = "секунды";
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                second = "секунд";
                break;
        }
        System.out.printf("Вам исполнилось %d %s, %d %s, %d %s, %d %s, %d %s, %d %s",
                yearsBetween, year, monthBetween, month, daysBetween, day, hourNow, hour, minuteNow, minute, secondNow, second);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите дату рождения(30.12.2003): ");
        String birthdayDateWithoutSplit = input.nextLine();
        String []birthdayDate = birthdayDateWithoutSplit.split("\\.");
        int birthdayDay = Integer.parseInt(birthdayDate[0]);
        int birthdayMonth = Integer.parseInt(birthdayDate[1]);
        int birthdayYear = Integer.parseInt(birthdayDate[2]);
        findTimeBetweenDays(birthdayDay, birthdayMonth - 1, birthdayYear);
    }
}