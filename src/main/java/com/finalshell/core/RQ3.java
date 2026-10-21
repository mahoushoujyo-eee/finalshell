package com.finalshell.core;

import com.finalshell.ui.model.CQ3;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import javax.swing.JTree;

public class RQ3 extends V5_2 {
   protected CQ3 v;

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      String[] var10000 = com.finalshell.ui.model.GQ.W();
      this.v = (CQ3)var2;
      Ne4 var8 = (Ne4)super.getTreeCellEditorComponent(var1, var2, var3, var4, var5, var6);
      var8.setText(this.v.w());
      String[] var7 = var10000;
      if (var7 == null) {
         Ky4.K(new String[5]);
      }

      return var8;
   }

   @Override
   public Object getCellEditorValue() {
      this.v.v(this.m.G().toString());
      return this.v;
   }
}





