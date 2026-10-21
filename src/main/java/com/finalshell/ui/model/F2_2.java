package com.finalshell.ui.model;

public final class F2_2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static F2_2 END_OF_INPUT;
   public static F2_2 IDENTIFIER;
   public static F2_2 KEYWORD;
   public static F2_2 INTEGER_LITERAL;
   public static F2_2 FLOATING_POINT_LITERAL;
   public static F2_2 BOOLEAN_LITERAL;
   public static F2_2 CHARACTER_LITERAL;
   public static F2_2 STRING_LITERAL;
   public static F2_2 NULL_LITERAL;
   public static F2_2 OPERATOR;
   public static F2_2 WHITE_SPACE;
   public static F2_2 C_PLUS_PLUS_STYLE_COMMENT;
   public static F2_2 C_STYLE_COMMENT;
   public static long[] a;
   public static Integer[] b;

   public static F2_2[] values() {
      return (F2_2[])h.clone();
   }

   public static F2_2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public F2_2(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6664;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var8 = new String[13];
      int var12 = 0;
      String var11 = "*\u0018~\u0003v&:\f$\u0013c\u000bv2!(\u0013w\u0001m\u000f#\u0012h\u0018|50>\u0011n\u0000|&?-\u000b6\u0015n\u0000|+-1\u001cd\u0011\u0019\"\u0002w\u0018l'!1\u0011r\u0007f'*8\u0011b\u000bz;3,\u0018i\u0000\u000f(\u0013s\u0011~1,>\u0011n\u0000|&?-\u0016'\u0011h\u0015m=0&\u0002w\u001bp:*>\u0011n\u0000|&?-\n(\u0019b\u001am=8(\u0018u\u000f\"\u0002t\u0000`8;>\u001eh\u0019t105\u0011\"\u0015f\u0006x7*$\u000fx\u0018p ;3\u001ck\b.\rb\u0006x 13";
      int var13 = "*\u0018~\u0003v&:\f$\u0013c\u000bv2!(\u0013w\u0001m\u000f#\u0012h\u0018|50>\u0011n\u0000|&?-\u000b6\u0015n\u0000|+-1\u001cd\u0011\u0019\"\u0002w\u0018l'!1\u0011r\u0007f'*8\u0011b\u000bz;3,\u0018i\u0000\u000f(\u0013s\u0011~1,>\u0011n\u0000|&?-\u0016'\u0011h\u0015m=0&\u0002w\u001bp:*>\u0011n\u0000|&?-\n(\u0019b\u001am=8(\u0018u\u000f\"\u0002t\u0000`8;>\u001eh\u0019t105\u0011\"\u0015f\u0006x7*$\u000fx\u0018p ;3\u001ck\b.\rb\u0006x 13"
         .length();
      char var10 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 78;
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
                        var65 = 47;
                        break;
                     case 1:
                        var65 = 19;
                        break;
                     case 2:
                        var65 = 105;
                        break;
                     case 3:
                        var65 = 26;
                        break;
                     case 4:
                        var65 = 119;
                        break;
                     case 5:
                        var65 = 58;
                        break;
                     default:
                        var65 = 48;
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
                     long var0 = 7819731775894784899L;
                     long[] var6 = new long[15];
                     int var3 = 0;
                     String var4 = "Lw-E\u0091õæ¬Ò©1é ä\u009f\u008c¦ty/\u0083L\u009c\bd\u0003xØ\u0089\u0005\u0011#ú\u0001á×?b9\u0005òÌ/Î\u0083ÿ\u001f\u0004ùJHþBtã\u0090\u008aù~\u008fGÜupð\u0088M\u0013wÁ\u0010Ð¿¦RÐ\u001a\u009b\ní\u009a\u0007\u0014\u0017\u0080Ðù ¨®þ\u0098ÂÊ¢´=\u000ek¹VæÓº";
                     int var5 = "Lw-E\u0091õæ¬Ò©1é ä\u009f\u008c¦ty/\u0083L\u009c\bd\u0003xØ\u0089\u0005\u0011#ú\u0001á×?b9\u0005òÌ/Î\u0083ÿ\u001f\u0004ùJHþBtã\u0090\u008aù~\u008fGÜupð\u0088M\u0013wÁ\u0010Ð¿¦RÐ\u001a\u009b\ní\u009a\u0007\u0014\u0017\u0080Ðù ¨®þ\u0098ÂÊ¢´=\u000ek¹VæÓº"
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
                                    b = new Integer[15];
                                    END_OF_INPUT = new F2_2(var8[1], 0);
                                    IDENTIFIER = new F2_2(var8[7], 1);
                                    KEYWORD = new F2_2(var8[0], 2);
                                    INTEGER_LITERAL = new F2_2(var8[5], 3);
                                    FLOATING_POINT_LITERAL = new F2_2(var8[6], 4);
                                    BOOLEAN_LITERAL = new F2_2(var8[2], 5);
                                    CHARACTER_LITERAL = new F2_2(var8[9], a(26791, 6852154458917040805L));
                                    STRING_LITERAL = new F2_2(var8[12], a(7219, 3985489239738648118L));
                                    NULL_LITERAL = new F2_2(var8[11], a(3465, 2211265244159252355L));
                                    OPERATOR = new F2_2(var8[10], a(7014, 6157710819595387239L));
                                    WHITE_SPACE = new F2_2(var8[3], a(345, 523049393218788185L));
                                    C_PLUS_PLUS_STYLE_COMMENT = new F2_2(var8[4], a(16950, 5726251509863012402L));
                                    C_STYLE_COMMENT = new F2_2(var8[8], a(3718, 6294454914054886539L));
                                    h = K();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Ju¸#cÈ\u008d²\u0011Þ]¦SyG½";
                                 var5 = "Ju¸#cÈ\u008d²\u0011Þ]¦SyG½".length();
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

                  var11 = "Oh\u000bx\u0006XWUx\u0015u\u0015\u000eRi\u0015}\u0017SAMt\u0013q\u000bUR";
                  var13 = "Oh\u000bx\u0006XWUx\u0015u\u0015\u000eRi\u0015}\u0017SAMt\u0013q\u000bUR".length();
                  var10 = '\f';
                  var17 = -1;
            }

            var10000 = 46;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
}







