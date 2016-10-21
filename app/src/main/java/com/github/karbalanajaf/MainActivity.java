package com.github.karbalanajaf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.karbalawms.ConfigMap;
import com.github.karbalawms.ResponsePOJO;
import com.github.karbalawms.RetrofitService;
import com.github.karbalawms.ServiceUtility;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private MaterialDialog progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = new MaterialDialog.Builder(this)
                .contentGravity(GravityEnum.START)
                .progress(true, 0)
                .build();
        TextView listServer = (TextView) findViewById(R.id.listServer);
        String serverString = ConfigMap.MAP_SERVER + "\n\n" + ConfigMap.GET_CAPABILITIES + "\n\n" + ConfigMap.GET_MAP + "\n\n" + ConfigMap.GEt_FEATURE_INFO;
        listServer.setText(serverString);
        Button getData = (Button) findViewById(R.id.getData);
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextQuery = (EditText) findViewById(R.id.editTextQuery);
                String query = editTextQuery.getText().toString();
                if (!query.equals(""))
                    loadData(query);
            }
        });

    }

    private void loadData(String query) {
        progressBar.setContent(R.string.progress_send_data_label);
        progressBar.show();
        RetrofitService retrofitServices = ServiceUtility.getRetrofit().create(RetrofitService.class);
        Call<List<ResponsePOJO>> call = retrofitServices.getResponsesService(query);
        call.enqueue(new Callback<List<ResponsePOJO>>() {
            @Override
            public void onResponse(Call<List<ResponsePOJO>> call, Response<List<ResponsePOJO>> response) {
                List<ResponsePOJO> responsePOJOList = response.body();
                Toast.makeText(MainActivity.this, "number of result: " + responsePOJOList.size(), Toast.LENGTH_LONG).show();
                progressBar.dismiss();
            }

            @Override
            public void onFailure(Call<List<ResponsePOJO>> call, Throwable t) {
                progressBar.dismiss();
            }
        });
    }
}
