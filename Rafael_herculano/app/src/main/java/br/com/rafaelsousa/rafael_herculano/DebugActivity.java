package br.com.rafaelsousa.rafael_herculano;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Cliente on 07/10/2017.
 */

public class DebugActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceStated) {
        super.onCreate(savedInstanceStated);
    }

    protected void onStart() {
        super.onStart();
        Log.i("APP", getClassName() + ".onStart() chamado");
    }

    protected void onResume() {
        super.onResume();
        Log.i("Rafael Herculano", getClassName() + " .onResume() chamado");

    }

    protected void onPause() {
        super.onPause();
        Log.i("Rafael Herculano", getClassName() + " .onPause() chamado");

    }

    protected void onStop() {
        super.onStop();
        Log.i("Rafael Herculano", getClassName() + " .onStop() chamado");

    }

    protected void onRestart() {
        super.onRestart();
        Log.i("Rafael Herculano", getClassName() + " .onRestart() chamado");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("Rafael Herculano", getClassName() + " .onDestroy() chamado");
    }


    private String getClassName() {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }


}
