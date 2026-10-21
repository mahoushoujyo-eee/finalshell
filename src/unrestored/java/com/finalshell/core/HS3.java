package com.finalshell.core;

import java.awt.image.BufferedImage;

public class HS3 extends HX3 {
   public float S = 0.5F;
   public static String c;
   public static long[] l;
   public static Integer[] m;

   public HS3() {
      this.e = 2.0F;
   }

   public void c(float var1) {
      this.S = var1;
   }

   public float w() {
      return this.S;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label91: {
         var4 = var1.getWidth();
         String[] var10000 = W5.q();
         var5 = var1.getHeight();
         var3 = var10000;
         BufferedImage var23 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label91;
            }

            var23 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var23;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      var1.getRGB(0, 0, var4, var5, var6, 0, var4);
      float var24 = this.e;
      float var10001 = 0.0F;
      if (var3 != null) {
         if (this.e > 0.0F) {
            boolean var10006;
            label81: {
               label95: {
                  var10006 = this.K;
                  if (var3 != null) {
                     if (!this.K) {
                        break label95;
                     }

                     var10006 = this.J;
                  }

                  if (var3 == null) {
                     break label81;
                  }

                  if (var10006) {
                     var10006 = true;
                     break label81;
                  }
               }

               var10006 = false;
            }

            boolean var10007;
            label70: {
               label96: {
                  V(this.V, var6, var7, var4, var5, this.K, var10006, false, Y);
                  var10007 = this.K;
                  if (var3 != null) {
                     if (!this.K) {
                        break label96;
                     }

                     var10007 = this.J;
                  }

                  if (var3 == null) {
                     break label70;
                  }

                  if (var10007) {
                     var10007 = true;
                     break label70;
                  }
               }

               var10007 = false;
            }

            V(this.V, var7, var6, var5, var4, this.K, false, var10007, Y);
         }

         var1.getRGB(0, 0, var4, var5, var7, 0, var4);
         var24 = 4.0F;
         var10001 = this.S;
      }

      float var8 = var24 * var10001;
      int var9 = 0;
      int var10 = 0;

      while (true) {
         if (var10 < var5) {
            if (var3 == null) {
               break;
            }

            int var11 = 0;

            label51: {
               while (var11 < var4) {
                  int var12 = var7[var9];
                  int var13 = var12 >> c(26775, 2878918141400609376L) & c(19831, 1212554243280033669L);
                  int var14 = var12 >> c(16753, 1635887695232588672L) & c(31195, 7058786591313912619L);
                  int var15 = var12 & c(31195, 7058786591313912619L);
                  int var16 = var6[var9];
                  int var17 = var16 >> c(20876, 6185862777881316216L) & c(31195, 7058786591313912619L);
                  int var18 = var16 >> c(16193, 6144987337444042167L) & c(31195, 7058786591313912619L);
                  int var19 = var16 & c(31195, 7058786591313912619L);
                  var13 = Iw4.e((int)((float)var13 + var8 * (float)var17));
                  var14 = Iw4.e((int)((float)var14 + var8 * (float)var18));
                  var15 = Iw4.e((int)((float)var15 + var8 * (float)var19));
                  var6[var9] = var12 & c(27358, 507495404814004267L)
                     | var13 << c(20876, 6185862777881316216L)
                     | var14 << c(16193, 6144987337444042167L)
                     | var15;
                  var9++;
                  var11++;
                  if (var3 == null) {
                     break label51;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               var10++;
            }

            if (var3 != null) {
               continue;
            }
         }

         var2.setRGB(0, 0, var4, var5, var6, 0, var4);
         break;
      }

      return var2;
   }

   @Override
   public String toString() {
      return c;
   }

   static {
      __vfClinit__();
   }

   public static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6900;
      if (m[var3] == null) {
         m[var3] = (int)(l[var3] ^ var1);
      }

      return m[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "s\u0016/I\u007fx\u0004^\rt\u0015~".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 60;
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
         var10007 = 60;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 13;
               break;
            case 1:
               var50 = 70;
               break;
            case 2:
               var50 = 102;
               break;
            case 3:
               var50 = 7;
               break;
            case 4:
               var50 = 108;
               break;
            case 5:
               var50 = 3;
               break;
            default:
               var50 = 84;
         }
      } else {
         var34 = 60;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            c = var39;
            long var9 = 5306751619391572988L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "¤ç\u009dÍaý\u0000\u0094R\u001cðm\u007f\u0004»×\r®~yD°nCvE\u0093ô¢\u008c9\u008cã%ÂR9\u009e((";
            int var13 = "¤ç\u009dÍaý\u0000\u0094R\u001cðm\u007f\u0004»×\r®~yD°nCvE\u0093ô¢\u008c9\u008cã%ÂR9\u009e((".length();
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
                           l = var14;
                           m = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "ý¢6\u008cGÕ\u0010tÛ\u00916¹¬\u0089\u001c\u0086";
                        var13 = "ý¢6\u008cGÕ\u0010tÛ\u00916¹¬\u0089\u001c\u0086".length();
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
         var10007 = 60;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 13;
               break;
            case 1:
               var50 = 70;
               break;
            case 2:
               var50 = 102;
               break;
            case 3:
               var50 = 7;
               break;
            case 4:
               var50 = 108;
               break;
            case 5:
               var50 = 3;
               break;
            default:
               var50 = 84;
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
                  var50 = 13;
                  break;
               case 1:
                  var50 = 70;
                  break;
               case 2:
                  var50 = 102;
                  break;
               case 3:
                  var50 = 7;
                  break;
               case 4:
                  var50 = 108;
                  break;
               case 5:
                  var50 = 3;
                  break;
               default:
                  var50 = 84;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               c = var36;
               long var0 = 5306751619391572988L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "¤ç\u009dÍaý\u0000\u0094R\u001cðm\u007f\u0004»×\r®~yD°nCvE\u0093ô¢\u008c9\u008cã%ÂR9\u009e((";
               int var5 = "¤ç\u009dÍaý\u0000\u0094R\u001cðm\u007f\u0004»×\r®~yD°nCvE\u0093ô¢\u008c9\u008cã%ÂR9\u009e((".length();
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
                              l = var6;
                              m = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ý¢6\u008cGÕ\u0010tÛ\u00916¹¬\u0089\u001c\u0086";
                           var5 = "ý¢6\u008cGÕ\u0010tÛ\u00916¹¬\u0089\u001c\u0086".length();
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
                  var50 = 13;
                  break;
               case 1:
                  var50 = 70;
                  break;
               case 2:
                  var50 = 102;
                  break;
               case 3:
                  var50 = 7;
                  break;
               case 4:
                  var50 = 108;
                  break;
               case 5:
                  var50 = 3;
                  break;
               default:
                  var50 = 84;
            }
         }
      }
   }
}





