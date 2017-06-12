package update.app.mnex.gallery;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {


    ViewPager pager;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        pager = (ViewPager) findViewById(R.id.pager);

        CustomAdapter adapter = new CustomAdapter(getLayoutInflater());

        pager.setAdapter(adapter);


    }

}
