package com.example.notifikasiposyandu;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private HomeFragment homeFragment = new HomeFragment();
    private CalendarFragment calendarFragment = new CalendarFragment();
    private ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if (menuItem.getItemId() == R.id.home){
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();
            return true;
        } else if (menuItem.getItemId() == R.id.calendar) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, calendarFragment).commit();
            return true;
        }else if (menuItem.getItemId() == R.id.profile) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, profileFragment).commit();
            return true;
        }

        return false;
    }
}