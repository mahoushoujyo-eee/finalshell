package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public final class UD3 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static UD3 KECCAK_224;
   public static UD3 KECCAK_256;
   public static UD3 KECCAK_384;
   public static UD3 KECCAK_512;
   public static UD3 SHA3_224;
   public static UD3 SHA3_256;
   public static UD3 SHA3_384;
   public static UD3 SHA3_512;
   public static UD3 SHAKE128;
   public static UD3 SHAKE256;
   public final int X;
   public final int d;
   public final int outputLen;
   public static int R;
   public static long[] a;
   public static Integer[] b;

   public static UD3[] values() {
      return (UD3[])((UD3[])Registry.lookupField(364117207959127240L).get(null)).clone();
   }

   public static UD3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public UD3(String var1, int var2, int var3, int var4, int var5) {
      this.X = var3;
      this.d = var4;
      this.outputLen = var5;
   }

   public int w() {
      return Registry.lookupField(405092281197330337L).getInt(this);
   }

   public int D() {
      return Registry.lookupField(559703513029089181L).getInt(this);
   }

   public int X() {
      return Registry.lookupField(335483227556308633L).getInt(this);
   }

   static {
      __vfClinit__();
   }

   public static void q(int var0) {
      R = var0;
   }

   public static int U() {
      return R;
   }

   public static int I() {
      int var0 = U();
      return var0 == 0 ? 60 : 0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5496;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      UD3 I;
      char[] var38;
      String[] var8 = new String[10];
      int var12 = 0;
      q(0);
      String var11 = "\u0006%/W\u0014\u0010g\u007fRX\n\u0006%/W\u0014\u0010gxQ^\b\u001e(-_\u0010j\nu\b\u001e(-'\nn\t\u007f\n\u0006%/W\u0014\u0010g~XX\b\u001e(-_\u0010i\r{\b\u001e(-'\nh\u0000y\n\u0006%/W\u0014\u0010g\u007fUZ";
      int var13 = "\u0006%/W\u0014\u0010g\u007fRX\n\u0006%/W\u0014\u0010gxQ^\b\u001e(-_\u0010j\nu\b\u001e(-'\nn\t\u007f\n\u0006%/W\u0014\u0010g~XX\b\u001e(-_\u0010i\r{\b\u001e(-'\nh\u0000y\n\u0006%/W\u0014\u0010g\u007fUZ"
         .length();
      char var10 = '\n';
      int var20 = -1;

      label80:
      while (true) {
         byte var10000 = 63;
         String var10001 = var11.substring(++var20, var20 + var10);
         byte var10002 = -1;

         while (true) {
            label75: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var14 = 0;
               byte var47 = var10000;
               var38 = var44;
               int var27 = var10004;
               byte var54;
               char[] var60;
               int var10006;
               if (var10004 <= 1) {
                  var60 = var44;
                  var54 = var10000;
                  var10006 = var14;
               } else {
                  var47 = var10000;
                  var27 = var10004;
                  if (var10004 <= var14) {
                     break label75;
                  }

                  var60 = var44;
                  var54 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var69 = var60[var10006];
                  byte var70;
                  switch (var14 % 7) {
                     case 0:
                        var70 = 114;
                        break;
                     case 1:
                        var70 = 95;
                        break;
                     case 2:
                        var70 = 83;
                        break;
                     case 3:
                        var70 = 43;
                        break;
                     case 4:
                        var70 = 106;
                        break;
                     case 5:
                        var70 = 100;
                        break;
                     default:
                        var70 = 7;
                  }

                  var60[var10006] = (char)(var69 ^ var54 ^ var70);
                  var14++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var60 = var38;
                     var54 = var47;
                  } else {
                     if (var27 <= var14) {
                        break;
                     }

                     var60 = var38;
                     var54 = var47;
                     var10006 = var14;
                  }
               }
            }

            String var49 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var49;
                  if ((var20 += var10) >= var13) {
                     long var0 = 4617410809995068129L;
                     long[] var6 = new long[28];
                     int var3 = 0;
                     String var4 = "üB,+ÓÕ\u0004\u0007ð@X>É¥\u0086\u0085'\u008a9Å©\u0082Ëç\u0083r?S;\na\u0092\u00adgéôF3_©ÕtC\u008d6\u0084<¨¹±3\u000frú¤XÑ\u008a>ô¤±çÚ\u0091öu³\u0017r&´\u0015ïi-$G¥ÜVOóÞO_\u0013\u0097[ýÚ®pZvÙO¥YÅx!#\u009b\u000f]J\f§\u0094 y\u001bM^u{\u008b\u008cD\u0083ëZE¢\u0097\u0007\u0090ú_Ä\u0082`kÜ\"\u007f\u0089Îôð7>1ÜÏ2\u000bp\u0017¸J©>(\"\"ëE:\u0096\u0014Wø\u0019\u008bÕÝ±\u0088A6Cí\u0019\u0088üG\u008c\u001e\u0084CÂ\"v2\u0002ÔP¥S\u0019z²ïwÿ\\±&«\u0000pZdJO®";
                     int var5 = "üB,+ÓÕ\u0004\u0007ð@X>É¥\u0086\u0085'\u008a9Å©\u0082Ëç\u0083r?S;\na\u0092\u00adgéôF3_©ÕtC\u008d6\u0084<¨¹±3\u000frú¤XÑ\u008a>ô¤±çÚ\u0091öu³\u0017r&´\u0015ïi-$G¥ÜVOóÞO_\u0013\u0097[ýÚ®pZvÙO¥YÅx!#\u009b\u000f]J\f§\u0094 y\u001bM^u{\u008b\u008cD\u0083ëZE¢\u0097\u0007\u0090ú_Ä\u0082`kÜ\"\u007f\u0089Îôð7>1ÜÏ2\u000bp\u0017¸J©>(\"\"ëE:\u0096\u0014Wø\u0019\u008bÕÝ±\u0088A6Cí\u0019\u0088üG\u008c\u001e\u0084CÂ\"v2\u0002ÔP¥S\u0019z²ïwÿ\\±&«\u0000pZdJO®"
                        .length();
                     byte var2 = 0;

                     label54:
                     while (true) {
                        byte var29 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                        long[] var22 = var6;
                        int var30 = var3++;
                        long var42 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var50 = -1;

                        while (true) {
                           long var59 = var42 ^ var0;
                           switch (var50) {
                              case 0:
                                 var22[var30] = var59;
                                 if (var2 >= var5) {
                                    a = var6;
                                    b = new Integer[28];
                                    KECCAK_224 = new UD3(var8[0], 0, a(16407, 9138444954348770680L), 1, a(13550, 5646768475112153498L));
                                    KECCAK_256 = new UD3(var8[7], 1, a(2885, 1605270035473997350L), 1, a(1284, 5320819442908729462L));
                                    KECCAK_384 = new UD3(var8[4], 2, a(25099, 7664139722282006392L), 1, a(4638, 5844513187132278630L));
                                    KECCAK_512 = new UD3(var8[1], 3, a(6547, 6200376634085051621L), 1, a(16464, 6906228650828748092L));
                                    SHA3_224 = new UD3(var8[8], 4, a(19636, 352749270215776712L), a(4379, 7088530050343732322L), a(12741, 1930095995475731637L));
                                    SHA3_256 = new UD3(var8[9], 5, a(13836, 6674199333804024701L), a(4379, 7088530050343732322L), a(10151, 593571618955113159L));
                                    SHA3_384 = new UD3(
                                       var8[6],
                                       a(4379, 7088530050343732322L),
                                       a(23406, 4124492542920379919L),
                                       a(4379, 7088530050343732322L),
                                       a(12871, 1393016711601760057L)
                                    );
                                    SHA3_512 = new UD3(
                                       var8[3],
                                       a(11059, 4131419742358093390L),
                                       a(4678, 4675652569552979761L),
                                       a(4379, 7088530050343732322L),
                                       a(11713, 3453989477267627L)
                                    );
                                    SHAKE128 = new UD3(
                                       var8[2],
                                       a(14309, 3082601748584112784L),
                                       a(29512, 752510962959148595L),
                                       a(21938, 1073569009071145180L),
                                       a(10151, 593571618955113159L)
                                    );
                                    SHAKE256 = new UD3(
                                       var8[5],
                                       a(3597, 6171893776909540192L),
                                       a(13836, 6674199333804024701L),
                                       a(19380, 2506986019407388380L),
                                       a(11713, 3453989477267627L)
                                    );
                                    Registry.emptyArgs();
                                    long var15 = 211685198765780709L;
                                    Object var32 = Ref.h2(211685198765780709L, var15);

                                    try {
                                       var32 = (UD3[])var32;
                                    } catch (InvocationTargetException var17) {
                                       throw var17.getTargetException();
                                    }

                                    I = (UD3[])var32;
                                    return;
                                 }
                                 break;
                              default:
                                 var22[var30] = var59;
                                 if (var2 < var5) {
                                    continue label54;
                                 }

                                 var4 = "ÅWÛåOÁ\u0089\u001dN¯Rm~Ï\u0098\u0087";
                                 var5 = "ÅWÛåOÁ\u0089\u001dN¯Rm~Ï\u0098\u0087".length();
                                 var2 = 0;
                           }

                           byte var31 = var2;
                           var2 += 8;
                           var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                           var22 = var6;
                           var30 = var3++;
                           var42 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var50 = 0;
                        }
                     }
                  }

                  var10 = var11.charAt(var20);
                  break;
               default:
                  var8[var12++] = var49;
                  if ((var20 += var10) < var13) {
                     var10 = var11.charAt(var20);
                     continue label80;
                  }

                  var11 = "\u001e(-'\ni\ny\b\u001e(-'\ni\r{";
                  var13 = "\u001e(-'\ni\ny\b\u001e(-'\ni\r{".length();
                  var10 = '\b';
                  var20 = -1;
            }

            var10000 = 63;
            var10001 = var11.substring(++var20, var20 + var10);
            var10002 = 0;
         }
      }
   }
}







