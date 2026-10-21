package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.OG;
import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

public class N1 implements AWTEventListener {
   public final com.finalshell.ui.panel.Ot2 e;
   public static long[] a;
   public static Integer[] b;
   public static long[] c;
   public static Long[] d;

   public N1(com.finalshell.ui.panel.Ot2 var1) {
      this.e = var1;
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      Ky4[] var2 = OG.P();
      AWTEvent var10000 = var1;
      if (var2 != null) {
         if (!(var1 instanceof MouseEvent)) {
            return;
         }

         var10000 = var1;
      }

      MouseEvent var3 = (MouseEvent)var10000;
      int var4 = var1.getID();
      int var10001 = a(32377, 712408173153561344L);
      if (var2 != null) {
         if (var4 == var10001) {
            Toolkit.getDefaultToolkit().addAWTEventListener(this, b(28735, 8689618946007624511L));
            com.finalshell.ui.panel.Ot2.s(this.e, var3);
            if (var2 != null) {
               return;
            }
         }

         var4 = var1.getID();
         var10001 = a(8967, 4914982254634628733L);
      }

      if (var2 != null) {
         if (var4 == var10001) {
            Toolkit.getDefaultToolkit().removeAWTEventListener(this);
            Toolkit.getDefaultToolkit().addAWTEventListener(com.finalshell.ui.panel.Ot2.a(this.e), b(19240, 58038021491576873L));
            com.finalshell.ui.panel.Ot2.s(this.e, var3);
            if (var2 != null) {
               return;
            }
         }

         var4 = var1.getID();
         var10001 = a(13425, 8412898086285795594L);
      }

      label27: {
         if (var2 != null) {
            if (var4 == var10001) {
               break label27;
            }

            var4 = var1.getID();
            var10001 = a(31439, 3585337109399875511L);
         }

         if (var4 != var10001) {
            return;
         }
      }

      com.finalshell.ui.panel.Ot2.s(this.e, var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21880;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 6913) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var8 = 4273584066326618601L;
      long[] var14 = new long[4];
      int var11 = 0;
      String var12 = "ùÂ\u0088Q:äÏ¤\u0012\u009d\u009d\u0087 ÍË\u0011";
      int var13 = "ùÂ\u0088Q:äÏ¤\u0012\u009d\u009d\u0087 ÍË\u0011".length();
      byte var10 = 0;

      label29:
      while (true) {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var14;
         var10001 = var11++;
         long var10002 = ((long)var15[0] & 255L) << 56
            | ((long)var15[1] & 255L) << 48
            | ((long)var15[2] & 255L) << 40
            | ((long)var15[3] & 255L) << 32
            | ((long)var15[4] & 255L) << 24
            | ((long)var15[5] & 255L) << 16
            | ((long)var15[6] & 255L) << 8
            | (long)var15[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var24 = var10002 ^ var8;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var24;
                  if (var10 >= var13) {
                     a = var14;
                     b = new Integer[4];
                     long var0 = 1833125758820528592L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u0019¾£oµeaéaç(N\u001dTZÏ";
                     int var5 = "\u0019¾£oµeaéaç(N\u001dTZÏ".length();
                     byte var2 = 0;

                     do {
                        int var19 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var19, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        var19 = var3++;
                        var24 = (
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
                        var10003 = -1;
                        var6[var19] = var24;
                     } while (var2 < var5);

                     c = var6;
                     d = new Long[2];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var24;
                  if (var10 < var13) {
                     continue label29;
                  }

                  var12 = "è\u007fÐ7;ò\u0096mÓ[ß|³\u008a\u0001\u0014";
                  var13 = "è\u007fÐ7;ò\u0096mÓ[ß|³\u008a\u0001\u0014".length();
                  var10 = 0;
            }

            byte var18 = var10;
            var10 += 8;
            var15 = var12.substring(var18, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var14;
            var10001 = var11++;
            var10002 = ((long)var15[0] & 255L) << 56
               | ((long)var15[1] & 255L) << 48
               | ((long)var15[2] & 255L) << 40
               | ((long)var15[3] & 255L) << 32
               | ((long)var15[4] & 255L) << 24
               | ((long)var15[5] & 255L) << 16
               | ((long)var15[6] & 255L) << 8
               | (long)var15[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





