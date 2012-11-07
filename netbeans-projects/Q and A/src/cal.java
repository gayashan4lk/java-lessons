    

//calculate squaroot of a number
class math{
    
    public static double calsqrt(int x) {
         double number = x;
         double temp1 = 0 ;
         double temp2 = 0 ;
         double temp_sqrt = 0 ;
         
            temp1= number/2+1;
            
         for(int i=0;i<20;i++){
             
             temp1 = temp_sqrt ;
             temp2 = (temp1+(number/temp1))/2;
             temp_sqrt =  temp2;
         }
        
        return temp_sqrt;
    }
        
     /*  double a = x;
        double t1 = a/2+1;
        double t2 = (t1+(a/t1))/2;
        double t3 = t2;
        double t4 = (t3+(a/t3))/2;
        double t5 = t4;
        double t6 = (t5+(a/t5))/2;
        double t7 = t6;
        double t8 = (t7+(a/t7)/2);
        System.out.println("t1 = "+t1 );
        System.out.println("t2 =  "+t2);
        System.out.println("t4  =  "+ t4);
        System.out.println("t6  =  "+ t6);
        */
   
    public static void get_sqrt(){
        
    }

    
}

class cal{
    public static void main(String args[]){
       math mymath = new math();
        int s = 16;
        double sqrt = mymath.calsqrt(s);
       System.out.println("square root of "+s+" is " + sqrt  );
    }
}