package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.AbstractButton;

public class R implements E_2 {
   public final Rectangle v;
   public final AbstractButton m;
   public final G2 N;

   public R(G2 var1, Rectangle var2, AbstractButton var3) {
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





