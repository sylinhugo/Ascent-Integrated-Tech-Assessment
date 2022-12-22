package com.example.full_stack_assessment.RecyclerView;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.full_stack_assessment.Data.Forecast.Forecast;
import com.example.full_stack_assessment.Data.Forecast.Period;
import com.example.full_stack_assessment.Data.Forecast.Weather;
import com.example.full_stack_assessment.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * The primary director of the recycler view
 * Examples: https://www.geeksforgeeks.org/android-recyclerview/
 */
public class RecyclerAdapter extends RecyclerView.Adapter<WeatherCardHolder> {
    Context context;
    List<Forecast> forecasts = new ArrayList<Forecast>();

    //Hashmap containing possible forecasts and their corresponding icons
    private HashMap<String, Integer> forecastMap = new HashMap<String, Integer>() {{
        put("Sunny", R.drawable.ic_sun);
        put("Rain", R.drawable.ic_rain);
        put("Partially Sunny", R.drawable.ic_part_cloud);
        put("Snow", R.drawable.ic_snow);
        put("Cloud", R.drawable.ic_cloud);
    }};

    public RecyclerAdapter(List<Forecast> forecasts, Context context) {
        this.forecasts = forecasts;
        this.context = context;
    }

    @NonNull
    @Override
    public WeatherCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View recyclerview = layoutInflater.inflate(R.layout.forecast_card, parent, false);
        WeatherCardHolder viewHolder = new WeatherCardHolder(recyclerview);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherCardHolder holder, int position) {
        final int index = holder.getAbsoluteAdapterPosition();

        // old code cannot work
        // holder.weatherIcon.setImageIcon(Icon.createWithContentUri(forecasts.get(position).weatherIcon));
        holder.weatherIcon.setImageResource(forecastMap.get(forecasts.get(position).weatherIcon));
        holder.timeOfDay.setText(forecasts.get(position).timeOfDay);
        holder.temperature.setText(forecasts.get(position).temperature);
    }

    @Override
    public int getItemCount() {
        return forecasts.size();
    }
}
