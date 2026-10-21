package com;

import java.awt.Rectangle;
import javax.swing.JComponent;

public abstract class Yf_2 extends com.Yi_2 {
   public Rectangle d(com.CI var1, Object var2, int var3, int var4, boolean var5) {
      Rectangle var6 = var1.getCellBounds(var3, var3);
      return var6.intersection(var1.getVisibleRect());
   }

   protected Object j(com.CI var1, int var2, int var3) {
      return var1.D(var2);
   }

   protected boolean p(com.CI var1, int var2, int var3) {
      return var1.isSelectedIndex(var2);
   }

   @Override
   protected boolean M(JComponent var1, int var2, int var3) {
      return this.p((com.CI)var1, var2, var3);
   }

   @Override
   protected Object c(JComponent var1, int var2, int var3) {
      return this.j((com.CI)var1, var2, var3);
   }

   @Override
   public Rectangle E(JComponent var1, Object var2, int var3, int var4, boolean var5) {
      return this.d((com.CI)var1, var2, var3, var4, var5);
   }
}





