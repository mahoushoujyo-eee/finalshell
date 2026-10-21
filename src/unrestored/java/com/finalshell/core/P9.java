package com.finalshell.core;

import java.awt.Color;
import java.util.Random;
import java.util.StringTokenizer;

public final class P9 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public static Color M(Color var0) {
      String var1 = FV_2.D();
      Color var10000 = var0;
      if (var1 == null) {
         if (var0.getAlpha() != a(467, 3411941311640567078L)) {
            return new Color(var0.getRGB(), false);
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static Color M(Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
   }

   public static Color N(Color var0, Color var1, float var2) {
      if (var2 <= 0.0F) {
         return var0;
      } else {
         return var2 >= 1.0F
            ? var1
            : new Color(
               D(var0.getRed(), var1.getRed(), var2),
               D(var0.getGreen(), var1.getGreen(), var2),
               D(var0.getBlue(), var1.getBlue(), var2),
               D(var0.getAlpha(), var1.getAlpha(), var2)
            );
      }
   }

   public static int D(int var0, int var1, float var2) {
      return var0 + Math.round(((float)var1 - (float)var0) * var2);
   }

   public static Color X(Color var0) {
      return new Color(d(var0.getRed()), d(var0.getGreen()), d(var0.getBlue()));
   }

   public static int d(int var0) {
      String var1;
      int var10000;
      int var10001;
      var1 = FV_2.D();
      var10000 = 0;
      var10001 = var0;
      label115:
      if (var1 == null) {
         if (0 <= var0) {
            var10000 = var0;
            var10001 = a(18254, 5566390575414197178L);
            if (var1 != null) {
               break label115;
            }

            if (var0 <= var10001) {
               var10000 = var0;
               if (var1 == null) {
                  var10000 = var0 > a(28202, 373183381899743959L) - var0 ? a(28202, 373183381899743959L) : 0;
               }

               return var10000;
            }
         }

         var10000 = a(28202, 373183381899743959L);
         var10001 = var0;
      }

      label108:
      if (var1 == null) {
         if (var10000 <= var10001) {
            var10000 = var0;
            var10001 = a(12799, 464152774297931013L);
            if (var1 != null) {
               break label108;
            }

            if (var0 <= var10001) {
               var10000 = a(28202, 373183381899743959L) + var0;
               if (var1 == null) {
                  var10000 = var10000 > a(8920, 7273021822339571236L) - var0 ? a(8920, 7273021822339571236L) : a(28202, 373183381899743959L);
               }

               return var10000;
            }
         }

         var10000 = a(8920, 7273021822339571236L);
         var10001 = var0;
      }

      label101:
      if (var1 == null) {
         if (var10000 <= var10001) {
            var10000 = var0;
            var10001 = a(14295, 231234286600342319L);
            if (var1 != null) {
               break label101;
            }

            if (var0 <= var10001) {
               var10000 = a(8920, 7273021822339571236L) + var0;
               if (var1 == null) {
                  var10000 = var10000 > a(13990, 3562473963981032016L) - var0 ? a(13990, 3562473963981032016L) : a(8920, 7273021822339571236L);
               }

               return var10000;
            }
         }

         var10000 = a(13990, 3562473963981032016L);
         var10001 = var0;
      }

      label93:
      if (var1 == null) {
         if (var10000 <= var10001) {
            var10000 = var0;
            var10001 = a(17203, 9033566547126403016L);
            if (var1 != null) {
               break label93;
            }

            if (var0 <= var10001) {
               var10000 = a(13990, 3562473963981032016L) + var0;
               if (var1 == null) {
                  var10000 = var10000 > a(2971, 1483431869039146860L) - var0 ? a(2971, 1483431869039146860L) : a(13990, 3562473963981032016L);
               }

               return var10000;
            }
         }

         var10000 = a(2971, 1483431869039146860L);
         if (var1 != null) {
            return var10000;
         }

         var10001 = var0;
      }

      if (var10000 <= var10001) {
         if (var1 != null) {
            return var0;
         }

         if (var0 <= a(467, 3411941311640567078L)) {
            var10000 = a(2971, 1483431869039146860L) + var0;
            if (var1 == null) {
               var10000 = var10000 > a(467, 3411941311640567078L) - var0 ? a(467, 3411941311640567078L) : a(2971, 1483431869039146860L);
            }

            return var10000;
         }
      }

      return var0;
   }

   public static String u(Color var0) {
      return Q(var0.getRGB());
   }

   public static String Q(int var0) {
      String var1 = FV_2.D();
      int var10000 = var0;
      if (var1 == null) {
         if (var0 == 0) {
            return a;
         }

         var10000 = var0;
      }

      String var2 = Integer.toHexString(var10000).toUpperCase();
      return "#" + var2.substring(2, var2.length());
   }

   public static Color C(String var0) {
      String var10000 = FV_2.D();
      var0 = var0.replaceAll(" ", "");
      String var1 = var10000;
      var10000 = var0;
      if (var1 == null) {
         var10000 = var0.startsWith("#") ? var0 : "#" + var0;
      }

      return Color.decode(var10000);
   }

   public static Color u(String var0) {
      return k(var0, ",");
   }

   public static Color k(String var0, String var1) {
      String var10000 = FV_2.D();
      var0 = var0.replaceAll(" ", "");
      StringTokenizer var3 = new StringTokenizer(var0, var1, false);
      int var4 = var3.countTokens();
      String var2 = var10000;
      int var6 = var4;
      byte var10001 = 3;
      if (var2 == null) {
         if (var4 == 3) {
            return new Color(Integer.parseInt(var3.nextToken()), Integer.parseInt(var3.nextToken()), Integer.parseInt(var3.nextToken()));
         }

         var6 = var4;
         var10001 = 4;
      }

      return var6 == var10001
         ? new Color(
            Integer.parseInt(var3.nextToken()), Integer.parseInt(var3.nextToken()), Integer.parseInt(var3.nextToken()), Integer.parseInt(var3.nextToken())
         )
         : null;
   }

   public static Color B(int var0) {
      return new Color(0, 0, 0, var0);
   }

   public static Color i(int var0) {
      return new Color(a(30740, 3479056859032585451L), a(467, 3411941311640567078L), a(467, 3411941311640567078L), var0);
   }

   public static Color c(Color var0) {
      String var10000 = FV_2.D();
      Random var2 = new Random();
      String var1 = var10000;
      int var3 = var2.nextInt(a(1372, 8815716632584092069L));
      int var4 = var2.nextInt(a(25201, 9102742916713488015L));
      int var5 = var2.nextInt(a(25201, 9102742916713488015L));
      Color var6 = var0;
      if (var1 == null) {
         if (var0 != null) {
            var3 = (var3 + var0.getRed()) / 2;
            var4 = (var4 + var0.getGreen()) / 2;
            var5 = (var5 + var0.getBlue()) / 2;
         }

         var6 = new Color(var3, var4, var5);
      }

      return var6;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31997;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "B6rl.\bb".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 17;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 17;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 112;
               break;
            case 1:
               var50 = 23;
               break;
            case 2:
               var50 = 83;
               break;
            case 3:
               var50 = 77;
               break;
            case 4:
               var50 = 15;
               break;
            case 5:
               var50 = 41;
               break;
            default:
               var50 = 67;
         }
      } else {
         var34 = 17;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 1415187514735918684L;
            long[] var14 = new long[12];
            int var11 = 0;
            String var12 = "\u0007¿{AðPl¸\u0011\u008aåpÆP \u001eFô\u0092³>`úHä\u0016×¶¢\u000fáÓF´J§'Ë\u0086ùeAÞ\u0010:Òµê\u008c\u008fC\u0092Z4ÁXÃÎ\u0096¶Ãì³?¿Êúù@¶\u0003\u0085ààê\u008brÃÅÕ";
            int var13 = "\u0007¿{AðPl¸\u0011\u008aåpÆP \u001eFô\u0092³>`úHä\u0016×¶¢\u000fáÓF´J§'Ë\u0086ùeAÞ\u0010:Òµê\u008c\u008fC\u0092Z4ÁXÃÎ\u0096¶Ãì³?¿Êúù@¶\u0003\u0085ààê\u008brÃÅÕ"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[12];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "öé^`\u0010ô\u0089üìDzKúÌ4\u0095";
                        var13 = "öé^`\u0010ô\u0089üìDzKúÌ4\u0095".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 17;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 112;
               break;
            case 1:
               var50 = 23;
               break;
            case 2:
               var50 = 83;
               break;
            case 3:
               var50 = 77;
               break;
            case 4:
               var50 = 15;
               break;
            case 5:
               var50 = 41;
               break;
            default:
               var50 = 67;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 112;
                  break;
               case 1:
                  var50 = 23;
                  break;
               case 2:
                  var50 = 83;
                  break;
               case 3:
                  var50 = 77;
                  break;
               case 4:
                  var50 = 15;
                  break;
               case 5:
                  var50 = 41;
                  break;
               default:
                  var50 = 67;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 1415187514735918684L;
               long[] var6 = new long[12];
               int var3 = 0;
               String var4 = "\u0007¿{AðPl¸\u0011\u008aåpÆP \u001eFô\u0092³>`úHä\u0016×¶¢\u000fáÓF´J§'Ë\u0086ùeAÞ\u0010:Òµê\u008c\u008fC\u0092Z4ÁXÃÎ\u0096¶Ãì³?¿Êúù@¶\u0003\u0085ààê\u008brÃÅÕ";
               int var5 = "\u0007¿{AðPl¸\u0011\u008aåpÆP \u001eFô\u0092³>`úHä\u0016×¶¢\u000fáÓF´J§'Ë\u0086ùeAÞ\u0010:Òµê\u008c\u008fC\u0092Z4ÁXÃÎ\u0096¶Ãì³?¿Êúù@¶\u0003\u0085ààê\u008brÃÅÕ"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[12];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "öé^`\u0010ô\u0089üìDzKúÌ4\u0095";
                           var5 = "öé^`\u0010ô\u0089üìDzKúÌ4\u0095".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 112;
                  break;
               case 1:
                  var50 = 23;
                  break;
               case 2:
                  var50 = 83;
                  break;
               case 3:
                  var50 = 77;
                  break;
               case 4:
                  var50 = 15;
                  break;
               case 5:
                  var50 = 41;
                  break;
               default:
                  var50 = 67;
            }
         }
      }
   }
}





