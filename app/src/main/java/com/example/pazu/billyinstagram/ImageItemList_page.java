package com.example.pazu.billyinstagram;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import java.io.IOException;

import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageItemList_page extends Fragment {
    ImageView imageView;
    Button add;
    EditText title;
    EditText description;
    Button upload;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view_imageItemList_page = inflater.inflate(R.layout.fragment_image_item_list__page, container, false);

        final String token = getArguments().getString("Token");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageItemList_page imageItemList_page = new ImageItemList_page();
                Bundle args = new Bundle();
                args.putString("Token", token);
                imageItemList_page.setArguments(args);

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.container, imageItemList_page);
                ft.commit();
            }
        });


        return view_imageItemList_page;
    }

}