package com;

public enum YH {
   upCenter, upLeft, upRight, leftCenter, leftUp, leftDown, downCenter, downLeft, downRight, rightCenter, rightUp, rightDown;
   private static final long[] a;
   private static final Integer[] b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var8 = new String[12];
      int var12 = 0;
      String var11 = ",\u0018=yt\u0006\u001b\u00062\u0014<eU#\u000b,\u0018=yt\u0010\u000e0\u0005?c\b2\u0014<eD<\u001c0\u0007+\u0001\bxg;\u001f\b:\u001e-\u007fL6\r*\t:\u001e-\u007fR:\f6\u0005\n:\u001e-\u007fC6\u0005*\u0014(\n2\u0014<eC6\u0005*\u0014(\u0006+\u0001\u0016tf'";
      int var13 = ",\u0018=yt\u0006\u001b\u00062\u0014<eU#\u000b,\u0018=yt\u0010\u000e0\u0005?c\b2\u0014<eD<\u001c0\u0007+\u0001\bxg;\u001f\b:\u001e-\u007fL6\r*\t:\u001e-\u007fR:\f6\u0005\n:\u001e-\u007fC6\u0005*\u0014(\n2\u0014<eC6\u0005*\u0014(\u0006+\u0001\u0016tf'"
         .length();
      char var10 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 79;
         String var10001 = var11.substring(++var17, var17 + var10);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 17;
                        break;
                     case 1:
                        var65 = 62;
                        break;
                     case 2:
                        var65 = 21;
                        break;
                     case 3:
                        var65 = 94;
                        break;
                     case 4:
                        var65 = 79;
                        break;
                     case 5:
                        var65 = 28;
                        break;
                     default:
                        var65 = 36;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var44;
                  if ((var17 += var10) >= var13) {
                     long var0 = 4102034707368021016L;
                     long[] var6 = new long[13];
                     int var3 = 0;
                     String var4 = "þ®aEwC§\u0007ø\u008d\u001a2;%Ã[L\b_úÖùù\u009d¢ùüÊ\u001e\u0014\u0005\u00192M¾¥¹\u0015J\f6(\u0081Ë¿\u0001±¯\u0000\u0092ßå_qôCË\u008bI)T\u0084Ök\u008f)<Lpè9ß3®Ý\u0080\u00154jJFçùY\fYÖH";
                     int var5 = "þ®aEwC§\u0007ø\u008d\u001a2;%Ã[L\b_úÖùù\u009d¢ùüÊ\u001e\u0014\u0005\u00192M¾¥¹\u0015J\f6(\u0081Ë¿\u0001±¯\u0000\u0092ßå_qôCË\u008bI)T\u0084Ök\u008f)<Lpè9ß3®Ý\u0080\u00154jJFçùY\fYÖH"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    a = var6;
                                    b = new Integer[13];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0018\u000f\u0013¤<\u0007Ë\u009e8´±T\u009e÷Ü\u0006";
                                 var5 = "\u0018\u000f\u0013¤<\u0007Ë\u009e8´±T\u009e÷Ü\u0006".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var8[var12++] = var44;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label70;
                  }

                  var11 = "6\u0002'cn\r\u001e3\u0005\b1\u001b\u0003nt=\u00146";
                  var13 = "6\u0002'cn\r\u001e3\u0005\b1\u001b\u0003nt=\u00146".length();
                  var10 = '\t';
                  var17 = -1;
            }

            var10000 = 85;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3127;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}






