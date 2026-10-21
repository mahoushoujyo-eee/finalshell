package com.finalshell.core;

import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public final class Sm2 {
   int R = Registry.lookupField(259904972972140803L).getInt(null);
   public static int w;
   public static Insets A;
   public static Color P;
   public static Color U;
   public static Color b;
   public static Color q;
   public static int y;
   public static boolean z;
   public static boolean D;
   public static Dimension e;
   public static Color h;
   public static Color k;
   public static Color t;
   public static Color Y;
   public static Color W;
   public static Color x;
   public static int G;
   public static Color I;
   public static Color o;
   public static long[] a;
   public static Integer[] c;

   public static Border H() {
      return BorderFactory.createEmptyBorder(0, a(24260, 5363242775238328386L), 0, 0);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7821;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3780442859864662712L;
      long[] var6 = new long[18];
      int var3 = 0;
      String var4 = " \u008dY\u009aÝØx:y´\u0010¶ZCÖOBÎÔ\u0099Ô¡\u001bm¼\"þ\u0006\u0005\u0016'y\u0019ø\u001fÏÅ}÷\u001ca\u0097\u009f\u000e\u008e\u001a·\u008a}\u0082\u0011\u008e{\u0094å\u001e{K\u001b^Ý\u0014NÝi\u0018áVñõç*<ß¦\u0019hf\u0096\u0010¢Æü(i\u0015YUTÞ\u0002\u00925§âýä\u0094\f\u0002\u000eÊp°zìù¸\u008eÊô\"\u0004é\u001c¥cÓË&BHÝëöÈ½M";
      int var5 = " \u008dY\u009aÝØx:y´\u0010¶ZCÖOBÎÔ\u0099Ô¡\u001bm¼\"þ\u0006\u0005\u0016'y\u0019ø\u001fÏÅ}÷\u001ca\u0097\u009f\u000e\u008e\u001a·\u008a}\u0082\u0011\u008e{\u0094å\u001e{K\u001b^Ý\u0014NÝi\u0018áVñõç*<ß¦\u0019hf\u0096\u0010¢Æü(i\u0015YUTÞ\u0002\u00925§âýä\u0094\f\u0002\u000eÊp°zìù¸\u008eÊô\"\u0004é\u001c¥cÓË&BHÝëöÈ½M"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     c = new Integer[18];
                     w = a(7003, 6915853854549673429L);
                     A = new Insets(0, a(27251, 1711439601562219775L), 1, 0);
                     P = new Color(a(29215, 2424224799920319637L), a(23527, 960408282840745314L), a(23527, 960408282840745314L), 0);
                     U = new Color(a(17607, 7677589519452691018L), a(2930, 3322208351516857850L), a(2930, 3322208351516857850L), 0);
                     b = new Color(a(10966, 5229679835491841106L), a(3290, 1585359294024258119L), a(3290, 1585359294024258119L));
                     q = new Color(a(19567, 3579428705148031726L), a(30715, 15783855432067448L), a(30715, 15783855432067448L));
                     y = a(357, 4346466890247151591L);
                     z = true;
                     D = true;
                     e = new Dimension(1, 1);
                     h = new Color(a(10218, 2159970039456086373L), a(19357, 8188351789525423380L), a(19357, 8188351789525423380L));
                     k = Color.BLACK;
                     t = Color.WHITE;
                     Y = Color.WHITE;
                     W = new Color(a(22806, 7126427909521262493L), a(2781, 3630831340211278913L), a(26053, 5392640592728587074L));
                     x = Color.WHITE;
                     G = a(18456, 1590785568515544728L);
                     I = Color.WHITE;
                     o = Color.BLACK;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0011\u0001\u0094g\u0082K0\u0005h\u0015¬\u0013«C6\u008a";
                  var5 = "\u0011\u0001\u0094g\u0082K0\u0005h\u0015¬\u0013«C6\u008a".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





