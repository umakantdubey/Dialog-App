package com.example.umakantdubey.practice1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.button);
        Button button3=findViewById(R.id.button3);
        button1.setOnClickListener(this);

        button3.setOnClickListener(this);
        button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    public void openDialog()
    {
sampledialog sampledialog=new sampledialog();
sampledialog.show(getSupportFragmentManager(), "exampledialog");
    }
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button:
                Toast.makeText(this,"create",Toast.LENGTH_LONG).show();
break;

            case R.id.button3:
                Toast.makeText(this,"login successful",Toast.LENGTH_LONG).show();
                break;
        }

        }
}
