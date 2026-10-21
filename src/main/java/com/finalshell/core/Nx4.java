package com.finalshell.core;

import com.finalshell.ui.dialog.Ds2;
import com.finalshell.ui.listener.CE3;
import com.finalshell.ui.listener.Ll4;
import com.finalshell.ui.listener.NU3;
import com.finalshell.ui.listener.Py2;
import com.finalshell.ui.listener.S_;
import com.finalshell.ui.model.B1;
import com.finalshell.ui.model.K72;
import com.finalshell.ui.model.Nq4;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Window;
import javax.swing.ImageIcon;

public class Nx4 extends Ne4 {
   public static ImageIcon Y;
   public K72 K;
   public boolean X = true;
   public final int o = a(29758, 5744036123628311584L);
   public final int F = a(13465, 8728646085917758597L);
   public String n = "";
   public Color E;
   public final KD d;
   public Robot j;
   public com.finalshell.ui.panel.Wb2 L;
   public Ds2 S;
   public com.finalshell.ui.panel.N_2 R;
   public static int l;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public Nx4() {
      this(Color.WHITE);
   }

   public Nx4(Color var1) {
      this.s();
      this.setHorizontalAlignment(0);
      this.o();
      this.d = new KD(Xg2.L(var1));
      this.d.setFocusable(false);
      this.d.f(0);
      this.d.t(false);
      this.d.K(true);
      this.d.setCursor(Cursor.getDefaultCursor());
      this.d.addActionListener(new com.finalshell.ui.listener.H4(this));
      this.z(this.d);
      this.addActionListener(new Ll4(this));
      this.addFocusListener(new CE3(this));
      this.addMouseListener(new com.finalshell.ui.listener.KM(this));
      this.addKeyListener(new Py2(this));
      this.y(K72.rgb);
      this.T(var1);
   }

   public boolean c$boolean() {
      return this.X;
   }

   public void Y(boolean var1) {
      this.X = var1;
      this.o();
   }

   public Color D() {
      return this.E;
   }

   public void y(Color var1) {
      this.T(var1);
   }

   public void T(Color var1) {
      Color var2 = this.E;
      this.E = var1;
      this.x();
      this.n(var2, var1);
   }

   public K72 h() {
      return this.K;
   }

   public void y(K72 var1) {
      this.K = var1;
      this.u();
   }

   @Override
   public void y(boolean var1) {
      super.y(var1);
      this.s();
   }

   public void x() {
      this.d.setIcon(Xg2.L(this.E));
      this.p();
   }

   public void b() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nx4.c$int ()I
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/Nx4.getText ()Ljava/lang/String;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/Nx4.n Ljava/lang/String;
      // 0e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11: iload 1
      // 12: ifeq 29
      // 15: ifne 7a
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Nx4.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Nx4.K Lcom/finalshell/ui/model/K72;
      // 23: getstatic com/finalshell/ui/model/K72.hex Lcom/finalshell/ui/model/K72;
      // 26: invokevirtual com/finalshell/ui/model/K72.equals (Ljava/lang/Object;)Z
      // 29: istore 3
      // 2a: iload 3
      // 2b: ifeq 39
      // 2e: aload 2
      // 2f: invokestatic com/finalshell/core/P9.C (Ljava/lang/String;)Ljava/awt/Color;
      // 32: goto 3d
      // 35: invokestatic com/finalshell/core/Nx4.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 2
      // 3a: invokestatic com/finalshell/core/P9.u (Ljava/lang/String;)Ljava/awt/Color;
      // 3d: astore 4
      // 3f: aload 4
      // 41: iload 1
      // 42: ifeq 5b
      // 45: ifnull 67
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Nx4.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 4
      // 51: invokestatic com/finalshell/core/P9.M (Ljava/awt/Color;)Ljava/awt/Color;
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Nx4.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: astore 4
      // 5d: aload 0
      // 5e: aload 4
      // 60: invokevirtual com/finalshell/core/Nx4.T (Ljava/awt/Color;)V
      // 63: iload 1
      // 64: ifne 72
      // 67: aload 0
      // 68: invokevirtual com/finalshell/core/Nx4.x ()V
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/Nx4.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: goto 7a
      // 75: astore 3
      // 76: aload 0
      // 77: invokevirtual com/finalshell/core/Nx4.x ()V
      // 7a: return
   }

   public void u() {
      int var1 = R();
      K72 var10000 = this.K;
      if (var1 == 0) {
         if (this.K == null) {
            return;
         }

         var10000 = this.K;
      }

      byte var2 = (byte)((var10000.equals(K72.hex)) ? 1 : 0);
      int var10001 = var2;
      if (var1 == 0) {
         var10001 = var2 != 0 ? a(1062, 1987554735933547579L) : a(11413, 8299474732993105034L);
      }

      this.setColumns(var10001);
      this.p();
   }

   public void p() {
      int var1 = c$int();
      Nx4 var10000 = this;
      if (var1 != 0) {
         if (this.E == null) {
            return;
         }

         var10000 = this;
      }

      String var2 = var10000.w(this.E);
      this.setText(var2);
      this.n = var2;
   }

   public String w(Color var1) {
      boolean var2 = this.K.equals(K72.hex);
      return var2 ? P9.u(var1) : var1.getRed() + "," + var1.getGreen() + "," + var1.getBlue();
   }

   public void s() {
      this.setMargin(this.g() ? new Insets(-1, 0, -1, -1) : new Insets(0, 0, 0, 0));
   }

   public void o() {
      label15: {
         int var1 = c$int();
         Nx4 var10000 = this;
         if (var1 != 0) {
            if (this.X) {
               this.N();
               if (var1 != 0) {
                  break label15;
               }
            }

            var10000 = this;
         }

         var10000.f();
      }

      this.revalidate();
   }

   public void N() {
      int var1 = c$int();

      Nx4 var10000;
      label40: {
         label44: {
            try {
               var10000 = this;
               if (var1 == 0) {
                  break label40;
               }

               if (this.L != null) {
                  break label44;
               }
            } catch (AWTException var5) {
               throw b(var5);
            }

            this.L = new com.finalshell.ui.panel.Wb2(Y);

            try {
               this.j = new Robot();
            } catch (AWTException var3) {
               NE3.g(this, var3);
            }

            try {
               var10000 = this;
               if (var1 == 0) {
                  break label40;
               }

               if (this.j == null) {
                  break label44;
               }
            } catch (AWTException var4) {
               throw b(var4);
            }

            com.finalshell.ui.listener.YM var2 = new com.finalshell.ui.listener.YM(this);
            this.L.addMouseListener(var2);
            this.L.addMouseMotionListener(var2);
            this.L.setCursor(Cursor.getDefaultCursor());
         }

         var10000 = this;
      }

      var10000.v(this.L);
   }

   public void f() {
      this.v(null);
   }

   public void j() {
      int var1;
      Nx4 var10000;
      var1 = c$int();
      var10000 = this;
      label39:
      if (var1 != 0) {
         if (!this.requestFocusInWindow()) {
            var10000 = this;
            if (var1 == 0) {
               break label39;
            }

            if (!this.isFocusOwner()) {
               return;
            }
         }

         this.b();
         var10000 = this;
      }

      label32: {
         label31: {
            label30: {
               Object var3 = var10000.S;
               if (var1 != 0) {
                  if (var10000.S != null) {
                     var4 = this.R;
                     if (var1 == 0) {
                        break label31;
                     }

                     if (this.R != null) {
                        break label30;
                     }
                  }

                  var3 = FN.L(this);
               }

               Object var2 = var3;
               this.R = new com.finalshell.ui.panel.N_2(true);
               this.R.x(this.E);
               this.S = new Ds2((Window)var2);
               this.S.B(5);
               this.S.r(true);
               this.S.add(this.R);
               this.y();
               var2.addComponentListener(new NU3(this));
               var2.addPropertyChangeListener(a(-16103, -6096), new S_(this));
               this.R.T(new P12(this));
               if (var1 != 0) {
                  break label32;
               }
            }

            this.y();
            var4 = this.R;
         }

         var4.x(this.E);
      }

      FN.y(this, this.S);
      this.S.I(this, B1.down, Nq4.centered);
      this.R.requestFocusInWindow();
   }

   public void y() {
      int var4;
      int var10000 = c$int();
      Point var2 = this.getLocationOnScreen();
      int var1 = var10000;
      Rectangle var3 = this.S.getGraphicsConfiguration().getBounds();
      var10000 = this.g();
      if (var1 != 0) {
         var10000 = var10000 != 0 ? this.L() : 0;
      }

      int var7;
      int var8;
      label73: {
         var4 = var10000;
         byte var5 = (byte)((this.getComponentOrientation().isLeftToRight()) ? 1 : 0);
         int var6 = this.getWidth();
         var7 = this.getHeight();
         var10000 = var5;
         if (var1 != 0) {
            if (var5 != 0) {
               var10000 = var2.x + var4 + this.S.getWidth();
               int var10001 = var3.x + var3.width;
               if (var1 != 0) {
                  if (var10000 <= var10001) {
                     var8 = var2.x + var4;
                     if (var1 != 0) {
                        break label73;
                     }
                  }

                  var10000 = var2.x + var6 - var4;
                  var10001 = this.S.getWidth();
               }

               var8 = var10000 - var10001;
               if (var1 != 0) {
                  break label73;
               }
            }

            var10000 = var2.x + var6 - var4 - this.S.getWidth();
         }

         int var15 = var3.x;
         if (var1 != 0) {
            if (var10000 >= var3.x) {
               var8 = var2.x + var6 - var4 - this.S.getWidth();
               if (var1 != 0) {
                  break label73;
               }
            }

            var10000 = var2.x;
            var15 = var4;
         }

         var8 = var10000 + var15;
      }

      int var9;
      label74: {
         var10000 = var2.y + var7 + this.S.getHeight();
         int var16 = var3.y + var3.height;
         if (var1 != 0) {
            if (var10000 <= var16) {
               var10000 = var2.y + var7;
               var16 = this.g();
               if (var1 != 0) {
                  var16 = var16 != 0 ? 0 : 1;
               }

               var9 = var10000 + var16;
               if (var1 != 0) {
                  break label74;
               }
            }

            var10000 = var2.y - this.S.getHeight();
            var16 = this.g();
         }

         if (var1 != 0) {
            var16 = var16 != 0 ? 0 : 1;
         }

         var9 = var10000 - var16;
      }

      this.S.setLocation(var8, var9);
   }

   public void s(HP var1) {
      this.listenerList.add(HP.class, var1);
   }

   public void J(HP var1) {
      this.listenerList.remove(HP.class, var1);
   }

   public void n(Color var1, Color var2) {
      HP[] var4 = this.listenerList.getListeners(HP.class);
      int var10000 = c$int();
      int var5 = var4.length;
      int var6 = 0;
      int var3 = var10000;

      while (var6 < var5) {
         HP var7 = var4[var6];
         var7.p(var1, var2);
         var6++;
         if (var3 == 0) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void b(int var0) {
      l = var0;
   }

   public static int R() {
      return l;
   }

   public static int c$int() {
      int var0 = R();
      return var0 == 0 ? 123 : 0;
   }

   public static Throwable b(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      short var4;
      int var2 = (var0 ^ -16104) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 57;
               break;
            case 1:
               var10000 = 177;
               break;
            case 2:
               var10000 = 56;
               break;
            case 3:
               var10000 = 113;
               break;
            case 4:
               var10000 = 229;
               break;
            case 5:
               var10000 = 167;
               break;
            case 6:
               var10000 = 215;
               break;
            case 7:
               var10000 = 104;
               break;
            case 8:
               var10000 = 103;
               break;
            case 9:
               var10000 = 121;
               break;
            case 10:
               var10000 = 7;
               break;
            case 11:
               var10000 = 128;
               break;
            case 12:
               var10000 = 10;
               break;
            case 13:
               var10000 = 161;
               break;
            case 14:
               var10000 = 65;
               break;
            case 15:
               var10000 = 173;
               break;
            case 16:
               var10000 = 4;
               break;
            case 17:
               var10000 = 196;
               break;
            case 18:
               var10000 = 210;
               break;
            case 19:
               var10000 = 178;
               break;
            case 20:
               var10000 = 33;
               break;
            case 21:
               var10000 = 226;
               break;
            case 22:
               var10000 = 117;
               break;
            case 23:
               var10000 = 64;
               break;
            case 24:
               var10000 = 159;
               break;
            case 25:
               var10000 = 68;
               break;
            case 26:
               var10000 = 129;
               break;
            case 27:
               var10000 = 115;
               break;
            case 28:
               var10000 = 75;
               break;
            case 29:
               var10000 = 146;
               break;
            case 30:
               var10000 = 42;
               break;
            case 31:
               var10000 = 221;
               break;
            case 32:
               var10000 = 134;
               break;
            case 33:
               var10000 = 34;
               break;
            case 34:
               var10000 = 188;
               break;
            case 35:
               var10000 = 165;
               break;
            case 36:
               var10000 = 199;
               break;
            case 37:
               var10000 = 164;
               break;
            case 38:
               var10000 = 107;
               break;
            case 39:
               var10000 = 216;
               break;
            case 40:
               var10000 = 174;
               break;
            case 41:
               var10000 = 184;
               break;
            case 42:
               var10000 = 48;
               break;
            case 43:
               var10000 = 110;
               break;
            case 44:
               var10000 = 18;
               break;
            case 45:
               var10000 = 43;
               break;
            case 46:
               var10000 = 20;
               break;
            case 47:
               var10000 = 101;
               break;
            case 48:
               var10000 = 200;
               break;
            case 49:
               var10000 = 217;
               break;
            case 50:
               var10000 = 70;
               break;
            case 51:
               var10000 = 150;
               break;
            case 52:
               var10000 = 131;
               break;
            case 53:
               var10000 = 202;
               break;
            case 54:
               var10000 = 231;
               break;
            case 55:
               var10000 = 242;
               break;
            case 56:
               var10000 = 94;
               break;
            case 57:
               var10000 = 250;
               break;
            case 58:
               var10000 = 71;
               break;
            case 59:
               var10000 = 51;
               break;
            case 60:
               var10000 = 209;
               break;
            case 61:
               var10000 = 50;
               break;
            case 62:
               var10000 = 179;
               break;
            case 63:
               var10000 = 76;
               break;
            case 64:
               var10000 = 11;
               break;
            case 65:
               var10000 = 233;
               break;
            case 66:
               var10000 = 54;
               break;
            case 67:
               var10000 = 83;
               break;
            case 68:
               var10000 = 29;
               break;
            case 69:
               var10000 = 133;
               break;
            case 70:
               var10000 = 154;
               break;
            case 71:
               var10000 = 246;
               break;
            case 72:
               var10000 = 219;
               break;
            case 73:
               var10000 = 37;
               break;
            case 74:
               var10000 = 239;
               break;
            case 75:
               var10000 = 249;
               break;
            case 76:
               var10000 = 99;
               break;
            case 77:
               var10000 = 148;
               break;
            case 78:
               var10000 = 39;
               break;
            case 79:
               var10000 = 236;
               break;
            case 80:
               var10000 = 194;
               break;
            case 81:
               var10000 = 213;
               break;
            case 82:
               var10000 = 255;
               break;
            case 83:
               var10000 = 80;
               break;
            case 84:
               var10000 = 183;
               break;
            case 85:
               var10000 = 105;
               break;
            case 86:
               var10000 = 69;
               break;
            case 87:
               var10000 = 224;
               break;
            case 88:
               var10000 = 40;
               break;
            case 89:
               var10000 = 225;
               break;
            case 90:
               var10000 = 140;
               break;
            case 91:
               var10000 = 74;
               break;
            case 92:
               var10000 = 92;
               break;
            case 93:
               var10000 = 17;
               break;
            case 94:
               var10000 = 93;
               break;
            case 95:
               var10000 = 222;
               break;
            case 96:
               var10000 = 86;
               break;
            case 97:
               var10000 = 81;
               break;
            case 98:
               var10000 = 22;
               break;
            case 99:
               var10000 = 91;
               break;
            case 100:
               var10000 = 15;
               break;
            case 101:
               var10000 = 163;
               break;
            case 102:
               var10000 = 124;
               break;
            case 103:
               var10000 = 120;
               break;
            case 104:
               var10000 = 238;
               break;
            case 105:
               var10000 = 61;
               break;
            case 106:
               var10000 = 52;
               break;
            case 107:
               var10000 = 144;
               break;
            case 108:
               var10000 = 227;
               break;
            case 109:
               var10000 = 147;
               break;
            case 110:
               var10000 = 108;
               break;
            case 111:
               var10000 = 23;
               break;
            case 112:
               var10000 = 170;
               break;
            case 113:
               var10000 = 247;
               break;
            case 114:
               var10000 = 204;
               break;
            case 115:
               var10000 = 95;
               break;
            case 116:
               var10000 = 244;
               break;
            case 117:
               var10000 = 63;
               break;
            case 118:
               var10000 = 90;
               break;
            case 119:
               var10000 = 46;
               break;
            case 120:
               var10000 = 237;
               break;
            case 121:
               var10000 = 85;
               break;
            case 122:
               var10000 = 27;
               break;
            case 123:
               var10000 = 205;
               break;
            case 124:
               var10000 = 26;
               break;
            case 125:
               var10000 = 77;
               break;
            case 126:
               var10000 = 109;
               break;
            case 127:
               var10000 = 88;
               break;
            case 128:
               var10000 = 135;
               break;
            case 129:
               var10000 = 97;
               break;
            case 130:
               var10000 = 72;
               break;
            case 131:
               var10000 = 2;
               break;
            case 132:
               var10000 = 89;
               break;
            case 133:
               var10000 = 21;
               break;
            case 134:
               var10000 = 98;
               break;
            case 135:
               var10000 = 206;
               break;
            case 136:
               var10000 = 3;
               break;
            case 137:
               var10000 = 123;
               break;
            case 138:
               var10000 = 182;
               break;
            case 139:
               var10000 = 96;
               break;
            case 140:
               var10000 = 176;
               break;
            case 141:
               var10000 = 153;
               break;
            case 142:
               var10000 = 106;
               break;
            case 143:
               var10000 = 251;
               break;
            case 144:
               var10000 = 9;
               break;
            case 145:
               var10000 = 112;
               break;
            case 146:
               var10000 = 175;
               break;
            case 147:
               var10000 = 116;
               break;
            case 148:
               var10000 = 82;
               break;
            case 149:
               var10000 = 201;
               break;
            case 150:
               var10000 = 12;
               break;
            case 151:
               var10000 = 24;
               break;
            case 152:
               var10000 = 141;
               break;
            case 153:
               var10000 = 38;
               break;
            case 154:
               var10000 = 66;
               break;
            case 155:
               var10000 = 143;
               break;
            case 156:
               var10000 = 252;
               break;
            case 157:
               var10000 = 166;
               break;
            case 158:
               var10000 = 35;
               break;
            case 159:
               var10000 = 248;
               break;
            case 160:
               var10000 = 190;
               break;
            case 161:
               var10000 = 218;
               break;
            case 162:
               var10000 = 79;
               break;
            case 163:
               var10000 = 195;
               break;
            case 164:
               var10000 = 207;
               break;
            case 165:
               var10000 = 152;
               break;
            case 166:
               var10000 = 151;
               break;
            case 167:
               var10000 = 211;
               break;
            case 168:
               var10000 = 19;
               break;
            case 169:
               var10000 = 193;
               break;
            case 170:
               var10000 = 78;
               break;
            case 171:
               var10000 = 130;
               break;
            case 172:
               var10000 = 30;
               break;
            case 173:
               var10000 = 36;
               break;
            case 174:
               var10000 = 185;
               break;
            case 175:
               var10000 = 47;
               break;
            case 176:
               var10000 = 14;
               break;
            case 177:
               var10000 = 28;
               break;
            case 178:
               var10000 = 181;
               break;
            case 179:
               var10000 = 198;
               break;
            case 180:
               var10000 = 232;
               break;
            case 181:
               var10000 = 111;
               break;
            case 182:
               var10000 = 0;
               break;
            case 183:
               var10000 = 1;
               break;
            case 184:
               var10000 = 157;
               break;
            case 185:
               var10000 = 243;
               break;
            case 186:
               var10000 = 84;
               break;
            case 187:
               var10000 = 126;
               break;
            case 188:
               var10000 = 169;
               break;
            case 189:
               var10000 = 192;
               break;
            case 190:
               var10000 = 59;
               break;
            case 191:
               var10000 = 44;
               break;
            case 192:
               var10000 = 158;
               break;
            case 193:
               var10000 = 186;
               break;
            case 194:
               var10000 = 137;
               break;
            case 195:
               var10000 = 8;
               break;
            case 196:
               var10000 = 208;
               break;
            case 197:
               var10000 = 162;
               break;
            case 198:
               var10000 = 5;
               break;
            case 199:
               var10000 = 32;
               break;
            case 200:
               var10000 = 55;
               break;
            case 201:
               var10000 = 53;
               break;
            case 202:
               var10000 = 142;
               break;
            case 203:
               var10000 = 168;
               break;
            case 204:
               var10000 = 136;
               break;
            case 205:
               var10000 = 58;
               break;
            case 206:
               var10000 = 160;
               break;
            case 207:
               var10000 = 254;
               break;
            case 208:
               var10000 = 138;
               break;
            case 209:
               var10000 = 49;
               break;
            case 210:
               var10000 = 171;
               break;
            case 211:
               var10000 = 132;
               break;
            case 212:
               var10000 = 145;
               break;
            case 213:
               var10000 = 230;
               break;
            case 214:
               var10000 = 223;
               break;
            case 215:
               var10000 = 60;
               break;
            case 216:
               var10000 = 189;
               break;
            case 217:
               var10000 = 114;
               break;
            case 218:
               var10000 = 13;
               break;
            case 219:
               var10000 = 139;
               break;
            case 220:
               var10000 = 191;
               break;
            case 221:
               var10000 = 197;
               break;
            case 222:
               var10000 = 228;
               break;
            case 223:
               var10000 = 253;
               break;
            case 224:
               var10000 = 149;
               break;
            case 225:
               var10000 = 45;
               break;
            case 226:
               var10000 = 118;
               break;
            case 227:
               var10000 = 31;
               break;
            case 228:
               var10000 = 16;
               break;
            case 229:
               var10000 = 102;
               break;
            case 230:
               var10000 = 187;
               break;
            case 231:
               var10000 = 62;
               break;
            case 232:
               var10000 = 241;
               break;
            case 233:
               var10000 = 73;
               break;
            case 234:
               var10000 = 234;
               break;
            case 235:
               var10000 = 119;
               break;
            case 236:
               var10000 = 220;
               break;
            case 237:
               var10000 = 214;
               break;
            case 238:
               var10000 = 245;
               break;
            case 239:
               var10000 = 235;
               break;
            case 240:
               var10000 = 41;
               break;
            case 241:
               var10000 = 203;
               break;
            case 242:
               var10000 = 100;
               break;
            case 243:
               var10000 = 122;
               break;
            case 244:
               var10000 = 212;
               break;
            case 245:
               var10000 = 155;
               break;
            case 246:
               var10000 = 156;
               break;
            case 247:
               var10000 = 25;
               break;
            case 248:
               var10000 = 67;
               break;
            case 249:
               var10000 = 172;
               break;
            case 250:
               var10000 = 87;
               break;
            case 251:
               var10000 = 240;
               break;
            case 252:
               var10000 = 125;
               break;
            case 253:
               var10000 = 127;
               break;
            case 254:
               var10000 = 6;
               break;
            default:
               var10000 = 180;
         }

         var4 = var10000;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24607;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "¸ an-\u0014pT\u000båÁË!&Zañ{K#\u0014?9ØÎD\u009cÂ;LÖ\u001aåO;1\fõ¾Û¨";
      int var12 = "¸ an-\u0014pT\u000båÁË!&Zañ{K#\u0014?9ØÎD\u009cÂ;LÖ\u001aåO;1\fõ¾Û¨".length();
      char var9 = 20;
      b(0);
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 58;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 58;
               var10006 = var14;
            } else {
               var27 = 58;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 58;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 57;
                     break;
                  case 1:
                     var47 = 123;
                     break;
                  case 2:
                     var47 = 7;
                     break;
                  case 3:
                     var47 = 9;
                     break;
                  case 4:
                     var47 = 109;
                     break;
                  case 5:
                     var47 = 9;
                     break;
                  default:
                     var47 = 125;
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
            long var0 = 3276053663627001325L;
            long[] var6 = new long[4];
            int var3 = 0;
            String var4 = "RÀ³S7øñn\u0006Ê \bðz)Ä";
            int var5 = "RÀ³S7øñn\u0006Ê \bðz)Ä".length();
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
                           e = new Integer[4];
                           Y = new ImageIcon(Nx4.class.getResource(a(-16104, 80)));
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "æ\f(*SlYÐª\u0097ì`L¡éc";
                        var5 = "æ\f(*SlYÐª\u0097ì`L¡éc".length();
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





