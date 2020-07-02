package br.com.local.apprecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class RecebeLivros_Activity extends AppCompatActivity {

    TextView txtTitulo, txtDescricao, txtCategoria;
    ImageView imgLivro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recebe_livros_layout);

        txtTitulo = findViewById(R.id.txtRecebeNomeLivro);
        txtDescricao = findViewById(R.id.txtRecebeDescricaoLivro);
        txtCategoria = findViewById(R.id.txtRecebeCategoriaLivro);
        imgLivro = findViewById(R.id.imgRecebeImagemLivro);

        Intent intent = getIntent();

        String titulo = intent.getExtras().getString("titulo");
        String descricao = intent.getExtras().getString("descricao");
        String categoria = intent.getExtras().getString("categoria");
        int imagemLivro = intent.getExtras().getInt("imagem");

        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        txtCategoria.setText(categoria);
        imgLivro.setImageResource(imagemLivro);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}