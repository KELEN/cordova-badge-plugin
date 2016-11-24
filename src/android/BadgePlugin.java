package com.hkl.badge;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;
import me.leolin.shortcutbadger.ShortcutBadger;

public class BadgePlugin extends CordovaPlugin {
	
	final String LOG_TAG = "badge plugin";
	
	public BadgePlugin() {}

	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
	}

	public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if ("set".equals(action)) {
			int count = args.getInt(0);
			Log.i(LOG_TAG, "set action");
			boolean success = ShortcutBadger.applyCount(this.cordova.getActivity(), count);
			if (success) {
	        	callbackContext.success(1);
	        	Log.i(LOG_TAG, "success=true");
	        } else {
	        	callbackContext.error(0);
	        	Log.i(LOG_TAG, "success=false");
	        }
			return true;
		} 
		if ("clear".equals(action)) {
			Log.i(LOG_TAG, "clear action");
			boolean success = ShortcutBadger.removeCount(this.cordova.getActivity());
			if (success) {
	        	callbackContext.success(1);
	        	Log.i(LOG_TAG, "success=true");
	        } else {
	        	callbackContext.error(0);
	        	Log.i(LOG_TAG, "success=false");
	        }
			return true;
		}
		return false;
	}
}
