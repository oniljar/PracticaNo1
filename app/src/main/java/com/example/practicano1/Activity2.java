package com.example.practicano1;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Activity2 extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.example.application.example.EXTRA_NAME";
    public static final String EXTRA_DESCRIPTION = "com.example.application.example.EXTRA_DESCRIPTION";
    public static final Integer EXTRA_PICTURE = 0;

    ListView listView;
    String[] mTitle = {"Domingo", "Onil", "Eva", "Jose", "Tahiri", "Maria", "Luis"};
    String[] mDescription = {"01/05/1990", "31/12/1996", "16/04/1997", "26/08/1995", "30/03/1996", "12/12/1994", "06/08/1993"};
    int images[] = {R.drawable.domingo, R.drawable.domingo, R.drawable.domingo, R.drawable.domingo, R.drawable.domingo, R.drawable.domingo, R.drawable.domingo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    String nombre = mTitle[0];
                    String descripcion = mDescription[0];
                    Integer picture = images[0];
                    Intent myIntent = new Intent(view.getContext(), Activity3.class);
                    myIntent.putExtra(EXTRA_NAME, nombre);
                    myIntent.putExtra(EXTRA_DESCRIPTION, descripcion);

                    startActivityForResult(myIntent, 0);
                }
                if (position == 1){
                    String nombre = mTitle[1];
                    String descripcion = mDescription[1];
                    Intent myIntent = new Intent(view.getContext(), Activity3.class);
                    myIntent.putExtra(EXTRA_NAME, nombre);
                    myIntent.putExtra(EXTRA_DESCRIPTION, descripcion);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2){
                    String nombre = mTitle[2];
                    String descripcion = mDescription[2];
                    Intent myIntent = new Intent(view.getContext(), Activity3.class);
                    myIntent.putExtra(EXTRA_NAME, nombre);
                    myIntent.putExtra(EXTRA_DESCRIPTION, descripcion);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3){
                    String nombre = mTitle[3];
                    String descripcion = mDescription[3];
                    Intent myIntent = new Intent(view.getContext(), Activity3.class);
                    myIntent.putExtra(EXTRA_NAME, nombre);
                    myIntent.putExtra(EXTRA_DESCRIPTION, descripcion);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4){
                    String nombre = mTitle[4];
                    String descripcion = mDescription[4];
                    Intent myIntent = new Intent(view.getContext(), Activity3.class);
                    myIntent.putExtra(EXTRA_NAME, nombre);
                    myIntent.putExtra(EXTRA_DESCRIPTION, descripcion);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5){
                    String nombre = mTitle[5];
                    String descripcion = mDescription[5];
                    Intent myIntent = new Intent(view.getContext(), Activity3.class);
                    myIntent.putExtra(EXTRA_NAME, nombre);
                    myIntent.putExtra(EXTRA_DESCRIPTION, descripcion);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6){
                    String nombre = mTitle[6];
                    String descripcion = mDescription[6];
                    Intent myIntent = new Intent(view.getContext(), Activity3.class);
                    myIntent.putExtra(EXTRA_NAME, nombre);
                    myIntent.putExtra(EXTRA_DESCRIPTION, descripcion);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);


            // Set our resorvers on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}