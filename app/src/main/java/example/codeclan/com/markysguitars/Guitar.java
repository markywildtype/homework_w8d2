package example.codeclan.com.markysguitars;

import java.io.Serializable;

/**
 * Created by user on 23/01/2018.
 */

public class Guitar implements Serializable{

    private String brand;
    private String model;
    private String colour;
    private int image_id;

    public Guitar(String brand, String model, String colour, int image_id){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.image_id = image_id;
    }


    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public int getImage_id(){
        return this.image_id;
    }
}
