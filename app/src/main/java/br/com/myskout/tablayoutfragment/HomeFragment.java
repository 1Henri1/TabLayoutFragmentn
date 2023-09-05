package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class HomeFragment extends Fragment {
    ListView lstAnimais;

    //Criar os dados
    String nomeAnimais[] = {"Panqueca", "Soneca", "Juma", "Ramela"};
    String descricaoAnimais[] = {
            "Quero ser adotado alguém ai se disponibiliza...",
            "Alguém gosta de gato, estou aqui...",
            "Gosto de humano, sou muito carinhoso...",
            "Estou disponível para ser adotado..."

    };
    String numAnimais[] = {"5.0", "8.0", "9.0", "9.5"};
    int imagemAnimais[] = {
            R.drawable.gato, R.drawable.ciames,
            R.drawable.rajado, R.drawable.preto_branco
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lstAnimais = view.findViewById(R.id.lstAnimais);

        //Instanciando a classe adaptadora
        AdapterAnimals adapterAnimals = new AdapterAnimals();


        //Carregar a lista com o adaptador
        lstAnimais.setAdapter(adapterAnimals);

        return view;
    }

    //Criando a minha classe adaptadora ou inner class
    public class AdapterAnimals extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemAnimais.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Declarando as variáveis do modelo
            TextView txtNomeGato, txtDescricaoGato, txtNumGato;
            ImageView imgGato;

            //Instanciar a janela do modelo no adapter
            View v = getLayoutInflater().inflate(R.layout.modelo_gatos,null);

            txtNomeGato = v.findViewById(R.id.txtNomeGato);
            txtDescricaoGato = v.findViewById(R.id.txtDescricaoGato);
            txtNumGato = v.findViewById(R.id.txtNumGato);
            imgGato = v.findViewById(R.id.imgModeloGato);

            //Inserindo valores nos objetos do modelo
            txtNomeGato.setText(nomeAnimais[i]);
            txtDescricaoGato.setText(descricaoAnimais[i]);
            txtNumGato.setText(numAnimais[i]);
            imgGato.setImageResource(imagemAnimais[i]);

            return v;
        }
    }
}