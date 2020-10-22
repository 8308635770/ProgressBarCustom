package com.example.progressbarcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar=progress_bar

        updateProgress()
        val btn_inc=button_incr;
        val btn_dec=button_decr;
        val tv=text_view_progress;
        btn_inc.setOnClickListener(View.OnClickListener {

            if(count<=90){
                count=count+10
                updateProgress()
            }

        })

        btn_dec.setOnClickListener(View.OnClickListener {

            if(count>=10){
                count=count-10
                updateProgress()
            }
        })
    }

    fun updateProgress(){

        progress_bar.setProgress(count)
        text_view_progress.setText("$count%")

    }
}
