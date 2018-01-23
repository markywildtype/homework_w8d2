package example.codeclan.com.markysguitars;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by user on 23/01/2018.
 */

public class GuitarCollection {

    private ArrayList<Guitar> guitarCollection;

    public GuitarCollection(){
        guitarCollection = new ArrayList<>();
        guitarCollection.add(new Guitar("Hagstrom", "UltraSwede", "Satin Black"));
        guitarCollection.add(new Guitar("Gibson", "Les Paul", "Wine Red"));
        guitarCollection.add(new Guitar("LTD", "EC 1000", "Black Cherry"));
        guitarCollection.add(new Guitar("Squier", "Telecaster", "Purple Glitter"));
        guitarCollection.add(new Guitar("BC Rich", "Mockingbird", "Cream"));
        guitarCollection.add(new Guitar("Epiphone", "Les Paul", "Sunburst"));
        guitarCollection.add(new Guitar("Fender", "Stratocaster", "Cream"));
        guitarCollection.add(new Guitar("OLP", "MusicMan", "Black"));
        guitarCollection.add(new Guitar("Heritage", "Infinity", "Amber"));
        guitarCollection.add(new Guitar("Antique", "221", "Black"));
    }

    public ArrayList<Guitar> getCollection() {
        return new ArrayList<>(guitarCollection);
    }
}
