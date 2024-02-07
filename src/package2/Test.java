/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;

/**
 *
 * @author User
 */
abstract class Pizza {

    public abstract double getPrice();
}

class ChickenPizza extends Pizza {

    @Override
    public double getPrice() {
        return 850;
    }

}

class VegiePizza extends Pizza {

    @Override
    public double getPrice() {
        return 650;
    }

}

class FishPizza extends Pizza {

    @Override
    public double getPrice() {
        return 720;
    }

}

abstract class Decorator extends Pizza {

    Pizza pizza;

    public Decorator(Pizza pizza1) {
        this.pizza = pizza1;
    }
}

class BBQSauce extends Decorator {

    public BBQSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 50;
    }

}

class SwissCheese extends Decorator {

    public SwissCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 80;
    }

}

class FriedOnion extends Decorator {

    public FriedOnion(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20;
    }

}

class Mayonnaise extends Decorator {

    public Mayonnaise(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 35;
    }

}

public class Test {

    public static void main(String[] args) {
        Pizza pizza1 = new FishPizza();
        pizza1 = new BBQSauce(pizza1);
        pizza1 = new SwissCheese(pizza1);
        System.out.println("Fish Pizza With BBQ sause and swiss cheese = Rs"+pizza1.getPrice());
        
        Pizza pizza2 =  new ChickenPizza();
        pizza2 =  new BBQSauce(pizza2);
        pizza2 = new FriedOnion(pizza2);
        pizza2 = new Mayonnaise(pizza2);
        System.out.println("Chicken Pizza With BBQ sause,Fried Onin and Mayonnaise = Rs."+pizza2.getPrice());
        
        Pizza pizza3 = new VegiePizza();
        pizza3 = new SwissCheese(pizza3);
        pizza3 = new FriedOnion(pizza3);
        System.out.println("Veggie Pizza With Onio and Mayonnaise = Rs."+pizza3.getPrice());
        

    }

}
