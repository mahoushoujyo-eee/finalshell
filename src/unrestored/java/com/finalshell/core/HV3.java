package com.finalshell.core;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class HV3 extends Hh4 {
   public float x = 1.0F;
   public float Q = 0.0F;
   public float w = 0.5F;
   public boolean P = false;
   public Po2 p;
   public static String b;
   public static long[] c;
   public static Integer[] d;

   public void e(float var1) {
      this.x = var1;
   }

   public float E() {
      return this.x;
   }

   public void I(float var1) {
      this.Q = var1;
   }

   public float D() {
      return this.Q;
   }

   public void J(float var1) {
      this.w = var1;
   }

   public float b() {
      return this.w;
   }

   public void a(boolean var1) {
      this.P = var1;
   }

   public boolean w$boolean() {
      return this.P;
   }

   public void e(Po2 var1) {
      this.p = var1;
   }

   public Po2 w$Po_2() {
      return this.p;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var30;
      HV3 var31;
      BufferedImage var32;
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var10000 = W5.q();
      int[] var6 = new int[var4];
      int[] var7 = new int[var4];
      BufferedImage var8 = new BufferedImage(var4, var5, 2);
      String[] var3 = var10000;
      int var9 = (int)(this.Q * 3.0F * 255.0F);
      int var10 = 0;

      label104:
      while (true) {
         int var29 = var10;
         int var10001 = var5;

         label101:
         while (var29 < var10001) {
            this.l(var1, 0, var10, var4, 1, var6);
            var30 = 0;
            if (var3 == null) {
               break label104;
            }

            int var11 = 0;

            while (var11 < var4) {
               int var12 = var6[var11];
               int var13 = var12 & a(25618, 376134130040632741L);
               int var14 = var12 >> a(20612, 1918919174425198900L) & a(2609, 5508313382336502656L);
               int var15 = var12 >> a(14976, 8867472818924530486L) & a(6981, 6732780024161209078L);
               int var16 = var12 & a(6981, 6732780024161209078L);
               int var17 = var14 + var15 + var16;
               var29 = var17;
               var10001 = var9;
               if (var3 == null) {
                  continue label101;
               }

               label95: {
                  if (var3 != null) {
                     if (var17 < var9) {
                        var6[var11] = a(23550, 6641658860886411850L);
                        if (var3 != null) {
                           break label95;
                        }
                     }

                     var29 = var17;
                     var10001 = 3;
                  }

                  var17 = var29 / var10001;
                  var6[var11] = var13 | var17 << a(6429, 8771086268329134255L) | var17 << a(17725, 8495376346299847816L) | var17;
               }

               var11++;
               if (var3 == null) {
                  break;
               }
            }

            this.E(var8, 0, var10, var4, 1, var6);
            var10++;
            if (var3 != null) {
               continue label104;
            }
            break;
         }

         var8 = super.filter(var8, null);
         var30 = 0;
         break;
      }

      var10 = var30;

      label75: {
         while (true) {
            if (var10 < var5) {
               this.l(var8, 0, var10, var4, 1, var6);
               this.l(var1, 0, var10, var4, 1, var7);
               if (var3 == null) {
                  break;
               }

               int var20 = 0;

               label69: {
                  while (var20 < var4) {
                     int var22;
                     label65: {
                        var22 = var6[var20];
                        int var23 = var22 & a(23550, 6641658860886411850L);
                        int var24 = var22 >> a(6429, 8771086268329134255L) & a(6981, 6732780024161209078L);
                        int var25 = var22 >> a(17725, 8495376346299847816L) & a(6981, 6732780024161209078L);
                        int var26 = var22 & a(6981, 6732780024161209078L);
                        if (var3 != null) {
                           var31 = this;
                           if (var3 == null) {
                              break label69;
                           }

                           if (this.p != null) {
                              int var28 = var24 + var25 + var26;
                              var22 = this.p.D((float)var28 * this.w * 0.33333334F);
                              if (var3 != null) {
                                 break label65;
                              }
                           }

                           var24 = Iw4.e((int)((float)var24 * this.w));
                           var25 = Iw4.e((int)((float)var25 * this.w));
                           var26 = Iw4.e((int)((float)var26 * this.w));
                        }

                        var22 = var23 | var24 << a(6429, 8771086268329134255L) | var25 << a(17725, 8495376346299847816L) | var26;
                     }

                     var6[var20] = var22;
                     var20++;
                     if (var3 == null) {
                        break;
                     }
                  }

                  var31 = this;
               }

               var31.E(var8, 0, var10, var4, 1, var6);
               var10++;
               if (var3 != null) {
                  continue;
               }
            }

            var32 = var2;
            if (var3 == null) {
               break label75;
            }

            if (var2 == null) {
               var2 = this.createCompatibleDestImage(var1, null);
            }
            break;
         }

         var32 = var2;
      }

      Graphics2D var19 = var32.createGraphics();
      if (var3 != null) {
         if (!this.P) {
            var19.setComposite(AlphaComposite.SrcOver);
            var19.drawRenderedImage(var1, null);
         }

         var19.setComposite(XE3.o(1, this.x));
         var19.drawRenderedImage(var8, null);
         var19.dispose();
      }

      return var2;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4533;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long var30;
      long var32;
      char[] var10003 = "\u00044\t?erkx\u0012\u0011*\u007f& y".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 51;
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
         var10007 = 51;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 100;
               break;
            case 1:
               var50 = 115;
               break;
            case 2:
               var50 = 67;
               break;
            case 3:
               var50 = 96;
               break;
            case 4:
               var50 = 63;
               break;
            case 5:
               var50 = 59;
               break;
            default:
               var50 = 61;
         }
      } else {
         var34 = 51;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            b = var39;
            long var9 = 2190462555930536210L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "\u0011j5K\u0006}ý\u0092sp\u0088R±}cXm×Ða«ð\\·\\\u0015|/Ïe\u0002,×ÁØ\u001c\u008dº2mT\u0090¯\u0018LDh6";
            int var13 = "\u0011j5K\u0006}ý\u0092sp\u0088R±}cXm×Ða«ð\\·\\\u0015|/Ïe\u0002,×ÁØ\u001c\u008dº2mT\u0090¯\u0018LDh6".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var18 = var14;
               var25 = var11++;
               var32 = ((long)var16[0] & 255L) << 56
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
                           c = var14;
                           d = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "1f`\u0006Vñ#\u001b8\u0003Á\u0086ª\u0018!\u00ad";
                        var13 = "1f`\u0006Vñ#\u001b8\u0003Á\u0086ª\u0018!\u00ad".length();
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
         var10007 = 51;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 100;
               break;
            case 1:
               var50 = 115;
               break;
            case 2:
               var50 = 67;
               break;
            case 3:
               var50 = 96;
               break;
            case 4:
               var50 = 63;
               break;
            case 5:
               var50 = 59;
               break;
            default:
               var50 = 61;
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
                  var50 = 100;
                  break;
               case 1:
                  var50 = 115;
                  break;
               case 2:
                  var50 = 67;
                  break;
               case 3:
                  var50 = 96;
                  break;
               case 4:
                  var50 = 63;
                  break;
               case 5:
                  var50 = 59;
                  break;
               default:
                  var50 = 61;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               b = var36;
               long var0 = 2190462555930536210L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "\u0011j5K\u0006}ý\u0092sp\u0088R±}cXm×Ða«ð\\·\\\u0015|/Ïe\u0002,×ÁØ\u001c\u008dº2mT\u0090¯\u0018LDh6";
               int var5 = "\u0011j5K\u0006}ý\u0092sp\u0088R±}cXm×Ða«ð\\·\\\u0015|/Ïe\u0002,×ÁØ\u001c\u008dº2mT\u0090¯\u0018LDh6".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var6;
                  var21 = var3++;
                  var30 = ((long)var7[0] & 255L) << 56
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
                              c = var6;
                              d = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "1f`\u0006Vñ#\u001b8\u0003Á\u0086ª\u0018!\u00ad";
                           var5 = "1f`\u0006Vñ#\u001b8\u0003Á\u0086ª\u0018!\u00ad".length();
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
                  var50 = 100;
                  break;
               case 1:
                  var50 = 115;
                  break;
               case 2:
                  var50 = 67;
                  break;
               case 3:
                  var50 = 96;
                  break;
               case 4:
                  var50 = 63;
                  break;
               case 5:
                  var50 = 59;
                  break;
               default:
                  var50 = 61;
            }
         }
      }
   }
}





