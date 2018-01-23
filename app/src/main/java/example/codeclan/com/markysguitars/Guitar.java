package example.codeclan.com.markysguitars;

/**
 * Created by user on 23/01/2018.
 */

public class Guitar {

    private String brand;
    private String model;
    private String colour;

    public Guitar(String brand, String model, String colour){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
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
}
