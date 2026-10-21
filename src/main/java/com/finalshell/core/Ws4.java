package com.finalshell.core;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JList;

public class Ws4 extends WO3 {
   protected Ne4 R(JList var1, int var2, Uv2 var3) {
      Ne4 var5;
      String var6;
      label14: {
         String var10000 = com.finalshell.ui.panel.Co2.U$String();
         var5 = Ne4.r(true, Wx4.n, Wx4.y);
         var5.c$void(false);
         String var4 = var10000;
         var6 = (String)var3.g();
         if (var4 != null) {
            if (var6 == null) {
               var6 = "";
               break label14;
            }

            var6 = (String)var3.g();
         }

         var6 = var6.toString();
      }

      var5.setText(var6);
      var5.selectAll();
      return var5;
   }

   protected Rectangle e(JList var1, int var2, Uv2 var3, Rectangle var4) {
      Ui2 var5 = ((com.finalshell.ui.panel.CC)var1).A$ii_4().m(var3);
      Rectangle var6 = var5.M().u$Rectangle();
      int var7 = var6.x + var6.width + var5.getIconTextGap() - ((Ne4)this.d).getInsets().left;
      return new Rectangle(var7, 0, var4.width - var7, var4.height);
   }

   public Uv2 H(JList var1, int var2, Uv2 var3) {
      var3.P(((Ne4)this.d).getText());
      return var3;
   }

   @Override
   protected Rectangle O(JList var1, int var2, Object var3, Rectangle var4) {
      return this.e(var1, var2, (Uv2)var3, var4);
   }

   @Override
   protected Component j(JList var1, int var2, Object var3) {
      return this.R(var1, var2, (Uv2)var3);
   }

   @Override
   public Object E(JList var1, int var2, Object var3) {
      return this.H(var1, var2, (Uv2)var3);
   }
}





