package com.finalshell.ui.listener;

import java.awt.Component;
import javax.swing.event.AncestorEvent;

public class Fi2 extends FY {
   public final Component Z;
   public final int H;
   public final int j;
   public final int E;
   public final int m;
   public final com.finalshell.ui.panel.QX d;

   public Fi2(com.finalshell.ui.panel.QX var1, Component var2, int var3, int var4, int var5, int var6) {
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





