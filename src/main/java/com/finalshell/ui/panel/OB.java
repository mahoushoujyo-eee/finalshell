package com.finalshell.ui.panel;

import com.finalshell.core.Cz2;
import java.awt.Component;
import javax.swing.JList;

public class OB extends Oq2 {
   public final Kd4 l;

   public OB(Kd4 var1) {
      this.l = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      OS var6 = (OS)super.getListCellRendererComponent(var1, var2, var3, var4, var5);
      java.io.File var7 = (java.io.File)var2;
      var6.setIcon(Cz2.B(var7));
      String var8 = Cz2.X(var7);
      var6.setText(Cz2.b(var8, Kd4.L(this.l)));
      return var6;
   }
}





