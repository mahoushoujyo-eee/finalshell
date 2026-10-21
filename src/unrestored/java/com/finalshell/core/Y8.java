package com.finalshell.core;

import com.finalshell.ui.model.WF;
import java.awt.Rectangle;
import javax.swing.JComponent;

public abstract class Y8 extends Yi2 {
   public Rectangle s(PQ var1, Object var2, int var3, int var4, boolean var5) {
      Rectangle var6 = var1.getCellRect(var3, var4, false);
      return var6.intersection(var1.getVisibleRect());
   }

   public WF K(PQ var1, Object var2, int var3, int var4, boolean var5) {
      return WF.down;
   }

   public Object n(PQ var1, int var2, int var3) {
      return var1.getValueAt(var2, var3);
   }

   public boolean H(PQ var1, int var2, int var3) {
      return var1.isCellSelected(var2, var3);
   }

   @Override
   public boolean M(JComponent var1, int var2, int var3) {
      return this.H((PQ)var1, var2, var3);
   }

   @Override
   public Object c(JComponent var1, int var2, int var3) {
      return this.n((PQ)var1, var2, var3);
   }

   @Override
   public WF h(JComponent var1, Object var2, int var3, int var4, boolean var5) {
      return this.K((PQ)var1, var2, var3, var4, var5);
   }

   @Override
   public Rectangle E(JComponent var1, Object var2, int var3, int var4, boolean var5) {
      return this.s((PQ)var1, var2, var3, var4, var5);
   }
}





