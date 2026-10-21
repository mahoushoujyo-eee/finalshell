package com.finalshell.core;

import java.awt.Dimension;
import java.awt.Shape;
import javax.swing.JComponent;

public class L2_2 implements E_2 {
   public final JComponent u;
   public final Dimension M;
   public final boolean m;
   public final W_2 V;

   public L2_2(W_2 var1, JComponent var2, Dimension var3, boolean var4) {
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





