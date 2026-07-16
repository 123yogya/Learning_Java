class student{
    private int age = 28;
    public void showAge(){
        System.out.println("Age is: " + age);
    }
}
public class PrivateAccessModifier {

    public static void main(String[] args) {
        student myObj = new student();
        myObj.showAge();
    }
}