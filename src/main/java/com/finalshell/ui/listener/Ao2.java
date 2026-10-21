package com.finalshell.ui.listener;

import com.finalshell.core.BX;
import com.finalshell.core.FN;
import com.finalshell.ui.panel.Hd2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ao2 extends MouseAdapter {
   public boolean h;
   public final BX A;
   public final Hd2 q;

   public Ao2(BX var1, Hd2 var2) {
      this.A = var1;
      this.q = var2;
      this.h = false;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var10001;
      label22: {
         label24: {
            String[] var2 = BX.B$arrString();
            var10001 = this.A.z$QL().Y();
            if (var2 == null) {
               if (!var10001) {
                  break label24;
               }

               var10001 = FN.B(var1);
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
      String[] var2 = BX.B$arrString();
      Ao2 var10000 = this;
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





