package com.apple.eawt;

public interface SystemSleepListener extends AppEventListener {
   void systemAboutToSleep(SystemSleepEvent var1);

   void systemAwoke(SystemSleepEvent var1);
}





