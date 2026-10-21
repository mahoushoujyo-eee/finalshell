package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.util.Random;

public class OF implements BufferedImageOp {
   public int q;
   public float s;
   public int V;
   public float d;
   public boolean B;
   public Random Q;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public OF() {
      this.q = a(11108, 8062068760310903738L);
      this.s = 0.1F;
      this.V = a(20811, 2550057929864448401L);
      this.d = 0.1F;
      this.B = true;
   }

   public OF(int var1, int var2, float var3, boolean var4, float var5) {
      this.q = a(30458, 4213878204696014381L);
      this.s = 0.1F;
      this.V = a(4870, 3760277228557585370L);
      this.d = 0.1F;
      this.B = true;
      this.V = var1;
      this.q = var2;
      this.s = var3;
      this.B = var4;
      this.d = var5;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label74: {
         String[] var10000 = W5.q();
         var4 = var1.getWidth();
         var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var19 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label74;
            }

            var19 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var19;
      }

      int[] var6 = new int[var4];
      int[] var7 = new int[var4];
      this.Q = new Random(0L);
      int var8 = this.V & a(3047, 2716558168939025214L);
      int var9 = this.V >> a(520, 7507736644711701200L) & a(13385, 8975703616381185178L);
      int var10 = this.V >> a(2009, 1108329953893637897L) & a(13385, 8975703616381185178L);
      int var11 = this.V & a(13385, 8975703616381185178L);
      int var12 = 0;

      while (var12 < var5) {
         int var13 = 0;

         label64: {
            OF var21;
            label78: {
               while (true) {
                  if (var13 < var4) {
                     int var14 = var9;
                     int var15 = var10;
                     int var16 = var11;
                     float var22;
                     var20 = (var22 = this.d - 0.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
                     if (var3 == null) {
                        break;
                     }

                     if (var3 != null) {
                        if (var20 != 0) {
                           int var17 = (int)((double)(255.0F * this.d) * Math.sin((double)var13 / (double)var4 * Math.PI));
                           var14 = var9 + var17;
                           var15 = var10 + var17;
                           var16 = var11 + var17;
                        }

                        var20 = this.B;
                     }

                     label57: {
                        label56: {
                           if (var3 != null) {
                              if (var20 == 0) {
                                 break label56;
                              }

                              var20 = (int)(255.0F * (2.0F * this.Q.nextFloat() - 1.0F) * this.s);
                           }

                           int var18 = var20;
                           var6[var13] = var8
                              | F(var14 + var18) << a(520, 7507736644711701200L)
                              | F(var15 + var18) << a(2009, 1108329953893637897L)
                              | F(var16 + var18);
                           if (var3 != null) {
                              break label57;
                           }
                        }

                        var6[var13] = var8 | this.q(var14) << a(520, 7507736644711701200L) | this.q(var15) << a(2009, 1108329953893637897L) | this.q(var16);
                     }

                     var13++;
                     if (var3 != null) {
                        continue;
                     }
                  }

                  var21 = this;
                  if (var3 == null) {
                     break label78;
                  }

                  var20 = this.q;
                  break;
               }

               if (var20 != 0) {
                  this.x(var6, var7, var4, this.q);
                  this.i(var2, 0, var12, var4, 1, var7);
                  if (var3 != null) {
                     break label64;
                  }
               }

               var21 = this;
            }

            var21.i(var2, 0, var12, var4, 1, var6);
         }

         var12++;
         if (var3 == null) {
            break;
         }
      }

      return var2;
   }

   public int q(int var1) {
      String[] var10000 = W5.q();
      var1 += (int)(255.0F * (2.0F * this.Q.nextFloat() - 1.0F) * this.s);
      String[] var2 = var10000;
      int var4 = var1;
      if (var2 != null) {
         if (var1 < 0) {
            var1 = 0;
            if (var2 != null) {
               return var1;
            }
         }

         var4 = var1;
      }

      if (var2 == null) {
         return var4;
      } else {
         if (var4 > a(13385, 8975703616381185178L)) {
            var1 = a(13385, 8975703616381185178L);
         }

         return var1;
      }
   }

   public static int F(int var0) {
      String[] var1 = W5.q();
      int var10000 = var0;
      if (var1 != null) {
         if (var0 < 0) {
            return 0;
         }

         var10000 = var0;
      }

      if (var1 != null) {
         if (var10000 > a(10251, 1616265014320034006L)) {
            return a(13385, 8975703616381185178L);
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static int Z(int var0, int var1) {
      String[] var10000 = W5.q();
      int var3 = var0 / var1;
      var0 -= var3 * var1;
      String[] var2 = var10000;
      int var5 = var0;
      if (var2 != null) {
         if (var0 < 0) {
            return var0 + var1;
         }

         var5 = var0;
      }

      return var5;
   }

   public void x(int[] var1, int[] var2, int var3, int var4) {
      int var6 = var3 - 1;
      int var7 = 2 * var4 + 1;
      int var8 = 0;
      String[] var10000 = W5.q();
      int var9 = 0;
      int var10 = 0;
      String[] var5 = var10000;
      int var11 = -var4;

      while (true) {
         if (var11 <= var4) {
            int var12 = var1[Z(var11, var3)];
            var8 += var12 >> a(6147, 577321471942115542L) & a(13385, 8975703616381185178L);
            var9 += var12 >> a(26997, 5502806207249297838L) & a(13385, 8975703616381185178L);
            var10 += var12 & a(13385, 8975703616381185178L);
            var11++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var11 = 0;
         break;
      }

      while (var11 < var3) {
         var2[var11] = a(4274, 1359235912595327085L)
            | var8 / var7 << a(520, 7507736644711701200L)
            | var9 / var7 << a(2009, 1108329953893637897L)
            | var10 / var7;
         int var16 = var11 + var4 + 1;
         int var17 = var16;
         int var10001 = var6;
         if (var5 != null) {
            if (var16 > var6) {
               var16 = Z(var16, var3);
            }

            var17 = var11;
            var10001 = var4;
         }

         int var13 = var17 - var10001;
         int var18 = var13;
         if (var5 != null) {
            if (var13 < 0) {
               var13 = Z(var13, var3);
            }

            var18 = var1[var16];
         }

         int var14 = var18;
         int var15 = var1[var13];
         var8 += (var14 & a(16315, 3162184961879074666L)) - (var15 & a(14741, 8275841466750099783L)) >> a(520, 7507736644711701200L);
         var9 += (var14 & a(27292, 4111590755798823498L)) - (var15 & a(22217, 4739240070739365405L)) >> a(2009, 1108329953893637897L);
         var10 += (var14 & a(13385, 8975703616381185178L)) - (var15 & a(13385, 8975703616381185178L));
         var11++;
         if (var5 == null) {
            break;
         }
      }
   }

   public void j(int var1) {
      this.q = var1;
   }

   public int v() {
      return this.q;
   }

   public void K(float var1) {
      this.s = var1;
   }

   public float Q() {
      return this.s;
   }

   public void o(float var1) {
      this.d = var1;
   }

   public float P() {
      return this.d;
   }

   public void C(int var1) {
      this.V = var1;
   }

   public int e() {
      return this.V;
   }

   public void W(boolean var1) {
      this.B = var1;
   }

   public boolean g() {
      return this.B;
   }

   @Override
   public BufferedImage createCompatibleDestImage(BufferedImage var1, ColorModel var2) {
      String[] var3 = W5.q();
      ColorModel var10000 = var2;
      if (var3 != null) {
         if (var2 != null) {
            return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), null);
         }

         var10000 = var1.getColorModel();
      }

      var2 = var10000;
      return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), null);
   }

   @Override
   public Rectangle2D getBounds2D(BufferedImage var1) {
      return new Rectangle(0, 0, var1.getWidth(), var1.getHeight());
   }

   @Override
   public Point2D getPoint2D(Point2D var1, Point2D var2) {
      String[] var3 = W5.q();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = new Double();
         }

         var2.setLocation(var1.getX(), var1.getY());
         var10000 = var2;
      }

      return (Point2D)var10000;
   }

   @Override
   public RenderingHints getRenderingHints() {
      return null;
   }

   public void i(BufferedImage var1, int var2, int var3, int var4, int var5, int[] var6) {
      label18: {
         String[] var10000 = W5.q();
         int var8 = var1.getType();
         String[] var7 = var10000;
         if (var7 != null) {
            if (var8 != 2 && var8 != 1) {
               break label18;
            }

            var1.getRaster().setDataElements(var2, var3, var4, var5, var6);
         }

         if (var7 != null) {
            return;
         }
      }

      var1.setRGB(var2, var3, var4, var5, var6, 0, var4);
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22748;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = ";\rc\u0001/\"8@*i\u0000)88\u000bHV\u0010.11AF5".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 62;
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
         var10007 = 62;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 81;
               break;
            case 1:
               var50 = 86;
               break;
            case 2:
               var50 = 37;
               break;
            case 3:
               var50 = 75;
               break;
            case 4:
               var50 = 100;
               break;
            case 5:
               var50 = 110;
               break;
            default:
               var50 = 99;
         }
      } else {
         var34 = 62;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 6431050069362540119L;
            long[] var14 = new long[16];
            int var11 = 0;
            String var12 = "¾\u009c8#\u008b¸=\u0005Ý`NÙ\u009cu\u000e~³\u0007o* \u0000\rç~\nàØ\u0092(6:åÑp-Z#¤\u0097=\u0000(\\\u0005Q-i÷D\u0081çÐ¯\u007fNAb¶í'òOñµ\u0007r$\u001c\u00ad\u008fJ©§x\u0000íJ>\u0091c{`§\u001813\u001dáÈ\u0093þ¨°PpÚê¨«\u008eÛ¡V\fó/Ø\u0003\u0007\u0099=";
            int var13 = "¾\u009c8#\u008b¸=\u0005Ý`NÙ\u009cu\u000e~³\u0007o* \u0000\rç~\nàØ\u0092(6:åÑp-Z#¤\u0097=\u0000(\\\u0005Q-i÷D\u0081çÐ¯\u007fNAb¶í'òOñµ\u0007r$\u001c\u00ad\u008fJ©§x\u0000íJ>\u0091c{`§\u001813\u001dáÈ\u0093þ¨°PpÚê¨«\u008eÛ¡V\fó/Ø\u0003\u0007\u0099="
               .length();
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
                           c = new Integer[16];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "¼¢¨÷~ó\u009f\u0010·Ê\u009e¼:\u008c\u00122";
                        var13 = "¼¢¨÷~ó\u009f\u0010·Ê\u009e¼:\u008c\u00122".length();
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
         var10007 = 62;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 81;
               break;
            case 1:
               var50 = 86;
               break;
            case 2:
               var50 = 37;
               break;
            case 3:
               var50 = 75;
               break;
            case 4:
               var50 = 100;
               break;
            case 5:
               var50 = 110;
               break;
            default:
               var50 = 99;
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
                  var50 = 81;
                  break;
               case 1:
                  var50 = 86;
                  break;
               case 2:
                  var50 = 37;
                  break;
               case 3:
                  var50 = 75;
                  break;
               case 4:
                  var50 = 100;
                  break;
               case 5:
                  var50 = 110;
                  break;
               default:
                  var50 = 99;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 6431050069362540119L;
               long[] var6 = new long[16];
               int var3 = 0;
               String var4 = "¾\u009c8#\u008b¸=\u0005Ý`NÙ\u009cu\u000e~³\u0007o* \u0000\rç~\nàØ\u0092(6:åÑp-Z#¤\u0097=\u0000(\\\u0005Q-i÷D\u0081çÐ¯\u007fNAb¶í'òOñµ\u0007r$\u001c\u00ad\u008fJ©§x\u0000íJ>\u0091c{`§\u001813\u001dáÈ\u0093þ¨°PpÚê¨«\u008eÛ¡V\fó/Ø\u0003\u0007\u0099=";
               int var5 = "¾\u009c8#\u008b¸=\u0005Ý`NÙ\u009cu\u000e~³\u0007o* \u0000\rç~\nàØ\u0092(6:åÑp-Z#¤\u0097=\u0000(\\\u0005Q-i÷D\u0081çÐ¯\u007fNAb¶í'òOñµ\u0007r$\u001c\u00ad\u008fJ©§x\u0000íJ>\u0091c{`§\u001813\u001dáÈ\u0093þ¨°PpÚê¨«\u008eÛ¡V\fó/Ø\u0003\u0007\u0099="
                  .length();
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
                              c = new Integer[16];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "¼¢¨÷~ó\u009f\u0010·Ê\u009e¼:\u008c\u00122";
                           var5 = "¼¢¨÷~ó\u009f\u0010·Ê\u009e¼:\u008c\u00122".length();
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
                  var50 = 81;
                  break;
               case 1:
                  var50 = 86;
                  break;
               case 2:
                  var50 = 37;
                  break;
               case 3:
                  var50 = 75;
                  break;
               case 4:
                  var50 = 100;
                  break;
               case 5:
                  var50 = 110;
                  break;
               default:
                  var50 = 99;
            }
         }
      }
   }
}





