package se.mah.kd323b.assignment2;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends ListActivity {

	private static String[] names = new String[] { "Mercury", "Venus", "Earth",
		"Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//The list needs to know how to show the items
		//Here we use android.R.layout.simple_list_item_1 that is a predefined layout
		//The ArrayAdapter takes a stringArray and combines that with a tha layout
		//There are other adpaters and you can write your own.... as in the challenge
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, names);
		//Then apply the adapter to the list with a method setListAdapter inherited from ListActivity
		 setListAdapter(adapter);
		 //Call to the supercass onCreate
		super.onCreate(savedInstanceState);
	}
	
	//Since the ListActivity knows that i holds a list this method is called when you click an item 
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Toast.makeText(getListView().getContext(), names[position],Toast.LENGTH_SHORT).show();
		super.onListItemClick(l, v, position, id);
	}
 
}
