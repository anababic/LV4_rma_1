package com.example.lv4_babic_prvizad

import android.graphics.drawable.ColorDrawable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountersColorsViewModel : ViewModel() {

    var birdsCounter = MutableLiveData<String>();
    val birdColour = MutableLiveData<ColorDrawable>();

    init {
        birdsCounter.value = PrefManager().retrieveCounter().toString();
        birdColour.value = R.drawable.ic_launcher_background as ColorDrawable

    }
}