package Chp4;
class Clock{
    private String time;
    public String getTime(){
        return time;
    }
    public void setTime(String t){
        time = t;
    }
}
public class Time {
    public static void main(String[] args) {
     Clock c = new Clock();
     c.setTime("1245");
     String tod = c.getTime();
     System.out.println("Time : "+tod);
    }
}
