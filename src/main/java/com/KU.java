package com;

import java.awt.Dimension;

class KU extends com.KD {
   final com.KD h;
   final com.Qq_2 J;

   KU(com.Qq_2 var1, com.KD var2) {
      this.J = var1;
      this.h = var2;
   }

   @Override
   public Dimension getPreferredSize() {
      return this.h.getSize();
   }
}





