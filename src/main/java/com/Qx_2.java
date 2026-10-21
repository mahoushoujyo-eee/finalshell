package com;

import javax.swing.Action;
import javax.swing.Icon;

public class Qx_2 extends com.Qe_2 implements ND {
   protected boolean J;
   protected float x;

   public Qx_2() {
      this.H();
   }

   public Qx_2(Icon var1) {
      super(var1);
      this.H();
   }

   public Qx_2(String var1) {
      super(var1);
      this.H();
   }

   public Qx_2(Action var1) {
      super(var1);
      this.H();
   }

   public Qx_2(String var1, Icon var2) {
      super(var1, var2);
      this.H();
   }

   private void H() {
      this.setMargin(com.oT_3.o);
      this.K(0);
      this.V(new com.C.a_2());
   }

   @Override
   public void o(boolean var1) {
      this.J = var1;
      this.repaint();
   }

   @Override
   public boolean D() {
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
      return com.QC.q(this, var1, var2);
   }
}





