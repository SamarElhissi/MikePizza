package pizza.mikes.donair;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        },2000);

        new CountDownTimer(3000, 3000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), MainResturantList.class);

                startActivity(intent);
            }

        }.start();

//        try {
//                Thread.sleep(3000);
//                Intent intent = new Intent(getApplicationContext(), MainResturantList.class);
//
//                startActivity(intent);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }



    }


}

