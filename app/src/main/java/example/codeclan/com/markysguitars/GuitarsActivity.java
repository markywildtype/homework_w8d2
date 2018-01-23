package example.codeclan.com.markysguitars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class GuitarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitars);

        ArrayList<Guitar> guitarCollection = new GuitarCollection().getCollection();
        GuitarCollectionAdapter guitarsAdapter = new GuitarCollectionAdapter(this, guitarCollection);
    }
}
