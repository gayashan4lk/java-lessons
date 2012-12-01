class employee{
    String name;
    String age;
    private double salary;
    
    String setname(){
        return name;
    }
    void setsalary(double w){
        
            salary = w;
           
    }
    double getsalary(){
        return salary;
    }
}


class wamp{
    public static void main(String args[]){
        
        String q;
        double y;
        employee ob = new employee();
        
        ob.name ="lakshan";
        ob.age = "12/12/1990";
        
      q = ob.setname();
      System.out.println(q);
      
      ob.setsalary(12234.55);
      
      y = ob.getsalary();
      
      System.out.println(y);
      
    }
}

    
