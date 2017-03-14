package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import ro.pub.cs.systems.eim.lab03.phonedialer.R;

public class PhoneDialerActivity extends AppCompatActivity {



    private EditText phoneNumberEditText = null;

    private NumberButtonClickListener numberButtonClickListener = new NumberButtonClickListener();

    private class NumberButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            phoneNumberEditText.setText(phoneNumberEditText.getText().toString() + ((Button)view).getText().toString());
        }


        phoneNumberEditText = (EditText)findViewById(R.id.editText2);
        Button button;
        for (int index = 0; index < 9; index++) {
            String s = "";
            s += "button";
            s += "index";

            button = (Button)findViewById(index);
            button.setOnClickListener(numberButtonClickListener);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);




    }
}
