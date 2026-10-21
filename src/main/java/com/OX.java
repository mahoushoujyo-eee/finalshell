package com;

import java.awt.Dimension;

class OX extends com.O_ {
   final com.D2 Y;

   OX(com.D2 var1, String var2, int var3, Object[] var4) {
      super(var2, var3, var4);
      this.Y = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      var1.width = 0;
      return var1;
   }
}





