package org.xiangbalao.grenndao;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import org.xiangbalao.common.grenndaodemo.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    private FrameLayout fl_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        FragmentManager manager = getFragmentManager();
        manager.beginTransaction()
                .replace(R.id.fl_content, new TestFragment(), null)
                .addToBackStack(null)
                .commit();


    }


    private void initView() {
        fl_content = (FrameLayout) findViewById(R.id.fl_content);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:

                return true;
            case R.id.navigation_dashboard:

                return true;
            case R.id.navigation_notifications:

                return true;
        }
        return false;
    }
}
