package view;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.moviesstore.R;

public class DeteMain2Activity extends AppCompatActivity {

    private TextView title1,genre1 , year1 ;
    private ImageView image1;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dete_main2);

        bundle = getIntent().getExtras();
        title1 = findViewById(R.id.textView);
        genre1 = findViewById(R.id.textView2);
        year1 = findViewById(R.id.textView3);
        image1 = findViewById(R.id.imageView2);

        if(bundle !=null){
            title1.setText(bundle.getString("title"));
            genre1.setText(bundle.getString("genre"));
            year1.setText(bundle.getString("year"));
            image1.setImageResource(bundle.getInt("image"));
        }

    }
}
