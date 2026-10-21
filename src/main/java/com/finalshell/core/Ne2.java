package com.finalshell.core;

import java.util.ArrayList;
import java.util.Iterator;

public final class Ne2 extends Nl2_3 {
   public final NV_2 R;
   public final String A;
   public final NV_2 k;
   public static long[] a;
   public static Integer[] d;

   public Ne2(com.finalshell.ui.model.I var1, NV_2 var2, String var3, NV_2 var4) {
      super(var1);
      this.R = var2;
      this.A = var3;
      this.k = var4;
   }

   @Override
   public String toString() {
      return this.R.toString() + a(12294, 2811603802152820739L) + this.A + a(29887, 7963919704743945403L) + this.k.toString();
   }

   public Iterator d() {
      ArrayList var2 = new ArrayList();
      String[] var10000 = RG_2.C();
      Ne2 var3 = this;
      String[] var1 = var10000;

      do {
         NV_2 var4;
         var2.add(var3.k);
         var4 = var3.R;
         label23:
         if (var4 instanceof Ne2) {
            Ne2 var5 = (Ne2)var4;
            if (var1 != null) {
               if (var5.A != this.A) {
                  break label23;
               }

               var5 = (Ne2)var4;
            }

            var3 = var5;
            if (var1 != null) {
               continue;
            }
         }

         var2.add(var4);
         if (var1 != null) {
            break;
         }
      } while (var1 != null);

      return new com.finalshell.ui.model.Y_2(var2.listIterator(var2.size()));
   }

   @C_9
   @Override
   public Object i(C_w_2 var1) throws Throwable {
      return var1.w(this);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20484;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7848386413696895385L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0091%\u0095x\u0084\u0098í\u0002Ìðx ¬\u0013)º";
      int var5 = "\u0091%\u0095x\u0084\u0098í\u0002Ìðx ¬\u0013)º".length();
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
      d = new Integer[2];
   }
}





