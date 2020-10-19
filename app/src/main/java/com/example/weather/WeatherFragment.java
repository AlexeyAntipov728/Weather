package com.example.weather;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class WeatherFragment extends Fragment {
    boolean isEmptySpace;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.weather_fragment, container, false);
        Button searchTown = view.findViewById(R.id.button);
        searchTown.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    getFragmentManager().beginTransaction().add(R.id.mainContainer, new CitiesFragment()).addToBackStack(null).commit();
// тут я пробовал добавить в лейаут mainactivity айди android:id="@+id/mainContainer" мне казалось это здравая идея, ведь тогда я как бы в данном мооменте говорю куда собственно добавлять новый фрагмент, но идея не сработала и кроме того это действие(добавить айди) привело к тому, что переставало работать отображение 2х фрагментов при лендскейп ориентации.
                }
        });

        return view;
    }


    public void setText(String item) {
        TextView view = (TextView) getView().findViewById(R.id.city);
        view.setText(item);
    }

}
