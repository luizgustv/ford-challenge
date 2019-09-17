package br.com.fiap.flan2.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.bcsg.mytestapplication.R;

import java.util.ArrayList;

import br.com.fiap.flan2.activity.MainActivity;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String[] cars = new String[]{"Fusion", "Ford Ka", "Ecosport"};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < cars.length; i++) {
            list.add(cars[i]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cars);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString() == "Ecosport"){
                    Intent intenrt = new Intent(view.getContext(), MainActivity.class);
                    startActivity(intenrt);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}

