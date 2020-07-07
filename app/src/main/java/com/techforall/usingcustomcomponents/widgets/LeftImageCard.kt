package com.techforall.usingcustomcomponents.widgets

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import com.techforall.usingcustomcomponents.R

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class LeftImageCard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.left_image_card_layout, this, true)
        orientation = VERTICAL
    }
}