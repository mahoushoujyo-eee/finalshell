package com.finalshell.ui.model;

import com.finalshell.core.Yn4;

public final class Ks2_2 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Ks2_2 AutoCloseSource;
   public static Ks2_2 AllowComment;
   public static Ks2_2 AllowUnQuotedFieldNames;
   public static Ks2_2 AllowSingleQuotes;
   public static Ks2_2 InternFieldNames;
   public static Ks2_2 AllowISO8601DateFormat;
   public static Ks2_2 AllowArbitraryCommas;
   public static Ks2_2 UseBigDecimal;
   public static Ks2_2 IgnoreNotMatch;
   public static Ks2_2 SortFeidFastMatch;
   public static Ks2_2 DisableASM;
   public static Ks2_2 DisableCircularReferenceDetect;
   public static Ks2_2 InitStringFieldAsEmpty;
   public static Ks2_2 SupportArrayToBean;
   public static Ks2_2 OrderedField;
   public static Ks2_2 DisableSpecialKeyDetect;
   public static Ks2_2 UseObjectArray;
   public static Ks2_2 SupportNonPublicField;
   public static Ks2_2 IgnoreAutoType;
   public static Ks2_2 DisableFieldSmartMatch;
   public static Ks2_2 SupportAutoType;
   public static Ks2_2 NonStringKeyAsString;
   public static Ks2_2 CustomMapDeserializer;
   public static Ks2_2 ErrorOnEnumNotMatch;
   public static Ks2_2 SafeMode;
   public static Ks2_2 TrimStringFieldValue;
   public static Ks2_2 UseNativeJavaObject;
   public final int mask = 1 << this.ordinal();
   public static long[] a;
   public static Integer[] b;

   public static Ks2_2[] values() {
      return (Ks2_2[])s.clone();
   }

   public static Ks2_2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Ks2_2(String var1, int var2) {
   }

   public final int v() {
      return this.mask;
   }

   public static boolean D(int var0, Ks2_2 var1) {
      boolean var2 = Yn4.Y();
      int var10000 = var0 & var1.mask;
      if (var2) {
         var10000 = var10000 != 0 ? 1 : 0;
      }

      return var10000 != 0;
   }

   public static int H(int var0, Ks2_2 var1, boolean var2) {
      boolean var3 = Yn4.o();
      int var10000 = (var2) ? 1 : 0;
      if (!var3) {
         if (var2 != 0) {
            var0 |= var1.mask;
            if (!var3) {
               return var0;
            }
         }

         var10000 = var0 & ~var1.mask;
      }

      return var10000;
   }

   public static int C(Ks2_2[] var0) {
      boolean var1 = Yn4.o();
      if (var0 == null) {
         return 0;
      } else {
         int var2 = 0;
         Ks2_2[] var3 = var0;
         int var4 = var0.length;
         int var5 = 0;

         int var10000;
         while (true) {
            if (var5 < var4) {
               Ks2_2 var6 = var3[var5];
               var10000 = var2 | var6.mask;
               if (var1) {
                  break;
               }

               var2 = var10000;
               var5++;
               if (!var1) {
                  continue;
               }
            }

            var10000 = var2;
            break;
         }

         return var10000;
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23017;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[27];
      int var12 = 0;
      String var11 = "eY\u0017%a\"ceE\u0010']\u0002ymJ\u0011){\u0014aG\t%d,\u007fBB\u00118r\u001ftcD\b'r\u001e\u000eiL\u000b%a\bLU_\n\u001ej\u001dh\u0012s^\u0015:|\u001fyaY\u0017+j9bbN\u0004$\u0016aG\t%d$^o\u0013Sz\")lTN#%a\u0000lT\ndB\u0016+q\u0001hax(\u0017aG\t%d8cq^\n>v\tKIN\t.]\f`EX\u0011aG\t%d>dNL\t/B\u0018bTN\u0016\foY\u0001/a\bifB\u0000&w\u0016dB\u0016+q\u0001hfB\u0000&w>`AY\u0011\u0007r\u0019nH\u000fa^\u0011%P\u0001bSN6%f\u001fnE\u000fs^\u0015:|\u001fya^\u0011%G\u0014}E\u0010iE\u0011/a\u0003KIN\t.]\f`EX\u000euX\u0000\u0005q\u0007hC_$8a\ft\u0015c^\u0016>|\u0000@A[!/`\b\u007fIJ\t#i\b\u007f\u0016iE\f>@\u0019\u007fIE\u0002\fz\baDj\u0016\u000f~\u001dyY\u000eiL\u000b%a\bCO_(+g\u000ee\u0015s^\u0015:|\u001fynD\u000b\u001af\u000faIH##v\u0001i\u0014tY\f'@\u0019\u007fIE\u0002\fz\baD}\u0004&f\b\faG\t%d.bMF\u0000$g\bsJ\u0003/^\u0002iE\u0014nD\u000b\u0019g\u001fdNL./j,~s_\u0017#}\n\u0017dB\u0016+q\u0001hs[\u0000)z\fakN\u001c\u000ev\u0019hC_\u001edB\u0016+q\u0001hcB\u0017)f\u0001lRy\u0000,v\u001fhNH\u0000\u000ev\u0019hC_\ruX\u0000\bz\nIEH\f'r\u0001";
      int var13 = "eY\u0017%a\"ceE\u0010']\u0002ymJ\u0011){\u0014aG\t%d,\u007fBB\u00118r\u001ftcD\b'r\u001e\u000eiL\u000b%a\bLU_\n\u001ej\u001dh\u0012s^\u0015:|\u001fyaY\u0017+j9bbN\u0004$\u0016aG\t%d$^o\u0013Sz\")lTN#%a\u0000lT\ndB\u0016+q\u0001hax(\u0017aG\t%d8cq^\n>v\tKIN\t.]\f`EX\u0011aG\t%d>dNL\t/B\u0018bTN\u0016\foY\u0001/a\bifB\u0000&w\u0016dB\u0016+q\u0001hfB\u0000&w>`AY\u0011\u0007r\u0019nH\u000fa^\u0011%P\u0001bSN6%f\u001fnE\u000fs^\u0015:|\u001fya^\u0011%G\u0014}E\u0010iE\u0011/a\u0003KIN\t.]\f`EX\u000euX\u0000\u0005q\u0007hC_$8a\ft\u0015c^\u0016>|\u0000@A[!/`\b\u007fIJ\t#i\b\u007f\u0016iE\f>@\u0019\u007fIE\u0002\fz\baDj\u0016\u000f~\u001dyY\u000eiL\u000b%a\bCO_(+g\u000ee\u0015s^\u0015:|\u001fynD\u000b\u001af\u000faIH##v\u0001i\u0014tY\f'@\u0019\u007fIE\u0002\fz\baD}\u0004&f\b\faG\t%d.bMF\u0000$g\bsJ\u0003/^\u0002iE\u0014nD\u000b\u0019g\u001fdNL./j,~s_\u0017#}\n\u0017dB\u0016+q\u0001hs[\u0000)z\fakN\u001c\u000ev\u0019hC_\u001edB\u0016+q\u0001hcB\u0017)f\u0001lRy\u0000,v\u001fhNH\u0000\u000ev\u0019hC_\ruX\u0000\bz\nIEH\f'r\u0001"
         .length();
      char var10 = 19;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 79;
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
                        var65 = 111;
                        break;
                     case 1:
                        var65 = 100;
                        break;
                     case 2:
                        var65 = 42;
                        break;
                     case 3:
                        var65 = 5;
                        break;
                     case 4:
                        var65 = 92;
                        break;
                     case 5:
                        var65 = 34;
                        break;
                     default:
                        var65 = 66;
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
                     long var0 = 8657948486763682443L;
                     long[] var6 = new long[43];
                     int var3 = 0;
                     String var4 = "*Ý+ô²\u0094\u0013\u008bïø\u0003ôÇ¥;_\u0017\u008eÿ\u0081YT\u0095ÃJ}äT8\u0096Gã\u0080Mh#àªÿ\u001b\u008cXQI»\u000f5yÝ¯\u0003\u009c;Â)¾p7ÜI²*ò\u00adþ¾\u009f\u001a£[±¹ûå\u0013ä§\u00103Ñ=\u008f\u000eæ2w\u0007(\u0000ù¸\u0095õ\u009d\u009eÒµ\u0082ZkÜ>ÝÃ\u0094e\u008a\u0019\t*ùeãKéµ\u001cº\u0089\u001b%ùÕm¬×6\u008eáÊÇ\u001f*\u0002ú\u0082¥\u0001Cå×\u009eÄ²ÒÆ*\u001f\u0017®J\u001b7\u007f¶Ã\u0003)\u008aýöTµT\u0084/\u0083ù-ê¶PÅ\u00136\u009býû\u0099ÈBJ\u0096íBS\u0019oS7\u0091Ï+©1\u0005¯\u0018±ÐÎ¹Ã\u0004'·Sj×YtÀfV\\\\^\u0010\u0016h&\n\rç^\u000fÙu\b\u0093Fï\u001c\u0004\u008d\u001aèÝò²ÛþLEN@·\u009c,pB\u009dà\u009bd\u008eámÙZ¦\u000b.xÇ\u000eVÐ`î\u0012Àû[rÐÏb\u0099Y:üJü.Û=Ã\u0013\u0003\u0081¢0k½[\u0001z\"\u0006bç\u008aáÓ\u0001Ýó±_ \u008fs\u008bõ¥A»Ú¹(]Áký\u0086ò\u009a";
                     int var5 = "*Ý+ô²\u0094\u0013\u008bïø\u0003ôÇ¥;_\u0017\u008eÿ\u0081YT\u0095ÃJ}äT8\u0096Gã\u0080Mh#àªÿ\u001b\u008cXQI»\u000f5yÝ¯\u0003\u009c;Â)¾p7ÜI²*ò\u00adþ¾\u009f\u001a£[±¹ûå\u0013ä§\u00103Ñ=\u008f\u000eæ2w\u0007(\u0000ù¸\u0095õ\u009d\u009eÒµ\u0082ZkÜ>ÝÃ\u0094e\u008a\u0019\t*ùeãKéµ\u001cº\u0089\u001b%ùÕm¬×6\u008eáÊÇ\u001f*\u0002ú\u0082¥\u0001Cå×\u009eÄ²ÒÆ*\u001f\u0017®J\u001b7\u007f¶Ã\u0003)\u008aýöTµT\u0084/\u0083ù-ê¶PÅ\u00136\u009býû\u0099ÈBJ\u0096íBS\u0019oS7\u0091Ï+©1\u0005¯\u0018±ÐÎ¹Ã\u0004'·Sj×YtÀfV\\\\^\u0010\u0016h&\n\rç^\u000fÙu\b\u0093Fï\u001c\u0004\u008d\u001aèÝò²ÛþLEN@·\u009c,pB\u009dà\u009bd\u008eámÙZ¦\u000b.xÇ\u000eVÐ`î\u0012Àû[rÐÏb\u0099Y:üJü.Û=Ã\u0013\u0003\u0081¢0k½[\u0001z\"\u0006bç\u008aáÓ\u0001Ýó±_ \u008fs\u008bõ¥A»Ú¹(]Áký\u0086ò\u009a"
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
                                    b = new Integer[43];
                                    AutoCloseSource = new Ks2_2(var8[10], 0);
                                    AllowComment = new Ks2_2(var8[19], 1);
                                    AllowUnQuotedFieldNames = new Ks2_2(var8[6], 2);
                                    AllowSingleQuotes = new Ks2_2(var8[7], 3);
                                    InternFieldNames = new Ks2_2(var8[12], 4);
                                    AllowISO8601DateFormat = new Ks2_2(var8[4], 5);
                                    AllowArbitraryCommas = new Ks2_2(var8[1], a(30181, 3104158060755102723L));
                                    UseBigDecimal = new Ks2_2(var8[24], a(23996, 2593361666614985822L));
                                    IgnoreNotMatch = new Ks2_2(var8[16], a(32394, 3782189818217572160L));
                                    SortFeidFastMatch = new Ks2_2(var8[25], a(12737, 5299983739143907375L));
                                    DisableASM = new Ks2_2(var8[5], a(16517, 2314342454767229304L));
                                    DisableCircularReferenceDetect = new Ks2_2(var8[23], a(2400, 3364207239454806171L));
                                    InitStringFieldAsEmpty = new Ks2_2(var8[15], a(29932, 1640517320552918299L));
                                    SupportArrayToBean = new Ks2_2(var8[3], a(7840, 941895511610279749L));
                                    OrderedField = new Ks2_2(var8[8], a(14852, 7330892562661958624L));
                                    DisableSpecialKeyDetect = new Ks2_2(var8[22], a(30771, 6546481104097583579L));
                                    UseObjectArray = new Ks2_2(var8[13], a(18870, 3799911951648788602L));
                                    SupportNonPublicField = new Ks2_2(var8[17], a(16147, 3447915570520286931L));
                                    IgnoreAutoType = new Ks2_2(var8[2], a(25561, 2960200137377430038L));
                                    DisableFieldSmartMatch = new Ks2_2(var8[9], a(10208, 6897072936024636950L));
                                    SupportAutoType = new Ks2_2(var8[11], a(17492, 4894094071806107063L));
                                    NonStringKeyAsString = new Ks2_2(var8[21], a(7985, 1774907525179131586L));
                                    CustomMapDeserializer = new Ks2_2(var8[14], a(30216, 6903372138407866340L));
                                    ErrorOnEnumNotMatch = new Ks2_2(var8[0], a(29380, 8689709427952298789L));
                                    SafeMode = new Ks2_2(var8[20], a(29362, 5834394493661915971L));
                                    TrimStringFieldValue = new Ks2_2(var8[18], a(30197, 8136045283378015241L));
                                    UseNativeJavaObject = new Ks2_2(var8[26], a(1419, 720679066532666494L));
                                    s = o();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "kË\u009b_iH|IÏ\u000eª\u0088\u0089nh³";
                                 var5 = "kË\u009b_iH|IÏ\u000eª\u0088\u0089nh³".length();
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

                  var11 = "Gp#\na<PpY0\rS\u0014X`|9\u0013Al40F-Pbz\u001b\u001fQ8vvu4\u001dS";
                  var13 = "Gp#\na<PpY0\rS\u0014X`|9\u0013Al40F-Pbz\u001b\u001fQ8vvu4\u001dS".length();
                  var10 = 17;
                  var17 = -1;
            }

            var10000 = 123;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
}







