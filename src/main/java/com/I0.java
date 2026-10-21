package com;

// $VF: synthetic class
class I0 {
   static final int[] j;

   static {
      long var1 = 5451504847456240147L;
      long[] var0 = new long[6];
      int var4 = 0;
      String var5 = "-pg\u0019\u0083ó\u0002\u0014<ýOý\u0083ó\u0002\u001b\u0001û^U\u0083ó\u0002\u001a\rÁ3)\u0083ó\u0002\u0018";
      int var6 = "-pg\u0019\u0083ó\u0002\u0014<ýOý\u0083ó\u0002\u001b\u0001û^U\u0083ó\u0002\u001a\rÁ3)\u0083ó\u0002\u0018".length();
      byte var3 = 0;

      label90:
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
            long var25 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var25;
                  if (var3 >= var6) {
                     j = new int[com.Dy_2.values().length];

                     try {
                        j[com.Dy_2.Character.ordinal()] = 1;
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        j[com.Dy_2.Backspace.ordinal()] = 2;
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        j[com.Dy_2.AltBackspace.ordinal()] = 3;
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        j[com.Dy_2.LeftArrow.ordinal()] = 4;
                     } catch (NoSuchFieldError var16) {
                     }

                     try {
                        j[com.Dy_2.RightArrow.ordinal()] = 5;
                     } catch (NoSuchFieldError var15) {
                     }

                     try {
                        j[com.Dy_2.AltLeftArrow.ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var14) {
                     }

                     try {
                        j[com.Dy_2.AltRightArrow.ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var13) {
                     }

                     try {
                        j[com.Dy_2.Delete.ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var12) {
                     }

                     try {
                        j[com.Dy_2.Home.ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var11) {
                     }

                     try {
                        j[com.Dy_2.End.ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var10) {
                     }

                     try {
                        j[com.Dy_2.Unknown.ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var9) {
                     }

                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var25;
                  if (var3 < var6) {
                     continue label90;
                  }

                  var5 = "e\u0083O-\u0083ó\u0002\u0015ßô\u009eÑ\u0083ó\u0002\u0019";
                  var6 = "e\u0083O-\u0083ó\u0002\u0015ßô\u009eÑ\u0083ó\u0002\u0019".length();
                  var3 = 0;
            }

            byte var22 = var3;
            var3 += 8;
            var7 = var5.substring(var22, var3).getBytes("ISO-8859-1");
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





