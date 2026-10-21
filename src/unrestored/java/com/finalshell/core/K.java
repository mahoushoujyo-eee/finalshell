package com.finalshell.core;

import java.awt.Dimension;
import java.awt.Shape;
import javax.swing.JComponent;

public class K implements E_2 {
   public final JComponent d;
   public final Dimension S;
   public final boolean V;
   public final W_2 t;

   public K(W_2 var1, JComponent var2, Dimension var3, boolean var4) {
      this.t = var1;
      this.d = var2;
      this.S = var3;
      this.V = var4;
   }

   public Shape y() {
      return this.t.E(this.d, this.S, this.V);
   }

   @Override
   public Object J() {
      return this.y();
   }
}





