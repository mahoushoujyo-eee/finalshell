package com.finalshell.ui.panel;

import com.finalshell.core.Cz2;
import com.finalshell.ui.listener.Ic2;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;

public class OY extends Oq2 {
   public final Ic2 a;

   public OY(Ic2 var1) {
      this.a = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      JLabel var6 = (JLabel)super.getListCellRendererComponent(var1, var2, var3, var4, var5);
      var6.setIcon(Cz2.B((java.io.File)var2));
      var6.setText(Cz2.X((java.io.File)var2));
      return var6;
   }
}





