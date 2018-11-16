package com.aszen.formapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var age: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saveInfo(view: View) {
        val name = nameText.text.toString()
        if(!ageText.text.toString().equals("")){
            age = ageText.text.toString().toInt()
        }
        val person1 = Person(nameText.text.toString(), age, jobText.text.toString())
        textView.text = "Name: " + person1.name + " Age: " + person1.age + " Job: " + person1.job
    }
}