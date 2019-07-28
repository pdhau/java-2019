package oop.section3.ex3;

public class Main {

    public static void main(String[] args) {
        ScreenText a1 = new ScreenText(1, 2, "Hello form ScreeText");
        ScreenText a2 = new CenteredText(3, "Hello form CenteredText");
        ScreenText a3 = new FramedText(4, "Hello form FramedText");
        a1.display();
        a2.display();
        a3.display();
    }
}
