package com.finalshell.ui.panel;

import com.finalshell.core.FN;
import com.finalshell.core.GA;
import com.finalshell.core.RV;
import com.finalshell.ui.listener.OA;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D.Double;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class E2 extends JComponent {
   protected ImageIcon A;
   protected String z;
   protected ActionListener N;
   protected Insets i;
   protected Insets y;
   protected boolean n;
   protected Color d;
   protected Color p;
   protected Color s;
   protected Color B;
   protected Color e;
   protected int h;
   public boolean R;
   public static int[] P;
   public static long[] a;
   public static Integer[] b;

   public E2() {
      this.i = new Insets(4, 4, 4, a(31996, 4209603805591045284L));
      this.y = new Insets(3, a(29034, 6368618771843352880L), 3, a(29034, 6368618771843352880L));
      this.n = true;
      this.d = new Color(a(8263, 9150545150521759748L), a(12572, 5788890216637843778L), a(21327, 5471555118541941529L));
      this.p = new Color(a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(3621, 2751923881239967335L));
      this.s = new Color(a(17170, 2800213068652526418L), a(31813, 8118117811896353816L), a(4969, 3738533369566292774L));
      this.B = new Color(a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(5027, 2965200349191891952L));
      this.e = new Color(0, 0, 0, a(21259, 8534173832681532249L));
      this.h = a(8109, 429707904663283680L);
      this.J();
   }

   public E2(ImageIcon var1) {
      P();
      this.i = new Insets(4, 4, 4, a(31996, 4209603805591045284L));
      this.y = new Insets(3, a(29034, 6368618771843352880L), 3, a(29034, 6368618771843352880L));
      this.n = true;
      this.d = new Color(a(8263, 9150545150521759748L), a(12572, 5788890216637843778L), a(21327, 5471555118541941529L));
      this.p = new Color(a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(3621, 2751923881239967335L));
      this.s = new Color(a(17170, 2800213068652526418L), a(31813, 8118117811896353816L), a(4969, 3738533369566292774L));
      this.B = new Color(a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(5027, 2965200349191891952L));
      this.e = new Color(0, 0, 0, a(21259, 8534173832681532249L));
      this.h = a(8109, 429707904663283680L);
      this.A = var1;
      this.J();
      if (Ky4.F$arrString() != null) {
         e(new int[3]);
      }
   }

   public E2(ImageIcon var1, ActionListener var2) {
      int[] var10000 = P();
      this.i = new Insets(4, 4, 4, a(18058, 3656411442400181971L));
      this.y = new Insets(3, a(32123, 6135835961800000807L), 3, a(29034, 6368618771843352880L));
      this.n = true;
      int[] var3 = var10000;
      this.d = new Color(a(13726, 3376026729723710938L), a(24799, 7034515197463894163L), a(17577, 2355875256826838262L));
      this.p = new Color(a(1927, 4478507602143084496L), a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(7008, 5230654407978050356L));
      this.s = new Color(a(29909, 9051301750686026885L), a(21044, 6808793299825109619L), a(13865, 2084936288226233960L));
      this.B = new Color(a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(11641, 1635284185339581736L), a(31911, 1676321222026364130L));
      this.e = new Color(0, 0, 0, a(16340, 148704197817059218L));
      this.h = a(31401, 3148976542452089586L);
      this.A = var1;
      this.N = var2;
      this.J();
      if (var3 != null) {
         Ky4.K(new String[4]);
      }
   }

   public void J() {
      this.setOpaque(false);
      this.setBackground(new Color(0, 0, 0, a(32198, 300269046934799763L)));
      this.setForeground(Color.WHITE);
      this.setFont(FN.V());
      FN.u(this);
      FN.K(this, 2);
      OA var1 = new OA(this);
      this.addMouseListener(var1);
      this.addMouseMotionListener(var1);
   }

   public ImageIcon h$ImageIcon() {
      return this.A;
   }

   public void c(ImageIcon var1) {
      this.A = var1;
   }

   public String W() {
      return this.z;
   }

   public void h(String var1) {
      this.z = var1;
   }

   public ActionListener V$ActionListener() {
      return this.N;
   }

   public void H(ActionListener var1) {
      this.N = var1;
   }

   public Insets V$Insets() {
      return this.i;
   }

   public void p(Insets var1) {
      this.i = var1;
   }

   public void Q(int var1) {
      this.i = new Insets(var1, var1, var1, var1);
   }

   public void H(int var1, int var2, int var3, int var4) {
      this.i = new Insets(var1, var2, var3, var4);
   }

   public boolean f() {
      return this.n;
   }

   public void D(boolean var1) {
      this.n = var1;
   }

   public Color p() {
      return this.d;
   }

   public void q(Color var1) {
      this.d = var1;
   }

   public Color h$Color() {
      return this.p;
   }

   public void f(Color var1) {
      this.p = var1;
   }

   public Color y() {
      return this.s;
   }

   public void b(Color var1) {
      this.s = var1;
   }

   public Color G() {
      return this.B;
   }

   public void d(Color var1) {
      this.B = var1;
   }

   public Color K() {
      return this.e;
   }

   public void R(Color var1) {
      this.e = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      int[] var10000 = P();
      super.paintComponent(var1);
      int[] var2 = var10000;
      Graphics2D var3 = (Graphics2D)var1;
      Object var4 = RV.X(var3);
      int var5 = this.getHeight();
      int var6 = var5 - this.i.top - this.i.bottom;
      E2 var17 = this;
      if (var2 == null) {
         if (this.A != null) {
            boolean var18 = this.f();
            if (var2 == null) {
               if (var18) {
                  Area var7;
                  Double var8;
                  Color var19;
                  label52: {
                     var7 = new Area(new Double(0.0, 0.0, (double)var5, (double)var5));
                     var8 = new Double(2.0, 2.0, (double)(var5 - 4), (double)(var5 - 4));
                     var7.exclusiveOr(new Area(var8));
                     E2 var10001 = this;
                     if (var2 == null) {
                        if (this.isEnabled()) {
                           var19 = this.p();
                           break label52;
                        }

                        var10001 = this;
                     }

                     var19 = var10001.y();
                  }

                  label46: {
                     var3.setColor(var19);
                     var3.fill(var7);
                     E2 var20 = this;
                     if (var2 == null) {
                        if (this.isEnabled()) {
                           var19 = this.h$Color();
                           break label46;
                        }

                        var20 = this;
                     }

                     var19 = var20.G();
                  }

                  var3.setPaint(var19);
                  var3.fill(var8);
               }

               var3.drawImage(this.A.getImage(), this.i.left + var6 / 2 - this.A.getIconWidth() / 2, this.i.top + var6 / 2 - this.A.getIconHeight() / 2, null);
            }
         }

         var17 = this;
      }

      if (var17.z != null) {
         int var10;
         Rectangle var13;
         Color var23;
         label34: {
            var3.setFont(this.getFont());
            FontMetrics var15 = var3.getFontMetrics();
            int var16 = var15.stringWidth(this.z);
            int var9 = var15.getHeight();
            var10 = GA.d(var15);
            int var11 = this.i.left + var6 + this.h;
            int var12 = this.i.top + var6 / 2 - var9 / 2 - this.y.top;
            var13 = new Rectangle(var11, var12, this.y.left + var16 + this.y.right, this.y.top + var9 + this.y.bottom);
            E2 var22 = this;
            if (var2 == null) {
               if (this.R) {
                  var23 = this.K();
                  break label34;
               }

               var22 = this;
            }

            var23 = var22.getBackground();
         }

         var3.setPaint(var23);
         var3.fillRoundRect(var13.x, var13.y, var13.width, var13.height, a(29034, 6368618771843352880L), a(29034, 6368618771843352880L));
         int var14 = var13.height - this.y.top - this.y.bottom;
         var3.setPaint(this.getForeground());
         var3.drawString(this.z, var13.x + this.y.left, var13.y + this.y.top + var14 / 2 + var10);
      }

      RV.X(var3, var4);
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var2;
      label41: {
         E2 var7;
         label43: {
            label44: {
               int[] var1;
               label45: {
                  int[] var10000 = P();
                  var2 = new Dimension();
                  var1 = var10000;
                  ImageIcon var6 = this.A;
                  if (var1 == null) {
                     if (this.A != null) {
                        var2.width = var2.width + this.A.getIconWidth();
                        var2.height = this.A.getIconHeight();
                     }

                     var7 = this;
                     if (var1 != null) {
                        break label45;
                     }

                     var6 = this.A;
                  }

                  if (var6 != null) {
                     var8 = this.z;
                     if (var1 != null) {
                        break label44;
                     }

                     if (this.z != null) {
                        var2.width = var2.width + this.h;
                     }
                  }

                  var7 = this;
               }

               if (var1 != null) {
                  break label43;
               }

               var8 = var7.z;
            }

            if (var8 == null) {
               break label41;
            }

            var7 = this;
         }

         FontMetrics var3 = var7.getFontMetrics(this.getFont());
         int var4 = var3.stringWidth(this.z);
         int var5 = var3.getHeight();
         var2.width = var2.width + this.y.left + var4 + this.y.right;
         var2.height = Math.max(var2.height, var5);
      }

      var2.width = var2.width + this.i.left + this.i.right;
      var2.height = var2.height + this.i.top + this.i.bottom;
      return var2;
   }

   static boolean P(E2 var0, boolean var1) {
      return var0.R = var1;
   }

   public static void e(int[] var0) {
      P = var0;
   }

   public static int[] P() {
      return P;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30805;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2508603942753401711L;
      long[] var6 = new long[27];
      int var3 = 0;
      String var4 = "\u0010UZ\u007fÞmþ4\\3y¶#©\u0018\u0087\u0011\u008c\u009a\u00154j\u0004@,v\u0016À \\P¨Ì\u001aÀPÄ\u000f.¸²ÆÂK-v÷\u007fø\u009dÚ\u0005t\u0087\u0090+ L8K-\u009fP ]\u009cc¹Ï/\u007fàkÒÆ¯þÝþN}ÎÚ~Ã¾GGÂÃOF\u0087\u009b2Wò\u008ea¯1\u001aE´öÜÀn<\u0096ÿÃ\u0085\u009fYø\u0093\u0010ù\u0098\u008dàXk|nrY2!½(±¡\u007f9É\r\u0006®Ð\u00926ìd\u008b@\u0010(×Q\u008bt+Õl¾\u008b<kjªðÏ^þ5\u00ad¥\u009e\u0018K\u008d\u0085@¨¦E\by\u0087ð#2öy\u009b('Í\rÔ\u000f \u001f\u0099¯T\u001c\u008a";
      int var5 = "\u0010UZ\u007fÞmþ4\\3y¶#©\u0018\u0087\u0011\u008c\u009a\u00154j\u0004@,v\u0016À \\P¨Ì\u001aÀPÄ\u000f.¸²ÆÂK-v÷\u007fø\u009dÚ\u0005t\u0087\u0090+ L8K-\u009fP ]\u009cc¹Ï/\u007fàkÒÆ¯þÝþN}ÎÚ~Ã¾GGÂÃOF\u0087\u009b2Wò\u008ea¯1\u001aE´öÜÀn<\u0096ÿÃ\u0085\u009fYø\u0093\u0010ù\u0098\u008dàXk|nrY2!½(±¡\u007f9É\r\u0006®Ð\u00926ìd\u008b@\u0010(×Q\u008bt+Õl¾\u008b<kjªðÏ^þ5\u00ad¥\u009e\u0018K\u008d\u0085@¨¦E\by\u0087ð#2öy\u009b('Í\rÔ\u000f \u001f\u0099¯T\u001c\u008a"
         .length();
      byte var2 = 0;
      e(null);

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
                     a = var6;
                     b = new Integer[27];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Tæ%t\u009e\u0019ã\u0086\u0001¿eÛh\u0004\u0090ã";
                  var5 = "Tæ%t\u009e\u0019ã\u0086\u0001¿eÛh\u0004\u0090ã".length();
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





