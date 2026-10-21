package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class PZ3 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   public PZ3(String var1, int var2, int[] var3) {
      super(var1, var2, var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 3:
               return b(62, 7138728101899696963L);
            case 32:
               return b(13931, 6394972914404871451L);
            case 59:
               return b(8498, 5973767337860127300L);
            case 60:
               return b(20732, 5673008992765750153L);
            case 61:
               return b(27864, 6314044031095347113L);
            case 91:
               return b(7855, 2712520835009963485L);
            case 92:
               return b(2555, 984582197423567496L);
            case 93:
               return b(2612, 4949117430773739840L);
            case 94:
               return b(7740, 5688618866003764555L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31605;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8001541509811781938L;
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "¯ØônÎ¹ê\\Ý$[\u008a\u001f)°\u009a¹C5\u0012áb¤\u0095\u0084\u0081\u00070¼$\u001bÌãïÅm\"BÖrÄ±/¨<\u0087\f\u008enÈåð2E3H";
      int var5 = "¯ØônÎ¹ê\\Ý$[\u008a\u001f)°\u009a¹C5\u0012áb¤\u0095\u0084\u0081\u00070¼$\u001bÌãïÅm\"BÖrÄ±/¨<\u0087\f\u008enÈåð2E3H".length();
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
                     c = var6;
                     d = new Integer[9];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = ",$é[\u0003B¤\u000fEI\u001e\u0018&\u000bºÒ";
                  var5 = ",$é[\u0003B¤\u000fEI\u001e\u0018&\u000bºÒ".length();
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





