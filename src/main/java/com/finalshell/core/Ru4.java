package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

public class Ru4 implements AWTEventListener {
   final com.finalshell.ui.panel.Wd2 m;
   public static long a;

   Ru4(com.finalshell.ui.panel.Wd2 var1) {
      this.m = var1;
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      Ky4[] var2 = Ac2.n();
      int var10000 = (var1 instanceof MouseEvent) ? 1 : 0;
      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getID();
      }

      if (var10000 == (int)a) {
         this.m.j$void();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 606289005203035879L;
      long var10002 = -7532062069481662702L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





