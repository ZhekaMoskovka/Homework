public class Homework13_3 {
    public static void main(String[] args) {
        String string = "Поток – это абстрактное значение источника или приёмника данных, которые способны обрабатывать информацию.\n" +
                "В программу идет входной поток (input stream) символов Unicode или просто байтов, воспринимаемый в программе методами read(). \n" +
                "Из программы методами write() или print(), println() выводится выходной поток (output stream) символов или байтов. \n" +
                "При этом неважно, куда направлен поток: на консоль, на принтер, в файл или в сеть, методы write() и print() ничего об этом не знают. \n";
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int size = stringBuilder.length();
        stringBuilder1.append(stringBuilder, 0, size / 2);
        stringBuilder2.append(stringBuilder, size / 2 + 1, size);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
    }
}