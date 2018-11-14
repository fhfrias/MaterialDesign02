package com.iesvirgendelcarmen.dam.material02;

import android.animation.Animator;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Toast;

public class Material02 extends AppCompatActivity {

    Interpolator interpolador;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material02);

        interpolador = AnimationUtils.loadInterpolator(getBaseContext(),android.R.interpolator.fast_out_slow_in);
        fab =findViewById(R.id.fab);
        fab.setScaleX(0);
        fab.setScaleY(0);
        fab.animate().scaleX(1).scaleY(1).setInterpolator(interpolador).
                setDuration(600).setStartDelay(1000).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                    fab.animate().scaleX(0).scaleY(0).setInterpolator(interpolador).setDuration(600).start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }

    public void fabTocado(View view) {
        Toast.makeText(this,"FAB TOCADO",Toast.LENGTH_SHORT).show();
    }
}
