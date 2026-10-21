package com;

enum S6 {
   EQ, NE, GT, GE, LT, LE, LIKE, NOT_LIKE, RLIKE, NOT_RLIKE, IN, NOT_IN, BETWEEN, NOT_BETWEEN, And, Or, REG_MATCH;
   private static final S6[] s;
   private static final long[] a;
   private static final Integer[] b;

   private static S6[] B() {
      S6[] var10000 = new S6[a(18491, 8393993693542485201L)];
      var10000[0] = EQ;
      var10000[1] = NE;
      var10000[2] = GT;
      var10000[3] = GE;
      var10000[4] = LT;
      var10000[5] = LE;
      var10000[a(11060, 8746497312926625750L)] = LIKE;
      var10000[a(23846, 6416178932637112774L)] = NOT_LIKE;
      var10000[a(16415, 5485471483460879599L)] = RLIKE;
      var10000[a(16093, 3413571137119582771L)] = NOT_RLIKE;
      var10000[a(1154, 909951168880918634L)] = IN;
      var10000[a(23932, 7904394205650491802L)] = NOT_IN;
      var10000[a(7969, 6504123496138234822L)] = BETWEEN;
      var10000[a(3043, 7344732789202472716L)] = NOT_BETWEEN;
      var10000[a(2796, 7729797464415227419L)] = And;
      var10000[a(20105, 6612950618871106152L)] = Or;
      var10000[a(24212, 7170361047027751520L)] = REG_MATCH;
      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var8 = new String[17];
      int var12 = 0;
      String var11 = "\u0002\u0013y~\u0015\u0002\u001e\u001a\u0002\u0015\u000e\u0004\u001c\u0016{p\u000b\u001e\u0010dj\u00128$\u0007\u001au{\u0002\u0019\u0011\t\u0002\u001awj\u001d<$\u0013\u0017\u0002\u0017\u000b\u0002\u0017\u001a\b\u001e\u0010dj\u001c4;\u0015\u0002\u001f-\u0002\u001c\u000b\u0002\u001c\u001a\t\u001e\u0010dj\u000219\u001b\u001a\u0006\u001e\u0010dj\u00193";
      int var13 = "\u0002\u0013y~\u0015\u0002\u001e\u001a\u0002\u0015\u000e\u0004\u001c\u0016{p\u000b\u001e\u0010dj\u00128$\u0007\u001au{\u0002\u0019\u0011\t\u0002\u001awj\u001d<$\u0013\u0017\u0002\u0017\u000b\u0002\u0017\u001a\b\u001e\u0010dj\u001c4;\u0015\u0002\u001f-\u0002\u001c\u000b\u0002\u001c\u001a\t\u001e\u0010dj\u000219\u001b\u001a\u0006\u001e\u0010dj\u00193"
         .length();
      char var10 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 114;
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
                        var65 = 34;
                        break;
                     case 1:
                        var65 = 45;
                        break;
                     case 2:
                        var65 = 66;
                        break;
                     case 3:
                        var65 = 71;
                        break;
                     case 4:
                        var65 = 34;
                        break;
                     case 5:
                        var65 = 15;
                        break;
                     default:
                        var65 = 2;
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
                     long var0 = 4293588133246143767L;
                     long[] var6 = new long[23];
                     int var3 = 0;
                     String var4 = "\u008b\u009d©¾=\u008c\u0014\u0086\u0087\u009c}Y§oVÝõ\u0098Ù[Dõù¸rÅ?\u008c#\u0082Ç\u0005\u0004ôkö°\u001ebÇKIK\u009c\u009c\núÉ\u0016ô\u0090\u0005\nÖ\u0014ÖÜç\u0092:®û\u0007p\u0085\u001f5r¦q÷-ó\u0093ÅáckÂ\u0016þ\u0080Õ<äßý\u0088D$ZP³\u0014\u008dH1\u008b£\u0013Û\u0080\u0001×ei\u000fnímN.\u001e\u0000\u007f,ýáMw¶òUÜ Ó\u0006\u001fÑè|·\u008fh\u0086Õ\u009a¬fÀQ×C\u0002\u0019\u0000\u009cüj\u009b\u0017g÷¦\u0094HÕ¸×ÑX\u008e%kÃ)<¿";
                     int var5 = "\u008b\u009d©¾=\u008c\u0014\u0086\u0087\u009c}Y§oVÝõ\u0098Ù[Dõù¸rÅ?\u008c#\u0082Ç\u0005\u0004ôkö°\u001ebÇKIK\u009c\u009c\núÉ\u0016ô\u0090\u0005\nÖ\u0014ÖÜç\u0092:®û\u0007p\u0085\u001f5r¦q÷-ó\u0093ÅáckÂ\u0016þ\u0080Õ<äßý\u0088D$ZP³\u0014\u008dH1\u008b£\u0013Û\u0080\u0001×ei\u000fnímN.\u001e\u0000\u007f,ýáMw¶òUÜ Ó\u0006\u001fÑè|·\u008fh\u0086Õ\u009a¬fÀQ×C\u0002\u0019\u0000\u009cüj\u009b\u0017g÷¦\u0094HÕ¸×ÑX\u008e%kÃ)<¿"
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
                                    b = new Integer[23];
                                    s = B();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "R«\u0012Üw\u008a:á¦X\u00825\u0098À\u0089ð";
                                 var5 = "R«\u0012Üw\u008a:á¦X\u00825\u0098À\u0089ð".length();
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

                  var11 = "Ee\u0000\u0007FN06Alj";
                  var13 = "Ee\u0000\u0007FN06Alj".length();
                  var10 = 3;
                  var17 = -1;
            }

            var10000 = 38;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17638;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}






