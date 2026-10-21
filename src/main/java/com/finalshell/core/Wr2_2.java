package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public final class Wr2_2 {
   public static byte[] L;
   public static char[] K;
   public static String l;
   public static long[] a;
   public static Integer[] b;

   protected static boolean I(char var0) {
      String var1 = L();
      char var10000 = var0;
      if (var1 == null) {
         if (var0 != a(23683, 2770908000238233438L)) {
            if (var1 != null) {
               return var0 != 0;
            }

            if (var0 != a(14599, 3070748994447573715L)) {
               if (var1 != null) {
                  return var0 != 0;
               }

               if (var0 != a(2177, 593880247559205712L)) {
                  if (var1 != null) {
                     return var0 != 0;
                  }

                  if (var0 != a(20668, 2502211015533095776L)) {
                     return 0 != 0;
                  }
               }
            }
         }

         var10000 = 1;
      }

      return var10000 != 0;
   }

   protected static boolean L(char var0) {
      String var1 = L();
      int var10000 = var0;
      if (var1 == null) {
         var10000 = var0 == a(9439, 1274449074686664454L) ? 1 : 0;
      }

      return var10000 != 0;
   }

   protected static boolean J(char var0) {
      String var1 = L();
      int var10000 = L[var0];
      if (var1 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      if (var1 != null) {
         Ky4.K(new String[3]);
      }

      return var10000 != 0;
   }

   protected static boolean D(char var0) {
      boolean var10000;
      String var1 = L();
      var10000 = I(var0);
      label27:
      if (var1 == null) {
         if (!var10000) {
            var10000 = L(var0);
            if (var1 != null) {
               break label27;
            }

            if (!var10000) {
               var10000 = J(var0);
               if (var1 != null) {
                  break label27;
               }

               if (!var10000) {
                  var10000 = false;
                  break label27;
               }
            }
         }

         var10000 = true;
      }

      if (Ky4.F$arrString() != null) {
         p("jhm2q");
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String u(byte[] var0) {
      String var1 = L();
      byte[] var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      int var2 = var10000.length * a(32647, 5336305615897445468L);
      int var54 = var2;
      if (var1 == null) {
         if (var2 == 0) {
            return "";
         }

         var54 = var2 % a(19814, 4049304517395379847L);
      }

      int var3 = var54;
      int var4 = var2 / a(32568, 3501245638912885979L);
      int var55 = var3;
      if (var1 == null) {
         var55 = var3 != 0 ? var4 + 1 : var4;
      }

      int var5 = var55;
      int var6 = (var5 - 1) / a(52, 3087299212078496730L) + 1;
      char[] var7 = new char[var5 * 4 + var6];
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;

      label191:
      while (true) {
         int var56 = var16;

         label188:
         while (true) {
            int var57;
            if (var56 < var6 - 1) {
               var57 = 0;
               if (var1 == null) {
                  int var17 = 0;

                  while (var17 < a(10738, 3302609930929574423L)) {
                     byte var10 = var0[var14++];
                     byte var11 = var0[var14++];
                     byte var12 = var0[var14++];
                     byte var9 = (byte)(var11 & a(16450, 1445029510566542218L));
                     byte var8 = (byte)(var10 & 3);
                     var56 = var10 & a(15401, 2425604751405254612L);
                     if (var1 != null) {
                        continue label188;
                     }

                     label158: {
                        if (var1 == null) {
                           if (var56 == 0) {
                              var58 = (byte)(var10 >> 2);
                              break label158;
                           }

                           var56 = var10 >> 2 ^ a(29772, 3770674808279158687L);
                        }

                        var58 = (byte)var56;
                     }

                     byte var18;
                     label152: {
                        var18 = var58;
                        int var59 = var11 & a(9644, 7566514979153059411L);
                        if (var1 == null) {
                           if (var59 == 0) {
                              var60 = (byte)(var11 >> 4);
                              break label152;
                           }

                           var59 = var11 >> 4 ^ a(8589, 478323899614337619L);
                        }

                        var60 = (byte)var59;
                     }

                     byte var19;
                     label146: {
                        var19 = var60;
                        int var61 = var12 & a(9644, 7566514979153059411L);
                        if (var1 == null) {
                           if (var61 == 0) {
                              var62 = (byte)(var12 >> a(9552, 2159695327840116407L));
                              break label146;
                           }

                           var61 = var12 >> a(14804, 4862657299513246237L) ^ a(10588, 7884606817363464884L);
                        }

                        var62 = (byte)var61;
                     }

                     byte var20 = var62;
                     var7[var13++] = K[var18];
                     var7[var13++] = K[var19 | var8 << 4];
                     var7[var13++] = K[var9 << 2 | var20];
                     var7[var13++] = K[var12 & a(22504, 866947295508982798L)];
                     var15++;
                     var17++;
                     if (var1 != null) {
                        break;
                     }
                  }

                  var7[var13++] = (char)a(12169, 3574664972428809317L);
                  var16++;
                  if (var1 == null) {
                     continue label191;
                  }

                  var57 = var15;
               }
            } else {
               var57 = var15;
            }

            while (true) {
               if (var57 >= var4) {
                  break label188;
               }

               byte var26 = var0[var14++];
               byte var29 = var0[var14++];
               byte var31 = var0[var14++];
               byte var24 = (byte)(var29 & a(32428, 3079647143813858655L));
               byte var21 = (byte)(var26 & 3);
               var63 = var26 & a(9644, 7566514979153059411L);
               if (var1 != null) {
                  break label191;
               }

               byte var48 = var1 == null ? (var63 == 0 ? (byte)(var26 >> 2) : (byte)(var26 >> 2 ^ a(15573, 6509549488175384359L))) : (byte)var63;
               int var64 = var29 & a(9644, 7566514979153059411L);
               byte var51 = var1 == null ? (var64 == 0 ? (byte)(var29 >> 4) : (byte)(var29 >> 4 ^ a(31617, 4547017254892028010L))) : (byte)var64;
               int var65 = var31 & a(9644, 7566514979153059411L);
               byte var53 = var1 == null
                  ? (
                     var65 == 0
                        ? (byte)(var31 >> a(14804, 4862657299513246237L))
                        : (byte)(var31 >> a(14804, 4862657299513246237L) ^ a(9584, 4958292747649031815L))
                  )
                  : (byte)var65;
               var7[var13++] = K[var48];
               var7[var13++] = K[var51 | var21 << 4];
               var7[var13++] = K[var24 << 2 | var53];
               var7[var13++] = K[var31 & a(22504, 866947295508982798L)];
               var15++;
               if (var1 != null) {
      int var63;
      int var63;
                  break label188;
               }

               var57 = var15;
            }
         }

         var63 = var3;
         break;
      }

      label199: {
         label200: {
            int var86 = a(13107, 8974237570899577026L);
            if (var1 == null) {
               if (var63 == var86) {
                  byte var22;
                  label121: {
                     byte var27 = var0[var14];
                     var22 = (byte)(var27 & 3);
                     int var66 = var27 & a(9644, 7566514979153059411L);
                     if (var1 == null) {
                        if (var66 == 0) {
                           var67 = (byte)(var27 >> 2);
                           break label121;
                        }

                        var66 = var27 >> 2 ^ a(15573, 6509549488175384359L);
                     }

                     var67 = (byte)var66;
                  }

                  byte var49 = var67;
                  var7[var13++] = K[var49];
                  var7[var13++] = K[var22 << 4];
                  var7[var13++] = (char)a(9439, 1274449074686664454L);
                  var7[var13++] = (char)a(9439, 1274449074686664454L);
                  if (var1 == null) {
                     break label199;
                  }
               }

               var63 = var3;
               if (var1 != null) {
                  break label200;
               }

               var86 = a(18718, 8654864925243470542L);
            }

            if (var63 != var86) {
               break label199;
            }

            var63 = var0[var14];
         }

         byte var23;
         byte var25;
         byte var30;
         label106: {
            int var28 = var63;
            var30 = var0[var14 + 1];
            var25 = (byte)(var30 & a(32428, 3079647143813858655L));
            var23 = (byte)(var28 & 3);
            int var68 = var28 & a(9644, 7566514979153059411L);
            if (var1 == null) {
               if (var68 == 0) {
                  var69 = (byte)(var28 >> 2);
                  break label106;
               }

               var68 = var28 >> 2 ^ a(15573, 6509549488175384359L);
            }

            var69 = (byte)var68;
         }

         label100: {
            var50 = var69;
            int var70 = var30 & a(9644, 7566514979153059411L);
            if (var1 == null) {
               if (var70 == 0) {
                  var71 = (byte)(var30 >> 4);
                  break label100;
               }

               var70 = var30 >> 4 ^ a(31617, 4547017254892028010L);
            }

            var71 = (byte)var70;
         }

         byte var52 = var71;
         var7[var13++] = K[var50];
         var7[var13++] = K[var52 | var23 << 4];
         var7[var13++] = K[var25 << 2];
         var7[var13++] = (char)a(9439, 1274449074686664454L);
      }

      var7[var13] = (char)a(12169, 3574664972428809317L);
      return new String(var7);
   }

   public static byte[] k(String var0) {
      String var1 = L();
      String var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      char[] var2 = var10000.toCharArray();
      int var3 = Y(var2);
      int var35 = var3 % 4;
      if (var1 == null) {
         if (var35 != 0) {
            return null;
         }

         var35 = var3 / 4;
      }

      int var4 = var35;
      int var36 = var4;
      if (var1 == null) {
         if (var4 == 0) {
            return new byte[0];
         }

         var36 = 0;
      }

      int var14 = var36;
      int var15 = 0;
      int var16 = 0;
      byte[] var5 = new byte[var4 * 3];

      char var10;
      while (true) {
         if (var14 < var4 - 1) {
            var37 = J(var10 = var2[var16++]);
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               if (var37 == 0) {
                  return null;
               }

               var37 = var2[var16++];
            }

            char var11 = var37;
            char var38 = J(var37);
            if (var1 == null) {
               if (var38 == 0) {
                  return null;
               }

               var38 = var2[var16++];
            }

            char var12 = (((var38) ? 1 : 0) ? 1 : 0) ? 1 : 0;
            char var39 = J(var38);
            if (var1 == null) {
               if (var39 == 0) {
                  return null;
               }

               var39 = var2[var16++];
            }

            char var13 = var39;
            byte var40 = J(var39);
            if (var1 == null) {
               if (var40 == 0) {
                  return null;
               }

               var40 = L[var10];
            }

            byte var6 = var40;
            byte var7 = L[var11];
            byte var8 = L[var12];
            byte var9 = L[var13];
            var5[var15++] = (byte)(var6 << 2 | var7 >> 4);
            var5[var15++] = (byte)((var7 & a(32428, 3079647143813858655L)) << 4 | var8 >> 2 & a(32428, 3079647143813858655L));
            var5[var15++] = (byte)(var8 << a(14804, 4862657299513246237L) | var9);
            var14++;
            if (var1 == null) {
               continue;
            }
         }

         var37 = J(var10 = var2[var16++]);
         break;
      }

      if (var1 == null) {
         if (var37 == 0) {
            return null;
         }

         var37 = var2[var16++];
      }

      char var23 = var37;
      byte var41 = J(var37);
      if (var1 == null) {
         if (var41 == 0) {
            return null;
         }

         var41 = L[var10];
      }

      byte var18;
      byte var19;
      char var25;
      label173: {
         var18 = var41;
         var19 = L[var23];
         char var24 = var2[var16++];
         var25 = (((var2[var16++]) ? 1 : 0) ? 1 : 0) ? 1 : 0;
         byte var42 = J(var24);
         if (var1 == null) {
            if (var42 != 0) {
               var43 = J(var25);
               if (var1 != null) {
                  break label173;
               }

               if (var43 != 0) {
                  var43 = L[var24];
                  break label173;
               }
            }

            var42 = L(var24);
         }

         label107:
         if (var1 == null) {
            if (var42 != 0) {
               var42 = L(var25);
               if (var1 != null) {
                  break label107;
               }

               if (var42 != 0) {
                  int var44 = var19 & a(32428, 3079647143813858655L);
                  if (var1 == null) {
                     if (var44 != 0) {
                        return null;
                     }

                     var44 = var14 * 3 + 1;
                  }

                  byte[] var17 = new byte[var44];
                  System.arraycopy(var5, 0, var17, 0, var14 * 3);
                  var17[var15] = (byte)(var18 << 2 | var19 >> 4);
                  return var17;
               }
            }

            var42 = L(var24);
         }

         if (var1 == null) {
            if (var42 != 0) {
               return null;
            }

            var42 = L(var25);
         }

         if (var1 == null) {
            if (var42 == 0) {
               return null;
            }

            var42 = L[var24];
         }

         byte var20 = var42;
         int var45 = var20 & 3;
         if (var1 == null) {
            if (var45 != 0) {
               return null;
            }

            var45 = var14 * 3 + 2;
         }

         byte[] var34 = new byte[var45];
         System.arraycopy(var5, 0, var34, 0, var14 * 3);
         var34[var15++] = (byte)(var18 << 2 | var19 >> 4);
         var34[var15] = (byte)((var19 & a(32428, 3079647143813858655L)) << 4 | var20 >> 2 & a(32428, 3079647143813858655L));
         return var34;
      }

      byte var21 = var43;
      byte var22 = L[var25];
      var5[var15++] = (byte)(var18 << 2 | var19 >> 4);
      var5[var15++] = (byte)((var19 & a(32428, 3079647143813858655L)) << 4 | var21 >> 2 & a(32428, 3079647143813858655L));
      var5[var15++] = (byte)(var21 << a(14804, 4862657299513246237L) | var22);
      return var5;
   }

   protected static int Y(char[] var0) {
      String var1 = L();
      if (var0 == null) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = var0.length;
         int var4 = 0;

         int var5;
         while (true) {
            if (var4 < var3) {
               label26: {
                  char[] var10000 = var0;
                  int var10001 = var4;
                  if (var1 == null) {
                     var5 = I(var0[var4]);
                     if (var1 != null) {
                        break;
                     }

                     if (var5 != 0) {
                        break label26;
                     }

                     var10000 = var0;
                     var10001 = var2++;
                  }

                  var10000[var10001] = var0[var4];
               }

               var4++;
               if (var1 == null) {
                  continue;
               }
            }

            var5 = var2;
            break;
         }

         return var5;
      }
   }

   static {
      __vfClinit__();
   }

   public static void p(String var0) {
      l = var0;
   }

   public static String L() {
      return l;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15353;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8675450382820711570L;
      long[] var6 = new long[52];
      int var3 = 0;
      String var4 = "*\u009cÞ±ñ3\u001cÖ\u001a0\u00856jÑÎ\u0007,yüÓ´\u0001\u008a\u0090\u0001ÚÃj\u0002¹®i\u001c\u00011ÞäsdÆ¶£~&`\u0016m\u009eÄ\u009c\u0007ß±fýAl~\u000f`:R\u009e<+î\u009a!qá\u0014Xòk\u0007áì¹»Ç\u0089\u0012ê\u001e&\u001cYÂQwR&¤\u000b\u001bu´Û,\u0006°nÒÃ²\t\u0087U\u008cTê'mÔ\u0082øB\u008a\u0002é\u0001Éu¾´S\bý\u008a\r\u001bÌ4Ì)÷]qa\u001f \u001c\u008eÚK\u0016±B·ç\\\bÉU ,OåÜû\u001a7(Ö Q'\u0099½\u000b\u007f\u001aþ(\u0088ý\u008bQ>¢\u008f\u009cè7i\u008e³Õ-Æ'[\u001e\u009fbê¼2j\rØÒõ#°ÌSÙ´\b\u0012æ,GØQÒü$ª<pRÈ\u009b\u00016\u00adj2\u000e\u0096T\"jÕdk\u000bö^sÅbØu\u0002#7éu\u009aMBp£THuÙÃ\u0088\u0003©ÐF\u009b¡dÈ\u001e\u0005¬µdlÖóXÆTp\u009fÍ\u009e9ÇM\u0005Ð\u000f!\u00adòûìy\u009aÚ\u0093Óewû;SÅÖi\u000e\u008cY\u0080\u001a\u0012Àò\u0099\u00861&\r\u0001ÁÔm/È*èIÕÖ\u0091îL+\u009eDÍ\u0000pSÍ\u007fÏ\u0088ô*¥Új:\u000b\u0004\u0086yj:\u001f\"\u001bÅ\u0092~á\u009eL<\u0080¼ñ¤íB¨\u0017w\u0014\u001fÙhÐ°vûÅ§w|\u009e\u0089S\u009c\u009e\u000b\u0095Èg\u0017";
      int var5 = "*\u009cÞ±ñ3\u001cÖ\u001a0\u00856jÑÎ\u0007,yüÓ´\u0001\u008a\u0090\u0001ÚÃj\u0002¹®i\u001c\u00011ÞäsdÆ¶£~&`\u0016m\u009eÄ\u009c\u0007ß±fýAl~\u000f`:R\u009e<+î\u009a!qá\u0014Xòk\u0007áì¹»Ç\u0089\u0012ê\u001e&\u001cYÂQwR&¤\u000b\u001bu´Û,\u0006°nÒÃ²\t\u0087U\u008cTê'mÔ\u0082øB\u008a\u0002é\u0001Éu¾´S\bý\u008a\r\u001bÌ4Ì)÷]qa\u001f \u001c\u008eÚK\u0016±B·ç\\\bÉU ,OåÜû\u001a7(Ö Q'\u0099½\u000b\u007f\u001aþ(\u0088ý\u008bQ>¢\u008f\u009cè7i\u008e³Õ-Æ'[\u001e\u009fbê¼2j\rØÒõ#°ÌSÙ´\b\u0012æ,GØQÒü$ª<pRÈ\u009b\u00016\u00adj2\u000e\u0096T\"jÕdk\u000bö^sÅbØu\u0002#7éu\u009aMBp£THuÙÃ\u0088\u0003©ÐF\u009b¡dÈ\u001e\u0005¬µdlÖóXÆTp\u009fÍ\u009e9ÇM\u0005Ð\u000f!\u00adòûìy\u009aÚ\u0093Óewû;SÅÖi\u000e\u008cY\u0080\u001a\u0012Àò\u0099\u00861&\r\u0001ÁÔm/È*èIÕÖ\u0091îL+\u009eDÍ\u0000pSÍ\u007fÏ\u0088ô*¥Új:\u000b\u0004\u0086yj:\u001f\"\u001bÅ\u0092~á\u009eL<\u0080¼ñ¤íB¨\u0017w\u0014\u001fÙhÐ°vûÅ§w|\u009e\u0089S\u009c\u009e\u000b\u0095Èg\u0017"
         .length();
      p(null);
      byte var2 = 0;

      label84:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var22 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var22;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[52];
                     L = new byte[a(11243, 3139599734361067572L)];
                     K = new char[a(32106, 8839225479113983672L)];

                     for (int var8 = 0; var8 < a(12134, 5904539216114422928L); var8++) {
                        L[var8] = -1;
                     }

                     for (int var11 = a(26039, 5688507725800234592L); var11 >= a(30181, 7545117024177933840L); var11--) {
                        L[var11] = (byte)(var11 - a(11457, 261713273750361893L));
                     }

                     for (int var12 = a(7458, 5110737668512425719L); var12 >= a(7364, 7279695648507012916L); var12--) {
                        L[var12] = (byte)(var12 - a(24676, 2930421272283700158L) + a(31641, 2203348218118127731L));
                     }

                     for (int var13 = a(15236, 772941996002967677L); var13 >= a(11721, 493853525299664434L); var13--) {
                        L[var13] = (byte)(var13 - a(30968, 3846228500704215859L) + a(19829, 6955791916639909505L));
                     }

                     L[a(30687, 1478060043472915465L)] = (byte)a(14705, 9122657325705200297L);
                     L[a(26737, 1076369653173834683L)] = (byte)a(2366, 7940169303309398724L);

                     for (int var14 = 0; var14 <= a(255, 7624281563145911058L); var14++) {
                        K[var14] = (char)(a(11457, 261713273750361893L) + var14);
                     }

                     int var15 = a(26999, 4925638755951301263L);

                     for (int var9 = 0; var15 <= a(14691, 2497920769864794781L); var9++) {
                        K[var15] = (char)(a(24676, 2930421272283700158L) + var9);
                        var15++;
                     }

                     var15 = a(19140, 6580332841720639800L);

                     for (int var17 = 0; var15 <= a(3761, 7312789214276498776L); var17++) {
                        K[var15] = (char)(a(30968, 3846228500704215859L) + var17);
                        var15++;
                     }

                     K[a(29845, 2666733220493676405L)] = (char)a(30099, 5248487082539503217L);
                     K[a(22504, 866947295508982798L)] = (char)a(20325, 3277618912573977738L);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var22;
                  if (var2 < var5) {
                     continue label84;
                  }

                  var4 = "8w\u0010\u0092ëû_\u0091\u0088\u0080\u0007¦¶áÏ\u0006";
                  var5 = "8w\u0010\u0092ëû_\u0091\u0088\u0080\u0007¦¶áÏ\u0006".length();
                  var2 = 0;
            }

            byte var19 = var2;
            var2 += 8;
            var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}






