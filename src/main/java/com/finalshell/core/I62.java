package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import javax.swing.JComponent;
import javax.swing.JSeparator;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSeparatorUI;

public class I62 extends BasicSeparatorUI {
   public static float[] o;
   public Color R = UA.j;
   public Color L = UA.v;
   public Color P = UA.p;
   public Color g = UA.d;
   public boolean A = UA.m;
   public boolean B = UA.J;
   public boolean W = UA.Y;
   public Insets K = UA.X;
   public JSeparator z;
   public static String a;

   public static ComponentUI createUI(JComponent var0) {
      return new I62();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.z = (JSeparator)var1;
      FN.Y(this.z);
      LookAndFeel.installProperty(this.z, a, Boolean.FALSE);
      this.M();
   }

   @Override
   public void uninstallUI(JComponent var1) {
      this.z = null;
      super.uninstallUI(var1);
   }

   public void M() {
      String var1 = CH3_2.B();
      JSeparator var10000 = this.z;
      if (var1 != null) {
         if (this.z == null) {
            return;
         }

         var10000 = this.z;
      }

      boolean var4 = FN.l((JComponent)var10000);
      if (var1 != null) {
         if (var4) {
            return;
         }

         var4 = this.z.getComponentOrientation().isLeftToRight();
      }

      boolean var2 = var4;
      Insets var3 = new Insets(this.K.top, var2 ? this.K.left : this.K.right, this.K.bottom, var2 ? this.K.right : this.K.left);
      this.z.setBorder(GA.y(var3));
   }

   public Color K() {
      return this.g;
   }

   public void p(Color var1) {
      this.g = var1;
   }

   public Color A() {
      return this.P;
   }

   public void k(Color var1) {
      this.P = var1;
   }

   public Color o() {
      return this.L;
   }

   public void m(Color var1) {
      this.L = var1;
   }

   public Color P() {
      return this.R;
   }

   public void y(Color var1) {
      this.R = var1;
   }

   public boolean X() {
      return this.A;
   }

   public void Z(boolean var1) {
      this.A = var1;
   }

   public boolean e() {
      return this.B;
   }

   public void m(boolean var1) {
      this.B = var1;
   }

   public boolean F() {
      return this.W;
   }

   public void r(boolean var1) {
      this.W = var1;
   }

   public Insets Z() {
      return this.K;
   }

   public void l(Insets var1) {
      this.K = var1;
      this.M();
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      String var3;
      Graphics2D var4;
      Object var5;
      JSeparator var6;
      int var8;
      int var9;
      int var10;
      int var11;
      byte var13;
      var4 = (Graphics2D)var1;
      String var10000 = CH3_2.B();
      var5 = RV.X(var4);
      var6 = (JSeparator)var2;
      Insets var7 = var2.getInsets();
      var8 = var7.left;
      var9 = var7.top;
      var10 = var2.getWidth() - var7.left - var7.right;
      var11 = var2.getHeight() - var7.top - var7.bottom;
      var3 = var10000;
      var13 = (this.B) ? 1 : 0;
      label153:
      if (var3 != null) {
         if (!this.B) {
            var13 = (this.W) ? 1 : 0;
            if (var3 == null) {
               break label153;
            }

            if (!this.W) {
               var13 = 0;
               break label153;
            }
         }

         var13 = 1;
      }

      label156: {
         byte var12 = (byte)var13;
         var13 = var6.getOrientation();
         if (var3 != null) {
            if (var13 == 1) {
               var13 = var11;
               if (var3 != null) {
                  if (var11 <= 0) {
                     break label156;
                  }

                  var13 = var12;
               }

               label158: {
                  if (var3 != null) {
                     if (var13 == 0) {
                        break label158;
                     }

                     var4.setPaint(new LinearGradientPaint((float)var8, (float)var9, (float)var8, (float)(var9 + var11), o, this.h()));
                     var13 = (this.B) ? 1 : 0;
                  }

                  if (var3 != null) {
                     if (var13 != 0) {
                        var4.drawLine(var8, var9, var8, var9 + var11);
                     }

                     var13 = (this.W) ? 1 : 0;
                  }

                  if (var13 != 0) {
                     int var10002 = (this.B) ? 1 : 0;
                     if (var3 != null) {
                        var10002 = this.B ? 2 : 1;
                     }

                     int var10001 = var8 + var10002;
                     int var10004 = (this.B) ? 1 : 0;
                     if (var3 != null) {
                        var10004 = this.B ? 2 : 1;
                     }

                     var4.drawLine(var10001, var9, var8 + var10004, var9 + var11);
                  }
               }

               var4.setPaint(new LinearGradientPaint((float)var8, (float)var9, (float)var8, (float)(var9 + var11), o, this.O()));
               int var17 = (this.B) ? 1 : 0;
               if (var3 != null) {
                  var17 = this.B ? 1 : 0;
               }

               int var16 = var8 + var17;
               int var23 = (this.B) ? 1 : 0;
               if (var3 != null) {
                  var23 = this.B ? 1 : 0;
               }

               var4.drawLine(var16, var9, var8 + var23, var9 + var11);
               if (var3 != null) {
                  break label156;
               }

               Ky4.K(new String[5]);
            }

            var13 = var10;
         }

         if (var3 != null) {
            if (var13 <= 0) {
               break label156;
            }

            var13 = var12;
         }

         label160: {
            if (var3 != null) {
               if (var13 == 0) {
                  break label160;
               }

               var4.setPaint(new LinearGradientPaint((float)var8, (float)var9, (float)(var8 + var10), (float)var9, o, this.h()));
               var13 = (this.B) ? 1 : 0;
            }

            if (var3 != null) {
               if (var13 != 0) {
                  var4.drawLine(var8, var9, var8 + var10, var9);
               }

               var13 = (this.W) ? 1 : 0;
            }

            if (var13 != 0) {
               int var10003 = (this.B) ? 1 : 0;
               if (var3 != null) {
                  var10003 = this.B ? 2 : 1;
               }

               int var18 = var9 + var10003;
               var10003 = var8 + var10;
               int var10005 = (this.B) ? 1 : 0;
               if (var3 != null) {
                  var10005 = this.B ? 2 : 1;
               }

               var4.drawLine(var8, var18, var10003, var9 + var10005);
            }
         }

         var4.setPaint(new LinearGradientPaint((float)var8, (float)var9, (float)(var8 + var10), (float)var9, o, this.O()));
         int var21 = (this.B) ? 1 : 0;
         if (var3 != null) {
            var21 = this.B ? 1 : 0;
         }

         int var19 = var9 + var21;
         var21 = var8 + var10;
         int var24 = (this.B) ? 1 : 0;
         if (var3 != null) {
            var24 = this.B ? 1 : 0;
         }

         var4.drawLine(var8, var19, var21, var9 + var24);
      }

      RV.X(var4, var5);
   }

   public Color[] h() {
      String var1 = CH3_2.B();
      byte var10000 = (this.A) ? 1 : 0;
      if (var1 != null) {
         if (this.A) {
            return new Color[]{this.P, this.g, this.P};
         }

         var10000 = 3;
      }

      Color[] var2 = new Color[var10000];
      var2[0] = this.R;
      var2[1] = Color.WHITE;
      var2[2] = this.R;
      return var2;
   }

   public Color[] O() {
      String var1 = CH3_2.B();
      byte var10000 = (this.A) ? 1 : 0;
      if (var1 != null) {
         if (this.A) {
            return new Color[]{this.R, Color.WHITE, this.R};
         }

         var10000 = 3;
      }

      Color[] var2 = new Color[var10000];
      var2[0] = this.P;
      var2[1] = this.g;
      var2[2] = this.P;
      return var2;
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      String var10000 = CH3_2.B();
      Insets var3 = var1.getInsets();
      String var2 = var10000;
      int var10001 = (this.B) ? 1 : 0;
      if (var2 != null) {
         var10001 = this.B ? 1 : 0;
      }

      int var5 = 1 + var10001;
      var10001 = (this.W) ? 1 : 0;
      if (var2 != null) {
         var10001 = this.W ? 1 : 0;
      }

      int var4 = var5 + var10001;
      if (((JSeparator)var1).getOrientation() == 1) {
         return new Dimension(var3.left + var4 + var3.right, var3.top + var3.bottom);
      } else {
         Dimension var6 = new Dimension(var3.left + var3.right, var3.top + var4 + var3.bottom);
         if (Ky4.F$arrString() != null) {
            CH3_2.n("JsDttb");
         }

         return var6;
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "n\u0007\u0016#C\u0006".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 51;
      char[] var10002 = var10003;
      int var1 = var10004;
      char[] var10;
      byte var14;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var10 = var10003;
         var10005 = var0;
         char var10008 = var10003[var0];
         var10007 = 51;
         var10006 = var10008;
         switch (var0 % 7) {
            case 0:
               var14 = 50;
               break;
            case 1:
               var14 = 68;
               break;
            case 2:
               var14 = 68;
               break;
            case 3:
               var14 = 97;
               break;
            case 4:
               var14 = 5;
               break;
            case 5:
               var14 = 80;
               break;
            default:
               var14 = 71;
         }
      } else {
         var6 = 51;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            o = new float[]{0.0F, 0.5F, 1.0F};
            return;
         }

         var10 = var10003;
         var10005 = var0;
         char var15 = var10003[var0];
         var10007 = 51;
         var10006 = var15;
         switch (var0 % 7) {
            case 0:
               var14 = 50;
               break;
            case 1:
               var14 = 68;
               break;
            case 2:
               var14 = 68;
               break;
            case 3:
               var14 = 97;
               break;
            case 4:
               var14 = 5;
               break;
            case 5:
               var14 = 80;
               break;
            default:
               var14 = 71;
         }
      }

      while (true) {
         var10[var10005] = (char)(var10006 ^ var10007 ^ var14);
         var0++;
         if (var6 == 0) {
            var10 = var10002;
            var10005 = var6;
            char var17 = var10002[var6];
            var10007 = var6;
            var10006 = var17;
            switch (var0 % 7) {
               case 0:
                  var14 = 50;
                  break;
               case 1:
                  var14 = 68;
                  break;
               case 2:
                  var14 = 68;
                  break;
               case 3:
                  var14 = 97;
                  break;
               case 4:
                  var14 = 5;
                  break;
               case 5:
                  var14 = 80;
                  break;
               default:
                  var14 = 71;
            }
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               o = new float[]{0.0F, 0.5F, 1.0F};
               return;
            }

            var10 = var10002;
            var10005 = var0;
            char var16 = var10002[var0];
            var10007 = var6;
            var10006 = var16;
            switch (var0 % 7) {
               case 0:
                  var14 = 50;
                  break;
               case 1:
                  var14 = 68;
                  break;
               case 2:
                  var14 = 68;
                  break;
               case 3:
                  var14 = 97;
                  break;
               case 4:
                  var14 = 5;
                  break;
               case 5:
                  var14 = 80;
                  break;
               default:
                  var14 = 71;
            }
         }
      }
   }
}





