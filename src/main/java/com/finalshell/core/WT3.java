package com.finalshell.core;

import java.awt.Component;
import javax.swing.JList;

public class WT3 extends Q3 {
   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      V3 var6 = (V3)var2;
      com.finalshell.ui.panel.U var7 = (com.finalshell.ui.panel.U)super.getListCellRendererComponent(var1, "", var3, var4, var5);
      var7.setIcon(var6.b());
      var7.setText(var6.getDescription());
      return var7;
   }
}





