package br.com.rafaelsousa.rafael_herculano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button botaoLogin = (Button) findViewById(R.id.botaoEntrar);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText campoUsuario = (EditText) findViewById(R.id.txtUsuario);
                String textoUsuario = campoUsuario.getText().toString();

                    Toast.makeText(MainActivity.this, "Seja bem vindo: " + textoUsuario, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, TelaInicial.class);
                    startActivity(intent);
                }



        });
    }


}
