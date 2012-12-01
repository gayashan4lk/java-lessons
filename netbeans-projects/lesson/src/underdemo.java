class under{
    private String name;
    private int age;
    private String dob;
    void setname(String a){
        name =a;
    }
    String getname(){
        return name;
    }
    void setage(int b){
    age =b;    
    }
    int getage(){
        return age;
    }
    void setdob(String c){
        dob =c;
    }
    String getdob(){
        return dob;
    }
    under(String a ,String c  , int b){
        name =a;
        dob =c;
        age =b;
    }
}
class underdemo{
    public static void main(String args[]){
        under ob1 = new under("Eranga","1991/07,28",21);
        under ob2 = new under("Eranga","1991/07,28",21);
        
        ob1.setname("a.b.c.gomez");
        String d =ob1.getname();
        ob1.setage(50);
        int e =ob1.getage();
        ob1.setdob("12/12/1980");
        String f =ob1.getdob();
        System.out.println(d);
         System.out.println(e);
          System.out.println(f);
          ob2.setname("h.d pari");
          String g =ob2.getname();
          ob2.setage(34);
          int h =ob2.getage();
          ob2.setdob("11/10/1887");
          String i =ob2.getdob();
           System.out.println(g);
            System.out.println(h);
             System.out.println(i);
    }
}