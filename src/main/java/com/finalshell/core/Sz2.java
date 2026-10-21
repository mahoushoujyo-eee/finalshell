package com.finalshell.core;

import com.finalshell.ui.model.BU;
import java.awt.Shape;
import javax.swing.JComponent;

public class Sz2 implements E_2 {
   public final JComponent U;
   public final BU g;
   public final int N;
   public final int d;
   public final int a;
   public final int j;
   public final int o;
   public final boolean k;
   public final boolean u;

   public Sz2(JComponent var1, BU var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      this.U = var1;
      this.g = var2;
      this.N = var3;
      this.d = var4;
      this.a = var5;
      this.j = var6;
      this.o = var7;
      this.k = var8;
      this.u = var9;
   }

   public Shape a() {
      return QC.z(this.U, this.g, this.N, this.d, this.a, this.j, this.o, this.k, this.u);
   }

   @Override
   public Object J() {
      return this.a();
   }
}





