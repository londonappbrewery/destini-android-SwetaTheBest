package com.londonappbrewery.destini;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mView1;
    Button mBottomButton;
    Button mTopButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mView1 = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mView1.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = mStoryIndex + 1;

                } else if(mStoryIndex==3){
                    mView1.setText(R.string.T6_End);
                    mTopButton.setText("EXIT");
                    mBottomButton.setText("EXIT");
                    mStoryIndex = mStoryIndex + 1;
                } else if(mStoryIndex==4){
//
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mView1.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = mStoryIndex + 1;
                } else if (mStoryIndex == 2) {
                    mView1.setText(R.string.T4_End);
                    mTopButton.setText("EXIT");
                    mBottomButton.setText("EXIT");
                    mStoryIndex = mStoryIndex + 2;
                } else if (mStoryIndex == 3) {
                    mView1.setText(R.string.T5_End);
                    mBottomButton.setText("EXIT");
                    mTopButton.setText("EXIT");
                    mStoryIndex = mStoryIndex + 1;
                }  if(mStoryIndex==4){
                    Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                    homeIntent.addCategory( Intent.CATEGORY_HOME );
                    homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(homeIntent);
                }

            }
        });






        }
    }










