package com;

import java.awt.event.KeyEvent;
import java.util.List;

class uP implements com.Wc_2 {
   @Override
   public void j(KeyEvent var1) {
      String var3 = i2_2.X();
      List var4 = i2_2.Q();
      String[] var10000 = xD_3.U();
      int var5 = var4.indexOf(var3);
      String[] var2 = var10000;
      int var6 = var5;
      int var10001 = -1;
      if (var2 == null) {
         if (var5 == -1) {
            return;
         }

         var6 = var5;
         var10001 = var4.size() - 1;
      }

      i2_2.d(var6 < var10001 ? (String)var4.get(var5 + 1) : (String)var4.get(0));
   }
}





