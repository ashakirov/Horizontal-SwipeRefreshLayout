# Horizontal-SwipeRefreshLayout

 This project is <b>CTRL+C CTRL+V</b> of default [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html) from support library, the only difference is that all vertical things are changed to horizontal.
 
 # Usage
 same as default [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html). 
 Just change 
 ``` java
 import android.support.v4.widget.SwipeRefreshLayout;
 ```
 to 
 ```java
 import custom.widget.SwipeRefreshLayout;
 ```
 and 
 ```xml
 <android.support.v4.widget.SwipeRefreshLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    ...>
    ...
 ```
 to
 ```xml
 <custom.widget.SwipeRefreshLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    ...>
    ...
 ```
 All features from default [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html) should work.
 
 ![](example.gif)
 
