package com;

import javax.swing.JComponent;
import javax.swing.JFileChooser;

public class e7_2 extends e1_2 {
   public void t(JFileChooser var1, String var2, G9 var3, Object[] var4) {
      var1.setDialogTitle(this.q(var3, var4));
   }

   @Override
   public void L(JComponent var1, String var2, G9 var3, Object[] var4) {
      this.t((JFileChooser)var1, var2, var3, var4);
   }
}





