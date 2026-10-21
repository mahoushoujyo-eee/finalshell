package com;

import javax.swing.JRootPane;

class Gm_2 extends JRootPane {
   private boolean X;
   final com.D3 j;

   Gm_2(com.D3 var1) {
      this.j = var1;
      this.X = false;
   }

   @Override
   public void validate() {
      String var10000 = xT_3.l();
      super.validate();
      String var1 = var10000;
      Gm_2 var2 = this;
      if (var1 != null) {
         if (this.X) {
            return;
         }

         this.X = true;
         this.j.pack();
         var2 = this;
      }

      var2.X = false;
   }
}





