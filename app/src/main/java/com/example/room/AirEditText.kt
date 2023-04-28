package com.example.room

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import com.example.room.databinding.AirEditTextBinding

class AirEditText @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(context, attributeSet, defStyle)  {

    val binding: AirEditTextBinding by setBinding(R.layout.air_edit_text, context)

}