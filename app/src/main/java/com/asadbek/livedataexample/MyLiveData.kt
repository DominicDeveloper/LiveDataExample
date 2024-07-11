package com.asadbek.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyLiveData {
    private var liveDouble = MutableLiveData<String>()
    fun set(value:String){
        liveDouble.value = value
    }
    fun get():LiveData<String>{
        return liveDouble
    }
}