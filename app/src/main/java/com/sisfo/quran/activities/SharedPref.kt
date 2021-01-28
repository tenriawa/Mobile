package com.sisfo.quran.activities

import android.content.Context
import android.content.SharedPreferences

class SharedPref(context: Context) {
    internal var mySharedPerf: SharedPreferences

    init {
        mySharedPerf = context.getSharedPreferences("filename", Context.MODE_PRIVATE)
    }

    fun setNightModeState(state: Boolean? ){
        val editor = mySharedPerf.edit()
        editor.putBoolean("Night Mode", state!!)
        editor.commit()
    }

    fun loadNightModeState(): Boolean? {
        return mySharedPerf.getBoolean("Night Mode", false)
    }
}
