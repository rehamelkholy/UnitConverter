package com.example.android.unitconverter;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity {
    private TextView unitConverter;
    private Spinner fromSpinner, toSpinner;
    private Double number;
    private TextView result;
    private EditText submitted;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_category);

        unitConverter = findViewById(R.id.unit_category_text_view);
        unitConverter.setText(getResources().getString(R.string.length) + " " + getResources().getString(R.string.converter));
        unitConverter.setBackgroundColor(getResources().getColor(R.color.length));

        AdapterView.OnItemSelectedListener onSpinner = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        setSpinnerItems();
        fromSpinner.setOnItemSelectedListener(onSpinner);

        convertButton = findViewById(R.id.convert_button);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hide the keyboard when the convert button is pressed, credit goes to Stack Exchange post: /http://stackoverflow.com/questions/3400028/close-virtual-keyboard-on-button-press

                InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

                Converter converter = new Converter();

                submitted = (EditText) findViewById(R.id.quantity_edit);

                String numberString = submitted.getText().toString();

                if (numberString.equals("")){
                    number = 0.0;
                } else if (numberString.equals(".")){
                    number = 0.0;
                } else if(numberString.contains("..")){
                    number = 0.0;
                } else {
                    number = new Double(numberString);
                }

                result = findViewById(R.id.result);

                String fromUnit = fromSpinner.getSelectedItem().toString();
                String toUnit = toSpinner.getSelectedItem().toString();

                Double finalNumber = converter.lengthConvert(number, fromUnit, toUnit);

                String finalString = Double.toString(finalNumber);
                result.setText(finalString);            }
        });
    }


    public void setSpinnerItems(){
        fromSpinner = findViewById(R.id.from_spinner);
        toSpinner = findViewById(R.id.to_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.length_units, android.R.layout.simple_spinner_item);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);
    }
}
