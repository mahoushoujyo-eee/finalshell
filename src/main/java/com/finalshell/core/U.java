package com.finalshell.core;

import java.awt.Dimension;
import java.awt.Shape;
import javax.swing.JComponent;

public class U implements E_2 {
   public final JComponent v;
   public final Dimension C;
   public final boolean U;
   public final W_2 p;

   public U(W_2 var1, JComponent var2, Dimension var3, boolean var4) {
      this.p = var1;
      this.v = var2;
      this.C = var3;
      this.U = var4;
   }

   public Shape Z() {
      return this.p.a(this.v, this.C, this.U);
   }

   @Override
   public Object J() {
      return this.Z();
   }
}





