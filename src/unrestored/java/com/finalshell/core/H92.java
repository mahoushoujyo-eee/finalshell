package com.finalshell.core;

import java.awt.image.BufferedImage;

public class H92 extends W5 {
   public float Y = 0.1F;
   public boolean B;
   public boolean o;
   public BufferedImage k;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void J(float var1) {
      this.Y = var1;
   }

   public float e$float() {
      return this.Y;
   }

   public void l(BufferedImage var1) {
      this.k = var1;
   }

   public BufferedImage t() {
      return this.k;
   }

   public void q(boolean var1) {
      this.B = var1;
   }

   public boolean S() {
      return this.B;
   }

   public void k(boolean var1) {
      this.o = var1;
   }

   public boolean e$boolean() {
      return this.o;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4 = var1.getWidth();
      String[] var10000 = W5.q();
      int var5 = var1.getHeight();
      String[] var3 = var10000;
      BufferedImage var28 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var28 = this.k;
      }

      if (var3 != null) {
         if (var28 == null) {
            return var2;
         }

         var28 = this.k;
      }

      int var6 = var28.getWidth();
      int var7 = this.k.getHeight();
      float var8 = 255.0F * this.Y;
      int[] var9 = new int[var4];
      int[] var10 = new int[var6];
      int var11 = 0;

      label65:
      while (true) {
         int var29 = var11;

         label63:
         while (var29 < var5) {
            this.l(var1, 0, var11, var4, 1, var9);
            this.l(this.k, 0, var11 % var7, var6, 1, var10);
            int var12 = 0;

            while (var12 < var4) {
               int var13 = var10[var12 % var6];
               int var14 = var9[var12];
               var29 = (this.B) ? 1 : 0;
               if (var3 == null) {
                  continue label63;
               }

               if (var3 != null) {
                  if (this.B) {
                     var13 ^= a(22292, 7395652081760514884L);
                  }

                  var29 = (this.o) ? 1 : 0;
               }

               label57: {
                  if (var3 != null) {
                     if (var29 != 0) {
                        int var15 = Iw4.g(var13);
                        int var16 = Iw4.g(var14);
                        float var17 = 1.0F - NM.k((float)var16 - var8, (float)var16 + var8, (float)var15);
                        int var18 = (int)(255.0F * var17);
                        var9[var12] = var14 & a(17596, 4970807513504162024L)
                           | var18 << a(24210, 1938847947064457924L)
                           | var18 << a(10142, 1762725774363542475L)
                           | var18;
                        if (var3 != null) {
                           break label57;
                        }
                     }

                     var29 = var14 >> a(11786, 4902382073065523803L) & a(23712, 4684922653428857075L);
                  }

                  int var24 = var29;
                  int var25 = var14 >> a(29196, 2000236595304011344L) & a(30155, 8970371347664179612L);
                  int var26 = var14 & a(30155, 8970371347664179612L);
                  int var27 = var13 >> a(11786, 4902382073065523803L) & a(30155, 8970371347664179612L);
                  int var19 = var13 >> a(29196, 2000236595304011344L) & a(30155, 8970371347664179612L);
                  int var20 = var13 & a(30155, 8970371347664179612L);
                  int var21 = (int)(255.0F * (1.0F - NM.k((float)var24 - var8, (float)var24 + var8, (float)var27)));
                  int var22 = (int)(255.0F * (1.0F - NM.k((float)var25 - var8, (float)var25 + var8, (float)var19)));
                  int var23 = (int)(255.0F * (1.0F - NM.k((float)var26 - var8, (float)var26 + var8, (float)var20)));
                  var9[var12] = var14 & a(13110, 1326393641486899044L)
                     | var21 << a(11786, 4902382073065523803L)
                     | var22 << a(29196, 2000236595304011344L)
                     | var23;
               }

               var12++;
               if (var3 == null) {
                  break;
               }
            }

            this.E(var2, 0, var11, var4, 1, var9);
            var11++;
            if (var3 == null) {
               return var2;
            }
            continue label65;
         }

         return var2;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25684;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "o>&(l\u0010~\u0013\u0002>(c\u001etR/qj+".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 36;
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
         var10007 = 36;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 24;
               break;
            case 1:
               var50 = 110;
               break;
            case 2:
               var50 = 123;
               break;
            case 3:
               var50 = 96;
               break;
            case 4:
               var50 = 33;
               break;
            case 5:
               var50 = 78;
               break;
            default:
               var50 = 63;
         }
      } else {
         var34 = 36;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 380387870754734014L;
            long[] var14 = new long[9];
            int var11 = 0;
            String var12 = "\u00ad\u001b\rkïqßVªÑÇ\u0013hn¼}E\u009dâã¿vEjV£\u0080õyînÝ@îo\u0017¦z³\u0005\u0017¯z.Kcµõ\u0012_Ñ\u0018\u007f\u001a(Ú";
            int var13 = "\u00ad\u001b\rkïqßVªÑÇ\u0013hn¼}E\u009dâã¿vEjV£\u0080õyînÝ@îo\u0017¦z³\u0005\u0017¯z.Kcµõ\u0012_Ñ\u0018\u007f\u001a(Ú".length();
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

                        var12 = "\u009d4\tn\u0014ýG²x78]8æéæ";
                        var13 = "\u009d4\tn\u0014ýG²x78]8æéæ".length();
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
         var10007 = 36;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 24;
               break;
            case 1:
               var50 = 110;
               break;
            case 2:
               var50 = 123;
               break;
            case 3:
               var50 = 96;
               break;
            case 4:
               var50 = 33;
               break;
            case 5:
               var50 = 78;
               break;
            default:
               var50 = 63;
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
                  var50 = 24;
                  break;
               case 1:
                  var50 = 110;
                  break;
               case 2:
                  var50 = 123;
                  break;
               case 3:
                  var50 = 96;
                  break;
               case 4:
                  var50 = 33;
                  break;
               case 5:
                  var50 = 78;
                  break;
               default:
                  var50 = 63;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 380387870754734014L;
               long[] var6 = new long[9];
               int var3 = 0;
               String var4 = "\u00ad\u001b\rkïqßVªÑÇ\u0013hn¼}E\u009dâã¿vEjV£\u0080õyînÝ@îo\u0017¦z³\u0005\u0017¯z.Kcµõ\u0012_Ñ\u0018\u007f\u001a(Ú";
               int var5 = "\u00ad\u001b\rkïqßVªÑÇ\u0013hn¼}E\u009dâã¿vEjV£\u0080õyînÝ@îo\u0017¦z³\u0005\u0017¯z.Kcµõ\u0012_Ñ\u0018\u007f\u001a(Ú".length();
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

                           var4 = "\u009d4\tn\u0014ýG²x78]8æéæ";
                           var5 = "\u009d4\tn\u0014ýG²x78]8æéæ".length();
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
                  var50 = 24;
                  break;
               case 1:
                  var50 = 110;
                  break;
               case 2:
                  var50 = 123;
                  break;
               case 3:
                  var50 = 96;
                  break;
               case 4:
                  var50 = 33;
                  break;
               case 5:
                  var50 = 78;
                  break;
               default:
                  var50 = 63;
            }
         }
      }
   }
}





