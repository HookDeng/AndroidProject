package com.acastor.hiddencamera;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class CameraRecorder extends Activity implements SurfaceHolder.Callback {
	private static final String TAG = "Recorder";
	public static SurfaceView mSurfaceView;
	public static SurfaceHolder mSurfaceHolder;
	public static Camera mCamera;
	public static boolean mPreviewRunning;
	public static Boolean isRunningApp;
	
	Button btnStart;
	Button btnStop;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// hide the window title.
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        // hide the status bar and other OS-level chrome
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    	
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
		mSurfaceView = (SurfaceView) findViewById(R.id.surfaceView1);
		//mSurfaceView.setVisibility(View.GONE);
		mSurfaceHolder = mSurfaceView.getHolder();
		mSurfaceHolder.addCallback(this);
		mSurfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
		
		btnStart = (Button) findViewById(R.id.StartService);
		btnStop = (Button) findViewById(R.id.StopService);
		
		if(isRunningApp == null){
			isRunningApp = false;
			checkIfRunning(isRunningApp);
		}
		else if(isRunningApp == true){
			isRunningApp = true;
			checkIfRunning(isRunningApp);
		}
		
		else if(isRunningApp == false){
			isRunningApp = false;
			checkIfRunning(isRunningApp);
		}
		
		btnStart.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				//visible and hidden
				Intent intent = new Intent(CameraRecorder.this, RecorderService.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startService(intent);
				
				isRunningApp = true;
				checkIfRunning(isRunningApp);
				finish();
			}
		});

		
		btnStop.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				isRunningApp = false;
				checkIfRunning(isRunningApp);
				stopService(new Intent(CameraRecorder.this, RecorderService.class));
			}
		});
    }
    
    public void checkIfRunning(Boolean check){
    	if(check == true){
    		btnStart.setVisibility(View.GONE);
    		btnStop.setVisibility(View.VISIBLE);
    	}
    	else
    	{
    		btnStart.setVisibility(View.VISIBLE);
    		btnStop.setVisibility(View.GONE);
    	}
    }
    
	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
	}
	
	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		// TODO Auto-generated method stub

	}
}