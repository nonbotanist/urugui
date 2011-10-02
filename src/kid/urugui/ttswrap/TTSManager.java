package kid.urugui.ttswrap;

import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;


public class TTSManager implements OnInitListener {
	public final static int CHECKED_CODE = 12345678;
	public final static int PASS_CODE=TextToSpeech.Engine.CHECK_VOICE_DATA_PASS;
	private TextToSpeech mTts;  
	
	public TTSManager(Context ctx){
		mTts = new TextToSpeech(ctx, this); 
	}
	public static void checkTTS(Activity act){
		Intent checkIntent = new Intent();
		checkIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        act.startActivityForResult(checkIntent, CHECKED_CODE);
	}
	public void onInit(int arg0) {
		if(arg0 == TextToSpeech.SUCCESS){
			int result = mTts.setLanguage(Locale.US);
		}
	}
	public void shutdown(){
		mTts.shutdown();
	}
	public void speak(String words){
		mTts.speak(words, TextToSpeech.QUEUE_ADD, null);
	}
}
