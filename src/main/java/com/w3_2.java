package com;

import java.awt.Component;
import javax.swing.JList;

public class w3_2 extends wO_3 {
   @Override
   protected Component j(JList var1, int var2, Object var3) {
      ne_4 var5;
      String var6;
      label14: {
         int var10000 = wO_3.f();
         var5 = ne_4.r(true, wx_4.n, wx_4.y);
         var5.c(false);
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
      return ((ne_4)this.d).getText();
   }
}





