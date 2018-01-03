package custom.widget.test;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import custom.widget.SwipeRefreshLayout;
import custom.widget.SwipeRefreshLayout.OnRefreshListener;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout srl;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srl = findViewById(R.id.srl);
        srl.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        srl.setRefreshing(false);
                    }
                },1000);
            }
        });
    }
}
