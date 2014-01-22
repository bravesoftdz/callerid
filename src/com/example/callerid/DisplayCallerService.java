package com.example.callerid;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

public class DisplayCallerService extends Service{
	protected View view;

    @Override
    public void onCreate() {
        super.onCreate();
        
        WindowManager.LayoutParams params = setupLayoutParams();
        WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
        wm.addView(view, params);
    }

	private WindowManager.LayoutParams setupLayoutParams() {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.caller_id, null);
        
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY,
                WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                PixelFormat.TRANSLUCENT);
        
        // TODO move view to top of screen
		return params;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		String phoneNum = getNumber(intent);
		updateViewWithCallerNumber(phoneNum);
		// TODO fetch name from number, update view. Hint: view.findViewById(R.id.number)
		
		return START_STICKY;
	}
	
	protected String getNumber(Intent intent){
		throw new UnsupportedOperationException(); // TODO implement
	}
	
    protected void updateViewWithCallerNumber(String phoneNum){
    	throw new UnsupportedOperationException(); // TODO implement
    }
	
	protected void updateViewWithCallerName(String name){
		throw new UnsupportedOperationException(); // TODO implement
	}
	
	/**
	 * Binding not needed. Must be implemented.
	 * Leave as is.
	 */
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}