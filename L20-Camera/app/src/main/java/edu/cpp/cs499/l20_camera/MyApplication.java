package edu.cpp.cs499.l20_camera;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by yusun on 5/18/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "uvXn047c4OEbmkZJE91crdYL8T5N3Wf6FCqvCjin", "qsxQBgaZVswo2uINkjaS0HHGf3PZbmI2XGLLyQXX");
    }
}
