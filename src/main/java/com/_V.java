package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

public final class _V {
   public static boolean d;
   public static boolean S;
   public static Color T;
   public static Color v;
   public static Color C;
   public static Color z;
   public static Color O;
   public static Color e;
   public static Color G;
   public static Color M;
   public static Color h;
   public static Color a;
   public static int o;
   public static Insets B;
   public static int k;
   public static Insets X;
   public static Dimension s;
   public static int U;
   public static int P;

   static {
      long var1 = 6853377806558550364L;
      long[] var0 = new long[18];
      int var4 = 0;
      String var5 = "5ÛÝ(çwÙè¤Ç\u0083ZçwÙ\u0091õ\u00ad\u001aYçwÙ\u008eÕ¾q\"çwÙE\u0005ëavçwÙÊ\u001f\u0091\tOçwÙ¬W³,qçwÙ\u0091\u0083ù×JçwÙâÆ<ªjçwÙ\u0080Ô\r\u0019\u000eçwÙ\u008eÞ]\u0014\u0004çwÙÊÌ\u0010\u0091\rçwÙè\u009ak`ËçwÙ\u0080£v\u009b\u0096çwÙ¬h\u0011Ù\u0001çwÙºCÜ,\u0084çwÙâ";
      int var6 = "5ÛÝ(çwÙè¤Ç\u0083ZçwÙ\u0091õ\u00ad\u001aYçwÙ\u008eÕ¾q\"çwÙE\u0005ëavçwÙÊ\u001f\u0091\tOçwÙ¬W³,qçwÙ\u0091\u0083ù×JçwÙâÆ<ªjçwÙ\u0080Ô\r\u0019\u000eçwÙ\u008eÞ]\u0014\u0004çwÙÊÌ\u0010\u0091\rçwÙè\u009ak`ËçwÙ\u0080£v\u009b\u0096çwÙ¬h\u0011Ù\u0001çwÙºCÜ,\u0084çwÙâ"
         .length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var10000 = var0;
         var10001 = var4++;
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
            long var13 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var3 >= var6) {
                     d = true;
                     S = false;
                     T = new Color((int)var0[16], (int)var0[14], (int)var0[14], 0);
                     v = new Color((int)var0[13], (int)var0[5], (int)var0[5], 0);
                     C = new Color((int)var0[6], (int)var0[1], (int)var0[1], 0);
                     z = new Color((int)var0[8], (int)var0[12], (int)var0[12]);
                     O = new Color((int)var0[9], (int)var0[2], (int)var0[2]);
                     e = new Color((int)var0[14], (int)var0[14], (int)var0[14]);
                     G = new Color((int)var0[0], (int)var0[11], (int)var0[11], 0);
                     M = new Color((int)var0[7], (int)var0[15], (int)var0[15]);
                     h = new Color((int)var0[10], (int)var0[4], (int)var0[4], 0);
                     a = new Color((int)var0[11], (int)var0[11], (int)var0[11]);
                     o = 0;
                     B = new Insets(0, 0, 0, 0);
                     k = com.c.c(192717257638835504L).getInt(null);
                     X = new Insets(0, 2, 0, 2);
                     s = (Dimension)com.c.c(484231497315043833L).get(null);
                     U = (int)var0[3];
                     P = (int)var0[17];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "9#\nÿçwÙºlI-ÅçwÙE";
                  var6 = "9#\nÿçwÙºlI-ÅçwÙE".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes("ISO-8859-1");
            var10000 = var0;
            var10001 = var4++;
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





