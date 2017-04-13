package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        EditText getTarget = (EditText) findViewById(R.id.target);
        int target = Integer.parseInt(getTarget.getText().toString());
        Log.v("MainActivity", "Target " + target);
        scoreTeamA = target;
        scoreTeamB = target;
        Log.v("MainActivity", "Target a i b " + scoreTeamA + " and " + scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        Log.v("MainActivity", "Target a i b " + scoreTeamA + " and " + scoreTeamB);
    }

    public void three(View view) {
        scoreTeamA = scoreTeamA - 3;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA <= 0) {
            Toast.makeText(this, "Pro1 is a WINNER!", Toast.LENGTH_LONG).show();
        }
    }

    public void two(View view) {
        scoreTeamA = scoreTeamA - 2;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA <= 0) {
            Toast.makeText(this, "Pro1 is a WINNER!", Toast.LENGTH_LONG).show();
        }
    }

    public void one(View view) {
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA <= 0) {
            Toast.makeText(this, "Pro1 is a WINNER!", Toast.LENGTH_LONG).show();
        }
    }

    public void threeB(View view) {
        scoreTeamB = scoreTeamB - 3;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB <= 0) {
            Toast.makeText(this, "Pro2 is a WINNER!", Toast.LENGTH_LONG).show();
        }
    }

    public void twoB(View view) {
        scoreTeamB = scoreTeamB - 2;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB <= 0) {
            Toast.makeText(this, "Pro2 is a WINNER!", Toast.LENGTH_LONG).show();
        }
    }

    public void oneB(View view) {
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB <= 0) {
            Toast.makeText(this, "Pro2 is a WINNER!", Toast.LENGTH_LONG).show();
        }
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
