package com;

import java.awt.image.BufferedImage;

public class hq_4 extends hX_3 {
   private static final String c;
   private static final long[] l;
   private static final Integer[] m;

   public hq_4() {
      this.e = 10.0F;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label91: {
         var4 = var1.getWidth();
         String[] var10000 = com.W5.q();
         var5 = var1.getHeight();
         var3 = var10000;
         BufferedImage var22 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label91;
            }

            var22 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var22;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      var1.getRGB(0, 0, var4, var5, var6, 0, var4);
      float var24;
      int var23 = (var24 = this.e - 0.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
      if (var3 != null) {
         if (var23 > 0) {
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
         var23 = 0;
      }

      int var8 = var23;
      int var9 = 0;

      while (true) {
         if (var9 < var5) {
            if (var3 == null) {
               break;
            }

            int var10 = 0;

            label51: {
               while (var10 < var4) {
                  int var11 = var7[var8];
                  int var12 = var11 >> c(20691, 2700122611614827965L) & c(11353, 5736159368207415603L);
                  int var13 = var11 >> c(15637, 4927019269615790202L) & c(23453, 2104073499637174000L);
                  int var14 = var11 & c(23453, 2104073499637174000L);
                  int var15 = var6[var8];
                  int var16 = var15 >> c(27505, 6716275699511557661L) & c(23453, 2104073499637174000L);
                  int var17 = var15 >> c(15983, 484837946915793671L) & c(23453, 2104073499637174000L);
                  int var18 = var15 & c(23453, 2104073499637174000L);
                  var12 = (var12 + c(23453, 2104073499637174000L) - var16) / 2;
                  var13 = (var13 + c(23453, 2104073499637174000L) - var17) / 2;
                  var14 = (var14 + c(23453, 2104073499637174000L) - var18) / 2;
                  var6[var8] = var11 & c(23926, 2989599614803363871L)
                     | var12 << c(27505, 6716275699511557661L)
                     | var13 << c(15983, 484837946915793671L)
                     | var14;
                  var8++;
                  var10++;
                  if (var3 == null) {
                     break label51;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               var9++;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0012u\u0000\n\rP,7qU(Ck6~7[".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 9;
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
         var10007 = 9;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 89;
               break;
            case 1:
               var50 = 16;
               break;
            case 2:
               var50 = 124;
               break;
            case 3:
               var50 = 113;
               break;
            case 4:
               var50 = 43;
               break;
            case 5:
               var50 = 17;
               break;
            default:
               var50 = 76;
         }
      } else {
         var34 = 9;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            c = var39;
            long var9 = 7177305606031596940L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "ð\u000flÒá\u0017£\u0081§¬öãÄÁ\u0013\u0083ÅÃ¥Mh£\u0098!ê\u0000¬»%\u001aõþÏ\u0003KÁÌev\u0083";
            int var13 = "ð\u000flÒá\u0017£\u0081§¬öãÄÁ\u0013\u0083ÅÃ¥Mh£\u0098!ê\u0000¬»%\u001aõþÏ\u0003KÁÌev\u0083".length();
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

                        var12 = "ÄÁÁl\u0098\u0011\u0015\u0093\u0093Sõe>æä@";
                        var13 = "ÄÁÁl\u0098\u0011\u0015\u0093\u0093Sõe>æä@".length();
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
         var10007 = 9;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 89;
               break;
            case 1:
               var50 = 16;
               break;
            case 2:
               var50 = 124;
               break;
            case 3:
               var50 = 113;
               break;
            case 4:
               var50 = 43;
               break;
            case 5:
               var50 = 17;
               break;
            default:
               var50 = 76;
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
                  var50 = 89;
                  break;
               case 1:
                  var50 = 16;
                  break;
               case 2:
                  var50 = 124;
                  break;
               case 3:
                  var50 = 113;
                  break;
               case 4:
                  var50 = 43;
                  break;
               case 5:
                  var50 = 17;
                  break;
               default:
                  var50 = 76;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               c = var36;
               long var0 = 7177305606031596940L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "ð\u000flÒá\u0017£\u0081§¬öãÄÁ\u0013\u0083ÅÃ¥Mh£\u0098!ê\u0000¬»%\u001aõþÏ\u0003KÁÌev\u0083";
               int var5 = "ð\u000flÒá\u0017£\u0081§¬öãÄÁ\u0013\u0083ÅÃ¥Mh£\u0098!ê\u0000¬»%\u001aõþÏ\u0003KÁÌev\u0083".length();
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

                           var4 = "ÄÁÁl\u0098\u0011\u0015\u0093\u0093Sõe>æä@";
                           var5 = "ÄÁÁl\u0098\u0011\u0015\u0093\u0093Sõe>æä@".length();
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
                  var50 = 89;
                  break;
               case 1:
                  var50 = 16;
                  break;
               case 2:
                  var50 = 124;
                  break;
               case 3:
                  var50 = 113;
                  break;
               case 4:
                  var50 = 43;
                  break;
               case 5:
                  var50 = 17;
                  break;
               default:
                  var50 = 76;
            }
         }
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5484;
      if (m[var3] == null) {
         m[var3] = (int)(l[var3] ^ var1);
      }

      return m[var3];
   }
}





