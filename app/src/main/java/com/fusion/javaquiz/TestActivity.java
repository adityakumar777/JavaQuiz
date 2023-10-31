package com.fusion.javaquiz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.fusion.javaquiz.databinding.ActivityTestBinding;

public class TestActivity extends AppCompatActivity {

    private ActivityTestBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        inAnimation();

    }

    private void inAnimation() {
        YoYo.with(Techniques.Wobble)
                .duration(700)
                .playOn(binding.test1);
        YoYo.with(Techniques.Wobble)
                .duration(700)
                .playOn(binding.test2);
        YoYo.with(Techniques.Wobble)
                .duration(700)
                .playOn(binding.test3);
        YoYo.with(Techniques.Wobble)
                .duration(700)
                .playOn(binding.test4);
      YoYo.with(Techniques.Wobble)
                .duration(700)
                .playOn(binding.test5);
      YoYo.with(Techniques.Wobble)
                .duration(700)
                .playOn(binding.test6);
      YoYo.with(Techniques.Wobble)
                .duration(700)
                .playOn(binding.test7);
      YoYo.with(Techniques.Wobble)
                .duration(700)
                .playOn(binding.test8);
        AnimationDrawable animationDrawable = (AnimationDrawable) binding.testLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();
    }

    public void nevigateToMainActivity(View view){
        Intent intent = new Intent(this,MainActivity.class);
        int testNumber;
        if (view.getId() == R.id.test1)
            testNumber = 1;
        else if (view.getId() == R.id.test2)
            testNumber = 2;
        else if (view.getId() == R.id.test3)
            testNumber = 3;
        else
            testNumber = 4;
        intent.putExtra("testNumber",testNumber);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }
}