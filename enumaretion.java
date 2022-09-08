public class enumaretion {
    public enum DayOfWeek {
        MONDAY(1),TUESDAY(2),WEBNESDAY(3),THRUSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
    
    public int val;
    DayOfWeek(int val){
        this.val=val;
    }
    
boolean isworkday(){
    if(val<6)
    return true;
    else
    return false;
}
 public static void main(String[] args) {
    DayOfWeek day;
    System.out.println("verifattion of sunday(isworkday()");
    System.out.println(DayOfWeek.SUNDAY.isworkday());
    System.out.println("verifattion of webnesday(isworkday()");
    System.out.println(DayOfWeek.WEBNESDAY.isworkday());
 }

}
}
