package com;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Window;
import java.util.HashMap;
import java.util.Map;

public final class SN {
   private static final Map B;
   private static final long[] a;
   private static final Integer[] b;
   private static final long c;

   public static Window N(Window var0, boolean var1) {
      Xk_2.Z(var0, var1);
      return var0;
   }

   public static boolean B(Window var0) {
      return Xk_2.X(var0);
   }

   public static Window s(Window var0, float var1) {
      Xk_2.f(var0, var1);
      return var0;
   }

   public static float A(Window var0) {
      return Xk_2.m(var0);
   }

   public static Window v(Window var0) {
      var0.setLocationRelativeTo(null);
      return var0;
   }

   public static Window u(Window var0, Component var1) {
      var0.setLocationRelativeTo(var1);
      return var0;
   }

   public static Window H(Window var0, int var1, int var2) {
      var0.setSize(var1, var2);
      return v(var0);
   }

   public static Window Q(Window var0, Component var1, int var2, int var3) {
      var0.setSize(var2, var3);
      return u(var0, var1);
   }

   public static Window W(Window var0, int var1) {
      var0.setSize(var1, var0.getPreferredSize().height);
      return var0;
   }

   public static Window G(Window var0, int var1) {
      var0.setSize(var0.getPreferredSize().width, var1);
      return var0;
   }

   public static Window D(Window var0) {
      return g(var0, GO.k);
   }

   public static Window g(Window var0, boolean var1) {
      String var2 = com.FV.D();
      Window var10000 = var0;
      if (var2 == null) {
         if (var0 == null) {
            return var0;
         }

         var10000 = var0;
      }

      Rectangle var5;
      label64: {
         Rectangle var3;
         var3 = var10000.getBounds();
         Dimension var4 = var0.getPreferredSize();
         var5 = new Rectangle(var3.x + var3.width / 2 - var4.width / 2, var3.y + var3.height / 2 - var4.height / 2, var4.width, var4.height);
         var11 = B.containsKey(var0);
         label53:
         if (var2 == null) {
            label51:
            if (var11) {
               Object var12 = B.get(var0);
               if (var2 == null) {
                  if (var12 == null) {
                     break label51;
                  }

                  var12 = B.get(var0);
               }

               var11 = ((com.WC)var12).i();
               if (var2 != null) {
                  break label53;
               }

               if (var11) {
                  ((com.WC)B.get(var0)).Y();
               }
            }

            var10000 = var0;
            if (var2 != null) {
               break label64;
            }

            var11 = var0.isShowing();
         }

         label37:
         if (var11) {
            if (var2 == null) {
               if (!var1) {
                  break label37;
               }

               a(25747, 4417444005174228341L);
            }

            int var7 = a(16686, 6076574958914998473L);
            int var8 = var5.width - var3.width;
            int var9 = var5.height - var3.height;
            com.WC var10 = new com.WC(c, new XV(var3, var8, var9, var0));
            B.put(var0, var10);
            var10.u();
            if (var2 == null) {
               return var0;
            }
         }

         var10000 = var0;
      }

      var10000.setBounds(var5);
      return var0;
   }

   static Map E() {
      return B;
   }

   static {
      long var2 = 1730924163562001570L;
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "\u0000ª¹°\u0019Öa³ÒÇ}ÉûiDa";
      int var7 = "\u0000ª¹°\u0019Öa³ÒÇ}ÉûiDa".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10004 = (
               ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L
            )
            ^ var2;
         byte var10003 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      a = var8;
      b = new Integer[2];
      long var0 = 8637915413195273466L;
      long var10002 = 8637915413195273456L ^ var0;
      byte var11 = -1;
      c = var10002;
      B = new HashMap();
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20966;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





