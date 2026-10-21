package com.finalshell.core;

import javax.swing.Action;
import javax.swing.Icon;

public class KR extends KD implements ND {
   public boolean E;
   public float P;

   public KR() {
      this.X();
   }

   public KR(Icon var1) {
      super(var1);
      this.X();
   }

   public KR(String var1) {
      super(var1);
      this.X();
   }

   public KR(Action var1) {
      super(var1);
      this.X();
   }

   public KR(String var1, Icon var2) {
      super(var1, var2);
      this.X();
   }

   public void X() {
      this.setMargin(OT3.o);
      this.O(0);
      this.U(new X());
   }

   @Override
   public void o(boolean var1) {
      this.E = var1;
      this.repaint();
   }

   @Override
   public boolean D$boolean() {
      return this.E;
   }

   @Override
   public void w(float var1) {
      this.P = var1;
      this.repaint();
   }

   @Override
   public float D$float() {
      return this.P;
   }

   @Override
   public boolean contains(int var1, int var2) {
      return QC.q(this, var1, var2);
   }
}





