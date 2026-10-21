package com.finalshell.core;

import java.awt.Shape;

public class UI implements E_2 {
   public final int u;
   public final int x;
   public final int D;
   public final int M;
   public final boolean Y;

   public UI(int var1, int var2, int var3, int var4, boolean var5) {
      this.u = var1;
      this.x = var2;
      this.D = var3;
      this.M = var4;
      this.Y = var5;
   }

   public Shape x() {
      return QC.Z(this.u, this.x, this.D, this.M, this.Y);
   }

   @Override
   public Object J() {
      return this.x();
   }
}





