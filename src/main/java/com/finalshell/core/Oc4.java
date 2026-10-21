package com.finalshell.core;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

public class Oc4 implements AWTEventListener {
   public final com.finalshell.ui.panel.QB A;
   public static long a;

   public Oc4(com.finalshell.ui.panel.QB var1) {
      this.A = var1;
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      int[] var2 = WC_2.V();
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
            this.A.l$QB();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7339144256436590010L;
      long var10002 = 8996742285387387983L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





