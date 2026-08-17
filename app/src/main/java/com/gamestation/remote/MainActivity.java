package com.gamestation.remote;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    TextView status;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);

        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setGravity(Gravity.CENTER);
        l.setBackgroundColor(Color.rgb(9,10,16));

        TextView logo = new TextView(this);
        logo.setText("GAMESTATION");
        logo.setTextColor(Color.WHITE);
        logo.setTextSize(42);
        logo.setGravity(Gravity.CENTER);

        status = new TextView(this);
        status.setText("🔍 البحث عن Redmi...");
        status.setTextColor(Color.LTGRAY);
        status.setTextSize(22);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0,40,0,0);

        l.addView(logo);
        l.addView(status);

        setContentView(l);
    }
}
