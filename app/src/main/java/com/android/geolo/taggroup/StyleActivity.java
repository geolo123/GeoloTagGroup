package com.android.geolo.taggroup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.geolo.library.taggroup.GeoloTagGroup;

/**
 * Created by jwb.geolo on 2016/7/4.
 */
public class StyleActivity extends AppCompatActivity {
    private TextView mPromptText;

    private GeoloTagGroup mDefaultTagGroup;
    private GeoloTagGroup mSmallTagGroup;
    private GeoloTagGroup mLargeTagGroup;
    private GeoloTagGroup mBeautyTagGroup;
    private GeoloTagGroup mBeautyInverseTagGroup;

    private String[] tags = {"111", "222", "333", "444", "555", "666", "777"};

    private GeoloTagGroup.OnTagClickListener mTagClickListener = new GeoloTagGroup.OnTagClickListener() {
        @Override
        public void onTagClick(String tag) {
            Toast.makeText(StyleActivity.this, tag, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);
        mPromptText = (TextView) findViewById(R.id.tv_prompt);
        mPromptText.setVisibility((tags == null || tags.length == 0) ? View.VISIBLE : View.GONE);
        mDefaultTagGroup = (GeoloTagGroup) findViewById(R.id.tag_group);
        mSmallTagGroup = (GeoloTagGroup) findViewById(R.id.tag_group_small);
        mLargeTagGroup = (GeoloTagGroup) findViewById(R.id.tag_group_large);
        mBeautyTagGroup = (GeoloTagGroup) findViewById(R.id.tag_group_beauty);
        mBeautyInverseTagGroup = (GeoloTagGroup) findViewById(R.id.tag_group_beauty_inverse);
        if (tags != null && tags.length > 0) {
            mDefaultTagGroup.setTags(tags);
            mSmallTagGroup.setTags(tags);
            mLargeTagGroup.setTags(tags);
            mBeautyTagGroup.setTags(tags);
            mBeautyInverseTagGroup.setTags(tags);
        }

        mDefaultTagGroup.setOnTagClickListener(mTagClickListener);
        mSmallTagGroup.setOnTagClickListener(mTagClickListener);
        mLargeTagGroup.setOnTagClickListener(mTagClickListener);
        mBeautyTagGroup.setOnTagClickListener(mTagClickListener);
        mBeautyInverseTagGroup.setOnTagClickListener(mTagClickListener);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPromptText.setVisibility((tags == null || tags.length == 0) ? View.VISIBLE : View.GONE);
        mDefaultTagGroup.setTags(tags);
        mSmallTagGroup.setTags(tags);
        mLargeTagGroup.setTags(tags);
        mBeautyTagGroup.setTags(tags);
        mBeautyInverseTagGroup.setTags(tags);
    }
}
