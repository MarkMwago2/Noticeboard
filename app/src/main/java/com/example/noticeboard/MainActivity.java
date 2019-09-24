package com.example.noticeboard;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.mainText) TextView mmainTextView;
    @BindView(R.id.AnnButton) Button mAnnButton;
    @BindView(R.id.AnnEditText) EditText mAnnEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAnnButton.setOnClickListener(this);
        mAnnEditText.setOnClickListener(this);
        mmainTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mAnnButton) {
            Intent intent = new Intent(MainActivity.this, Calendar.class);
            startActivity(intent);
            Animatoo.animateSpin(this);

        }
    }
}
