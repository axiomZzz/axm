package io.axm.a2pages;

import android.view.View;
import android.widget.Button;

public class Game {
    int[] gamePole={1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
    private final int ELEMENTSPOLE=16;
    public int tempIdA;
    public String tempNumbA;
    public int tempIdB;
    public String tempNumbB;
    int  flagA;
    int flagB;


    public void selectNUmber( int idButton){
        switch (idButton){
            case R.id.Button1:proverka(gamePole[0],R.id.Button1);break;
            case R.id.Button2:proverka(gamePole[1],R.id.Button2);break;
            case R.id.Button3:proverka(gamePole[2],R.id.Button3);break;
            case R.id.Button4:proverka(gamePole[3],R.id.Button4);break;
            case R.id.Button5:proverka(gamePole[4],R.id.Button5);break;
            case R.id.Button6:proverka(gamePole[5],R.id.Button6);break;
            case R.id.Button7:proverka(gamePole[6],R.id.Button7);break;
            case R.id.Button8:proverka(gamePole[7],R.id.Button8);break;
            case R.id.Button9:proverka(gamePole[8],R.id.Button9);break;
            case R.id.Button10:proverka(gamePole[9],R.id.Button10);break;
            case R.id.Button11:proverka(gamePole[10],R.id.Button11);break;
            case R.id.Button12:proverka(gamePole[11],R.id.Button12);break;
            case R.id.Button13:proverka(gamePole[12],R.id.Button13);break;
            case R.id.Button14:proverka(gamePole[13],R.id.Button14);break;
            case R.id.Button15:proverka(gamePole[14],R.id.Button15);break;
            case R.id.Button16:proverka(gamePole[15],R.id.Button16);break;

        }

    }
    public void proverka(int chislo,int idButton){
        if (tempNumbA==null){
        flagA=chislo;
        tempIdA=idButton;
        tempNumbA=Integer.toString(chislo);
        } else{
            flagB=chislo;
            tempIdB=idButton;
            tempNumbB=Integer.toString(chislo);

            tempNumbA=null;
        }





    }
}
