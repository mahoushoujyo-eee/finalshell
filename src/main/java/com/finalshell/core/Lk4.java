package com.finalshell.core;

import com.finalshell.ui.listener.IQ3;
import com.finalshell.ui.listener.Vv;
import com.finalshell.ui.listener.WI3;
import com.finalshell.ui.listener.WL3;
import com.finalshell.ui.listener.YC3;
import com.finalshell.ui.listener.YD3;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;

public class Lk4 extends L42 implements W2_3, Eh2, Sa2 {
   public static ImageIcon I;
   public List d = new ArrayList(1);
   public boolean U = true;
   public SimpleDateFormat X = new SimpleDateFormat(a(-11477, -5773));
   public Date M = null;
   public OR T = null;
   public KD C;
   public E R;
   public com.finalshell.ui.panel.KV3 L;
   public Pu4 S;
   public static String[] f;
   public static String[] b;
   public static String[] c;

   public Lk4() {
      this(null);
   }

   public Lk4(boolean var1) {
      this(null, var1);
   }

   public Lk4(Date var1) {
      this(var1, Lj4.J);
   }

   public Lk4(Date var1, boolean var2) {
      this.M = var1;
      this.setOpaque(false);
      this.n(Lj4.t);
      this.y(Lj4.m);
      this.setBackground(Lj4.c);
      this.n(Lj4.t);
      this.S(Lj4.K);
      this.C = KD.d(I, Lj4.i);
      this.C.setFocusable(false);
      this.C.f(0);
      this.C.t(false);
      this.C.K(true);
      this.C.setCursor(Cursor.getDefaultCursor());
      this.C.addActionListener(new YC3(this));
      this.o(this.C);
      this.addActionListener(new com.finalshell.ui.listener.C_u_2(this));
      this.addMouseListener(new com.finalshell.ui.listener.Rm2(this));
      this.addFocusListener(new Vv(this));
      this.addKeyListener(new WL3(this));
      this.addAncestorListener(new WI3(this));
      this.addComponentListener(new YD3(this));
      this.H$void();
      this.j(var2);
      this.C$void(Lj4.i);
      this.z(Lj4.p);
   }

   public KD Y() {
      return this.C;
   }

   @Override
   public void C$void(int var1) {
      super.C$void(var1);
      this.C.s(var1);
   }

   @Override
   public void j(boolean var1) {
      super.j(var1);
      this.j();
   }

   public OR C$OR() {
      return this.T;
   }

   public void j(OR var1) {
      String[] var2 = N();
      Lk4 var10000 = this;
      if (var2 == null) {
         this.T = var1;
         if (var1 == null) {
            return;
         }

         var10000 = this;
      }

      if (var10000.L != null) {
         var1.j(this.L);
      }
   }

   public void j() {
      this.setMargin(this.b() ? Lj4.C : Lj4.a);
   }

   public void q() {
      String[] var1;
      Lk4 var10000;
      var1 = N();
      var10000 = this;
      label47:
      if (var1 == null) {
         if (!this.requestFocusInWindow()) {
            var10000 = this;
            if (var1 != null) {
               break label47;
            }

            if (!this.isFocusOwner()) {
               return;
            }
         }

         this.Y(false);
         var10000 = this;
      }

      label40: {
         label39: {
            label50: {
               Object var3 = var10000.R;
               if (var1 == null) {
                  if (var10000.R != null) {
                     var10000 = this;
                     if (var1 != null) {
                        break label39;
                     }

                     if (this.L != null) {
                        break label50;
                     }
                  }

                  var3 = FN.L(this);
               }

               Object var2 = var3;
               this.L = new com.finalshell.ui.panel.KV3(this.M);
               this.L.i(false);
               this.L.Y(GO.Fx);
               this.L.D(0);
               var3 = this;
               if (var1 == null) {
                  if (this.T != null) {
                     this.T.j(this.L);
                  }

                  this.R = new E((Window)var2);
                  this.R.setLayout(new BorderLayout());
                  this.R.W(true);
                  this.R.p(false);
                  this.R.add(this.L);
                  this.V(this.R);
                  this.R.pack();
                  this.l();
                  var2.addPropertyChangeListener(a(-11480, 13647), new IQ3(this));
                  this.S = new V_(this);
                  var3 = this;
               }

               ((Lk4)var3).L.J(this.S);
               if (var1 == null) {
                  break label40;
               }
            }

            var10000 = this;
         }

         var10000.l();
      }

      FN.y(this, this.R);
      this.R.setVisible(true);
      this.L.transferFocus();
   }

   public void V(E var1) {
   }

   public void C$void() {
      String[] var1 = N();
      E var10000 = this.R;
      if (var1 == null) {
         if (this.R == null) {
            return;
         }

         var10000 = this.R;
      }

      var10000.setVisible(false);
   }

   public void l() {
      String[] var10000 = N();
      Point var2 = this.getLocationOnScreen();
      Rectangle var3 = this.R.getGraphicsConfiguration().getBounds();
      String[] var1 = var10000;
      int var10 = (this.b()) ? 1 : 0;
      if (var1 == null) {
         var10 = var10 != 0 ? this.s() : 0;
      }

      int var7;
      int var8;
      label73: {
         int var4 = var10;
         byte var5 = (this.getComponentOrientation().isLeftToRight()) ? 1 : 0;
         int var6 = this.getWidth();
         var7 = this.getHeight();
         int var11 = var5;
         if (var1 == null) {
            if (var5 != 0) {
               int var12 = var2.x + var4 + this.R.getWidth();
               int var10001 = var3.x + var3.width;
               if (var1 == null) {
                  if (var12 <= var10001) {
                     var8 = var2.x + var4;
                     if (var1 == null) {
                        break label73;
                     }
                  }

                  var12 = var2.x + var6 - var4;
                  var10001 = this.R.getWidth();
               }

               var8 = var12 - var10001;
               if (var1 == null) {
                  break label73;
               }
            }

            var11 = var2.x + var6 - var4 - this.R.getWidth();
         }

         int var15 = var3.x;
         if (var1 == null) {
            if (var11 >= var3.x) {
               var8 = var2.x + var6 - var4 - this.R.getWidth();
               if (var1 == null) {
                  break label73;
               }
            }

            var11 = var2.x;
            var15 = var4;
         }

         var8 = var11 + var15;
      }

      int var9;
      label74: {
         int var13 = var2.y + var7 + this.R.getHeight();
         int var16 = var3.y + var3.height;
         if (var1 == null) {
            if (var13 <= var16) {
               int var14 = var2.y + var7;
               var16 = (this.b()) ? 1 : 0;
               if (var1 == null) {
                  var16 = var16 != 0 ? 0 : 1;
               }

               var9 = var14 + var16;
               if (var1 == null) {
                  break label74;
               }
            }

            var13 = var2.y - this.R.getHeight();
            var16 = (this.b()) ? 1 : 0;
         }

         if (var1 == null) {
            var16 = var16 != 0 ? 0 : 1;
         }

         var9 = var13 - var16;
      }

      this.R.setLocation(var8, var9);
   }

   public Date H$Date() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Lk4.N ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/core/Lk4.getText ()Ljava/lang/String;
      // 08: astore 2
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnonnull 23
      // 0e: ifnull 35
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Lk4.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Lk4.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: ldc_w ""
      // 26: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 29: ifne 35
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/Lk4.X Ljava/text/SimpleDateFormat;
      // 30: aload 2
      // 31: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 34: areturn
      // 35: aconst_null
      // 36: areturn
      // 37: astore 2
      // 38: aload 0
      // 39: getfield com/finalshell/core/Lk4.M Ljava/util/Date;
      // 3c: areturn
   }

   public String X() {
      String[] var1 = N();
      Lk4 var10000 = this;
      if (var1 == null) {
         if (this.M == null) {
            return "";
         }

         var10000 = this;
      }

      return var10000.X.format(this.M);
   }

   public Date E() {
      return this.M;
   }

   public void R(Date var1) {
      this.f(var1, com.finalshell.ui.model.N0.other, true);
   }

   public void V(boolean var1) {
      this.Y(var1);
   }

   public void Y(boolean var1) {
      this.f(this.H$Date(), com.finalshell.ui.model.N0.field, var1);
   }

   public void f(boolean var1) {
      this.f(this.L.I(), com.finalshell.ui.model.N0.calendar, var1);
   }

   public void f(Date var1, com.finalshell.ui.model.N0 var2, boolean var3) {
      String[] var4 = N();
      boolean var10000 = Ax2.Z(this.M, new Object[]{var1});
      if (var4 == null) {
         var10000 = !var10000;
      }

      label38: {
         boolean var5 = var10000;
         this.M = var1;
         this.H$void();
         var10000 = this.U;
         if (var4 == null) {
            if (this.U) {
               break label38;
            }

            var10000 = var5;
         }

         if (!var10000) {
            return;
         }
      }

      label29:
      if (var2 != com.finalshell.ui.model.N0.calendar) {
         Lk4 var7 = this;
         if (var4 == null) {
            if (this.L == null) {
               break label29;
            }

            var7 = this;
         }

         var7.i(var1);
      }

      if (var3) {
         this.e(var1);
      }
   }

   public void H$void() {
      this.setText(this.X());
      this.setCaretPosition(0);
   }

   public void i(Date var1) {
      this.L.z(this.S);
      this.L.N(var1);
      this.L.J(this.S);
   }

   public SimpleDateFormat U() {
      return this.X;
   }

   public void U(SimpleDateFormat var1) {
      this.X = var1;
      this.H$void();
   }

   @Override
   public void setEnabled(boolean var1) {
      super.setEnabled(var1);
      this.C.setEnabled(var1);
   }

   public boolean S() {
      return this.U;
   }

   public void N(boolean var1) {
      this.U = var1;
   }

   public void Z(Pu4 var1) {
      this.d.add(var1);
   }

   public void s(Pu4 var1) {
      this.d.remove(var1);
   }

   public void e(Date var1) {
      String[] var10000 = N();
      Iterator var3 = AL_2.J((Collection)this.d).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         Pu4 var4 = (Pu4)var3.next();
         var4.i(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public Lk4 j(int var1) {
      return (Lk4)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public Lk4 L(int var1) {
      return (Lk4)PY.j(this, var1);
   }

   @Override
   public int A$int() {
      return PY.S(this);
   }

   public Lk4 C$lk_4(int var1) {
      return (Lk4)PY.N(this, var1);
   }

   @Override
   public int Q$int() {
      return PY.Z(this);
   }

   public Lk4 e(int var1) {
      return (Lk4)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public Lk4 A(int var1) {
      return (Lk4)PY.b(this, var1);
   }

   @Override
   public int a$int() {
      return PY.i(this);
   }

   public Lk4 t(int var1) {
      return (Lk4)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public Lk4 U(int var1, int var2) {
      return (Lk4)PY.O(this, var1, var2);
   }

   @Override
   public L42 W$l4_2(int var1, int var2) {
      return this.U(var1, var2);
   }

   @Override
   public L42 M(int var1) {
      return this.t(var1);
   }

   @Override
   public L42 o$l4_2(int var1) {
      return this.A(var1);
   }

   @Override
   public L42 b(int var1) {
      return this.e(var1);
   }

   @Override
   public L42 f(int var1) {
      return this.C$lk_4(var1);
   }

   @Override
   public L42 C$l4_2(int var1) {
      return this.L(var1);
   }

   @Override
   public L42 S(int var1) {
      return this.j(var1);
   }

   @Override
   public Component W$Component(int var1, int var2) {
      return this.U(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.t(var1);
   }

   @Override
   public Component p(int var1) {
      return this.A(var1);
   }

   @Override
   public Component D(int var1) {
      return this.e(var1);
   }

   @Override
   public Component V(int var1) {
      return this.C$lk_4(var1);
   }

   @Override
   public Component x(int var1) {
      return this.L(var1);
   }

   @Override
   public Component O$Component(int var1) {
      return this.j(var1);
   }

   static {
      __vfClinit__();
   }

   public static void l(String[] var0) {
      f = var0;
   }

   public static String[] N() {
      return f;
   }

   public static Throwable b(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -11478) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 60;
               break;
            case 1:
               var10000 = 199;
               break;
            case 2:
               var10000 = 218;
               break;
            case 3:
               var10000 = 241;
               break;
            case 4:
               var10000 = 87;
               break;
            case 5:
               var10000 = 193;
               break;
            case 6:
               var10000 = 169;
               break;
            case 7:
               var10000 = 201;
               break;
            case 8:
               var10000 = 162;
               break;
            case 9:
               var10000 = 184;
               break;
            case 10:
               var10000 = 148;
               break;
            case 11:
               var10000 = 167;
               break;
            case 12:
               var10000 = 198;
               break;
            case 13:
               var10000 = 174;
               break;
            case 14:
               var10000 = 224;
               break;
            case 15:
               var10000 = 65;
               break;
            case 16:
               var10000 = 126;
               break;
            case 17:
               var10000 = 64;
               break;
            case 18:
               var10000 = 43;
               break;
            case 19:
               var10000 = 159;
               break;
            case 20:
               var10000 = 194;
               break;
            case 21:
               var10000 = 81;
               break;
            case 22:
               var10000 = 8;
               break;
            case 23:
               var10000 = 53;
               break;
            case 24:
               var10000 = 227;
               break;
            case 25:
               var10000 = 21;
               break;
            case 26:
               var10000 = 14;
               break;
            case 27:
               var10000 = 74;
               break;
            case 28:
               var10000 = 110;
               break;
            case 29:
               var10000 = 104;
               break;
            case 30:
               var10000 = 207;
               break;
            case 31:
               var10000 = 179;
               break;
            case 32:
               var10000 = 219;
               break;
            case 33:
               var10000 = 178;
               break;
            case 34:
               var10000 = 246;
               break;
            case 35:
               var10000 = 93;
               break;
            case 36:
               var10000 = 33;
               break;
            case 37:
               var10000 = 115;
               break;
            case 38:
               var10000 = 98;
               break;
            case 39:
               var10000 = 170;
               break;
            case 40:
               var10000 = 38;
               break;
            case 41:
               var10000 = 223;
               break;
            case 42:
               var10000 = 232;
               break;
            case 43:
               var10000 = 177;
               break;
            case 44:
               var10000 = 196;
               break;
            case 45:
               var10000 = 30;
               break;
            case 46:
               var10000 = 31;
               break;
            case 47:
               var10000 = 181;
               break;
            case 48:
               var10000 = 205;
               break;
            case 49:
               var10000 = 146;
               break;
            case 50:
               var10000 = 204;
               break;
            case 51:
               var10000 = 103;
               break;
            case 52:
               var10000 = 231;
               break;
            case 53:
               var10000 = 222;
               break;
            case 54:
               var10000 = 212;
               break;
            case 55:
               var10000 = 72;
               break;
            case 56:
               var10000 = 119;
               break;
            case 57:
               var10000 = 153;
               break;
            case 58:
               var10000 = 128;
               break;
            case 59:
               var10000 = 35;
               break;
            case 60:
               var10000 = 209;
               break;
            case 61:
               var10000 = 137;
               break;
            case 62:
               var10000 = 123;
               break;
            case 63:
               var10000 = 255;
               break;
            case 64:
               var10000 = 61;
               break;
            case 65:
               var10000 = 234;
               break;
            case 66:
               var10000 = 211;
               break;
            case 67:
               var10000 = 134;
               break;
            case 68:
               var10000 = 84;
               break;
            case 69:
               var10000 = 83;
               break;
            case 70:
               var10000 = 142;
               break;
            case 71:
               var10000 = 129;
               break;
            case 72:
               var10000 = 236;
               break;
            case 73:
               var10000 = 52;
               break;
            case 74:
               var10000 = 131;
               break;
            case 75:
               var10000 = 173;
               break;
            case 76:
               var10000 = 1;
               break;
            case 77:
               var10000 = 150;
               break;
            case 78:
               var10000 = 221;
               break;
            case 79:
               var10000 = 6;
               break;
            case 80:
               var10000 = 10;
               break;
            case 81:
               var10000 = 127;
               break;
            case 82:
               var10000 = 122;
               break;
            case 83:
               var10000 = 225;
               break;
            case 84:
               var10000 = 68;
               break;
            case 85:
               var10000 = 214;
               break;
            case 86:
               var10000 = 51;
               break;
            case 87:
               var10000 = 182;
               break;
            case 88:
               var10000 = 157;
               break;
            case 89:
               var10000 = 49;
               break;
            case 90:
               var10000 = 19;
               break;
            case 91:
               var10000 = 109;
               break;
            case 92:
               var10000 = 136;
               break;
            case 93:
               var10000 = 95;
               break;
            case 94:
               var10000 = 114;
               break;
            case 95:
               var10000 = 166;
               break;
            case 96:
               var10000 = 59;
               break;
            case 97:
               var10000 = 80;
               break;
            case 98:
               var10000 = 111;
               break;
            case 99:
               var10000 = 141;
               break;
            case 100:
               var10000 = 191;
               break;
            case 101:
               var10000 = 189;
               break;
            case 102:
               var10000 = 37;
               break;
            case 103:
               var10000 = 50;
               break;
            case 104:
               var10000 = 2;
               break;
            case 105:
               var10000 = 217;
               break;
            case 106:
               var10000 = 143;
               break;
            case 107:
               var10000 = 149;
               break;
            case 108:
               var10000 = 107;
               break;
            case 109:
               var10000 = 254;
               break;
            case 110:
               var10000 = 78;
               break;
            case 111:
               var10000 = 175;
               break;
            case 112:
               var10000 = 91;
               break;
            case 113:
               var10000 = 11;
               break;
            case 114:
               var10000 = 183;
               break;
            case 115:
               var10000 = 0;
               break;
            case 116:
               var10000 = 88;
               break;
            case 117:
               var10000 = 62;
               break;
            case 118:
               var10000 = 113;
               break;
            case 119:
               var10000 = 48;
               break;
            case 120:
               var10000 = 190;
               break;
            case 121:
               var10000 = 133;
               break;
            case 122:
               var10000 = 63;
               break;
            case 123:
               var10000 = 154;
               break;
            case 124:
               var10000 = 187;
               break;
            case 125:
               var10000 = 186;
               break;
            case 126:
               var10000 = 171;
               break;
            case 127:
               var10000 = 46;
               break;
            case 128:
               var10000 = 202;
               break;
            case 129:
               var10000 = 28;
               break;
            case 130:
               var10000 = 82;
               break;
            case 131:
               var10000 = 96;
               break;
            case 132:
               var10000 = 160;
               break;
            case 133:
               var10000 = 47;
               break;
            case 134:
               var10000 = 13;
               break;
            case 135:
               var10000 = 245;
               break;
            case 136:
               var10000 = 20;
               break;
            case 137:
               var10000 = 79;
               break;
            case 138:
               var10000 = 58;
               break;
            case 139:
               var10000 = 100;
               break;
            case 140:
               var10000 = 106;
               break;
            case 141:
               var10000 = 32;
               break;
            case 142:
               var10000 = 188;
               break;
            case 143:
               var10000 = 3;
               break;
            case 144:
               var10000 = 124;
               break;
            case 145:
               var10000 = 130;
               break;
            case 146:
               var10000 = 247;
               break;
            case 147:
               var10000 = 145;
               break;
            case 148:
               var10000 = 101;
               break;
            case 149:
               var10000 = 117;
               break;
            case 150:
               var10000 = 156;
               break;
            case 151:
               var10000 = 67;
               break;
            case 152:
               var10000 = 25;
               break;
            case 153:
               var10000 = 242;
               break;
            case 154:
               var10000 = 44;
               break;
            case 155:
               var10000 = 251;
               break;
            case 156:
               var10000 = 90;
               break;
            case 157:
               var10000 = 112;
               break;
            case 158:
               var10000 = 244;
               break;
            case 159:
               var10000 = 243;
               break;
            case 160:
               var10000 = 9;
               break;
            case 161:
               var10000 = 45;
               break;
            case 162:
               var10000 = 168;
               break;
            case 163:
               var10000 = 36;
               break;
            case 164:
               var10000 = 138;
               break;
            case 165:
               var10000 = 248;
               break;
            case 166:
               var10000 = 17;
               break;
            case 167:
               var10000 = 206;
               break;
            case 168:
               var10000 = 121;
               break;
            case 169:
               var10000 = 105;
               break;
            case 170:
               var10000 = 69;
               break;
            case 171:
               var10000 = 5;
               break;
            case 172:
               var10000 = 4;
               break;
            case 173:
               var10000 = 208;
               break;
            case 174:
               var10000 = 57;
               break;
            case 175:
               var10000 = 71;
               break;
            case 176:
               var10000 = 132;
               break;
            case 177:
               var10000 = 77;
               break;
            case 178:
               var10000 = 24;
               break;
            case 179:
               var10000 = 55;
               break;
            case 180:
               var10000 = 120;
               break;
            case 181:
               var10000 = 215;
               break;
            case 182:
               var10000 = 228;
               break;
            case 183:
               var10000 = 158;
               break;
            case 184:
               var10000 = 250;
               break;
            case 185:
               var10000 = 144;
               break;
            case 186:
               var10000 = 70;
               break;
            case 187:
               var10000 = 18;
               break;
            case 188:
               var10000 = 163;
               break;
            case 189:
               var10000 = 233;
               break;
            case 190:
               var10000 = 192;
               break;
            case 191:
               var10000 = 86;
               break;
            case 192:
               var10000 = 40;
               break;
            case 193:
               var10000 = 249;
               break;
            case 194:
               var10000 = 210;
               break;
            case 195:
               var10000 = 16;
               break;
            case 196:
               var10000 = 66;
               break;
            case 197:
               var10000 = 229;
               break;
            case 198:
               var10000 = 39;
               break;
            case 199:
               var10000 = 108;
               break;
            case 200:
               var10000 = 94;
               break;
            case 201:
               var10000 = 165;
               break;
            case 202:
               var10000 = 41;
               break;
            case 203:
               var10000 = 102;
               break;
            case 204:
               var10000 = 164;
               break;
            case 205:
               var10000 = 203;
               break;
            case 206:
               var10000 = 29;
               break;
            case 207:
               var10000 = 200;
               break;
            case 208:
               var10000 = 139;
               break;
            case 209:
               var10000 = 92;
               break;
            case 210:
               var10000 = 116;
               break;
            case 211:
               var10000 = 118;
               break;
            case 212:
               var10000 = 76;
               break;
            case 213:
               var10000 = 27;
               break;
            case 214:
               var10000 = 239;
               break;
            case 215:
               var10000 = 12;
               break;
            case 216:
               var10000 = 172;
               break;
            case 217:
               var10000 = 240;
               break;
            case 218:
               var10000 = 42;
               break;
            case 219:
               var10000 = 147;
               break;
            case 220:
               var10000 = 195;
               break;
            case 221:
               var10000 = 85;
               break;
            case 222:
               var10000 = 155;
               break;
            case 223:
               var10000 = 135;
               break;
            case 224:
               var10000 = 89;
               break;
            case 225:
               var10000 = 97;
               break;
            case 226:
               var10000 = 237;
               break;
            case 227:
               var10000 = 125;
               break;
            case 228:
               var10000 = 161;
               break;
            case 229:
               var10000 = 56;
               break;
            case 230:
               var10000 = 99;
               break;
            case 231:
               var10000 = 7;
               break;
            case 232:
               var10000 = 23;
               break;
            case 233:
               var10000 = 213;
               break;
            case 234:
               var10000 = 226;
               break;
            case 235:
               var10000 = 75;
               break;
            case 236:
               var10000 = 140;
               break;
            case 237:
               var10000 = 151;
               break;
            case 238:
               var10000 = 22;
               break;
            case 239:
               var10000 = 73;
               break;
            case 240:
               var10000 = 197;
               break;
            case 241:
               var10000 = 220;
               break;
            case 242:
               var10000 = 152;
               break;
            case 243:
               var10000 = 238;
               break;
            case 244:
               var10000 = 216;
               break;
            case 245:
               var10000 = 235;
               break;
            case 246:
               var10000 = 26;
               break;
            case 247:
               var10000 = 54;
               break;
            case 248:
               var10000 = 252;
               break;
            case 249:
               var10000 = 230;
               break;
            case 250:
               var10000 = 185;
               break;
            case 251:
               var10000 = 34;
               break;
            case 252:
               var10000 = 15;
               break;
            case 253:
               var10000 = 253;
               break;
            case 254:
               var10000 = 180;
               break;
            default:
               var10000 = 176;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ë@ýO\u001coä\u0013=áU×%ý\nÚv6M2iÅêªÙ\u0014ÜÌRM·³\u000fîa\u009a\u0082Î\u0003í\u0088B4JAi";
      int var4 = "ë@ýO\u001coä\u0013=áU×%ý\nÚv6M2iÅêªÙ\u0014ÜÌRM·³\u000fîa\u009a\u0082Î\u0003í\u0088B4JAi".length();
      char var1 = 14;
      l(null);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 41;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 41;
               var10006 = var6;
            } else {
               var13 = 41;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 41;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 60;
                     break;
                  case 1:
                     var29 = 26;
                     break;
                  case 2:
                     var29 = 32;
                     break;
                  case 3:
                     var29 = 105;
                     break;
                  case 4:
                     var29 = 90;
                     break;
                  case 5:
                     var29 = 43;
                     break;
                  default:
                     var29 = 89;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            b = var5;
            c = new String[3];
            I = new ImageIcon(Lk4.class.getResource(a(-11478, -15285)));
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}





