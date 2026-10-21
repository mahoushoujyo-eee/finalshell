package com.finalshell.core;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public abstract class LP extends Lz2_2 {
   public final Og4 m;

   public LP(Og4 var1) {
      this.m = var1;
   }

   public Og4 J() {
      return this.m;
   }

   @Override
   public void A(JComponent var1) {
      this.m.A(var1);
   }

   @Override
   public void X(JComponent var1) {
      this.m.X(var1);
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.m.d$Boolean(var1);
   }

   @Override
   public Dimension d$Dimension(JComponent var1) {
      return this.m.d$Dimension(var1);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.m.B(var1);
   }

   @Override
   public void A(P52 var1) {
      this.m.A(var1);
   }

   @Override
   public void E(P52 var1) {
      this.m.E(var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.m.u(var1, var2, var3);
   }
}





