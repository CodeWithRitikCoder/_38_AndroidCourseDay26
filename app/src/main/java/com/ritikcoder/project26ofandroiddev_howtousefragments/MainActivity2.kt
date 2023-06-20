package com.ritikcoder.project26ofandroiddev_howtousefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ritikcoder.project26ofandroiddev_howtousefragments.databinding.ActivityMain2Binding
import com.ritikcoder.project26ofandroiddev_howtousefragments.databinding.FragmentClockBinding
import com.ritikcoder.project26ofandroiddev_howtousefragments.ui.login.LoginFragment

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonForClock.setOnClickListener {
            replaceFrameWithFragment(Clock_Fragment())

        }
        binding.buttonForSheet.setOnClickListener {
            replaceFrameWithFragment(Sheet_Fragment())
        }
        binding.buttonForValidate.setOnClickListener {
            replaceFrameWithFragment(LoginFragment())
        }

    }

    private fun replaceFrameWithFragment(frag: Fragment) {
        val fragmentManager= supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, frag)
        fragmentTransaction.commit()

    }
}