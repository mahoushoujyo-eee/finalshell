package com.C;

import java.awt.Dimension;
import java.awt.Shape;
import javax.swing.JComponent;

class l_2 implements com.E {
   final JComponent u;
   final Dimension M;
   final boolean m;
   final com.C.W V;

   l_2(com.C.W var1, JComponent var2, Dimension var3, boolean var4) {
      this.V = var1;
      this.u = var2;
      this.M = var3;
      this.m = var4;
   }

   public Shape H() {
      return this.V.G(this.u, this.M, this.m);
   }

   @Override
   public Object J() {
      return this.H();
   }
}





