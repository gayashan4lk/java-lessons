
class square{
    int a;

    int sq(int i ){
        return i*i;
    }
}
class squaredemo{
    public static void main(String args[]){
        int x;
        int y;

        square mysquare = new square();

       x =  mysquare.sq(15);
       y =  mysquare.sq(8);

       System.out.println("square of 15 = "+x);
       System.out.println("square of 8 = "+y);
    }
}