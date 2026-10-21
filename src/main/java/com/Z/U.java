package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class U implements ActionListener {
   final com.Z.T P;

   U(com.Z.T var1) {
      this.P = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.Z.T.v();
      com.Z.T var10000 = this.P;
      if (var2 == null) {
         if (!(Boolean)this.P.N.J()) {
            return;
         }

         var10000 = this.P;
      }

      var10000.a(this.P.e - 1);
   }
}





