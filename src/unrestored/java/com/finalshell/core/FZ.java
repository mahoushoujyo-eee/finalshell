package com.finalshell.core;

public class FZ {
   public final Iz2 m;
   public final Iz2 l;
   public static String[] d;

   public FZ(Iz2 var1, Iz2 var2) {
      this.m = var1;
      this.l = var2;
   }

   @Override
   public boolean equals(Object var1) {
      String[] var2 = G();
      boolean var10000 = var1 instanceof FZ;
      if (var2 != null) {
         if (var10000) {
            FZ var3 = (FZ)var1;
            Iz2 var4 = var3.m;
            Iz2 var10001 = this.m;
            if (var2 != null) {
               if (var3.m != this.m) {
                  return false;
               }

               var4 = var3.l;
               var10001 = this.l;
            }

            if (var4 == var10001) {
               return true;
            }

            return false;
         }

         var10000 = false;
      }

      return var10000;
   }

   public static void r(String[] var0) {
      d = var0;
   }

   public static String[] G() {
      return d;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (G() == null) {
         r(new String[2]);
      }
   }
}





