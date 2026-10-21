package com;

public class hJ_3 extends hN_3 {
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public hJ_3() {
      this.O = true;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var4 = var3 & a(6132, 3008151311472796463L);
      int var5 = var3 >> a(19571, 1115517044277082284L) & a(511, 5245538620097443115L);
      int var6 = var3 >> a(19968, 6911024689136335580L) & a(12262, 3189995845510175551L);
      int var7 = var3 & a(12262, 3189995845510175551L);
      var3 = var5 * a(12793, 2947977706785375532L) + var6 * a(7451, 7556011501194619331L) + var7 * a(29447, 6407309041508403161L)
         >> a(24286, 1947648028640897539L);
      return var4 | var3 << a(1399, 6906428786275004845L) | var3 << a(24286, 1947648028640897539L) | var3;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "'\u0000x\u001ffz\u0004#\u001du\tgjJ\b\n".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 5;
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
         var10007 = 5;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 97;
               break;
            case 1:
               var50 = 106;
               break;
            case 2:
               var50 = 17;
               break;
            case 3:
               var50 = 117;
               break;
            case 4:
               var50 = 17;
               break;
            case 5:
               var50 = 12;
               break;
            default:
               var50 = 46;
         }
      } else {
         var34 = 5;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8574836245730558675L;
            long[] var14 = new long[10];
            int var11 = 0;
            String var12 = "\u0089Ç\u0005ÆOKhØQÿ\b\u009aü\u0006ø\u0007ª\u0006Sg<ízoÊ\u009bd¬h«Å\u0016\u008d£çÔ§q\u0019\u0013'\u0003\u007f\u009f\u0016\u0092«\u0087Ì\u001eùý \u001c!üq2\u0003Mù\u009e3n";
            int var13 = "\u0089Ç\u0005ÆOKhØQÿ\b\u009aü\u0006ø\u0007ª\u0006Sg<ízoÊ\u009bd¬h«Å\u0016\u008d£çÔ§q\u0019\u0013'\u0003\u007f\u009f\u0016\u0092«\u0087Ì\u001eùý \u001c!üq2\u0003Mù\u009e3n"
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
                           b = var14;
                           c = new Integer[10];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "Þþà\u0081£\\\u0087²Ã¤çOkj7\u0007";
                        var13 = "Þþà\u0081£\\\u0087²Ã¤çOkj7\u0007".length();
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
         var10007 = 5;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 97;
               break;
            case 1:
               var50 = 106;
               break;
            case 2:
               var50 = 17;
               break;
            case 3:
               var50 = 117;
               break;
            case 4:
               var50 = 17;
               break;
            case 5:
               var50 = 12;
               break;
            default:
               var50 = 46;
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
                  var50 = 97;
                  break;
               case 1:
                  var50 = 106;
                  break;
               case 2:
                  var50 = 17;
                  break;
               case 3:
                  var50 = 117;
                  break;
               case 4:
                  var50 = 17;
                  break;
               case 5:
                  var50 = 12;
                  break;
               default:
                  var50 = 46;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8574836245730558675L;
               long[] var6 = new long[10];
               int var3 = 0;
               String var4 = "\u0089Ç\u0005ÆOKhØQÿ\b\u009aü\u0006ø\u0007ª\u0006Sg<ízoÊ\u009bd¬h«Å\u0016\u008d£çÔ§q\u0019\u0013'\u0003\u007f\u009f\u0016\u0092«\u0087Ì\u001eùý \u001c!üq2\u0003Mù\u009e3n";
               int var5 = "\u0089Ç\u0005ÆOKhØQÿ\b\u009aü\u0006ø\u0007ª\u0006Sg<ízoÊ\u009bd¬h«Å\u0016\u008d£çÔ§q\u0019\u0013'\u0003\u007f\u009f\u0016\u0092«\u0087Ì\u001eùý \u001c!üq2\u0003Mù\u009e3n"
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
                              b = var6;
                              c = new Integer[10];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "Þþà\u0081£\\\u0087²Ã¤çOkj7\u0007";
                           var5 = "Þþà\u0081£\\\u0087²Ã¤çOkj7\u0007".length();
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
                  var50 = 97;
                  break;
               case 1:
                  var50 = 106;
                  break;
               case 2:
                  var50 = 17;
                  break;
               case 3:
                  var50 = 117;
                  break;
               case 4:
                  var50 = 17;
                  break;
               case 5:
                  var50 = 12;
                  break;
               default:
                  var50 = 46;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13533;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





