package com.example.ecommerceshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView tshoes1, tshirts1, tvatch1, tphoto1;
    private ImageView tshoes2, tshirts2, tvatch2, tphoto2;
    private ImageView tshoes3, tshirts3, tvatch3, tphoto3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        tshoes1 = (ImageView)findViewById(R.id.t_shoes1);
        tshirts1 = (ImageView)findViewById(R.id.t_shirts1);
        tvatch1 = (ImageView)findViewById(R.id.t_vatch1);
        tphoto1 = (ImageView)findViewById(R.id.t_photo1);

        tshoes2 = (ImageView)findViewById(R.id.t_shoes2);
        tshirts2 = (ImageView)findViewById(R.id.t_shirts2);
        tvatch2 = (ImageView)findViewById(R.id.t_vatch2);
        tphoto2 = (ImageView)findViewById(R.id.t_photo2);

        tshoes3 = (ImageView)findViewById(R.id.t_shoes3);
        tshirts3 = (ImageView)findViewById(R.id.t_shirts3);
        tvatch3 = (ImageView)findViewById(R.id.t_vatch3);
        tphoto3 = (ImageView)findViewById(R.id.t_photo3);




        tshoes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShoes1");
                startActivity(intent);
            }
        });

        tshirts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShirts1");
                startActivity(intent);
            }
        });


        tvatch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tWatch1");
                startActivity(intent);
            }
        });


        tphoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tPhoto1");
                startActivity(intent);
            }
        });


        tshoes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShoes2");
                startActivity(intent);
            }
        });

        tshirts2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShirts2");
                startActivity(intent);
            }
        });

        tvatch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tWatch2");
                startActivity(intent);
            }
        });


        tphoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tPhoto2");
                startActivity(intent);
            }
        });

        tshoes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShoes3");
                startActivity(intent);
            }
        });


        tshirts3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShirts3");
                startActivity(intent);
            }
        });


        tvatch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tWatch3");
                startActivity(intent);
            }
        });


        tphoto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tPhoto3");
                startActivity(intent);
            }
        });



    }
}
