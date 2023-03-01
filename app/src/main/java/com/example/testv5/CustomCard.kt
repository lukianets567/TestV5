package com.example.testv5

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.testv5.databinding.CustomCardBinding

class CustomCard(context: Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {
    private lateinit var binding: CustomCardBinding

    init {
        binding = CustomCardBinding.inflate(LayoutInflater.from(context))

        val attrs = context.obtainStyledAttributes(attributeSet, R.styleable.CustomCard)

        binding.textView.text = attrs.getString(R.styleable.CustomCard_text)
        binding.checkBox.isChecked = attrs.getBoolean(R.styleable.CustomCard_checked, false)

        attrs.recycle()

        binding.textView.setOnClickListener {
            binding.textView.text = check()
        }
    }

    private fun check(): String = binding.checkBox.isChecked.toString()
}