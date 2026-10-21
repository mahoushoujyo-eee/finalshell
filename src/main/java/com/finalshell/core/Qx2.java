package com.finalshell.core;

import javax.swing.Action;
import javax.swing.Icon;

public class Qx2 extends Qe2_2 implements ND {
   protected boolean J;
   protected float x;

   public Qx2() {
      this.H();
   }

   public Qx2(Icon var1) {
      super(var1);
      this.H();
   }

   public Qx2(String var1) {
      super(var1);
      this.H();
   }

   public Qx2(Action var1) {
      super(var1);
      this.H();
   }

   public Qx2(String var1, Icon var2) {
      super(var1, var2);
      this.H();
   }

   public void H() {
      this.setMargin(OT3.o);
      this.K(0);
      this.V(new A2_2());
   }

   @Override
   public void o(boolean var1) {
      this.J = var1;
      this.repaint();
   }

   @Override
   public boolean D$boolean() {
      return this.J;
   }

   @Override
   public void w(float var1) {
      this.x = var1;
      this.repaint();
   }

   @Override
   public float D$float() {
      return this.x;
   }

   @Override
   public boolean contains(int var1, int var2) {
      return QC.q(this, var1, var2);
   }
}





