package com.nestdev.rxtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import io.reactivex.rxjava3.core.Observable


class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity"
    }

    private lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.text)

        println("Hello, rx!")
        Observable.just("Hello, obs Rx!")
            .subscribe{ println(it) }
    }

    ////TODO
    /**
     * Stopped here:
     * https://www.youtube.com/watch?v=SxVkBuhFOq0&list=PL23Revp-82LJQpmHuuwe4fvjkXg6pWxv0&index=4
     */
}