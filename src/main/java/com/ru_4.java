package com;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

class ru_4 implements AWTEventListener {
   final com.Wd_2 m;
   private static final long a;

   ru_4(com.Wd_2 var1) {
      this.m = var1;
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      com.ky_4[] var2 = com.ac_2.n();
      int var10000 = var1 instanceof MouseEvent;
      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getID();
      }

      if (var10000 == (int)a) {
         this.m.j();
      }
   }

   static {
      long var0 = 606289005203035879L;
      long var10002 = -7532062069481662702L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





