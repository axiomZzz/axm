package io.axm.a2pages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Game game;
    Button button1;
    Button button2;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();

        final int[] numbersId = {
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
        View.OnClickListener buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game.selectNUmber(v.getId());

                if (game.tempNumbA != null) {
                    button1 = findViewById(game.tempIdA);
                    button1.setText(game.tempNumbA);
                } else if (game.tempNumbB != null) {
                    button2 = findViewById(game.tempIdB);
                    button2.setText(game.tempNumbB);

                    handler.postDelayed(toasRunnable, 1000);

                }
            }
        };
        for (int i = 0; i < numbersId.length; i++) {
            findViewById(numbersId[i]).setOnClickListener(buttonListener);
        }
    }

    private Runnable toasRunnable = new Runnable() {
        @Override
        public void run() {
            if (game.flagA!=game.flagB) {

                button1.setText("");

                button2.setText("");


            } else {

                 button1.setEnabled(false);

                 button2.setEnabled(false);

            }
        }
    };
}
