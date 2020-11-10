package kr.hs.emirim.s2019w04.mirimmenutest2_1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editDegree;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editDegree = findViewById(R.id.edit_degree);
        img1 = findViewById(R.id.img1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_rotate:
                img1.setRotation(Float.parseFloat(editDegree.getText().toString()));
                return true;
            case R.id.item_na:
                img1.setImageResource(R.drawable.nayoung);
                return true;
            case R.id.item_na2:
                img1.setImageResource(R.drawable.nayoung2);
                return true;
            case R.id.item_na3:
                img1.setImageResource(R.drawable.nayoung3);
                return true;
        }

        return false;
    }
}