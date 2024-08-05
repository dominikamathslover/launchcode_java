package Flavors;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();


        System.out.println("\n Before: ");
        for(Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);

        System.out.println("\n After: ");
        for(Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }

        // w jednej linii sortowanie !

        System.out.println("\n Before: ");
        for(Cone cone: cones){
            System.out.println(cone.getName()+" "+cone.getCost());
        }

        cones.sort(new ConeComparator());

        System.out.println("\n After: ");
        for(Cone cone: cones){
            System.out.println(cone.getName()+" "+cone.getCost());
        }


        System.out.println("\n Before: ");
        for(Flavor flavor: flavors){
            System.out.println(flavor.getName()+"- number of allergens: "+flavor.getAllergens().size());
        }

        flavors.sort(new FlavorComparatorNumberOfIng());

        System.out.println("\n After: ");
        for(Flavor flavor: flavors){
            System.out.println(flavor.getName()+"- number of allergens: "+flavor.getAllergens().size());
        }

        System.out.println("\n Before: ");
        for(Toppings topping: toppings){
            System.out.println(topping.getName()+" "+topping.getCost());
        }

        toppings.sort(new ToppingsComparator());

        System.out.println("\n After: ");
        for(Toppings topping: toppings){
            System.out.println(topping.getName()+" "+topping.getCost());
        }






    }
}
