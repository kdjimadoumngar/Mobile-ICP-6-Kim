package com.vijaya.speechtotext;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final int REQ_CODE_SPEECH_INPUT = 100;
    private TextView mVoiceInputTv;
    private ImageButton mSpeakBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVoiceInputTv = (TextView) findViewById(R.id.voiceInput);
        mSpeakBtn = (ImageButton) findViewById(R.id.btnSpeak);
        mSpeakBtn.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            startVoiceInput();
        }
    });
}

    // 6. Extracting the name  of the user and save it as edito level
    private SharedPreferences preferences;
    private SharedPreferences.Editor edit
    // 8. To answer appropriate questionsor;
//        preferences = getSharedPreferences(PREFS,0);
//        editor = preferences.edit();
//        editor.putString(NAME,<extracted name>).apply();//private static final String NAME = "name";
//        ;
//    SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm");//dd/MM/yyyy
//    Date now = new Date();
//    String[] strDate = sdfDate.format(now).split(nt(":")
//    if(strDate[1].
//
//    MainActivity("00"))
//    strDate[1] = "o'clock";
//    System.out.println("The time is " + sdfDate.formatow));
//    DEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//            intent.putExtra(RecognizerIntent.EXTRA_LANGUGE
        private void startVoiceInputA() {
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MOECH_INPUT);
        } catch (ActivityNotFoundException a) {
, Locale.getDefault());
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hello, How can I help you?");
            try {
                startActivityForResult(intent, REQ_CODE_SPE
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    mVoiceInputTv.setText(result.get(0));
                }
                break;
            }

        }
    }
}