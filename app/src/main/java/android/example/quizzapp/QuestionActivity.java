package android.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.sax.StartElementListener;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    List<Question> data = new DataConstants().getQuestions();
    int[] opciones = new int[data.size()];
    int contador = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        int questionsNum = data.size();

        for(int i = 0; i < questionsNum; i++){
            opciones[i] = 0;
        }

        /*Setea los on click listeners de todas las opciones*/

        Button op1 = findViewById(R.id.opcion1);
        Button op2 = findViewById(R.id.opcion2);
        Button op3 = findViewById(R.id.opcion3);
        Button op4 = findViewById(R.id.opcion4);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opciones[contador] = 1;
                colorChosenOption(contador);
                Log.i("no se", "botton 1 pulsao " + contador );
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opciones[contador] = 2;
                colorChosenOption(contador);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opciones[contador] = 3;
                colorChosenOption(contador);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opciones[contador] = 4;
                colorChosenOption(contador);
            }
        });


        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(data.size());
        progressBar.setProgress(1);

        showNextQuestion(contador);

        Button next = findViewById(R.id.next);
        Button prev = findViewById(R.id.previous);

        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(contador <= data.size()) contador++;
                showNextQuestion(contador);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contador >= 0) contador --;
                showNextQuestion(contador);
            }
        });




    }

    void showNextQuestion(int contador){

        Button op1 = findViewById(R.id.opcion1);
        Button op2 = findViewById(R.id.opcion2);
        Button op3 = findViewById(R.id.opcion3);
        Button op4 = findViewById(R.id.opcion4);

        TextView question = findViewById(R.id.Pregunta);
        TextView progressText = findViewById(R.id.textProgress);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        ImageView image = findViewById(R.id.ImagenTema);

        if(contador == data.size()){
            Intent intent = new Intent(getApplicationContext(), FinalActivity.class);
            intent.putExtra("opciones", opciones);
            startActivity(intent);
            finish();
        }
        else if(contador < 0){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
        else{


            question.setText(data.get(contador).pregunta);
            op1.setText(data.get(contador).op1);
            op2.setText(data.get(contador).op2);
            op3.setText(data.get(contador).op3);
            op4.setText(data.get(contador).op4);

            if(contador >= data.size()/2 ){
                image.setImageResource(R.drawable.lpi);
            }
            else{
                image.setImageResource(R.drawable.lopd);
            }

            progressBar.setProgress(contador);
            progressText.setText( (contador+1) + " de " + data.size());

            colorChosenOption(contador);


        }


    }



    void colorChosenOption(int contador){

        Button op1 = findViewById(R.id.opcion1);
        Button op2 = findViewById(R.id.opcion2);
        Button op3 = findViewById(R.id.opcion3);
        Button op4 = findViewById(R.id.opcion4);

        switch(opciones[contador]){
            case 0:
                op1.setTextColor(getResources().getColor(R.color.grey));
                op1.setTypeface(null, Typeface.NORMAL);
                op2.setTextColor(getResources().getColor(R.color.grey));
                op2.setTypeface(null, Typeface.NORMAL);
                op3.setTextColor(getResources().getColor(R.color.grey));
                op3.setTypeface(null, Typeface.NORMAL);
                op4.setTextColor(getResources().getColor(R.color.grey));
                op4.setTypeface(null, Typeface.NORMAL);
                break;
            case 1:
                op1.setTextColor(getResources().getColor(R.color.black));
                op1.setTypeface(null, Typeface.BOLD);
                op2.setTextColor(getResources().getColor(R.color.grey));
                op2.setTypeface(null, Typeface.NORMAL);
                op3.setTextColor(getResources().getColor(R.color.grey));
                op3.setTypeface(null, Typeface.NORMAL);
                op4.setTextColor(getResources().getColor(R.color.grey));
                op4.setTypeface(null, Typeface.NORMAL);
                break;
            case 2:
                op2.setTextColor(getResources().getColor(R.color.black));
                op2.setTypeface(null, Typeface.BOLD);
                op1.setTextColor(getResources().getColor(R.color.grey));
                op1.setTypeface(null, Typeface.NORMAL);
                op3.setTextColor(getResources().getColor(R.color.grey));
                op3.setTypeface(null, Typeface.NORMAL);
                op4.setTextColor(getResources().getColor(R.color.grey));
                op4.setTypeface(null, Typeface.NORMAL);
                break;
            case 3:
                op3.setTextColor(getResources().getColor(R.color.black));
                op3.setTypeface(null, Typeface.BOLD);
                op2.setTextColor(getResources().getColor(R.color.grey));
                op2.setTypeface(null, Typeface.NORMAL);
                op1.setTextColor(getResources().getColor(R.color.grey));
                op1.setTypeface(null, Typeface.NORMAL);
                op4.setTextColor(getResources().getColor(R.color.grey));
                op4.setTypeface(null, Typeface.NORMAL);
                break;
            case 4:
                op4.setTextColor(getResources().getColor(R.color.black));
                op4.setTypeface(null, Typeface.BOLD);
                op2.setTextColor(getResources().getColor(R.color.grey));
                op2.setTypeface(null, Typeface.NORMAL);
                op3.setTextColor(getResources().getColor(R.color.grey));
                op3.setTypeface(null, Typeface.NORMAL);
                op1.setTextColor(getResources().getColor(R.color.grey));
                op1.setTypeface(null, Typeface.NORMAL);
                break;
        }

    }


}
