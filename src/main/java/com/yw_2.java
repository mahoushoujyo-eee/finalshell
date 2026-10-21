package com;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Yw_2 extends com.YP {
   @NotNull
   private final com.yA_3 s;
   @NotNull
   private final com.YP Y;
   @Nullable
   private final com.YP T;
   @NotNull
   private final com.KO F;

   public Yw_2(@NotNull com.YP var1, @NotNull com.yA_3 var2) {
      this(var1.K(), var1.s(), var2, com.KO.HOVER, var1);
   }

   public Yw_2(@Nullable Et_2 var1, @Nullable Et_2 var2, @NotNull com.yA_3 var3, @NotNull com.KO var4, @Nullable com.YP var5) {
      this(false, var1, var2, var3, var4, var5);
   }

   private Yw_2(boolean var1, @Nullable Et_2 var2, @Nullable Et_2 var3, @NotNull com.yA_3 var4, @NotNull com.KO var5, @Nullable com.YP var6) {
      super(var1 ? var2 : null, var1 ? var3 : null);
      this.Y = new com.aG().j(var3).c(var2).c(SY.UNDERLINED, true).y();
      this.s = var4;
      this.F = var5;
      this.T = var6;
   }

   @Nullable
   public com.YP J() {
      return this.T;
   }

   @NotNull
   public com.YP k() {
      return this.Y;
   }

   @NotNull
   public com.yA_3 g() {
      return this.s;
   }

   @NotNull
   public com.KO i() {
      return this.F;
   }

   @NotNull
   public com.am_2 Y() {
      return new com.am_2(this, null);
   }

   @NotNull
   @Override
   public com.aG n() {
      return this.Y();
   }

   static com.yA_3 L(com.Yw_2 var0) {
      return var0.s;
   }

   static com.YP h(com.Yw_2 var0) {
      return var0.Y;
   }

   static com.YP J(com.Yw_2 var0) {
      return var0.T;
   }

   static com.KO x(com.Yw_2 var0) {
      return var0.F;
   }

   Yw_2(boolean var1, Et_2 var2, Et_2 var3, com.yA_3 var4, com.KO var5, com.YP var6, com.aK var7) {
      this(var1, var2, var3, var4, var5, var6);
   }
}





