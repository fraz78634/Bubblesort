package com.fraz7.bubblesort;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static Button next_bu, pre_bu, reset_bu;
    private static ImageView imageView;
    private static TextView textView;
    private int i = 0;
    Toolbar myToolbar2;
    private boolean flag = false;
    // image resource

    int[] images = {R.drawable.im_1, R.drawable.im_2, R.drawable.im_3, R.drawable.im_4, R.drawable.im_5, R.drawable.im_6, R.drawable.im_7, R.drawable.im_8,
            R.drawable.im_9, R.drawable.im_10, R.drawable.im_11, R.drawable.im_12, R.drawable.im_13, R.drawable.im_14, R.drawable.im_15, R.drawable.im_16, R.drawable.im_17,
            R.drawable.im_18, R.drawable.im_19, R.drawable.im_20, R.drawable.im_21, R.drawable.im_22, R.drawable.im_23, R.drawable.im_24, R.drawable.im_25, R.drawable.im_26,
            R.drawable.im_27, R.drawable.im_28, R.drawable.im_29, R.drawable.im_30, R.drawable.im_31, R.drawable.im_32, R.drawable.im_33, R.drawable.im_34, R.drawable.im_35,
            R.drawable.im_36, R.drawable.im_37, R.drawable.im_38, R.drawable.im_39, R.drawable.im_40, R.drawable.im_41, R.drawable.im_42, R.drawable.im_43, R.drawable.im_44,
            R.drawable.im_45};

    List<BSortResource> resourceList = new ArrayList<BSortResource>() {{
        add(new BSortResource(R.drawable.im_1, R.string.busort1));
        add(new BSortResource(R.drawable.im_1, R.string.busort2));
        add(new BSortResource(R.drawable.im_1, R.string.busort3));
        add(new BSortResource(R.drawable.im_1, R.string.busort4));
        add(new BSortResource(R.drawable.im_2, R.string.busort5));
        add(new BSortResource(R.drawable.im_2, R.string.busort6));
        add(new BSortResource(R.drawable.im_2, R.string.busort7));
        add(new BSortResource(R.drawable.im_3, R.string.busort8));
        add(new BSortResource(R.drawable.im_3, R.string.busort9));
        add(new BSortResource(R.drawable.im_4, R.string.busort10));
        add(new BSortResource(R.drawable.im_5, R.string.busort10));
        add(new BSortResource(R.drawable.im_6, R.string.busort10));
        add(new BSortResource(R.drawable.im_7, R.string.busort10));
        add(new BSortResource(R.drawable.im_8, R.string.busort10));
        add(new BSortResource(R.drawable.im_9, R.string.busort10));
        add(new BSortResource(R.drawable.im_10, R.string.busort10));
        add(new BSortResource(R.drawable.im_11, R.string.busort10));
        add(new BSortResource(R.drawable.im_12, R.string.busort10));
        add(new BSortResource(R.drawable.im_13, R.string.busort11));
        add(new BSortResource(R.drawable.im_14, R.string.busort12));
        add(new BSortResource(R.drawable.im_15, R.string.busort13));
        add(new BSortResource(R.drawable.im_16, R.string.busort13));
        add(new BSortResource(R.drawable.im_17, R.string.busort13));
        add(new BSortResource(R.drawable.im_18, R.string.busort13));
        add(new BSortResource(R.drawable.im_19, R.string.busort13));
        add(new BSortResource(R.drawable.im_20, R.string.busort13));
        add(new BSortResource(R.drawable.im_21, R.string.busort13));
        add(new BSortResource(R.drawable.im_22, R.string.busort13));
        add(new BSortResource(R.drawable.im_23, R.string.busort13));
        add(new BSortResource(R.drawable.im_24, R.string.busort13));
        add(new BSortResource(R.drawable.im_25, R.string.busort13));
        add(new BSortResource(R.drawable.im_26, R.string.busort13));
        add(new BSortResource(R.drawable.im_27, R.string.busort13));
        add(new BSortResource(R.drawable.im_28, R.string.busort13));
        add(new BSortResource(R.drawable.im_29, R.string.busort13));
        add(new BSortResource(R.drawable.im_30, R.string.busort13));
        add(new BSortResource(R.drawable.im_31, R.string.busort13));
        add(new BSortResource(R.drawable.im_32, R.string.busort13));
        add(new BSortResource(R.drawable.im_33, R.string.busort13));
        add(new BSortResource(R.drawable.im_34, R.string.busort13));
        add(new BSortResource(R.drawable.im_35, R.string.busort13));
        add(new BSortResource(R.drawable.im_36, R.string.busort13));
        add(new BSortResource(R.drawable.im_37, R.string.busort13));
        add(new BSortResource(R.drawable.im_38, R.string.busort13));
        add(new BSortResource(R.drawable.im_39, R.string.busort13));
        add(new BSortResource(R.drawable.im_40, R.string.busort13));
        add(new BSortResource(R.drawable.im_41, R.string.busort13));
        add(new BSortResource(R.drawable.im_42, R.string.busort13));
        add(new BSortResource(R.drawable.im_43, R.string.busort13));
        add(new BSortResource(R.drawable.im_44, R.string.busort13));
        add(new BSortResource(R.drawable.im_45, R.string.busort14));


    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_busort);



        // tool bar
        myToolbar2 = findViewById(R.id.tool_bar);            // toolbar
        myToolbar2.setNavigationIcon(R.drawable.backarrow);
        myToolbar2.setTitle("Bubble Sort");// toolbar layout file
        myToolbar2.setBackgroundColor(Color.parseColor("#488bd8"));
        setSupportActionBar(myToolbar2);                  // support toolbar as actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // home button (arrow) set

        next_bu = (Button) findViewById(R.id.button);
        pre_bu = (Button) findViewById(R.id.button2);
        reset_bu = (Button) findViewById(R.id.reset_bu);
        final TextView textView = (TextView) findViewById(R.id.textView);
        next_bu.setClickable(true);
        next_bu.setEnabled(true);
        reset_bu.setClickable(true);
        reset_bu.setEnabled(true);
        pre_bu.setClickable(false);


        addListenerOnButton();
        setInitialImage();
        addback();
        reset();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();

        }
        if (id == R.id.studdy)
        {
            Intent i = new Intent(this, bubblesort_stdy.class);
            startActivity(i);
        }
        return true;
    }

    public void addListenerOnButton() {
        next_bu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                next_bu.setEnabled(true);

                if (flag = true) {
                    if (i < resourceList.size() - 1) {
                        i++;
                        i = i % resourceList.size();
                        setCurrentImage();


                    }
                   /* else {
                       // next_bu.setClickable(false);
                        next_bu.setEnabled(false);
                        next_bu.setBackgroundResource(R.color.bu_disable);
                    } */

                }
                flag = false;

            }



        });
    }


    private void setInitialImage() {
        setCurrentImage();
    }

    private void setCurrentImage() {
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(resourceList.get(i).getResourceID());
        final TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(resourceList.get(i).getDescription());


    }

    public void addback() {
        pre_bu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                if (i > 0) {

                    i--;

                    i = i % resourceList.size();
                    setCurrentImage();
                    pre_bu.setClickable(true);

                }


            }

        });

    }

    public void reset() {
        reset_bu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                i = 0;
                setCurrentImage();


            }
        });
    }
}
