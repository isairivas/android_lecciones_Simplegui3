package com.isai.simplegui3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        final Button btnSaludar = (Button)findViewById(R.id.btnSaludar);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conect = new Intent(MainActivity.this,Saludo.class);
                Bundle paquete = new Bundle();
                paquete.putString("nombre",txtNombre.getText().toString());
                conect.putExtras(paquete);
                startActivity(conect);
            }
        });
    }

}
