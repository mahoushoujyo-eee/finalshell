package com.finalshell.core;

import java.awt.Component;
import javax.swing.JList;

public class W32 extends WO3 {
   @Override
   public Component j(JList var1, int var2, Object var3) {
      Ne4 var5;
      String var6;
      label14: {
         int var10000 = WO3.f();
         var5 = Ne4.r(true, Wx4.n, Wx4.y);
         var5.c$void(false);
         int var4 = var10000;
         var6 = (String)var3;
         if (var4 == 0) {
            if (var3 == null) {
               var6 = "";
               break label14;
            }

            var6 = (String)var3;
         }

         var6 = var6.toString();
      }

      var5.setText(var6);
      var5.selectAll();
      return var5;
   }

   @Override
   public Object E(JList var1, int var2, Object var3) {
      return ((Ne4)this.d).getText();
   }
}





