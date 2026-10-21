package com;

public class hC_3 extends hN_3 {
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   @Override
   public int C(int var1, int var2, int var3) {
      int var4 = var3 >> a(28671, 3530820060037907859L) & a(30203, 4011568995566886802L);
      int var5 = var3 >> a(8300, 6644520791036086785L) & a(1533, 8763396645457358738L);
      int var6 = var3 >> a(14785, 5695634925382620073L) & a(1533, 8763396645457358738L);
      int var7 = var3 & a(1533, 8763396645457358738L);
      float var8 = (float)var4 * 0.003921569F;
      var5 = (int)((float)var5 * var8);
      var6 = (int)((float)var6 * var8);
      var7 = (int)((float)var7 * var8);
      return var4 << a(5836, 6931105529815727270L) | var5 << a(11488, 1698792229241865867L) | var6 << a(23635, 8639532367033742909L) | var7;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "q:\u0012\u0016FO!B3\u000f\u000bK\u0014\u0018@:\u001b".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 43;
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
         var10007 = 43;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 27;
               break;
            case 1:
               var50 = 125;
               break;
            case 2:
               var50 = 73;
               break;
            case 3:
               var50 = 85;
               break;
            case 4:
               var50 = 12;
               break;
            case 5:
               var50 = 75;
               break;
            default:
               var50 = 90;
         }
      } else {
         var34 = 43;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3545554705094147845L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "À\tÌG,»ú\u008eàB`\u0087\u0094¾µ\u0014Òc\u009b\núPÉ0.§Àù\u0096\u008c\u0010h¸\u001cØó©d¬¤E\u0090,âTeàh";
            int var13 = "À\tÌG,»ú\u008eàB`\u0087\u0094¾µ\u0014Òc\u009b\núPÉ0.§Àù\u0096\u008c\u0010h¸\u001cØó©d¬¤E\u0090,âTeàh".length();
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
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "~Íú÷¥°\u0083»ÚK\u008cë3þ9\u009e";
                        var13 = "~Íú÷¥°\u0083»ÚK\u008cë3þ9\u009e".length();
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
         var10007 = 43;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 27;
               break;
            case 1:
               var50 = 125;
               break;
            case 2:
               var50 = 73;
               break;
            case 3:
               var50 = 85;
               break;
            case 4:
               var50 = 12;
               break;
            case 5:
               var50 = 75;
               break;
            default:
               var50 = 90;
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
                  var50 = 125;
                  break;
               case 2:
                  var50 = 73;
                  break;
               case 3:
                  var50 = 85;
                  break;
               case 4:
                  var50 = 12;
                  break;
               case 5:
                  var50 = 75;
                  break;
               default:
                  var50 = 90;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3545554705094147845L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "À\tÌG,»ú\u008eàB`\u0087\u0094¾µ\u0014Òc\u009b\núPÉ0.§Àù\u0096\u008c\u0010h¸\u001cØó©d¬¤E\u0090,âTeàh";
               int var5 = "À\tÌG,»ú\u008eàB`\u0087\u0094¾µ\u0014Òc\u009b\núPÉ0.§Àù\u0096\u008c\u0010h¸\u001cØó©d¬¤E\u0090,âTeàh".length();
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
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "~Íú÷¥°\u0083»ÚK\u008cë3þ9\u009e";
                           var5 = "~Íú÷¥°\u0083»ÚK\u008cë3þ9\u009e".length();
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
                  var50 = 125;
                  break;
               case 2:
                  var50 = 73;
                  break;
               case 3:
                  var50 = 85;
                  break;
               case 4:
                  var50 = 12;
                  break;
               case 5:
                  var50 = 75;
                  break;
               default:
                  var50 = 90;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27244;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





