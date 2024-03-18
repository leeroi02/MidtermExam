package com.example.midtermexam;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Batch1 extends MainActivity {


    boolean board [][];

    String pattern[][];
    String mark;



    Button btnn1, btnn2, btnn3, btnn4, btnn5, btnn6,btnn7,btnn8,btnn9;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batch1layout);
        TextView player;
        LinearLayout bg;
        board = new boolean[3][3];
        pattern = new String [3][3];
        mark = "0";

        Toast.makeText(Batch1.this, "Felicity V. Orate : Opening Tic Tac Toe (Batch 1)", Toast.LENGTH_SHORT).show();

        btnn1 = (Button) findViewById(R.id.btn1);
        btnn2 = (Button) findViewById(R.id.btn2);
        btnn3 = (Button) findViewById(R.id.btn3);
        btnn4 = (Button) findViewById(R.id.btn4);
        btnn5 = (Button) findViewById(R.id.btn5);
        btnn6 = (Button) findViewById(R.id.btn6);
        btnn7 = (Button) findViewById(R.id.btn7);
        btnn8 = (Button) findViewById(R.id.btn8);
        btnn9 = (Button) findViewById(R.id.btn9);

        player = findViewById(R.id.textView);
        bg = (LinearLayout) findViewById(R.id.linL);
        player.setText("Player X's Turn");


        btnn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[0][0]){
                         return;
                    }else{
                        board[0][0] = true;
                        btnn1.setText(mark);
                        pattern[0][0] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[0][0]){
                        return;
                    } else{
                        board[0][0] = true;
                        btnn1.setText(mark);
                        pattern[0][0] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });


        btnn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[0][1]){
                        return;
                    }else{
                        board[0][1] = true;
                        btnn2.setText(mark);
                        pattern[0][1] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[0][1]){
                        return;
                    } else{
                        board[0][1] = true;
                        btnn2.setText(mark);
                        pattern[0][1] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });

        btnn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[0][2]){
                        return;
                    }else{
                        board[0][2] = true;
                        btnn3.setText(mark);
                        pattern[0][2] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[0][2]){
                        return;
                    } else{
                        board[0][2] = true;
                        btnn3.setText(mark);
                        pattern[0][2] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });


        btnn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[1][0]){
                        return;
                    }else{
                        board[1][0] = true;
                        btnn4.setText(mark);
                        pattern[1][0] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[1][0]){
                        return;
                    } else{
                        board[1][0] = true;
                        btnn4.setText(mark);
                        pattern[1][0] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });

        btnn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[1][1]){
                        return;
                    }else{
                        board[1][1] = true;
                        btnn5.setText(mark);
                        pattern[1][1] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[1][1]){
                        return;
                    } else{
                        board[1][1] = true;
                        btnn5.setText(mark);
                        pattern[1][1] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });

        btnn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[1][2]){
                        return;
                    }else{
                        board[1][2] = true;
                        btnn6.setText(mark);
                        pattern[1][2] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[1][2]){
                        return;
                    } else{
                        board[1][2] = true;
                        btnn6.setText(mark);
                        pattern[1][2] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });

        btnn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[2][0]){
                        return;
                    }else{
                        board[2][0] = true;
                        btnn7.setText(mark);
                        pattern[2][0] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[2][0]){
                        return;
                    } else{
                        board[2][0] = true;
                        btnn7.setText(mark);
                        pattern[2][0] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });

        btnn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[2][1]){
                        return;
                    }else{
                        board[2][1] = true;
                        btnn8.setText(mark);
                        pattern[2][1] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[2][1]){
                        return;
                    } else{
                        board[2][1] = true;
                        btnn8.setText(mark);
                        pattern[2][1] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });

        btnn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(mark.equals("0")){
                    if(board[2][2]){
                        return;
                    }else{
                        board[2][2] = true;
                        btnn9.setText(mark);
                        pattern[2][2] = mark;
                        mark = "X";
                        player.setText("Player X's turn");
                        bg.setBackgroundColor(Color.RED);
                    }

                }else{
                    if(board[2][2]){
                        return;
                    } else{
                        board[2][2] = true;
                        btnn9.setText(mark);
                        pattern[2][2] = mark;
                        mark = "0";
                        player.setText("Player O's turn");
                        bg.setBackgroundColor(Color.BLUE);
                    }

                }
            }
        });


    }

}
