package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class V implements ActionListener {
   final com.Z.T Q;

   V(com.Z.T var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.Z.T.v();
      com.Z.T var10000 = this.Q;
      if (var2 == null) {
         if (!(Boolean)this.Q.N.J()) {
            return;
         }

         var10000 = this.Q;
      }

      if (var2 == null) {
         if (var10000.S == null) {
            return;
         }

         var10000 = this.Q;
      }

      var10000.M(this.Q.S.getParentFile(), d_2.toolbar);
   }
}





