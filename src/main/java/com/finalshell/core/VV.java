package com.finalshell.core;

import java.security.MessageDigest;

public class VV {
   public static String[] q;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String o(byte[] var0) {
      String var10000 = D6.k();
      StringBuffer var2 = new StringBuffer();
      String var1 = var10000;
      int var3 = 0;
      if (var1 != null) {
         var2.append(A(var0[var3]));
         var3++;
      }

      while (true) {
         while (var3 < var0.length) {
            var2.append(A(var0[var3]));
            var3++;
         }

         if (var1 == null) {
            return var2.toString();
         }

         var3++;
      }
   }

   public static String A(byte var0) {
      String var10000 = D6.k();
      int var2 = var0;
      String var1 = var10000;
      int var5 = var0;
      if (var1 == null) {
         if (var0 < 0) {
            var2 = var0 + 256;
         }

         var5 = var2 / a(8311, 666575550021347929L);
      }

      int var3 = var5;
      int var4 = var2 % a(18386, 2185491522946944504L);
      return q[var3] + q[var4];
   }

   public static String T(String var0) {
      String var1 = null;

      try {
         var1 = new String(var0);
         MessageDigest var2 = MessageDigest.getInstance(a);
         var1 = o(var2.digest(var1.getBytes()));
      } catch (Exception var3) {
      }

      return var1;
   }

   public static void main(String[] var0) {
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2607;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "?\u0013e".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var36 = 115;
      char[] var10002 = var10003;
      int var21 = var10004;
      char[] var44;
      byte var52;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var44 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 115;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var52 = 1;
               break;
            case 1:
               var52 = 36;
               break;
            case 2:
               var52 = 35;
               break;
            case 3:
               var52 = 118;
               break;
            case 4:
               var52 = 100;
               break;
            case 5:
               var52 = 47;
               break;
            default:
               var52 = 17;
         }
      } else {
         var36 = 115;
         var21 = var10004;
         if (var10004 <= var8) {
            String var41 = new String(var10003).intern();
            int var27 = -1;
            a = var41;
            long var9 = 4542830768191708623L;
            long[] var14 = new long[12];
            int var11 = 0;
            String var12 = "NÅ)Óßä¸\u0086'\u0099hL\u009e3·\u0086\u0087ö\u0092J5gB#°þ\u0000àAPâù$ô¬T\u0006ÝH\u001a\u008a^\u001d¾8)P'¡N\u0087\u000f\u000b\fÒp\u0099z;\u0015Ê¤Qø\u0011ÈR\u0081¨ú\u00858Ý\u008c\u001aôÎH\u0094k";
            int var13 = "NÅ)Óßä¸\u0086'\u0099hL\u009e3·\u0086\u0087ö\u0092J5gB#°þ\u0000àAPâù$ô¬T\u0006ÝH\u001a\u008a^\u001d¾8)P'¡N\u0087\u000f\u000b\fÒp\u0099z;\u0015Ê¤Qø\u0011ÈR\u0081¨ú\u00858Ý\u008c\u001aôÎH\u0094k"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var27 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var27, var10).getBytes("ISO-8859-1");
               long[] var19 = var14;
               var27 = var11++;
               long var34 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var42 = -1;

               while (true) {
                  long var50 = var34 ^ var9;
                  switch (var42) {
                     case 0:
                        var19[var27] = var50;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[12];
                           String[] var20 = new String[a(18386, 2185491522946944504L)];
                           var20[0] = "0";
                           var20[1] = "1";
                           var20[2] = "2";
                           var20[3] = "3";
                           var20[4] = "4";
                           var20[5] = "5";
                           var20[a(900, 8894847978515237282L)] = "6";
                           var20[a(17809, 1838774055222955960L)] = "7";
                           var20[a(4824, 8325893610913569023L)] = "8";
                           var20[a(6382, 2800354731922985675L)] = "9";
                           var20[a(12140, 5879167121751844163L)] = "a";
                           var20[a(24565, 2390561461426804190L)] = "b";
                           var20[a(8262, 5905853898692078178L)] = "c";
                           var20[a(21964, 5215722676734091233L)] = "d";
                           var20[a(29972, 1142242809401114424L)] = "e";
                           var20[a(17936, 5521871854495353912L)] = "f";
                           q = var20;
                           return;
                        }
                        break;
                     default:
                        var19[var27] = var50;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "/®\u008e=u\u0092\u008f\r£%í\u001fJ-·¡";
                        var13 = "/®\u008e=u\u0092\u008f\r£%í\u001fJ-·¡".length();
                        var10 = 0;
                  }

                  byte var30 = var10;
                  var10 += 8;
                  var16 = var12.substring(var30, var10).getBytes("ISO-8859-1");
                  var19 = var14;
                  var27 = var11++;
                  var34 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var42 = 0;
               }
            }
         }

         var44 = var10003;
         var10005 = var8;
         char var53 = var10003[var8];
         var10007 = 115;
         var10006 = var53;
         switch (var8 % 7) {
            case 0:
               var52 = 1;
               break;
            case 1:
               var52 = 36;
               break;
            case 2:
               var52 = 35;
               break;
            case 3:
               var52 = 118;
               break;
            case 4:
               var52 = 100;
               break;
            case 5:
               var52 = 47;
               break;
            default:
               var52 = 17;
         }
      }

      while (true) {
         var44[var10005] = (char)(var10006 ^ var10007 ^ var52);
         var8++;
         if (var36 == 0) {
            var44 = var10002;
            var10005 = var36;
            char var55 = var10002[var36];
            var10007 = var36;
            var10006 = var55;
            switch (var8 % 7) {
               case 0:
                  var52 = 1;
                  break;
               case 1:
                  var52 = 36;
                  break;
               case 2:
                  var52 = 35;
                  break;
               case 3:
                  var52 = 118;
                  break;
               case 4:
                  var52 = 100;
                  break;
               case 5:
                  var52 = 47;
                  break;
               default:
                  var52 = 17;
            }
         } else {
            if (var21 <= var8) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               a = var38;
               long var0 = 4542830768191708623L;
               long[] var6 = new long[12];
               int var3 = 0;
               String var4 = "NÅ)Óßä¸\u0086'\u0099hL\u009e3·\u0086\u0087ö\u0092J5gB#°þ\u0000àAPâù$ô¬T\u0006ÝH\u001a\u008a^\u001d¾8)P'¡N\u0087\u000f\u000b\fÒp\u0099z;\u0015Ê¤Qø\u0011ÈR\u0081¨ú\u00858Ý\u008c\u001aôÎH\u0094k";
               int var5 = "NÅ)Óßä¸\u0086'\u0099hL\u009e3·\u0086\u0087ö\u0092J5gB#°þ\u0000àAPâù$ô¬T\u0006ÝH\u001a\u008a^\u001d¾8)P'¡N\u0087\u000f\u000b\fÒp\u0099z;\u0015Ê¤Qø\u0011ÈR\u0081¨ú\u00858Ý\u008c\u001aôÎH\u0094k"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var23 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var23, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var23 = var3++;
                  long var32 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var39 = -1;

                  while (true) {
                     long var48 = var32 ^ var0;
                     switch (var39) {
                        case 0:
                           var10000[var23] = var48;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[12];
                              String[] var18 = new String[a(18386, 2185491522946944504L)];
                              var18[0] = "0";
                              var18[1] = "1";
                              var18[2] = "2";
                              var18[3] = "3";
                              var18[4] = "4";
                              var18[5] = "5";
                              var18[a(900, 8894847978515237282L)] = "6";
                              var18[a(17809, 1838774055222955960L)] = "7";
                              var18[a(4824, 8325893610913569023L)] = "8";
                              var18[a(6382, 2800354731922985675L)] = "9";
                              var18[a(12140, 5879167121751844163L)] = "a";
                              var18[a(24565, 2390561461426804190L)] = "b";
                              var18[a(8262, 5905853898692078178L)] = "c";
                              var18[a(21964, 5215722676734091233L)] = "d";
                              var18[a(29972, 1142242809401114424L)] = "e";
                              var18[a(17936, 5521871854495353912L)] = "f";
                              q = var18;
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "/®\u008e=u\u0092\u008f\r£%í\u001fJ-·¡";
                           var5 = "/®\u008e=u\u0092\u008f\r£%í\u001fJ-·¡".length();
                           var2 = 0;
                     }

                     byte var26 = var2;
                     var2 += 8;
                     var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var23 = var3++;
                     var32 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var39 = 0;
                  }
               }
            }

            var44 = var10002;
            var10005 = var8;
            char var54 = var10002[var8];
            var10007 = var36;
            var10006 = var54;
            switch (var8 % 7) {
               case 0:
                  var52 = 1;
                  break;
               case 1:
                  var52 = 36;
                  break;
               case 2:
                  var52 = 35;
                  break;
               case 3:
                  var52 = 118;
                  break;
               case 4:
                  var52 = 100;
                  break;
               case 5:
                  var52 = 47;
                  break;
               default:
                  var52 = 17;
            }
         }
      }
   }
}





