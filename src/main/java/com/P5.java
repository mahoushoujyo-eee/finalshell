package com;

public class P5 implements Po_2 {
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public int D(float var1) {
      String[] var10000 = com.W5.q();
      int var3 = (int)(var1 * 255.0F);
      String[] var2 = var10000;
      int var4 = var3;
      if (var2 != null) {
         if (var3 < 0) {
            var3 = 0;
            if (var2 != null) {
               return a(31828, 689703936335774204L) | var3 << a(13447, 5241373141968144682L) | var3 << a(25409, 3059320054013239016L) | var3;
            }
         }

         var4 = var3;
      }

      int var10001 = a(16385, 5231335307953356202L);
      if (var2 == null) {
         return var4 | var10001;
      } else {
         if (var4 > var10001) {
            var3 = a(6478, 2976588453243741412L);
         }

         return a(31828, 689703936335774204L) | var3 << a(13447, 5241373141968144682L) | var3 << a(25409, 3059320054013239016L) | var3;
      }
   }

   static {
      long var0 = 7734116603297885057L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "HÐâ&\u0086µua¾ò±uE~ê}\fGo\u001c<\u0081ÖÔ";
      int var5 = "HÐâ&\u0086µua¾ò±uE~ê}\fGo\u001c<\u0081ÖÔ".length();
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
                     b = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "6¿\u0090ý¡\u001a\u000f\u009a\u0000bU\u009b\u0091M¢»";
                  var5 = "6¿\u0090ý¡\u001a\u000f\u009a\u0000bU\u009b\u0091M¢»".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32169;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





