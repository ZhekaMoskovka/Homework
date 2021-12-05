package Homework8_2;

public class WrongYearException extends Exception{
    @Override
    public String getMessage() {
        return "Неправильно задан год";
    }
}
