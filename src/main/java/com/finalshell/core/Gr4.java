package com.finalshell.core;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Gr4 extends W5 {
   public float Q = 5.0F;
   public float n = (float) (Math.PI * 3.0 / 2.0);
   public float I = 5.0F;
   public float N = 0.5F;
   public boolean T = false;
   public boolean h = false;
   public int l;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Gr4() {
      this.l = a(686, 6294110888374697702L);
   }

   public Gr4(float var1, float var2, float var3, float var4) {
      this.l = a(9744, 1085108922455939679L);
      this.Q = var1;
      this.n = (float)Math.atan2((double)var3, (double)var2);
      this.I = (float)Math.sqrt((double)(var2 * var2 + var3 * var3));
      this.N = var4;
   }

   public void E(float var1) {
      this.n = var1;
   }

   public float v() {
      return this.n;
   }

   public void b(float var1) {
      this.I = var1;
   }

   public float p() {
      return this.I;
   }

   public void D(float var1) {
      this.Q = var1;
   }

   public float W() {
      return this.Q;
   }

   public void W(float var1) {
      this.N = var1;
   }

   public float Y() {
      return this.N;
   }

   public void G(int var1) {
      this.l = var1;
   }

   public int r() {
      return this.l;
   }

   public void F(boolean var1) {
      this.T = var1;
   }

   public boolean M() {
      return this.T;
   }

   public void n(boolean var1) {
      this.h = var1;
   }

   public boolean y() {
      return this.h;
   }

   @Override
   public Rectangle2D getBounds2D(BufferedImage var1) {
      String[] var10000 = W5.q();
      Rectangle var3 = new Rectangle(0, 0, var1.getWidth(), var1.getHeight());
      String[] var2 = var10000;
      Gr4 var6 = this;
      if (var2 != null) {
         if (!this.T) {
            return var3;
         }

         var6 = this;
      }

      float var4 = var6.I * (float)Math.cos((double)this.n);
      float var5 = -this.I * (float)Math.sin((double)this.n);
      var3.width = var3.width + (int)(Math.abs(var4) + 2.0F * this.Q);
      var3.height = var3.height + (int)(Math.abs(var5) + 2.0F * this.Q);
      return var3;
   }

   @Override
   public Point2D getPoint2D(Point2D var1, Point2D var2) {
      String[] var3 = W5.q();
      if (var2 == null) {
         var2 = new Double();
      }

      label19: {
         Gr4 var10000 = this;
         if (var3 != null) {
            if (!this.T) {
               break label19;
            }

            var10000 = this;
         }

         float var4 = var10000.I * (float)Math.cos((double)this.n);
         float var5 = -this.I * (float)Math.sin((double)this.n);
         float var6 = Math.max(0.0F, this.Q - var5);
         float var7 = Math.max(0.0F, this.Q - var4);
         var2.setLocation(var1.getX() + (double)var7, var1.getY() + (double)var6);
         if (var3 != null) {
            return (Point2D)var2;
         }
      }

      var2.setLocation(var1.getX(), var1.getY());
      return (Point2D)var2;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      float var6;
      float var7;
      var4 = var1.getWidth();
      String[] var10000 = W5.q();
      var5 = var1.getHeight();
      var6 = this.I * (float)Math.cos((double)this.n);
      var7 = -this.I * (float)Math.sin((double)this.n);
      var3 = var10000;
      label35:
      if (var2 == null) {
         Gr4 var19 = this;
         if (var3 != null) {
            if (this.T) {
               ColorModel var8 = var1.getColorModel();
               var2 = new BufferedImage(
                  var8,
                  var8.createCompatibleWritableRaster(var1.getWidth() + (int)(Math.abs(var6) + this.Q), var1.getHeight() + (int)(Math.abs(var7) + this.Q)),
                  var8.isAlphaPremultiplied(),
                  null
               );
               if (var3 != null) {
                  break label35;
               }
            }

            var19 = this;
         }

         var2 = var19.createCompatibleDestImage(var1, null);
      }

      float var17 = (float)(this.l >> a(27712, 1418602864911192073L) & a(10126, 4182591457032362944L)) / 255.0F;
      float var9 = (float)(this.l >> a(3886, 219694530726523749L) & a(9853, 7951699471330433591L)) / 255.0F;
      float var10 = (float)(this.l & a(9853, 7951699471330433591L)) / 255.0F;
      float[][] var11 = new float[][]{{0.0F, 0.0F, 0.0F, var17}, {0.0F, 0.0F, 0.0F, var9}, {0.0F, 0.0F, 0.0F, var10}, {0.0F, 0.0F, 0.0F, this.N}};
      BufferedImage var12 = new BufferedImage(var4, var5, 2);
      new BandCombineOp(var11, null).filter(var1.getRaster(), var12.getRaster());
      var12 = new HX3(this.Q).filter(var12, null);
      Graphics2D var13 = var2.createGraphics();
      var13.setComposite(AlphaComposite.getInstance(3, this.N));
      boolean var20 = this.T;
      if (var3 != null) {
         if (this.T) {
            float var14 = this.Q / 2.0F;
            float var15 = Math.max(0.0F, this.Q - var7);
            float var16 = Math.max(0.0F, this.Q - var6);
            var13.translate((double)var16, (double)var15);
         }

         var13.drawRenderedImage(var12, AffineTransform.getTranslateInstance((double)var6, (double)var7));
         if (var3 == null) {
            return var2;
         }

         var20 = this.h;
      }

      if (!var20) {
         var13.setComposite(AlphaComposite.SrcOver);
         var13.drawRenderedImage(var1, null);
      }

      var13.dispose();
      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31819;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\n\u0014P\u0015vRZv$[\u0016o\bl1\u0001M\u0016h\u0006\u0011w".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 108;
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
         var10007 = 108;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 53;
               break;
            case 1:
               var50 = 12;
               break;
            case 2:
               var50 = 69;
               break;
            case 3:
               var50 = 21;
               break;
            case 4:
               var50 = 115;
               break;
            case 5:
               var50 = 68;
               break;
            default:
               var50 = 83;
         }
      } else {
         var34 = 108;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 1215951047850473071L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = ";K\u0090ÚàhÅ\u0002ÕÃ\u001at\u0012+ì§ª9\u009d%?\u0006&v\u0083 Q\u0014¾\u0019È\u0089";
            int var13 = ";K\u0090ÚàhÅ\u0002ÕÃ\u001at\u0012+ì§ª9\u009d%?\u0006&v\u0083 Q\u0014¾\u0019È\u0089".length();
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

                        var12 = "\u0095¿\u0017N9óì0AÈñZ\u000b\u009bmP";
                        var13 = "\u0095¿\u0017N9óì0AÈñZ\u000b\u009bmP".length();
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
         var10007 = 108;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 53;
               break;
            case 1:
               var50 = 12;
               break;
            case 2:
               var50 = 69;
               break;
            case 3:
               var50 = 21;
               break;
            case 4:
               var50 = 115;
               break;
            case 5:
               var50 = 68;
               break;
            default:
               var50 = 83;
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
                  var50 = 53;
                  break;
               case 1:
                  var50 = 12;
                  break;
               case 2:
                  var50 = 69;
                  break;
               case 3:
                  var50 = 21;
                  break;
               case 4:
                  var50 = 115;
                  break;
               case 5:
                  var50 = 68;
                  break;
               default:
                  var50 = 83;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 1215951047850473071L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = ";K\u0090ÚàhÅ\u0002ÕÃ\u001at\u0012+ì§ª9\u009d%?\u0006&v\u0083 Q\u0014¾\u0019È\u0089";
               int var5 = ";K\u0090ÚàhÅ\u0002ÕÃ\u001at\u0012+ì§ª9\u009d%?\u0006&v\u0083 Q\u0014¾\u0019È\u0089".length();
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

                           var4 = "\u0095¿\u0017N9óì0AÈñZ\u000b\u009bmP";
                           var5 = "\u0095¿\u0017N9óì0AÈñZ\u000b\u009bmP".length();
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
                  var50 = 53;
                  break;
               case 1:
                  var50 = 12;
                  break;
               case 2:
                  var50 = 69;
                  break;
               case 3:
                  var50 = 21;
                  break;
               case 4:
                  var50 = 115;
                  break;
               case 5:
                  var50 = 68;
                  break;
               default:
                  var50 = 83;
            }
         }
      }
   }
}





