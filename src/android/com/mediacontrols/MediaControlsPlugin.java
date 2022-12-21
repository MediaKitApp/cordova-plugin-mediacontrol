package com.mediacontrols;


import static androidx.core.content.ContextCompat.getSystemService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;


public class MediaControlsPlugin extends CordovaPlugin implements OnKeyListener {
	public static final String ACTION_SET_AUDIO_MODE = "setAudioMode";
  public static boolean Start = false;

    @Override
    public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
        if(action.equals("setModeAudio")){
            String mode = args.getString(0);
            if(!this.setModeAudio(mode)){
                return false;
            }
            return true;
        }
        return false;
    }



  public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
    Context context = webView.getContext();
    AudioManager audioManager =
      (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

    // Check if the event is equal to KEY_DOWN
    if( keyEvent.getAction() == KeyEvent.ACTION_DOWN )
    {
      // Check what button has been pressed
      if( keyCode == KeyEvent.KEYCODE_VOLUME_UP ){
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI);
        return true;
      }
      else if( keyCode == KeyEvent.KEYCODE_VOLUME_DOWN  ){
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, AudioManager.ADJUST_LOWER, AudioManager.FLAG_SHOW_UI);
        return true;
      }
    }
    return false;
  }







	public boolean setModeAudio(String mode) {
        Context context = webView.getContext();
	    AudioManager audioManager =
        (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

        if (mode.equals("normal")) {
          /* Mode Normal */
          audioManager.setMode(AudioManager.MODE_IN_CALL);
          this.webView.getView().setOnKeyListener(null);
          audioManager.setSpeakerphoneOn(false);
          return true;
        }
        if (mode.equals("speaker")) {
          /* Mode Speaker and Control Volume */
          audioManager.setMode(AudioManager.MODE_IN_CALL);
          this.webView.getView().setOnKeyListener(this);
          audioManager.setSpeakerphoneOn(true);
          return true;
        }
        return false;
    }


}
