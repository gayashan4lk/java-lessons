/*
class box{
    double width,height,depth;

}

class boxdemo{
    public static void main (String args[]){
        box mybox = new box();
        double vol;

        mybox.width=10;
        mybox.height=20;
        mybox.depth=30;

        vol = mybox.width*mybox.height*mybox.depth;
        System.out.println("volume of box is = "+vol);
    }
}
  */
 
class box{
   // double width,height,depth;
    
    double volume(double w,double h,double d){
        return w*h*d;
    }
    
}

class boxdemo{
   
    
    public static void main(String args[]){
        double vol;

        box mybox = new box();
        
        vol =   mybox.volume(10,20,30);
        System.out.println("volume of box "+vol);
      
    }
}
        
