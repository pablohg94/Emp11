package com.example.pablo.emp11;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment{

    //Conjunto de variables necesarias para la ejecucion del programa
    private Button boton;

    //Metodo para la creacion de la vista
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.main_fragment,container,false);

        //Asingamos las variables a los elementos del layout
        boton = (Button)view.findViewById(R.id.boton);

        //Asignamos un listener al boton del mapa
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),MapaActivity.class);
                startActivity(i);
                getActivity().finish();
            }
        });

        return view;
    }
}
