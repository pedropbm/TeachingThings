package com.example.pbm.praticeset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamScoreA = 0;
    int teamScoreB= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void trespoints(View view) {
        teamScoreA = teamScoreA + 3;
        displayForTeamA(teamScoreA);
    }
    public void doispoints(View view) {
        teamScoreA = teamScoreA + 2;
        displayForTeamA(teamScoreA);
    }
    public void free(View view) {
        teamScoreA = teamScoreA + 1;
        displayForTeamA(teamScoreA);
    }
    public void ttrespoints(View view) {
        teamScoreB = teamScoreB + 3;
        displayForTeamB(teamScoreB);
    }
    public void ddoispoints(View view) {
        teamScoreB = teamScoreB + 2;
        displayForTeamB(teamScoreB);
    }
    public void ffree(View view) {
        teamScoreB = teamScoreB + 1;
        displayForTeamB(teamScoreB);
    }
    public void reset(View view){
        teamScoreA = 0;
        teamScoreB = 0;
        displayForTeamB(teamScoreB);
        displayForTeamB(teamScoreA);
    }
}
