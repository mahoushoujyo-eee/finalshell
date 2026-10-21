package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class B implements ActionListener {
   final com.Z.T V;

   B(com.Z.T var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.Z.T.v();
      com.Z.T var10000 = this.V;
      if (var2 == null) {
         if (!(Boolean)this.V.N.J()) {
            return;
         }

         var10000 = this.V;
      }

      var10000.a(this.V.e + 1);
   }
}





