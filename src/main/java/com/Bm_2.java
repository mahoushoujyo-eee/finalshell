package com;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;

class Bm_2 implements AWTEventListener {
   private static final long a;

   @Override
   public void eventDispatched(AWTEvent var1) {
      String[] var2;
      AWTEvent var4;
      label52: {
         var2 = GR.I();
         boolean var10000 = w6_2.y;
         if (var2 != null) {
            if (!w6_2.y) {
               return;
            }

            var4 = var1;
            if (var2 == null) {
               break label52;
            }

            var10000 = var1 instanceof KeyEvent;
         }

         if (!var10000) {
            return;
         }

         var4 = var1;
      }

      KeyEvent var3 = (KeyEvent)var4;
      int var5 = var3.isConsumed();
      if (var2 != null) {
         if (var5 != 0) {
            return;
         }

         var5 = var3.getID();
      }

      label54: {
         if (var2 != null) {
            if (var5 != (int)a) {
               return;
            }

            var4 = var3;
            if (var2 == null) {
               break label54;
            }

            var5 = w6_2.g(var3);
         }

         if (var5 == 0) {
            return;
         }

         var4 = var3;
      }

      w6_2.m(var4);
   }

   static {
      long var0 = 181851864725441616L;
      long var10002 = 462804629247479233L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





