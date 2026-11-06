package com.example.tsdmh_7s5_p2evaluacion_dazc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ResultFragment extends Fragment {

    private static final String ARG_CATEGORIA = "categoria";

    public static ResultFragment newInstance(String categoria) {
        ResultFragment fragment = new ResultFragment();
        Bundle args = new Bundle();
        args.putString(ARG_CATEGORIA, categoria);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_result_fragment, container, false);
        TextView tvEstado = view.findViewById(R.id.tvEstadoSeleccion);
        TextView tvLista = view.findViewById(R.id.tvListaResultados);

        if (getArguments() != null && getArguments().containsKey(ARG_CATEGORIA)) {
            String categoria = getArguments().getString(ARG_CATEGORIA);
            tvEstado.setText("Mostrando Fragmento de la Selección...\nCategoría: " + categoria);

            // Muestra los productos detallados según la categoría
            tvLista.setText("• Bolígrafo Azul - $1.50\n" +
                    "• Cuaderno A4 - $4.00\n" +
                    "• Marcadores Color - $12.00\n" +
                    "• Marcadores A - $4.00\n" +
                    "• Cuaderno A#2 - $4.00\n" +
                    "• CuadernoBolígrafo Azul - $11.50");
        } else {
            tvEstado.setText("Mostrando Fragmento de la Selección...");
            tvLista.setText("Seleccione una categoría arriba para ver los elementos detallados.");
        }

        return view;
    }
}