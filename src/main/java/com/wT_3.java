package com;

import com.b.V;
import java.awt.Component;
import javax.swing.JList;

public class wT_3 extends com.L.Q {
   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      V var6 = (V)var2;
      com.L.U var7 = (com.L.U)super.getListCellRendererComponent(var1, "", var3, var4, var5);
      var7.setIcon(var6.b());
      var7.setText(var6.getDescription());
      return var7;
   }
}





