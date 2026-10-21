package com.finalshell.core;

import com.finalshell.ui.panel.Qq2;
import java.awt.Dimension;

public class KU_2 extends KD {
   public final KD h;
   public final Qq2 J;

   public KU_2(Qq2 var1, KD var2) {
      this.J = var1;
      this.h = var2;
   }

   @Override
   public Dimension getPreferredSize() {
      return this.h.getSize();
   }
}





