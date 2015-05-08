package com.tinvillanueva.martianlander;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class GameActivity extends Activity implements View.OnTouchListener {

    private GameView gameView;
    private ImageButton leftThruster;
    private ImageButton rightThruster;
    private ImageButton mainThruster;
    private ImageButton pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  //removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.game_screen);

        gameView = (GameView) findViewById(R.id.gameView);

        leftThruster = (ImageButton) findViewById(R.id.btnLeftThruster);
        leftThruster.setOnTouchListener(this);

        rightThruster = (ImageButton) findViewById(R.id.btnRightThruster);
        rightThruster.setOnTouchListener(this);

        mainThruster = (ImageButton) findViewById(R.id.btnMainThruster);
        mainThruster.setOnTouchListener(this);

        pause = (ImageButton) findViewById(R.id.btnPause);
        pause.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_POINTER_DOWN:

                break;
            case MotionEvent.ACTION_MOVE:

                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_POINTER_UP:

                break;
        }

        return false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.startGame();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pauseGame();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
