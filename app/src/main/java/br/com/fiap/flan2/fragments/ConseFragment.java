package br.com.fiap.flan2.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import br.com.fiap.flan2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConseFragment extends Fragment {


    public ConseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conse, container, false);
    }

}
