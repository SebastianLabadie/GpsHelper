package com.example.backgroundlocation

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.master.locationhelper.LocationHelper

class LocationUpdateReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.i("LOCATION_UPDATE", "Speed:${LocationHelper.getSpeed(intent)},Altitude:${LocationHelper.getAltitude(intent)}, Time: ${LocationHelper.getTime(intent)}")
    }
}