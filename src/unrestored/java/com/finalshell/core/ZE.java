package com.finalshell.core;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ZE extends Zy2 {
   public float h = 1.0F;
   public float v = 0.0F;
   public float S = 0.5F;
   public boolean O = false;
   public FS n;
   public static long[] a;
   public static Integer[] d;

   public void e(float var1) {
      this.h = var1;
   }

   public float r() {
      return this.h;
   }

   public void E(float var1) {
      this.v = var1;
   }

   public float Z() {
      return this.v;
   }

   public void l(float var1) {
      this.S = var1;
   }

   public float A() {
      return this.S;
   }

   public void p(boolean var1) {
      this.O = var1;
   }

   public boolean q() {
      return this.O;
   }

   public void s(FS var1) {
      this.n = var1;
   }

   public FS p() {
      return this.n;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var30;
      ZE var31;
      BufferedImage var32;
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      int[] var6 = new int[var4];
      String[] var10000 = ZH.U();
      int[] var7 = new int[var4];
      BufferedImage var8 = new BufferedImage(var4, var5, 2);
      int var9 = (int)(this.v * 3.0F * 255.0F);
      int var10 = 0;
      String[] var3 = var10000;

      label104:
      while (true) {
         int var29 = var10;
         int var10001 = var5;

         label101:
         while (var29 < var10001) {
            this.Q(var1, 0, var10, var4, 1, var6);
            var30 = 0;
            if (var3 != null) {
               break label104;
            }

            int var11 = 0;

            while (var11 < var4) {
               int var12 = var6[var11];
               int var13 = var12 & a(29633, 6183173100045382348L);
               int var14 = var12 >> a(23059, 6772222824196184859L) & a(17831, 7997452393106113708L);
               int var15 = var12 >> a(28417, 6083588371148975630L) & a(24142, 5604038104431664964L);
               int var16 = var12 & a(24142, 5604038104431664964L);
               int var17 = var14 + var15 + var16;
               var29 = var17;
               var10001 = var9;
               if (var3 != null) {
                  continue label101;
               }

               label95: {
                  if (var3 == null) {
                     if (var17 < var9) {
                        var6[var11] = a(27702, 8558362858658671930L);
                        if (var3 == null) {
                           break label95;
                        }
                     }

                     var29 = var17;
                     var10001 = 3;
                  }

                  var17 = var29 / var10001;
                  var6[var11] = var13 | var17 << a(16484, 8047441880670798186L) | var17 << a(10687, 6766774595931203766L) | var17;
               }

               var11++;
               if (var3 != null) {
                  break;
               }
            }

            this.K(var8, 0, var10, var4, 1, var6);
            var10++;
            if (var3 == null) {
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
               this.Q(var8, 0, var10, var4, 1, var6);
               this.Q(var1, 0, var10, var4, 1, var7);
               if (var3 != null) {
                  break;
               }

               int var20 = 0;

               label69: {
                  while (var20 < var4) {
                     int var22;
                     label65: {
                        var22 = var6[var20];
                        int var23 = var22 & a(27702, 8558362858658671930L);
                        int var24 = var22 >> a(16484, 8047441880670798186L) & a(24142, 5604038104431664964L);
                        int var25 = var22 >> a(10687, 6766774595931203766L) & a(24142, 5604038104431664964L);
                        int var26 = var22 & a(24142, 5604038104431664964L);
                        if (var3 == null) {
                           var31 = this;
                           if (var3 != null) {
                              break label69;
                           }

                           if (this.n != null) {
                              int var28 = var24 + var25 + var26;
                              var22 = this.n.k((float)var28 * this.S * 0.33333334F);
                              if (var3 == null) {
                                 break label65;
                              }
                           }

                           var24 = N6.W((int)((float)var24 * this.S));
                           var25 = N6.W((int)((float)var25 * this.S));
                           var26 = N6.W((int)((float)var26 * this.S));
                        }

                        var22 = var23 | var24 << a(16484, 8047441880670798186L) | var25 << a(10687, 6766774595931203766L) | var26;
                     }

                     var6[var20] = var22;
                     var20++;
                     if (var3 != null) {
                        break;
                     }
                  }

                  var31 = this;
               }

               var31.K(var8, 0, var10, var4, 1, var6);
               var10++;
               if (var3 == null) {
                  continue;
               }
            }

            var32 = var2;
            if (var3 != null) {
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
      if (var3 == null) {
         if (!this.O) {
            var19.setComposite(AlphaComposite.SrcOver);
            var19.drawRenderedImage(var1, null);
         }

         var19.setComposite(Cx4.E(1, this.h));
         var19.drawRenderedImage(var8, null);
         var19.dispose();
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16651;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1306631389922111640L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "\u001c\rtÿÏ\u009e´Ë¾D=ØbÉ¯#\u001f°\u0002\u0091)3X&I\u008d\n\u0010¨¯+\u0093Ë±\u0019Ü¦¦\u009e\u009eâ\"\u0007\u0010_R±â";
      int var5 = "\u001c\rtÿÏ\u009e´Ë¾D=ØbÉ¯#\u001f°\u0002\u0091)3X&I\u008d\n\u0010¨¯+\u0093Ë±\u0019Ü¦¦\u009e\u009eâ\"\u0007\u0010_R±â".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     d = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "W\u008alvÃZ\u0002T^N-\u0094v\u0091\u009d¢";
                  var5 = "W\u008alvÃZ\u0002T^N-\u0094v\u0091\u009d¢".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





