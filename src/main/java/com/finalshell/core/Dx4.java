package com.finalshell.core;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class Dx4 {
   public final String R;
   public final int P;
   public int I;
   public int k;
   public final ArrayList U = new ArrayList();
   public int n;
   public int h = 0;
   public final WZ b = new WZ();
   public final boolean z;
   public static String u;
   public static long[] a;
   public static Integer[] c;

   public Dx4(String var1, boolean var2) {
      this.z = var2;
      this.R = var2 ? var1.toLowerCase() : var1;
      this.P = this.R.hashCode();
   }

   public void A(int var1, int var2, com.finalshell.ui.model.J2 var3, int var4) {
      String var5;
      Dx4 var9;
      label105: {
         var5 = g();
         int var10000 = this.U.size();
         label95:
         if (var5 == null) {
            if (var10000 != 0) {
               var9 = this;
               if (var5 != null) {
                  break label105;
               }

               if (((Ko2)this.U.get(this.U.size() - 1)).G == var3) {
                  break label95;
               }
            }

            this.U.add(new Ko2(var1, var2, var3, null));
         }

         var9 = this;
      }

      label86: {
         label100: {
            int var10 = var9.k;
            if (var5 == null) {
               if (var9.k == this.R.length()) {
                  this.I = this.I - this.E(((Ko2)this.U.get(0)).G.charAt(this.n));
                  var9 = this;
                  if (var5 == null) {
                     if (this.n + 1 == ((Ko2)this.U.get(0)).G.length()) {
                        this.n = 0;
                        this.U.remove(0);
                        if (var5 == null) {
                           break label86;
                        }
                     }

                     var9 = this;
                  }

                  var9.n++;
                  if (var5 == null) {
                     break label86;
                  }
               }

               this.k++;
               var9 = this;
               if (var5 != null) {
                  break label100;
               }

               var10 = this.h;
            }

            if (var10 == 0) {
               this.h = 1;
               if (var5 == null) {
                  break label86;
               }
            }

            var9 = this;
         }

         var9.h = var9.h * a(4038, 4021667367342458382L);
      }

      this.I = a(30845, 6464615397422674356L) * this.I + this.V(var3.charAt(var4));
      int var13 = this.k;
      int var10001 = this.R.length();
      if (var5 == null) {
         if (var13 != var10001) {
            return;
         }

         var13 = this.I;
         var10001 = this.P;
      }

      if (var13 == var10001) {
         PE3 var6 = new PE3(this.U, this.n, var4, -1, null);
         String var7 = var6.O();
         byte var8 = (this.R.equals(this.z ? var7.toLowerCase() : var7)) ? 1 : 0;
         int var14 = var8;
         if (var5 == null) {
            if (var8 == 0) {
               return;
            }

            var14 = (this.i(var6)) ? 1 : 0;
         }

         label103: {
            if (var5 == null) {
               if (var14 == 0) {
                  return;
               }

               this.b.I(this.U, this.n, var4);
               this.I = 0;
               this.k = 0;
               this.h = 0;
               var9 = this;
               if (var5 != null) {
                  break label103;
               }

               this.U.clear();
               var14 = var4 + 1;
            }

            if (var14 < var3.length()) {
               this.n = var4 + 1;
               this.U.add(new Ko2(var1, var2, var3, null));
               if (var5 == null) {
                  return;
               }
            }

            var9 = this;
         }

         var9.n = 0;
      }
   }

   public boolean i(@NotNull PE3 var1) {
      return true;
   }

   public int V(char var1) {
      String var2 = g();
      char var10000 = (this.z) ? 1 : 0;
      if (var2 == null) {
         var10000 = this.z ? Character.toLowerCase(var1) : var1;
      }

      return var10000;
   }

   public int E(char var1) {
      return this.h * this.V(var1);
   }

   public WZ i() {
      return this.b;
   }

   public static void f(String var0) {
      u = var0;
   }

   public static String g() {
      return u;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18889;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5818019995361388001L;
      long[] var6 = new long[2];
      f(null);
      int var3 = 0;
      String var4 = "pâ\u0010x»D\u0094J?ì\u00ad~ü\u0098ãð";
      int var5 = "pâ\u0010x»D\u0094J?ì\u00ad~ü\u0098ãð".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      c = new Integer[2];
   }
}





