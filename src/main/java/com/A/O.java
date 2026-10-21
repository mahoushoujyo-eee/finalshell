package com.A;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class O extends ComponentAdapter {
   final V V;
   final com.A.d p;
   private static final long a;

   O(com.A.d var1, V var2) {
      this.p = var1;
      this.V = var2;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int[] var2 = com.A.y_2.M();
      V var10000 = this.V;
      int var10001 = this.V.k().width;
      if (var2 != null) {
         var10001 = var10001 > this.V.getWidth() ? (int)a : 0;
      }

      var10000.setHorizontalAlignment(var10001);
   }

   static {
      long var0 = 4724208833045813334L;
      long var10002 = -8276562424967636900L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





