package br.com.local.apprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Livro> listaLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaLivros = new ArrayList<>();

        listaLivros.add(new Livro("Como fazer amigos", "Guia clássico e definitivo para relacionar-se com as pessoas", "Auto Ajuda", R.drawable.amigos));
        listaLivros.add(new Livro("Você é ansioso", "Reflexões conta o medo", "Relacionamento", R.drawable.ansioso));
        listaLivros.add(new Livro("Branding mais Design", "A estratégia na criação de identidades de marca", "Merketing", R.drawable.branding));
        listaLivros.add(new Livro("Coaching e mentoring", "Construção de talentos", "Administração", R.drawable.coaching));
        listaLivros.add(new Livro("O dilema do porco espinho", "Como encarar a solidão", "Psicologia", R.drawable.dilema));
        listaLivros.add(new Livro("O poder do hábito", "Por que fazemos o que fazemos na vida e nos negócios", "Negócios", R.drawable.habito));
        listaLivros.add(new Livro("A mágica de pensar grande", "A força realizadora de pensamento construtivo", "Auto Ajuda", R.drawable.magica));
        listaLivros.add(new Livro("O milagre da manhã", "O segredo para transformar sua vida", "Auto Ajuda", R.drawable.milagre));
        listaLivros.add(new Livro("Mindset", "A nova psicologia do sucesso", "Desenvolvimento humano", R.drawable.mindset));
        listaLivros.add(new Livro("A sutil arte de ligar o  foda-se", "Uma estratégia inusitada para uma vida melhor", "Auto Ajuda", R.drawable.sutil));
        listaLivros.add(new Livro("Trabalhe 4 horas por semana", "Fuja da rotina, viva onde quiser e fique rico", "Auto Ajuda", R.drawable.trabalhe));
        listaLivros.add(new Livro("Mulheres que correm com os lobos", "Mitos e histórias do arquétipo da mulher selvagem", "Psicologia", R.drawable.mulheres));
        listaLivros.add(new Livro("Como fazer amigos", "Guia clássico e definitivo para relacionar-se com as pessoas", "Auto Ajuda", R.drawable.amigos));
        listaLivros.add(new Livro("Você é ansioso", "Reflexões conta o medo", "Relacionamento", R.drawable.ansioso));
        listaLivros.add(new Livro("Branding mais Design", "A estratégia na criação de identidades de marca", "Merketing", R.drawable.branding));
        listaLivros.add(new Livro("Coaching e mentoring", "Construção de talentos", "Administração", R.drawable.coaching));
        listaLivros.add(new Livro("O dilema do porco espinho", "Como encarar a solidão", "Psicologia", R.drawable.dilema));
        listaLivros.add(new Livro("O poder do hábito", "Por que fazemos o que fazemos na vida e nos negócios", "Negócios", R.drawable.habito));
        listaLivros.add(new Livro("A mágica de pensar grande", "A força realizadora de pensamento construtivo", "Auto Ajuda", R.drawable.magica));
        listaLivros.add(new Livro("O milagre da manhã", "O segredo para transformar sua vida", "Auto Ajuda", R.drawable.milagre));
        listaLivros.add(new Livro("Mindset", "A nova psicologia do sucesso", "Desenvolvimento humano", R.drawable.mindset));
        listaLivros.add(new Livro("A sutil arte de ligar o  foda-se", "Uma estratégia inusitada para uma vida melhor", "Auto Ajuda", R.drawable.sutil));
        listaLivros.add(new Livro("Trabalhe 4 horas por semana", "Fuja da rotina, viva onde quiser e fique rico", "Auto Ajuda", R.drawable.trabalhe));
        listaLivros.add(new Livro("Mulheres que correm com os lobos", "Mitos e histórias do arquétipo da mulher selvagem", "Psicologia", R.drawable.mulheres));


        RecyclerView recyclerView = findViewById(R.id.id_recyclerView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, listaLivros);
        //inserindo o recyclerView em um layout
        //recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        //Melhora a performance da lista
        recyclerView.setHasFixedSize(true);

        

        recyclerView.setAdapter(adapter);


    }
}