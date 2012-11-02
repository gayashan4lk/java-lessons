class mystery{
    
    public static void main(String args[]){

        int x;
        int count = 1;

        while (count <= 11){

            x = count%2;

            if (x==1){
                System.out.println("***"+"\n"+"++++++");
            }

            ++count;
        }
    }
}