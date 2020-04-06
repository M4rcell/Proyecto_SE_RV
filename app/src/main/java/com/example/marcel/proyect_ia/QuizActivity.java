package com.example.marcel.proyect_ia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    // atributos
     private int id_answers[]= { R.id.answer1,R.id.answer2,R.id.answer3};
     private int x1 =1;
     private int x2=0;
     private int x3=1;
     private int resp=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final
        TextView text_question1=(TextView) findViewById(R.id.text_question1);
        final CheckBox cb1 = (CheckBox) findViewById(R.id.answer1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.answer2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.answer3);
              Button   btn1 = (Button) findViewById(R.id.next1);
        text_question1.setText("¿ de que colores es el animal ?");

        //obteniendo los recursos del String
        String[] answers=getResources().getStringArray(R.array.answers);

        //bucle
       /* for (int i=0;i<id_answers.length;i++)
        {
            CheckBox cb=(CheckBox) findViewById(id_answers[i]);
            cb.setText(answers[i]);

        }/*/
       c

        resp=x1-3*x2+x3-1;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (cb1.isChecked()==true && cb3.isChecked()==true)
                {

                    Toast.makeText(QuizActivity.this, "Respuesta Correcta", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(QuizActivity.this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
