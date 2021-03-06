/*
 * Copyright (C) 2015 Code Here Now
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codeherenow.circularprogressbar;

import android.content.Context;
import android.view.View;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class CircularProgressBar extends View {
    // Constants
    private static final float STROKE_THICKNESS_FRACTION = 0.075f;

    // Attributes
    private float mStrokeThickness;

    /*
     * We need to override at least one of the constructors. Here, we override the simplest of all.
     * The constructor that takes in a {@link android.content.Context} parameter.
     */
    public CircularProgressBar(Context context) {
        super(context);
    }

    /**
     * This is the method where we calculate the logical coordinates for our View.
     * The {@code onSizeChanged(int, int, int, int)} method is called ONLY when the size of the
     * view changes. Therefore, this is the right place to update metrics.
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        // Stroke Width
        int diameter = Math.min(w, h);
        mStrokeThickness = diameter * STROKE_THICKNESS_FRACTION;
    }
}
