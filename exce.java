public class exce {
    
    public static void main(String[] args) {
        
            int a = 100;
            int b = 0;
            int c;
            try{
            c = a / b;
            System.out.println(c);
            }
        catch (Exception e) {
            System.out.println("you can not devied by zero");
        }
    }
}
