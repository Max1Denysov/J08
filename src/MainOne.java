class Box{
    double width,height,depth;
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w ,double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    Box(){
        width = 0;
        height = 0;
        depth = 0;
    }
    Box(double len){
        width = height = depth = len;
    }
    Double volume(){
        return width * height * depth;
    }
}
public class MainOne {
    public static void main(String args[]){
        Box ob1 = new Box(112,90,7);
        Box ob2 = new Box(112);
        Box ob3 = new Box();
        Box myclone = new Box(ob1);
        System.out.println("ob1 = : " + ob1.volume() + "\nob2 = : " + ob2.volume() + "\nob3 = : " + ob3.volume() + "\nmyclone = : " + myclone.volume() );
    }
}
