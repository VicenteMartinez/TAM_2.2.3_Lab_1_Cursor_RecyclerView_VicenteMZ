package mx.edu.ittepic.tam_laboratorio_3_recyclerview_vicentemz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fuente> Lista = new ArrayList<Fuente>();
        Lista.add(new Fuente("Rock","Rock chido","Comprar",R.drawable.perfil,-16777216));
        Lista.add(new Fuente("Funk","Musica funk","Comprar",R.drawable.perfil,17170443));
        Lista.add(new Fuente("Regueton","Regueteando ando","Comprar",R.drawable.perfil,-7829369));
        Lista.add(new Fuente("Corridos","Corridos de los mejores grupos","Comprar",R.drawable.perfil,-16776961));
        Lista.add(new Fuente("Rock","Rock chido","Comprar",R.drawable.perfil,-16777216));
        Lista.add(new Fuente("Funk","Musica funk","Comprar",R.drawable.perfil,17170443));
        Lista.add(new Fuente("Regueton","Regueteando ando","Comprar",R.drawable.perfil,-7829369));
        Lista.add(new Fuente("Corridos","Corridos de los mejores grupos","Comprar",R.drawable.perfil,-16776961));
        RecyclerView contenedor = findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);

        contenedor.setAdapter(new Adaptador(Lista));
        contenedor.setLayoutManager(layout);

    }
}
