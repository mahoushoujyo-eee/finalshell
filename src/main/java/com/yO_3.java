package com;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yO_3 extends com.yA_3 {
   private final com.ca_4 t;
   private final com.oX_3 M;
   private static boolean G;

   public yO_3(@NotNull Runnable var1) {
      this(var1, null, null);
   }

   private yO_3(@NotNull Runnable var1, @Nullable com.ca_4 var2, @Nullable com.oX_3 var3) {
      super(var1);
      this.t = var2;
      this.M = var3;
   }

   @Nullable
   public com.ca_4 B() {
      return this.t;
   }

   @Nullable
   public com.oX_3 W() {
      return this.M;
   }

   @Nullable
   public static com.ca_4 G(@Nullable com.yA_3 var0) {
      boolean var1 = V();
      com.yA_3 var10000 = var0;
      if (!var1) {
         if (!(var0 instanceof com.yO_3)) {
            return null;
         }

         var10000 = var0;
      }

      return ((com.yO_3)var10000).B();
   }

   @Contract("null -> null")
   @Nullable
   public static com.oX_3 e(@Nullable com.yA_3 var0) {
      boolean var1 = V();
      com.yA_3 var10000 = var0;
      if (!var1) {
         if (!(var0 instanceof com.yO_3)) {
            return null;
         }

         var10000 = var0;
      }

      return ((com.yO_3)var10000).W();
   }

   yO_3(Runnable var1, com.ca_4 var2, com.oX_3 var3, com.Bg_2 var4) {
      this(var1, var2, var3);
   }

   public static void H(boolean var0) {
      G = var0;
   }

   public static boolean K() {
      return G;
   }

   public static boolean V() {
      boolean var0 = K();
      return !var0;
   }

   static {
      if (V()) {
         H(true);
      }
   }
}





