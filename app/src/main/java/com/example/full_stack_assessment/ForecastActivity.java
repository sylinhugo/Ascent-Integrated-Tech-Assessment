package com.example.full_stack_assessment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.full_stack_assessment.Data.Forecast.Forecast;
import com.example.full_stack_assessment.Data.Forecast.Period;
import com.example.full_stack_assessment.Data.Forecast.Weather;
import com.example.full_stack_assessment.RecyclerView.RecyclerAdapter;
import com.example.full_stack_assessment.ViewModels.APIStatus;
import com.example.full_stack_assessment.ViewModels.ForecastViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * ForeCast activity manages the weather api and populates the resulting data
 * into a recycler view
 */
public class ForecastActivity extends AppCompatActivity {
    private TextView textView;

    //View model where all network calls are being preformed
    private ForecastViewModel forecastViewModel;

    //Hashmap containing possible forecasts and their corresponding icons
    private HashMap<String, Integer> forecastMap = new HashMap<String, Integer>() {{
        put("Sunny", R.drawable.ic_sun);
        put("Rain", R.drawable.ic_rain);
        put("Partially Sunny", R.drawable.ic_part_cloud);
        put("Snow", R.drawable.ic_snow);
        put("Cloud", R.drawable.ic_cloud);
    }};

    double latitude;
    double longtitude;
    List<Forecast> forecasts = new ArrayList<Forecast>();

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        recyclerView = findViewById(R.id.recycler_view_forecasts);
        textView = findViewById(R.id.forecast_textview);

        // just pass this data to ForecastViewModel, then we can use correct Latlng
        // but we don't need to use correct latitude and longtitude in this assessment...
        Intent it = getIntent();
        latitude = it.getDoubleExtra("latitude_res", 0.0);
        longtitude = it.getDoubleExtra("longtitude_res", 0.0);

        forecastViewModel = new ForecastViewModel();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                delay_work();
            }
        }, 3000);   //3 seconds
    }

    private void delay_work() {
        forecasts = forecastViewModel.forecasts;

        if (forecastViewModel.status.getValue() == APIStatus.ERROR)
            textView.setText("Network Problem! Can't get correct weather data");
        else textView.setText("The Forecast");

        Log.d("test", "forecastActivity: " + forecasts.size());

        //ToDo: Fetch the results from the viewModel and populate the recyclerView
        recyclerAdapter = new RecyclerAdapter(forecasts, getApplication());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void onCancel(View v) {
        finish();
    }

    private void goBack(View v) {
        finish();
    }
}