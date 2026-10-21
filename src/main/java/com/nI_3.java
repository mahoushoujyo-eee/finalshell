package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

class nI_3 extends MouseAdapter {
   final com.Fm_2 Q;
   private static final long a;

   nI_3(com.Fm_2 var1) {
      this.Q = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      JCheckBox var4;
      label22: {
         boolean var10000 = uE.Z();
         this.Q.m = true;
         boolean var2 = var10000;
         com.Fm_2 var3 = this.Q;
         if (!var2) {
            if (this.Q.O()) {
               var4 = this.Q.U;
               if (var2) {
                  break label22;
               }

               if (this.Q.U.isEnabled()) {
                  this.Q.g.u();
                  if (!var2) {
                     return;
                  }
               }
            }

            this.Q.G = (int)a;
            var3 = this.Q;
         }

         var4 = var3.U;
      }

      var4.repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      JCheckBox var4;
      label22: {
         boolean var10000 = uE.o();
         this.Q.m = false;
         boolean var2 = var10000;
         com.Fm_2 var3 = this.Q;
         if (var2) {
            if (this.Q.O()) {
               var4 = this.Q.U;
               if (!var2) {
                  break label22;
               }

               if (this.Q.U.isEnabled()) {
                  this.Q.g.u();
                  if (var2) {
                     return;
                  }
               }
            }

            this.Q.G = 0;
            var3 = this.Q;
         }

         var4 = var3.U;
      }

      var4.repaint();
   }

   static {
      long var0 = 9020231411107979109L;
      long var10002 = 1355524042721419104L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





