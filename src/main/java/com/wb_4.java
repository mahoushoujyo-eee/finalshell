package com;

import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;

public class wb_4 implements com.Wc_2 {
   private final AbstractButton w;
   private final int z;

   public wb_4(AbstractButton var1) {
      this(var1, 0);
   }

   public wb_4(AbstractButton var1, int var2) {
      this.w = var1;
      this.z = var2;
   }

   @Override
   public void j(KeyEvent var1) {
      this.w.doClick(this.z);
   }
}





