//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("Age less than 18!!!");
        }
        else {
            System.out.println("Accept!!!");
        }
    }
    public static void main(String[] args) {
        int age = 12;
        try{
            checkAge(age);
        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}