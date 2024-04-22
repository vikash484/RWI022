class animal {
    public void run()
    {
        System.out.println("i am eating");
    }
    public void main ()
    {
        System.out.println("1");
    }
    public void eat()
    {
        System.out.println("i am running");
    }

}


public class animalopps {
    
    public static void main(String[] args) {
        animal b1 = new animal();
        b1.eat();
        b1.run();
        b1.main();
        
    }
    
}
