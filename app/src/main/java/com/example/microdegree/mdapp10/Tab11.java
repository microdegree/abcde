package com.example.microdegree.mdapp10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Tab11 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tab11, container, false);

        ImageView img = (ImageView)rootView.findViewById(R.id.overview_image);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=lKIXG7Ot76U&list=PLQztdyH5OY4BPSqZE-dSAMPIMU_8iq-Xd"));
                startActivity(intent);
            }
        });

        ImageView img2 = (ImageView)rootView.findViewById(R.id.overview_image2);
        img2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=vMn4Ej_oLnQ&list=PLQztdyH5OY4BvjvmU0PV8nTevqXjYcYEE"));
                startActivity(intent);
            }
        });

        ImageView img3 = (ImageView)rootView.findViewById(R.id.overview_image3);
        img3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=DSf3HVasDfw&list=PLQztdyH5OY4DYIUKLoXsITMT626Sbz4aI"));
                startActivity(intent);
            }
        });
        ImageView img4 = (ImageView)rootView.findViewById(R.id.overview_image4);
        img4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=fLN_cZx-nfE&list=PLQztdyH5OY4Alek9l4-Q9YmE0u51SMWBD"));
                startActivity(intent);
            }
        });

        ImageView img5 = (ImageView)rootView.findViewById(R.id.overview_image5);
        img5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=2ghK-_ZbwVk&list=PLQztdyH5OY4D3HIETAntxASLgvVh4JqDT"));
                startActivity(intent);
            }
        });

        ImageView img6 = (ImageView)rootView.findViewById(R.id.overview_image6);
        img6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=GcH8Mpwk15s&list=PLQztdyH5OY4Coz7lDSE1E72ysU9uT4cSj"));
                startActivity(intent);
            }
        });
        return rootView;


    }}