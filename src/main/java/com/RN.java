package com;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RN {
   private Runnable i;
   private com.ca_4 V;
   private com.oX_3 v;

   @NotNull
   public RN g(@NotNull Runnable var1) {
      this.i = var1;
      return this;
   }

   @NotNull
   public RN j(@Nullable com.ca_4 var1) {
      this.V = var1;
      return this;
   }

   @NotNull
   public RN J(@Nullable com.oX_3 var1) {
      this.v = var1;
      return this;
   }

   @NotNull
   public com.yA_3 r() {
      boolean var1 = com.yO_3.K();
      com.yO_3 var10000 = new com.yO_3(this.i, this.V, this.v, null);
      if (!var1) {
         com.ky_4.K(new String[4]);
      }

      return var10000;
   }
}





