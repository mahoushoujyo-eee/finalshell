package com;

import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

public class e8_2 extends e1_2 {
   public void M(JTextComponent var1, String var2, G9 var3, Object[] var4) {
      String var5 = this.q(var3, var4);
      if (var5 != null) {
         var1.setText(var5);
      }
   }

   @Override
   public void L(JComponent var1, String var2, G9 var3, Object[] var4) {
      this.M((JTextComponent)var1, var2, var3, var4);
   }
}





