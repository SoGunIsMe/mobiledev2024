package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "create");

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.main, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Resuming");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Pausing");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Stopping");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Destroyed");
    }
}
