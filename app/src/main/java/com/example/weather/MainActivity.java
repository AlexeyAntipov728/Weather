package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.weather.R.id.weather_fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

//    @Override
//    public void onFragmentInteraction(String link) {
//        WeatherFragment wf = new WeatherFragment();
//         getFragmentManager()
//                .findFragmentById(weather_fragment);
//        if (wf != null && wf.isInLayout()) {
//            wf.setText(link);
//        }
//    }
//    implements CitiesFragment.OnFragmentInteractionListener
}