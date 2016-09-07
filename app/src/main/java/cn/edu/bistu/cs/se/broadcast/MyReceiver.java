package cn.edu.bistu.cs.se.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    public void onReceive(Context context, Intent intent) {
        String strMsg=intent.getStringExtra("broadcastmsg");
        Toast.makeText(context,strMsg, Toast.LENGTH_LONG).show();
    }
}
