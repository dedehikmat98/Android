package assalaam.projetc.id.komponentkr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mesin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesin);


        Button e = (Button) findViewById(R.id.button);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), BlokSilindir.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button r = (Button) findViewById(R.id.button2);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(),Torak.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button t = (Button) findViewById(R.id.button3);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), BatangTorak.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button y = (Button) findViewById(R.id.button4);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), PorosEngkol.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button u = (Button) findViewById(R.id.button5);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), Bantalan.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button i = (Button) findViewById(R.id.button6);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), RodaPegas.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button o = (Button) findViewById(R.id.button7);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), Katup.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button p = (Button) findViewById(R.id.button8);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), PegasKatup.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button a = (Button) findViewById(R.id.button9);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), TausKatup.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button s = (Button) findViewById(R.id.button10);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), BatangPenumbuk.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button d = (Button) findViewById(R.id.button11);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), PorosBubungan.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button f = (Button) findViewById(R.id.button12);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), Karter.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button g = (Button) findViewById(R.id.button13);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), BatangPenumbuk.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button h = (Button) findViewById(R.id.button14);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), BatangPenumbuk.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button j = (Button) findViewById(R.id.button15);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativLayout) {
                Intent myIntent = new
                        Intent(RelativLayout.getContext(), BatangPenumbuk.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }
    }
