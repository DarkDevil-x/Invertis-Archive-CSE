public class methodOverloading {
    public static void main(String[] args) {
         sayHello(); 
         Him();
         newt(5 ); 
         System.out.println("the dis price is "   +price(20000));
         System.out.println("the dis price is 20% "   +newPrice(20000,20));
         System.out.println("the dis price is 50% "   +newPrice(20000.75,50 ));
    }
    static void sayHello(){
        System.out.println("hello");   // we can call it in main by sayHello method


    }
    static void Him(){
        System.out.println("2nd method to call");
    }
    static void newt(int repeatNumber){
         for(int i=1;i<=repeatNumber;i++)
         {
System.out.println("the no is "  +i );
         }
}
static double price(int rs){
    return rs*0.9;
}
static double newPrice(int rs,int percent){
    return rs*percent/100.0;
}
static double newPrice(double rs,int percent){
    return rs*percent/100;
}
}