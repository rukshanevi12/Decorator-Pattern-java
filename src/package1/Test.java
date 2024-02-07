/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author User
 */

abstract class IceCream{
    public abstract double getPrice();
}

class VanilaIceCream extends IceCream{

    @Override
    public double getPrice() {
        return 100; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
class ChochlateIceCream extends IceCream{

    @Override
    public double getPrice() {
        return 150;
    }
    
}
abstract class IceCreamDecorator extends IceCream{
    IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    
}

class StrawberySauce extends IceCreamDecorator{
    
    public StrawberySauce(IceCream iceCream) {
        super(iceCream);
    }

    
    @Override
    public double getPrice() {
       return iceCream.getPrice()+25;
    }
    
}

public class Test {
    public static void main(String[] args) {
        IceCream iceCream1 =  new VanilaIceCream();
        System.out.println(iceCream1.getPrice());
        
        IceCream iceCream2 = new VanilaIceCream();
        iceCream2 = new StrawberySauce(iceCream2);
        System.out.println("VANILA ICE CREAM WITH STRAWBERY SAUCE = " + iceCream2.getPrice());
        
             IceCream iceCream3 = new ChochlateIceCream();
       System.out.println("Chochalate ICE CREAM = " + iceCream3.getPrice());
       
       iceCream3 = new StrawberySauce(iceCream3);
       
       System.out.println("Chochalate ICE CREAM With Strawbery sauce = " + iceCream3.getPrice());
       

    }
}
