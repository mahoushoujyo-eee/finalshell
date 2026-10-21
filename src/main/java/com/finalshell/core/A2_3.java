package com.finalshell.core;

import com.finalshell.ui.model.Pt2;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D.Double;
import java.lang.ref.WeakReference;
import javax.swing.ImageIcon;

public class A2_3 extends As2 {
   public static float[] X;
   public static Color[] g;
   public static Color[] o;
   public WeakReference P;
   public int S;
   public int E;
   public static long[] c;
   public static Integer[] d;

   public A2_3(Ud2_2 var1) {
      Pt2.b();
      this.S = -1;
      this.E = -1;
      this.P = new WeakReference<>(var1);
      if (Ky4.F$arrString() != null) {
         Pt2.J(new Ky4[3]);
      }
   }

   @Override
   public void U(Pt2 var1) {
      Ky4[] var2;
      label47: {
         label48: {
            Ky4[] var10000 = Pt2.b();
            super.U(var1);
            var2 = var10000;
            int var3 = C_6.g[this.D.ordinal()];
            if (var2 == null) {
               switch (var3) {
                  case 1:
                     break label48;
                  case 2:
                     break label47;
                  case 3:
                     var3 = C_6.g[var1.ordinal()];
                     break;
                  default:
                     return;
               }
            }

            switch (var3) {
               case 1:
                  this.S = b(8230, 7287801976064954302L);
                  this.E = -1;
                  if (var2 == null) {
                     break;
                  }
               case 2:
                  this.S = b(18421, 2493599867170170977L);
                  this.E = -1;
            }

            if (var2 == null) {
               return;
            }
         }

         switch (C_6.g[var1.ordinal()]) {
            case 3:
               this.E = b(18421, 2493599867170170977L);
               this.S = -1;
               if (var2 == null) {
                  break;
               }
            case 2:
               this.E = b(18421, 2493599867170170977L);
               this.S = -1;
         }

         if (var2 == null) {
            return;
         }
      }

      switch (C_6.g[var1.ordinal()]) {
         case 3:
            this.E = -1;
            this.S = -1;
            if (var2 == null) {
               break;
            }
         case 1:
            this.E = -1;
            this.S = -1;
      }
   }

   @Override
   public void G$void() {
      Ky4[] var1;
      label47: {
         label48: {
            var1 = Pt2.b();
            int var10000 = C_6.g[this.D.ordinal()];
            if (var1 == null) {
               switch (var10000) {
                  case 1:
                     break label48;
                  case 2:
                     break label47;
                  case 3:
                     var10000 = C_6.g[this.A.ordinal()];
                     break;
                  default:
                     return;
               }
            }

            switch (var10000) {
               case 1:
                  this.S--;
                  this.E++;
                  if (var1 == null) {
                     break;
                  }
               case 2:
                  this.S--;
            }

            if (var1 == null) {
               return;
            }
         }

         switch (C_6.g[this.A.ordinal()]) {
            case 3:
               this.E--;
               this.S++;
               if (var1 == null) {
                  break;
               }
            case 2:
               this.E--;
         }

         if (var1 == null) {
            return;
         }
      }

      switch (C_6.g[this.A.ordinal()]) {
         case 3:
            this.S++;
            if (var1 == null) {
               break;
            }
         case 1:
            this.E++;
      }
   }

   @Override
   public void F() {
      label22: {
         Ky4[] var1;
         label21: {
            var1 = Pt2.b();
            if (var1 == null) {
               switch (C_6.g[this.D.ordinal()]) {
                  case 1:
                     break label21;
                  case 2:
                     break label22;
                  case 3:
                     this.S = b(18421, 2493599867170170977L);
                     this.E = -1;
                     break;
                  default:
                     return;
               }
            }

            if (var1 == null) {
               return;
            }
         }

         this.E = b(18421, 2493599867170170977L);
         this.S = -1;
         if (var1 == null) {
            return;
         }
      }

      this.S = -1;
      this.E = -1;
   }

   @Override
   public boolean B() {
      Ky4[] var1 = Pt2.b();
      int var10000 = C_6.g[this.D.ordinal()];
      if (var1 == null) {
         label119: {
            label107: {
               label94:
               switch (var10000) {
                  case 3:
                     var10000 = C_6.g[this.A.ordinal()];
                     if (var1 != null) {
                        break label107;
                     }

                     switch (var10000) {
                        case 1:
                           var10000 = this.E;
                           break label107;
                        case 2:
                           var10000 = this.S;
                           if (var1 == null) {
                              var10000 = this.S == -1 ? 1 : 0;
                           }

                           return var10000 != 0;
                        default:
                           if (var1 == null) {
                              break label119;
                           }
                     }
                  case 1:
                     var10000 = C_6.g[this.A.ordinal()];
                     if (var1 != null) {
                        break;
                     }

                     switch (var10000) {
                        case 2:
                           var10000 = this.E;
                           if (var1 == null) {
                              var10000 = this.E == -1 ? 1 : 0;
                           }

                           return var10000 != 0;
                        case 3:
                           var10000 = this.S;
                           break label94;
                        default:
                           if (var1 == null) {
                              break label119;
                           }
                     }
                  case 2:
                     var10000 = C_6.g[this.A.ordinal()];
                     if (var1 != null) {
                        return var10000 != 0;
                     }

                     switch (var10000) {
                        case 1:
                           var10000 = this.E;
                           if (var1 == null) {
                              var10000 = this.E == 3 ? 1 : 0;
                           }

                           return var10000 != 0;
                        case 3:
                           var10000 = this.S;
                           if (var1 == null) {
                              var10000 = this.S == 3 ? 1 : 0;
                           }

                           return var10000 != 0;
                     }
                  default:
                     break label119;
               }

               if (var1 == null) {
                  var10000 = var10000 == 3 ? 1 : 0;
               }

               return var10000 != 0;
            }

            if (var1 == null) {
               var10000 = var10000 == 3 ? 1 : 0;
            }

            return var10000 != 0;
         }

         var10000 = 1;
      }

      return var10000 != 0;
   }

   @Override
   public void O(Component var1, Graphics2D var2, int var3, int var4, int var5, int var6) {
      Ky4[] var10000 = Pt2.b();
      Ud2_2 var8 = (Ud2_2)this.P.get();
      Ky4[] var7 = var10000;
      if (var8 != null) {
         label41: {
            label45: {
               label46: {
                  var16 = this.E;
                  byte var10001 = -1;
                  if (var7 == null) {
                     if (this.E > -1) {
                        int var9 = 3 - this.E;
                        int var10 = var8.z() + 3;
                        Rectangle var11 = new Rectangle(var3 + var10, var4 + var10, var5 - var10 * 2, var6 - var10 * 2);
                        Double var12 = new Double(
                           (double)(var11.x + var9), (double)(var11.y + var9), (double)(var11.width - var9 * 2), (double)(var11.height - var9 * 2), 3.0, 3.0
                        );
                        Point var13 = Rv4.s(var11);
                        int var14 = Math.max(var11.width / 2, var11.height / 2);
                        var2.setPaint(new RadialGradientPaint(var13, (float)var14, X, var8.isEnabled() ? g : o));
                        var2.fill(var12);
                     }

                     var16 = this.S;
                     if (var7 != null) {
                        break label46;
                     }

                     var10001 = -1;
                  }

                  if (var16 <= var10001) {
                     return;
                  }

                  var10000 = this;
                  if (var7 != null) {
                     break label45;
                  }

                  var16 = this.h;
               }

               if (var16 != 0) {
                  var18 = (ImageIcon)J.get(this.S);
                  break label41;
               }

               var10000 = (Ky4[])O.get(this.S);
            }

            var18 = (ImageIcon)var10000;
         }

         ImageIcon var15 = var18;
         var2.drawImage(var15.getImage(), var3 + var5 / 2 - this.L() / 2, var4 + var6 / 2 - this.u() / 2, null);
      }
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28563;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6509197860810301621L;
      long[] var6 = new long[12];
      int var3 = 0;
      String var4 = " 7¥\u009bêÐâ?5\u0001YZ\u009fü\u0014\u009cW\tr?¦\u0011ÅÌ6>5d9=ü\u0084&ê²s\u0000\\ª©\"(5F\u000fOr¿g¹@X¼Õ\\\b\u000fF\u0084\u0092\u008c÷\b×\u0097,\u001d\u0093\u0017A\u0088E¥«\u0087a)ÓV,";
      int var5 = " 7¥\u009bêÐâ?5\u0001YZ\u009fü\u0014\u009cW\tr?¦\u0011ÅÌ6>5d9=ü\u0084&ê²s\u0000\\ª©\"(5F\u000fOr¿g¹@X¼Õ\\\b\u000fF\u0084\u0092\u008c÷\b×\u0097,\u001d\u0093\u0017A\u0088E¥«\u0087a)ÓV,"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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
                     c = var6;
                     d = new Integer[12];
                     X = new float[]{0.0F, 1.0F};
                     g = new Color[]{
                        new Color(b(13245, 1669189001668025389L), b(6465, 1791346165418555099L), b(18186, 5080263675727915153L)),
                        new Color(b(23436, 6696439491615831070L), b(15816, 5502386861443371614L), b(26087, 2280469981395683952L))
                     };
                     o = new Color[]{
                        new Color(b(11625, 2586923705519325946L), b(2712, 3639229686170871049L), b(2712, 3639229686170871049L)),
                        new Color(b(20712, 6906285494068199281L), b(5054, 4932887085335051307L), b(5054, 4932887085335051307L))
                     };
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0015v9\u0007M\n\u009fRG7\u008b\u0088réo\b";
                  var5 = "\u0015v9\u0007M\n\u009fRG7\u008b\u0088réo\b".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
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





