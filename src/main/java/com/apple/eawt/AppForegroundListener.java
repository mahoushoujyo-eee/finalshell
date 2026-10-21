package com.apple.eawt;

public interface AppForegroundListener extends AppEventListener {
   void appRaisedToForeground(AppForegroundEvent var1);

   void appMovedToBackground(AppForegroundEvent var1);
}





