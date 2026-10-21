package com.finalshell.core;

import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;

public class Wb4 extends Wc2{
   public final AbstractButton w;
   public final int z;

   public Wb4(AbstractButton var1) {
      this(var1, 0);
   }

   public Wb4(AbstractButton var1, int var2) {
      this.w = var1;
      this.z = var2;
   }

   @Override
   public void j(KeyEvent var1) {
      this.w.doClick(this.z);
   }
}





