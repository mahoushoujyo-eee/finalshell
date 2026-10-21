package com.finalshell.core;

import com.finalshell.ui.frame.XD3;
import java.awt.event.KeyEvent;
import java.util.List;

public class UP extends Wc2{
   UP() {
   }

   @Override
   public void j(KeyEvent var1) {
      String var3 = I22.X$String();
      List var4 = I22.Q();
      String[] var10000 = XD3.U();
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

      I22.d(var6 < var10001 ? (String)var4.get(var5 + 1) : (String)var4.get(0));
   }
}





