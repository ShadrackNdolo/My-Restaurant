package com.example.shadr.myrestaurant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RestaurantsActivity extends AppCompatActivity {

    public String[] countries = {
            "Take away order",
            "Reserved order",
            "Delivery order"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_restaurants);

        ListView lvCountries = (ListView)findViewById(R.id.lvCountries);
        ArrayAdapter adapter= new ArrayAdapter(RestaurantsActivity.this, android.R.layout.simple_list_item_1, countries);

        lvCountries.setAdapter(adapter);
    }
}
