package rs.fon.placesapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Milena on 2/14/2017.
 */

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Button start1;

        start1= (Button)findViewById(R.id.start);
        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Splash.this, MapsActivity.class);
                Splash.this.startActivity(intent);
            }
        });
    }

}
