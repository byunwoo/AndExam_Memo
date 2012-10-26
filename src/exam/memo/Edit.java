package exam.memo;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class Edit extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);
    }

    public void mOnClick(View v) {
    	Intent intent;
    	switch (v.getId()) {
    	case R.id.btncamera:
    		intent = new Intent("exam.camera.TAKEPICTURE");
    		intent.putExtra("caller", "Memo");
    		//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    		startActivity(intent);
    		break;
    	case R.id.btnsetting:
    		intent = new Intent(Edit.this, Setting.class);
    		//intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    		startActivity(intent);
    		break;
    	}
    }
}