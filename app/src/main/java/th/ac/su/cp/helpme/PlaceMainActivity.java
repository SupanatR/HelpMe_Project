package th.ac.su.cp.helpme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class PlaceMainActivity extends AppCompatActivity {

    //เก็บรูปภาพที่มีอยู่
    private ImageView im;
    private ImageView help;
    Random r;
    Integer[] place = {
            R.drawable.placep4,
            R.drawable.placep5,
            R.drawable.placep6,
            R.drawable.placep7,
            R.drawable.placep8,
            R.drawable.placep9,
            R.drawable.placep10,
            R.drawable.placep11,
            R.drawable.placep12,
            R.drawable.placep13,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        //สุ่มรูปภาพ
        im = (ImageView)findViewById(R.id.place);
        help = (ImageView)findViewById(R.id.help_r);
        r = new Random();

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(place[r.nextInt(place.length)]);
            }
        });

        //เปลี่ยนหน้าเมื่อกดที่รูปภาพ
        ImageView pimg = findViewById(R.id.note_butt);
        pimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlaceMainActivity.this,NoteActivity.class);
                startActivity(intent);
            }
        });
    }
}