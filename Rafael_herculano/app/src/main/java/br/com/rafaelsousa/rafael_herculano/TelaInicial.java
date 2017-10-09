package br.com.rafaelsousa.rafael_herculano;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TelaInicial extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem item = menu.findItem(R.id.action_buscar);

        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(onSearch());


        MenuItem shareItem = menu.findItem(R.id.action_share);
        ShareActionProvider share = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);


        share.setShareIntent(getDefautIntent());

        return true;
    }

    private Intent getDefautIntent() {
        // Intent ACTION_SEND. Qualquer app que responde essa intenção pode ser chamado
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        String textoShare = "Minha Lista de cervejas! \n";


        intent.putExtra(Intent.EXTRA_TEXT, textoShare);
        return intent;
    }


        //metodo onsearch
        private SearchView.OnQueryTextListener onSearch() {
            return new SearchView.OnQueryTextListener() {
                @Override

                public boolean onQueryTextSubmit(String query) {
                    query = query.toLowerCase();
                    Toast.makeText(TelaInicial.this, query, Toast.LENGTH_SHORT).show();
                    String results = "";

                    TextView texto = (TextView) findViewById(R.id.textoInicial);
                    texto.setText(results);
                    return false;
                }

                @Override

                public boolean onQueryTextChange(String newText) {
                    Toast.makeText(TelaInicial.this, newText, Toast.LENGTH_SHORT).show();
                    return false;
                }
            };
        }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        EditText campoUsuario = (EditText) findViewById(R.id.txtUsuario);
        String textoUsuario = campoUsuario.getText().toString();

        if (id == R.id.action_atualizar) {

            Toast.makeText(TelaInicial.this, "Atualizar", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.action_buscar) {
            Toast.makeText(TelaInicial.this, "Buscar", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.action_adicionar) {
            Toast.makeText(TelaInicial.this, "Adicionar", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.action_config) {
            Toast.makeText(TelaInicial.this, "Configurações", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.action_share) {
            Toast.makeText(TelaInicial.this, "Compartilhar", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }




}
