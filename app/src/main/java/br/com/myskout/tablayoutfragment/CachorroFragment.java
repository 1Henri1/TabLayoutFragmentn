package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class CachorroFragment extends Fragment {

    ListView lstDogs;

    String nomeDogs[] = {""};

    String descDogs[] = {""};

    String numDogs[] = {""};

    int imgdog[] = {};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cachorro, container, false);

        lstDogs = view.findViewById(R.id.idRecylcerViewCachorro);




        return view;
    }
}