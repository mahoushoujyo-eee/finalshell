package com.finalshell.core;

import com.finalshell.ui.panel.XW3;
import java.awt.Component;

public class Qd2_2 implements T5 {
   final XW3 q;

   Qd2_2(XW3 var1) {
      this.q = var1;
   }

   @Override
   public void S(Component var1) {
      XW3.w(this.q).o(var1);
   }

   @Override
   public void Z(int var1, String var2) {
      String[] var3 = com.finalshell.ui.panel.Cn2.Q$arrString();
      WH3 var10000 = com.finalshell.ui.panel.Cn2.l(this.q.u);
      if (var3 != null) {
         if (var10000 == null) {
            return;
         }

         var10000 = com.finalshell.ui.panel.Cn2.l(this.q.u);
      }

      var10000.R(var1, var2);
   }
}





