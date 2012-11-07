class getsum{
    int temp ;
    
    getsum(){
        temp = 0 ;   
    }
    
    public int sum(){
        
        for(int i=0; i<+10; i++){
            temp = i + temp;
        }
        
        return temp;
    }
    
}

class cal_sum{
    public static void main (String args[]){
        getsum ob = new getsum();
        
        int sum = ob.sum();
        
        System.out.println(sum);
    }
}
