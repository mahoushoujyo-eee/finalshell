package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RN {
   public Runnable i;
   public Ca4_2 V;
   public OX3 v;

   @NotNull
   public RN g(@NotNull Runnable var1) {
      this.i = var1;
      return this;
   }

   @NotNull
   public RN j(@Nullable Ca4_2 var1) {
      this.V = var1;
      return this;
   }

   @NotNull
   public RN J(@Nullable OX3 var1) {
      this.v = var1;
      return this;
   }

   @NotNull
   public YA3 r() {
      boolean var1 = YO3.K();
      YO3 var10000 = new YO3(this.i, this.V, this.v, null);
      if (!var1) {
         Ky4.K(new String[4]);
      }

      return var10000;
   }
}





