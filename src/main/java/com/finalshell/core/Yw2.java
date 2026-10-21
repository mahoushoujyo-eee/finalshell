package com.finalshell.core;

import com.finalshell.ui.model.KO;
import com.finalshell.ui.model.SY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Yw2 extends YP {
   @NotNull
   public final YA3 s;
   @NotNull
   public final YP Y;
   @Nullable
   public final YP T;
   @NotNull
   public final KO F;

   public Yw2(@NotNull YP var1, @NotNull YA3 var2) {
      this(var1.K(), var1.s(), var2, KO.HOVER, var1);
   }

   public Yw2(@Nullable Et2 var1, @Nullable Et2 var2, @NotNull YA3 var3, @NotNull KO var4, @Nullable YP var5) {
      this(false, var1, var2, var3, var4, var5);
   }

   public Yw2(boolean var1, @Nullable Et2 var2, @Nullable Et2 var3, @NotNull YA3 var4, @NotNull KO var5, @Nullable YP var6) {
      super(var1 ? var2 : null, var1 ? var3 : null);
      this.Y = new AG().j(var3).c(var2).c(SY.UNDERLINED, true).y();
      this.s = var4;
      this.F = var5;
      this.T = var6;
   }

   @Nullable
   public YP J() {
      return this.T;
   }

   @NotNull
   public YP k() {
      return this.Y;
   }

   @NotNull
   public YA3 g() {
      return this.s;
   }

   @NotNull
   public KO i() {
      return this.F;
   }

   @NotNull
   public Am2 Y() {
      return new Am2(this, null);
   }

   @NotNull
   @Override
   public AG n() {
      return this.Y();
   }

   static YA3 L(Yw2 var0) {
      return var0.s;
   }

   static YP h(Yw2 var0) {
      return var0.Y;
   }

   static YP J(Yw2 var0) {
      return var0.T;
   }

   static KO x(Yw2 var0) {
      return var0.F;
   }

   Yw2(boolean var1, Et2 var2, Et2 var3, YA3 var4, KO var5, YP var6, AK var7) {
      this(var1, var2, var3, var4, var5, var6);
   }
}





