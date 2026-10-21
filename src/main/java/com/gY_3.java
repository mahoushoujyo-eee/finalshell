package com;

public class gY_3 extends hN_3 {
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var10000 = com.W5.q();
      int var5 = var3 >> a(19782, 188101063011323547L) & a(5677, 8829751395969963510L);
      int var6 = var3 >> a(2409, 2931288019656215221L) & a(17966, 1820859695357249014L);
      int var7 = var3 >> a(24756, 3894127669186126701L) & a(17966, 1820859695357249014L);
      String[] var4 = var10000;
      int var8 = var3 & a(17966, 1820859695357249014L);
      int var13 = var5;
      if (var4 != null) {
         if (var5 != 0) {
            if (var4 == null) {
               return var5;
            }

            if (var5 != a(17966, 1820859695357249014L)) {
               float var9 = 255.0F / (float)var5;
               var6 = (int)((float)var6 * var9);
               var7 = (int)((float)var7 * var9);
               var8 = (int)((float)var8 * var9);
               int var14 = var6;
               int var10001 = a(17966, 1820859695357249014L);
               if (var4 != null) {
                  if (var6 > var10001) {
                     var6 = a(17966, 1820859695357249014L);
                  }

                  var14 = var7;
                  var10001 = a(17966, 1820859695357249014L);
               }

               if (var4 != null) {
                  if (var14 > var10001) {
                     var7 = a(17966, 1820859695357249014L);
                  }

                  var14 = var8;
                  var10001 = a(17966, 1820859695357249014L);
               }

               if (var4 != null) {
                  if (var14 > var10001) {
                     var8 = a(17966, 1820859695357249014L);
                  }

                  var14 = var5 << a(18899, 4362256899422571020L) | var6 << a(1003, 1331381569266188337L) | var7 << a(10085, 6344459786157434043L);
                  var10001 = var8;
               }

               return var14 | var10001;
            }
         }

         var13 = var3;
      }

      return var13;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\n\u000ey\nq5\u000b%\u0012{\u0007}o2?\u000by\u000ei".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 4;
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
         var10007 = 4;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 79;
               break;
            case 1:
               var50 = 102;
               break;
            case 2:
               var50 = 13;
               break;
            case 3:
               var50 = 102;
               break;
            case 4:
               var50 = 20;
               break;
            case 5:
               var50 = 30;
               break;
            default:
               var50 = 90;
         }
      } else {
         var34 = 4;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 480753058350457514L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "ñüÅÚ®½(¾U\u0016q\u009f¦\u0003F\u0019çÖ{(\u0091\u0000¬)\u000b±\u0089\u008bZ^è\u000f{a\u001c\u009eÐe÷£\u001a\u00920.»4b\u008b";
            int var13 = "ñüÅÚ®½(¾U\u0016q\u009f¦\u0003F\u0019çÖ{(\u0091\u0000¬)\u000b±\u0089\u008bZ^è\u000f{a\u001c\u009eÐe÷£\u001a\u00920.»4b\u008b".length();
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

                        var12 = "ö\u009b\u001fr¬r\u0081Ï\u0087§ÐUÜ1'£";
                        var13 = "ö\u009b\u001fr¬r\u0081Ï\u0087§ÐUÜ1'£".length();
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
         var10007 = 4;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 79;
               break;
            case 1:
               var50 = 102;
               break;
            case 2:
               var50 = 13;
               break;
            case 3:
               var50 = 102;
               break;
            case 4:
               var50 = 20;
               break;
            case 5:
               var50 = 30;
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
                  var50 = 79;
                  break;
               case 1:
                  var50 = 102;
                  break;
               case 2:
                  var50 = 13;
                  break;
               case 3:
                  var50 = 102;
                  break;
               case 4:
                  var50 = 20;
                  break;
               case 5:
                  var50 = 30;
                  break;
               default:
                  var50 = 90;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 480753058350457514L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "ñüÅÚ®½(¾U\u0016q\u009f¦\u0003F\u0019çÖ{(\u0091\u0000¬)\u000b±\u0089\u008bZ^è\u000f{a\u001c\u009eÐe÷£\u001a\u00920.»4b\u008b";
               int var5 = "ñüÅÚ®½(¾U\u0016q\u009f¦\u0003F\u0019çÖ{(\u0091\u0000¬)\u000b±\u0089\u008bZ^è\u000f{a\u001c\u009eÐe÷£\u001a\u00920.»4b\u008b"
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
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ö\u009b\u001fr¬r\u0081Ï\u0087§ÐUÜ1'£";
                           var5 = "ö\u009b\u001fr¬r\u0081Ï\u0087§ÐUÜ1'£".length();
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
                  var50 = 79;
                  break;
               case 1:
                  var50 = 102;
                  break;
               case 2:
                  var50 = 13;
                  break;
               case 3:
                  var50 = 102;
                  break;
               case 4:
                  var50 = 20;
                  break;
               case 5:
                  var50 = 30;
                  break;
               default:
                  var50 = 90;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 991;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





