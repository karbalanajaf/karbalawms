package com.github.karbalanajaf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.karbalawms.ConfigMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView listServer = (TextView) findViewById(R.id.listServer);
        String serverString = ConfigMap.MAP_SERVER + "\n\n" + ConfigMap.GET_CAPABILITIES + "\n\n" + ConfigMap.GET_MAP + "\n\n" + ConfigMap.GEt_FEATURE_INFO;
        listServer.setText(serverString);
    }
}
