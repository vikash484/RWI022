class parent 
{
    String name="vikash";
    void getData()
    {
        System.out.println(name); // Removed quotes around name
    }
}

class child extends parent
{

}

public class inheritanceexample {
    public static void main(String[] args) {
        child c1=new child();
        c1.getData();
    }
}
