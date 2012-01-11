
class room{
    double width,height,depth;

    void volume(){
        System.out.println("volume is ");
        System.out.println(width*height*depth);
    }
}

class roomdemo{
    public static void main(String args[]){
        room room1 = new room();
        room room2 = new room();

        room1.width = 10;
        room1.height = 20;
        room1.depth = 30;

        room2.width = 50;
        room2.height = 50;
        room2.depth = 50;

        room1.volume();
        room2.volume();
    }
}

