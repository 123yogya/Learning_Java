enum Day{ // Day is the name of the enum, and it is a user-defined data type that can store only the days of the week
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY // These are values
}
public class EnumExample {

    public static void main(String[] args) {
        Day toDay = Day.MONDAY; // Day is the enum data type(user-defined data type) and assign the enum constant MONDAY to variable
        switch(toDay){
            case MONDAY:
            System.out.println("Start of the week");
            break;

             case TUESDAY:
            System.out.println("Second day");
            break;

             case WEDNESDAY:
            System.out.println("Middle of the week");
            break;

             case THURSDAY:
            System.out.println("Forth day");
            break;

             case FRIDAY:
            System.out.println("Fifth day");
            break;

             case SATURDAY:
            System.out.println("It is the holiday");
            break;

             case SUNDAY:
            System.out.println("It is the holiday");
            break;
        }
    }
}