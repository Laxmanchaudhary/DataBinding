package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      var databndg= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        databndg.mydata=Data("laxman","gmail")
    }
}
