package com.finalshell.core;

public class Dq2 {
   public static short z;
   public static short x;
   public static short b;
   public static short a;
   public static short u;
   public static short e;
   public static short y;
   public static short Q;
   public static short w;
   public static short Y;
   public static short W;
   public static short G;
   public static short R;
   public static short F;
   public static short A;
   public static short N;
   public static short Z;
   public static short o;
   public static short M;
   public static short d;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 6822228533002803880L;
      long[] var0 = new long[20];
      int var4 = 0;
      String var5 = "è\u0019\r>~*\u009bÅ¬$a8~*\u009ac-²û(~*\u009béiÚ\u008c¢~*\u009b\u0085_»L\u008c~*\u009båï½\u0093Ä~*\u009bêq¤\u0092>~*\u009bçÛº\u008aZ~*\u009aa\u0091Þ;\u0000~*\u009bëÿ\u009dÇ7~*\u009b\u0087\u000eµÃ\u001c~*\u009bÆ\u0092\u0007h ~*\u009bûh\u0003&\u009b~*\u009b\u0099\u0000\u009c3f~*\u009abohpÍ~*\u009b¤\u008a8\u0097â~*\u009b\u0098:hNn~*\u009b¡\u009d\u00adî\u0010~*\u009bú";
      int var6 = "è\u0019\r>~*\u009bÅ¬$a8~*\u009ac-²û(~*\u009béiÚ\u008c¢~*\u009b\u0085_»L\u008c~*\u009båï½\u0093Ä~*\u009bêq¤\u0092>~*\u009bçÛº\u008aZ~*\u009aa\u0091Þ;\u0000~*\u009bëÿ\u009dÇ7~*\u009b\u0087\u000eµÃ\u001c~*\u009bÆ\u0092\u0007h ~*\u009bûh\u0003&\u009b~*\u009b\u0099\u0000\u009c3f~*\u009abohpÍ~*\u009b¤\u008a8\u0097â~*\u009b\u0098:hNn~*\u009b¡\u009d\u00adî\u0010~*\u009bú"
         .length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     z = (short)((int)var0[7]);
                     x = (short)((int)var0[13]);
                     b = (short)((int)var0[1]);
                     a = (short)((int)var0[3]);
                     u = (short)((int)var0[18]);
                     e = (short)((int)var0[9]);
                     y = (short)((int)var0[15]);
                     Q = (short)((int)var0[12]);
                     w = (short)((int)var0[2]);
                     Y = (short)((int)var0[5]);
                     W = (short)((int)var0[8]);
                     G = (short)((int)var0[4]);
                     R = (short)((int)var0[19]);
                     F = (short)((int)var0[6]);
                     A = (short)((int)var0[17]);
                     N = (short)((int)var0[11]);
                     Z = (short)((int)var0[16]);
                     o = (short)((int)var0[14]);
                     M = (short)((int)var0[0]);
                     d = (short)((int)var0[10]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "\u00918\\ô~*\u009b\u0086}çv,~*\u009bæ";
                  var6 = "\u00918\\ô~*\u009b\u0086}çv,~*\u009bæ".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





