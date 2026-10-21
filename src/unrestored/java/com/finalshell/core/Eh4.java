package com.finalshell.core;

import com.finalshell.ui.panel.K32;
import javax.swing.JComponent;

public class Eh4 extends E12 {
   public void T(K32 var1, String var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      String[] var10000 = E12.A();
      String var6 = this.q(var3, var4);
      String[] var5 = var10000;
      String var10001 = var6;
      if (var5 != null) {
         var10001 = var6 != null ? var6 : null;
      }

      var1.u(var10001);
   }

   @Override
   public void L(JComponent var1, String var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      this.T((K32)var1, var2, var3, var4);
   }
}





