public class Calculator {

    int firstVariable;
    int secondVariable;


    public Calculator(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public void addition() {
        double result = firstVariable + secondVariable;
        System.out.println(firstVariable + " + " + secondVariable + " = " + result);
    }

    public void subtraction(){
        double result = firstVariable - secondVariable;
        System.out.println(firstVariable + " - " + secondVariable + " = " + result);
    }

    public void multiplication(){
        double result = firstVariable * secondVariable;
        System.out.println(firstVariable + " * " + secondVariable + " = " + result);
    }

    public void division () {
        double result = (double) firstVariable / secondVariable;
        System.out.println(firstVariable + " / " + secondVariable + " = " + result);
    }
}
