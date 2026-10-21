import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public enum uD_3 {
   KECCAK_224, KECCAK_256, KECCAK_384, KECCAK_512, SHA3_224, SHA3_256, SHA3_384, SHA3_512, SHAKE128, SHAKE256;
   private final int X;
   public final int d;
   public final int outputLen;
   private static int R;
   private static final long[] a;
   private static final Integer[] b;

   private uD_3(int var3, int var4, int var5) {
      this.X = var3;
      this.d = var4;
      this.outputLen = var5;
   }

   public int w() {
      return com.c.c(405092281197330337L).getInt(this);
   }

   public int D() {
      return com.c.c(559703513029089181L).getInt(this);
   }

   public int X() {
      return com.c.c(335483227556308633L).getInt(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var8 = new String[10];
      int var12 = 0;
      q(0);
      String var11 = "\u0006%/W\u0014\u0010g\u007fRX\n\u0006%/W\u0014\u0010gxQ^\b\u001e(-_\u0010j\nu\b\u001e(-'\nn\t\u007f\n\u0006%/W\u0014\u0010g~XX\b\u001e(-_\u0010i\r{\b\u001e(-'\nh\u0000y\n\u0006%/W\u0014\u0010g\u007fUZ";
      int var13 = "\u0006%/W\u0014\u0010g\u007fRX\n\u0006%/W\u0014\u0010gxQ^\b\u001e(-_\u0010j\nu\b\u001e(-'\nn\t\u007f\n\u0006%/W\u0014\u0010g~XX\b\u001e(-_\u0010i\r{\b\u001e(-'\nh\u0000y\n\u0006%/W\u0014\u0010g\u007fUZ"
         .length();
      char var10 = '\n';
      int var18 = -1;

      label80:
      while (true) {
         byte var10000 = 63;
         String var10001 = var11.substring(++var18, var18 + var10);
         byte var10002 = -1;

         while (true) {
            label75: {
               char[] var47 = var10001.toCharArray();
               int var10004 = var47.length;
               int var14 = 0;
               byte var50 = var10000;
               var39 = var47;
               int var28 = var10004;
               byte var57;
               char[] var63;
               int var10006;
               if (var10004 <= 1) {
                  var63 = var47;
                  var57 = var10000;
                  var10006 = var14;
               } else {
                  var50 = var10000;
                  var28 = var10004;
                  if (var10004 <= var14) {
                     break label75;
                  }

                  var63 = var47;
                  var57 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var72 = var63[var10006];
                  byte var73;
                  switch (var14 % 7) {
                     case 0:
                        var73 = 114;
                        break;
                     case 1:
                        var73 = 95;
                        break;
                     case 2:
                        var73 = 83;
                        break;
                     case 3:
                        var73 = 43;
                        break;
                     case 4:
                        var73 = 106;
                        break;
                     case 5:
                        var73 = 100;
                        break;
                     default:
                        var73 = 7;
                  }

                  var63[var10006] = (char)(var72 ^ var57 ^ var73);
                  var14++;
                  if (var50 == 0) {
                     var10006 = var50;
                     var63 = var39;
                     var57 = var50;
                  } else {
                     if (var28 <= var14) {
                        break;
                     }

                     var63 = var39;
                     var57 = var50;
                     var10006 = var14;
                  }
               }
            }

            String var52 = new String(var39).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var52;
                  if ((var18 += var10) >= var13) {
                     long var0 = 4617410809995068129L;
                     long[] var6 = new long[28];
                     int var3 = 0;
                     String var4 = "üB,+ÓÕ\u0004\u0007ð@X>É¥\u0086\u0085'\u008a9Å©\u0082Ëç\u0083r?S;\na\u0092\u00adgéôF3_©ÕtC\u008d6\u0084<¨¹±3\u000frú¤XÑ\u008a>ô¤±çÚ\u0091öu³\u0017r&´\u0015ïi-$G¥ÜVOóÞO_\u0013\u0097[ýÚ®pZvÙO¥YÅx!#\u009b\u000f]J\f§\u0094 y\u001bM^u{\u008b\u008cD\u0083ëZE¢\u0097\u0007\u0090ú_Ä\u0082`kÜ\"\u007f\u0089Îôð7>1ÜÏ2\u000bp\u0017¸J©>(\"\"ëE:\u0096\u0014Wø\u0019\u008bÕÝ±\u0088A6Cí\u0019\u0088üG\u008c\u001e\u0084CÂ\"v2\u0002ÔP¥S\u0019z²ïwÿ\\±&«\u0000pZdJO®";
                     int var5 = "üB,+ÓÕ\u0004\u0007ð@X>É¥\u0086\u0085'\u008a9Å©\u0082Ëç\u0083r?S;\na\u0092\u00adgéôF3_©ÕtC\u008d6\u0084<¨¹±3\u000frú¤XÑ\u008a>ô¤±çÚ\u0091öu³\u0017r&´\u0015ïi-$G¥ÜVOóÞO_\u0013\u0097[ýÚ®pZvÙO¥YÅx!#\u009b\u000f]J\f§\u0094 y\u001bM^u{\u008b\u008cD\u0083ëZE¢\u0097\u0007\u0090ú_Ä\u0082`kÜ\"\u007f\u0089Îôð7>1ÜÏ2\u000bp\u0017¸J©>(\"\"ëE:\u0096\u0014Wø\u0019\u008bÕÝ±\u0088A6Cí\u0019\u0088üG\u008c\u001e\u0084CÂ\"v2\u0002ÔP¥S\u0019z²ïwÿ\\±&«\u0000pZdJO®"
                        .length();
                     byte var2 = 0;

                     label54:
                     while (true) {
                        byte var30 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var31 = var3++;
                        long var43 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var53 = -1;

                        while (true) {
                           long var62 = var43 ^ var0;
                           switch (var53) {
                              case 0:
                                 var20[var31] = var62;
                                 if (var2 >= var5) {
                                    a = var6;
                                    b = new Integer[28];
                                    Object[] var21 = com.c.f();
                                    Method var22 = com.c.d(211685198765780709L);
                                    Object[] var46 = var21;
                                    Object var34 = null;

                                    try {
                                       var23 = (uD_3[])var22.invoke(var34, var46);
                                    } catch (InvocationTargetException var15) {
                                       throw var15.getTargetException();
                                    }

                                    return;
                                 }
                                 break;
                              default:
                                 var20[var31] = var62;
                                 if (var2 < var5) {
                                    continue label54;
                                 }

                                 var4 = "ÅWÛåOÁ\u0089\u001dN¯Rm~Ï\u0098\u0087";
                                 var5 = "ÅWÛåOÁ\u0089\u001dN¯Rm~Ï\u0098\u0087".length();
                                 var2 = 0;
                           }

                           byte var32 = var2;
                           var2 += 8;
                           var7 = var4.substring(var32, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var31 = var3++;
                           var43 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var53 = 0;
                        }
                     }
                  }

                  var10 = var11.charAt(var18);
                  break;
               default:
                  var8[var12++] = var52;
                  if ((var18 += var10) < var13) {
                     var10 = var11.charAt(var18);
                     continue label80;
                  }

                  var11 = "\u001e(-'\ni\ny\b\u001e(-'\ni\r{";
                  var13 = "\u001e(-'\ni\ny\b\u001e(-'\ni\r{".length();
                  var10 = '\b';
                  var18 = -1;
            }

            var10000 = 63;
            var10001 = var11.substring(++var18, var18 + var10);
            var10002 = 0;
         }
      }
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5496;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}






