package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class j_2 implements ActionListener {
   final com.Z.T T;

   j_2(com.Z.T var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.Z.T.v();
      com.Z.T var10000 = this.T;
      if (var2 == null) {
         if (!(Boolean)this.T.N.J()) {
            return;
         }

         var10000 = this.T;
      }

      var10000.T();
   }
}





