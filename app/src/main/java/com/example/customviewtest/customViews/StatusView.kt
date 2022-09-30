package com.example.customviewtest.customViews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customviewtest.databinding.LayoutStatusViewBinding
import java.util.jar.Attributes

class StatusView constructor(context: Context,attrs:AttributeSet,defStyleAttrs:Int) :
        ConstraintLayout(context,attrs,defStyleAttrs){

            private  val binding = LayoutStatusViewBinding.
            inflate(LayoutInflater.from(context),this,false)
}