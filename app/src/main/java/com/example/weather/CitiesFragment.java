package com.example.weather;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CitiesFragment extends Fragment {
    Parcel currentParcel;
    private OnFragmentInteractionListener mListener;
    public static final String PARCEL = "parcel";
    private DataAdapter dataAdapter;
    private static final String CITY_TO_SEARCH = "CITY_TO_SEARCH";
    List<City> cityList = new ArrayList<>();
    EditText editText;
    Editable search;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cities_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.cities);
        dataAdapter = new DataAdapter(this, cityList);
        recyclerView.setAdapter(dataAdapter);
        ImageButton setCity = view.findViewById(R.id.search);
        setCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });
        return view;
    }

    interface OnFragmentInteractionListener {

        void onFragmentInteraction(String link);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }
    public void updateDetail() {

        String cityName = editText.getText().toString();
        mListener.onFragmentInteraction(cityName);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setInitialData();
    }

    private void setInitialData() {
        cityList.add(new City("Москва"));
        cityList.add(new City("Санкт-Петербург"));
        cityList.add(new City("Новосибирск"));
        cityList.add(new City("Сочи"));
        cityList.add(new City("Пермь"));
        cityList.add(new City("Чита"));
        cityList.add(new City("Тула"));
        cityList.add(new City("Владивосток"));
        cityList.add(new City("Хабаровск"));
        cityList.add(new City("Тверь"));
    }

}
