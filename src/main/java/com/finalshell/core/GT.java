package com.finalshell.core;

import java.util.Arrays;

public class GT {
   public final Wh2[] E;
   public final int H;
   public static long a;

   public GT() {
      this((int)a);
   }

   public GT(int var1) {
      this.H = var1 - 1;
      this.E = new Wh2[var1];
   }

   public final Object B(Object var1) {
      int var2 = System.identityHashCode(var1);
      int var3 = var2 & this.H;

      for (Wh2 var4 = this.E[var3]; var4 != null; var4 = var4.n) {
         if (var1 == var4.k) {
            return var4.g;
         }
      }

      return null;
   }

   public java.lang.Class L(String var1) {
      int var10000 = Ph2.w();
      int var3 = 0;
      int var2 = var10000;

      label54:
      while (true) {
         var10000 = var3;

         label52:
         while (var10000 < this.E.length) {
            label59: {
               Wh2 var4 = this.E[var3];
               Wh2 var10 = var4;
               if (var2 != 0) {
                  if (var4 == null && var2 != 0) {
                     break label59;
                  }

                  var10 = var4;
               }

               Wh2 var5 = var10;

               while (var5 != null) {
                  Object var6 = var4.k;
                  label39:
                  if (var2 != 0) {
                     var10000 = (var6 instanceof java.lang.Class) ? 1 : 0;
                     if (var2 == 0) {
                        continue label52;
                     }

                     if (var10000 != 0) {
                        java.lang.Class var7 = (java.lang.Class)var6;
                        String var8 = var7.getName();
                        if (var2 == 0) {
                           break label39;
                        }

                        if (var8.equals(var1)) {
                           return var7;
                        }
                     }

                     var5 = var5.n;
                  }

                  if (var2 == 0) {
                     break;
                  }
               }
            }

            var3++;
            if (var2 == 0) {
               return null;
            }
            continue label54;
         }

         return null;
      }
   }

   public boolean k(Object var1, Object var2) {
      int var3 = System.identityHashCode(var1);
      int var4 = var3 & this.H;

      for (Wh2 var5 = this.E[var4]; var5 != null; var5 = var5.n) {
         if (var1 == var5.k) {
            var5.g = var2;
            return true;
         }
      }

      Wh2 var6 = new Wh2(var1, var2, var3, this.E[var4]);
      this.E[var4] = var6;
      return false;
   }

   public void f() {
      Arrays.fill(this.E, null);
   }

   public int W() {
      int var10000 = Ph2.w();
      int var2 = 0;
      Wh2[] var3 = this.E;
      int var4 = var3.length;
      int var1 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         Wh2 var6 = var3[var5];

         while (true) {
            if (var6 != null) {
               var2++;
               var6 = var6.n;
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            }

            var5++;
            break;
         }

         if (var1 == 0) {
            break;
         }
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7951510104169158591L;
      long var10002 = 6412263893379233727L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





