package lastie_wangechian_Colors.com;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private RadioGroup radioGroup;
    int backgroundColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        relativeLayout = findViewById(R.id.relativelayout);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("MyPref", 0);
        final SharedPreferences.Editor editor = preferences.edit();

        backgroundColor = preferences.getInt("backgroundColor", 0);
        relativeLayout.setBackgroundColor(backgroundColor);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.white:
                        backgroundColor = getResources().getColor(R.color.white);
                        relativeLayout.setBackgroundColor(backgroundColor);
                        break;

                    case R.id.blue:
                        backgroundColor = getResources().getColor(R.color.blue);
                        relativeLayout.setBackgroundColor(backgroundColor);
                        break;

                    case R.id.purple:
                        backgroundColor = getResources().getColor(R.color.purple);
                        relativeLayout.setBackgroundColor(backgroundColor);
                        break;

                    case R.id.green:
                        backgroundColor = getResources().getColor(R.color.green);
                        relativeLayout.setBackgroundColor(backgroundColor);
                        break;

                    case R.id.red:
                        backgroundColor = getResources().getColor(R.color.red);
                        relativeLayout.setBackgroundColor(backgroundColor);
                        break;

                    case R.id.yellow:
                        backgroundColor = getResources().getColor(R.color.yellow);
                        relativeLayout.setBackgroundColor(backgroundColor);
                        break;

                    case R.id.pink:
                        backgroundColor = getResources().getColor(R.color.pink);
                        relativeLayout.setBackgroundColor(backgroundColor);
                        break;

                }
                editor.putInt("backgroundColor",backgroundColor);
                editor.commit();
            }
        });
    }
}
