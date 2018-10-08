package com.sotto.rebb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button prev=(Button)findViewById(R.id.secondButton);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Activity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    /*
public void open(View view) {

Intent intent=null, chooser=null;

if(view.getId()==R.id.map)
}

*/
}
