package com.finalshell.core;

import com.finalshell.ui.model.PG3;
import org.jetbrains.annotations.NotNull;

public class XQ {
   public final int U;
   public final int w;
   public final YP a;
   public final int u;
   public final int x;
   public final boolean B;
   public final boolean C;
   public final int Q;
   public final PG3[] i;

   public XQ(int var1, int var2, @NotNull YP var3, boolean var4, boolean var5, R3 var6) {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      super();
      this.i = new PG3[4];
      boolean var7 = var10000;
      this.U = var1;
      this.w = var2;
      this.a = var3;
      this.B = var4;
      this.C = var5;
      this.u = var6.V().l();
      this.x = var6.I().l();
      this.Q = var6.D();
      int var8 = 0;

      while (var8 < 4) {
         this.i[var8] = var6.D(var8).X();
         var8++;
         if (!var7) {
            break;
         }
      }
   }

   public int e$int() {
      return this.U;
   }

   public int q() {
      return this.w;
   }

   public YP e$YP() {
      return this.a;
   }

   public int g() {
      return this.u;
   }

   public int S() {
      return this.x;
   }

   public boolean Z() {
      return this.B;
   }

   public boolean u() {
      return this.C;
   }

   public int Y() {
      return this.Q;
   }

   public PG3[] E() {
      return this.i;
   }
}





