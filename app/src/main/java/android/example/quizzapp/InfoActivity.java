package android.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView cuerpoLpi = findViewById(R.id.cuerpo_lpi);
        String resource ="La ley de Propiedad intelectual (LPI) es una ley que recoge derechos y privilegios que obtiene un autor en el momento de crear una obra, sin necesidad de registrarla en la Propiedad intelectual.\n" +
                "Distinguimos entre los siguientes tipos de derechos:\n" +
                "1. Derechos morales: Aquellos que permiten al autor decidir sobre si se reconocerá su autoría, bajo que medio se divulgará, etc. Este tipo de derecho se caracteriza principalmente por ser irrenunciable e inalienable.\n" +
                "2.Derechos de explotación: Aquello que permiten al autor decidir sobre la explotación de la obra. Estos si pueden ser cedidos a terceros bajo un contrato e incluso puede venderlos. Sin embargo, a pesar de vender estos derechos, los derechos morales los conserva el autor.\n" +
                "3.Otros derechos, como el derecho de participar.";
        cuerpoLpi.setText(resource);

        TextView cuerpoLpo = findViewById(R.id.cuerpo_lopd);
        resource = "\tLa ley de proteción de datos persigue preservar el derecho reconocido como derecho fundamental a la privacidad e intimidad personal y familiar. La actual ley de protección de datos entró en vigor el día 5 de diciembre de 2018. Gracias a esta ley, se sigue una serie de normal no por cumplimiento legal sino por que se entiende que la información es de los activos más importante de nuestras vidas y por lo tanto hay que protegerlo con mucho cuidado.\n" +
                "\tPor otro lado, la ley de protección de datos está limitada por las pautas dadas por la RGPD (Reglamento européo de Protección de Datos). Se diferencia principalmente en que esta es de carácter europeo y marca la mayor parte de las reglas que debemos seguir, y deja a otros paises decididir sobre temas como su mayoría de edad para ciertos actos y situaciones. \n";
        cuerpoLpo.setText(resource);

        Button back = findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}