package com.example.room

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

fun <DB : ViewDataBinding> LinearLayout.setBinding(layoutRes: Int, context: Context): Lazy<DB> {
    return lazy(LazyThreadSafetyMode.NONE) { DataBindingUtil.inflate(LayoutInflater.from(context), layoutRes, this, true)}
}

fun String.isName() : Boolean {
    return this.equals("name", true)
}

fun View.show() {
    this.visibility = View.VISIBLE
}