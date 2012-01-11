class box{

        int x;
        int y;
        double width,height,depth;

    box(){
        width = 10;
        height = 30;
        depth = 50;
        x = 15;
        y = 13;
    }//end constructor

    double volume(){
        return width*height*depth;
    }
    
    int product(){

        return x*y;
    }
}

class boxdemo2{
    public static void main(String args[]){
        box mybox1 = new box();
        box mybox2 = new box();
        
        double vol;
          int pro;
       // double vol2;

        vol = mybox1.volume();
        System.out.println("volume of box one = "+vol  );

        vol = mybox2.volume();
       System.out.println("volume of box one = "+vol  );

               pro = mybox1.product();
        System.out.println(" product of 15 and 13 = "+ pro );

    }

}