package Flavors;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {


        @Override
        public int compare(Cone o1, Cone o2) {
            // This returns an integer (negative, positive, or zero)
            // depending on whether Flavor object o1 or o2
            // comes first, alphabetically.
            if(o2.getCost()>o1.getCost())
                return -1;
            else
                return 1;
        }

        // sorting flavors by name (sorting objects)




    }

