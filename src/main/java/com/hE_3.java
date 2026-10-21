package com;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class hE_3 extends com.W5 {
   private float m = 0.0F;
   private float M = 0.0F;
   private float A = 0.0F;
   private BufferedImage D;
   private BufferedImage C;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public void Z(float var1) {
      this.m = var1;
   }

   public float H() {
      return this.m;
   }

   public void c(float var1) {
      this.M = var1;
   }

   public float z() {
      return this.M;
   }

   public void G(float var1) {
      this.A = var1;
   }

   public float o() {
      return this.A;
   }

   public void k(BufferedImage var1) {
      this.D = var1;
   }

   public BufferedImage d() {
      return this.D;
   }

   public void o(BufferedImage var1) {
      this.C = var1;
   }

   public BufferedImage L() {
      return this.C;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var10000 = com.W5.q();
      int var6 = var1.getType();
      String[] var3 = var10000;
      WritableRaster var7 = var1.getRaster();
      BufferedImage var25 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var25 = var2;
      }

      WritableRaster var8 = var25.getRaster();
      BufferedImage var26 = this.D;
      if (var3 != null) {
         if (this.D != null) {
            if (var3 == null) {
               return this.C;
            }

            if (this.C != null) {
               float[] var9 = null;
               float[] var10 = null;
               int[] var11 = null;
               int[] var12 = null;
               int[] var13 = null;
               int var14 = 0;

               label68:
               do {
                  int var27 = var14;

                  label65:
                  while (true) {
                     if (var27 >= var5) {
                        break label68;
                     }

                     var11 = this.l(var1, 0, var14, var4, 1, var11);
                     var12 = this.l(this.D, 0, var14, var4, 1, var12);
                     var13 = this.l(this.C, 0, var14, var4, 1, var13);
                     int var15 = 0;

                     while (true) {
                        if (var15 >= var4) {
                           break label65;
                        }

                        int var16 = var11[var15];
                        int var17 = var12[var15];
                        int var18 = var13[var15];
                        int var19 = var16 >> a(23766, 6947776715660042752L) & a(31667, 5575146098554602850L);
                        int var20 = var16 >> a(19221, 4026630262429824449L) & a(25916, 4567500073241156587L);
                        int var21 = var16 & a(25916, 4567500073241156587L);
                        int var22 = var18 >> a(24993, 3377448795704696692L) & a(25916, 4567500073241156587L);
                        int var23 = var18 >> a(15252, 413527745253688644L) & a(25916, 4567500073241156587L);
                        int var24 = var18 & a(25916, 4567500073241156587L);
                        var9 = Color.RGBtoHSB(var19, var21, var20, var9);
                        var10 = Color.RGBtoHSB(var22, var24, var23, var10);
                        float var28;
                        var27 = (var28 = Math.abs(var9[0] - var10[0]) - this.m) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
                        if (var3 == null) {
                           break;
                        }

                        label60: {
                           label81: {
                              if (var3 != null) {
                                 if (var27 >= 0) {
                                    break label81;
                                 }

                                 float var29;
                                 var27 = (var29 = Math.abs(var9[1] - var10[1]) - this.M) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                              }

                              if (var3 != null) {
                                 if (var27 >= 0) {
                                    break label81;
                                 }

                                 float var30;
                                 var27 = (var30 = Math.abs(var9[2] - var10[2]) - this.A) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                              }

                              if (var27 < 0) {
                                 var11[var15] = var17;
                                 if (var3 != null) {
                                    break label60;
                                 }
                              }
                           }

                           var11[var15] = var16;
                        }

                        var15++;
                        if (var3 == null) {
                           break label65;
                        }
                     }
                  }

                  this.E(var2, 0, var14, var4, 1, var11);
                  var14++;
               } while (var3 != null);
            }
         }

         var26 = var2;
      }

      return var26;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Ccc\u0016  \u000eCccQ`i".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 116;
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
         var10007 = 116;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 124;
               break;
            case 1:
               var50 = 114;
               break;
            case 2:
               var50 = 110;
               break;
            case 3:
               var50 = 11;
               break;
            case 4:
               var50 = 58;
               break;
            case 5:
               var50 = 51;
               break;
            default:
               var50 = 85;
         }
      } else {
         var34 = 116;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 1616851054770137083L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "bªFÒ\u0007½\u00922\nà51ÅF¸\u009f\u008e=\u0080âmï\u0085ë3¡&/7V<ï";
            int var13 = "bªFÒ\u0007½\u00922\nà51ÅF¸\u009f\u008e=\u0080âmï\u0085ë3¡&/7V<ï".length();
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
                           b = var14;
                           c = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\nQí$Þ×b·9ª½%Q\n¢f";
                        var13 = "\nQí$Þ×b·9ª½%Q\n¢f".length();
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
         var10007 = 116;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 124;
               break;
            case 1:
               var50 = 114;
               break;
            case 2:
               var50 = 110;
               break;
            case 3:
               var50 = 11;
               break;
            case 4:
               var50 = 58;
               break;
            case 5:
               var50 = 51;
               break;
            default:
               var50 = 85;
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
                  var50 = 124;
                  break;
               case 1:
                  var50 = 114;
                  break;
               case 2:
                  var50 = 110;
                  break;
               case 3:
                  var50 = 11;
                  break;
               case 4:
                  var50 = 58;
                  break;
               case 5:
                  var50 = 51;
                  break;
               default:
                  var50 = 85;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 1616851054770137083L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "bªFÒ\u0007½\u00922\nà51ÅF¸\u009f\u008e=\u0080âmï\u0085ë3¡&/7V<ï";
               int var5 = "bªFÒ\u0007½\u00922\nà51ÅF¸\u009f\u008e=\u0080âmï\u0085ë3¡&/7V<ï".length();
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
                              b = var6;
                              c = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\nQí$Þ×b·9ª½%Q\n¢f";
                           var5 = "\nQí$Þ×b·9ª½%Q\n¢f".length();
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
                  var50 = 124;
                  break;
               case 1:
                  var50 = 114;
                  break;
               case 2:
                  var50 = 110;
                  break;
               case 3:
                  var50 = 11;
                  break;
               case 4:
                  var50 = 58;
                  break;
               case 5:
                  var50 = 51;
                  break;
               default:
                  var50 = 85;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32468;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





