package com.finalshell.ui.panel;

import com.finalshell.core.FN;
import com.finalshell.core.NE;
import com.finalshell.core.RV;
import com.finalshell.core.TT;
import com.finalshell.task.Rj2;
import com.finalshell.task.Yk4;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

public class Qm2 extends Ky4 {
   public String H;
   public Shape Y;
   public BufferedImage c;
   public Point w;
   public int n;
   public List U;
   public Component F;
   public int T;
   public static boolean s;
   public static String a;
   public static long[] b;
   public static Integer[] d;

   public Qm2() {
      boolean var10000 = Z$boolean();
      this.H = null;
      this.Y = null;
      this.c = null;
      this.w = null;
      this.n = 0;
      boolean var1 = var10000;
      this.U = new ArrayList();
      this.F = this;
      this.T = a(21387, 4310451735439962977L);
      this.setOpaque(false);
      this.setFocusable(false);
      this.setLayout(new TT());
      if (var1) {
         Ky4.K(new String[2]);
      }
   }

   public TT Q() {
      return (TT)this.getLayout();
   }

   public void U(LayoutManager var1) {
      this.Q().S(var1);
   }

   public void T(LayoutManager var1) {
      this.Q().X(var1);
   }

   public String g$String() {
      boolean var1 = Z$boolean();
      String var10000 = this.H;
      if (!var1) {
         if (this.H == null) {
            this.H = NE.E(a);
         }

         var10000 = this.H;
      }

      return var10000;
   }

   @Override
   public JRootPane getRootPane() {
      return FN.a$JRootPane(this);
   }

   public void b(JComponent var1) {
      FN.y(this, var1);
      this.add(var1, 0);
      this.revalidate();
   }

   @Override
   public boolean contains(int var1, int var2) {
      boolean var3 = Z$boolean();
      Shape var10000 = this.Y;
      if (!var3) {
         if (this.Y == null) {
            return false;
         }

         var10000 = this.Y;
      }

      boolean var4 = var10000.contains((double)var1, (double)var2);
      return var3 ? var4 : var4;
   }

   public Shape Z$Shape() {
      return this.Y;
   }

   public void U(Shape var1) {
      this.Y = var1;
   }

   public int g$int() {
      return this.n;
   }

   public Point X() {
      return this.w;
   }

   public BufferedImage c() {
      return this.c;
   }

   public void u(BufferedImage var1, Point var2) {
      this.V(var1, var2, a(18436, 7369282829254715627L));
   }

   public void V(BufferedImage var1, Point var2, int var3) {
      boolean var4;
      Rectangle var5;
      Rectangle var6;
      Rectangle var9;
      label54: {
         label57: {
            boolean var10000 = Z$boolean();
            var5 = this.t();
            this.c = var1;
            this.w = var2;
            this.n = var3;
            var4 = var10000;
            var6 = null;
            Qm2 var8 = this;
            if (!var4) {
               if (this.n == 0) {
                  break label57;
               }

               var8 = this;
            }

            if (!var4) {
               if (var8.c == null) {
                  break label57;
               }

               var8 = this;
            }

            if (!var4) {
               if (var8.w == null) {
                  break label57;
               }

               var8 = this;
            }

            var6 = var8.t();
            var9 = var5;
            if (var4) {
               break label54;
            }

            if (var5 != null) {
               var6 = new Rectangle(
                  Math.max(0, Math.min(var5.x, var6.x)),
                  Math.max(0, Math.min(var5.y, var6.y)),
                  Math.max(var5.x + var5.width, var6.x + var6.width),
                  Math.max(var5.y + var5.height, var6.y + var6.height)
               );
            }
         }

         var9 = var6;
      }

      if (!var4) {
         var9 = var9 != null ? var6 : var5;
      }

      Rectangle var7 = var9;
      SwingUtilities.invokeLater(new Yk4(this, var7));
      if (Ky4.F$arrString() != null) {
         d(!var4);
      }
   }

   public void K() {
      Rectangle var1 = this.t();
      this.n = 0;
      this.c = null;
      this.w = null;
      if (var1 != null) {
         SwingUtilities.invokeLater(new Rj2(this, var1));
      }
   }

   public Rectangle t() {
      boolean var10000 = n();
      Rectangle var2 = null;
      boolean var1 = var10000;
      Qm2 var3 = this;
      if (var1) {
         if (this.n == 0) {
            return var2;
         }

         var3 = this;
      }

      if (var1) {
         if (var3.c == null) {
            return var2;
         }

         var3 = this;
      }

      if (var3.w != null) {
         var2 = new Rectangle(this.w.x, this.w.y, this.c.getWidth(), this.c.getHeight());
      }

      return var2;
   }

   public void M(Component[] var1) {
      Component[] var3 = var1;
      boolean var10000 = Z$boolean();
      int var4 = var1.length;
      boolean var2 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            Component var6 = var3[var5];
            if (!var2) {
               var7 = this;
               if (var2) {
                  break;
               }

               if (!this.U.contains(var6)) {
                  this.U.add(var6);
               }

               var5++;
            }

            if (!var2) {
               continue;
            }
         }

         var7 = this;
         break;
      }

      var7.repaint();
   }

   public void N(List var1) {
      boolean var10000 = Z$boolean();
      Iterator var3 = var1.iterator();
      boolean var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            Component var4 = (Component)var3.next();
            var5 = this;
            if (var2) {
               break;
            }

            if (!var2 && !this.U.contains(var4)) {
               this.U.add(var4);
            }

            if (!var2) {
               continue;
            }
         }

         var5 = this;
         break;
      }

      var5.repaint();
   }

   public void C(Component[] var1) {
      boolean var10000 = n();
      Component[] var3 = var1;
      boolean var2 = var10000;
      int var4 = var1.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            Component var6 = var3[var5];
            this.U.remove(var6);
            var5++;
            if (!var2) {
               break;
            }

            if (var2) {
               continue;
            }
         }

         this.repaint();
         break;
      }
   }

   public void q(List var1) {
      boolean var10000 = Z$boolean();
      Iterator var3 = var1.iterator();
      boolean var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            Component var4 = (Component)var3.next();
            this.U.remove(var4);
            if (var2) {
               break;
            }

            if (!var2) {
               continue;
            }
         }

         this.repaint();
         break;
      }
   }

   public void w() {
      this.U.clear();
      this.repaint();
   }

   public Component H() {
      return this.F;
   }

   public void a(Component var1) {
      this.F = var1;
   }

   public int l() {
      return this.T;
   }

   public void v(int var1) {
      this.T = var1;
   }

   @Override
   public void paintComponent(Graphics var1) {
      Graphics2D var3;
      Object var4;
      label76: {
         boolean var2;
         Qm2 var14;
         label77: {
            super.paintComponent(var1);
            var3 = (Graphics2D)var1;
            boolean var10000 = n();
            var4 = RV.X(var3);
            var2 = var10000;
            var12 = this.U.size();
            label71:
            if (var2) {
               if (var12 > 0) {
                  Rectangle var5 = FN.J(this.F, this);
                  Area var6 = new Area(new Rectangle(var5.x - 1, var5.y - 1, var5.width + 1, var5.height + 1));

                  for (Component var8 : this.U) {
                     label63: {
                        Component var13 = var8;
                        if (var2) {
                           var12 = var8.isShowing();
                           if (!var2) {
                              break label71;
                           }

                           if (var12 == 0) {
                              break label63;
                           }

                           var13 = var8;
                        }

                        Rectangle var9 = FN.J(var13, this);
                        Double var10 = new Double(
                           (double)(var9.x - this.T),
                           (double)(var9.y - this.T),
                           (double)(var9.width + this.T * 2 - 1),
                           (double)(var9.height + this.T * 2 - 1),
                           8.0,
                           8.0
                        );
                        var6.subtract(new Area(var10));
                     }

                     if (!var2) {
                        break;
                     }
                  }

                  var3.setPaint(
                     new Color(a(27997, 8817442694465473969L), a(16261, 889085585787658088L), a(16261, 889085585787658088L), a(16261, 889085585787658088L))
                  );
                  var3.fill(var6);
                  var3.setStroke(new BasicStroke(1.5F));
                  var3.setPaint(Color.GRAY);
                  var3.draw(var6);
               }

               var14 = this;
               if (!var2) {
                  break label77;
               }

               var12 = this.n;
            }

            if (var12 == 0) {
               break label76;
            }

            var14 = this;
         }

         if (var2) {
            if (var14.c == null) {
               break label76;
            }

            var14 = this;
         }

         if (var14.w != null) {
            Composite var11 = var3.getComposite();
            int var15 = this.n;
            int var10001 = a(13655, 6594421190855693753L);
            if (var2) {
               if (var15 != var10001) {
                  var3.setComposite(AlphaComposite.getInstance(3, (float)this.n / 100.0F));
               }

               var3.drawImage(this.c, this.w.x, this.w.y, null);
               if (!var2) {
                  return;
               }

               var15 = this.n;
               var10001 = a(13655, 6594421190855693753L);
            }

            if (var15 != var10001) {
               var3.setComposite(var11);
            }
         }
      }

      RV.X(var3, var4);
   }

   public static void d(boolean var0) {
      s = var0;
   }

   public static boolean n() {
      return s;
   }

   public static boolean Z$boolean() {
      boolean var0 = n();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8430;
      if (d[var3] == null) {
         d[var3] = (int)(b[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (Z$boolean()) {
         d(true);
      }

      char[] var10003 = "7+w".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 119;
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
         var10007 = 119;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 23;
               break;
            case 1:
               var50 = 27;
               break;
            case 2:
               var50 = 80;
               break;
            case 3:
               var50 = 29;
               break;
            case 4:
               var50 = 60;
               break;
            case 5:
               var50 = 70;
               break;
            default:
               var50 = 90;
         }
      } else {
         var34 = 119;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 7074391755411320242L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "D\u009eøæ»}xo\u001a\u0081¦â¸\"\u0085=áh±c1Ä \u0083";
            int var13 = "D\u009eøæ»}xo\u001a\u0081¦â¸\"\u0085=áh±c1Ä \u0083".length();
            byte var10 = 0;

            label75:
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
                           d = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label75;
                        }

                        var12 = "b\u0082x!ìõrZ±G@<ßc\u001eÐ";
                        var13 = "b\u0082x!ìõrZ±G@<ßc\u001eÐ".length();
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
         var10007 = 119;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 23;
               break;
            case 1:
               var50 = 27;
               break;
            case 2:
               var50 = 80;
               break;
            case 3:
               var50 = 29;
               break;
            case 4:
               var50 = 60;
               break;
            case 5:
               var50 = 70;
               break;
            default:
               var50 = 90;
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
                  var50 = 23;
                  break;
               case 1:
                  var50 = 27;
                  break;
               case 2:
                  var50 = 80;
                  break;
               case 3:
                  var50 = 29;
                  break;
               case 4:
                  var50 = 60;
                  break;
               case 5:
                  var50 = 70;
                  break;
               default:
                  var50 = 90;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 7074391755411320242L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "D\u009eøæ»}xo\u001a\u0081¦â¸\"\u0085=áh±c1Ä \u0083";
               int var5 = "D\u009eøæ»}xo\u001a\u0081¦â¸\"\u0085=áh±c1Ä \u0083".length();
               byte var2 = 0;

               label40:
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
                              d = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label40;
                           }

                           var4 = "b\u0082x!ìõrZ±G@<ßc\u001eÐ";
                           var5 = "b\u0082x!ìõrZ±G@<ßc\u001eÐ".length();
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
                  var50 = 23;
                  break;
               case 1:
                  var50 = 27;
                  break;
               case 2:
                  var50 = 80;
                  break;
               case 3:
                  var50 = 29;
                  break;
               case 4:
                  var50 = 60;
                  break;
               case 5:
                  var50 = 70;
                  break;
               default:
                  var50 = 90;
            }
         }
      }
   }
}





