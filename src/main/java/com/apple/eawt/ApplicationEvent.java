package com.apple.eawt;

import java.util.EventObject;

@Deprecated
public class ApplicationEvent extends EventObject {
   public String fFilename;
   public boolean fHandled;

   public ApplicationEvent(Object o) {
      super(o);
   }

   public ApplicationEvent(Object o, String s) {
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





