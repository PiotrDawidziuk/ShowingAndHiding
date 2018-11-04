package pl.apka.a06showingandhiding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    Button showButton;

    Button hideButton;
    public void show (View view){
        textView.setVisibility(view.VISIBLE);
        showButton.setVisibility(view.INVISIBLE);
        hideButton.setVisibility(view.VISIBLE);
    }

    public void hide (View view){
        textView.setVisibility(view.INVISIBLE);
        showButton.setVisibility(view.VISIBLE);
        hideButton.setVisibility(view.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        showButton = findViewById(R.id.showButton);

        hideButton = findViewById(R.id.hideButton);

        showButton.setVisibility(View.INVISIBLE);
    }
}
