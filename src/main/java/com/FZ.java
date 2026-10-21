package com;

public class FZ {
   public final Iz_2 m;
   public final Iz_2 l;
   private static String[] d;

   public FZ(Iz_2 var1, Iz_2 var2) {
      this.m = var1;
      this.l = var2;
   }

   @Override
   public boolean equals(Object var1) {
      String[] var2 = G();
      boolean var10000 = var1 instanceof com.FZ;
      if (var2 != null) {
         if (var10000) {
            com.FZ var3 = (com.FZ)var1;
            Iz_2 var4 = var3.m;
            Iz_2 var10001 = this.m;
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
      if (G() == null) {
         r(new String[2]);
      }
   }
}





