package example.codeclan.com.markysguitars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class IndividualGuitarActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_guitar);

        Intent intent = getIntent();
        Guitar guitar = (Guitar)intent.getSerializableExtra("guitar");
        Log.d("MovieActivity: ", guitar.getBrand());
    }
}


