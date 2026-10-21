package com.finalshell.core;

public class Ht4 extends HG3 {
   public static float[] Z;
   public static String b;

   public Ht4() {
      super(Z);
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0002t\rVQ-b-h\u0014A^<g5j".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var36 = 46;
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
         var10007 = 46;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var52 = 110;
               break;
            case 1:
               var52 = 54;
               break;
            case 2:
               var52 = 86;
               break;
            case 3:
               var52 = 10;
               break;
            case 4:
               var52 = 80;
               break;
            case 5:
               var52 = 80;
               break;
            default:
               var52 = 37;
         }
      } else {
         var36 = 46;
         var21 = var10004;
         if (var10004 <= var8) {
            String var41 = new String(var10003).intern();
            int var27 = -1;
            b = var41;
            long var10 = 1527538618961915473L;
            long[] var9 = new long[4];
            int var12 = 0;
            String var13 = "|>!áÛênV;\u0088ñ\u0085ÛênW";
            int var14 = "|>!áÛênV;\u0088ñ\u0085ÛênW".length();
            byte var11 = 0;

            label72:
            while (true) {
               var27 = var11;
               var11 += 8;
               byte[] var16 = var13.substring(var27, var11).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var19 = var9;
               var27 = var12++;
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
                  long var50 = var34 ^ var10;
                  switch (var42) {
                     case 0:
                        var19[var27] = var50;
                        if (var11 >= var14) {
                           float[] var20 = new float[(int)var9[3]];
                           var20[0] = 0.071428575F;
                           var20[1] = 0.14285715F;
                           var20[2] = 0.071428575F;
                           var20[3] = 0.14285715F;
                           var20[4] = 0.14285715F;
                           var20[5] = 0.14285715F;
                           var20[(int)var9[1]] = 0.071428575F;
                           var20[(int)var9[0]] = 0.14285715F;
                           var20[(int)var9[2]] = 0.071428575F;
                           Z = var20;
                           return;
                        }
                        break;
                     default:
                        var19[var27] = var50;
                        if (var11 < var14) {
                           continue label72;
                        }

                        var13 = "\u001a'¨\bÛênYwYJeÛênX";
                        var14 = "\u001a'¨\bÛênYwYJeÛênX".length();
                        var11 = 0;
                  }

                  byte var30 = var11;
                  var11 += 8;
                  var16 = var13.substring(var30, var11).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var19 = var9;
                  var27 = var12++;
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
         var10007 = 46;
         var10006 = var53;
         switch (var8 % 7) {
            case 0:
               var52 = 110;
               break;
            case 1:
               var52 = 54;
               break;
            case 2:
               var52 = 86;
               break;
            case 3:
               var52 = 10;
               break;
            case 4:
               var52 = 80;
               break;
            case 5:
               var52 = 80;
               break;
            default:
               var52 = 37;
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
                  var52 = 110;
                  break;
               case 1:
                  var52 = 54;
                  break;
               case 2:
                  var52 = 86;
                  break;
               case 3:
                  var52 = 10;
                  break;
               case 4:
                  var52 = 80;
                  break;
               case 5:
                  var52 = 80;
                  break;
               default:
                  var52 = 37;
            }
         } else {
            if (var21 <= var8) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               b = var38;
               long var1 = 1527538618961915473L;
               long[] var0 = new long[4];
               int var4 = 0;
               String var5 = "|>!áÛênV;\u0088ñ\u0085ÛênW";
               int var6 = "|>!áÛênV;\u0088ñ\u0085ÛênW".length();
               byte var3 = 0;

               label38:
               while (true) {
                  var23 = var3;
                  var3 += 8;
                  byte[] var7 = var5.substring(var23, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var0;
                  var23 = var4++;
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
                     long var48 = var32 ^ var1;
                     switch (var39) {
                        case 0:
                           var10000[var23] = var48;
                           if (var3 >= var6) {
                              float[] var18 = new float[(int)var0[3]];
                              var18[0] = 0.071428575F;
                              var18[1] = 0.14285715F;
                              var18[2] = 0.071428575F;
                              var18[3] = 0.14285715F;
                              var18[4] = 0.14285715F;
                              var18[5] = 0.14285715F;
                              var18[(int)var0[1]] = 0.071428575F;
                              var18[(int)var0[0]] = 0.14285715F;
                              var18[(int)var0[2]] = 0.071428575F;
                              Z = var18;
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var3 < var6) {
                              continue label38;
                           }

                           var5 = "\u001a'¨\bÛênYwYJeÛênX";
                           var6 = "\u001a'¨\bÛênYwYJeÛênX".length();
                           var3 = 0;
                     }

                     byte var26 = var3;
                     var3 += 8;
                     var7 = var5.substring(var26, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                     var10000 = var0;
                     var23 = var4++;
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
                  var52 = 110;
                  break;
               case 1:
                  var52 = 54;
                  break;
               case 2:
                  var52 = 86;
                  break;
               case 3:
                  var52 = 10;
                  break;
               case 4:
                  var52 = 80;
                  break;
               case 5:
                  var52 = 80;
                  break;
               default:
                  var52 = 37;
            }
         }
      }
   }
}





