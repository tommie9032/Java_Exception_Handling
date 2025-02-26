//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        try{
            System.out.println("Division is :"+a/b);

        }
        catch(ArithmeticException e){
            System.out.println("Denominator is 0!!!!");
        }
    }
}