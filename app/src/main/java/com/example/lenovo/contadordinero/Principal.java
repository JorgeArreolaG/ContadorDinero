package com.example.lenovo.contadordinero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Declaracion de componentes
        final EditText et1000 = (EditText)findViewById(R.id.et1000);
        final EditText et500 = (EditText)findViewById(R.id.et500);
        final EditText et200 = (EditText)findViewById(R.id.et200);
        final EditText etTotal = (EditText)findViewById(R.id.etTotal);

        final TextView lbl1000 = (TextView)findViewById(R.id.lbl1000);
        final TextView lbl500 = (TextView)findViewById(R.id.lbl500);
        final TextView lbl200 = (TextView)findViewById(R.id.lbl200);


        //Asignacion de valor por default
        lbl1000.setText("0");
        lbl500.setText("0");
        lbl200.setText("0");

        et1000.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                //Declaro variable
                double valor_1000, mul_1000;

                if(et1000.getText().toString().trim().equals("")){

                    lbl1000.setText("0");

                    //realizo suma del total
                    Double t1000 = Double.parseDouble(lbl1000.getText().toString());
                    Double t500 = Double.parseDouble(lbl500.getText().toString());
                    Double t200 = Double.parseDouble(lbl200.getText().toString());

                    Double suma = t1000 + t500 +t200;

                    String resultado = String.valueOf(suma);

                    etTotal.setText(resultado);

                }else{

                    //Convierto
                    valor_1000 = Integer.parseInt(et1000.getText().toString());
                    //Multiplico el numero ingresado * 1000
                    mul_1000 = valor_1000 * 1000.0;
                    lbl1000.setText(""+mul_1000);

                    //realizo suma del total
                    Double t1000 = Double.parseDouble(lbl1000.getText().toString());
                    Double t500 = Double.parseDouble(lbl500.getText().toString());
                    Double t200 = Double.parseDouble(lbl200.getText().toString());

                    Double suma = t1000 + t500 + t200;

                    String resultado = String.valueOf(suma);

                    etTotal.setText(resultado);


                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        et500.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                //Declaro variable
                double valor_500, mul_500;

                if(et500.getText().toString().trim().equals("")){

                    lbl500.setText("0");

                    //realizo suma del total
                    Double t1000 = Double.parseDouble(lbl1000.getText().toString());
                    Double t500 = Double.parseDouble(lbl500.getText().toString());
                    Double t200 = Double.parseDouble(lbl200.getText().toString());

                    Double suma = t1000 + t500 +t200;

                    String resultado = String.valueOf(suma);

                    etTotal.setText(resultado);

                }else{

                    //Convierto
                    valor_500 = Integer.parseInt(et500.getText().toString());
                    //Multiplico el numero ingresado * 1000
                    mul_500 = valor_500 * 500.0;
                    lbl500.setText(""+mul_500);

                    //realizo suma del total
                    Double t1000 = Double.parseDouble(lbl1000.getText().toString());
                    Double t500 = Double.parseDouble(lbl500.getText().toString());
                    Double t200 = Double.parseDouble(lbl200.getText().toString());

                    Double suma = t1000 + t500 +t200;

                    String resultado = String.valueOf(suma);

                    etTotal.setText(resultado);

            }}

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        et200.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                //Declaro variable
                double valor_200, mul_200;

                if(et200.getText().toString().trim().equals("")){

                    lbl200.setText("0");

                    //realizo suma del total
                    Double t1000 = Double.parseDouble(lbl1000.getText().toString());
                    Double t500 = Double.parseDouble(lbl500.getText().toString());
                    Double t200 = Double.parseDouble(lbl200.getText().toString());


                    Double suma = t1000 + t500 + t200;

                    String resultado = String.valueOf(suma);

                    etTotal.setText(resultado);

                }else{

                    //Convierto
                    valor_200 = Integer.parseInt(et200.getText().toString());
                    //Multiplico el numero ingresado * 1000
                    mul_200 = valor_200 * 200.0;
                    lbl200.setText(""+mul_200);

                    //realizo suma del total
                    Double t1000 = Double.parseDouble(lbl1000.getText().toString());
                    Double t500 = Double.parseDouble(lbl500.getText().toString());
                    Double t200 = Double.parseDouble(lbl200.getText().toString());

                    Double suma = t1000 + t500 + t200;

                    String resultado = String.valueOf(suma);

                    etTotal.setText(resultado);

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void ejecutar_quienes_somos (View view){
        Intent intent=new Intent (this, Quienes_somos.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu) {

        int id = opcion_menu.getItemId();

        if (id == R.id.quienes_somos){
            ejecutar_quienes_somos(null);
        }

        if (id == R.id.mas_app){
            return  true;
        }

        if (id == R.id.compartir){
            return  true;
        }

        if (id == R.id.valorar){
            return  true;
        }

        return super.onOptionsItemSelected(opcion_menu);
    }
}

