package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class XR extends KeyAdapter {
   final com.CC q;

   protected XR(com.CC var1) {
      this.q = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String var2 = com.Co_2.U();
      int var10000 = GR.rN.J(var1);
      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.q.getSelectedIndex();
      }

      label41: {
         if (var2 != null) {
            if (var10000 == -1) {
               return;
            }

            var7 = this.q;
            if (var2 == null) {
               break label41;
            }

            var10000 = this.q.isEnabled();
         }

         if (var10000 == 0) {
            return;
         }

         var7 = this.q;
      }

      for (int var6 : var7.getSelectedIndices()) {
         this.q.x(var6);
         if (var2 == null) {
            break;
         }
      }
   }
}





