package com.example.weather;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WeatherFragment extends Fragment {
    Button searchTown;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.weather_fragment, container, false);
        searchTown = (Button)view.findViewById(R.id.openCities);
        searchTown.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                getFragmentManager().beginTransaction().replace(R.id.mainContainer, new CitiesFragment()).addToBackStack(null).commit();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new CitiesFragment()).commit();
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        searchTown = view.findViewById(R.id.openCities);
        searchTown.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.weather_fragment, new CitiesFragment()).commit();

            }
        });
    }
}
