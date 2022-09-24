class Room
{
    int length,breadth;
    Room(int x,int y){
        length = x;
        breadth = y;
    }
    
    int Area(){
        return (length * breadth);
    }
}

class bedRoom extends Room{
    int height;
    bedRoom(int x,int y,int z){
        super(x,y);
        height = z;
    }
    
    int volume(){
        return (length * breadth * height);
    }
}

class Main{
    public static void main(String args[]){
        bedRoom o1 = new bedRoom(10,20,10);
        int area1 = o1.Area();
        int vol1 = o1.volume();
        System.out.println("Area is "+area1);
        System.out.println("Volume is "+vol1);
    }
}