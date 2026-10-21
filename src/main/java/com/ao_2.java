package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ao_2 extends MouseAdapter {
   protected boolean h;
   final com.BX A;
   final Hd_2 q;

   ao_2(com.BX var1, Hd_2 var2) {
      this.A = var1;
      this.q = var2;
      this.h = false;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var10001;
      label22: {
         label24: {
            String[] var2 = com.BX.B();
            var10001 = this.A.z().Y();
            if (var2 == null) {
               if (!var10001) {
                  break label24;
               }

               var10001 = com.FN.B(var1);
            }

            if (var2 != null) {
               break label22;
            }

            if (var10001) {
               var10001 = true;
               break label22;
            }
         }

         var10001 = false;
      }

      this.h = var10001;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      String[] var2 = com.BX.B();
      com.ao_2 var10000 = this;
      if (var2 == null) {
         if (!this.h) {
            return;
         }

         this.h = false;
         var10000 = this;
      }

      var10000.q.getTransferHandler().exportAsDrag(this.q, var1, 2);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.h = false;
   }
}





