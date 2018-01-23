package example.codeclan.com.markysguitars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 23/01/2018.
 */

public class GuitarCollectionAdapter extends ArrayAdapter {

    public GuitarCollectionAdapter(Context context, ArrayList<Guitar> guitarList){
        super(context, 0, guitarList);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.guitar_item, parent, false);
        }

        Guitar currentGuitar = getItem(position);
        
        TextView brand = listItemView.findViewById(R.id.brand);
        brand.setText(currentGuitar.getBrand().toString());

        TextView model = listItemView.findViewById(R.id.model);
        model.setText(currentGuitar.getModel().toString());

        TextView colour = listItemView.findViewById(R.id.colour);
        colour.setText(currentGuitar.getColour().toString());

        return listItemView;
    }
}
