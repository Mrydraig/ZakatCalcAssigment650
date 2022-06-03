package net.syawal.zakatcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import net.syawal.zakatcalc.AboutActivity;
import net.syawal.zakatcalc.R;
import net.syawal.zakatcalc.ZakatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView card1,card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card1 = (CardView) findViewById(R.id.z1);
        card2 = (CardView) findViewById(R.id.a1);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){

            case R.id.z1:
                i = new Intent(this, ZakatActivity.class);
                startActivity(i);
                break;

            case R.id.a1:
                i = new Intent(this, AboutActivity.class);
                startActivity(i);
                break;


        }

    }
}