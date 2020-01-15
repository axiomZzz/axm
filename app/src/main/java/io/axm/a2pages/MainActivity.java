package io.axm.a2pages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Game game;
    Button button;
    Timer timer=new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game=new Game();

        final int [] numbersId={
                R.id.Button1,
                R.id.Button2,
                R.id.Button3,
                R.id.Button4,
                R.id.Button5,
                R.id.Button6,
                R.id.Button7,
                R.id.Button8,
                R.id.Button9,
                R.id.Button10,
                R.id.Button11,
                R.id.Button12,
                R.id.Button13,
                R.id.Button14,
                R.id.Button15,
                R.id.Button16,
        };
        View.OnClickListener buttonListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    game.selectNUmber(v.getId());

                    if (game.tempNumb2 == null) {

                        button = findViewById(game.tempId);
                        button.setText(game.tempNumb);
                    } else if (game.tempNumb2 != null) {

                        button = findViewById(game.tempId2);
                        button.setText(game.tempNumb2);

                        if(game.tempNumb==game.tempNumb2){
                           // game.tempNumb=null;

                        }
                        else{
                            button = findViewById(game.tempId);
                            button.setText("X");

                            game.tempNumb=game.tempNumb2;
                            game.tempId=game.tempId2;

                        }


                        /*timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                try {
                                    if (game.tempNumb != game.tempNumb2) {


                                        button = findViewById(game.tempId);
                                        button.setText("X");

                                        button = findViewById(game.tempId2);
                                        button.setText("X");
                                    }
                                } catch (Exception e){

                                }

                            }
                        },1000);*/


                    }


            }
        };
        for (int i = 0; i <numbersId.length ; i++) {
            findViewById(numbersId[i]).setOnClickListener(buttonListener);

        }


    }
}
