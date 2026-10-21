package com.finalshell.core;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class YO3 extends YA3 {
   public final Ca4_2 t;
   public final OX3 M;
   public static boolean G;

   public YO3(@NotNull Runnable var1) {
      this(var1, null, null);
   }

   public YO3(@NotNull Runnable var1, @Nullable Ca4_2 var2, @Nullable OX3 var3) {
      super(var1);
      this.t = var2;
      this.M = var3;
   }

   @Nullable
   public Ca4_2 B() {
      return this.t;
   }

   @Nullable
   public OX3 W() {
      return this.M;
   }

   @Nullable
   public static Ca4_2 G(@Nullable YA3 var0) {
      boolean var1 = V();
      YA3 var10000 = var0;
      if (!var1) {
         if (!(var0 instanceof YO3)) {
            return null;
         }

         var10000 = var0;
      }

      return ((YO3)var10000).B();
   }

   @Contract("null -> null")
   @Nullable
   public static OX3 e(@Nullable YA3 var0) {
      boolean var1 = V();
      YA3 var10000 = var0;
      if (!var1) {
         if (!(var0 instanceof YO3)) {
            return null;
         }

         var10000 = var0;
      }

      return ((YO3)var10000).W();
   }

   YO3(Runnable var1, Ca4_2 var2, OX3 var3, Bg2 var4) {
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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (V()) {
         H(true);
      }
   }
}





