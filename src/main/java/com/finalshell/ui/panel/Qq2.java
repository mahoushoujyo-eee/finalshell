package com.finalshell.ui.panel;

import com.finalshell.core.FN;
import com.finalshell.core.GA;
import com.finalshell.core.KD;
import com.finalshell.core.KU_2;
import com.finalshell.core.NC;
import com.finalshell.core.Yj2;
import com.finalshell.ui.listener.DW3;
import com.finalshell.ui.listener.FE;
import com.finalshell.ui.listener.Fy2;
import com.finalshell.ui.listener.Ih4;
import com.finalshell.ui.listener.LL;
import com.finalshell.ui.listener.O_2;
import com.finalshell.ui.listener.XR3;
import com.finalshell.ui.model.IX3;
import com.finalshell.ui.model.YH;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.Arrays;
import java.util.List;

public class Qq2 extends QX {
   public static List k;
   public YH e;
   public final KD l;
   public final KD G;
   public final Ky4 m;
   public static String[] a;
   public static String[] d;
   public static long[] j;
   public static Integer[] n;

   public Qq2(KD var1, YH var2) {
      this.e = var2;
      this.l = var1;
      this.U(true);
      this.setFocusCycleRoot(false);
      String[] var10000 = QX.Y();
      this.L(new Yj2(this));
      this.G = this.H(var1);
      this.G.addActionListener(new LL(this));
      var1.addActionListener(new DW3(this));
      var1.addPropertyChangeListener(new XR3(this, var1));
      var1.addHierarchyListener(new O_2(this));
      var1.addAncestorListener(new Fy2(this));
      String[] var3 = var10000;
      var1.addComponentListener(new Ih4(this));
      this.m = new Ky4();
      this.m.setOpaque(false);
      this.m.setFocusCycleRoot(true);
      this.b();
      this.addAncestorListener(new FE(this));
      if (var3 != null) {
         Ky4.K(new String[2]);
      }
   }

   public void b() {
      String[] var1;
      int var3;
      label163: {
         label166: {
            String[] var10000 = QX.Y();
            this.removeAll();
            var1 = var10000;
            var3 = (this.e.equals(YH.downLeft)) ? 1 : 0;
            if (var1 == null) {
               if (var3 != 0) {
                  this.setLayout(new IX3(new double[][]{{-1.0, -2.0}, {-2.0, -2.0}}));
                  this.add(this.G, b(-26119, -655));
                  this.add(this.m, b(-26141, -4602));
                  if (var1 == null) {
                     break label166;
                  }
               }

               var3 = (this.e.equals(YH.downCenter)) ? 1 : 0;
            }

            if (var1 == null) {
               if (var3 != 0) {
                  this.setLayout(new IX3(new double[][]{{-1.0, -2.0, -1.0}, {-2.0, -2.0}}));
                  this.add(this.G, b(-26123, 16756));
                  this.add(this.m, b(-26131, 12908));
                  if (var1 == null) {
                     break label166;
                  }
               }

               var3 = (this.e.equals(YH.downRight)) ? 1 : 0;
            }

            if (var1 != null) {
               break label163;
            }

            if (var3 != 0) {
               this.setLayout(new IX3(new double[][]{{-2.0, -1.0}, {-2.0, -2.0}}));
               this.add(this.G, b(-26126, -15592));
               this.add(this.m, b(-26113, -29334));
            }
         }

         var3 = (this.e.equals(YH.upLeft)) ? 1 : 0;
      }

      label146: {
         label167: {
            if (var1 == null) {
               if (var3 != 0) {
                  this.setLayout(new IX3(new double[][]{{-1.0, -2.0}, {-2.0, -2.0}}));
                  this.add(this.G, b(-26132, 26404));
                  this.add(this.m, b(-26137, -24783));
                  if (var1 == null) {
                     break label167;
                  }
               }

               var3 = (this.e.equals(YH.upCenter)) ? 1 : 0;
            }

            if (var1 == null) {
               if (var3 != 0) {
                  this.setLayout(new IX3(new double[][]{{-1.0, -2.0, -1.0}, {-2.0, -2.0}}));
                  this.add(this.G, b(-26116, 11296));
                  this.add(this.m, b(-26114, 17971));
                  if (var1 == null) {
                     break label167;
                  }
               }

               var3 = (this.e.equals(YH.upRight)) ? 1 : 0;
            }

            if (var1 != null) {
               break label146;
            }

            if (var3 != 0) {
               this.setLayout(new IX3(new double[][]{{-2.0, -1.0}, {-2.0, -2.0}}));
               this.add(this.G, b(-26117, 15384));
               this.add(this.m, b(-26142, -2517));
            }
         }

         var3 = (this.e.equals(YH.leftUp)) ? 1 : 0;
      }

      label129: {
         label168: {
            if (var1 == null) {
               if (var3 != 0) {
                  this.setLayout(new IX3(new double[][]{{-2.0, -2.0}, {-1.0, -2.0}}));
                  this.add(this.G, b(-26116, 11296));
                  this.add(this.m, b(-26124, 6510));
                  if (var1 == null) {
                     break label168;
                  }
               }

               var3 = (this.e.equals(YH.leftCenter)) ? 1 : 0;
            }

            if (var1 == null) {
               if (var3 != 0) {
                  this.setLayout(new IX3(new double[][]{{-2.0, -2.0}, {-1.0, -2.0, -1.0}}));
                  this.add(this.G, b(-26116, 11296));
                  this.add(this.m, b(-26120, -10062));
                  if (var1 == null) {
                     break label168;
                  }
               }

               var3 = (this.e.equals(YH.leftDown)) ? 1 : 0;
            }

            if (var1 != null) {
               break label129;
            }

            if (var3 != 0) {
               this.setLayout(new IX3(new double[][]{{-2.0, -2.0}, {-2.0, -1.0}}));
               this.add(this.G, b(-26123, 16756));
               this.add(this.m, b(-26140, -30096));
            }
         }

         var3 = (this.e.equals(YH.rightUp)) ? 1 : 0;
      }

      label112: {
         label169: {
            if (var1 == null) {
               if (var3 != 0) {
                  this.setLayout(new IX3(new double[][]{{-2.0, -2.0}, {-1.0, -2.0}}));
                  this.add(this.G, b(-26144, -997));
                  this.add(this.m, b(-26118, 2460));
                  if (var1 == null) {
                     break label169;
                  }
               }

               var3 = (this.e.equals(YH.rightCenter)) ? 1 : 0;
            }

            if (var1 == null) {
               if (var3 != 0) {
                  this.setLayout(new IX3(new double[][]{{-2.0, -2.0}, {-1.0, -2.0, -1.0}}));
                  this.add(this.G, b(-26144, -997));
                  this.add(this.m, b(-26122, -21870));
                  if (var1 == null) {
                     break label169;
                  }
               }

               var3 = (this.e.equals(YH.rightDown)) ? 1 : 0;
            }

            if (var1 != null) {
               break label112;
            }

            if (var3 != 0) {
               this.setLayout(new IX3(new double[][]{{-2.0, -2.0}, {-2.0, -1.0}}));
               this.add(this.G, b(-26115, 31059));
               this.add(this.m, b(-26127, -31483));
            }
         }

         var3 = this.l.q$int() + 1;
      }

      label95: {
         label170: {
            int var2 = var3;
            boolean var4 = this.Y();
            if (var1 == null) {
               if (var4) {
                  this.m.b(new Insets(0, var2, var2, var2));
                  if (var1 == null) {
                     break label170;
                  }
               }

               var4 = this.M();
            }

            if (var1 == null) {
               if (var4) {
                  this.m.b(new Insets(var2, var2, 0, var2));
                  if (var1 == null) {
                     break label170;
                  }
               }

               var4 = this.Z();
            }

            if (var1 == null) {
               if (var4) {
                  this.m.b(new Insets(var2, var2, var2, 0));
                  if (var1 == null) {
                     break label170;
                  }
               }

               var5 = this;
               if (var1 != null) {
                  break label95;
               }

               var4 = this.Q();
            }

            if (var4) {
               this.m.b(new Insets(var2, 0, var2, var2));
            }
         }

         var5 = this;
      }

      var5.revalidate();
   }

   @Override
   public void j(boolean var1) {
      super.j(var1);
      this.repaint();
   }

   public void Q(Component var1) {
      this.m.removeAll();
      this.m.add(var1);
      this.m.revalidate();
   }

   public YH L() {
      return this.e;
   }

   public void g(YH var1) {
      this.e = var1;
      this.b();
      this.R();
   }

   public KD H(KD var1) {
      KU_2 var2 = new KU_2(this, var1);
      this.V(var1, var2);
      var2.setFocusable(true);
      var2.G(true);
      var2.setCursor(var1.getCursor());
      return var2;
   }

   public void V(KD var1, KD var2) {
      var2.setFont(var1.getFont());
      var2.setIcon(var1.getIcon());
      var2.setText(var1.getText());
      var2.setIconTextGap(var1.getIconTextGap());
      var2.setHorizontalAlignment(var1.getHorizontalAlignment());
      var2.setVerticalAlignment(var1.getVerticalAlignment());
      var2.setHorizontalTextPosition(var1.getHorizontalTextPosition());
      var2.setVerticalTextPosition(var1.getVerticalTextPosition());
      var2.setBorder(var1.getBorder());
   }

   @Override
   public void R() {
      String[] var1;
      KD var4;
      label145: {
         var1 = QX.Y();
         boolean var10000 = this.isShowing();
         if (var1 == null) {
            if (!var10000) {
               return;
            }

            var4 = this.l;
            if (var1 != null) {
               break label145;
            }

            var10000 = this.l.isShowing();
         }

         if (!var10000) {
            return;
         }

         var4 = this.l;
      }

      label130: {
         label147: {
            Point var2 = FN.n(var4, this.getParent());
            Dimension var3 = this.getPreferredSize();
            boolean var5 = this.e.equals(YH.downLeft);
            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x + this.l.getWidth() - var3.width, var2.y), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.downCenter);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x + this.l.getWidth() / 2 - var3.width / 2, var2.y), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.downRight);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(var2, var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.upLeft);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x + this.l.getWidth() - var3.width, var2.y + this.l.getHeight() - var3.height), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.upCenter);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x + this.l.getWidth() / 2 - var3.width / 2, var2.y + this.l.getHeight() - var3.height), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.upRight);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x, var2.y + this.l.getHeight() - var3.height), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.leftUp);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x + this.l.getWidth() - var3.width, var2.y + this.l.getHeight() - var3.height), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.leftCenter);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x + this.l.getWidth() - var3.width, var2.y + this.l.getHeight() / 2 - var3.height / 2), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.leftDown);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x + this.l.getWidth() - var3.width, var2.y), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.rightUp);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x, var2.y + this.l.getHeight() - var3.height), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var5 = this.e.equals(YH.rightCenter);
            }

            if (var1 == null) {
               if (var5) {
                  this.setBounds(new Rectangle(new Point(var2.x, var2.y + this.l.getHeight() / 2 - var3.height / 2), var3));
                  if (var1 == null) {
                     break label147;
                  }
               }

               var6 = this;
               if (var1 != null) {
                  break label130;
               }

               var5 = this.e.equals(YH.rightDown);
            }

            if (var5) {
               this.setBounds(new Rectangle(new Point(var2.x, var2.y), var3));
            }
         }

         var6 = this;
      }

      var6.revalidate();
   }

   @Override
   public boolean contains(Point var1) {
      return this.d(this).contains(var1);
   }

   public Shape d(Qq2 var1) {
      Shape var9;
      label149: {
         int var3;
         int var7;
         int var8;
         int var15;
         int var10001;
         label152: {
            String[] var2;
            int var4;
            int var5;
            int var6;
            label147: {
               label153: {
                  var3 = this.l.q$int();
                  String[] var10000 = QX.Y();
                  var4 = this.l.h$int();
                  var2 = var10000;
                  var5 = this.l.getHeight() - 1;
                  var6 = this.l.getWidth() - 1;
                  var7 = var1.getWidth() - 1;
                  var8 = var1.getHeight() - 1;
                  var9 = null;
                  var15 = (this.z()) ? 1 : 0;
                  if (var2 == null) {
                     if (var15 != 0) {
                        var15 = var7;
                        var10001 = var6;
                        if (var2 != null) {
                           break label152;
                        }

                        if (var7 == var6) {
                           break label153;
                        }
                     }

                     var15 = (this.W()) ? 1 : 0;
                  }

                  if (var2 != null) {
                     break label147;
                  }

                  if (var15 != 0) {
                     var15 = var8;
                     if (var2 != null) {
                        break label147;
                     }

                     if (var8 == var5) {
                        break label153;
                     }
                  }

                  var15 = (this.e.equals(YH.downLeft)) ? 1 : 0;
                  break label147;
               }

               var15 = var4;
               var10001 = 4;
               break label152;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  Point[] var27 = new Point[a(20409, 3354064473426589695L)];
                  var27[0] = this.c(var7 - var6 + var3, var3);
                  var27[1] = this.c(var7 - var3, var3);
                  var27[2] = this.c(var7 - var3, var8 - var3);
                  var27[3] = this.c(var3, var8 - var3);
                  var27[4] = this.c(var3, var5);
                  var27[5] = this.c(var7 - var6 + var3, var5);
                  var9 = GA.a(var4, var27);
                  break label149;
               }

               var15 = (this.e.equals(YH.downCenter)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  int var13 = var6 % 2;
                  Point[] var26 = new Point[a(4167, 7604141035775895559L)];
                  var26[0] = this.c(var7 / 2 - var6 / 2 - var13 + var3, var3);
                  var26[1] = this.c(var7 / 2 + var6 / 2 - var3, var3);
                  var26[2] = this.c(var7 / 2 + var6 / 2 - var3, var5);
                  var26[3] = this.c(var7 - var3, var5);
                  var26[4] = this.c(var7 - var3, var8 - var3);
                  var26[5] = this.c(var3, var8 - var3);
                  var26[a(20409, 3354064473426589695L)] = this.c(var3, var5);
                  var26[a(32365, 2908653518711637548L)] = this.c(var7 / 2 - var6 / 2 - var13 + var3, var5);
                  var9 = GA.a(var4, var26);
                  break label149;
               }

               var15 = (this.e.equals(YH.downRight)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  Point[] var25 = new Point[a(20409, 3354064473426589695L)];
                  var25[0] = this.c(var3, var3);
                  var25[1] = this.c(var6 - var3, var3);
                  var25[2] = this.c(var6 - var3, var5);
                  var25[3] = this.c(var7 - var3, var5);
                  var25[4] = this.c(var7 - var3, var8 - var3);
                  var25[5] = this.c(var3, var8 - var3);
                  var9 = GA.a(var4, var25);
                  break label149;
               }

               var15 = (this.e.equals(YH.upLeft)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  Point[] var24 = new Point[a(20409, 3354064473426589695L)];
                  var24[0] = this.c(var3, var3);
                  var24[1] = this.c(var7 - var3, var3);
                  var24[2] = this.c(var7 - var3, var8 - var3);
                  var24[3] = this.c(var7 - var6 + var3, var8 - var3);
                  var24[4] = this.c(var7 - var6 + var3, var8 - var5);
                  var24[5] = this.c(var3, var8 - var5);
                  var9 = GA.a(var4, var24);
                  break label149;
               }

               var15 = (this.e.equals(YH.upCenter)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  int var12 = var6 % 2;
                  Point[] var23 = new Point[a(4167, 7604141035775895559L)];
                  var23[0] = this.c(var3, var3);
                  var23[1] = this.c(var7 - var3, var3);
                  var23[2] = this.c(var7 - var3, var8 - var5);
                  var23[3] = this.c(var7 / 2 + var6 / 2 - var3, var8 - var5);
                  var23[4] = this.c(var7 / 2 + var6 / 2 - var3, var8 - var3);
                  var23[5] = this.c(var7 / 2 - var6 / 2 - var12 + var3, var8 - var3);
                  var23[a(20409, 3354064473426589695L)] = this.c(var7 / 2 - var6 / 2 - var12 + var3, var8 - var5);
                  var23[a(32365, 2908653518711637548L)] = this.c(var3, var8 - var5);
                  var9 = GA.a(var4, var23);
                  break label149;
               }

               var15 = (this.e.equals(YH.upRight)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  Point[] var22 = new Point[a(20409, 3354064473426589695L)];
                  var22[0] = this.c(var3, var3);
                  var22[1] = this.c(var7 - var3, var3);
                  var22[2] = this.c(var7 - var3, var8 - var5);
                  var22[3] = this.c(var6 - var3, var8 - var5);
                  var22[4] = this.c(var6 - var3, var8 - var3);
                  var22[5] = this.c(var3, var8 - var3);
                  var9 = GA.a(var4, var22);
                  break label149;
               }

               var15 = (this.e.equals(YH.leftUp)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  Point[] var21 = new Point[a(20409, 3354064473426589695L)];
                  var21[0] = this.c(var3, var3);
                  var21[1] = this.c(var7 - var6, var3);
                  var21[2] = this.c(var7 - var6, var8 - var5 + var3);
                  var21[3] = this.c(var7 - var3, var8 - var5 + var3);
                  var21[4] = this.c(var7 - var3, var8 - var3);
                  var21[5] = this.c(var3, var8 - var3);
                  var9 = GA.a(var4, var21);
                  break label149;
               }

               var15 = (this.e.equals(YH.leftCenter)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  int var11 = var5 % 2;
                  Point[] var20 = new Point[a(4167, 7604141035775895559L)];
                  var20[0] = this.c(var3, var3);
                  var20[1] = this.c(var7 - var6, var3);
                  var20[2] = this.c(var7 - var6, var8 / 2 - var5 / 2 + var3);
                  var20[3] = this.c(var7 - var3, var8 / 2 - var5 / 2 + var3);
                  var20[4] = this.c(var7 - var3, var8 / 2 + var5 / 2 + var11 - var3);
                  var20[5] = this.c(var7 - var6, var8 / 2 + var5 / 2 + var11 - var3);
                  var20[a(20409, 3354064473426589695L)] = this.c(var7 - var6, var8 - var3);
                  var20[a(32365, 2908653518711637548L)] = this.c(var3, var8 - var3);
                  var9 = GA.a(var4, var20);
                  break label149;
               }

               var15 = (this.e.equals(YH.leftDown)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  Point[] var19 = new Point[a(20409, 3354064473426589695L)];
                  var19[0] = this.c(var3, var3);
                  var19[1] = this.c(var7 - var3, var3);
                  var19[2] = this.c(var7 - var3, var5 - var3);
                  var19[3] = this.c(var7 - var6, var5 - var3);
                  var19[4] = this.c(var7 - var6, var8 - var3);
                  var19[5] = this.c(var3, var8 - var3);
                  var9 = GA.a(var4, var19);
                  break label149;
               }

               var15 = (this.e.equals(YH.rightUp)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  Point[] var18 = new Point[a(20409, 3354064473426589695L)];
                  var18[0] = this.c(var3, var8 - var5 + var3);
                  var18[1] = this.c(var6, var8 - var5 + var3);
                  var18[2] = this.c(var6, var3);
                  var18[3] = this.c(var7 - var3, var3);
                  var18[4] = this.c(var7 - var3, var8 - var3);
                  var18[5] = this.c(var3, var8 - var3);
                  var9 = GA.a(var4, var18);
                  break label149;
               }

               var15 = (this.e.equals(YH.rightCenter)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 != 0) {
                  int var10 = var5 % 2;
                  Point[] var17 = new Point[a(4167, 7604141035775895559L)];
                  var17[0] = this.c(var3, var8 / 2 - var5 / 2 + var3);
                  var17[1] = this.c(var6, var8 / 2 - var5 / 2 + var3);
                  var17[2] = this.c(var6, var3);
                  var17[3] = this.c(var7 - var3, var3);
                  var17[4] = this.c(var7 - var3, var8 - var3);
                  var17[5] = this.c(var6, var8 - var3);
                  var17[a(20409, 3354064473426589695L)] = this.c(var6, var8 / 2 + var5 / 2 + var10 - var3);
                  var17[a(32365, 2908653518711637548L)] = this.c(var3, var8 / 2 + var5 / 2 + var10 - var3);
                  var9 = GA.a(var4, var17);
                  break label149;
               }

               var15 = (this.e.equals(YH.rightDown)) ? 1 : 0;
            }

            if (var2 == null) {
               if (var15 == 0) {
                  break label149;
               }

               var15 = var4;
            }

            Point[] var16 = new Point[a(20409, 3354064473426589695L)];
            var16[0] = this.c(var3, var3);
            var16[1] = this.c(var7 - var3, var3);
            var16[2] = this.c(var7 - var3, var8 - var3);
            var16[3] = this.c(var6, var8 - var3);
            var16[4] = this.c(var6, var5 - var3);
            var16[5] = this.c(var3, var5 - var3);
            var9 = GA.a(var15, var16);
            break label149;
         }

         Point[] var28 = new Point[var10001];
         var28[0] = this.c(var3, var3);
         var28[1] = this.c(var7 - var3, var3);
         var28[2] = this.c(var7 - var3, var8 - var3);
         var28[3] = this.c(var3, var8 - var3);
         var9 = GA.a(var15, var28);
      }

      if (Ky4.F$arrString() != null) {
         QX.f(new String[5]);
      }

      return var9;
   }

   public boolean z() {
      String[] var1 = QX.Y();
      boolean var10000 = this.M();
      if (var1 == null) {
         if (!var10000) {
            var10000 = this.Y();
            if (var1 != null) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean Y() {
      String[] var1 = QX.Y();
      boolean var10000 = this.e.equals(YH.downLeft);
      if (var1 == null) {
         if (!var10000) {
            var10000 = this.e.equals(YH.downCenter);
            if (var1 != null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = this.e.equals(YH.downRight);
               if (var1 != null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean M() {
      String[] var1 = QX.Y();
      boolean var10000 = this.e.equals(YH.upLeft);
      if (var1 == null) {
         if (!var10000) {
            var10000 = this.e.equals(YH.upCenter);
            if (var1 != null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = this.e.equals(YH.upRight);
               if (var1 != null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean W() {
      String[] var1 = QX.Y();
      boolean var10000 = this.Z();
      if (var1 == null) {
         if (!var10000) {
            var10000 = this.Q();
            if (var1 != null) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean Q() {
      String[] var1 = QX.Y();
      boolean var10000 = this.e.equals(YH.rightUp);
      if (var1 == null) {
         if (!var10000) {
            var10000 = this.e.equals(YH.rightCenter);
            if (var1 != null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = this.e.equals(YH.rightDown);
               if (var1 != null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean Z() {
      String[] var1 = QX.Y();
      boolean var10000 = this.e.equals(YH.leftUp);
      if (var1 == null) {
         if (!var10000) {
            var10000 = this.e.equals(YH.leftCenter);
            if (var1 != null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = this.e.equals(YH.leftDown);
               if (var1 != null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public Point c(int var1, int var2) {
      return new Point(var1, var2);
   }

   @Override
   public Shape B() {
      return this.d(this);
   }

   public void g() {
      NC.b(this.l, this, false);
   }

   @Override
   public void V() {
      this.q(false);
   }

   public void q(boolean var1) {
      String[] var2;
      boolean var10000;
      var2 = QX.Y();
      var10000 = this.q();
      label40:
      if (var2 == null) {
         if (var10000) {
            var10000 = this.l.isFocusable();
            if (var2 != null) {
               break label40;
            }

            if (var10000) {
               var10000 = var1;
               if (var2 != null) {
                  break label40;
               }

               if (var1) {
                  this.l.requestFocusInWindow();
                  return;
               }
            }
         }

         super.V();
         var10000 = this.l.isFocusable();
      }

      if (var2 == null) {
         if (!var10000) {
            return;
         }

         var10000 = var1;
      }

      if (var2 == null && var10000) {
         this.l.requestFocusInWindow();
      }
   }

   public static List u() {
      return k;
   }

   public static KD m(Qq2 var0) {
      return var0.G;
   }

   public static void D(Qq2 var0, KD var1, KD var2) {
      var0.V(var1, var2);
   }

   public static KD r(Qq2 var0) {
      return var0.l;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -26121) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 81;
               break;
            case 1:
               var10000 = 198;
               break;
            case 2:
               var10000 = 94;
               break;
            case 3:
               var10000 = 221;
               break;
            case 4:
               var10000 = 230;
               break;
            case 5:
               var10000 = 236;
               break;
            case 6:
               var10000 = 123;
               break;
            case 7:
               var10000 = 56;
               break;
            case 8:
               var10000 = 91;
               break;
            case 9:
               var10000 = 39;
               break;
            case 10:
               var10000 = 255;
               break;
            case 11:
               var10000 = 234;
               break;
            case 12:
               var10000 = 16;
               break;
            case 13:
               var10000 = 76;
               break;
            case 14:
               var10000 = 100;
               break;
            case 15:
               var10000 = 241;
               break;
            case 16:
               var10000 = 15;
               break;
            case 17:
               var10000 = 132;
               break;
            case 18:
               var10000 = 3;
               break;
            case 19:
               var10000 = 28;
               break;
            case 20:
               var10000 = 113;
               break;
            case 21:
               var10000 = 1;
               break;
            case 22:
               var10000 = 98;
               break;
            case 23:
               var10000 = 253;
               break;
            case 24:
               var10000 = 219;
               break;
            case 25:
               var10000 = 66;
               break;
            case 26:
               var10000 = 9;
               break;
            case 27:
               var10000 = 42;
               break;
            case 28:
               var10000 = 126;
               break;
            case 29:
               var10000 = 96;
               break;
            case 30:
               var10000 = 73;
               break;
            case 31:
               var10000 = 49;
               break;
            case 32:
               var10000 = 202;
               break;
            case 33:
               var10000 = 130;
               break;
            case 34:
               var10000 = 57;
               break;
            case 35:
               var10000 = 217;
               break;
            case 36:
               var10000 = 159;
               break;
            case 37:
               var10000 = 141;
               break;
            case 38:
               var10000 = 84;
               break;
            case 39:
               var10000 = 179;
               break;
            case 40:
               var10000 = 157;
               break;
            case 41:
               var10000 = 40;
               break;
            case 42:
               var10000 = 21;
               break;
            case 43:
               var10000 = 232;
               break;
            case 44:
               var10000 = 109;
               break;
            case 45:
               var10000 = 210;
               break;
            case 46:
               var10000 = 251;
               break;
            case 47:
               var10000 = 58;
               break;
            case 48:
               var10000 = 239;
               break;
            case 49:
               var10000 = 74;
               break;
            case 50:
               var10000 = 80;
               break;
            case 51:
               var10000 = 180;
               break;
            case 52:
               var10000 = 138;
               break;
            case 53:
               var10000 = 25;
               break;
            case 54:
               var10000 = 136;
               break;
            case 55:
               var10000 = 182;
               break;
            case 56:
               var10000 = 206;
               break;
            case 57:
               var10000 = 59;
               break;
            case 58:
               var10000 = 82;
               break;
            case 59:
               var10000 = 245;
               break;
            case 60:
               var10000 = 78;
               break;
            case 61:
               var10000 = 18;
               break;
            case 62:
               var10000 = 124;
               break;
            case 63:
               var10000 = 68;
               break;
            case 64:
               var10000 = 201;
               break;
            case 65:
               var10000 = 12;
               break;
            case 66:
               var10000 = 147;
               break;
            case 67:
               var10000 = 244;
               break;
            case 68:
               var10000 = 22;
               break;
            case 69:
               var10000 = 95;
               break;
            case 70:
               var10000 = 139;
               break;
            case 71:
               var10000 = 164;
               break;
            case 72:
               var10000 = 197;
               break;
            case 73:
               var10000 = 184;
               break;
            case 74:
               var10000 = 88;
               break;
            case 75:
               var10000 = 125;
               break;
            case 76:
               var10000 = 176;
               break;
            case 77:
               var10000 = 229;
               break;
            case 78:
               var10000 = 165;
               break;
            case 79:
               var10000 = 237;
               break;
            case 80:
               var10000 = 143;
               break;
            case 81:
               var10000 = 105;
               break;
            case 82:
               var10000 = 226;
               break;
            case 83:
               var10000 = 31;
               break;
            case 84:
               var10000 = 240;
               break;
            case 85:
               var10000 = 218;
               break;
            case 86:
               var10000 = 110;
               break;
            case 87:
               var10000 = 249;
               break;
            case 88:
               var10000 = 154;
               break;
            case 89:
               var10000 = 200;
               break;
            case 90:
               var10000 = 19;
               break;
            case 91:
               var10000 = 54;
               break;
            case 92:
               var10000 = 146;
               break;
            case 93:
               var10000 = 149;
               break;
            case 94:
               var10000 = 118;
               break;
            case 95:
               var10000 = 203;
               break;
            case 96:
               var10000 = 252;
               break;
            case 97:
               var10000 = 86;
               break;
            case 98:
               var10000 = 195;
               break;
            case 99:
               var10000 = 153;
               break;
            case 100:
               var10000 = 14;
               break;
            case 101:
               var10000 = 65;
               break;
            case 102:
               var10000 = 72;
               break;
            case 103:
               var10000 = 228;
               break;
            case 104:
               var10000 = 172;
               break;
            case 105:
               var10000 = 224;
               break;
            case 106:
               var10000 = 69;
               break;
            case 107:
               var10000 = 189;
               break;
            case 108:
               var10000 = 20;
               break;
            case 109:
               var10000 = 55;
               break;
            case 110:
               var10000 = 167;
               break;
            case 111:
               var10000 = 192;
               break;
            case 112:
               var10000 = 135;
               break;
            case 113:
               var10000 = 90;
               break;
            case 114:
               var10000 = 30;
               break;
            case 115:
               var10000 = 190;
               break;
            case 116:
               var10000 = 114;
               break;
            case 117:
               var10000 = 193;
               break;
            case 118:
               var10000 = 134;
               break;
            case 119:
               var10000 = 216;
               break;
            case 120:
               var10000 = 10;
               break;
            case 121:
               var10000 = 208;
               break;
            case 122:
               var10000 = 92;
               break;
            case 123:
               var10000 = 70;
               break;
            case 124:
               var10000 = 235;
               break;
            case 125:
               var10000 = 186;
               break;
            case 126:
               var10000 = 37;
               break;
            case 127:
               var10000 = 204;
               break;
            case 128:
               var10000 = 24;
               break;
            case 129:
               var10000 = 5;
               break;
            case 130:
               var10000 = 77;
               break;
            case 131:
               var10000 = 41;
               break;
            case 132:
               var10000 = 227;
               break;
            case 133:
               var10000 = 64;
               break;
            case 134:
               var10000 = 50;
               break;
            case 135:
               var10000 = 174;
               break;
            case 136:
               var10000 = 75;
               break;
            case 137:
               var10000 = 45;
               break;
            case 138:
               var10000 = 63;
               break;
            case 139:
               var10000 = 212;
               break;
            case 140:
               var10000 = 116;
               break;
            case 141:
               var10000 = 155;
               break;
            case 142:
               var10000 = 215;
               break;
            case 143:
               var10000 = 29;
               break;
            case 144:
               var10000 = 168;
               break;
            case 145:
               var10000 = 254;
               break;
            case 146:
               var10000 = 188;
               break;
            case 147:
               var10000 = 47;
               break;
            case 148:
               var10000 = 137;
               break;
            case 149:
               var10000 = 150;
               break;
            case 150:
               var10000 = 247;
               break;
            case 151:
               var10000 = 33;
               break;
            case 152:
               var10000 = 106;
               break;
            case 153:
               var10000 = 214;
               break;
            case 154:
               var10000 = 107;
               break;
            case 155:
               var10000 = 111;
               break;
            case 156:
               var10000 = 173;
               break;
            case 157:
               var10000 = 60;
               break;
            case 158:
               var10000 = 213;
               break;
            case 159:
               var10000 = 67;
               break;
            case 160:
               var10000 = 183;
               break;
            case 161:
               var10000 = 34;
               break;
            case 162:
               var10000 = 166;
               break;
            case 163:
               var10000 = 238;
               break;
            case 164:
               var10000 = 11;
               break;
            case 165:
               var10000 = 89;
               break;
            case 166:
               var10000 = 191;
               break;
            case 167:
               var10000 = 36;
               break;
            case 168:
               var10000 = 250;
               break;
            case 169:
               var10000 = 48;
               break;
            case 170:
               var10000 = 87;
               break;
            case 171:
               var10000 = 209;
               break;
            case 172:
               var10000 = 117;
               break;
            case 173:
               var10000 = 162;
               break;
            case 174:
               var10000 = 97;
               break;
            case 175:
               var10000 = 207;
               break;
            case 176:
               var10000 = 128;
               break;
            case 177:
               var10000 = 71;
               break;
            case 178:
               var10000 = 112;
               break;
            case 179:
               var10000 = 181;
               break;
            case 180:
               var10000 = 44;
               break;
            case 181:
               var10000 = 53;
               break;
            case 182:
               var10000 = 140;
               break;
            case 183:
               var10000 = 46;
               break;
            case 184:
               var10000 = 163;
               break;
            case 185:
               var10000 = 8;
               break;
            case 186:
               var10000 = 85;
               break;
            case 187:
               var10000 = 187;
               break;
            case 188:
               var10000 = 158;
               break;
            case 189:
               var10000 = 151;
               break;
            case 190:
               var10000 = 23;
               break;
            case 191:
               var10000 = 93;
               break;
            case 192:
               var10000 = 108;
               break;
            case 193:
               var10000 = 129;
               break;
            case 194:
               var10000 = 169;
               break;
            case 195:
               var10000 = 83;
               break;
            case 196:
               var10000 = 246;
               break;
            case 197:
               var10000 = 177;
               break;
            case 198:
               var10000 = 122;
               break;
            case 199:
               var10000 = 233;
               break;
            case 200:
               var10000 = 35;
               break;
            case 201:
               var10000 = 156;
               break;
            case 202:
               var10000 = 145;
               break;
            case 203:
               var10000 = 119;
               break;
            case 204:
               var10000 = 62;
               break;
            case 205:
               var10000 = 222;
               break;
            case 206:
               var10000 = 231;
               break;
            case 207:
               var10000 = 144;
               break;
            case 208:
               var10000 = 38;
               break;
            case 209:
               var10000 = 175;
               break;
            case 210:
               var10000 = 171;
               break;
            case 211:
               var10000 = 131;
               break;
            case 212:
               var10000 = 99;
               break;
            case 213:
               var10000 = 7;
               break;
            case 214:
               var10000 = 194;
               break;
            case 215:
               var10000 = 13;
               break;
            case 216:
               var10000 = 103;
               break;
            case 217:
               var10000 = 248;
               break;
            case 218:
               var10000 = 185;
               break;
            case 219:
               var10000 = 121;
               break;
            case 220:
               var10000 = 115;
               break;
            case 221:
               var10000 = 61;
               break;
            case 222:
               var10000 = 102;
               break;
            case 223:
               var10000 = 152;
               break;
            case 224:
               var10000 = 51;
               break;
            case 225:
               var10000 = 27;
               break;
            case 226:
               var10000 = 243;
               break;
            case 227:
               var10000 = 43;
               break;
            case 228:
               var10000 = 4;
               break;
            case 229:
               var10000 = 142;
               break;
            case 230:
               var10000 = 120;
               break;
            case 231:
               var10000 = 161;
               break;
            case 232:
               var10000 = 104;
               break;
            case 233:
               var10000 = 127;
               break;
            case 234:
               var10000 = 205;
               break;
            case 235:
               var10000 = 0;
               break;
            case 236:
               var10000 = 220;
               break;
            case 237:
               var10000 = 148;
               break;
            case 238:
               var10000 = 32;
               break;
            case 239:
               var10000 = 196;
               break;
            case 240:
               var10000 = 242;
               break;
            case 241:
               var10000 = 79;
               break;
            case 242:
               var10000 = 170;
               break;
            case 243:
               var10000 = 199;
               break;
            case 244:
               var10000 = 101;
               break;
            case 245:
               var10000 = 6;
               break;
            case 246:
               var10000 = 17;
               break;
            case 247:
               var10000 = 2;
               break;
            case 248:
               var10000 = 26;
               break;
            case 249:
               var10000 = 178;
               break;
            case 250:
               var10000 = 52;
               break;
            case 251:
               var10000 = 225;
               break;
            case 252:
               var10000 = 160;
               break;
            case 253:
               var10000 = 223;
               break;
            case 254:
               var10000 = 133;
               break;
            default:
               var10000 = 211;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14403;
      if (n[var3] == null) {
         n[var3] = (int)(j[var3] ^ var1);
      }

      return n[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[28];
      int var11 = 0;
      String var10 = "cÍ^\u0096P%\u0090\u0083´ò\u0007\u00078=9lm9´\u0003g\tÒ\u0007¶_É r°u\u0004ø \u0084÷\u0003r\u0013Q\u0007qÌ\u0010RHþ\u0013\u0004dÝ¾\u0094\u0007?,ùNT}\u0090\u0007\u0003(\u007fÎ¦m¬\u0003çáã\u0003\u001cU¼\u0003rjP\u0007ÛuEeâ\u0018F\u0003ß\u0096Å\u0007éó\"µ\u000f\u0002Ù\u0007@Â\u0017\u0093¨Æ\u000e\u0011\u0084PCùp\u0097\u0017\u000bxõAu3t:¶ã\u0016¥fºi\\7ì\u008aÉÞn\u0012ZÃö{îÊùE\u0096\u0018\u0007uc±§}@\u0094\u0007l8\u0093Ì\u0019-9\u0007¡F+\u0003/Ôþ\u0013\u008d[¿ÎüÃø\u0014K\r+aT\u0096:¢\u0098´ã\u0003f%Ò\u0006Ùv~fÛg\u0014#\u0019·Ðî²Ä¯\u0017h\nýW\u0016Y¿[\u0094³\u0089";
      int var12 = "cÍ^\u0096P%\u0090\u0083´ò\u0007\u00078=9lm9´\u0003g\tÒ\u0007¶_É r°u\u0004ø \u0084÷\u0003r\u0013Q\u0007qÌ\u0010RHþ\u0013\u0004dÝ¾\u0094\u0007?,ùNT}\u0090\u0007\u0003(\u007fÎ¦m¬\u0003çáã\u0003\u001cU¼\u0003rjP\u0007ÛuEeâ\u0018F\u0003ß\u0096Å\u0007éó\"µ\u000f\u0002Ù\u0007@Â\u0017\u0093¨Æ\u000e\u0011\u0084PCùp\u0097\u0017\u000bxõAu3t:¶ã\u0016¥fºi\\7ì\u008aÉÞn\u0012ZÃö{îÊùE\u0096\u0018\u0007uc±§}@\u0094\u0007l8\u0093Ì\u0019-9\u0007¡F+\u0003/Ôþ\u0013\u008d[¿ÎüÃø\u0014K\r+aT\u0096:¢\u0098´ã\u0003f%Ò\u0006Ùv~fÛg\u0014#\u0019·Ðî²Ä¯\u0017h\nýW\u0016Y¿[\u0094³\u0089"
         .length();
      char var9 = 11;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 11;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var34;
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var10000;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var10000;
                  var10006 = var14;
               } else {
                  var43 = var10000;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  byte var66;
                  switch (var14 % 7) {
                     case 0:
                        var66 = 18;
                        break;
                     case 1:
                        var66 = 50;
                        break;
                     case 2:
                        var66 = 49;
                        break;
                     case 3:
                        var66 = 98;
                        break;
                     case 4:
                        var66 = 1;
                        break;
                     case 5:
                        var66 = 23;
                        break;
                     default:
                        var66 = 118;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            String var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     d = new String[28];
                     long var0 = 3613628633451842062L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "igVîü©2->\u001eñ\u0010\u001bHÀÞÀ\u0018\u0084\u0019Jl\u008c%\u0007Ü\u008aÂlwb\u0001";
                     int var5 = "igVîü©2->\u001eñ\u0010\u001bHÀÞÀ\u0018\u0084\u0019Jl\u008c%\u0007Ü\u008aÂlwb\u0001".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var19[var28] = var55;
                                 if (var2 >= var5) {
                                    j = var6;
                                    n = new Integer[6];
                                    String[] var20 = new String[a(12954, 7463211197057927896L)];
                                    var20[0] = b(-26128, 16846);
                                    var20[1] = b(-26125, -26704);
                                    var20[2] = b(-26143, -27003);
                                    var20[3] = b(-26138, 18471);
                                    var20[4] = b(-26139, -12686);
                                    var20[5] = b(-26130, -26722);
                                    var20[a(6263, 4462928337168212016L)] = b(-26121, -3217);
                                    var20[a(16487, 1620768376688932900L)] = b(-26129, -29682);
                                    k = Arrays.asList(var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "$#Ù\u0018õüj8\t\u0001©x\u0093J½÷";
                                 var5 = "$#Ù\u0018õüj8\t\u0001©x\u0093J½÷".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = ":<¸\u00ad\u009eàK\u0003;»¹";
                  var12 = ":<¸\u00ad\u009eàK\u0003;»¹".length();
                  var9 = 7;
                  var17 = -1;
            }

            var10000 = 103;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





