package com.A;

import javax.swing.Icon;

class T extends com.KD {
   final com.A.d E;

   T(com.A.d var1, Icon var2) {
      super(var2);
      this.E = var1;
   }

   @Override
   public Icon getIcon() {
      return this.E.j() ? com.A.d.K : com.A.d.i;
   }

   @Override
   public Icon getRolloverIcon() {
      return this.E.j() ? com.A.d.H : com.A.d.w;
   }
}





