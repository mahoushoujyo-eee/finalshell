package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class Pt4 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   public Pt4(String var1, int var2, int[] var3) {
      super(var1, var2, var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 32:
               return b(32616, 6719956199849845137L);
            case 59:
               return b(1951, 3679069710399117665L);
            case 60:
               return b(27156, 4551709459514127595L);
            case 61:
               return b(8081, 2243412457879273837L);
            case 91:
               return b(17431, 4847784419949599469L);
            case 92:
               return b(24429, 6830623067884732822L);
            case 93:
               return b(3190, 1383845708178559630L);
            case 94:
               return b(22526, 769331665669736707L);
            default:
               var10000 = -1;
         }
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7930;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1941317084948595579L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "\u0081ÐØ\u0080¦\u0006Ùr\u0092`æ\u0002\u001f\u0019Â\u001b\u008eõ¯\u0084\u009f,\u0091\t\u0099éÚ¾:ùâM\u0092ªP)Ôÿ\u001aÞh¢ùºCÝ÷F";
      int var5 = "\u0081ÐØ\u0080¦\u0006Ùr\u0092`æ\u0002\u001f\u0019Â\u001b\u008eõ¯\u0084\u009f,\u0091\t\u0099éÚ¾:ùâM\u0092ªP)Ôÿ\u001aÞh¢ùºCÝ÷F".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     c = var6;
                     d = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "B;):àV\u0082Ê\u0017£äp\u008avJ§";
                  var5 = "B;):àV\u0082Ê\u0017£äp\u008avJ§".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





