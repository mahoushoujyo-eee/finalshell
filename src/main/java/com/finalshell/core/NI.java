package com.finalshell.core;

import java.util.Map.Entry;

public class NI implements Entry {
   public final Object V;
   public Object u;
   public NI N;
   public final int m;

   public NI(int var1, Object var2, Object var3, NI var4) {
      this.u = var3;
      this.N = var4;
      this.V = var2;
      this.m = var1;
   }

   @Override
   public final Object getKey() {
      return this.V;
   }

   @Override
   public final Object getValue() {
      return this.u;
   }

   @Override
   public final Object setValue(Object var1) {
      Object var2 = this.u;
      this.u = var1;
      return var2;
   }

   @Override
   public final boolean equals(Object var1) {
      int var2 = Ph2.w();
      Object var10000 = var1;
      if (var2 != 0) {
         if (!(var1 instanceof Entry)) {
            return false;
         }

         var10000 = var1;
      }

      Entry var3 = (Entry)var10000;
      Object var4 = this.getKey();
      Object var5 = var3.getKey();
      var10000 = var4;
      if (var2 != 0) {
         if (var4 != var5) {
            var10000 = var4;
            if (var2 != 0) {
               if (var4 == null) {
                  return false;
               }

               var10000 = var4;
            }

            boolean var10 = var10000.equals(var5);
            if (var2 == 0) {
               return var10;
            }

            if (!var10) {
               return false;
            }
         }

         var10000 = this.getValue();
      }

      Object var6 = var10000;
      Object var7 = var3.getValue();
      var10000 = var6;
      if (var2 != 0) {
         if (var6 == var7) {
            return true;
         }

         var10000 = var6;
      }

      if (var2 != 0) {
         if (var10000 == null) {
            return false;
         }

         var10000 = var6;
      }

      boolean var12 = var10000.equals(var7);
      return var2 == 0 ? var12 : var12;
   }

   @Override
   public final int hashCode() {
      int var1;
      int var2;
      label25: {
         var1 = Ph2.w();
         Object var10000 = this.V;
         if (var1 != 0) {
            if (this.V == null) {
               var2 = 0;
               break label25;
            }

            var10000 = this.V;
         }

         var2 = var10000.hashCode();
      }

      Object var10001 = this.u;
      if (var1 != 0) {
         if (this.u == null) {
            return var2 ^ 0;
         }

         var10001 = this.u;
      }

      return var2 ^ var10001.hashCode();
   }

   @Override
   public final String toString() {
      return this.getKey() + "=" + this.getValue();
   }
}





