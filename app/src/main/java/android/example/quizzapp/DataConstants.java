package android.example.quizzapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DataConstants {


    public List<Question> getQuestions(){

        List<Question> myQuestions = new ArrayList<Question>();

        myQuestions.add(new Question(
                1,
                "¿Cuando fue aprobada la ley de protección de datos actual?",
                "13/12/1993",
                "24/12/1993",
                "5/12/2018",
                "5/10/2018",
                3));

        myQuestions.add(new Question(
                2,
                "¿Que significal las Siglas RGPD?",
                "Rogamos que Garanticen Por favor los Datos",
                "Reglamento Européo de Protección de Datos",
                "Regulación General de Protección de Datos",
                "Ninguna de las anteriores",
                2));


        myQuestions.add(new Question(
                3,
                "¿Cuál es la diferencia principal entre RGPD y LOPD?",
                "LOPD es de caracter nacional y RGPD es una regulación de carácter européo",
                "LOPD es de caracter européo y RGPD es una regulación de caracter nacional",
                "La RGPD no garantiza que se protejan los datos a menores y la LOPD sí",
                "La LOPD no garantiza que se protejan los datos a menores y la RGPD sí",
                1));

        myQuestions.add(new Question(
                4,
                "¿Cuál es la intención principal de la LOPD?",
                "Garantizar la integridad de los datos personales de personas físicas",
                "Evitar que las tecnologías de la información y la comunicación comprometan la seguridad y privacidad",
                "Regular el uso que haga un tercero que pida datos personales con los mismos",
                "Todas las anteriores son correctas",
                4));

        myQuestions.add(new Question(
                5,
                "Dentro de la LPI, categorizamos los derechos morales como...",
                "Aquellos que está feo saltarse por peso de conciencia",
                "Aquellos irrenunciables e inalienables que pretenden preservar la relación entre el autor y su obra",
                "Aquellos que no tienen un caracter relacionado a la distribucion de la obra",
                "Ninguna de las anteriores",
                2));

        myQuestions.add(new Question(
                6,
                "Un autor puede ceder sus derechos de explotación de su obra a terceros.",
                "Verdadero, siempre y cuando dicho tercero no este en prisión",
                "Falso, no se puede ceder los derechos de autor porque da lugar a plagios",
                "Falso, no existe tal cosa como los derechos de autor",
                "Verdadero, mediante un contrato entre dicho tercero y el autor",
                4));

        myQuestions.add(new Question(
                7,
                "¿Cuando fue aprobada la ley de propiedad intelectual actual?",
                "13/12/1996",
                "12/4/1996",
                "5/12/2018",
                "5/10/2018",
                3));

        myQuestions.add(new Question(
                8,
                "Los derechos de autor nacen...",
                "Crecen, se reproducen y mueren",
                "Cuando se concibe la obra, independientemente de si esta publicada o no",
                "Cuando el autor publica la obra",
                "El autor no tiene unos derechos especiales sobre su obra",
                2));


        return myQuestions;
    }
}
