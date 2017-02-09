package com.example.gadeishvili.newproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout fLanguages;
    LanguagesFragment fragment;
    private int height;
    public static boolean languageChanged = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = new LanguagesFragment();
        initView();


        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        height = displayMetrics.heightPixels;
    }

    @Override
    public void onBackPressed() {
        if (fLanguages.getVisibility() == View.VISIBLE) {
        }
        super.onBackPressed();
    }

    private void initView() {
        fLanguages = (FrameLayout) findViewById(R.id.fLanguages);
    }

    public void chooseLanguages(View view) {
        fLanguages.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_up_dialog, 0, 0, R.anim.slide_down_dialog).addToBackStack(null)
                .replace(R.id.fLanguages, fragment).commit();
    }

    @Override
    protected void onResume() {
        if (languageChanged) {
            recreate();
            languageChanged =false;
        }
        super.onResume();
    }

    public void languageClicked(View view){
        switch (view.getId()){
            case R.id.btnEng :
                fragment.engClicked();
                break;
            case R.id.btnGeo :
                fragment.geoClicked();
                break;

        }
    }
}
