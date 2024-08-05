package Flavors;
import java.util.Comparator;

public class FlavorComparatorNumberOfIng implements Comparator<Flavor> {

    @Override
    public int compare (Flavor o1, Flavor o2){

        if(o1.getAllergens().size()> o2.getAllergens().size())
            return -1;
        else
            return 1;
    }
}


