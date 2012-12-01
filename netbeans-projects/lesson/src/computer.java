//CLASS RELATED TO COMPURER_DEMO MAIN CLASS

public class computer{
    public int current;
    
    computer(int a){
        current = a;
    }
    
    public void print_com_status(){
        if (current>0)
            System.out.println("your computer is POWER ON");
        
        else
            System.out.println("your computer is SLEEPING");
    }
    
    public void print_add(int a,int b,int c){
        
        if(current > 0  ){
            int x = a;
            int y = b;
            int z = c;
            int sum = x + y + z;
            System.out.println(x+ " + "+y+ " + "+z+ " = " + sum );
            
        }
        else{
            System.out.println("please, power on your computer.."); 
        }
        
    }//end method

}//end class computer