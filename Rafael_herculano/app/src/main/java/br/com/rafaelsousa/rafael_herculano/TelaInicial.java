package br.com.rafaelsousa.rafael_herculano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TelaInicial extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.action_atualizar){
            Toast.makeText(TelaInicial.this, "Atualizar", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_buscar){
            Toast.makeText(TelaInicial.this, "Buscar", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_adicionar){
            Toast.makeText(TelaInicial.this, "Adicionar", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_config){
            Toast.makeText(TelaInicial.this, "Configurações", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_share){
            Toast.makeText(TelaInicial.this, "Compartilhar", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
