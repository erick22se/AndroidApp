package com.example.soldaplication.Activity.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.soldaplication.Activity.Fragments.DashboardFragment;
import com.example.soldaplication.Activity.Fragments.MyAuctionsFragment;
import com.example.soldaplication.Activity.Fragments.StoreFragment;
import com.example.soldaplication.Activity.Models.User;
import com.example.soldaplication.Activity.Models.UserRepository;
import com.example.soldaplication.R;

public class MainActivity extends AppCompatActivity {
    private Toolbar mainToolbar;
    private UserRepository userRepository;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.navigation_dashboard:
                    fragmentTransaction.replace(R.id.content,new DashboardFragment()).commit();
                    return true;
                case R.id.navigation_my_auctions:
                    fragmentTransaction.replace(R.id.content,new MyAuctionsFragment()).commit();
                    return true;
                case R.id.navigation_store:
                    fragmentTransaction.replace(R.id.content,new StoreFragment()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainToolbar = (Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(mainToolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content, new StoreFragment()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_profile)
        {
            User user = User.fromBundle(getIntent().getExtras());
            Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtras(user.toBundle());
            startActivity(intent);
        }
        if (item.getItemId() == R.id.action_auction_history)
        {
            Toast.makeText( MainActivity.this,
                    "TODO: Create a auction_history_activity",
                    Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.action_logout)
        {
            Toast.makeText( MainActivity.this,
                    "TODO: Return to The Login",
                    Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}
