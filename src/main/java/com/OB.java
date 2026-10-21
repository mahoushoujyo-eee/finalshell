package com;

import java.awt.Component;
import java.io.File;
import javax.swing.JList;

class OB extends com.Oq_2 {
   final com.kd_4 l;

   OB(com.kd_4 var1) {
      this.l = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      com.OS var6 = (com.OS)super.getListCellRendererComponent(var1, var2, var3, var4, var5);
      File var7 = (File)var2;
      var6.setIcon(com.Cz_2.B(var7));
      String var8 = com.Cz_2.X(var7);
      var6.setText(com.Cz_2.b(var8, com.kd_4.L(this.l)));
      return var6;
   }
}





