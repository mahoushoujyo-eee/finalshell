package com.C;

import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.AbstractButton;

class R implements com.E {
   final Rectangle v;
   final AbstractButton m;
   final com.C.g_2 N;

   R(com.C.g_2 var1, Rectangle var2, AbstractButton var3) {
      this.N = var1;
      this.v = var2;
      this.m = var3;
   }

   public Shape H() {
      return this.N.d(this.v, this.m);
   }

   @Override
   public Object J() {
      return this.H();
   }
}





