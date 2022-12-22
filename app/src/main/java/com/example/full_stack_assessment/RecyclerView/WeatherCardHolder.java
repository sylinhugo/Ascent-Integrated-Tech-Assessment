package com.example.full_stack_assessment.RecyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.full_stack_assessment.R;

public class WeatherCardHolder extends RecyclerView.ViewHolder {
    ImageView weatherIcon;
    TextView timeOfDay;
    TextView temperature;

    public WeatherCardHolder(@NonNull View itemView) {
        super(itemView);
        weatherIcon = (ImageView) itemView.findViewById(R.id.image_view_weather);
        timeOfDay = (TextView) itemView.findViewById(R.id.text_view_time);
        temperature = (TextView) itemView.findViewById(R.id.text_view_degree);
    }
}
