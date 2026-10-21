package com;

import org.jetbrains.annotations.NotNull;

public class XQ {
   private final int U;
   private final int w;
   private final com.YP a;
   private final int u;
   private final int x;
   private final boolean B;
   private final boolean C;
   private final int Q;
   private final pG_3[] i;

   public XQ(int var1, int var2, @NotNull com.YP var3, boolean var4, boolean var5, R3 var6) {
      boolean var10000 = j_2.g();
      super();
      this.i = new pG_3[4];
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

   public int e() {
      return this.U;
   }

   public int q() {
      return this.w;
   }

   public com.YP e$comYP() {
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

   public pG_3[] E() {
      return this.i;
   }
}





