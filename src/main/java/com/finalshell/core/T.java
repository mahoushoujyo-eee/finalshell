package com.finalshell.core;

import javax.swing.Icon;

public class T extends KD {
   final D E;

   T(D var1, Icon var2) {
      super(var2);
      this.E = var1;
   }

   @Override
   public Icon getIcon() {
      return this.E.j$boolean() ? D.K : D.i;
   }

   @Override
   public Icon getRolloverIcon() {
      return this.E.j$boolean() ? D.H : D.w;
   }
}





