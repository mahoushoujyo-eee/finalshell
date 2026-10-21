package com.finalshell.ui.model;

import com.finalshell.core.Nv4;

public final class EP extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static EP QuoteFieldNames;
   public static EP UseSingleQuotes;
   public static EP WriteMapNullValue;
   public static EP WriteEnumUsingToString;
   public static EP WriteEnumUsingName;
   public static EP UseISO8601DateFormat;
   public static EP WriteNullListAsEmpty;
   public static EP WriteNullStringAsEmpty;
   public static EP WriteNullNumberAsZero;
   public static EP WriteNullBooleanAsFalse;
   public static EP SkipTransientField;
   public static EP SortField;
   @Deprecated
   public static EP WriteTabAsSpecial;
   public static EP PrettyFormat;
   public static EP WriteClassName;
   public static EP DisableCircularReferenceDetect;
   public static EP WriteSlashAsSpecial;
   public static EP BrowserCompatible;
   public static EP WriteDateUseDateFormat;
   public static EP NotWriteRootClassName;
   /** @deprecated */
   public static EP DisableCheckSpecialChar;
   public static EP BeanToArray;
   public static EP WriteNonStringKeyAsString;
   public static EP NotWriteDefaultValue;
   public static EP BrowserSecure;
   public static EP IgnoreNonFieldGetter;
   public static EP WriteNonStringValueAsString;
   public static EP IgnoreErrorGetter;
   public static EP WriteBigDecimalAsPlain;
   public static EP MapSortField;
   public final int mask = 1 << this.ordinal();
   public static EP[] EMPTY;
   public static int WRITE_MAP_NULL_FEATURES;
   public static long[] a;
   public static Integer[] b;

   public static EP[] values() {
      return (EP[])c.clone();
   }

   public static EP valueOf(String var0) {
      return Enum.valueOf(EP.class, var0);
   }

   public EP(String var1, int var2) {
      super(var1, var2);
   }

   public final int a() {
      return this.mask;
   }

   public static boolean e(int var0, EP var1) {
      String var2 = Nv4.o();
      int var10000 = var0 & var1.mask;
      if (var2 != null) {
         var10000 = var10000 != 0 ? 1 : 0;
      }

      return var10000 != 0;
   }

   public static boolean a(int var0, int var1, EP var2) {
      String var10000 = Nv4.o();
      int var4 = var2.mask;
      String var3 = var10000;
      int var5 = var0 & var4;
      if (var3 != null) {
         if (var5 == 0) {
            int var6 = var1 & var4;
            if (var3 == null) {
               return var6 != 0;
            }

            if (var6 == 0) {
               return 0 != 0;
            }
         }

         var5 = 1;
      }

      return var5 != 0;
   }

   public static int g(int var0, EP var1, boolean var2) {
      String var3 = Nv4.o();
      int var10000 = (var2) ? 1 : 0;
      if (var3 != null) {
         if (var2 != 0) {
            var0 |= var1.mask;
            if (var3 != null) {
               return var0;
            }
         }

         var10000 = var0 & ~var1.mask;
      }

      return var10000;
   }

   public static int Q(EP[] var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = 0;

         for (EP var5 : var0) {
            var1 |= var5.mask;
         }

         return var1;
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11868;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[30];
      int var12 = 0;
      String var11 = "2F|3N\u0007U\u0011Q@4N\u0007U\u0011QS(Y.U\u0011\u000e2F|3N\u0000X\u0004Gf\tJ.Q\u00140Gp\u000ex\f\fS\u0004$\u0003J7Q#[g*J7\f5Fp3_:r\nFx&_\u000f0Gp\u0014B-S\tQD2D7Q\u0016\u00172F|3N\rA\tXW(D/Q\u0004ZT4m\"X\u0016Q\u00126_|7\u007f1U\u000bG|\"E7r\fQy#\u0011'Fz0X&F&[x7J7]\u0007Xp\u00162F|3N\u0006Z\u0010Y@4B-S1[F3Y*Z\u0002\u0014+[a\u0010Y*@\u0000pp!J6X\u0011bt+^&\u001b2F|3N\r[\u000bga5B-S3Uy2N\u0002G6@g.E$\u000b'Qt)\u007f,u\u0017Ft>\u0014,S{(Y&z\nZS.N/P\"Qa3N1\f(Ue\u0014D1@#]p+O\u00162F|3N\rA\tXF3Y*Z\u0002uf\u0002F3@\u001c\u00132F|3N\u0010X\u0004G}\u0006X\u0010D\u0000W|&G\u00162F|3N\u0001]\u0002pp$B.U\tuf\u0017G\"]\u000b\u000f4Az3N\u0005]\u0000Xq\tJ.Q\u0016\u00122F|3N\u0006Z\u0010Y@4B-S+Ux\"\u0011,S{(Y&q\u0017Fz5l&@\u0011Qg\t6[g3m*Q\tP\r'Fz0X&F6Qv2Y&\u0017!]f&I/Q&\\p$@\u0010D\u0000W|&G\u0000\\\u0004F\u00112F|3N\u0017U\u0007uf\u0014[&W\fUy\u00152F|3N\rA\tX[2F!Q\u0017uf\u001dN1[\u00142F|3N\rA\tXY.X7u\u0016qx7_:\u00192F|3N\r[\u000bga5B-S.Ql\u0006X\u0010@\u0017]{ \u001e!]f&I/Q&]g$^/U\u0017fp!N1Q\u000bWp\u0003N7Q\u0006@";
      int var13 = "2F|3N\u0007U\u0011Q@4N\u0007U\u0011QS(Y.U\u0011\u000e2F|3N\u0000X\u0004Gf\tJ.Q\u00140Gp\u000ex\f\fS\u0004$\u0003J7Q#[g*J7\f5Fp3_:r\nFx&_\u000f0Gp\u0014B-S\tQD2D7Q\u0016\u00172F|3N\rA\tXW(D/Q\u0004ZT4m\"X\u0016Q\u00126_|7\u007f1U\u000bG|\"E7r\fQy#\u0011'Fz0X&F&[x7J7]\u0007Xp\u00162F|3N\u0006Z\u0010Y@4B-S1[F3Y*Z\u0002\u0014+[a\u0010Y*@\u0000pp!J6X\u0011bt+^&\u001b2F|3N\r[\u000bga5B-S3Uy2N\u0002G6@g.E$\u000b'Qt)\u007f,u\u0017Ft>\u0014,S{(Y&z\nZS.N/P\"Qa3N1\f(Ue\u0014D1@#]p+O\u00162F|3N\rA\tXF3Y*Z\u0002uf\u0002F3@\u001c\u00132F|3N\u0010X\u0004G}\u0006X\u0010D\u0000W|&G\u00162F|3N\u0001]\u0002pp$B.U\tuf\u0017G\"]\u000b\u000f4Az3N\u0005]\u0000Xq\tJ.Q\u0016\u00122F|3N\u0006Z\u0010Y@4B-S+Ux\"\u0011,S{(Y&q\u0017Fz5l&@\u0011Qg\t6[g3m*Q\tP\r'Fz0X&F6Qv2Y&\u0017!]f&I/Q&\\p$@\u0010D\u0000W|&G\u0000\\\u0004F\u00112F|3N\u0017U\u0007uf\u0014[&W\fUy\u00152F|3N\rA\tX[2F!Q\u0017uf\u001dN1[\u00142F|3N\rA\tXY.X7u\u0016qx7_:\u00192F|3N\r[\u000bga5B-S.Ql\u0006X\u0010@\u0017]{ \u001e!]f&I/Q&]g$^/U\u0017fp!N1Q\u000bWp\u0003N7Q\u0006@"
         .length();
      char var10 = 22;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 62;
         String var10001 = var11.substring(++var17, var17 + var10);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 91;
                        break;
                     case 1:
                        var65 = 10;
                        break;
                     case 2:
                        var65 = 43;
                        break;
                     case 3:
                        var65 = 121;
                        break;
                     case 4:
                        var65 = 21;
                        break;
                     case 5:
                        var65 = 125;
                        break;
                     default:
                        var65 = 10;
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
                     long var0 = 7855599374859201195L;
                     long[] var6 = new long[49];
                     int var3 = 0;
                     String var4 = "ëí\u008dß¨Ì\u0002ß§ªTô\u007f\u0011\u0017{ÉÒMni\u00ad¶\u001fEì\b\u009b©xbKE6K½¥|d\u008fÉ¶Õ.D\u0000D\u009c\u008bÊê\"\u009a\u009dX\u00001à\u009aÒ!\u0002\u00865õã\u009ce\u0013|)àK\u0093\u009e£ú±k\u0083ðFÁ\u0014PRëÕÞV\u0094ËÈæ\u001aåú®\u0089>¼D¢Nu3<FÉ \"$H\u0003³8\bv`\u0088\"\u0017ªL©ø#þd\r\u0094\u0090×C\u00adÑÌ\u001dXÕõX?=çc»WÆ¼W\u0014j¾mc\u0092$µ\u009dðÒkÆ\u0012\u000bÄç)Gèõ\u0096yç\u000bÌºy\u0091B\u0095J+«ÆS\u0007æÂ»>\u0012\u0082BüN\u0012·ÀÓáãpÅxÅ\u0088X\u00adsá®-½\u0011Ö¨Ý'[\u0002Æöûî}`\u009a÷,QWÍî\u0007õ*sªt\u009e\u008e¥\u00adÞçÉn³Ç1\u0019j\u000e{µ\u001c\u0091´8î,Ù¶\"Þ\u008cP\u0011\u0080_\u0017¥s\u0081\u009búÛ*\u0081x2ÖÚ\u00adûÚiö9ï²\u0018\u001dè\u0007\u0089laòíH{]ü\b%B \u0006¼é|\u0086Õ\u0081IÝ\u000bµlK\u0006ÅÇrtÓ\\Ô\u0086;¯\u0085(¨m~×_\u0017ë}¾ù¿\n\u0001\u0017¤«§È¼\u0002?õi\u001eûÐd[%\u0099Ógà\u009e\u008d\u0006Ç¸\n1";
                     int var5 = "ëí\u008dß¨Ì\u0002ß§ªTô\u007f\u0011\u0017{ÉÒMni\u00ad¶\u001fEì\b\u009b©xbKE6K½¥|d\u008fÉ¶Õ.D\u0000D\u009c\u008bÊê\"\u009a\u009dX\u00001à\u009aÒ!\u0002\u00865õã\u009ce\u0013|)àK\u0093\u009e£ú±k\u0083ðFÁ\u0014PRëÕÞV\u0094ËÈæ\u001aåú®\u0089>¼D¢Nu3<FÉ \"$H\u0003³8\bv`\u0088\"\u0017ªL©ø#þd\r\u0094\u0090×C\u00adÑÌ\u001dXÕõX?=çc»WÆ¼W\u0014j¾mc\u0092$µ\u009dðÒkÆ\u0012\u000bÄç)Gèõ\u0096yç\u000bÌºy\u0091B\u0095J+«ÆS\u0007æÂ»>\u0012\u0082BüN\u0012·ÀÓáãpÅxÅ\u0088X\u00adsá®-½\u0011Ö¨Ý'[\u0002Æöûî}`\u009a÷,QWÍî\u0007õ*sªt\u009e\u008e¥\u00adÞçÉn³Ç1\u0019j\u000e{µ\u001c\u0091´8î,Ù¶\"Þ\u008cP\u0011\u0080_\u0017¥s\u0081\u009búÛ*\u0081x2ÖÚ\u00adûÚiö9ï²\u0018\u001dè\u0007\u0089laòíH{]ü\b%B \u0006¼é|\u0086Õ\u0081IÝ\u000bµlK\u0006ÅÇrtÓ\\Ô\u0086;¯\u0085(¨m~×_\u0017ë}¾ù¿\n\u0001\u0017¤«§È¼\u0002?õi\u001eûÐd[%\u0099Ógà\u009e\u008d\u0006Ç¸\n1"
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
                                    b = new Integer[49];
                                    QuoteFieldNames = new EP(var8[17], 0);
                                    UseSingleQuotes = new EP(var8[4], 1);
                                    WriteMapNullValue = new EP(var8[28], 2);
                                    WriteEnumUsingToString = new EP(var8[8], 3);
                                    WriteEnumUsingName = new EP(var8[18], 4);
                                    UseISO8601DateFormat = new EP(var8[2], 5);
                                    WriteNullListAsEmpty = new EP(var8[25], a(26328, 9090847318221211785L));
                                    WriteNullStringAsEmpty = new EP(var8[14], a(12079, 5586288705432289657L));
                                    WriteNullNumberAsZero = new EP(var8[24], a(530, 6770578692583304277L));
                                    WriteNullBooleanAsFalse = new EP(var8[5], a(20193, 5939134367295824019L));
                                    SkipTransientField = new EP(var8[6], a(29043, 3648390486108397372L));
                                    SortField = new EP(var8[20], a(32725, 230487192370270622L));
                                    WriteTabAsSpecial = new EP(var8[23], a(12145, 498406435922772260L));
                                    PrettyFormat = new EP(var8[3], a(7420, 3385892268217873062L));
                                    WriteClassName = new EP(var8[1], a(26299, 8980568666504939755L));
                                    DisableCircularReferenceDetect = new EP(var8[27], a(24086, 7172550057192157249L));
                                    WriteSlashAsSpecial = new EP(var8[15], a(21405, 3260456952099143104L));
                                    BrowserCompatible = new EP(var8[7], a(6602, 2651218033636980657L));
                                    WriteDateUseDateFormat = new EP(var8[0], a(9010, 5466356657764011376L));
                                    NotWriteRootClassName = new EP(var8[29], a(12211, 3539495291320566213L));
                                    DisableCheckSpecialChar = new EP(var8[22], a(29499, 4269634809859530111L));
                                    BeanToArray = new EP(var8[11], a(16155, 1406770256964129124L));
                                    WriteNonStringKeyAsString = new EP(var8[26], a(29436, 8388585162953120930L));
                                    NotWriteDefaultValue = new EP(var8[9], a(26913, 6564162961684875117L));
                                    BrowserSecure = new EP(var8[21], a(28, 4226344961463332436L));
                                    IgnoreNonFieldGetter = new EP(var8[12], a(17116, 7696811976684596359L));
                                    WriteNonStringValueAsString = new EP(var8[10], a(26396, 6617971173826971983L));
                                    IgnoreErrorGetter = new EP(var8[19], a(381, 3933793400645201720L));
                                    WriteBigDecimalAsPlain = new EP(var8[16], a(14007, 5489294602366359747L));
                                    MapSortField = new EP(var8[13], a(8289, 9186895696077196857L));
                                    c = c();
                                    EMPTY = new EP[0];
                                    WRITE_MAP_NULL_FEATURES = WriteMapNullValue.a()
                                       | WriteNullBooleanAsFalse.a()
                                       | WriteNullListAsEmpty.a()
                                       | WriteNullNumberAsZero.a()
                                       | WriteNullStringAsEmpty.a();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0099\u009fðï\u0016ëU\u0082Ä§\u0095,t\u009f\u0093Ø";
                                 var5 = "\u0099\u009fðï\u0016ëU\u0082Ä§\u0095,t\u009f\u0093Ø".length();
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

                  var11 = "K?\u0005J7w,l\u0003\u0019R>l,p8\t\u0015R\"\u0018i S9y\u001f\u0003Q&y!}>\u001fp3W(";
                  var13 = "K?\u0005J7w,l\u0003\u0019R>l,p8\t\u0015R\"\u0018i S9y\u001f\u0003Q&y!}>\u001fp3W(".length();
                  var10 = 17;
                  var17 = -1;
            }

            var10000 = 71;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
}







