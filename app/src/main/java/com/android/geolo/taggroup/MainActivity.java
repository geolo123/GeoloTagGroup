package com.android.geolo.taggroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.geolo.library.taggroup.GeoloTagGroup;

public class MainActivity extends AppCompatActivity {

    GeoloTagGroup mGeoloTagGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGeoloTagGroup = (GeoloTagGroup) findViewById(R.id.tag_grade_tagGroup);
        mGeoloTagGroup.setTags("111", "222", "333", "444", "555", "666", "777", "888", "999");
    }
}
