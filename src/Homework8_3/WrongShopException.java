package Homework8_3;

public class WrongShopException extends Exception{
    @Override
    public String getMessage() {
        return "Данный магазин не обслуживается";
    }
}
