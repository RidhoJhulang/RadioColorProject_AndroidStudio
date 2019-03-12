package id.jhulang.radiocolorproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

        public class MainActivity extends AppCompatActivity implements View.OnClickListener{
            RadioButton rdb1, rdb2, rdb3, rdb4, rdb5, rdb6, rdb7, rdb8;
            TextView txtWarna;
            Button btnExit;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                rdb1 = findViewById(R.id.rdb1);
                rdb2 = findViewById(R.id.rdb2);
                rdb3 = findViewById(R.id.rdb3);
                rdb4 = findViewById(R.id.rdb4);
                rdb5 = findViewById(R.id.rdb5);
                rdb6 = findViewById(R.id.rdb6);
                rdb7 = findViewById(R.id.rdb7);
                rdb8 = findViewById(R.id.rdb8);
                txtWarna = findViewById(R.id.txtWarna);
                btnExit = findViewById(R.id.btnExit);
                rdb1.setOnClickListener(this);
                rdb2.setOnClickListener(this);
                rdb3.setOnClickListener(this);
                rdb4.setOnClickListener(this);
                rdb5.setOnClickListener(this);
                rdb6.setOnClickListener(this);
                rdb7.setOnClickListener(this);
                rdb8.setOnClickListener(this);
                btnExit.setOnClickListener(this);
            }
            @Override
            public void onClick(View v){
                if(v == btnExit){
                    finish();
                }else if (v == rdb1){
                    txtWarna.setBackgroundResource(R.color.backRed);
                }else if (v == rdb2) {
                    txtWarna.setBackgroundResource(R.color.backGreen);
                }else if (v == rdb3) {
                    txtWarna.setBackgroundResource(R.color.backBlue);
                }else if (v == rdb4) {
                    txtWarna.setBackgroundResource(R.color.backWhite);
                }else if (v == rdb5) {
                    txtWarna.setBackgroundResource(R.color.backYellow);
                }else if (v == rdb6) {
                    txtWarna.setBackgroundResource(R.color.backDark);
                }else if (v == rdb7) {
                    txtWarna.setBackgroundResource(R.color.backPink);
                }else if (v == rdb8) {
                    txtWarna.setBackgroundResource(R.color.backCayon);
                }

            }
}
