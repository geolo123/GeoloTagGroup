package com.android.geolo.library.taggroup;

import android.content.Context;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jwb.geolo on 2016/6/29.
 */
public class GeoloTagGroup extends TagGroup {

    /** 获取被选择的标签内容 */
    public List<String> getCheckTags() {
        ArrayList<String> checkTags = new ArrayList<>();
        checkTags.add(getCheckedTag().getText().toString());
        return checkTags;
    }

    // ============== 构造函数初始化 ==============//
    public GeoloTagGroup(Context context) {
        super(context);
    }

    public GeoloTagGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GeoloTagGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
