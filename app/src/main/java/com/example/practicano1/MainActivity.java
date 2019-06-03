package com.example.practicano1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button Clear;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.editText4);
        Password = (EditText)findViewById(R.id.editText5);
        Login = (Button)findViewById(R.id.button3);
        Clear = (Button)findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                validar(Name.getText().toString(), Password.getText().toString());
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Name.setText("");
                Password.setText("");
            }
        });
    }
    private void validar (String userName, String Password) {
        if (userName.equals("Admin") && Password.equals("1234")) {
            Intent intent2 = new Intent(this, Activity2.class);
            startActivity(intent2);
        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Hello toast!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, "Contraseña incorrecta", 5);
            toast.show();
        }
    }

}
