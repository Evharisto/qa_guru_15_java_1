package guru.qa;

public class HelloWorld {

    public static void main(String[] args) {
        String stingThatShouldBeDisplayedInConsole = "Hello, World!";
        boolean flag = true;
        boolean flag0 = false;
        byte aByte; //8 бит
        short aShort; //16 бит
        int aInt; //32 бит
        long aLong; //64 бит
        char aChar = '1';
        System.out.println(stingThatShouldBeDisplayedInConsole);

        //Операторы математические: +, -, *, /, % (остаток от деления)
        //Операторы сравнения: >, <, >=, <=, == (равно), != (не равно)
        //Логические операторы: && (и), || (или), ! (отрицание)

        int a = 20;
        int b = 15;

        System.out.println(a + b);

        if (stingThatShouldBeDisplayedInConsole != null && stingThatShouldBeDisplayedInConsole.length() == 3) {
            System.out.println("Строка из 3 символов : " + stingThatShouldBeDisplayedInConsole);
        } else if (stingThatShouldBeDisplayedInConsole == null) {
            System.out.println("Строка null : " + stingThatShouldBeDisplayedInConsole);
        } else {
            System.out.println("Строка не из 3 символов : " + stingThatShouldBeDisplayedInConsole);
        }
    }
}
