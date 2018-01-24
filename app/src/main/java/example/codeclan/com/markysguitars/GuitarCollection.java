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
        guitarCollection.add(new Guitar("Hagstrom", "UltraSwede", "Satin Black", R.drawable.hagstrom));
        guitarCollection.add(new Guitar("Gibson", "Les Paul", "Wine Red", R.drawable.gibson));
        guitarCollection.add(new Guitar("LTD", "EC 1000", "Black Cherry", R.drawable.esp_ltd));
        guitarCollection.add(new Guitar("Squier", "Telecaster", "Purple Glitter", R.drawable.squier));
        guitarCollection.add(new Guitar("BC Rich", "Mockingbird", "Cream", R.drawable.bc_rich));
        guitarCollection.add(new Guitar("Epiphone", "Les Paul", "Sunburst", R.drawable.epiphone));
        guitarCollection.add(new Guitar("Fender", "Stratocaster", "Cream", R.drawable.fender));
        guitarCollection.add(new Guitar("OLP", "MusicMan", "Black", R.drawable.olp));
        guitarCollection.add(new Guitar("Hudson", "Infinity", "Amber", R.drawable.hudson));
        guitarCollection.add(new Guitar("Baltimore", "221", "Black", R.drawable.baltimore));
    }

    public ArrayList<Guitar> getCollection() {
        return new ArrayList<Guitar>(guitarCollection);
    }
}
