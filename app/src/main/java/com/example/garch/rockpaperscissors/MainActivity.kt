package com.example.garch.rockpaperscissors

import android.content.Context
import android.graphics.BitmapFactory
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.security.SecureRandom
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(),SensorEventListener {


    private var mAccelerometer:Sensor?=null
    private var mSensorManager: SensorManager?=null
    private var myArray:Array<Int>?=null




    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSensorChanged(event: SensorEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var picsArray=ArrayList<String>()
            picsArray.add("Rock")
            picsArray.add("Paper")
            picsArray.add("Scissors")

            val Rock = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.rockim)
            val Paper = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.paperim)
            val Scissors = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.scissors)



        picsArray.add("Rock")
        picsArray.add("Paper")
        picsArray.add("Scissors")

        mSensorManager=getSystemService(Context.SENSOR_SERVICE)as SensorManager
        mAccelerometer = mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        myArray= arrayOf(1,2,3)




        btnNumGenerator.setOnClickListener {

            var imageNum:Int=Random().nextInt(3)
            txtShaketoBegin.text=imageNum.toString()
            if(imageNum==0){

                ImgDraw.setImageResource(R.drawable.rockim)
            }else
                if(imageNum==1){
                    ImgDraw.setImageResource(R.drawable.paperim)
                }else
                    if(imageNum==2)
                        ImgDraw.setImageResource(R.drawable.scissors)


        }





    }
}
