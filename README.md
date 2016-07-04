# GeoloTagGroup

1. 首先，非常感谢@2dxgujun 提供了非常棒的便签组效果：https://github.com/2dxgujun/AndroidTagGroup
2. 其次，在上述组件的基础上，继续优化和新增新的功能
3. 最后，如果有更多的业务和bug，可以邮件给geolo@vip.qq.com，我会不断更新并和大家一同进步。

# Demo

### Screenshot
![screenshot1](https://github.com/geolo123/GeoloTagGroup/blob/master/picture/01.jpg)
![screenshot1](https://github.com/geolo123/GeoloTagGroup/blob/master/picture/04.png)

### Edit Tags
![screenshot2](https://github.com/geolo123/GeoloTagGroup/blob/master/picture/02.jpg)
![screenshot3](https://github.com/geolo123/GeoloTagGroup/blob/master/picture/03.jpg)

# Usage

## Step 1

#### Gradle
```groovy
dependencies {
   compile 'com.android.geolo.library.taggroup:taggroup:1.0.1@aar'
}
```

#### Maven
```xml
<dependency>
  <groupId>com.android.geolo.library.taggroup</groupId>
  <artifactId>taggroup</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## Step 2

Use it in your own code:
```xml
    <com.android.geolo.library.taggroup.GeoloTagGroup
        android:id="@+id/tag_grade_tagGroup"
        style="@style/TagGroup"
        android:layout_marginBottom="10dip"
        android:layout_marginLeft="10dip"
        android:layout_marginRight="10dip"
        android:layout_marginTop="10dip"
        app:atg_modleStyle="append" />
```

```java
TagGroup mTagGroup = (TagGroup) findViewById(R.id.tag_group);
mTagGroup.setTags(new String[]{"Tag1", "Tag2", "Tag3"});
```
Use `setTags(...)` to set the initial tags in the group.

#### How to submit a new tag?

To "submit" a new tag as user press "Enter" or tap the blank area of the tag group, also you can "submit" a new tag via `submitTag()`.

**Note**: Google keyboard (a few soft keyboard not honour the key event) currently not supported "Enter" key to "submit" a new tag.

#### How to delete a tag?

To delete a tag as user press "Backspace" key or double-tap the tag which you want to delete.

#### How to detect tag click event?

Implement a callback interface: `TagGroup.OnTagClickListener`, and set the listener via `setOnTagClickListener()`.


# Build

run `./gradlew assembleDebug` (Mac/Linux)

or

run `gradlew.bat assembleDebug` (Windows)

# Attributes

There are several attributes you can set:

![Dimension illustrate](http://ww2.sinaimg.cn/large/bce2dea9gw1epov0i8x6kj20rk054q4g.jpg)

|           attr        	|     default      |                         mean                          	 |
|:------------------------- |:---------------- |:------------------------------------------------------- |
| atg_modleStyle         	| normal           | Determine the TagGroup mode, normal、 append、radio or multi_select DISPLAY.  |
| atg_inputHint   	        | Add Tag/添加标签 | The hint of the INPUT tag.                              |
| atg_borderColor	        | #49C120          | The tag outline border color.                           |
| atg_textColor          	| #49C120          | The tag text color.                           	         |
| atg_backgroundColor       | #FFFFFF          | The tag background color.                               |
| atg_dashBorderColor       | #AAAAAA          | The tag dash outline border color.                      |
| atg_inputHintColor        | #80000000        | The input tag hint text color.                          |
| atg_inputTextColor        | #DE000000        | The input tag type text color..                         |
| atg_checkedBorderColor    | #49C120          | The checked tag outline border color.                   |
| atg_checkedTextColor      | #FFFFFF          | The checked text color.                                 |
| atg_checkedMarkerColor    | #FFFFFF          | The checked marker color.                               |
| atg_checkedBackgroundColor| #49C120          | The checked tag background color.                       |
| atg_pressedBackgroundColor| #EDEDED          | The tag background color when the tag is being pressed. |
| atg_borderStrokeWidth     | 0.5dp            | The tag outline border stroke width.        	         |
| atg_textSize          	| 13sp             | The tag text size.                                  	 |
| atg_horizontalSpacing     | 8dp              | The horizontal tag spacing.(Mark1)                      |
| atg_verticalSpacing  	    | 4dp              | The vertical tag spacing.(Mark2)                      	 |
| atg_horizontalPadding	    | 12dp             | The horizontal tag padding.(Mark3)                      |
| atg_verticalPadding  	    | 3dp              | The vertical tag padding.(Mark4)                        |

# Developed By

 Jun Gu - <2dxgujun@gmail.com>

 Modify author ：geolo - <geolo@vip.qq.om>

# License

    Copyright 2015 geolo

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
