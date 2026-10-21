package com;

import java.awt.Component;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JList;

class OY extends com.Oq_2 {
   final Ic_2 a;

   OY(Ic_2 var1) {
      this.a = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      JLabel var6 = (JLabel)super.getListCellRendererComponent(var1, var2, var3, var4, var5);
      var6.setIcon(com.Cz_2.B((File)var2));
      var6.setText(com.Cz_2.X((File)var2));
      return var6;
   }
}





