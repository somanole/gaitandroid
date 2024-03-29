package com.gaitproject.gait;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends Activity {

    public static final String URL = "restURL";
    private EditText restURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        restURL = (EditText) findViewById(R.id.editURL);

        Button myButton = (Button) findViewById(R.id.button_start);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(StartActivity.this, AccelerometerActivity.class);
                intent.putExtra(URL, restURL.getText().toString());
                startActivity(intent);
            }
        });
    }
}

