package com;

import java.awt.Dimension;

class BE extends com.By_2 {
   final com.D2 C;

   BE(com.D2 var1, int var2, int var3, int var4) {
      super(var2, var3, var4);
      this.C = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      if (com.D2.b(this.C) > 0) {
         var1.width = com.D2.b(this.C);
      }

      return var1;
   }
}





