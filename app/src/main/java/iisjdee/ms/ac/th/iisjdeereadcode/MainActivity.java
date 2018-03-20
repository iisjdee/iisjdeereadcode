package iisjdee.ms.ac.th.iisjdeereadcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import iisjdee.ms.ac.th.iisjdeereadcode.fregment.MainFrafment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//          Add fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainFragment,new MainFrafment())
                    .commit();
        }

    }   //main Method
}   //main Class
