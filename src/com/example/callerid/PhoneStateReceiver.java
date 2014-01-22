package com.example.callerid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PhoneStateReceiver extends BroadcastReceiver{

	@Override
    public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Hello world!", Toast.LENGTH_LONG).show();
		
		// TODO implement
	}
	
	protected boolean isHidden(String number) {
		throw new UnsupportedOperationException(); // TODO implement
	}
	
	protected boolean isNorwegian(String number) {
		throw new UnsupportedOperationException(); // TODO implement
	}
	
	protected boolean isOnline(Context context) {
		throw new UnsupportedOperationException(); // TODO implement
	}
	
	protected boolean isKnownContact(Context context, String number) {
		throw new UnsupportedOperationException(); // TODO implement
	}
}

