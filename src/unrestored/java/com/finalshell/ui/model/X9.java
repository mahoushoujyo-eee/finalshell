package com.finalshell.ui.model;

import com.finalshell.core.Ub2;

public final class X9 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static X9 ZPAD;
   public static X9 ZDLE;
   public static X9 ZDLEE;
   public static X9 ZBIN;
   public static X9 ZHEX;
   public static X9 ZBIN32;
   public static X9 ZCRCE;
   public static X9 ZCRCG;
   public static X9 ZCRCQ;
   public static X9 ZCRCW;
   public static X9 ZRUB0;
   public static X9 ZRUB1;
   public static X9 ZRQINIT;
   public static X9 ZRINIT;
   public static X9 ZSINIT;
   public static X9 ZACK;
   public static X9 ZFILE;
   public static X9 ZSKIP;
   public static X9 ZNAK;
   public static X9 ZABORT;
   public static X9 ZFIN;
   public static X9 ZRPOS;
   public static X9 ZDATA;
   public static X9 ZEOF;
   public static X9 ZFERR;
   public static X9 ZCRC;
   public static X9 ZCHALLENGE;
   public static X9 ZCOMPL;
   public static X9 ZCAN;
   public static X9 ZFREECNT;
   public static X9 ZCOMMAND;
   public static X9 ZSTDERR;
   public byte e;
   public static long[] a;
   public static Integer[] b;

   public static X9[] values() {
      return (X9[])com.finalshell.reflect.Ref.cloneObject(E);
   }

   public static X9 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public X9(String var1, int var2, char var3) {
      this.e = (byte)var3;
   }

   public X9(String var1, int var2, int var3) {
      this.e = (byte)var3;
   }

   public X9(String var1, int var2, byte var3) {
      this.e = var3;
   }

   public byte r() {
      return this.e;
   }

   public static X9 X(byte var0) {
      String[] var10000 = Ub2.A();
      X9[] var2 = values();
      int var3 = var2.length;
      int var4 = 0;
      String[] var1 = var10000;

      while (var4 < var3) {
         X9 var5 = var2[var4];
         if (var1 == null) {
            if (var5.r() == var0) {
               return var5;
            }

            var4++;
         }

         if (var1 != null) {
            break;
         }
      }

      return null;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15479;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var8 = new String[32];
      int var12 = 0;
      String var11 = "Ya;#\u0007Yc+.\u0002FB\u0005Yr($\u000b\u0004Yr($\u0004Yr;)\u0005Yb1.\u001c\u0005Yu6\"\t\u0004Yt5!\u0004Yw3)\u0006Yr5*\u001cC\u0006Yb3)\u0005[\u0005Yr($\u001b\u0005Yu;3\r\u0005Yw3+\t\u0005Yr($\t\u0004Yy??\u0005Yc/%}\bYr5*\u0001NXG\u0007Yb.#\t]D\u0004Yp9,\u0006Yc3)\u0005[\bYw(\"\tLXW\u0004Yu6\"\u0006Ys3)\u007f=\u0005Yr($\u001d\nYr2&\u0000CSMv?\u0005Yc/%|\u0005Yc*(\u001f\u0006Yp8(\u001e[\u0004Ys3)";
      int var13 = "Ya;#\u0007Yc+.\u0002FB\u0005Yr($\u000b\u0004Yr($\u0004Yr;)\u0005Yb1.\u001c\u0005Yu6\"\t\u0004Yt5!\u0004Yw3)\u0006Yr5*\u001cC\u0006Yb3)\u0005[\u0005Yr($\u001b\u0005Yu;3\r\u0005Yw3+\t\u0005Yr($\t\u0004Yy??\u0005Yc/%}\bYr5*\u0001NXG\u0007Yb.#\t]D\u0004Yp9,\u0006Yc3)\u0005[\bYw(\"\tLXW\u0004Yu6\"\u0006Ys3)\u007f=\u0005Yr($\u001d\nYr2&\u0000CSMv?\u0005Yc/%|\u0005Yc*(\u001f\u0006Yp8(\u001e[\u0004Ys3)"
         .length();
      char var10 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 65;
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
                        var65 = 66;
                        break;
                     case 1:
                        var65 = 112;
                        break;
                     case 2:
                        var65 = 59;
                        break;
                     case 3:
                        var65 = 38;
                        break;
                     case 4:
                        var65 = 13;
                        break;
                     case 5:
                        var65 = 78;
                        break;
                     default:
                        var65 = 87;
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
                     long var0 = 4695532889504775890L;
                     long[] var6 = new long[64];
                     int var3 = 0;
                     String var4 = "\u009dÚÁ\u009e\u000f\u00149ñE\u001d+\u0005»#-\u0017¢ð.>¥Â.\fÏÈ)®\"\u0004¢\u0080|\u0010i\u001fÉjÏÀüóµæ\u0083/.\u0006t?,ýË\u0001ü\u000fÇ2:\u009aK}Æ\u0091\u0082\u0086Nâa°\u00ad\u0018Ùú\u0082PmÌ\u0092\u008d¶4¼Är~/\u000eÖ±HY?D\u0086ú~$ðNQ ;GÂ\u0011ªðë\u0004\u0000ÿ´/ÖÆ\u00adsU\u009cMÖN\u0003ÿé°\u00adg\u009bÖ¦Î\u0088uý[\u001cL\u0093ï÷ÞêÙï\u001f5ªEî_p\u0010tñËî«¬å;JI»óg\u0003ª\u0099ÒVdM8×TûYyÌÆ\u009aÉº\u0089ª\f\u001e¾N\u0006\u0089ßdNk\u009c\u009c\u007f\u0015¤.y.Ä\u0012Ó_}\u0014J^~)ù\u0003\t»·`êÂ\"\u0005³N\u0095\u0015\u0013\u0097qN»+`%MªV\u0095G®\u0096á\u0011.EQÚog\u009c]\u0080|D\u0081÷¾ùý#\u008ft}ßÆSÒ\u0016\u0084\u0080Ñ\u0011§kg24]Ô¿°k\u0085CM\u0084\u009d/'ÜU3ÆãWî/ý@I\"A»øbsx2,àu×\u0098B\u0004\u0089c;\u0005+l _.]åý\u008d\u0011T5\"N\u0083cå1Ïa\u0095þ»pÝIQ\\&HÔå\u001e;%ø\u0018\u00ad\u0097*E\u0000xG¸Y9Ò\u008bÎ\"p;;\u009f\u007fN\u0005ÔQf>\u0088ù\b\u0007\u001fä\u0014º)#i(\tê¡\u0084ÈM(º\u0099µ55\u0092\u0097\u0005ÉsZ\u0089ps\u0015ÛCª\u0086Ï\u0087± ¤ D\u0084\t ×ÌxeôðÚ^ç±\"\u0016\u0003*eÞÇ\u000eç\u001ax¹\u001csS¹\u0006þ}½ôZÙ à\u0006\u0016\u001eüJ nÌ\u0099\u0085k\u000fHÕ<\u008e`»\u0015[Þü\u0003º_èE\u0012\u0015";
                     int var5 = "\u009dÚÁ\u009e\u000f\u00149ñE\u001d+\u0005»#-\u0017¢ð.>¥Â.\fÏÈ)®\"\u0004¢\u0080|\u0010i\u001fÉjÏÀüóµæ\u0083/.\u0006t?,ýË\u0001ü\u000fÇ2:\u009aK}Æ\u0091\u0082\u0086Nâa°\u00ad\u0018Ùú\u0082PmÌ\u0092\u008d¶4¼Är~/\u000eÖ±HY?D\u0086ú~$ðNQ ;GÂ\u0011ªðë\u0004\u0000ÿ´/ÖÆ\u00adsU\u009cMÖN\u0003ÿé°\u00adg\u009bÖ¦Î\u0088uý[\u001cL\u0093ï÷ÞêÙï\u001f5ªEî_p\u0010tñËî«¬å;JI»óg\u0003ª\u0099ÒVdM8×TûYyÌÆ\u009aÉº\u0089ª\f\u001e¾N\u0006\u0089ßdNk\u009c\u009c\u007f\u0015¤.y.Ä\u0012Ó_}\u0014J^~)ù\u0003\t»·`êÂ\"\u0005³N\u0095\u0015\u0013\u0097qN»+`%MªV\u0095G®\u0096á\u0011.EQÚog\u009c]\u0080|D\u0081÷¾ùý#\u008ft}ßÆSÒ\u0016\u0084\u0080Ñ\u0011§kg24]Ô¿°k\u0085CM\u0084\u009d/'ÜU3ÆãWî/ý@I\"A»øbsx2,àu×\u0098B\u0004\u0089c;\u0005+l _.]åý\u008d\u0011T5\"N\u0083cå1Ïa\u0095þ»pÝIQ\\&HÔå\u001e;%ø\u0018\u00ad\u0097*E\u0000xG¸Y9Ò\u008bÎ\"p;;\u009f\u007fN\u0005ÔQf>\u0088ù\b\u0007\u001fä\u0014º)#i(\tê¡\u0084ÈM(º\u0099µ55\u0092\u0097\u0005ÉsZ\u0089ps\u0015ÛCª\u0086Ï\u0087± ¤ D\u0084\t ×ÌxeôðÚ^ç±\"\u0016\u0003*eÞÇ\u000eç\u001ax¹\u001csS¹\u0006þ}½ôZÙ à\u0006\u0016\u001eüJ nÌ\u0099\u0085k\u000fHÕ<\u008e`»\u0015[Þü\u0003º_èE\u0012\u0015"
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
                                    b = new Integer[64];
                                    ZPAD = new X9(var8[0], 0, (char)a(19226, 7036469705994696536L));
                                    ZDLE = new X9(var8[22], 1, a(24794, 3855254173363559556L));
                                    ZDLEE = new X9(var8[6], 2, ZDLE.r() ^ a(9714, 5145826346146666897L));
                                    ZBIN = new X9(var8[29], 3, (char)a(221, 1216018309044157617L));
                                    ZHEX = new X9(var8[15], 4, (char)a(28663, 4730471377426502536L));
                                    ZBIN32 = new X9(var8[23], 5, (char)a(3319, 715283548141400215L));
                                    ZCRCE = new X9(var8[14], a(21966, 7357054359362595237L), (char)a(29295, 4479388055076195863L));
                                    ZCRCG = new X9(var8[2], a(16043, 6749396761428198106L), (char)a(27833, 7098433914884542694L));
                                    ZCRCQ = new X9(var8[24], a(10052, 2921227722794605316L), (char)a(31379, 5548437663083939547L));
                                    ZCRCW = new X9(var8[11], a(6340, 1251119330513953925L), (char)a(16062, 1248730555018019571L));
                                    ZRUB0 = new X9(var8[26], a(24832, 5320348896615292247L), (char)a(19898, 1986629007213556214L));
                                    ZRUB1 = new X9(var8[16], a(14029, 8768416882360683139L), (char)a(22551, 5022273060277773430L));
                                    ZRQINIT = new X9(var8[1], a(19434, 8862992886745200558L), 0);
                                    ZRINIT = new X9(var8[20], a(31577, 4747743594336241454L), 1);
                                    ZSINIT = new X9(var8[10], a(25800, 8240733356841785492L), 2);
                                    ZACK = new X9(var8[19], a(27817, 3356448018155393243L), 3);
                                    ZFILE = new X9(var8[13], a(26890, 7535110145768346990L), 4);
                                    ZSKIP = new X9(var8[5], a(31231, 1419711686003672452L), 5);
                                    ZNAK = new X9(var8[30], a(14170, 8147865579245538109L), a(21966, 7357054359362595237L));
                                    ZABORT = new X9(var8[28], a(472, 4757328039956528524L), a(16043, 6749396761428198106L));
                                    ZFIN = new X9(var8[8], a(17472, 497245194918099004L), a(10052, 2921227722794605316L));
                                    ZRPOS = new X9(var8[27], a(17107, 8537509248010419899L), a(6340, 1251119330513953925L));
                                    ZDATA = new X9(var8[12], a(27837, 6021323298885488840L), a(24832, 5320348896615292247L));
                                    ZEOF = new X9(var8[7], a(7241, 6172132768046096431L), a(14029, 8768416882360683139L));
                                    ZFERR = new X9(var8[31], a(24794, 3855254173363559556L), a(19434, 8862992886745200558L));
                                    ZCRC = new X9(var8[3], a(6494, 8819584604824216853L), a(31577, 4747743594336241454L));
                                    ZCHALLENGE = new X9(var8[25], a(3451, 8961000259697422600L), a(25800, 8240733356841785492L));
                                    ZCOMPL = new X9(var8[9], a(31147, 7323012328069809650L), a(27817, 3356448018155393243L));
                                    ZCAN = new X9(var8[4], a(27482, 815020882474194743L), a(26890, 7535110145768346990L));
                                    ZFREECNT = new X9(var8[21], a(29018, 529914040647765257L), a(31231, 1419711686003672452L));
                                    ZCOMMAND = new X9(var8[17], a(28845, 3430576925272132856L), a(14170, 8147865579245538109L));
                                    ZSTDERR = new X9(var8[18], a(11511, 2778048654636585106L), a(472, 4757328039956528524L));
                                    E = z();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "d\u001donÖö+ÅÒøÀÇ¨\u009c8c";
                                 var5 = "d\u001donÖö+ÅÒøÀÇ¨\u009c8c".length();
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

                  var11 = "\f*ny\u0005\f\"j`K";
                  var13 = "\f*ny\u0005\f\"j`K".length();
                  var10 = 4;
                  var17 = -1;
            }

            var10000 = 20;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
   private static Object E;
}







