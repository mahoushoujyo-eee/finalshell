package com.apple.eawt;

import java.util.EventObject;

@Deprecated
public class ApplicationEvent extends EventObject {
   private String fFilename;
   private boolean fHandled;

   ApplicationEvent(Object o) {
      super(o);
   }

   ApplicationEvent(Object o, String s) {
      super(o);
   }

   @Deprecated
   public boolean isHandled() {
      return false;
   }

   @Deprecated
   public void setHandled(boolean b) {
   }

   @Deprecated
   public String getFilename() {
      return null;
   }
}





