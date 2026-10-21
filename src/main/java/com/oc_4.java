package com;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

class oc_4 implements AWTEventListener {
   final com.QB A;
   private static final long a;

   oc_4(com.QB var1) {
      this.A = var1;
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      int[] var2 = com.WC.V();
      if (this.A.V) {
         MouseEvent var3 = (MouseEvent)var1;
         MouseEvent var10000 = var3;
         if (var2 == null) {
            if (var3.getID() != (int)a) {
               return;
            }

            var10000 = var3;
         }

         Component var4 = var10000.getComponent();
         if (var2 == null && !this.A.isAncestorOf(var4)) {
            this.A.l();
         }
      }
   }

   static {
      long var0 = 7339144256436590010L;
      long var10002 = 8996742285387387983L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





