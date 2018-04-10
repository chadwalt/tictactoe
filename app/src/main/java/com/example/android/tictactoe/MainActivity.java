package com.example.android.tictactoe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
//    @BindView(R.id.board_type) Spinner board_type;
    Context context;
    char playerSelected;
    CharSequence playerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        context = getApplicationContext();
    }

    @OnClick(R.id.player_one)
    protected void playerOneSelected(View v){
        playerText = "Player One Selected";
        Toast toast = Toast.makeText(context, playerText, Toast.LENGTH_SHORT);
        toast.show();

        playerSelected = 'X';
    }

    @OnClick(R.id.player_two)
    protected void playerTwoSelected(View v){
        playerText = "Player Two Selected";
        Toast toast = Toast.makeText(context, playerText, Toast.LENGTH_SHORT);
        toast.show();

        playerSelected = 'O';
    }
}
