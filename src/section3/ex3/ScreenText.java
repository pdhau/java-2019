package section3.ex3;

public class ScreenText {

    private int x;
    private int y;
    private String text;
    public ScreenText(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getText() {
        return text;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("Position x: "+this.getX()+", y: "+this.getY()+" -- text"+this.getText());
    }
}
