 class box{
     double width,depth,height;

     box(double w,double d,double h){
         width = w ;
         depth = d;
         height = h;
     }

     double volume(){
         return width*depth*height;
     }
 }

 class boxdemo3{
     public static void main(String args[]){
         box mybox1 = new box(10,10,10);
         box mybox2 = new box(10,20,30);

          double vol = mybox1.volume();
          System.out.println("volume of box = "+vol);

          vol  = mybox2.volume();
          System.out.println("volume of box 2 = " + vol);
     }
 }