package com.finalshell.core;

import java.util.Arrays;

public class Pf2 implements Wy4 {
   public String[] a;
   public String[] j;

   public Pf2(String[] var1, String[] var2) {
      String var10000 = Nv4.o();
      super();
      String var3 = var10000;
      String[] var4 = var1;
      if (var3 != null) {
         if (var1 != null) {
            this.a = new String[var1.length];
            System.arraycopy(var1, 0, this.a, 0, var1.length);
            Arrays.sort((Object[])this.a);
         }

         var4 = var2;
      }

      if (var3 != null) {
         if (var4 == null) {
            return;
         }

         this.j = new String[var2.length];
         System.arraycopy(var2, 0, this.j, 0, var2.length);
         var4 = this.j;
      }

      Arrays.sort((Object[])var4);
   }

   @Override
   public boolean F(String var1) {
      String var2 = Nv4.o();
      String[] var10000 = this.j;
      if (var2 != null) {
         if (this.j != null) {
            int var4 = Arrays.binarySearch(this.j, var1);
            if (var2 != null) {
               var4 = var4 < 0 ? 1 : 0;
            }

            return var4 != 0;
         }

         var10000 = this.a;
      }

      if (var2 != null) {
         if (var10000 == null) {
            return 0 != 0;
         }

         var10000 = this.a;
      }

      int var3 = Arrays.binarySearch(var10000, var1);
      if (var2 == null) {
         return var3 != 0;
      } else {
         return (boolean)(var3 >= 0 ? 1 : 0);
      }
   }
}





