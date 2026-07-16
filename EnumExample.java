enum Day {
    MONDAY, TUESDAY, THURSDAY, WEDNESDAY, FRIDAY, SATURDAY, SUNDAY

}public class{

    public static void main(String args[]) {

        Day today = Day.MONDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week");
                break;
        }
    }
}