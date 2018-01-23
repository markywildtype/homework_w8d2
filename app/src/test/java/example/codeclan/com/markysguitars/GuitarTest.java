package example.codeclan.com.markysguitars;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/01/2018.
 */

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Hagstrom", "UltraSwede", "Satin Black");
    }

    @Test
    public void hasBrand(){
        assertEquals("Hagstrom", guitar.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("UltraSwede", guitar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Satin Black", guitar.getColour());
    }
}
