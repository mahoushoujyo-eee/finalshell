package com.finalshell.core;

import java.util.Arrays;

/** @deprecated */
public class Dd2 {
   public static char[] B;
   public static int[] I;
   public static long[] a;
   public static Integer[] b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static byte[] m(char[] var0, int var1, int var2) {
      int var3 = Ph2.u();
      int var10000 = var2;
      if (var3 == 0) {
         if (var2 == 0) {
            return new byte[0];
         }

         var10000 = var1;
      }

      int var4 = var10000;
      int var5 = var1 + var2 - 1;

      label158: {
         label157:
         while (true) {
            if (var4 < var5) {
               var10000 = I[var0[var4]];
               if (var3 == 0 && var3 == 0) {
                  if (var10000 < 0) {
                     var4++;
                     if (var3 == 0) {
                        continue;
                     }
                  }

                  var10000 = var5;
               }
            } else {
               var10000 = var5;
            }

            while (true) {
               if (var10000 <= 0) {
                  break label157;
               }

               var10000 = I[var0[var5]];
               if (var3 != 0 || var3 != 0) {
                  break label158;
               }

               if (var10000 >= 0) {
                  break label157;
               }

               var5--;
               if (var3 != 0) {
                  break label157;
               }

               var10000 = var5;
            }
         }

         var10000 = var0[var5];
      }

      label133: {
         int var10001 = a(219, 4802436660618389513L);
         if (var3 == 0) {
            if (var10000 != var10001) {
               var10000 = 0;
               break label133;
            }

            var10000 = var0[var5 - 1];
            if (var3 != 0) {
               break label133;
            }

            var10001 = a(219, 4802436660618389513L);
         }

         var10000 = var10000 == var10001 ? 2 : 1;
      }

      int var6;
      int var7;
      label164: {
         var6 = var10000;
         var7 = var5 - var4 + 1;
         var10000 = var2;
         int var31 = a(16164, 4905771672803497962L);
         if (var3 == 0) {
            if (var2 <= var31) {
               var10000 = 0;
               break label164;
            }

            var10000 = var0[a(16164, 4905771672803497962L)];
            var31 = a(2506, 4602994592062071071L);
         }

         label119: {
            if (var3 == 0) {
               if (var10000 != var31) {
                  var10000 = 0;
                  break label119;
               }

               var10000 = var7;
               var31 = a(19266, 8000463361573299073L);
            }

            var10000 /= var31;
         }

         var10000 <<= 1;
      }

      int var8 = var10000;
      int var9 = ((var7 - var8) * a(5614, 7730332275594460454L) >> 3) - var6;
      byte[] var10 = new byte[var9];
      int var11 = 0;
      int var12 = 0;
      int var13 = var9 / 3 * 3;

      while (true) {
         if (var11 < var13) {
            int var14 = I[var0[var4++]] << a(27822, 3834597584656204927L)
               | I[var0[var4++]] << a(23268, 6207395113592336933L)
               | I[var0[var4++]] << a(5614, 7730332275594460454L)
               | I[var0[var4++]];
            var10[var11++] = (byte)(var14 >> a(31730, 1649310781495677749L));
            var10[var11++] = (byte)(var14 >> a(8165, 2372584448918714149L));
            var10[var11++] = (byte)var14;
            var10000 = var8;
            if (var3 != 0) {
               break;
            }

            label166: {
               if (var3 == 0) {
                  if (var8 <= 0) {
                     break label166;
                  }

                  var10000 = ++var12;
               }

               if (var3 == 0) {
                  if (var10000 != a(26358, 8580412412086980157L)) {
                     break label166;
                  }

                  var4 += 2;
                  var10000 = 0;
               }

               var12 = var10000;
            }

            if (var3 == 0) {
               continue;
            }
         }

         var10000 = var11;
         break;
      }

      if (var3 == 0) {
         if (var10000 >= var9) {
            return var10;
         }

         var12 = 0;
         var10000 = 0;
      }

      var13 = var10000;

      label80: {
         while (var4 <= var5 - var6) {
            var12 |= I[var0[var4++]] << a(27822, 3834597584656204927L) - var13 * a(5614, 7730332275594460454L);
            var13++;
            if (var3 != 0) {
               break label80;
            }

            if (var3 != 0) {
               break;
            }
         }

         var13 = a(31730, 1649310781495677749L);
      }

      while (var11 < var9) {
         if (var3 != 0) {
            return var10;
         }

         var10[var11++] = (byte)(var12 >> var13);
         var13 -= 8;
         if (var3 != 0) {
            break;
         }
      }

      return var10;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static byte[] r(String var0, int var1, int var2) {
      int var3 = Ph2.w();
      int var10000 = var2;
      if (var3 != 0) {
         if (var2 == 0) {
            return new byte[0];
         }

         var10000 = var1;
      }

      int var4 = var10000;
      int var5 = var1 + var2 - 1;

      label158: {
         label157:
         while (true) {
            if (var4 < var5) {
               var10000 = I[var0.charAt(var4)];
               if (var3 != 0 && var3 != 0) {
                  if (var10000 < 0) {
                     var4++;
                     if (var3 != 0) {
                        continue;
                     }
                  }

                  var10000 = var5;
               }
            } else {
               var10000 = var5;
            }

            while (true) {
               if (var10000 <= 0) {
                  break label157;
               }

               var10000 = I[var0.charAt(var5)];
               if (var3 == 0 || var3 == 0) {
                  break label158;
               }

               if (var10000 >= 0) {
                  break label157;
               }

               var5--;
               if (var3 == 0) {
                  break label157;
               }

               var10000 = var5;
            }
         }

         var10000 = var0.charAt(var5);
      }

      label133: {
         int var10001 = a(219, 4802436660618389513L);
         if (var3 != 0) {
            if (var10000 != var10001) {
               var10000 = 0;
               break label133;
            }

            var10000 = var0.charAt(var5 - 1);
            if (var3 == 0) {
               break label133;
            }

            var10001 = a(219, 4802436660618389513L);
         }

         var10000 = var10000 == var10001 ? 2 : 1;
      }

      int var6;
      int var7;
      label164: {
         var6 = var10000;
         var7 = var5 - var4 + 1;
         var10000 = var2;
         int var31 = a(29014, 5836247368506087827L);
         if (var3 != 0) {
            if (var2 <= var31) {
               var10000 = 0;
               break label164;
            }

            var10000 = var0.charAt(a(16164, 4905771672803497962L));
            var31 = a(31164, 5219238331983008126L);
         }

         label119: {
            if (var3 != 0) {
               if (var10000 != var31) {
                  var10000 = 0;
                  break label119;
               }

               var10000 = var7;
               var31 = a(12936, 2674045981100857924L);
            }

            var10000 /= var31;
         }

         var10000 <<= 1;
      }

      int var8 = var10000;
      int var9 = ((var7 - var8) * a(26635, 466335938777579716L) >> 3) - var6;
      byte[] var10 = new byte[var9];
      int var11 = 0;
      int var12 = 0;
      int var13 = var9 / 3 * 3;

      while (true) {
         if (var11 < var13) {
            int var14 = I[var0.charAt(var4++)] << a(8519, 4860261691652131201L)
               | I[var0.charAt(var4++)] << a(6711, 2163401343897400039L)
               | I[var0.charAt(var4++)] << a(5614, 7730332275594460454L)
               | I[var0.charAt(var4++)];
            var10[var11++] = (byte)(var14 >> a(27945, 1238824587946853869L));
            var10[var11++] = (byte)(var14 >> a(21957, 7850013313912552723L));
            var10[var11++] = (byte)var14;
            var10000 = var8;
            if (var3 == 0) {
               break;
            }

            label166: {
               if (var3 != 0) {
                  if (var8 <= 0) {
                     break label166;
                  }

                  var10000 = ++var12;
               }

               if (var3 != 0) {
                  if (var10000 != a(27311, 7933415358630101602L)) {
                     break label166;
                  }

                  var4 += 2;
                  var10000 = 0;
               }

               var12 = var10000;
            }

            if (var3 != 0) {
               continue;
            }
         }

         var10000 = var11;
         break;
      }

      if (var3 != 0) {
         if (var10000 >= var9) {
            return var10;
         }

         var12 = 0;
         var10000 = 0;
      }

      var13 = var10000;

      label80: {
         while (var4 <= var5 - var6) {
            var12 |= I[var0.charAt(var4++)] << a(27822, 3834597584656204927L) - var13 * a(5614, 7730332275594460454L);
            var13++;
            if (var3 == 0) {
               break label80;
            }

            if (var3 == 0) {
               break;
            }
         }

         var13 = a(31730, 1649310781495677749L);
      }

      while (var11 < var9) {
         if (var3 == 0) {
            return var10;
         }

         var10[var11++] = (byte)(var12 >> var13);
         var13 -= 8;
         if (var3 == 0) {
            break;
         }
      }

      return var10;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static byte[] y(String var0) {
      int var10000 = Ph2.u();
      int var2 = var0.length();
      int var1 = var10000;
      var10000 = var2;
      if (var1 == 0) {
         if (var2 == 0) {
            return new byte[0];
         }

         var10000 = 0;
      }

      int var3 = var10000;
      int var4 = var2 - 1;

      label158: {
         label157:
         while (true) {
            if (var3 < var4) {
               var10000 = I[var0.charAt(var3) & a(14310, 2068736245604605745L)];
               if (var1 == 0 && var1 == 0) {
                  if (var10000 < 0) {
                     var3++;
                     if (var1 == 0) {
                        continue;
                     }
                  }

                  var10000 = var4;
               }
            } else {
               var10000 = var4;
            }

            while (true) {
               if (var10000 <= 0) {
                  break label157;
               }

               var10000 = I[var0.charAt(var4) & a(428, 3728974573605939558L)];
               if (var1 != 0 || var1 != 0) {
                  break label158;
               }

               if (var10000 >= 0) {
                  break label157;
               }

               var4--;
               if (var1 != 0) {
                  break label157;
               }

               var10000 = var4;
            }
         }

         var10000 = var0.charAt(var4);
      }

      label133: {
         int var10001 = a(219, 4802436660618389513L);
         if (var1 == 0) {
            if (var10000 != var10001) {
               var10000 = 0;
               break label133;
            }

            var10000 = var0.charAt(var4 - 1);
            if (var1 != 0) {
               break label133;
            }

            var10001 = a(219, 4802436660618389513L);
         }

         var10000 = var10000 == var10001 ? 2 : 1;
      }

      int var5;
      int var6;
      label164: {
         var5 = var10000;
         var6 = var4 - var3 + 1;
         var10000 = var2;
         int var31 = a(16164, 4905771672803497962L);
         if (var1 == 0) {
            if (var2 <= var31) {
               var10000 = 0;
               break label164;
            }

            var10000 = var0.charAt(a(16164, 4905771672803497962L));
            var31 = a(2506, 4602994592062071071L);
         }

         label119: {
            if (var1 == 0) {
               if (var10000 != var31) {
                  var10000 = 0;
                  break label119;
               }

               var10000 = var6;
               var31 = a(19266, 8000463361573299073L);
            }

            var10000 /= var31;
         }

         var10000 <<= 1;
      }

      int var7 = var10000;
      int var8 = ((var6 - var7) * a(5614, 7730332275594460454L) >> 3) - var5;
      byte[] var9 = new byte[var8];
      int var10 = 0;
      int var11 = 0;
      int var12 = var8 / 3 * 3;

      while (true) {
         if (var10 < var12) {
            int var13 = I[var0.charAt(var3++)] << a(27822, 3834597584656204927L)
               | I[var0.charAt(var3++)] << a(23268, 6207395113592336933L)
               | I[var0.charAt(var3++)] << a(5614, 7730332275594460454L)
               | I[var0.charAt(var3++)];
            var9[var10++] = (byte)(var13 >> a(31730, 1649310781495677749L));
            var9[var10++] = (byte)(var13 >> a(8165, 2372584448918714149L));
            var9[var10++] = (byte)var13;
            var10000 = var7;
            if (var1 != 0) {
               break;
            }

            label166: {
               if (var1 == 0) {
                  if (var7 <= 0) {
                     break label166;
                  }

                  var10000 = ++var11;
               }

               if (var1 == 0) {
                  if (var10000 != a(26358, 8580412412086980157L)) {
                     break label166;
                  }

                  var3 += 2;
                  var10000 = 0;
               }

               var11 = var10000;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var10000 = var10;
         break;
      }

      if (var1 == 0) {
         if (var10000 >= var8) {
            return var9;
         }

         var11 = 0;
         var10000 = 0;
      }

      var12 = var10000;

      label80: {
         while (var3 <= var4 - var5) {
            var11 |= I[var0.charAt(var3++)] << a(27822, 3834597584656204927L) - var12 * a(5614, 7730332275594460454L);
            var12++;
            if (var1 != 0) {
               break label80;
            }

            if (var1 != 0) {
               break;
            }
         }

         var12 = a(31730, 1649310781495677749L);
      }

      while (var10 < var8) {
         if (var1 != 0) {
            return var9;
         }

         var9[var10++] = (byte)(var11 >> var12);
         var12 -= 8;
         if (var1 != 0) {
            break;
         }
      }

      return var9;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26819;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\ns.\u001bn\u0014'\u0003x'\u0014g\u001f.\u0004a<\rx\u00065\u001df5\u0006q3\u0002(U\b9L:\t!Z\u00012E=\u0010:C\u001e+^$\u00173H\u0017o\u001a`S\u007f\u0004[h\u0013kKd"
         .toCharArray();
      int var10004 = var10003.length;
      int var9 = 0;
      byte var40 = 44;
      char[] var10002 = var10003;
      int var25 = var10004;
      char[] var48;
      byte var56;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var48 = var10003;
         var10005 = var9;
         char var10008 = var10003[var9];
         var10007 = 44;
         var10006 = var10008;
         switch (var9 % 7) {
            case 0:
               var56 = 103;
               break;
            case 1:
               var56 = 29;
               break;
            case 2:
               var56 = 65;
               break;
            case 3:
               var56 = 115;
               break;
            case 4:
               var56 = 7;
               break;
            case 5:
               var56 = 126;
               break;
            default:
               var56 = 76;
         }
      } else {
         var40 = 44;
         var25 = var10004;
         if (var10004 <= var9) {
            String var45 = new String(var10003).intern();
            int var31 = -1;
            String var21 = var45;
            long var12 = 8251872514937284113L;
            long[] var17 = new long[23];
            int var14 = 0;
            String var15 = ")ö}j\u0001¿ÅÞ*\u008f`¦7Vwb`Õ\u0081\u008e¶\u008fÔ8w÷\u0004\"]Ï\u0011<Ïõ×þ×àõ4&9È¹þø/\u0082àè\u0099µU¸\u007fÎÅy+U/2ãì©+s\r¸ih?µ×M$$\u009b\u008f\u0088£\u001aw+æ\u0093{Á7?Õ\rb.\u001b1\u008a(è\u001cÈsfÓÃ¤d+2\u00051·IzäòRcä`\u000eZÍoð6¼\u001bGÔ\u0004ªï»\u0095°ó¦\u00921ÌÝ\u008e%ÖEsÙÊ¤b|à\u0000\u0013Ta>\u0014ú\u0096Ãã\u009c\u009d\u0099¹ß";
            int var16 = ")ö}j\u0001¿ÅÞ*\u008f`¦7Vwb`Õ\u0081\u008e¶\u008fÔ8w÷\u0004\"]Ï\u0011<Ïõ×þ×àõ4&9È¹þø/\u0082àè\u0099µU¸\u007fÎÅy+U/2ãì©+s\r¸ih?µ×M$$\u009b\u008f\u0088£\u001aw+æ\u0093{Á7?Õ\rb.\u001b1\u008a(è\u001cÈsfÓÃ¤d+2\u00051·IzäòRcä`\u000eZÍoð6¼\u001bGÔ\u0004ªï»\u0095°ó¦\u00921ÌÝ\u008e%ÖEsÙÊ¤b|à\u0000\u0013Ta>\u0014ú\u0096Ãã\u009c\u009d\u0099¹ß"
               .length();
            byte var13 = 0;

            label81:
            while (true) {
               var31 = var13;
               var13 += 8;
               byte[] var19 = var15.substring(var31, var13).getBytes("ISO-8859-1");
               long[] var24 = var17;
               var31 = var14++;
               long var38 = ((long)var19[0] & 255L) << 56
                  | ((long)var19[1] & 255L) << 48
                  | ((long)var19[2] & 255L) << 40
                  | ((long)var19[3] & 255L) << 32
                  | ((long)var19[4] & 255L) << 24
                  | ((long)var19[5] & 255L) << 16
                  | ((long)var19[6] & 255L) << 8
                  | (long)var19[7] & 255L;
               byte var46 = -1;

               while (true) {
                  long var54 = var38 ^ var12;
                  switch (var46) {
                     case 0:
                        var24[var31] = var54;
                        if (var13 >= var16) {
                           a = var17;
                           b = new Integer[23];
                           B = var21.toCharArray();
                           I = new int[a(29721, 4449762684328877264L)];
                           Arrays.fill(I, -1);
                           int var22 = 0;
                           int var23 = B.length;

                           while (var22 < var23) {
                              I[B[var22]] = var22++;
                           }

                           I[a(6991, 7581547476878816156L)] = 0;
                           return;
                        }
                        break;
                     default:
                        var24[var31] = var54;
                        if (var13 < var16) {
                           continue label81;
                        }

                        var15 = "¡ð\u0081¸\u0091}[\n\u008d¦1U\u009aB\u0007\u0003";
                        var16 = "¡ð\u0081¸\u0091}[\n\u008d¦1U\u009aB\u0007\u0003".length();
                        var13 = 0;
                  }

                  byte var34 = var13;
                  var13 += 8;
                  var19 = var15.substring(var34, var13).getBytes("ISO-8859-1");
                  var24 = var17;
                  var31 = var14++;
                  var38 = ((long)var19[0] & 255L) << 56
                     | ((long)var19[1] & 255L) << 48
                     | ((long)var19[2] & 255L) << 40
                     | ((long)var19[3] & 255L) << 32
                     | ((long)var19[4] & 255L) << 24
                     | ((long)var19[5] & 255L) << 16
                     | ((long)var19[6] & 255L) << 8
                     | (long)var19[7] & 255L;
                  var46 = 0;
               }
            }
         }

         var48 = var10003;
         var10005 = var9;
         char var57 = var10003[var9];
         var10007 = 44;
         var10006 = var57;
         switch (var9 % 7) {
            case 0:
               var56 = 103;
               break;
            case 1:
               var56 = 29;
               break;
            case 2:
               var56 = 65;
               break;
            case 3:
               var56 = 115;
               break;
            case 4:
               var56 = 7;
               break;
            case 5:
               var56 = 126;
               break;
            default:
               var56 = 76;
         }
      }

      while (true) {
         var48[var10005] = (char)(var10006 ^ var10007 ^ var56);
         var9++;
         if (var40 == 0) {
            var48 = var10002;
            var10005 = var40;
            char var59 = var10002[var40];
            var10007 = var40;
            var10006 = var59;
            switch (var9 % 7) {
               case 0:
                  var56 = 103;
                  break;
               case 1:
                  var56 = 29;
                  break;
               case 2:
                  var56 = 65;
                  break;
               case 3:
                  var56 = 115;
                  break;
               case 4:
                  var56 = 7;
                  break;
               case 5:
                  var56 = 126;
                  break;
               default:
                  var56 = 76;
            }
         } else {
            if (var25 <= var9) {
               String var42 = new String(var10002).intern();
               int var27 = -1;
               String var8 = var42;
               long var0 = 8251872514937284113L;
               long[] var6 = new long[23];
               int var3 = 0;
               String var4 = ")ö}j\u0001¿ÅÞ*\u008f`¦7Vwb`Õ\u0081\u008e¶\u008fÔ8w÷\u0004\"]Ï\u0011<Ïõ×þ×àõ4&9È¹þø/\u0082àè\u0099µU¸\u007fÎÅy+U/2ãì©+s\r¸ih?µ×M$$\u009b\u008f\u0088£\u001aw+æ\u0093{Á7?Õ\rb.\u001b1\u008a(è\u001cÈsfÓÃ¤d+2\u00051·IzäòRcä`\u000eZÍoð6¼\u001bGÔ\u0004ªï»\u0095°ó¦\u00921ÌÝ\u008e%ÖEsÙÊ¤b|à\u0000\u0013Ta>\u0014ú\u0096Ãã\u009c\u009d\u0099¹ß";
               int var5 = ")ö}j\u0001¿ÅÞ*\u008f`¦7Vwb`Õ\u0081\u008e¶\u008fÔ8w÷\u0004\"]Ï\u0011<Ïõ×þ×àõ4&9È¹þø/\u0082àè\u0099µU¸\u007fÎÅy+U/2ãì©+s\r¸ih?µ×M$$\u009b\u008f\u0088£\u001aw+æ\u0093{Á7?Õ\rb.\u001b1\u008a(è\u001cÈsfÓÃ¤d+2\u00051·IzäòRcä`\u000eZÍoð6¼\u001bGÔ\u0004ªï»\u0095°ó¦\u00921ÌÝ\u008e%ÖEsÙÊ¤b|à\u0000\u0013Ta>\u0014ú\u0096Ãã\u009c\u009d\u0099¹ß"
                  .length();
               byte var2 = 0;

               label47:
               while (true) {
                  var27 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var27 = var3++;
                  long var36 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var43 = -1;

                  while (true) {
                     long var52 = var36 ^ var0;
                     switch (var43) {
                        case 0:
                           var10000[var27] = var52;
                           if (var2 >= var5) {
                              a = var6;
                              b = new Integer[23];
                              B = var8.toCharArray();
                              I = new int[a(29721, 4449762684328877264L)];
                              Arrays.fill(I, -1);
                              int var10 = 0;
                              int var11 = B.length;

                              while (var10 < var11) {
                                 I[B[var10]] = var10++;
                              }

                              I[a(6991, 7581547476878816156L)] = 0;
                              return;
                           }
                           break;
                        default:
                           var10000[var27] = var52;
                           if (var2 < var5) {
                              continue label47;
                           }

                           var4 = "¡ð\u0081¸\u0091}[\n\u008d¦1U\u009aB\u0007\u0003";
                           var5 = "¡ð\u0081¸\u0091}[\n\u008d¦1U\u009aB\u0007\u0003".length();
                           var2 = 0;
                     }

                     byte var30 = var2;
                     var2 += 8;
                     var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var27 = var3++;
                     var36 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var43 = 0;
                  }
               }
            }

            var48 = var10002;
            var10005 = var9;
            char var58 = var10002[var9];
            var10007 = var40;
            var10006 = var58;
            switch (var9 % 7) {
               case 0:
                  var56 = 103;
                  break;
               case 1:
                  var56 = 29;
                  break;
               case 2:
                  var56 = 65;
                  break;
               case 3:
                  var56 = 115;
                  break;
               case 4:
                  var56 = 7;
                  break;
               case 5:
                  var56 = 126;
                  break;
               default:
                  var56 = 76;
            }
         }
      }
   }
}





