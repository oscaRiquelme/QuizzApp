package android.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class FinalActivity extends AppCompatActivity {

    List<Question> data = new DataConstants().getQuestions();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        int aciertos = 0;

        if(getIntent().getIntArrayExtra("opciones") != null) {
            int[] opciones = getIntent().getIntArrayExtra("opciones");

            for(int i = 0; i < data.size(); i++){
                    if(opciones[i] == data.get(i).opCorrecta) aciertos++;
                }
            }
        TextView aciertosTv = findViewById(R.id.aciertoTv);
        TextView complementoTv = findViewById(R.id.complementTv);
        Button fin = findViewById(R.id.finButton);

        String resultado = "Has acertado "+ aciertos +" de " + data.size() + " preguntas";
        aciertosTv.setText(resultado);

        if(aciertos < 4){
            resultado = "Bueno no está tan mal, probablemente no hayas leido las preguntas lo suficiente...";
        }
        else if(aciertos > 4 && aciertos < 7){
            resultado = "Como decimos en la universidad, un 5 son 6 créditos, ¿Para qué más?";
        }
        else{
            resultado ="¡Enhoerabuena!, eres una máquina, un fuera de serie, un monstruo, algo genial... Que no se tuba a la cabeza tampoco eh";
        }
        complementoTv.setText(resultado);

        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        }

    }