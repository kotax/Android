package br.com.fiap.exerciciodados;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView Img_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Img_view =(ImageView) findViewById(R.id.img_dice);
    }

    public void roll(View view) {

        int rand = (int) (Math.random() * 6);

        switch (rand)
        {
            case 0:
                Img_view.setImageResource(R.drawable.d1);
                break;
            case 1:
                Img_view.setImageResource(R.drawable.d2);
                break;
            case 2:
                Img_view.setImageResource(R.drawable.d3);

                break;
            case 3:
                Img_view.setImageResource(R.drawable.d4);
                break;
            case 4:
                Img_view.setImageResource(R.drawable.d5);

                break;
            case 5:
                Img_view.setImageResource(R.drawable.d6);
                break;
        }
    }
}
