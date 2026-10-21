package com.finalshell.core;

import com.finalshell.ui.model.BU;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Container;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D.Double;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JComponent;

public final class QC {
   public static float[] K;
   public static Color L;
   public static Color[] Y;
   public static Color[] x;
   public static Color[] w;
   public static float[] R;
   public static Color[] G;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static Insets S(JComponent var0) {
      int var9;
      label65: {
         label68: {
            String var10000 = com.finalshell.ui.panel.KE3.v();
            Container var4 = var0.getParent();
            String var1 = var10000;
            Container var8 = var4;
            if (var1 == null) {
               if (var4 == null) {
                  break label68;
               }

               var8 = var4;
            }

            var9 = (var8 instanceof com.finalshell.ui.panel.KE3) ? 1 : 0;
            if (var1 != null) {
               break label65;
            }

            if (var9 != 0) {
               var9 = (var0 instanceof ND) ? 1 : 0;
               if (var1 != null) {
                  break label65;
               }

               if (var9 != 0) {
                  com.finalshell.ui.panel.KE3 var5;
                  BU var6;
                  byte var7;
                  label54: {
                     var5 = (com.finalshell.ui.panel.KE3)var4;
                     var6 = BU.I(var0, var5);
                     var7 = (byte)((var6.equals(BU.none)) ? 1 : 0);
                     var9 = var7;
                     if (var1 == null) {
                        if (var7 != 0) {
                           var9 = 0;
                           break label54;
                        }

                        var9 = (var6.equals(BU.start)) ? 1 : 0;
                     }

                     if (var1 == null) {
                        var9 = var9 != 0 ? 0 : var5.j();
                     }
                  }

                  int var2;
                  label70: {
                     var2 = var9;
                     var9 = var7;
                     if (var1 == null) {
                        if (var7 != 0) {
                           var9 = 0;
                           break label70;
                        }

                        var9 = (var6.equals(BU.end)) ? 1 : 0;
                     }

                     if (var1 == null) {
                        if (var9 != 0) {
                           var9 = 0;
                           break label70;
                        }

                        var9 = var5.j();
                     }

                     var9 += var5.E();
                  }

                  int var3 = var9;
                  if (var1 == null) {
                     return new Insets(0, var2, 0, var3);
                  }
               }
            }
         }

         var9 = 0;
      }

      byte var13 = (byte)var9;
      byte var14 = 0;
      return new Insets(0, var13, 0, var14);
   }

   public static void q(Graphics2D var0, JComponent var1) {
      boolean var33;
      String var10000 = com.finalshell.ui.panel.KE3.v();
      Container var3 = var1.getParent();
      String var2 = var10000;
      Container var29 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var29 = var3;
      }

      label148: {
         boolean var30 = var29 instanceof com.finalshell.ui.panel.KE3;
         if (var2 == null) {
            if (!var30) {
               return;
            }

            var10000 = var1;
            if (var2 != null) {
               break label148;
            }

            var30 = var1 instanceof ND;
         }

         if (!var30) {
            return;
         }

         var10000 = (String)RV.X(var0);
      }

      Object var4;
      int var6;
      int var7;
      int var8;
      boolean var9;
      int var11;
      int var12;
      BU var13;
      byte var14;
      float var15;
      byte var16;
      boolean var17;
      label131: {
         var4 = var10000;
         com.finalshell.ui.panel.KE3 var5 = (com.finalshell.ui.panel.KE3)var3;
         var6 = var5.j();
         var7 = var5.E();
         var8 = var5.q();
         var9 = var5.z();
         ND var10 = (ND)var1;
         var11 = var1.getWidth();
         var12 = var1.getHeight();
         var13 = BU.I(var1, var5);
         var14 = (byte)((var10.D$boolean()) ? 1 : 0);
         var15 = var10.D$float();
         var16 = (byte)((var1.getComponentOrientation().isLeftToRight()) ? 1 : 0);
         boolean var32 = var1 instanceof AbstractButton;
         if (var2 == null) {
            if (var32) {
               AbstractButton var18 = (AbstractButton)var1;
               ButtonModel var19 = var18.getModel();
               var33 = var19.isPressed();
               label126:
               if (var2 == null) {
                  if (!var33) {
                     var33 = var19.isSelected();
                     if (var2 != null) {
                        break label126;
                     }

                     if (!var33) {
                        var33 = false;
                        break label126;
                     }
                  }

                  var33 = true;
               }

               var17 = var33;
               if (var2 == null) {
                  break label131;
               }
            }

            var32 = false;
         }

         var17 = var32;
      }

      Shape var24;
      label151: {
         label113: {
            var24 = (E(var1, var13, var11, var12, var6, var7, var8, var9, (boolean)var16)) != 0;
            boolean var34 = var13.equals(BU.end);
            if (var2 == null) {
               if (var34) {
                  break label113;
               }

               var34 = var13.equals(BU.none);
            }

            if (!var34) {
               Rectangle var20;
               Shape var25;
               label106: {
                  var25 = (d(var1, var11, var12, var6, var7, (boolean)var16)) != 0;
                  var20 = var25.getBounds();
                  boolean var35 = var1.isEnabled();
                  if (var2 == null) {
                     if (!var35) {
                        break label106;
                     }

                     var35 = var17;
                  }

                  if (!var35) {
                     var0.setPaint(new LinearGradientPaint(0.0F, (float)var20.y, 0.0F, (float)(var20.y + var20.height), R, G));
                     RV.y(var0, var25, OT3.Q, null, var7);
                  }
               }

               var0.setPaint((Paint)(var17 ? OT3.O : new GradientPaint(0.0F, 0.0F, OT3.c, 0.0F, (float)var1.getHeight(), OT3.T)));
               var0.fill(var24);
               var36 = var1.isEnabled();
               label98:
               if (var2 == null) {
                  if (var36) {
      boolean var36;
                     var36 = var17;
                     if (var2 != null) {
                        break label98;
                     }

                     if (var17) {
                        var0.setPaint(new LinearGradientPaint(0.0F, (float)var20.y, 0.0F, (float)(var20.y + var20.height), R, G));
                        RV.m(var0, var25, OT3.Q, null, var7, var25);
                     }
                  }

                  var36 = var1.isEnabled();
               }

               Color var21 = var36 ? OT3.g : OT3.e;
               Color var22 = P9.M(var21, a(1678, 6911805910693203078L));
               Color[] var23 = new Color[]{var22, var21, var21, var22};
               var0.setPaint(new LinearGradientPaint(0.0F, (float)var20.y, 0.0F, (float)(var20.y + var20.height), R, var23));
               var0.draw(var25);
               if (var2 == null) {
                  break label151;
               }
            }
         }

         var0.setPaint((Paint)(var17 ? OT3.O : new GradientPaint(0.0F, 0.0F, OT3.c, 0.0F, (float)var1.getHeight(), OT3.T)));
         var0.fill(var24);
      }

      label88: {
         int var37 = var14;
         if (var2 == null) {
            if (var14 == 0) {
               break label88;
            }

            float var38;
            var37 = (var38 = var15 - 0.0F) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
         }

         if (var37 > 0) {
            Shape var26 = v(var24, var15, (boolean)var16);
            Rectangle var27 = var26.getBounds();
            var0.setPaint(w(var1, var12));
            var0.fill(var26);
            Shape var28 = RV.n(var0, var24);
            var0.setPaint(j(var12));
            int var10001 = var16;
            if (var2 == null) {
               var10001 = var16 != 0 ? var27.x + var27.width : var27.x;
            }

            int var10003 = var16;
            if (var2 == null) {
               var10003 = var16 != 0 ? var27.x + var27.width : var27.x;
            }

            var0.drawLine(var10001, var27.y, var10003, var27.y + var27.height);
            RV.w(var0, var28);
         }
      }

      RV.X(var0, var4);
   }

   public static Shape d(JComponent var0, int var1, int var2, int var3, int var4, boolean var5) {
      return O42.k(var0, a(-27281, -19799), new UI(var1, var2, var3, var4, var5), new Object[]{var1, var2, var3, var4, var5});
   }

   public static GeneralPath Z(int var0, int var1, int var2, int var3, boolean var4) {
      GeneralPath var6;
      String var10000 = com.finalshell.ui.panel.KE3.v();
      var6 = new GeneralPath(0);
      String var5 = var10000;
      if (var5 == null) {
         if (var4) {
            var6.moveTo((float)(var0 - var2 - var3 - 1), -1.0F);
            var6.lineTo((float)(var0 - var3 - 1), (float)(var1 / 2));
            var6.lineTo((float)(var0 - var2 - var3 - 1), (float)var1);
            if (var5 == null) {
               return var6;
            }
         }

         var6.moveTo((float)(var3 + var2), -1.0F);
         var6.lineTo((float)var3, (float)(var1 / 2));
      }

      var6.lineTo((float)(var3 + var2), (float)var1);
      return var6;
   }

   public static Shape E(JComponent var0, BU var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      String var9 = com.finalshell.ui.panel.KE3.v();
      String var10001 = a(-27282, -27145);
      Sz2 var10002 = new Sz2(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      Object[] var10003 = new Object[a(26480, 704658285915352447L)];
      var10003[0] = var1;
      var10003[1] = var2;
      var10003[2] = var3;
      var10003[3] = var4;
      var10003[4] = var5;
      var10003[5] = var6;
      var10003[a(5169, 7964683493158968888L)] = var7;
      var10003[a(8934, 6930505615937366252L)] = var8;
      Shape var10000 = O42.k(var0, var10001, var10002, var10003);
      if (var9 != null) {
         Ky4.K(new String[4]);
      }

      return var10000;
   }

   public static Shape z(JComponent var0, BU var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      String var9;
      int var12;
      label98: {
         label101: {
            var9 = com.finalshell.ui.panel.KE3.v();
            Container var10000 = var0.getParent();
            if (var9 == null) {
               if (var10000 == null) {
                  break label101;
               }

               var10000 = var0.getParent();
            }

            var12 = var10000.getComponentCount();
            if (var9 != null) {
               break label98;
            }

            if (var12 == 1) {
               var12 = var7;
               if (var9 != null) {
                  break label98;
               }

               if (var7 == 0) {
                  if (var6 > 0) {
                     return new Double(0.0, 0.0, (double)var2, (double)var3, (double)var6, (double)var6);
                  }

                  return new Rectangle(0, 0, var2, var3);
               }
            }
         }

         var12 = var1.equals(BU.end);
      }

      if (var9 == null) {
         if (var12 == 0) {
            GeneralPath var11;
            label72: {
               label102: {
                  var11 = (new GeneralPath(0)) ? 1 : 0;
                  var12 = var8;
                  if (var9 == null) {
                     if (var8 != 0) {
                        label66: {
                           var11.moveTo((float)(var2 - var4 - var5 - 1), 0.0F);
                           var11.lineTo((float)(var2 - var5 - 1), (float)(var3 / 2));
                           var11.lineTo((float)(var2 - var4 - var5 - 1), (float)var3);
                           if (var9 == null) {
                              if (var6 > 0 && var1.equals(BU.start)) {
                                 var11.lineTo((float)var6, (float)var3);
                                 var11.quadTo(0.0F, (float)var3, 0.0F, (float)(var3 - var6));
                                 var11.lineTo(0.0F, (float)var6);
                                 var11.quadTo(0.0F, 0.0F, (float)var6, 0.0F);
                                 if (var9 == null) {
                                    break label66;
                                 }
                              }

                              var11.lineTo(0.0F, (float)var3);
                           }

                           var11.lineTo(0.0F, 0.0F);
                        }

                        var11.closePath();
                        if (var9 == null) {
                           return var11;
                        }
                     }

                     var11.moveTo((float)(var5 + var4), 0.0F);
                     var11.lineTo((float)var5, (float)(var3 / 2));
                     var11.lineTo((float)(var5 + var4), (float)var3);
                     if (var9 != null) {
                        break label102;
                     }

                     var12 = var6;
                  }

                  if (var12 > 0 && var1.equals(BU.start)) {
                     var11.lineTo((float)(var2 - var6), (float)var3);
                     var11.quadTo((float)var2, (float)var3, (float)var2, (float)(var3 - var6));
                     var11.lineTo((float)var2, (float)var6);
                     var11.quadTo((float)var2, 0.0F, (float)(var2 - var6), 0.0F);
                     if (var9 == null) {
                        break label72;
                     }
                  }

                  var11.lineTo((float)var2, (float)var3);
               }

               var11.lineTo((float)var2, 0.0F);
            }

            var11.closePath();
            return var11;
         }

         var12 = var6;
      }

      if (var12 <= 0) {
         return new Rectangle(0, 0, var2, var3);
      } else {
         GeneralPath var10;
         label82: {
            var10 = new GeneralPath(0);
            if (var9 == null) {
               if (var8 != 0) {
                  var10.moveTo(0.0F, 0.0F);
                  var10.lineTo((float)(var2 - var6), 0.0F);
                  var10.quadTo((float)var2, 0.0F, (float)var2, (float)var6);
                  var10.lineTo((float)var2, (float)(var3 - var6));
                  var10.quadTo((float)var2, (float)var3, (float)(var2 - var6), (float)var3);
                  var10.lineTo(0.0F, (float)var3);
                  if (var9 == null) {
                     break label82;
                  }
               }

               var10.moveTo((float)var2, 0.0F);
               var10.lineTo((float)var6, 0.0F);
               var10.quadTo(0.0F, 0.0F, 0.0F, (float)var6);
               var10.lineTo(0.0F, (float)(var3 - var6));
               var10.quadTo(0.0F, (float)var3, (float)var6, (float)var3);
            }

            var10.lineTo((float)var2, (float)var3);
         }

         var10.closePath();
         return var10;
      }
   }

   public static Shape v(Shape var0, float var1, boolean var2) {
      Area var4;
      Rectangle var5;
      int var7;
      label14: {
         String var10000 = com.finalshell.ui.panel.KE3.v();
         var4 = new Area(var0);
         String var3 = var10000;
         var5 = var4.getBounds();
         int var6 = var5.width;
         var5.width = Math.round((float)var6 * var1);
         var7 = var2;
         if (var3 == null) {
            if (var2 != 0) {
               var7 = var5.x;
               break label14;
            }

            var7 = var5.x + var6;
         }

         var7 -= var5.width;
      }

      var5.x = var7;
      var4.intersect(new Area(var5));
      return var4;
   }

   public static LinearGradientPaint w(JComponent var0, int var1) {
      boolean var6;
      String var10000 = com.finalshell.ui.panel.KE3.v();
      boolean var3 = false;
      String var2 = var10000;
      JComponent var5 = var0;
      if (var2 == null) {
         if (!(var0 instanceof AbstractButton)) {
            return new LinearGradientPaint(0.0F, 0.0F, 0.0F, (float)var1, K, var3 ? x : Y);
         }

         var5 = var0;
      }

      ButtonModel var4 = ((AbstractButton)var5).getModel();
      var6 = var4.isPressed();
      label27:
      if (var2 == null) {
         if (!var6) {
            var6 = var4.isSelected();
            if (var2 != null) {
               break label27;
            }

            if (!var6) {
               var6 = false;
               break label27;
            }
         }

         var6 = true;
      }

      var3 = var6;
      return new LinearGradientPaint(0.0F, 0.0F, 0.0F, (float)var1, K, var3 ? x : Y);
   }

   public static LinearGradientPaint j(int var0) {
      return new LinearGradientPaint(0.0F, 0.0F, 0.0F, (float)var0, K, w);
   }

   public static boolean q(JComponent var0, int var1, int var2) {
      Container var6;
      String var3;
      int var4;
      int var5;
      int var15;
      label61: {
         label64: {
            var4 = var0.getWidth();
            var5 = var0.getHeight();
            String var10000 = com.finalshell.ui.panel.KE3.v();
            var6 = var0.getParent();
            var3 = var10000;
            Container var14 = var6;
            if (var3 == null) {
               if (var6 == null) {
                  break label64;
               }

               var14 = var6;
            }

            var15 = var14 instanceof com.finalshell.ui.panel.KE3;
            if (var3 != null) {
               break label61;
            }

            if (var15 != 0) {
               var15 = var0 instanceof ND;
               if (var3 != null) {
                  break label61;
               }

               if (var15 != 0) {
                  com.finalshell.ui.panel.KE3 var7 = (com.finalshell.ui.panel.KE3)var6;
                  BU var8 = BU.I(var0, var7);
                  int var9 = var7.j();
                  int var10 = var7.E();
                  int var11 = var7.q();
                  boolean var12 = var7.z();
                  boolean var13 = var0.getComponentOrientation().isLeftToRight();
                  return E(var0, var8, var4, var5, var9, var10, var11, var12, var13).contains((double)var1, (double)var2);
               }
            }
         }

         var15 = 0;
      }

      int var10001 = var1;
      if (var3 == null) {
         if (var15 >= var1) {
            return (0 != 0);
         }

         var15 = var1;
         var10001 = var4;
      }

      if (var3 == null) {
         if (var15 >= var10001) {
            return (0 != 0);
         }

         var15 = 0;
         var10001 = var2;
      }

      if (var3 == null) {
         if (var15 >= var10001) {
            return (0 != 0);
         }

         var15 = var2;
         if (var3 != null) {
            return (var2 != 0);
         }

         var10001 = var5;
      }

      return ((var15 < var10001 ? 1 : 0) != 0);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var6;
      int var2 = (var0 ^ -27281) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 54;
               break;
            case 1:
               var10000 = 203;
               break;
            case 2:
               var10000 = 18;
               break;
            case 3:
               var10000 = 151;
               break;
            case 4:
               var10000 = 116;
               break;
            case 5:
               var10000 = 196;
               break;
            case 6:
               var10000 = 163;
               break;
            case 7:
               var10000 = 88;
               break;
            case 8:
               var10000 = 187;
               break;
            case 9:
               var10000 = 11;
               break;
            case 10:
               var10000 = 129;
               break;
            case 11:
               var10000 = 235;
               break;
            case 12:
               var10000 = 133;
               break;
            case 13:
               var10000 = 221;
               break;
            case 14:
               var10000 = 31;
               break;
            case 15:
               var10000 = 14;
               break;
            case 16:
               var10000 = 42;
               break;
            case 17:
               var10000 = 118;
               break;
            case 18:
               var10000 = 220;
               break;
            case 19:
               var10000 = 59;
               break;
            case 20:
               var10000 = 254;
               break;
            case 21:
               var10000 = 34;
               break;
            case 22:
               var10000 = 181;
               break;
            case 23:
               var10000 = 161;
               break;
            case 24:
               var10000 = 148;
               break;
            case 25:
               var10000 = 167;
               break;
            case 26:
               var10000 = 212;
               break;
            case 27:
               var10000 = 132;
               break;
            case 28:
               var10000 = 178;
               break;
            case 29:
               var10000 = 21;
               break;
            case 30:
               var10000 = 192;
               break;
            case 31:
               var10000 = 147;
               break;
            case 32:
               var10000 = 130;
               break;
            case 33:
               var10000 = 16;
               break;
            case 34:
               var10000 = 183;
               break;
            case 35:
               var10000 = 75;
               break;
            case 36:
               var10000 = 111;
               break;
            case 37:
               var10000 = 1;
               break;
            case 38:
               var10000 = 120;
               break;
            case 39:
               var10000 = 12;
               break;
            case 40:
               var10000 = 175;
               break;
            case 41:
               var10000 = 251;
               break;
            case 42:
               var10000 = 197;
               break;
            case 43:
               var10000 = 76;
               break;
            case 44:
               var10000 = 245;
               break;
            case 45:
               var10000 = 239;
               break;
            case 46:
               var10000 = 145;
               break;
            case 47:
               var10000 = 141;
               break;
            case 48:
               var10000 = 165;
               break;
            case 49:
               var10000 = 140;
               break;
            case 50:
               var10000 = 223;
               break;
            case 51:
               var10000 = 162;
               break;
            case 52:
               var10000 = 244;
               break;
            case 53:
               var10000 = 48;
               break;
            case 54:
               var10000 = 249;
               break;
            case 55:
               var10000 = 166;
               break;
            case 56:
               var10000 = 242;
               break;
            case 57:
               var10000 = 216;
               break;
            case 58:
               var10000 = 185;
               break;
            case 59:
               var10000 = 189;
               break;
            case 60:
               var10000 = 69;
               break;
            case 61:
               var10000 = 136;
               break;
            case 62:
               var10000 = 92;
               break;
            case 63:
               var10000 = 65;
               break;
            case 64:
               var10000 = 103;
               break;
            case 65:
               var10000 = 179;
               break;
            case 66:
               var10000 = 24;
               break;
            case 67:
               var10000 = 49;
               break;
            case 68:
               var10000 = 139;
               break;
            case 69:
               var10000 = 97;
               break;
            case 70:
               var10000 = 174;
               break;
            case 71:
               var10000 = 182;
               break;
            case 72:
               var10000 = 153;
               break;
            case 73:
               var10000 = 72;
               break;
            case 74:
               var10000 = 191;
               break;
            case 75:
               var10000 = 38;
               break;
            case 76:
               var10000 = 143;
               break;
            case 77:
               var10000 = 35;
               break;
            case 78:
               var10000 = 30;
               break;
            case 79:
               var10000 = 144;
               break;
            case 80:
               var10000 = 104;
               break;
            case 81:
               var10000 = 62;
               break;
            case 82:
               var10000 = 40;
               break;
            case 83:
               var10000 = 218;
               break;
            case 84:
               var10000 = 55;
               break;
            case 85:
               var10000 = 233;
               break;
            case 86:
               var10000 = 51;
               break;
            case 87:
               var10000 = 186;
               break;
            case 88:
               var10000 = 208;
               break;
            case 89:
               var10000 = 20;
               break;
            case 90:
               var10000 = 204;
               break;
            case 91:
               var10000 = 32;
               break;
            case 92:
               var10000 = 98;
               break;
            case 93:
               var10000 = 227;
               break;
            case 94:
               var10000 = 37;
               break;
            case 95:
               var10000 = 236;
               break;
            case 96:
               var10000 = 86;
               break;
            case 97:
               var10000 = 226;
               break;
            case 98:
               var10000 = 168;
               break;
            case 99:
               var10000 = 248;
               break;
            case 100:
               var10000 = 210;
               break;
            case 101:
               var10000 = 128;
               break;
            case 102:
               var10000 = 79;
               break;
            case 103:
               var10000 = 122;
               break;
            case 104:
               var10000 = 123;
               break;
            case 105:
               var10000 = 193;
               break;
            case 106:
               var10000 = 150;
               break;
            case 107:
               var10000 = 5;
               break;
            case 108:
               var10000 = 73;
               break;
            case 109:
               var10000 = 172;
               break;
            case 110:
               var10000 = 234;
               break;
            case 111:
               var10000 = 222;
               break;
            case 112:
               var10000 = 101;
               break;
            case 113:
               var10000 = 0;
               break;
            case 114:
               var10000 = 155;
               break;
            case 115:
               var10000 = 231;
               break;
            case 116:
               var10000 = 6;
               break;
            case 117:
               var10000 = 106;
               break;
            case 118:
               var10000 = 121;
               break;
            case 119:
               var10000 = 207;
               break;
            case 120:
               var10000 = 87;
               break;
            case 121:
               var10000 = 13;
               break;
            case 122:
               var10000 = 108;
               break;
            case 123:
               var10000 = 22;
               break;
            case 124:
               var10000 = 107;
               break;
            case 125:
               var10000 = 95;
               break;
            case 126:
               var10000 = 211;
               break;
            case 127:
               var10000 = 201;
               break;
            case 128:
               var10000 = 152;
               break;
            case 129:
               var10000 = 112;
               break;
            case 130:
               var10000 = 91;
               break;
            case 131:
               var10000 = 96;
               break;
            case 132:
               var10000 = 81;
               break;
            case 133:
               var10000 = 94;
               break;
            case 134:
               var10000 = 56;
               break;
            case 135:
               var10000 = 184;
               break;
            case 136:
               var10000 = 241;
               break;
            case 137:
               var10000 = 149;
               break;
            case 138:
               var10000 = 214;
               break;
            case 139:
               var10000 = 134;
               break;
            case 140:
               var10000 = 115;
               break;
            case 141:
               var10000 = 57;
               break;
            case 142:
               var10000 = 15;
               break;
            case 143:
               var10000 = 17;
               break;
            case 144:
               var10000 = 41;
               break;
            case 145:
               var10000 = 74;
               break;
            case 146:
               var10000 = 7;
               break;
            case 147:
               var10000 = 195;
               break;
            case 148:
               var10000 = 68;
               break;
            case 149:
               var10000 = 124;
               break;
            case 150:
               var10000 = 142;
               break;
            case 151:
               var10000 = 89;
               break;
            case 152:
               var10000 = 225;
               break;
            case 153:
               var10000 = 44;
               break;
            case 154:
               var10000 = 83;
               break;
            case 155:
               var10000 = 28;
               break;
            case 156:
               var10000 = 105;
               break;
            case 157:
               var10000 = 177;
               break;
            case 158:
               var10000 = 9;
               break;
            case 159:
               var10000 = 50;
               break;
            case 160:
               var10000 = 27;
               break;
            case 161:
               var10000 = 93;
               break;
            case 162:
               var10000 = 154;
               break;
            case 163:
               var10000 = 230;
               break;
            case 164:
               var10000 = 36;
               break;
            case 165:
               var10000 = 243;
               break;
            case 166:
               var10000 = 169;
               break;
            case 167:
               var10000 = 10;
               break;
            case 168:
               var10000 = 110;
               break;
            case 169:
               var10000 = 238;
               break;
            case 170:
               var10000 = 60;
               break;
            case 171:
               var10000 = 23;
               break;
            case 172:
               var10000 = 126;
               break;
            case 173:
               var10000 = 157;
               break;
            case 174:
               var10000 = 194;
               break;
            case 175:
               var10000 = 4;
               break;
            case 176:
               var10000 = 246;
               break;
            case 177:
               var10000 = 199;
               break;
            case 178:
               var10000 = 164;
               break;
            case 179:
               var10000 = 114;
               break;
            case 180:
               var10000 = 66;
               break;
            case 181:
               var10000 = 64;
               break;
            case 182:
               var10000 = 61;
               break;
            case 183:
               var10000 = 158;
               break;
            case 184:
               var10000 = 237;
               break;
            case 185:
               var10000 = 198;
               break;
            case 186:
               var10000 = 229;
               break;
            case 187:
               var10000 = 206;
               break;
            case 188:
               var10000 = 117;
               break;
            case 189:
               var10000 = 131;
               break;
            case 190:
               var10000 = 90;
               break;
            case 191:
               var10000 = 26;
               break;
            case 192:
               var10000 = 188;
               break;
            case 193:
               var10000 = 170;
               break;
            case 194:
               var10000 = 160;
               break;
            case 195:
               var10000 = 47;
               break;
            case 196:
               var10000 = 217;
               break;
            case 197:
               var10000 = 200;
               break;
            case 198:
               var10000 = 159;
               break;
            case 199:
               var10000 = 84;
               break;
            case 200:
               var10000 = 67;
               break;
            case 201:
               var10000 = 70;
               break;
            case 202:
               var10000 = 52;
               break;
            case 203:
               var10000 = 113;
               break;
            case 204:
               var10000 = 33;
               break;
            case 205:
               var10000 = 138;
               break;
            case 206:
               var10000 = 78;
               break;
            case 207:
               var10000 = 190;
               break;
            case 208:
               var10000 = 171;
               break;
            case 209:
               var10000 = 99;
               break;
            case 210:
               var10000 = 156;
               break;
            case 211:
               var10000 = 46;
               break;
            case 212:
               var10000 = 53;
               break;
            case 213:
               var10000 = 205;
               break;
            case 214:
               var10000 = 25;
               break;
            case 215:
               var10000 = 3;
               break;
            case 216:
               var10000 = 224;
               break;
            case 217:
               var10000 = 232;
               break;
            case 218:
               var10000 = 102;
               break;
            case 219:
               var10000 = 58;
               break;
            case 220:
               var10000 = 43;
               break;
            case 221:
               var10000 = 240;
               break;
            case 222:
               var10000 = 63;
               break;
            case 223:
               var10000 = 77;
               break;
            case 224:
               var10000 = 255;
               break;
            case 225:
               var10000 = 180;
               break;
            case 226:
               var10000 = 2;
               break;
            case 227:
               var10000 = 213;
               break;
            case 228:
               var10000 = 80;
               break;
            case 229:
               var10000 = 176;
               break;
            case 230:
               var10000 = 109;
               break;
            case 231:
               var10000 = 135;
               break;
            case 232:
               var10000 = 127;
               break;
            case 233:
               var10000 = 45;
               break;
            case 234:
               var10000 = 39;
               break;
            case 235:
               var10000 = 253;
               break;
            case 236:
               var10000 = 119;
               break;
            case 237:
               var10000 = 228;
               break;
            case 238:
               var10000 = 100;
               break;
            case 239:
               var10000 = 125;
               break;
            case 240:
               var10000 = 202;
               break;
            case 241:
               var10000 = 29;
               break;
            case 242:
               var10000 = 85;
               break;
            case 243:
               var10000 = 137;
               break;
            case 244:
               var10000 = 19;
               break;
            case 245:
               var10000 = 215;
               break;
            case 246:
               var10000 = 247;
               break;
            case 247:
               var10000 = 8;
               break;
            case 248:
               var10000 = 173;
               break;
            case 249:
               var10000 = 219;
               break;
            case 250:
               var10000 = 252;
               break;
            case 251:
               var10000 = 250;
               break;
            case 252:
               var10000 = 209;
               break;
            case 253:
               var10000 = 146;
               break;
            case 254:
               var10000 = 82;
               break;
            default:
               var10000 = 71;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18956;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long[] var6;
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "\u00ad»ø®=¹\u0004\u0082y\u00878";
      int var12 = "\u00ad»ø®=¹\u0004\u0082y\u00878".length();
      char var9 = 6;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 35;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 35;
               var10006 = var14;
            } else {
               var27 = 35;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 35;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 122;
                     break;
                  case 1:
                     var47 = 104;
                     break;
                  case 2:
                     var47 = 25;
                     break;
                  case 3:
                     var47 = 117;
                     break;
                  case 4:
                     var47 = 31;
                     break;
                  case 5:
                     var47 = 31;
                     break;
                  default:
                     var47 = 110;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 245770128563638496L;
            var6 = new long[8];
            int var3 = 0;
            String var4 = "Y%TKVê6\u009a\u008a1\u008e¹\u0090ØKx`\u008fØ1\u008e.\u001d[\u0007\u0013ù¬}u=\u0097¾dh\u0004Æ \\r8\u0084\u0094Ò\u000fXNÞ";
            int var5 = "Y%TKVê6\u009a\u008a1\u008e¹\u0090ØKx`\u008fØ1\u008e.\u001d[\u0007\u0013ù¬}u=\u0097¾dh\u0004Æ \\r8\u0084\u0094Ò\u000fXNÞ".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           c = var6;
                           d = new Integer[8];
                           K = new float[]{0.0F, 0.5F, 1.0F};
                           L = new Color(a(27785, 7696728700797724293L), a(23083, 7020553702160502816L), a(23083, 7020553702160502816L), 0);
                           Y = new Color[]{L, new Color(0, a(23083, 7020553702160502816L), 0, a(4593, 1453741145714088956L)), L};
                           x = new Color[]{L, new Color(0, a(23083, 7020553702160502816L), 0, a(18385, 9094517630867213791L)), L};
                           w = new Color[]{L, Color.GRAY, L};
                           R = new float[]{0.0F, 0.25F, 0.75F, 1.0F};
                           G = new Color[]{GO.l, GO.r, GO.r, GO.l};
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "*f \u0094^»ø\u000bÝ\u0092\u0099G~¤\u0080?";
                        var5 = "*f \u0094^»ø\u000bÝ\u0092\u0099G~¤\u0080?".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





