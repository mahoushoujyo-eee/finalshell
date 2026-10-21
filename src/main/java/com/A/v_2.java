package com.A;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class v_2 implements ActionListener {
   final com.A.d E;

   v_2(com.A.d var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.A.d var3;
      label26: {
         int[] var2 = com.A.y_2.M();
         boolean var10000 = this.E.u();
         if (var2 != null) {
            if (!var10000) {
               return;
            }

            var3 = this.E;
            if (var2 == null) {
               break label26;
            }

            var10000 = this.E.j();
         }

         if (var10000) {
            this.E.J();
            if (var2 != null) {
               return;
            }
         }

         var3 = this.E;
      }

      var3.p();
   }
}





