package com.finalshell.ui.panel;

import com.finalshell.core.FN;
import com.finalshell.core.GA;
import com.finalshell.core.GO;
import com.finalshell.core.RV;
import com.finalshell.core.WC_2;
import com.finalshell.core.Xg2;
import com.finalshell.ui.listener.CF_3;
import com.finalshell.ui.listener.Cb4;
import com.finalshell.ui.listener.PS;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class II extends JComponent {
   public final int V = a(16617, 4198566905093304367L);
   public int Z = a(19746, 8454235847178698214L);
   public final int P = a(2415, 6940938825119037859L);
   public final float x = 0.7F;
   public final int S = a(21730, 8976500173733176362L);
   public final Color i;
   public final Color M;
   public final Color t;
   public final Color B;
   public int k;
   public int O;
   public final List e;
   public final List Y;
   public final List j;
   public int W;
   public boolean r;
   public int p;
   public int d;
   public float f;
   public WC_2 s;
   public SZ R;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] g;

   public II() {
      String var10000 = Wb2.m$String();
      this.i = new Color(a(27613, 3140147297034083100L), a(17347, 8900846371589206801L), a(17347, 8900846371589206801L));
      this.M = new Color(a(5649, 8532131175631939283L), a(13016, 3678242653083648536L), a(13016, 3678242653083648536L));
      this.t = new Color(a(17347, 8900846371589206801L), a(17347, 8900846371589206801L), a(17347, 8900846371589206801L), 0);
      this.B = new Color(a(13016, 3678242653083648536L), a(13016, 3678242653083648536L), a(13016, 3678242653083648536L), 0);
      this.k = 0;
      this.O = 0;
      this.e = new ArrayList();
      this.Y = new ArrayList();
      this.j = new ArrayList();
      String var1 = var10000;
      this.W = a(5156, 7032456339291366634L);
      this.r = true;
      this.p = -1;
      this.d = -1;
      this.f = 0.0F;
      this.s = null;
      FN.Y(this);
      this.setFocusable(true);
      this.setFont(new JLabel().getFont().deriveFont(1));
      Cb4 var2 = new Cb4(this);
      this.addMouseListener(var2);
      this.addMouseWheelListener(var2);
      this.addKeyListener(new PS(this));
      if (var1 == null) {
         Ky4.K(new String[1]);
      }
   }

   public List f() {
      return this.e;
   }

   public int J() {
      return this.W;
   }

   public void s(int var1) {
      this.W = var1;
   }

   public SZ Y$SZ() {
      return this.r(true);
   }

   public SZ r(boolean var1) {
      String var2 = Wb2.m$String();
      SZ var10000 = this.R;
      if (var2 != null) {
         if (this.R == null) {
            this.R = new SS(this, this, var1);
            this.R.setHorizontalScrollBarPolicy(a(9675, 7218392076847633676L));
            this.R.setVerticalScrollBarPolicy(a(15742, 1829144177888513469L));
            InputMap var3 = this.R.getInputMap(1);
            var3.put(KeyStroke.getKeyStroke(a(-26562, 4686)), a(-26564, -18177));
            var3.put(KeyStroke.getKeyStroke(a(-26565, -21567)), a(-26566, -19388));
            var3.put(KeyStroke.getKeyStroke(a(-26570, -20033)), a(-26566, -19388));
            var3.put(KeyStroke.getKeyStroke(a(-26567, 32641)), a(-26566, -19388));
         }

         var10000 = this.R;
      }

      return var10000;
   }

   public int U() {
      return this.Z;
   }

   public void F(int var1) {
      this.Z = var1;
   }

   public boolean Y$boolean() {
      return this.r;
   }

   public void u(boolean var1) {
      this.r = var1;
   }

   public int i() {
      return this.p;
   }

   public void T(int var1) {
      II var4;
      label23: {
         String var2 = Wb2.m$String();
         int var10000 = this.p;
         if (var2 != null) {
            if (this.p == var1) {
               return;
            }

            this.d = this.p;
            this.p = var1;
            this.repaint();
            var4 = this;
            if (var2 == null) {
               break label23;
            }

            var10000 = (this.r) ? 1 : 0;
         }

         if (var10000 != 0) {
            Rectangle var3 = this.l(var1);
            FN.g(this.Y$SZ(), var3.x + var3.width / 2 - this.getVisibleRect().width / 2, var3.y);
         }

         var4 = this;
      }

      var4.O();
   }

   public void O() {
      String var1 = Wb2.m$String();
      if (var1 != null) {
         if (this.s != null) {
            if (var1 == null) {
               return;
            }

            if (this.s.i()) {
               this.s.Y();
            }
         }

         this.f = 0.0F;
         this.s = new WC_2(a(-26568, -27797), GO.L, new CF_3(this));
         this.s.u$WC();
      }
   }

   public Rectangle l(int var1) {
      int var3;
      int var4;
      int var9;
      label14: {
         var3 = ((ImageIcon)this.e.get(var1)).getIconWidth();
         String var10000 = Wb2.m$String();
         var4 = ((ImageIcon)this.e.get(var1)).getIconHeight();
         String var2 = var10000;
         Dimension var5 = this.getPreferredSize();
         var9 = this.getWidth();
         int var10001 = var5.width;
         if (var2 != null) {
            if (var9 <= var5.width) {
               var9 = 0;
               break label14;
            }

            var9 = this.getWidth() - var5.width;
            var10001 = 2;
         }

         var9 /= var10001;
      }

      int var6 = var9 + a(23296, 5169269775888493519L) + (this.k + a(23296, 5169269775888493519L)) * var1 + this.k / 2;
      int var7 = this.getHeight() / 2 - a(7022, 41280091240328107L) - var4 / 2;
      return new Rectangle(var6 - var3 / 2, var7 - var4 / 2, var3, var4);
   }

   public void V(ImageIcon var1) {
      this.U(0, var1);
   }

   public void U(int var1, ImageIcon var2) {
      try {
         ImageIcon var3 = Xg2.q(var2, this.Z);
         int var4 = var3.getIconWidth();
         int var5 = var3.getIconHeight();
         BufferedImage var6 = Xg2.g(var4, var5, 3);
         Graphics2D var7 = var6.createGraphics();
         RV.X(var7);
         var7.drawImage(var3.getImage(), 0, 0, null);
         var7.setComposite(AlphaComposite.getInstance(a(14432, 8129159732006996139L)));
         var7.setPaint(
            new GradientPaint(0.0F, (float)var5 * 0.3F, new Color(0, 0, 0, 0), 0.0F, (float)var5, new Color(0, 0, 0, a(25015, 9185314684683719034L)))
         );
         var7.fillRect(0, 0, var4, var5);
         var7.dispose();
         this.e.add(var1, var3);
         this.j.add(var1, var2.getIconWidth() + a(-26561, -1343) + var2.getIconHeight() + a(-26563, -27126));
         this.Y.add(var1, var6);
      } catch (Throwable var8) {
      }

      this.w();
      this.v();
   }

   public void g(ImageIcon var1) {
      String var2 = Wb2.m$String();
      II var10000 = this;
      if (var2 != null) {
         if (!this.e.contains(var1)) {
            return;
         }

         var10000 = this;
      }

      var10000.G(this.e.indexOf(var1));
   }

   public void G(int var1) {
      String var2 = Wb2.m$String();
      int var10000 = var1;
      if (var2 != null) {
         if (var1 < 0) {
            return;
         }

         var10000 = var1;
      }

      label53: {
         int var10001 = this.e.size();
         if (var2 != null) {
            if (var10000 >= var10001) {
               return;
            }

            var10000 = this.i();
            if (var2 == null) {
               break label53;
            }

            var10001 = var1;
         }

         var10000 = var10000 == var10001 ? 1 : 0;
      }

      label63: {
         int var3 = var10000;
         this.e.remove(var1);
         this.j.remove(var1);
         ((BufferedImage)this.Y.remove(var1)).flush();
         this.w();
         this.v();
         var10000 = var3;
         if (var2 != null) {
            if (var3 == 0) {
               return;
            }

            var5 = this;
            if (var2 == null) {
               break label63;
            }

            var10000 = this.e.size();
         }

         if (var10000 <= 0) {
            return;
         }

         var5 = this;
      }

      int var7;
      label33: {
         var7 = var1;
         int var10002 = this.e.size();
         if (var2 != null) {
            if (var1 < var10002) {
               var7 = var1;
               break label33;
            }

            var7 = var1;
            var10002 = 1;
         }

         var7 -= var10002;
      }

      var5.T(var7);
   }

   public void v() {
      String var1 = Wb2.m$String();
      II var10000 = this;
      if (var1 != null) {
         if (this.getParent() instanceof JComponent) {
            ((JComponent)this.getParent()).revalidate();
         }

         var10000 = this;
      }

      var10000.repaint();
   }

   public void w() {
      String var10000 = Wb2.m$String();
      Iterator var2 = this.e.iterator();
      String var1 = var10000;

      while (var2.hasNext()) {
         ImageIcon var3 = (ImageIcon)var2.next();
         this.k = Math.max(this.k, var3.getIconWidth());
         this.O = Math.max(this.O, var3.getIconHeight());
         if (var1 == null) {
            break;
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var3 = this.getHeight();
      int var4 = this.getWidth();
      String var10000 = Wb2.m$String();
      Graphics2D var5 = (Graphics2D)var1;
      Object var6 = RV.X(var5);
      var5.setPaint(new GradientPaint(0.0F, 0.0F, Color.black, 0.0F, (float)var3, Color.darkGray));
      var5.fillRect(0, 0, var4, var3);
      Rectangle var7 = this.getVisibleRect();
      String var2 = var10000;
      Dimension var8 = this.getPreferredSize();
      Composite var9 = var5.getComposite();
      int var10 = 0;

      while (true) {
         if (var10 < this.e.size()) {
            if (var2 == null) {
               break;
            }

            label132: {
               var10000 = this.l(var10);
               if (var2 != null) {
                  if (!var10000.intersects(var7) && var2 != null) {
                     break label132;
                  }

                  var10000 = (String)this.e.get(var10);
               }

               BufferedImage var12;
               int var13;
               int var14;
               label120: {
                  ImageIcon var11 = (ImageIcon)var10000;
                  var12 = Xg2.Z(var11);
                  var13 = var11.getIconWidth();
                  var14 = var11.getIconHeight();
                  int var27 = this.getWidth();
                  int var10001 = var8.width;
                  if (var2 != null) {
                     if (var27 <= var8.width) {
                        var28 = 0;
                        break label120;
                     }

                     var27 = this.getWidth() - var8.width;
                     var10001 = 2;
                  }

                  var28 = var27 / var10001;
               }

               int var15;
               int var16;
               int var17;
               label114: {
                  var15 = var28 + a(23296, 5169269775888493519L) + (this.k + a(23296, 5169269775888493519L)) * var10 + this.k / 2;
                  var16 = var3 / 2 - a(31847, 2939842551265627316L) - var14 / 2;
                  var17 = var3 / 2 + a(31847, 2939842551265627316L) + var14 / 2;
                  int var29 = this.p;
                  int var37 = var10;
                  if (var2 != null) {
                     if (this.p == var10) {
                        var30 = this.f * 0.4F;
                        break label114;
                     }

                     var29 = this.d;
                     var37 = var10;
                  }

                  var30 = var29 == var37 ? 0.4F - this.f * 0.4F : 0.0F;
               }

               Area var19;
               int var39;
               label107: {
                  label106: {
                     label105: {
                        label133: {
                           float var18 = var30;
                           var5.setComposite(AlphaComposite.getInstance(3, 0.6F + var18));
                           var5.drawImage(var12, var15 - var13 / 2, var16 - var14 / 2, null);
                           var5.setPaint(this.p == var10 ? Color.WHITE : Color.GRAY);
                           var19 = new Area(
                              new Double(
                                 (double)(var15 - var13 / 2 - 3),
                                 (double)(var16 - var14 / 2 - 3),
                                 (double)(var13 + a(24403, 3740709584549031833L)),
                                 (double)(var14 + a(24403, 3740709584549031833L)),
                                 6.0,
                                 6.0
                              )
                           );
                           var19.subtract(new Area(new Rectangle(var15 - var13 / 2, var16 - var14 / 2, var13, var14)));
                           var5.fill(var19);
                           var5.setComposite(var9);
                           int var31 = this.p;
                           var39 = var10;
                           if (var2 != null) {
                              if (this.p != var10) {
                                 var32 = this.d;
                                 var39 = var10;
                                 if (var2 == null) {
                                    break label107;
                                 }

                                 if (this.d != var10) {
                                    break label106;
                                 }
                              }

                              var33 = this;
                              if (var2 == null) {
                                 break label133;
                              }

                              var31 = this.p;
                              var39 = var10;
                           }

                           if (var31 != var39) {
      int var32;
      int var32;
                              var34 = 1.0F - this.f;
                              break label105;
                           }

                           var33 = this;
                        }

                        var34 = var33.f;
                     }

                     float var20 = var34;
                     var5.setComposite(AlphaComposite.getInstance(3, var20));
                     var5.setPaint(Color.WHITE);
                     String var21 = (String)this.j.get(var10);
                     Point var22 = GA.A(var5.getFontMetrics(), var21);
                     var5.drawString(var21, var15 + var22.x, this.getHeight() / 2 + a(31847, 2939842551265627316L) + var22.y);
                     var5.setComposite(var9);
                  }

                  var32 = var13;
                  var39 = a(24403, 3740709584549031833L);
               }

               int var23;
               int var24;
               label135: {
                  var23 = var32 + var39;
                  var24 = var14 + a(24403, 3740709584549031833L);
                  int var35 = this.p;
                  var39 = var10;
                  if (var2 != null) {
                     if (this.p == var10) {
                        var36 = Math.round(this.f * 20.0F);
                        break label135;
                     }

                     var35 = this.d;
                     var39 = var10;
                  }

                  if (var2 != null) {
                     if (var35 != var39) {
                        var36 = 0;
                        break label135;
                     }

                     var35 = a(23296, 5169269775888493519L);
                     var39 = Math.round(this.f * 20.0F);
                  }

                  var36 = var35 - var39;
               }

               int var25 = var36;
               if (var2 != null) {
                  if (this.Y.get(var10) != null) {
                     var5.drawImage((Image)this.Y.get(var10), var15 - var13 / 2, var17 + var14 / 2 + var25, var13, -var14, null);
                  }

                  var19 = new Area(new Double((double)(var15 - var23 / 2), (double)(var17 - var24 / 2 + var25), (double)var23, (double)var24, 6.0, 6.0));
                  var19.subtract(
                     new Area(
                        new Rectangle(
                           var15 - var23 / 2 + 3, var17 - var24 / 2 + var25 + 3, var23 - a(24403, 3740709584549031833L), var24 - a(24403, 3740709584549031833L)
                        )
                     )
                  );
               }

               var5.setPaint(
                  new GradientPaint(
                     0.0F,
                     (float)(var17 - var14 / 2 + var25),
                     this.p == var10 ? this.M : this.i,
                     0.0F,
                     (float)(var17 - var14 / 2 + var25) + (float)var14 * 0.7F,
                     this.p == var10 ? this.B : this.t
                  )
               );
               var5.fill(var19);
            }

            var10++;
            if (var2 != null) {
               continue;
            }
         }

         RV.X(var5, var6);
         break;
      }
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(a(23296, 5169269775888493519L) * (this.e.size() + 1) + this.k * this.e.size(), a(23427, 2024366731169606474L) + this.O * 2);
   }

   static List d(II var0) {
      return var0.e;
   }

   static int a(II var0) {
      return var0.W;
   }

   static int i(II var0) {
      return var0.k;
   }

   static float Z(II var0) {
      return var0.f;
   }

   static float k(II var0, float var1) {
      return var0.f += var1;
   }

   static float T(II var0, float var1) {
      return var0.f = var1;
   }

   static WC_2 I(II var0) {
      return var0.s;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -26562) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 208;
               break;
            case 1:
               var10000 = 153;
               break;
            case 2:
               var10000 = 132;
               break;
            case 3:
               var10000 = 140;
               break;
            case 4:
               var10000 = 94;
               break;
            case 5:
               var10000 = 236;
               break;
            case 6:
               var10000 = 161;
               break;
            case 7:
               var10000 = 178;
               break;
            case 8:
               var10000 = 69;
               break;
            case 9:
               var10000 = 36;
               break;
            case 10:
               var10000 = 125;
               break;
            case 11:
               var10000 = 237;
               break;
            case 12:
               var10000 = 71;
               break;
            case 13:
               var10000 = 86;
               break;
            case 14:
               var10000 = 61;
               break;
            case 15:
               var10000 = 35;
               break;
            case 16:
               var10000 = 85;
               break;
            case 17:
               var10000 = 135;
               break;
            case 18:
               var10000 = 136;
               break;
            case 19:
               var10000 = 147;
               break;
            case 20:
               var10000 = 66;
               break;
            case 21:
               var10000 = 8;
               break;
            case 22:
               var10000 = 195;
               break;
            case 23:
               var10000 = 223;
               break;
            case 24:
               var10000 = 242;
               break;
            case 25:
               var10000 = 81;
               break;
            case 26:
               var10000 = 126;
               break;
            case 27:
               var10000 = 59;
               break;
            case 28:
               var10000 = 96;
               break;
            case 29:
               var10000 = 250;
               break;
            case 30:
               var10000 = 99;
               break;
            case 31:
               var10000 = 113;
               break;
            case 32:
               var10000 = 170;
               break;
            case 33:
               var10000 = 196;
               break;
            case 34:
               var10000 = 16;
               break;
            case 35:
               var10000 = 123;
               break;
            case 36:
               var10000 = 224;
               break;
            case 37:
               var10000 = 122;
               break;
            case 38:
               var10000 = 0;
               break;
            case 39:
               var10000 = 148;
               break;
            case 40:
               var10000 = 4;
               break;
            case 41:
               var10000 = 107;
               break;
            case 42:
               var10000 = 53;
               break;
            case 43:
               var10000 = 133;
               break;
            case 44:
               var10000 = 220;
               break;
            case 45:
               var10000 = 38;
               break;
            case 46:
               var10000 = 221;
               break;
            case 47:
               var10000 = 56;
               break;
            case 48:
               var10000 = 200;
               break;
            case 49:
               var10000 = 77;
               break;
            case 50:
               var10000 = 171;
               break;
            case 51:
               var10000 = 87;
               break;
            case 52:
               var10000 = 14;
               break;
            case 53:
               var10000 = 76;
               break;
            case 54:
               var10000 = 189;
               break;
            case 55:
               var10000 = 120;
               break;
            case 56:
               var10000 = 163;
               break;
            case 57:
               var10000 = 179;
               break;
            case 58:
               var10000 = 111;
               break;
            case 59:
               var10000 = 58;
               break;
            case 60:
               var10000 = 175;
               break;
            case 61:
               var10000 = 247;
               break;
            case 62:
               var10000 = 102;
               break;
            case 63:
               var10000 = 145;
               break;
            case 64:
               var10000 = 128;
               break;
            case 65:
               var10000 = 150;
               break;
            case 66:
               var10000 = 83;
               break;
            case 67:
               var10000 = 185;
               break;
            case 68:
               var10000 = 165;
               break;
            case 69:
               var10000 = 180;
               break;
            case 70:
               var10000 = 246;
               break;
            case 71:
               var10000 = 62;
               break;
            case 72:
               var10000 = 60;
               break;
            case 73:
               var10000 = 156;
               break;
            case 74:
               var10000 = 90;
               break;
            case 75:
               var10000 = 124;
               break;
            case 76:
               var10000 = 129;
               break;
            case 77:
               var10000 = 52;
               break;
            case 78:
               var10000 = 92;
               break;
            case 79:
               var10000 = 100;
               break;
            case 80:
               var10000 = 168;
               break;
            case 81:
               var10000 = 154;
               break;
            case 82:
               var10000 = 229;
               break;
            case 83:
               var10000 = 218;
               break;
            case 84:
               var10000 = 40;
               break;
            case 85:
               var10000 = 176;
               break;
            case 86:
               var10000 = 143;
               break;
            case 87:
               var10000 = 93;
               break;
            case 88:
               var10000 = 5;
               break;
            case 89:
               var10000 = 191;
               break;
            case 90:
               var10000 = 73;
               break;
            case 91:
               var10000 = 228;
               break;
            case 92:
               var10000 = 47;
               break;
            case 93:
               var10000 = 141;
               break;
            case 94:
               var10000 = 30;
               break;
            case 95:
               var10000 = 15;
               break;
            case 96:
               var10000 = 252;
               break;
            case 97:
               var10000 = 106;
               break;
            case 98:
               var10000 = 155;
               break;
            case 99:
               var10000 = 28;
               break;
            case 100:
               var10000 = 226;
               break;
            case 101:
               var10000 = 43;
               break;
            case 102:
               var10000 = 12;
               break;
            case 103:
               var10000 = 183;
               break;
            case 104:
               var10000 = 204;
               break;
            case 105:
               var10000 = 1;
               break;
            case 106:
               var10000 = 144;
               break;
            case 107:
               var10000 = 241;
               break;
            case 108:
               var10000 = 164;
               break;
            case 109:
               var10000 = 158;
               break;
            case 110:
               var10000 = 240;
               break;
            case 111:
               var10000 = 243;
               break;
            case 112:
               var10000 = 194;
               break;
            case 113:
               var10000 = 184;
               break;
            case 114:
               var10000 = 192;
               break;
            case 115:
               var10000 = 146;
               break;
            case 116:
               var10000 = 49;
               break;
            case 117:
               var10000 = 115;
               break;
            case 118:
               var10000 = 112;
               break;
            case 119:
               var10000 = 11;
               break;
            case 120:
               var10000 = 89;
               break;
            case 121:
               var10000 = 254;
               break;
            case 122:
               var10000 = 169;
               break;
            case 123:
               var10000 = 32;
               break;
            case 124:
               var10000 = 78;
               break;
            case 125:
               var10000 = 82;
               break;
            case 126:
               var10000 = 198;
               break;
            case 127:
               var10000 = 74;
               break;
            case 128:
               var10000 = 19;
               break;
            case 129:
               var10000 = 160;
               break;
            case 130:
               var10000 = 44;
               break;
            case 131:
               var10000 = 84;
               break;
            case 132:
               var10000 = 70;
               break;
            case 133:
               var10000 = 182;
               break;
            case 134:
               var10000 = 201;
               break;
            case 135:
               var10000 = 244;
               break;
            case 136:
               var10000 = 233;
               break;
            case 137:
               var10000 = 167;
               break;
            case 138:
               var10000 = 64;
               break;
            case 139:
               var10000 = 21;
               break;
            case 140:
               var10000 = 7;
               break;
            case 141:
               var10000 = 101;
               break;
            case 142:
               var10000 = 91;
               break;
            case 143:
               var10000 = 17;
               break;
            case 144:
               var10000 = 231;
               break;
            case 145:
               var10000 = 157;
               break;
            case 146:
               var10000 = 9;
               break;
            case 147:
               var10000 = 239;
               break;
            case 148:
               var10000 = 222;
               break;
            case 149:
               var10000 = 235;
               break;
            case 150:
               var10000 = 3;
               break;
            case 151:
               var10000 = 41;
               break;
            case 152:
               var10000 = 166;
               break;
            case 153:
               var10000 = 105;
               break;
            case 154:
               var10000 = 199;
               break;
            case 155:
               var10000 = 207;
               break;
            case 156:
               var10000 = 39;
               break;
            case 157:
               var10000 = 34;
               break;
            case 158:
               var10000 = 217;
               break;
            case 159:
               var10000 = 103;
               break;
            case 160:
               var10000 = 173;
               break;
            case 161:
               var10000 = 33;
               break;
            case 162:
               var10000 = 142;
               break;
            case 163:
               var10000 = 116;
               break;
            case 164:
               var10000 = 65;
               break;
            case 165:
               var10000 = 162;
               break;
            case 166:
               var10000 = 188;
               break;
            case 167:
               var10000 = 134;
               break;
            case 168:
               var10000 = 54;
               break;
            case 169:
               var10000 = 72;
               break;
            case 170:
               var10000 = 139;
               break;
            case 171:
               var10000 = 31;
               break;
            case 172:
               var10000 = 203;
               break;
            case 173:
               var10000 = 45;
               break;
            case 174:
               var10000 = 26;
               break;
            case 175:
               var10000 = 27;
               break;
            case 176:
               var10000 = 42;
               break;
            case 177:
               var10000 = 75;
               break;
            case 178:
               var10000 = 205;
               break;
            case 179:
               var10000 = 186;
               break;
            case 180:
               var10000 = 187;
               break;
            case 181:
               var10000 = 206;
               break;
            case 182:
               var10000 = 18;
               break;
            case 183:
               var10000 = 253;
               break;
            case 184:
               var10000 = 118;
               break;
            case 185:
               var10000 = 25;
               break;
            case 186:
               var10000 = 193;
               break;
            case 187:
               var10000 = 24;
               break;
            case 188:
               var10000 = 104;
               break;
            case 189:
               var10000 = 109;
               break;
            case 190:
               var10000 = 255;
               break;
            case 191:
               var10000 = 63;
               break;
            case 192:
               var10000 = 37;
               break;
            case 193:
               var10000 = 29;
               break;
            case 194:
               var10000 = 214;
               break;
            case 195:
               var10000 = 211;
               break;
            case 196:
               var10000 = 121;
               break;
            case 197:
               var10000 = 213;
               break;
            case 198:
               var10000 = 117;
               break;
            case 199:
               var10000 = 209;
               break;
            case 200:
               var10000 = 177;
               break;
            case 201:
               var10000 = 245;
               break;
            case 202:
               var10000 = 232;
               break;
            case 203:
               var10000 = 159;
               break;
            case 204:
               var10000 = 48;
               break;
            case 205:
               var10000 = 238;
               break;
            case 206:
               var10000 = 152;
               break;
            case 207:
               var10000 = 225;
               break;
            case 208:
               var10000 = 114;
               break;
            case 209:
               var10000 = 67;
               break;
            case 210:
               var10000 = 98;
               break;
            case 211:
               var10000 = 127;
               break;
            case 212:
               var10000 = 50;
               break;
            case 213:
               var10000 = 251;
               break;
            case 214:
               var10000 = 80;
               break;
            case 215:
               var10000 = 216;
               break;
            case 216:
               var10000 = 210;
               break;
            case 217:
               var10000 = 88;
               break;
            case 218:
               var10000 = 119;
               break;
            case 219:
               var10000 = 212;
               break;
            case 220:
               var10000 = 137;
               break;
            case 221:
               var10000 = 68;
               break;
            case 222:
               var10000 = 2;
               break;
            case 223:
               var10000 = 130;
               break;
            case 224:
               var10000 = 181;
               break;
            case 225:
               var10000 = 202;
               break;
            case 226:
               var10000 = 13;
               break;
            case 227:
               var10000 = 227;
               break;
            case 228:
               var10000 = 57;
               break;
            case 229:
               var10000 = 151;
               break;
            case 230:
               var10000 = 79;
               break;
            case 231:
               var10000 = 108;
               break;
            case 232:
               var10000 = 172;
               break;
            case 233:
               var10000 = 248;
               break;
            case 234:
               var10000 = 10;
               break;
            case 235:
               var10000 = 23;
               break;
            case 236:
               var10000 = 95;
               break;
            case 237:
               var10000 = 6;
               break;
            case 238:
               var10000 = 215;
               break;
            case 239:
               var10000 = 230;
               break;
            case 240:
               var10000 = 97;
               break;
            case 241:
               var10000 = 219;
               break;
            case 242:
               var10000 = 197;
               break;
            case 243:
               var10000 = 149;
               break;
            case 244:
               var10000 = 20;
               break;
            case 245:
               var10000 = 174;
               break;
            case 246:
               var10000 = 22;
               break;
            case 247:
               var10000 = 51;
               break;
            case 248:
               var10000 = 138;
               break;
            case 249:
               var10000 = 249;
               break;
            case 250:
               var10000 = 46;
               break;
            case 251:
               var10000 = 55;
               break;
            case 252:
               var10000 = 234;
               break;
            case 253:
               var10000 = 190;
               break;
            case 254:
               var10000 = 131;
               break;
            default:
               var10000 = 110;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28866;
      if (g[var3] == null) {
         g[var3] = (int)(c[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[9];
      int var11 = 0;
      String var10 = "´}\u0003\u00956#\u0004\u008ctÉ\u009f\u0003!5í\u0004·6®×\u0004\u001e\u0013Í|#\u0094ÎØ¯\u000e\u001dÜ7\u0018Û6\f«¨yH\u009eqßb\u008er#½\u0007ËÆ\u000föI§\u007f\u0011'*";
      int var12 = "´}\u0003\u00956#\u0004\u008ctÉ\u009f\u0003!5í\u0004·6®×\u0004\u001e\u0013Í|#\u0094ÎØ¯\u000e\u001dÜ7\u0018Û6\f«¨yH\u009eqßb\u008er#½\u0007ËÆ\u000föI§\u007f\u0011'*"
         .length();
      char var9 = 2;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 38;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 90;
                        break;
                     case 1:
                        var65 = 106;
                        break;
                     case 2:
                        var65 = 60;
                        break;
                     case 3:
                        var65 = 89;
                        break;
                     case 4:
                        var65 = 51;
                        break;
                     case 5:
                        var65 = 32;
                        break;
                     default:
                        var65 = 62;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[9];
                     long var0 = 6682705630396613201L;
                     long[] var6 = new long[18];
                     int var3 = 0;
                     String var4 = "\u0012\u009b*\u0002\u001aØä}Rw@\u000f\u0000OÏù<¼[\u001f(öÀ¶¨¥\u0084Û\u0010U\u0099Íät\\µ©\u00872jJ¥\u0090]#´WBª\u008c\u0011\u009a >¿\u007f\u0088äC´pçéðÝé\u0095t\fº\u00adÎeþJ\u0094\u0082äÊü+äÍ·sÒ&\u0006\u008d´_\u008eD0©'ÏÈ\u0085å·¬æ¿¦BÊRe´)\u008a(Ù=$p¤ûñiCM\u009ft\u008b\u0093V";
                     int var5 = "\u0012\u009b*\u0002\u001aØä}Rw@\u000f\u0000OÏù<¼[\u001f(öÀ¶¨¥\u0084Û\u0010U\u0099Íät\\µ©\u00872jJ¥\u0090]#´WBª\u008c\u0011\u009a >¿\u007f\u0088äC´pçéðÝé\u0095t\fº\u00adÎeþJ\u0094\u0082äÊü+äÍ·sÒ&\u0006\u008d´_\u008eD0©'ÏÈ\u0085å·¬æ¿¦BÊRe´)\u008a(Ù=$p¤ûñiCM\u009ft\u008b\u0093V"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    g = new Integer[18];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ÞwRZ\u0084\u00ad1Àò\u0093¡K5\u008f\u000eï";
                                 var5 = "ÞwRZ\u0084\u00ad1Àò\u0093¡K5\u008f\u000eï".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\u0013>\u008c=\u0018\u0004Û\u0094Iù";
                  var12 = "\u0013>\u008c=\u0018\u0004Û\u0094Iù".length();
                  var9 = 5;
                  var17 = -1;
            }

            var10000 = 6;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






