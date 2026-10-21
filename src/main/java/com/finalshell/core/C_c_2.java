package com.finalshell.core;

import com.finalshell.ui.listener.WM3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeListener;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTextAreaUI;
import javax.swing.text.JTextComponent;

public class C_c_2 extends BasicTextAreaUI implements L0_2, SwingConstants {
   public String C = Lv4.n;
   public Font H = Lv4.U;
   public Color Q = Lv4.m;
   public int X = Lv4.q;
   public int l = Lv4.K;
   public boolean A = Lv4.V;
   public Og4 K = Lv4.R;
   public boolean e = false;
   public FocusListener o;
   public PropertyChangeListener Z;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static ComponentUI createUI(JComponent var0) {
      return new C_c_2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      JTextComponent var2 = this.getComponent();
      FN.Y(var2);
      LookAndFeel.installProperty(var2, a(-26061, -1951), Boolean.TRUE);
      var2.setBackground(Lv4.o);
      var2.setSelectionColor(GO.F4);
      var2.setForeground(Lv4.k);
      var2.setSelectedTextColor(Lv4.P);
      var2.setCaretColor(Lv4.g);
      var2.setMargin(Lv4.G);
      WO.t(var2, this.K);
      this.h();
      this.o = new com.finalshell.ui.listener.HS(this, var2);
      var2.addFocusListener(this.o);
      this.Z = new WM3(this);
      var2.addPropertyChangeListener(a(-26063, -26733), this.Z);
   }

   @Override
   public void uninstallUI(JComponent var1) {
      JTextComponent var2 = this.getComponent();
      WO.C(var2, this.K);
      var2.removeFocusListener(this.o);
      var2.removePropertyChangeListener(a(-26062, 5212), this.Z);
      super.uninstallUI(var1);
   }

   public String L() {
      return this.C;
   }

   public void I(String var1) {
      boolean var3;
      label22: {
         label24: {
            boolean var10000 = Ne4.A$boolean();
            this.C = var1;
            boolean var2 = var10000;
            String var10001 = var1;
            if (var2) {
               if (var1 == null) {
                  break label24;
               }

               var10001 = var1.trim();
            }

            var3 = var10001.equals("");
            if (!var2) {
               break label22;
            }

            if (!var3) {
               var3 = true;
               break label22;
            }
         }

         var3 = false;
      }

      this.e = var3;
      this.V();
   }

   public Font n() {
      return this.H;
   }

   public void i(Font var1) {
      this.H = var1;
      this.V();
   }

   public Color W() {
      return this.Q;
   }

   public void c(Color var1) {
      this.Q = var1;
      this.V();
   }

   public int w() {
      return this.X;
   }

   public void J(int var1) {
      this.X = var1;
      this.V();
   }

   public int x() {
      return this.l;
   }

   public void w(int var1) {
      this.l = var1;
      this.V();
   }

   public boolean i() {
      return this.A;
   }

   public void F(boolean var1) {
      this.A = var1;
      this.V();
   }

   public Og4 j() {
      return this.K;
   }

   public void N(Og4 var1) {
      JTextComponent var3;
      boolean var4;
      label22: {
         label24: {
            var3 = this.getComponent();
            boolean var10000 = Ne4.A$boolean();
            WO.C(var3, this.K);
            boolean var2 = var10000;
            this.K = var1;
            Og4 var10001 = var1;
            if (var2) {
               if (var1 == null) {
                  break label24;
               }

               var10001 = var1;
            }

            var4 = var10001.d$Boolean(var3);
            if (!var2) {
               break label22;
            }

            if (!var4) {
               var4 = false;
               break label22;
            }
         }

         var4 = true;
      }

      var3.setOpaque(var4);
      WO.t(var3, this.K);
      this.h();
   }

   public void V() {
      boolean var1 = Ne4.m$boolean();
      C_c_2 var10000 = this;
      if (!var1) {
         if (!this.T(this.getComponent())) {
            return;
         }

         var10000 = this;
      }

      var10000.M();
   }

   public boolean T(JTextComponent var1) {
      boolean var2 = Ne4.m$boolean();
      boolean var10000 = this.e;
      if (!var2) {
         if (!this.e) {
            return false;
         }

         var10000 = var1.isEditable();
      }

      if (!var2) {
         if (!var10000) {
            return false;
         }

         var10000 = var1.isEnabled();
      }

      if (!var2) {
         if (!var10000) {
            return false;
         }

         var10000 = this.A;
      }

      if (!var2) {
         if (var10000) {
            var10000 = var1.isFocusOwner();
            if (var2) {
               return var2 ? var10000 : var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = var1.getText().equals("");
      }

      return var2 ? var10000 : var10000;
   }

   public void M() {
      boolean var1 = Ne4.A$boolean();
      JTextComponent var10000 = this.getComponent();
      if (var1) {
         if (var10000 == null) {
            return;
         }

         var10000 = this.getComponent();
      }

      var10000.repaint();
   }

   @Override
   public void h() {
      boolean var10000 = Ne4.A$boolean();
      JTextComponent var2 = this.getComponent();
      boolean var1 = var10000;
      JTextComponent var7 = var2;
      if (var1) {
         if (var2 == null) {
            return;
         }

         var7 = var2;
      }

      if (var1) {
         if (FN.l((JComponent)var7)) {
            return;
         }

         var7 = var2;
      }

      Insets var3 = var7.getMargin();
      byte var4 = (var2.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      Insets var8 = var3;
      if (var1) {
         var8 = var3 == null
            ? new Insets(0, 0, 0, 0)
            : new Insets(var3.top, var4 != 0 ? var3.left : var3.right, var3.bottom, var4 != 0 ? var3.right : var3.left);
      }

      Insets var5;
      label72: {
         var5 = var8;
         Og4 var9 = this.K;
         if (var1) {
            if (this.K == null) {
      Insets var10;
      Insets var10;
               break label72;
            }

            var9 = this.K;
         }

         Insets var6;
         int var11;
         int var10001;
         label57: {
            var6 = var9.B(var2);
            var5.top = var5.top + var6.top;
            var10 = var5;
            var10001 = var5.bottom;
            Insets var10002 = var6;
            if (var1) {
               var5.bottom = var5.bottom + var6.bottom;
               var10 = var5;
               var10001 = var5.left;
               if (var4 != 0) {
                  var11 = var6.left;
                  break label57;
               }

               var10002 = var6;
            }

            var11 = var10002.right;
         }

         var10.left = var10001 + var11;
         var11 = var4;
         if (var1) {
            var11 = var4 != 0 ? var6.right : var6.left;
         }

         var5.right += var11;
      }

      var2.setBorder(GA.y(var5));
   }

   @Override
   protected void paintBackground(Graphics var1) {
   }

   @Override
   protected void paintSafely(Graphics var1) {
      boolean var2;
      Graphics2D var3;
      JTextComponent var4;
      Og4 var13;
      label128: {
         var3 = (Graphics2D)var1;
         boolean var10000 = Ne4.A$boolean();
         var4 = this.getComponent();
         var2 = var10000;
         label127:
         if (var4.isOpaque()) {
            label131: {
               var13 = this.K;
               if (var2) {
                  if (this.K == null) {
                     break label131;
                  }

                  var13 = this.K;
               }

               if (!var2) {
                  break label128;
               }

               if (var13.d$Boolean(var4)) {
                  break label127;
               }
            }

            var3.setPaint(var4.getBackground());
            var3.fillRect(0, 0, var4.getWidth(), var4.getHeight());
         }

         var13 = this.K;
      }

      label114: {
         if (var2) {
            if (var13 == null) {
               break label114;
            }

            var13 = this.K;
         }

         var13.u(var3, FN.N(var4), var4);
      }

      Map var5 = FN.Y(var3);
      super.paintSafely(var1);
      if (var2) {
         if (this.T(var4)) {
            byte var6 = var4.getComponentOrientation().isLeftToRight();
            Rectangle var7 = this.getVisibleEditorRect();
            Shape var8 = RV.n(var3, var7);
            Font var10001 = this.H;
            if (var2) {
               var10001 = this.H != null ? this.H : var4.getFont();
            }

            var3.setFont(var10001);
            Color var17 = this.Q;
            if (var2) {
               var17 = this.Q != null ? this.Q : var4.getForeground();
            }

            String var9;
            FontMetrics var10;
            int var11;
            label133: {
               var3.setPaint(var17);
               var9 = Cf4_2.X(this.C);
               var10 = var3.getFontMetrics();
               int var14 = this.X;
               if (var2) {
                  if (this.X == 0) {
                     var11 = var7.x + var7.width / 2 - var10.stringWidth(var9) / 2;
                     if (var2) {
                        break label133;
                     }
                  }

                  var14 = var6;
               }

               label94: {
                  label93: {
                     label92: {
                        label134: {
                           if (var2) {
                              if (var14 != 0) {
                                 var15 = this.X;
                                 if (!var2) {
                                    break label92;
                                 }

                                 if (this.X == a(22952, 462631864318488965L)) {
                                    break label134;
                                 }
                              }

                              var14 = var6;
                           }

                           if (var2) {
                              if (var14 == 0) {
                                 var15 = this.X;
                                 if (!var2) {
                                    break label92;
                                 }

                                 if (this.X == a(28649, 8048469105343154117L)) {
                                    break label134;
                                 }
                              }

                              var14 = this.X;
                           }

                           var18 = 2;
                           if (!var2) {
                              break label94;
                           }

                           if (var14 != 2) {
                              break label93;
                           }
                        }

                        var15 = var7.x;
                     }

                     var11 = var15;
                     if (var2) {
                        break label133;
                     }
                  }

                  var14 = var7.x + var7.width;
                  var18 = var10.stringWidth(var9);
               }

               var11 = var14 - var18;
            }

            int var12;
            label66: {
               int var16 = this.l;
               if (var2) {
                  if (this.l == 0) {
                     var12 = var7.y + var7.height / 2 + GA.d(var10);
                     if (var2) {
                        break label66;
                     }
                  }

                  var16 = this.getBaseline(var4, var4.getWidth(), var4.getHeight());
               }

               var12 = var16;
            }

            var3.drawString(var9, var11, var12);
            RV.w(var3, var8);
         }

         FN.k(var3, var5);
      }
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      Dimension var2 = super.getPreferredSize(var1);
      if (this.K != null) {
         if (var1.getLayout() != null) {
            var2 = FN.h(var2, var1.getLayout().preferredLayoutSize(var1));
         }

         var2 = FN.h(var2, this.K.d$Dimension(var1));
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -26061) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 68;
               break;
            case 1:
               var10000 = 89;
               break;
            case 2:
               var10000 = 43;
               break;
            case 3:
               var10000 = 196;
               break;
            case 4:
               var10000 = 1;
               break;
            case 5:
               var10000 = 162;
               break;
            case 6:
               var10000 = 123;
               break;
            case 7:
               var10000 = 103;
               break;
            case 8:
               var10000 = 223;
               break;
            case 9:
               var10000 = 10;
               break;
            case 10:
               var10000 = 188;
               break;
            case 11:
               var10000 = 198;
               break;
            case 12:
               var10000 = 210;
               break;
            case 13:
               var10000 = 129;
               break;
            case 14:
               var10000 = 143;
               break;
            case 15:
               var10000 = 51;
               break;
            case 16:
               var10000 = 206;
               break;
            case 17:
               var10000 = 225;
               break;
            case 18:
               var10000 = 247;
               break;
            case 19:
               var10000 = 86;
               break;
            case 20:
               var10000 = 71;
               break;
            case 21:
               var10000 = 62;
               break;
            case 22:
               var10000 = 214;
               break;
            case 23:
               var10000 = 254;
               break;
            case 24:
               var10000 = 101;
               break;
            case 25:
               var10000 = 232;
               break;
            case 26:
               var10000 = 190;
               break;
            case 27:
               var10000 = 2;
               break;
            case 28:
               var10000 = 22;
               break;
            case 29:
               var10000 = 180;
               break;
            case 30:
               var10000 = 234;
               break;
            case 31:
               var10000 = 116;
               break;
            case 32:
               var10000 = 153;
               break;
            case 33:
               var10000 = 102;
               break;
            case 34:
               var10000 = 12;
               break;
            case 35:
               var10000 = 74;
               break;
            case 36:
               var10000 = 233;
               break;
            case 37:
               var10000 = 246;
               break;
            case 38:
               var10000 = 167;
               break;
            case 39:
               var10000 = 7;
               break;
            case 40:
               var10000 = 39;
               break;
            case 41:
               var10000 = 226;
               break;
            case 42:
               var10000 = 141;
               break;
            case 43:
               var10000 = 216;
               break;
            case 44:
               var10000 = 120;
               break;
            case 45:
               var10000 = 191;
               break;
            case 46:
               var10000 = 117;
               break;
            case 47:
               var10000 = 222;
               break;
            case 48:
               var10000 = 46;
               break;
            case 49:
               var10000 = 114;
               break;
            case 50:
               var10000 = 78;
               break;
            case 51:
               var10000 = 79;
               break;
            case 52:
               var10000 = 185;
               break;
            case 53:
               var10000 = 189;
               break;
            case 54:
               var10000 = 88;
               break;
            case 55:
               var10000 = 244;
               break;
            case 56:
               var10000 = 250;
               break;
            case 57:
               var10000 = 245;
               break;
            case 58:
               var10000 = 0;
               break;
            case 59:
               var10000 = 197;
               break;
            case 60:
               var10000 = 8;
               break;
            case 61:
               var10000 = 242;
               break;
            case 62:
               var10000 = 9;
               break;
            case 63:
               var10000 = 160;
               break;
            case 64:
               var10000 = 19;
               break;
            case 65:
               var10000 = 34;
               break;
            case 66:
               var10000 = 211;
               break;
            case 67:
               var10000 = 45;
               break;
            case 68:
               var10000 = 65;
               break;
            case 69:
               var10000 = 176;
               break;
            case 70:
               var10000 = 111;
               break;
            case 71:
               var10000 = 133;
               break;
            case 72:
               var10000 = 76;
               break;
            case 73:
               var10000 = 85;
               break;
            case 74:
               var10000 = 228;
               break;
            case 75:
               var10000 = 119;
               break;
            case 76:
               var10000 = 35;
               break;
            case 77:
               var10000 = 137;
               break;
            case 78:
               var10000 = 193;
               break;
            case 79:
               var10000 = 93;
               break;
            case 80:
               var10000 = 30;
               break;
            case 81:
               var10000 = 212;
               break;
            case 82:
               var10000 = 25;
               break;
            case 83:
               var10000 = 125;
               break;
            case 84:
               var10000 = 187;
               break;
            case 85:
               var10000 = 33;
               break;
            case 86:
               var10000 = 163;
               break;
            case 87:
               var10000 = 23;
               break;
            case 88:
               var10000 = 73;
               break;
            case 89:
               var10000 = 201;
               break;
            case 90:
               var10000 = 238;
               break;
            case 91:
               var10000 = 172;
               break;
            case 92:
               var10000 = 83;
               break;
            case 93:
               var10000 = 24;
               break;
            case 94:
               var10000 = 95;
               break;
            case 95:
               var10000 = 16;
               break;
            case 96:
               var10000 = 72;
               break;
            case 97:
               var10000 = 37;
               break;
            case 98:
               var10000 = 55;
               break;
            case 99:
               var10000 = 230;
               break;
            case 100:
               var10000 = 66;
               break;
            case 101:
               var10000 = 243;
               break;
            case 102:
               var10000 = 18;
               break;
            case 103:
               var10000 = 207;
               break;
            case 104:
               var10000 = 199;
               break;
            case 105:
               var10000 = 149;
               break;
            case 106:
               var10000 = 63;
               break;
            case 107:
               var10000 = 81;
               break;
            case 108:
               var10000 = 183;
               break;
            case 109:
               var10000 = 147;
               break;
            case 110:
               var10000 = 152;
               break;
            case 111:
               var10000 = 3;
               break;
            case 112:
               var10000 = 139;
               break;
            case 113:
               var10000 = 134;
               break;
            case 114:
               var10000 = 236;
               break;
            case 115:
               var10000 = 219;
               break;
            case 116:
               var10000 = 75;
               break;
            case 117:
               var10000 = 47;
               break;
            case 118:
               var10000 = 155;
               break;
            case 119:
               var10000 = 112;
               break;
            case 120:
               var10000 = 130;
               break;
            case 121:
               var10000 = 231;
               break;
            case 122:
               var10000 = 229;
               break;
            case 123:
               var10000 = 156;
               break;
            case 124:
               var10000 = 173;
               break;
            case 125:
               var10000 = 70;
               break;
            case 126:
               var10000 = 118;
               break;
            case 127:
               var10000 = 144;
               break;
            case 128:
               var10000 = 84;
               break;
            case 129:
               var10000 = 186;
               break;
            case 130:
               var10000 = 67;
               break;
            case 131:
               var10000 = 253;
               break;
            case 132:
               var10000 = 38;
               break;
            case 133:
               var10000 = 127;
               break;
            case 134:
               var10000 = 157;
               break;
            case 135:
               var10000 = 59;
               break;
            case 136:
               var10000 = 42;
               break;
            case 137:
               var10000 = 146;
               break;
            case 138:
               var10000 = 205;
               break;
            case 139:
               var10000 = 121;
               break;
            case 140:
               var10000 = 14;
               break;
            case 141:
               var10000 = 113;
               break;
            case 142:
               var10000 = 209;
               break;
            case 143:
               var10000 = 165;
               break;
            case 144:
               var10000 = 92;
               break;
            case 145:
               var10000 = 221;
               break;
            case 146:
               var10000 = 52;
               break;
            case 147:
               var10000 = 29;
               break;
            case 148:
               var10000 = 181;
               break;
            case 149:
               var10000 = 54;
               break;
            case 150:
               var10000 = 145;
               break;
            case 151:
               var10000 = 100;
               break;
            case 152:
               var10000 = 57;
               break;
            case 153:
               var10000 = 110;
               break;
            case 154:
               var10000 = 220;
               break;
            case 155:
               var10000 = 82;
               break;
            case 156:
               var10000 = 131;
               break;
            case 157:
               var10000 = 97;
               break;
            case 158:
               var10000 = 182;
               break;
            case 159:
               var10000 = 104;
               break;
            case 160:
               var10000 = 64;
               break;
            case 161:
               var10000 = 108;
               break;
            case 162:
               var10000 = 164;
               break;
            case 163:
               var10000 = 138;
               break;
            case 164:
               var10000 = 150;
               break;
            case 165:
               var10000 = 15;
               break;
            case 166:
               var10000 = 50;
               break;
            case 167:
               var10000 = 44;
               break;
            case 168:
               var10000 = 77;
               break;
            case 169:
               var10000 = 122;
               break;
            case 170:
               var10000 = 58;
               break;
            case 171:
               var10000 = 41;
               break;
            case 172:
               var10000 = 158;
               break;
            case 173:
               var10000 = 109;
               break;
            case 174:
               var10000 = 107;
               break;
            case 175:
               var10000 = 32;
               break;
            case 176:
               var10000 = 69;
               break;
            case 177:
               var10000 = 80;
               break;
            case 178:
               var10000 = 241;
               break;
            case 179:
               var10000 = 252;
               break;
            case 180:
               var10000 = 40;
               break;
            case 181:
               var10000 = 174;
               break;
            case 182:
               var10000 = 175;
               break;
            case 183:
               var10000 = 61;
               break;
            case 184:
               var10000 = 56;
               break;
            case 185:
               var10000 = 106;
               break;
            case 186:
               var10000 = 208;
               break;
            case 187:
               var10000 = 142;
               break;
            case 188:
               var10000 = 240;
               break;
            case 189:
               var10000 = 179;
               break;
            case 190:
               var10000 = 4;
               break;
            case 191:
               var10000 = 227;
               break;
            case 192:
               var10000 = 31;
               break;
            case 193:
               var10000 = 235;
               break;
            case 194:
               var10000 = 94;
               break;
            case 195:
               var10000 = 135;
               break;
            case 196:
               var10000 = 105;
               break;
            case 197:
               var10000 = 215;
               break;
            case 198:
               var10000 = 5;
               break;
            case 199:
               var10000 = 213;
               break;
            case 200:
               var10000 = 203;
               break;
            case 201:
               var10000 = 171;
               break;
            case 202:
               var10000 = 177;
               break;
            case 203:
               var10000 = 148;
               break;
            case 204:
               var10000 = 224;
               break;
            case 205:
               var10000 = 132;
               break;
            case 206:
               var10000 = 53;
               break;
            case 207:
               var10000 = 6;
               break;
            case 208:
               var10000 = 49;
               break;
            case 209:
               var10000 = 99;
               break;
            case 210:
               var10000 = 140;
               break;
            case 211:
               var10000 = 178;
               break;
            case 212:
               var10000 = 218;
               break;
            case 213:
               var10000 = 166;
               break;
            case 214:
               var10000 = 21;
               break;
            case 215:
               var10000 = 217;
               break;
            case 216:
               var10000 = 202;
               break;
            case 217:
               var10000 = 11;
               break;
            case 218:
               var10000 = 251;
               break;
            case 219:
               var10000 = 154;
               break;
            case 220:
               var10000 = 161;
               break;
            case 221:
               var10000 = 168;
               break;
            case 222:
               var10000 = 237;
               break;
            case 223:
               var10000 = 91;
               break;
            case 224:
               var10000 = 90;
               break;
            case 225:
               var10000 = 124;
               break;
            case 226:
               var10000 = 115;
               break;
            case 227:
               var10000 = 204;
               break;
            case 228:
               var10000 = 255;
               break;
            case 229:
               var10000 = 96;
               break;
            case 230:
               var10000 = 194;
               break;
            case 231:
               var10000 = 87;
               break;
            case 232:
               var10000 = 60;
               break;
            case 233:
               var10000 = 192;
               break;
            case 234:
               var10000 = 151;
               break;
            case 235:
               var10000 = 249;
               break;
            case 236:
               var10000 = 17;
               break;
            case 237:
               var10000 = 20;
               break;
            case 238:
               var10000 = 239;
               break;
            case 239:
               var10000 = 36;
               break;
            case 240:
               var10000 = 184;
               break;
            case 241:
               var10000 = 169;
               break;
            case 242:
               var10000 = 200;
               break;
            case 243:
               var10000 = 170;
               break;
            case 244:
               var10000 = 248;
               break;
            case 245:
               var10000 = 48;
               break;
            case 246:
               var10000 = 128;
               break;
            case 247:
               var10000 = 126;
               break;
            case 248:
               var10000 = 98;
               break;
            case 249:
               var10000 = 136;
               break;
            case 250:
               var10000 = 27;
               break;
            case 251:
               var10000 = 13;
               break;
            case 252:
               var10000 = 159;
               break;
            case 253:
               var10000 = 26;
               break;
            case 254:
               var10000 = 28;
               break;
            default:
               var10000 = 195;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10284;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "À&K\u0015Ì\f\u0006uA¬Ü]ê\u0006»Óu\u008ef ";
      int var12 = "À&K\u0015Ì\f\u0006uA¬Ü]ê\u0006»Óu\u008ef ".length();
      char var9 = 6;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 17;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 17;
               var10006 = var14;
            } else {
               var23 = 17;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 17;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 125;
                     break;
                  case 1:
                     var41 = 29;
                     break;
                  case 2:
                     var41 = 44;
                     break;
                  case 3:
                     var41 = 78;
                     break;
                  case 4:
                     var41 = 43;
                     break;
                  case 5:
                     var41 = 110;
                     break;
                  default:
                     var41 = 11;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[3];
            long var0 = 1832090885587059291L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "\u000eê}º&\n\u0085\u0095û\u001bÒË¡ß3Ô";
            int var5 = "\u000eê}º&\n\u0085\u0095û\u001bÒË¡ß3Ô".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
                     ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L
                  )
                  ^ var0;
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            c = var6;
            d = new Integer[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}






