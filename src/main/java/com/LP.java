package com;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public abstract class LP extends com.Lz_2 {
   private final com.og_4 m;

   public LP(com.og_4 var1) {
      this.m = var1;
   }

   public com.og_4 J() {
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
   public Boolean d(JComponent var1) {
      return this.m.d(var1);
   }

   @Override
   public Dimension d$Dimension(JComponent var1) {
      return this.m.d(var1);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.m.B(var1);
   }

   @Override
   public void A(p5_2 var1) {
      this.m.A(var1);
   }

   @Override
   public void E(p5_2 var1) {
      this.m.E(var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.m.u(var1, var2, var3);
   }
}





