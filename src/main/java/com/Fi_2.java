package com;

import java.awt.Component;
import javax.swing.event.AncestorEvent;

class Fi_2 extends com.FY {
   final Component Z;
   final int H;
   final int j;
   final int E;
   final int m;
   final com.QX d;

   Fi_2(com.QX var1, Component var2, int var3, int var4, int var5, int var6) {
      this.d = var1;
      this.Z = var2;
      this.H = var3;
      this.j = var4;
      this.E = var5;
      this.m = var6;
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.d.k(this.Z, this.H, this.j, this.E, this.m);
   }
}





