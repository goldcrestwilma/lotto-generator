package com.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lotto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        Log.d("BasicSyntax-debug", "로그 method = Log.d") // debug
        Log.v("BasicSyntax-verbose", "로그 method = Log.v") // verbose
        Log.i("BasicSyntax-information", "로그 method = Log.i") // information
        Log.w("BasicSyntax-warning", "로그 method = Log.w") // warning
        Log.e("BasicSyntax-error", "로그 method = Log.e") // error

        val sayHello = "hello kotlin"

        var mutable = 1

        mutable = 1_000

        setContentView(binding.root)
        binding.btnSay.setOnClickListener {
            binding.textSay.text = sayHello
        }
    }
}