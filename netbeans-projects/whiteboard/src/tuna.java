public class tune{
    private int hour = 1;
    private int minute = 2;
    private int second = 3;

    public void set_time(int h,int m,int s){
        h = 4;
        m = 5;
        s = 6;
    }

    public String to_military(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public String toStrng(){
        return String.format("%d:%02d:%02d %s ",((hour==0 || hour==12)?12:hour));
    }

}