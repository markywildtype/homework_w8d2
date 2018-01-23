package example.codeclan.com.markysguitars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class GuitarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitars);

        ArrayList<Guitar> guitarCollection = new GuitarCollection().getCollection();
        GuitarCollectionAdapter guitarsAdapter = new GuitarCollectionAdapter(this, guitarCollection);

        ListView listView = findViewById(R.id.guitar_list_view);
        listView.setAdapter(guitarsAdapter);
    }

    public void onListItemClick(View listItem){
        Guitar guitar = (Guitar) listItem.getTag();
        Log.d("Guitar brand: ", guitar.getBrand());
    }

    public void getGuitar(View listItem) {
        Guitar guitar = (Guitar) listItem.getTag();
        Log.d("Guitar brand: ", guitar.getBrand());

        Intent intent = new Intent(this, IndividualGuitarActivity.class);
        intent.putExtra("guitar", guitar);
        startActivity(intent);
    }

}
