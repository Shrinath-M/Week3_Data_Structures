abstract class tv{
    abstract void turn_on();
    abstract void turn_off();
}
class remote extends tv{
    @Override
    void turn_on(){
        System.out.println("TV is turned on");
    }
    @Override
    void turn_off(){
        System.out.println("TV is turned off");
    }
}
public class abstraction {
    public static void main(String[] args){
        tv r = new remote();
        r.turn_off();
        r.turn_on();
    }
}
