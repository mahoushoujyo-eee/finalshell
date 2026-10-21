package com.finalshell.core;

public class H52 extends HN3 {
   public float p = 1.0F;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public H52() {
   }

   public H52(float var1) {
      this.p = var1;
      this.O = true;
   }

   public void a(float var1) {
      this.p = var1;
   }

   public float d() {
      return this.p;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4 = W5.q();
      float var13;
      int var10000 = (var13 = this.p - 1.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      if (var4 != null) {
         if (var10000 != 0) {
            int var5 = var3 & a(28358, 8641580959647345706L);
            int var6 = var3 >> a(17788, 7225141971987269521L) & a(26062, 5668912936437917477L);
            int var7 = var3 >> a(18241, 6013515469330482603L) & a(27615, 405545812519201073L);
            int var8 = var3 & a(27615, 405545812519201073L);
            int var9 = (var6 + var7 + var8) / 3;
            var6 = Iw4.e((int)((float)var9 + this.p * (float)(var6 - var9)));
            var7 = Iw4.e((int)((float)var9 + this.p * (float)(var7 - var9)));
            var8 = Iw4.e((int)((float)var9 + this.p * (float)(var8 - var9)));
            return var5 | var6 << a(6516, 7363863608154315675L) | var7 << a(3493, 8128393807074578253L) | var8;
         }

         var10000 = var3;
      }

      return var10000;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17134;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001aPq7\u0019Km\n^i-\u0019Y60PsvE\u0016".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 126;
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
         var10007 = 126;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 39;
               break;
            case 1:
               var50 = 65;
               break;
            case 2:
               var50 = 99;
               break;
            case 3:
               var50 = 38;
               break;
            case 4:
               var50 = 21;
               break;
            case 5:
               var50 = 70;
               break;
            default:
               var50 = 60;
         }
      } else {
         var34 = 126;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 492507650868662613L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "ÓWe|Ôjø\u009b°n®DñF\u008aÞ¬Ü»\u0090¡¿}\u007f.Å§Ö\u008f!VÔNÙzW\u0003òÔö";
            int var13 = "ÓWe|Ôjø\u009b°n®DñF\u008aÞ¬Ü»\u0090¡¿}\u007f.Å§Ö\u008f!VÔNÙzW\u0003òÔö".length();
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
                           b = var14;
                           c = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "÷a\u0092È\u0095Ïö\u008f\u0086óû\u0096¢\u001a\u001e\u0010";
                        var13 = "÷a\u0092È\u0095Ïö\u008f\u0086óû\u0096¢\u001a\u001e\u0010".length();
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
         var10007 = 126;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 39;
               break;
            case 1:
               var50 = 65;
               break;
            case 2:
               var50 = 99;
               break;
            case 3:
               var50 = 38;
               break;
            case 4:
               var50 = 21;
               break;
            case 5:
               var50 = 70;
               break;
            default:
               var50 = 60;
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
                  var50 = 39;
                  break;
               case 1:
                  var50 = 65;
                  break;
               case 2:
                  var50 = 99;
                  break;
               case 3:
                  var50 = 38;
                  break;
               case 4:
                  var50 = 21;
                  break;
               case 5:
                  var50 = 70;
                  break;
               default:
                  var50 = 60;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 492507650868662613L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "ÓWe|Ôjø\u009b°n®DñF\u008aÞ¬Ü»\u0090¡¿}\u007f.Å§Ö\u008f!VÔNÙzW\u0003òÔö";
               int var5 = "ÓWe|Ôjø\u009b°n®DñF\u008aÞ¬Ü»\u0090¡¿}\u007f.Å§Ö\u008f!VÔNÙzW\u0003òÔö".length();
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
                              b = var6;
                              c = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "÷a\u0092È\u0095Ïö\u008f\u0086óû\u0096¢\u001a\u001e\u0010";
                           var5 = "÷a\u0092È\u0095Ïö\u008f\u0086óû\u0096¢\u001a\u001e\u0010".length();
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
                  var50 = 39;
                  break;
               case 1:
                  var50 = 65;
                  break;
               case 2:
                  var50 = 99;
                  break;
               case 3:
                  var50 = 38;
                  break;
               case 4:
                  var50 = 21;
                  break;
               case 5:
                  var50 = 70;
                  break;
               default:
                  var50 = 60;
            }
         }
      }
   }
}





