package exam.memo;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class Setting extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
    }

    public void mOnClick(View v) {
    	switch (v.getId()) {
    	case R.id.btnedit:
    		startActivity(new Intent(Setting.this, Edit.class));
    		break;
    	}
    }
}