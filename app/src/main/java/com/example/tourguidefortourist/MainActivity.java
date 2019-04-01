package com.example.tourguidefortourist;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rdKajal;
    private RadioButton rdHrithik;
    private RadioButton rdPradeep;
    private ImageView imgActor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdKajal=findViewById(R.id.rdKajal);
        rdHrithik=findViewById(R.id.rdHrithik);
        rdPradeep=findViewById(R.id.rdPradeep);
        imgActor=findViewById(R.id.imgActor);

        rdKajal.setOnClickListener(this);
        rdHrithik.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.rdKajal:
                imgActor.setImageResource(R.drawable.kajal);
//                Toast toast= Toast.makeText(this, "your message", Toast.LENGTH_LONG);
//                toast.show();
                break;
            case R.id.rdHrithik:
                imgActor.setImageResource(R.drawable.hrithik);
                break;
            case R.id.rdPradeep:
                break;


        }
    }
}
