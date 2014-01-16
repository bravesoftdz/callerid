package com.example.callerid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class PhoneStateReceiver extends BroadcastReceiver {

	@Override
    public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Hello world!", Toast.LENGTH_LONG).show();
		if (intent!=null && intent.getAction().equals(TelephonyManager.ACTION_PHONE_STATE_CHANGED)) {
           // TODO 
        }
    }
}
