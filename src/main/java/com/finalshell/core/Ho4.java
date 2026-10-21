package com.finalshell.core;

public class Ho4 extends HN3 {
   public float i;
   public float a;
   public float N;
   public static String b;
   public static long[] c;
   public static Integer[] d;

   public Ho4() {
      this(0.0F, 0.0F, 0.0F);
   }

   public Ho4(float var1, float var2, float var3) {
      this.i = 1.0F + var1;
      this.a = 1.0F + var2;
      this.N = 1.0F + var3;
      this.O = true;
   }

   public void X(float var1) {
      this.i = 1.0F + var1;
   }

   public float D() {
      return this.i - 1.0F;
   }

   public void Q(float var1) {
      this.a = 1.0F + var1;
   }

   public float x() {
      return this.a - 1.0F;
   }

   public void e(float var1) {
      this.N = 1.0F + var1;
   }

   public float p() {
      return this.N - 1.0F;
   }

   public int[] C() {
      int[] var4;
      int[] var2 = new int[a(5668, 5731298942485127510L)];
      String[] var10000 = W5.q();
      int var3 = 0;
      String[] var1 = var10000;

      while (true) {
         if (var3 < a(29567, 2327869025642120201L)) {
            var4 = var2;
            if (var1 == null) {
               break;
            }

            var2[var3] = this.C(
               0, 0, var3 << a(23194, 2132559413775707629L) | var3 << a(21533, 8039117690038887273L) | var3 << a(5410, 6594747274161250897L) | var3
            );
            var3++;
            if (var1 != null) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var4;
      var4 = var3 & a(16401, 4271840137529636717L);
      int var5 = var3 >> a(14744, 6443840690622123757L) & a(10413, 5730306050359975888L);
      int var6 = var3 >> a(14520, 4371025885991587784L) & a(5630, 7357301957522612879L);
      int var7 = var3 & a(5630, 7357301957522612879L);
      var5 = Iw4.e((int)((float)var5 * this.i));
      var6 = Iw4.e((int)((float)var6 * this.a));
      var7 = Iw4.e((int)((float)var7 * this.N));
      return var4 | var5 << a(14744, 6443840690622123757L) | var6 << a(14520, 4371025885991587784L) | var7;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30580;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "E'\u001c%\u0017\u0012@G,\u001a?\u0016\u0015OT\u000f2dKO".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 29;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 29;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 27;
               break;
            case 1:
               var50 = 85;
               break;
            case 2:
               var50 = 109;
               break;
            case 3:
               var50 = 87;
               break;
            case 4:
               var50 = 120;
               break;
            case 5:
               var50 = 124;
               break;
            default:
               var50 = 114;
         }
      } else {
         var34 = 29;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            b = var39;
            long var9 = 5924160921900028924L;
            long[] var14 = new long[10];
            int var11 = 0;
            String var12 = "+\u0092ªó I°\u0085¯NFc\u0017§]\u0001Ï\u0098\u0005*\u001b\u0012\u0096õ´½}2~\u009e>\t÷rþrø\u008aÜ<\u009b¼±éÝqñ\u008c>oE\u000bN\u007fóªÍÈßþ\u001dÁq¥";
            int var13 = "+\u0092ªó I°\u0085¯NFc\u0017§]\u0001Ï\u0098\u0005*\u001b\u0012\u0096õ´½}2~\u009e>\t÷rþrø\u008aÜ<\u009b¼±éÝqñ\u008c>oE\u000bN\u007fóªÍÈßþ\u001dÁq¥"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           c = var14;
                           d = new Integer[10];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u000b¡oý¿¯¤\u0091L\u0006\u0089|\u0087àLÓ";
                        var13 = "\u000b¡oý¿¯¤\u0091L\u0006\u0089|\u0087àLÓ".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 29;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 27;
               break;
            case 1:
               var50 = 85;
               break;
            case 2:
               var50 = 109;
               break;
            case 3:
               var50 = 87;
               break;
            case 4:
               var50 = 120;
               break;
            case 5:
               var50 = 124;
               break;
            default:
               var50 = 114;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 27;
                  break;
               case 1:
                  var50 = 85;
                  break;
               case 2:
                  var50 = 109;
                  break;
               case 3:
                  var50 = 87;
                  break;
               case 4:
                  var50 = 120;
                  break;
               case 5:
                  var50 = 124;
                  break;
               default:
                  var50 = 114;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               b = var36;
               long var0 = 5924160921900028924L;
               long[] var6 = new long[10];
               int var3 = 0;
               String var4 = "+\u0092ªó I°\u0085¯NFc\u0017§]\u0001Ï\u0098\u0005*\u001b\u0012\u0096õ´½}2~\u009e>\t÷rþrø\u008aÜ<\u009b¼±éÝqñ\u008c>oE\u000bN\u007fóªÍÈßþ\u001dÁq¥";
               int var5 = "+\u0092ªó I°\u0085¯NFc\u0017§]\u0001Ï\u0098\u0005*\u001b\u0012\u0096õ´½}2~\u009e>\t÷rþrø\u008aÜ<\u009b¼±éÝqñ\u008c>oE\u000bN\u007fóªÍÈßþ\u001dÁq¥"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              c = var6;
                              d = new Integer[10];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u000b¡oý¿¯¤\u0091L\u0006\u0089|\u0087àLÓ";
                           var5 = "\u000b¡oý¿¯¤\u0091L\u0006\u0089|\u0087àLÓ".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 27;
                  break;
               case 1:
                  var50 = 85;
                  break;
               case 2:
                  var50 = 109;
                  break;
               case 3:
                  var50 = 87;
                  break;
               case 4:
                  var50 = 120;
                  break;
               case 5:
                  var50 = 124;
                  break;
               default:
                  var50 = 114;
            }
         }
      }
   }
}





