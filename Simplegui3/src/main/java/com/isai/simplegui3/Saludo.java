package com.isai.simplegui3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by isai on 12/11/13.
 */
public class Saludo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        TextView saludo = (TextView)findViewById(R.id.lblSaludo);

        Bundle paquete = this.getIntent().getExtras();

        saludo.setText("Hola "+paquete.getString("nombre"));
    }
}
