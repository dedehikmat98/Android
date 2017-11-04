package assalaam.projetc.id.komponentkr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponentkr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponentkr);

        Button q = (Button) findViewById(R.id.activity_mesin);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayout) {
                Intent myIntent = new
                        Intent(LinearLayout.getContext(), Mesin.class);
                startActivityForResult(myIntent, 0);

            }
        });


        Button w = (Button) findViewById(R.id.activity_profil);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayout) {
                Intent myIntent = new
                        Intent(LinearLayout.getContext(), Profil.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button e = (Button) findViewById(R.id.activity_weeb_viiew);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayout) {
                Intent myIntent = new
                        Intent(LinearLayout.getContext(), WeebViiew.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
