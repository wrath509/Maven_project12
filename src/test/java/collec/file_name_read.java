package collec;
class vehcile{
 int speed = 100;
}
class car extends vehcile
{
    int speed= 200;
    void display()
    {
        System.out.println("Max speed: "+ super.speed);
    }
}
public class file_name_read {

    public static void main(String[] args) {
        car hel = new car();
        hel.display();
    }
}
