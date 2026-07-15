class Outer{
    int x = 30;
    class Inner{
        int y = 40;
    }
}
public class InnerExample{
    public static void main(String args[]){

        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();

        System.out.println(outerObj.x + innerObj.y);

    }
}