/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView india = (TextView) findViewById(R.id.india);

        // Set a click listener on that View
        india.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent indiaIntent = new Intent(MainActivity.this, IndiaNews.class);

                // Start the new activity
                startActivity(indiaIntent);
            }
        });

        TextView sports = (TextView) findViewById(R.id.sports);

        // Set a click listener on that View
        sports.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent sports = new Intent(MainActivity.this, Sports.class);

                // Start the new activity
                startActivity(sports);
            }
        });

        TextView tech = (TextView) findViewById(R.id.tech);
        // Set a click listener on that View
        tech.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent tech = new Intent(MainActivity.this, Technology.class);

                // Start the new activity
                startActivity(tech);
            }
        });

        TextView politics = (TextView) findViewById(R.id.politics);
        // Set a click listener on that View
        politics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent polict = new Intent(MainActivity.this, Politics.class);

                // Start the new activity
                startActivity(polict);
            }
        });

    }

}