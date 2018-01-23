package example.codeclan.com.markysguitars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/01/2018.
 */

public class GuitarCollectionTest {


    @Test
    public void getGuitarCollection(){
        GuitarCollection guitarCollection = new GuitarCollection();
        assertEquals(10, guitarCollection.getCollection().size());

    }

}
