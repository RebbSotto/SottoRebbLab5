package com.sotto.rebb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next=(Button)findViewById(R.id.firstButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                Intent i = new Intent(MainActivity.this, Activity2.class);
                startActivity(i);
            }
        });
    }

    public void open(View view) {

        if (view.getId() == R.id.map) {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:14.5869,120.9812"));
            Intent chooser = Intent.createChooser(intent, "Map");
            startActivity(chooser);
        }
    }
}
