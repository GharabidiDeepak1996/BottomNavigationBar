package com.example.bottom_navigation_bar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView BNView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        BNView=findViewById( R.id.bottombar );

        BNView.setOnNavigationItemSelectedListener(this);

        BNView.setSelectedItemId(R.id.Store);
    }

    Account accountFragment = new Account();
    Favourite favouriteFragment = new Favourite();
    Store storeFragment = new Store();
    Cart cartFragment = new Cart();
    Camera cameraFragment = new Camera();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.Account:
                getSupportFragmentManager()
                        .beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                        .replace(R.id.container, accountFragment).commit();
                return true;

            case R.id.Favourite:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).
                replace(R.id.container, favouriteFragment).commit();
                return true;

            case R.id.Store:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).
                replace(R.id.container, storeFragment).commit();
                return true;

            case R.id.Cart:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).
                        replace(R.id.container, cartFragment).commit();
                return true;

            case R.id.Camera:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).
                        replace(R.id.container, cameraFragment).commit();
                return true;

       }
        return false;
    }
}
