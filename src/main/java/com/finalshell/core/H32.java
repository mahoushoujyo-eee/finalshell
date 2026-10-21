package com.finalshell.core;

public class H32 extends HN3 {
   public int Z;
   public int n;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public H32() {
      this(a(16606, 6965194478242854878L));
   }

   public H32(int var1) {
      this.m(var1);
   }

   public void m(int var1) {
      this.Z = var1;
      this.n = var1 << a(32053, 5403877708249713207L);
   }

   public int c() {
      return this.Z;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4 = W5.q();
      int var10000 = var3 & a(19978, 7689350814121031947L);
      if (var4 != null) {
         if (var10000 != 0) {
            return var3 & a(20537, 3921867766258263866L) | this.n;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14082;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "R4\f\u0001IZ\u001bE)\u0001\u0000HYUc>\u000e\rB\u0007\u001a?".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 54;
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
         var10007 = 54;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 39;
               break;
            case 1:
               var50 = 109;
               break;
            case 2:
               var50 = 86;
               break;
            case 3:
               var50 = 88;
               break;
            case 4:
               var50 = 13;
               break;
            case 5:
               var50 = 31;
               break;
            default:
               var50 = 2;
         }
      } else {
         var34 = 54;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 6613769134830532749L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12 = "vP9æ\u00adär¢Â\u0087à}ó\u001b H";
            int var13 = "vP9æ\u00adär¢Â\u0087à}ó\u001b H".length();
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
                           c = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "Eb´w/)OÛM¯Î¬\u000e\u000fA\u0086";
                        var13 = "Eb´w/)OÛM¯Î¬\u000e\u000fA\u0086".length();
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
         var10007 = 54;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 39;
               break;
            case 1:
               var50 = 109;
               break;
            case 2:
               var50 = 86;
               break;
            case 3:
               var50 = 88;
               break;
            case 4:
               var50 = 13;
               break;
            case 5:
               var50 = 31;
               break;
            default:
               var50 = 2;
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
                  var50 = 109;
                  break;
               case 2:
                  var50 = 86;
                  break;
               case 3:
                  var50 = 88;
                  break;
               case 4:
                  var50 = 13;
                  break;
               case 5:
                  var50 = 31;
                  break;
               default:
                  var50 = 2;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 6613769134830532749L;
               long[] var6 = new long[4];
               int var3 = 0;
               String var4 = "vP9æ\u00adär¢Â\u0087à}ó\u001b H";
               int var5 = "vP9æ\u00adär¢Â\u0087à}ó\u001b H".length();
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
                              c = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "Eb´w/)OÛM¯Î¬\u000e\u000fA\u0086";
                           var5 = "Eb´w/)OÛM¯Î¬\u000e\u000fA\u0086".length();
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
                  var50 = 109;
                  break;
               case 2:
                  var50 = 86;
                  break;
               case 3:
                  var50 = 88;
                  break;
               case 4:
                  var50 = 13;
                  break;
               case 5:
                  var50 = 31;
                  break;
               default:
                  var50 = 2;
            }
         }
      }
   }
}





