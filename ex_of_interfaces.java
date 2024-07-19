
interface mycamera{
    void takesnap();
    void recordvideo();
    default void record4kvid(){
        System.out.println("Recording in 4k ....");
    }
}

interface mywifi{
    String [] getnetworks();
    void connect_to_networks(String network);
}

class Myphone{
    void calling(){
        System.out.println("Calling.....");
    }
    void picking(){
        System.out.println("Picking.....");
    }
}

class Smartphone extends Myphone implements mycamera , mywifi{
    public void takesnap(){
        System.out.println("Taking the snap.....");
    }
    public void recordvideo(){
        System.out.println("Recording the video.....");
    }
    public String [] getnetworks(){
        System.out.println("Getting the list");
        String[] n = {"Zong","Jazz","Telenor"};
        return n;
    };
    public void connect_to_networks(String network){
        System.out.println("Connecting to network....");
    };
}

public class ex_of_interfaces {
    public static void main(String[] args) {
        Smartphone m = new Smartphone();
        String[] ar = m.getnetworks();

        for (String item : ar){
            System.out.println(item);
        }

    }
}
