package com.example.tirhal;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for changing status bar icon colors
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login2);
    }

    public void onLoginClick(View View){
        startActivity(new Intent(this,RegistrationActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
}
/* <item name="colorPrimary">@color/pu</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_700</item>*/