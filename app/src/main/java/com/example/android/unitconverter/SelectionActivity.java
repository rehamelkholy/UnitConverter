package com.example.android.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void onAreaButtonClicked(View view){
        Intent intent = new Intent(this, AreaActivity.class);
        startActivity(intent);
    }

    public void onDataTransferRateButtonClicked(View view){
        Intent intent = new Intent(this, DataTransferRateActivity.class);
        startActivity(intent);
    }

    public void onDigitalStorageButtonClicked(View view){
        Intent intent = new Intent(this, DigitalStorageActivity.class);
        startActivity(intent);
    }

    public void onEnergyButtonClicked(View view){
        Intent intent = new Intent(this, EnergyActivity.class);
        startActivity(intent);
    }

    public void onFrequencyButtonClicked(View view){
        Intent intent = new Intent(this, FrequencyActivity.class);
        startActivity(intent);
    }

    public void onFuelEconomyButtonClicked(View view){
        Intent intent = new Intent(this, FuelEconomyActivity.class);
        startActivity(intent);
    }

    public void onLengthButtonClicked(View view){
        Intent intent = new Intent(this, LengthActivity.class);
        startActivity(intent);
    }

    public void onMassButtonClicked(View view){
        Intent intent = new Intent(this, MassActivity.class);
        startActivity(intent);
    }

    public void onPlaneAngleButtonClicked(View view){
        Intent intent = new Intent(this, PlaneAngleActivity.class);
        startActivity(intent);
    }

    public void onPressureButtonClicked(View view){
        Intent intent = new Intent(this, PressureActivity.class);
        startActivity(intent);
    }

    public void onSpeedButtonClicked(View view){
        Intent intent = new Intent(this, SpeedActivity.class);
        startActivity(intent);
    }

    public void onTemperatureButtonClicked(View view){
        Intent intent = new Intent(this, TemperatureActivity.class);
        startActivity(intent);
    }

    public void onTimeButtonClicked(View view){
        Intent intent = new Intent(this, TimeActivity.class);
        startActivity(intent);
    }

    public void onVolumeButtonClicked(View view){
        Intent intent = new Intent(this, VolumeActivity.class);
        startActivity(intent);
    }
}
