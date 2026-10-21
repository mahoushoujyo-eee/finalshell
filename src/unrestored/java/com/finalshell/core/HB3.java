package com.finalshell.core;

import java.awt.image.BufferedImage;

public class HB3 extends HX3 {
   public float v = 0.5F;
   public int L = 1;
   public static String c;
   public static long[] l;
   public static Integer[] m;

   public HB3() {
      this.e = 2.0F;
   }

   public void N(int var1) {
      this.L = var1;
   }

   public int H() {
      return this.L;
   }

   public void Q(float var1) {
      this.v = var1;
   }

   public float X() {
      return this.v;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label121: {
         var4 = var1.getWidth();
         String[] var10000 = W5.q();
         var5 = var1.getHeight();
         var3 = var10000;
         BufferedImage var20 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label121;
            }

            var20 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var20;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      var1.getRGB(0, 0, var4, var5, var6, 0, var4);
      float var21 = this.e;
      float var10001 = 0.0F;
      if (var3 != null) {
         if (this.e > 0.0F) {
            boolean var10006;
            label111: {
               label125: {
                  var10006 = this.K;
                  if (var3 != null) {
                     if (!this.K) {
                        break label125;
                     }

                     var10006 = this.J;
                  }

                  if (var3 == null) {
                     break label111;
                  }

                  if (var10006) {
                     var10006 = true;
                     break label111;
                  }
               }

               var10006 = false;
            }

            boolean var10007;
            label100: {
               label126: {
                  V(this.V, var6, var7, var4, var5, this.K, var10006, false, Y);
                  var10007 = this.K;
                  if (var3 != null) {
                     if (!this.K) {
                        break label126;
                     }

                     var10007 = this.J;
                  }

                  if (var3 == null) {
                     break label100;
                  }

                  if (var10007) {
                     var10007 = true;
                     break label100;
                  }
               }

               var10007 = false;
            }

            V(this.V, var7, var6, var5, var4, this.K, false, var10007, Y);
         }

         var1.getRGB(0, 0, var4, var5, var7, 0, var4);
         var21 = 4.0F;
         var10001 = this.v;
      }

      float var8 = var21 * var10001;
      int var9 = 0;
      int var10 = 0;

      label86:
      while (true) {
         int var22 = var10;
         int var23 = var5;

         label83:
         while (var22 < var23) {
            if (var3 == null) {
               return var2;
            }

            int var11 = 0;

            while (var11 < var4) {
               int var12 = var7[var9];
               int var13 = var12 >> c(16877, 8767528069833271758L) & c(10965, 6233638065585472241L);
               int var14 = var12 >> c(15032, 5006673582695109272L) & c(8847, 1969339661116099246L);
               int var15 = var12 & c(8847, 1969339661116099246L);
               int var16 = var6[var9];
               int var17 = var16 >> c(6135, 8338166658432696277L) & c(8847, 1969339661116099246L);
               int var18 = var16 >> c(22528, 6856807555065655333L) & c(8847, 1969339661116099246L);
               int var19 = var16 & c(8847, 1969339661116099246L);
               var22 = Math.abs(var13 - var17);
               var23 = this.L;
               if (var3 == null) {
                  continue label83;
               }

               if (var3 != null) {
                  if (var22 >= this.L) {
                     var13 = Iw4.e((int)((var8 + 1.0F) * (float)(var13 - var17) + (float)var17));
                  }

                  var22 = Math.abs(var14 - var18);
                  var23 = this.L;
               }

               label77: {
                  label130: {
                     if (var3 != null) {
                        if (var22 >= var23) {
                           var14 = Iw4.e((int)((var8 + 1.0F) * (float)(var14 - var18) + (float)var18));
                        }

                        var22 = Math.abs(var15 - var19);
                        if (var3 == null) {
                           break label130;
                        }

                        var23 = this.L;
                     }

                     if (var22 < var23) {
                        break label77;
                     }

                     var22 = Iw4.e((int)((var8 + 1.0F) * (float)(var15 - var19) + (float)var19));
                  }

                  var15 = var22;
               }

               var6[var9] = var12 & c(24827, 6551039110463097053L) | var13 << c(6135, 8338166658432696277L) | var14 << c(22528, 6856807555065655333L) | var15;
               var9++;
               var11++;
               if (var3 == null) {
                  break;
               }
            }

            var10++;
            if (var3 != null) {
               continue label86;
            }
            break;
         }

         var2.setRGB(0, 0, var4, var5, var6, 0, var4);
         return var2;
      }
   }

   @Override
   public String toString() {
      return c;
   }

   static {
      __vfClinit__();
   }

   public static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26656;
      if (m[var3] == null) {
         m[var3] = (int)(l[var3] ^ var1);
      }

      return m[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0014\u0005x#STZ%\u0001l#\f!y7\u001af\u007fR/".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 110;
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
         var10007 = 110;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 56;
               break;
            case 1:
               var50 = 7;
               break;
            case 2:
               var50 = 99;
               break;
            case 3:
               var50 = 63;
               break;
            case 4:
               var50 = 18;
               break;
            case 5:
               var50 = 111;
               break;
            default:
               var50 = 90;
         }
      } else {
         var34 = 110;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            c = var39;
            long var9 = 7854271042684769411L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "\u0099Q¨\u008a\u009e\u0003\u0006\u0013¿ÈñB\u00925\u001eÒ±Âéfµ>+FÙ\r`j\u008cq}]ÿ^Ë\u009eQO\u0096\u008d";
            int var13 = "\u0099Q¨\u008a\u009e\u0003\u0006\u0013¿ÈñB\u00925\u001eÒ±Âéfµ>+FÙ\r`j\u008cq}]ÿ^Ë\u009eQO\u0096\u008d".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
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

                        var12 = "ú\u009bÀi8;ä®\u0000PB\u0000\u0003\u0004Ü^";
                        var13 = "ú\u009bÀi8;ä®\u0000PB\u0000\u0003\u0004Ü^".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
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
         var10007 = 110;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 56;
               break;
            case 1:
               var50 = 7;
               break;
            case 2:
               var50 = 99;
               break;
            case 3:
               var50 = 63;
               break;
            case 4:
               var50 = 18;
               break;
            case 5:
               var50 = 111;
               break;
            default:
               var50 = 90;
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
                  var50 = 56;
                  break;
               case 1:
                  var50 = 7;
                  break;
               case 2:
                  var50 = 99;
                  break;
               case 3:
                  var50 = 63;
                  break;
               case 4:
                  var50 = 18;
                  break;
               case 5:
                  var50 = 111;
                  break;
               default:
                  var50 = 90;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               c = var36;
               long var0 = 7854271042684769411L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "\u0099Q¨\u008a\u009e\u0003\u0006\u0013¿ÈñB\u00925\u001eÒ±Âéfµ>+FÙ\r`j\u008cq}]ÿ^Ë\u009eQO\u0096\u008d";
               int var5 = "\u0099Q¨\u008a\u009e\u0003\u0006\u0013¿ÈñB\u00925\u001eÒ±Âéfµ>+FÙ\r`j\u008cq}]ÿ^Ë\u009eQO\u0096\u008d".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
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

                           var4 = "ú\u009bÀi8;ä®\u0000PB\u0000\u0003\u0004Ü^";
                           var5 = "ú\u009bÀi8;ä®\u0000PB\u0000\u0003\u0004Ü^".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
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
                  var50 = 56;
                  break;
               case 1:
                  var50 = 7;
                  break;
               case 2:
                  var50 = 99;
                  break;
               case 3:
                  var50 = 63;
                  break;
               case 4:
                  var50 = 18;
                  break;
               case 5:
                  var50 = 111;
                  break;
               default:
                  var50 = 90;
            }
         }
      }
   }
}





