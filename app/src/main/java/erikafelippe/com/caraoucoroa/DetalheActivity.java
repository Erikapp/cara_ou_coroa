package erikafelippe.com.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView botaoVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = (ImageView) findViewById(R.id.moedaId);
        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);

        //Recupera o que esta sendo passado como extra na Intent
        Bundle extra = getIntent().getExtras();

        //Valida as informações
        if (extra != null) {

            //Colocamos na variável opcaoEscolhida a chave da MainActivity
            String opcaoEscolhida = extra.getString("opcao");

            //if para mostrar uma das imagens
            if (opcaoEscolhida.equals("cara")){
                //Passar 2 parâmetros. O contexto e a imagem
                imagem.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this, R.drawable.moeda_cara));
            }else{
                //mostra coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this, R.drawable.moeda_coroa));
                
            }

        }

            botaoVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(DetalheActivity.this, MainActivity.class));

                }
            });
        }
}
