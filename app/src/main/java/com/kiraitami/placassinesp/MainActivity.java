package com.kiraitami.placassinesp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.kiraitami.placassinesp.models.BaseResult;
import com.kiraitami.placassinesp.models.Result;
import com.kiraitami.placassinesp.network.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView placa;
    TextView montadora;
    TextView modelo;
    TextView chassi;
    TextView municipio;
    TextView estado;
    private static final String TOKEN = "coloque_aqui_sua_chave";
    private static final String FORMAT = "Json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         placa = findViewById(R.id.txt_placa);
         montadora = findViewById(R.id.txt_montadora);
         modelo = findViewById(R.id.txt_modelo);
         chassi = findViewById(R.id.txt_chassi);
         municipio = findViewById(R.id.txt_municipio);
         estado = findViewById(R.id.txt_estado);
    }

    public void onClickSearch(View view){
        String placa = this.placa.getText().toString();
        Call<BaseResult> call = RetrofitConfig.getEndPoint().getPlaca(TOKEN,placa.toLowerCase(),FORMAT);

        call.enqueue(new Callback<BaseResult>() {
            @Override
            public void onResponse(Call<BaseResult> call, Response<BaseResult> response) {
                if(response.isSuccessful()){
                    OnSucess(response.body().getResult());
                }
            }
            @Override
            public void onFailure(Call<BaseResult> call, Throwable t) {
                Toast.makeText(MainActivity.this, "FALHA: "+t.getMessage().toString(), Toast.LENGTH_LONG);
            }
        });
    }

    public void OnSucess(Result result){
        montadora.setText(result.getMarca());
        modelo.setText(result.getModelo());
        chassi.setText(result.getChassi());
        municipio.setText(result.getMunicipio());
        estado.setText(result.getUf());
    }
}
