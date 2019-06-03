package com.example.practicano1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private Button Regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra(Activity2.EXTRA_NAME);
        String descripcion = intent.getStringExtra(Activity2.EXTRA_DESCRIPTION);

        TextView textView1 = (TextView) findViewById(R.id.textView6);
        TextView textView2 = (TextView) findViewById(R.id.textView4);

        textView1.setText(nombre);
        textView2.setText(descripcion);




        Regresar = (Button)findViewById(R.id.button4);

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                regresar();
            }
        });
    }

    private void regresar(){
        Intent intent2 = new Intent(this, Activity2.class);
        startActivity(intent2);
    }
}
