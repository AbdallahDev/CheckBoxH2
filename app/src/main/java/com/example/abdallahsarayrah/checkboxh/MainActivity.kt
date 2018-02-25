package com.example.abdallahsarayrah.checkboxh

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewResult.visibility = View.GONE

        var selections = ArrayList<String>()

        checkBoxOne.setOnClickListener {
            when (checkBoxOne.isChecked) {
                true -> selections.add("ioniq")
                false -> selections.remove("ioniq")
            }
        }
        checkBoxTwo.setOnClickListener {
            when (checkBoxTwo.isChecked) {
                true -> selections.add("tesla")
                false -> selections.remove("tesla")
            }
        }
        checkBoxThree.setOnClickListener {
            when (checkBoxThree.isChecked) {
                true -> selections.add("leaf")
                false -> selections.remove("leaf")
            }
        }

        buttonResult.setOnClickListener {
            textViewResult.text = ""
            for (selection in selections)
                textViewResult.text = textViewResult.text.toString() + selection

            textViewResult.visibility = View.VISIBLE
        }
    }
}
