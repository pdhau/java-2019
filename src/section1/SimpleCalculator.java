package section1;

public class SimpleCalculator {
    public static int count = 0;
    private int firstNumber;
    private int secondNumber;

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5);
        simpleCalculator.setSecondNumber(2);
        System.out.println("FirstNumber: "+simpleCalculator.getFirstNumber());
        System.out.println("SecondNumber: "+simpleCalculator.getSecondNumber());
        System.out.println("AdditionResult: "+simpleCalculator.getAdditionResult());
        System.out.println("SubtractionResult: "+simpleCalculator.getSubtractionResult());
        System.out.println("MultiplicationResult: "+simpleCalculator.getMultiplicationResult());
        System.out.println("DivisionResult: "+simpleCalculator.getDivisionResult());
        System.out.println("Count: "+simpleCalculator.getCount());
    }

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(int firstNumber){
        this.firstNumber = firstNumber;
    
    }

    public void setSecondNumber(int secondNumber){
        this.secondNumber = secondNumber;
    }

    public int getAdditionResult() {
        SimpleCalculator.count++;
        return this.firstNumber + this.secondNumber;
    }

    public int getSubtractionResult() {
        SimpleCalculator.count++;
        return this.firstNumber - this.secondNumber;
    }

    public int getMultiplicationResult() {
        SimpleCalculator.count++;
        return this.firstNumber * this.secondNumber;
    }

    public int getDivisionResult() {
        SimpleCalculator.count++;
        return this.firstNumber / this.secondNumber;
    }

    public int getCount(){
        return SimpleCalculator.count;
    }
}
