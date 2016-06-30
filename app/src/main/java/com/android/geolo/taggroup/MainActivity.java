package com.android.geolo.taggroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

import com.android.geolo.library.taggroup.GeoloTagGroup;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private GeoloTagGroup mGeoloTagGroup;
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGeoloTagGroup = (GeoloTagGroup) findViewById(R.id.tag_grade_tagGroup);
        mGeoloTagGroup.setTags("111", "222", "333", "444", "555", "666", "777", "888", "999");
        mGeoloTagGroup.setOnTagChangeListener(new GeoloTagGroup.OnTagChangeListener() {
            @Override
            public void onAppend(GeoloTagGroup geoloTagGroup, String tag) {
                Log.d(TAG, "onAppend() -- tag:" + tag);
            }

            @Override
            public void onDelete(GeoloTagGroup geoloTagGroup, String tag) {
                Log.d(TAG, "onDelete() -- tag:" + tag);
            }

            @Override
            public void onCheckedChanged(GeoloTagGroup geoloTagGroup, String tagStr, boolean isChecked) {
                Log.d(TAG, "onCheckedChanged() -- tagStr:" + tagStr);
            }
        });

        mGeoloTagGroup.setOnTagClickListener(new GeoloTagGroup.OnTagClickListener() {
            @Override
            public void onTagClick(String tag) {
                Log.d(TAG, "onTagClick() -- tag:" + tag);
            }
        });
        mRadioGroup = (RadioGroup) findViewById(R.id.RadioGroup);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    default:
                        break;
                    case R.id.normal:// 普通模式
                        mGeoloTagGroup.switchStyleModle(GeoloTagGroup.STYLE_MODLE_NORMAL);
                        break;
                    case R.id.append:// 编辑模式
                        mGeoloTagGroup.switchStyleModle(GeoloTagGroup.STYLE_MODLE_APPEND);
                        break;
                    case R.id.radio:// 单选模式
                        mGeoloTagGroup.switchStyleModle(GeoloTagGroup.STYLE_MODLE_RADIO);
                        break;
                    case R.id.multi_select:// 多选模式
                        mGeoloTagGroup.switchStyleModle(GeoloTagGroup.STYLE_MODLE_MULTI_SELECT);
                        break;
                }
            }
        });
    }
}
