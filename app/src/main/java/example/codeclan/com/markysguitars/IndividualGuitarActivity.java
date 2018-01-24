package example.codeclan.com.markysguitars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class IndividualGuitarActivity extends AppCompatActivity {

    TextView individualinfo;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_guitar);

        Intent intent = getIntent();
        Guitar guitar = (Guitar)intent.getSerializableExtra("guitar");
        Log.d("Guitar brand: ", guitar.getBrand());

        individualinfo = findViewById(R.id.individualinfo);
        individualinfo.setText(guitar.getBrand().toString());
    }
}
