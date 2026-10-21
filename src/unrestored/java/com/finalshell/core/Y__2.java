package com.finalshell.core;

import java.awt.Rectangle;

public class Y__2 extends GT3 {
   public int[][] p;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      String[] var5;
      int var7;
      byte var12;
      label87: {
         label86: {
            String[] var10000 = W5.q();
            ZI var6 = new ZI(var3, var1, var2, 0, var1);
            var5 = var10000;
            if (var6.M() > 0) {
               float var9 = 255.0F / (float)var6.M();
               this.p = new int[3][a(2558, 6658677181781575558L)];
               var7 = 0;

               while (var7 < 3) {
                  this.p[var7][0] = var6.G(var7, 0);
                  var12 = 1;
                  if (var5 == null) {
                     break label87;
                  }

                  int var8 = 1;

                  label69: {
                     while (var8 < a(24686, 7995871815894920725L)) {
                        this.p[var7][var8] = this.p[var7][var8 - 1] + var6.G(var7, var8);
                        var8++;
                        if (var5 == null) {
                           break label69;
                        }

                        if (var5 == null) {
                           break;
                        }
                     }

                     var8 = 0;
                  }

                  label79: {
                     while (var8 < a(24686, 7995871815894920725L)) {
                        this.p[var7][var8] = Math.round((float)this.p[var7][var8] * var9);
                        var8++;
                        if (var5 == null) {
                           break label79;
                        }

                        if (var5 == null) {
                           break;
                        }
                     }

                     var7++;
                  }

                  if (var5 == null) {
                     break;
                  }
               }

               if (var5 != null) {
                  break label86;
               }
            }

            this.p = null;
         }

         var7 = 0;
         var12 = 0;
      }

      int var11 = var12;

      while (true) {
         if (var11 < var2) {
            if (var5 == null) {
               break;
            }

            int var10 = 0;

            label44: {
               while (var10 < var1) {
                  var3[var7] = this.l(var10, var11, var3[var7]);
                  var7++;
                  var10++;
                  if (var5 == null) {
                     break label44;
                  }

                  if (var5 == null) {
                     break;
                  }
               }

               var11++;
            }

            if (var5 != null) {
               continue;
            }
         }

         this.p = null;
         break;
      }

      return var3;
   }

   public int l(int var1, int var2, int var3) {
      if (this.p != null) {
         int var4 = var3 & a(7227, 1167168878807192129L);
         int var5 = this.p[0][var3 >> a(14166, 648919301906676009L) & a(14887, 1514391650356737113L)];
         int var6 = this.p[1][var3 >> a(12575, 5929892306332761958L) & a(20340, 7109966606657274120L)];
         int var7 = this.p[2][var3 & a(20340, 7109966606657274120L)];
         return var4 | var5 << a(25926, 4491365435285793595L) | var6 << a(31765, 5931472446023627365L) | var7;
      } else {
         return var3;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3704;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\"e^\u000ew0 ${G\u0000i*u\u0004".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 41;
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
         var10007 = 41;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 72;
               break;
            case 1:
               var50 = 35;
               break;
            case 2:
               var50 = 27;
               break;
            case 3:
               var50 = 72;
               break;
            case 4:
               var50 = 44;
               break;
            case 5:
               var50 = 106;
               break;
            default:
               var50 = 38;
         }
      } else {
         var34 = 41;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3252038214113183276L;
            long[] var14 = new long[9];
            int var11 = 0;
            String var12 = "O\u0093\u009fÎ\u008a!@ª\u0083z\u0082tï\u007fyBY\u000bkò%\u0007ÔmK\u0084Ì(ãÏ)9á\u0082ûàö\u0084\u0007ÛG[>Ôº\u009b-\u0007×mèï&bò\u008a";
            int var13 = "O\u0093\u009fÎ\u008a!@ª\u0083z\u0082tï\u007fyBY\u000bkò%\u0007ÔmK\u0084Ì(ãÏ)9á\u0082ûàö\u0084\u0007ÛG[>Ôº\u009b-\u0007×mèï&bò\u008a"
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
                           c = new Integer[9];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "ªÓîå*<ÿ\u0015\u001a\u0006{*øw4A";
                        var13 = "ªÓîå*<ÿ\u0015\u001a\u0006{*øw4A".length();
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
         var10007 = 41;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 72;
               break;
            case 1:
               var50 = 35;
               break;
            case 2:
               var50 = 27;
               break;
            case 3:
               var50 = 72;
               break;
            case 4:
               var50 = 44;
               break;
            case 5:
               var50 = 106;
               break;
            default:
               var50 = 38;
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
                  var50 = 72;
                  break;
               case 1:
                  var50 = 35;
                  break;
               case 2:
                  var50 = 27;
                  break;
               case 3:
                  var50 = 72;
                  break;
               case 4:
                  var50 = 44;
                  break;
               case 5:
                  var50 = 106;
                  break;
               default:
                  var50 = 38;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3252038214113183276L;
               long[] var6 = new long[9];
               int var3 = 0;
               String var4 = "O\u0093\u009fÎ\u008a!@ª\u0083z\u0082tï\u007fyBY\u000bkò%\u0007ÔmK\u0084Ì(ãÏ)9á\u0082ûàö\u0084\u0007ÛG[>Ôº\u009b-\u0007×mèï&bò\u008a";
               int var5 = "O\u0093\u009fÎ\u008a!@ª\u0083z\u0082tï\u007fyBY\u000bkò%\u0007ÔmK\u0084Ì(ãÏ)9á\u0082ûàö\u0084\u0007ÛG[>Ôº\u009b-\u0007×mèï&bò\u008a"
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
                              c = new Integer[9];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ªÓîå*<ÿ\u0015\u001a\u0006{*øw4A";
                           var5 = "ªÓîå*<ÿ\u0015\u001a\u0006{*øw4A".length();
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
                  var50 = 72;
                  break;
               case 1:
                  var50 = 35;
                  break;
               case 2:
                  var50 = 27;
                  break;
               case 3:
                  var50 = 72;
                  break;
               case 4:
                  var50 = 44;
                  break;
               case 5:
                  var50 = 106;
                  break;
               default:
                  var50 = 38;
            }
         }
      }
   }
}





