package com.apple.eawt;

import java.util.EventListener;

@Deprecated
public interface ApplicationListener extends EventListener {
   @Deprecated
   void handleAbout(ApplicationEvent var1);

   @Deprecated
   void handleOpenApplication(ApplicationEvent var1);

   @Deprecated
   void handleOpenFile(ApplicationEvent var1);

   @Deprecated
   void handlePreferences(ApplicationEvent var1);

   @Deprecated
   void handlePrintFile(ApplicationEvent var1);

   @Deprecated
   void handleQuit(ApplicationEvent var1);

   @Deprecated
   void handleReOpenApplication(ApplicationEvent var1);
}





