package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class TN {
   public byte[] u;
   public short n;
   public static Ky4[] Z;

   public byte[] c() {
      return this.u;
   }

   public static short V(byte[] var0) {
      Ky4[] var10000 = D();
      short var2 = -1;
      Ky4[] var1 = var10000;
      int var3 = var0.length;
      if (var1 != null) {
         if (var3 >= 2) {
            var2 = B8.M$short(var0, 0);
         }

         var3 = var2;
      }

      return (short)var3;
   }

   public static void s(Ky4[] var0) {
      Z = var0;
   }

   public static Ky4[] D() {
      return Z;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (D() == null) {
         s(new Ky4[4]);
      }
   }
}





