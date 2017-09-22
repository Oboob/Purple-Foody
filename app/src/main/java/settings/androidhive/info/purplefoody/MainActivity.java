package settings.androidhive.info.purplefoody;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    TextView tx_option1;
    @BindView(R.id.text2)
    TextView tx_option2;
    @BindView(R.id.text3)
    TextView tx_option3;
    @BindView(R.id.text4)
    TextView tx_option4;
    @BindView(R.id.text5)
    TextView tx_option5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        tx_option1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tx_option1.setText("");
                //Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
               // MenuActivity.this.startActivity(myIntent);
            }
        });

    }
}
