package com.example.calculadorat;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    RadioButton a45,a90,a180,sen,tan,cos;
    TextView result;
    TextView textr;
    ImageView rimagen;
    double resultado;

    @SuppressLint("SetTextI18n")
    protected void onCreate(    Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);


        a45=(RadioButton)findViewById(R.id.a45) ;
        a90=(RadioButton)findViewById(R.id.a90);
        a180=(RadioButton)findViewById(R.id.a180);
        sen=(RadioButton) findViewById(R.id.sin);
        cos=(RadioButton) findViewById(R.id.cos);
        tan=(RadioButton) findViewById(R.id.tan);
        textr=(TextView)findViewById(R.id.resultado);
        result=(TextView) findViewById(R.id.resultado);
        rimagen=(ImageView) findViewById(R.id.image);
/*
        if (savedInstanceState !=null){
                resultado=savedInstanceState.getDouble("resultado");
                result.setText(String.valueOf(resultado));
        }
*/
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onRadioButtonClicked(View view){
        boolean marcado = ((RadioButton) view).isChecked();


        switch (view.getId()) {
            case R.id.a45:
                rimagen.setImageResource(R.drawable.a45);
                if (marcado) {
                    if (cos.isChecked()) {
                        resultado = (Math.cos(45 * Math.PI / 180));
                        result.setText("" + resultado + "");
                    }
                    if (tan.isChecked()) {
                        resultado = (Math.round(Math.tan(45 * Math.PI / 180) * 100.0) / 100.0);
                        result.setText("" + resultado + "");
                    }
                    if (sen.isChecked()) {
                        resultado = (Math.sin(45 * Math.PI / 180) * 100.0 / 100.0);
                        result.setText("" + resultado + "");
                    }
                }
                break;

            case R.id.a90:
                rimagen.setImageResource(R.drawable.a90);
                if (marcado) {
                    if (cos.isChecked()) {
                        resultado = (Math.round(Math.cos(90 * Math.PI / 180) * 100.0 / 100.0));
                        result.setText("" + resultado + "");
                    }
                    if (tan.isChecked()) {
                        result.setText("Error, valor indeterminado");
                    }
                    if (sen.isChecked()) {
                        resultado = (Math.round(Math.sin(90 * Math.PI / 180) * 100.0 / 100.0));
                        result.setText("" + resultado + "");
                    }
                }
                break;
            case R.id.a180:
                rimagen.setImageResource(R.drawable.a180);
                if (marcado) {
                    if (cos.isChecked()) {
                        resultado = (Math.round(Math.cos(180 * Math.PI / 180) * 100.0 / 100.0));
                        result.setText("" + resultado + "");
                    }
                    if (tan.isChecked()) {
                        resultado = (Math.round(Math.tan(180 * Math.PI / 180) * 100.0 / 100.0));
                        result.setText("" + resultado + "");
                    }
                    if (sen.isChecked()) {
                        resultado = (Math.round(Math.sin(180 * Math.PI / 180) * 100.0 / 100.0));
                        result.setText("" + resultado + "");
                    }
                }
                break;
        }

    }
/*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putDouble("resultado",resultado);
        //outState.putParcelable("imagen",ima);
    }

 */
}
