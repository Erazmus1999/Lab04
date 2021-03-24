package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int counter = 0;
    String[][] table_X_O = {
            {"1 ","2 ","3 "},
            {"4 ","5 ","6 "},
            {"7 ","8 ","9 "}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Button_1(View view){

        TextView text=(TextView)findViewById(R.id.button1_1);
        Button btn = (Button) findViewById(R.id.button1_1);
        if((counter % 2) == 0)
        {
            text.setText("X");
            table_X_O[0][0]="X";
            counter=counter+1;
        }

        else
        {
            text.setText("O");
            table_X_O[0][0]="O";
            counter=counter+1;
        }
        btn.setEnabled(false);
        game_over();
    }
    public void Button_2(View view){

        TextView text=(TextView)findViewById(R.id.button1_2);
        Button btn = (Button) findViewById(R.id.button1_2);
        if(counter%2==0)
        {
            text.setText("X");
            table_X_O[0][1]="X";
            counter++;
        }
        else
        {
            text.setText("O");
            table_X_O[0][1]="O";
            counter++;
        }
        btn.setEnabled(false);
        game_over();
    }

    public void Button_3(View view){

        TextView text=(TextView)findViewById(R.id.button1_3);
        Button btn = (Button) findViewById(R.id.button1_3);

        if(counter%2==0)
        {
            text.setText("X");
            table_X_O[0][2]="X";
            counter++;
        }
        else
        {
            text.setText("O");
            table_X_O[0][2]="O";
            counter++;
        }
        btn.setEnabled(false);
        game_over();
    }

    public void Button_4(View view){

        TextView text=(TextView)findViewById(R.id.button2_1);
        Button btn = (Button) findViewById(R.id.button2_1);
        if(counter%2==0)
        {
            text.setText("X");
            table_X_O[1][0]="X";
            counter++;
        }
        else
        {
            text.setText("O");
            table_X_O[1][0]="O";
            counter++;
        }
        btn.setEnabled(false);
        game_over();
    }

    public void Button_5(View view){

        TextView text=(TextView)findViewById(R.id.button2_2);
        Button btn = (Button) findViewById(R.id.button2_2);
        if(counter%2==0)
        {
            text.setText("X");
            table_X_O[1][1]="X";
            counter++;
        }
        else
        {
            text.setText("O");
            table_X_O[1][1]="O";
            counter++;
        }
        btn.setEnabled(false);
        game_over();
    }

    public void Button_6(View view){

        TextView text=(TextView)findViewById(R.id.button2_3);
        Button btn = (Button) findViewById(R.id.button2_3);
        if(counter%2==0)
        {
            text.setText("X");
            table_X_O[1][2]="X";
            counter++;
        }
        else
        {
            text.setText("O");
            table_X_O[1][2]="O";
            counter++;
        }
        btn.setEnabled(false);
        game_over();
    }

    public void Button_7(View view){

        TextView text=(TextView)findViewById(R.id.button3_1);
        Button btn = (Button) findViewById(R.id.button3_1);
        if(counter%2==0)
        {
            text.setText("X");
            table_X_O[2][0]="X";
            counter++;
        }
        else
        {
            text.setText("O");
            table_X_O[2][0]="O";
            counter++;
        }
        btn.setEnabled(false);
        game_over();
    }

    public void Button_8(View view){

        TextView text=(TextView)findViewById(R.id.button3_2);
        Button btn = (Button) findViewById(R.id.button3_2);
        if(counter%2==0)
        {
            text.setText("X");
            table_X_O[2][1]="X";
            counter++;
        }
        else
        {
            text.setText("O");
            table_X_O[2][1]="O";
            counter++;
        }
        btn.setEnabled(false);
        game_over();
    }

    public void Button_9(View view){

        TextView text=(TextView)findViewById(R.id.button3_3);
        Button btn = (Button) findViewById(R.id.button3_3);

        if(counter%2==0)
        {
            text.setText("X");
            table_X_O[2][2]="X";
            counter++;
        }
        else
        {
            text.setText("O");
            table_X_O[2][2]="O";
            counter++;
        }
        btn.setEnabled(false);
        game_over();
    }

    void game_over()
    {
        if(counter>4)
        {
            if(table_X_O[0][0] == table_X_O[0][1] && table_X_O[0][1] == table_X_O[0][2])
            {
                setContentView(R.layout.game_over);
            }
            if(table_X_O[1][0]== table_X_O[1][1] && table_X_O[1][1]==table_X_O[1][2])
            {
                setContentView(R.layout.game_over);
            }
            if(table_X_O[2][0]== table_X_O[2][1] && table_X_O[2][1]==table_X_O[2][2])
            {
                setContentView(R.layout.game_over);
            }
//-------------------------------------------------------------------------------------wiersze
            if(table_X_O[0][0]== table_X_O[1][0] && table_X_O[1][0]==table_X_O[2][0])
            {
                setContentView(R.layout.game_over);
            }
            if(table_X_O[0][1]== table_X_O[1][1] && table_X_O[1][1]==table_X_O[2][1])
            {
                setContentView(R.layout.game_over);
            }
            if(table_X_O[0][2]== table_X_O[1][2] && table_X_O[1][2]==table_X_O[2][2])
            {
                setContentView(R.layout.game_over);
            }
//-------------------------------------------------------------------------------------kolumny
            if(table_X_O[0][0]== table_X_O[1][1] && table_X_O[1][1]==table_X_O[2][2])
            {
                setContentView(R.layout.game_over);
            }
            if(table_X_O[0][2]== table_X_O[1][1] && table_X_O[1][1]==table_X_O[2][0])
            {
                setContentView(R.layout.game_over);
            }
//-------------------------------------------------------------------------------------skośne
        }
        if(counter==9)
        {
            setContentView(R.layout.game_over);
        }
    }
}