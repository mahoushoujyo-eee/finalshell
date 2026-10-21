package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.CH3_2;
import com.finalshell.core.FN;
import com.finalshell.core.GO;
import com.finalshell.core.GR;
import com.finalshell.core.KD;
import com.finalshell.core.Ne4;
import com.finalshell.core.O22_2;
import com.finalshell.core.OM;
import com.finalshell.core.P9;
import com.finalshell.core.TA;
import com.finalshell.core.UE;
import com.finalshell.ui.listener.G5;
import com.finalshell.ui.listener.H5;
import com.finalshell.ui.listener.K4;
import com.finalshell.ui.listener.O5;
import com.finalshell.ui.listener.P5;
import com.finalshell.ui.listener.T3;
import com.finalshell.ui.listener.V23;
import com.finalshell.ui.listener.V4;
import com.finalshell.ui.listener.Y9;
import com.finalshell.ui.listener.Z5;
import com.finalshell.ui.model.A2;
import com.finalshell.ui.model.IX3;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class N_2 extends Ky4 implements OM {
   public final List O;
   public final List F;
   public boolean Q;
   public Boolean v;
   public Color E;
   public Color R;
   public int e;
   public boolean T;
   public final L l;
   public final X3 q;
   public final Kh4 h;
   public final Ne4 N;
   public final Ne4 J;
   public final Ne4 C;
   public final Ne4 z;
   public final Ne4 Y;
   public final Ne4 G;
   public final Ne4 p;
   public Ky4 b;
   public static int s;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] f;

   public N_2() {
      this(false);
   }

   public N_2(boolean var1) {
   super();
      int var10000 = W();
      this.O = new ArrayList(1);
      this.F = new ArrayList(1);
      this.Q = false;
      this.v = false;
      this.E = Color.WHITE;
      this.R = Color.WHITE;
      int var2 = var10000;
      this.e = a(3146, 4759396790005649098L);
      this.T = false;
      this.Q = var1;
      this.setOpaque(false);
      this.u(false);
      this.N(2, 5, 2, 5);
      this.setLayout(new IX3(new double[][]{{-1.0, 4.0, -2.0, 4.0, -2.0}, {-2.0, -2.0}}));
      this.l = new L();
      this.l.setOpaque(false);
      this.l.i(this.X());
      T3 var3 = new T3(this);
      this.l.N(var3);
      this.add(this.l, b(-24174, -19985));
      this.q = new X3();
      this.q.setOpaque(false);
      this.q.l(this.X());
      this.q.M(new K4(this));
      this.add(this.q, b(-24175, -12240));
      JPanel var4 = new JPanel();
      double[][] var10003 = new double[][]{{-2.0, 4.0, -1.0}, null};
      double[] var10006 = new double[a(27058, 3230988660151069493L)];
      var10006[0] = 3.0;
      var10006[1] = -1.0;
      var10006[2] = 5.0;
      var10006[3] = -2.0;
      var10006[4] = 4.0;
      var10006[5] = -2.0;
      var10006[a(18138, 3174907967061197904L)] = 1.0;
      var10006[a(79, 9093449316102521545L)] = -2.0;
      var10006[a(1, 8566485516493308563L)] = 1.0;
      var10006[a(25957, 1764619541134387180L)] = -2.0;
      var10006[a(31851, 5864792948963786479L)] = 1.0;
      var10006[a(359, 1808594342504973290L)] = -2.0;
      var10006[a(19696, 2290747509416038015L)] = 3.0;
      var10003[1] = var10006;
      var4.setLayout(new IX3(var10003));
      var4.setOpaque(false);
      this.add(var4, b(-24182, 7804));
      this.h = new Kh4();
      this.h.W(new com.finalshell.core.D22(this));
      this.B(this.R);
      this.h.W(this.E);
      var4.add(this.h, b(-24188, -25632));
      var4.add(new CH3_2(0), b(-24160, 9720));
      JPanel var5 = new JPanel();
      var10003 = new double[][]{{-1.0, 5.0, -2.0, 4.0, -2.0}, null};
      var10006 = new double[a(23237, 4324947592443926596L)];
      var10006[0] = -2.0;
      var10006[1] = 0.0;
      var10006[2] = -2.0;
      var10006[3] = 0.0;
      var10006[4] = -2.0;
      var10006[5] = 1.0;
      var10006[a(18088, 6210645615587394603L)] = -2.0;
      var10006[a(8974, 4520898657246962048L)] = 1.0;
      var10006[a(14937, 8810667321751271626L)] = -2.0;
      var10006[a(31043, 5577110205764484038L)] = 0.0;
      var10006[a(29312, 5473133976913621004L)] = -2.0;
      var10006[a(26373, 6604833949661373838L)] = 0.0;
      var10006[a(20705, 3128534266782388835L)] = -2.0;
      var10003[1] = var10006;
      var5.setLayout(new IX3(var10003));
      var5.setOpaque(false);
      var4.add(var5, b(-24190, 11347));
      O var6 = new O(b(-24191, -25620));
      var6.D(true);
      var5.add(var6, b(-24181, -11139));
      this.N = new Ne4();
      var5.add(this.N, b(-24164, -8813));
      O var7 = new O("°");
      var7.D(true);
      var5.add(var7, b(-24192, -11014));
      O var8 = new O(b(-24179, 7620));
      var8.D(true);
      var5.add(var8, b(-24165, 13395));
      this.J = new Ne4();
      var5.add(this.J, b(-24169, -28552));
      O var9 = new O("%");
      var9.D(true);
      var5.add(var9, b(-24153, 10516));
      O var10 = new O(b(-24157, 14099));
      var10.D(true);
      var5.add(var10, b(-24185, -21815));
      this.C = new Ne4();
      var5.add(this.C, b(-24162, 12807));
      O var11 = new O("%");
      var11.D(true);
      var5.add(var11, b(-24184, -17272));
      G5 var12 = new G5(this, var3);
      this.N.addCaretListener(var12);
      this.J.addCaretListener(var12);
      this.C.addCaretListener(var12);
      var5.add(new CH3_2(0), b(-24168, 13748));
      O var13 = new O(b(-24172, -31791));
      var13.D(true);
      var5.add(var13, b(-24170, -28076));
      this.z = new Ne4();
      this.z.setColumns(3);
      var5.add(this.z, b(-24189, 32530));
      O var14 = new O(b(-24178, -23448));
      var14.D(true);
      var5.add(var14, b(-24166, 1285));
      this.Y = new Ne4();
      this.Y.setColumns(3);
      var5.add(this.Y, b(-24176, -334));
      O var15 = new O(b(-24154, 11652));
      var15.D(true);
      var5.add(var15, b(-24159, 17777));
      this.G = new Ne4();
      this.G.setColumns(3);
      var5.add(this.G, b(-24177, 23741));
      P5 var16 = new P5(this, var3);
      this.z.addCaretListener(var16);
      this.Y.addCaretListener(var16);
      this.G.addCaretListener(var16);
      var4.add(new CH3_2(0), b(-24171, 31555));
      O var17 = new O("#");
      var17.D(true);
      var4.add(var17, b(-24155, 19524));
      this.p = new Ne4();
      this.b(this.R);
      H5 var18 = new H5(this, var3);
      this.p.addCaretListener(var18);
      var4.add(this.p, b(-24180, -6600));
      if (var2 != 0) {
         if (var1) {
            this.add(this.J(), b(-24186, -20732));
         }

         this.F(this.E);
         this.x(this.R);
      }

      if (var2 == 0) {
         Ky4.K(new String[1]);
      }
   }

   public Ky4 J() {
      int var1 = W();
      Ky4 var10000 = this.b;
      if (var1 != 0) {
         if (this.b == null) {
            this.b = this.t$ky_4();
         }

         var10000 = this.b;
      }

      return var10000;
   }

   public Ky4 t$ky_4() {
      Ky4 var2 = new Ky4(new TA(2, 0));
      int var10000 = W();
      var2.setOpaque(false);
      var2.N(5, 0, 3, 0);
      int var1 = var10000;
      UE var3 = new UE();
      var3.u(b(-24161, 16051), new Object[0]);
      var3.setSelected(this.X());
      var3.f(0, 5, 0, 5);
      var3.addActionListener(new O5(this, var3));
      var2.add(var3);
      KD var4 = new KD();
      var4.u(b(-24183, -22243), new Object[0]);
      var4.Y(this, GR.lZ);
      if (var1 != 0) {
         if (GO.A) {
            var4.u(GO.Fv);
         }

         var4.addActionListener(new V4(this));
         this.l.S().addMouseListener(new Z5(this, var4));
         var2.add(var4, b(-24173, 393));
      }

      KD var5 = new KD();
      var5.u(b(-24156, -22999), new Object[0]);
      var5.Y(this, GR.rj);
      if (var1 != 0) {
         if (GO.A) {
            var5.u(GO.C);
         }

         var5.addActionListener(new Y9(this));
         var2.add(var5, b(-24163, -5789));
      }

      KD var6 = new KD();
      var6.u(b(-24167, 22183), new Object[0]);
      var6.Y(this, GR.lD);
      byte var7 = (GO.A) ? 1 : 0;
      if (var1 != 0) {
         if (GO.A) {
            var6.u(GO.FN);
         }

         var6.addActionListener(new V23(this));
         var2.add(var6, b(-24163, -5789));
         var7 = 3;
      }

      Component[] var8 = new Component[var7];
      var8[0] = var4;
      var8[1] = var5;
      var8[2] = var6;
      FN.b(var8);
      return var2;
   }

   public boolean G() {
      return this.Q;
   }

   public void n(boolean var1) {
      label26: {
         N_2 var3;
         label29: {
            int var2 = W();
            boolean var10000 = this.Q;
            if (var2 != 0) {
               if (this.Q == var1) {
                  return;
               }

               var3 = this;
               if (var2 == 0) {
                  break label29;
               }

               this.Q = var1;
               var10000 = var1;
            }

            if (var10000) {
               this.add(this.J(), b(-24187, 21897));
               if (var2 != 0) {
                  break label26;
               }
            }

            var3 = this;
         }

         var3.remove(this.J());
      }

      this.revalidate();
   }

   public boolean X() {
      return this.v;
   }

   public void N(boolean var1) {
      this.v = var1;
      this.l.i(var1);
      this.q.l(var1);
   }

   public void q(Color var1, A2 var2) {
      int var10000 = W();
      this.T = true;
      int var3 = var10000;
      boolean var4 = var2.equals(A2.palette);
      if (var3 != 0) {
         if (!var4) {
            this.D(var1);
         }

         var4 = var2.equals(A2.doubleField);
      }

      if (var3 != 0) {
         if (!var4) {
            this.B(var1);
         }

         var4 = var2.equals(A2.hsbField);
      }

      if (var3 != 0) {
         if (!var4) {
            this.k(var1);
         }

         var4 = var2.equals(A2.rgbField);
      }

      if (var3 != 0) {
         if (!var4) {
            this.O(var1);
         }

         var4 = var2.equals(A2.hexField);
      }

      if (!var4) {
         this.b(var1);
      }

      this.T = false;
      this.r();
   }

   public void D(Color var1) {
      this.q.C(var1);
      this.l.K(var1);
      this.l.p(var1);
   }

   public void B(Color var1) {
      this.h.K(var1);
   }

   public void b(Color var1) {
      this.p.setText(P9.u(var1).substring(1));
   }

   public void O(Color var1) {
      this.z.setText("" + var1.getRed());
      this.Y.setText("" + var1.getGreen());
      this.G.setText("" + var1.getBlue());
   }

   public void k(Color var1) {
      float[] var2 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
      this.N.setText("" + this.q.K());
      this.J.setText("" + Math.round(100.0F * var2[1]));
      this.C.setText("" + Math.round(100.0F * var2[2]));
   }

   public Color T() {
      return this.R;
   }

   public void x(Color var1) {
      this.R = var1;
      this.F(var1);
      this.q(var1, A2.outer);
   }

   public Color t$Color() {
      return this.E;
   }

   public void F(Color var1) {
      this.E = var1;
      this.h.W(var1);
   }

   public void Z() {
      this.q(a(18740, 1157121537617988540L));
   }

   public void q(int var1) {
      this.e = var1;
   }

   public int V() {
      return this.e;
   }

   public void M(ChangeListener var1) {
      this.O.add(var1);
   }

   public void L(ChangeListener var1) {
      this.O.remove(var1);
   }

   public void r() {
      int var10000 = g();
      ChangeEvent var2 = new ChangeEvent(this);
      int var1 = var10000;

      for (ChangeListener var4 : AL_2.J((Collection)this.O)) {
         var4.stateChanged(var2);
         if (var1 != 0) {
            break;
         }
      }
   }

   public void T(O22_2 var1) {
      this.F.add(var1);
   }

   public void U(O22_2 var1) {
      this.F.remove(var1);
   }

   public void Q(ActionEvent var1) {
      int var10000 = W();
      Iterator var3 = AL_2.J((Collection)this.F).iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         O22_2 var4 = (O22_2)var3.next();
         var4.H(var1);
         if (var2 == 0) {
            break;
         }
      }
   }

   public void x(ActionEvent var1) {
      int var10000 = g();
      Iterator var3 = AL_2.J((Collection)this.F).iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         O22_2 var4 = (O22_2)var3.next();
         var4.j(var1);
         if (var2 != 0) {
            break;
         }
      }
   }

   public void k(ActionEvent var1) {
      int var10000 = g();
      Iterator var3 = AL_2.J((Collection)this.F).iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         O22_2 var4 = (O22_2)var3.next();
         var4.r(var1);
         if (var2 != 0) {
            break;
         }
      }
   }

   public static Color y(N_2 var0, Color var1) {
      return var0.R = var1;
   }

   public static L r(N_2 var0) {
      return var0.l;
   }

   public static Color c(N_2 var0) {
      return var0.R;
   }

   public static void a(N_2 var0, Color var1, A2 var2) {
      var0.q(var1, var2);
   }

   public static X3 u(N_2 var0) {
      return var0.q;
   }

   public static Kh4 P(N_2 var0) {
      return var0.h;
   }

   public static boolean N(N_2 var0) {
      return var0.T;
   }

   public static Ne4 t(N_2 var0) {
      return var0.N;
   }

   public static Ne4 f(N_2 var0) {
      return var0.J;
   }

   public static Ne4 o(N_2 var0) {
      return var0.C;
   }

   public static Ne4 U(N_2 var0) {
      return var0.z;
   }

   public static Ne4 Z(N_2 var0) {
      return var0.Y;
   }

   public static Ne4 l(N_2 var0) {
      return var0.G;
   }

   public static Ne4 E(N_2 var0) {
      return var0.p;
   }

   public static int l(N_2 var0, int var1) {
      return var0.e = var1;
   }

   public static void O(N_2 var0, ActionEvent var1) {
      var0.Q(var1);
   }

   public static void D(N_2 var0, ActionEvent var1) {
      var0.x(var1);
   }

   public static void c(N_2 var0, ActionEvent var1) {
      var0.k(var1);
   }

   public static void L(int var0) {
      s = var0;
   }

   public static int g() {
      return s;
   }

   public static int W() {
      int var0 = g();
      return var0 == 0 ? 10 : 0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -24187) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 17;
               break;
            case 1:
               var10000 = 87;
               break;
            case 2:
               var10000 = 99;
               break;
            case 3:
               var10000 = 54;
               break;
            case 4:
               var10000 = 114;
               break;
            case 5:
               var10000 = 5;
               break;
            case 6:
               var10000 = 62;
               break;
            case 7:
               var10000 = 146;
               break;
            case 8:
               var10000 = 192;
               break;
            case 9:
               var10000 = 23;
               break;
            case 10:
               var10000 = 163;
               break;
            case 11:
               var10000 = 36;
               break;
            case 12:
               var10000 = 212;
               break;
            case 13:
               var10000 = 53;
               break;
            case 14:
               var10000 = 205;
               break;
            case 15:
               var10000 = 66;
               break;
            case 16:
               var10000 = 1;
               break;
            case 17:
               var10000 = 15;
               break;
            case 18:
               var10000 = 119;
               break;
            case 19:
               var10000 = 171;
               break;
            case 20:
               var10000 = 231;
               break;
            case 21:
               var10000 = 211;
               break;
            case 22:
               var10000 = 239;
               break;
            case 23:
               var10000 = 241;
               break;
            case 24:
               var10000 = 178;
               break;
            case 25:
               var10000 = 94;
               break;
            case 26:
               var10000 = 7;
               break;
            case 27:
               var10000 = 238;
               break;
            case 28:
               var10000 = 95;
               break;
            case 29:
               var10000 = 10;
               break;
            case 30:
               var10000 = 188;
               break;
            case 31:
               var10000 = 32;
               break;
            case 32:
               var10000 = 221;
               break;
            case 33:
               var10000 = 138;
               break;
            case 34:
               var10000 = 159;
               break;
            case 35:
               var10000 = 160;
               break;
            case 36:
               var10000 = 249;
               break;
            case 37:
               var10000 = 203;
               break;
            case 38:
               var10000 = 141;
               break;
            case 39:
               var10000 = 158;
               break;
            case 40:
               var10000 = 129;
               break;
            case 41:
               var10000 = 34;
               break;
            case 42:
               var10000 = 74;
               break;
            case 43:
               var10000 = 145;
               break;
            case 44:
               var10000 = 21;
               break;
            case 45:
               var10000 = 137;
               break;
            case 46:
               var10000 = 71;
               break;
            case 47:
               var10000 = 182;
               break;
            case 48:
               var10000 = 59;
               break;
            case 49:
               var10000 = 181;
               break;
            case 50:
               var10000 = 183;
               break;
            case 51:
               var10000 = 80;
               break;
            case 52:
               var10000 = 255;
               break;
            case 53:
               var10000 = 220;
               break;
            case 54:
               var10000 = 81;
               break;
            case 55:
               var10000 = 123;
               break;
            case 56:
               var10000 = 46;
               break;
            case 57:
               var10000 = 101;
               break;
            case 58:
               var10000 = 8;
               break;
            case 59:
               var10000 = 175;
               break;
            case 60:
               var10000 = 0;
               break;
            case 61:
               var10000 = 103;
               break;
            case 62:
               var10000 = 69;
               break;
            case 63:
               var10000 = 39;
               break;
            case 64:
               var10000 = 228;
               break;
            case 65:
               var10000 = 11;
               break;
            case 66:
               var10000 = 223;
               break;
            case 67:
               var10000 = 250;
               break;
            case 68:
               var10000 = 187;
               break;
            case 69:
               var10000 = 144;
               break;
            case 70:
               var10000 = 44;
               break;
            case 71:
               var10000 = 111;
               break;
            case 72:
               var10000 = 89;
               break;
            case 73:
               var10000 = 140;
               break;
            case 74:
               var10000 = 202;
               break;
            case 75:
               var10000 = 73;
               break;
            case 76:
               var10000 = 219;
               break;
            case 77:
               var10000 = 20;
               break;
            case 78:
               var10000 = 64;
               break;
            case 79:
               var10000 = 218;
               break;
            case 80:
               var10000 = 199;
               break;
            case 81:
               var10000 = 124;
               break;
            case 82:
               var10000 = 85;
               break;
            case 83:
               var10000 = 43;
               break;
            case 84:
               var10000 = 97;
               break;
            case 85:
               var10000 = 252;
               break;
            case 86:
               var10000 = 189;
               break;
            case 87:
               var10000 = 245;
               break;
            case 88:
               var10000 = 25;
               break;
            case 89:
               var10000 = 216;
               break;
            case 90:
               var10000 = 67;
               break;
            case 91:
               var10000 = 240;
               break;
            case 92:
               var10000 = 24;
               break;
            case 93:
               var10000 = 48;
               break;
            case 94:
               var10000 = 91;
               break;
            case 95:
               var10000 = 12;
               break;
            case 96:
               var10000 = 6;
               break;
            case 97:
               var10000 = 246;
               break;
            case 98:
               var10000 = 174;
               break;
            case 99:
               var10000 = 242;
               break;
            case 100:
               var10000 = 234;
               break;
            case 101:
               var10000 = 155;
               break;
            case 102:
               var10000 = 51;
               break;
            case 103:
               var10000 = 237;
               break;
            case 104:
               var10000 = 38;
               break;
            case 105:
               var10000 = 100;
               break;
            case 106:
               var10000 = 179;
               break;
            case 107:
               var10000 = 131;
               break;
            case 108:
               var10000 = 26;
               break;
            case 109:
               var10000 = 229;
               break;
            case 110:
               var10000 = 156;
               break;
            case 111:
               var10000 = 122;
               break;
            case 112:
               var10000 = 149;
               break;
            case 113:
               var10000 = 215;
               break;
            case 114:
               var10000 = 118;
               break;
            case 115:
               var10000 = 112;
               break;
            case 116:
               var10000 = 75;
               break;
            case 117:
               var10000 = 254;
               break;
            case 118:
               var10000 = 49;
               break;
            case 119:
               var10000 = 116;
               break;
            case 120:
               var10000 = 68;
               break;
            case 121:
               var10000 = 243;
               break;
            case 122:
               var10000 = 109;
               break;
            case 123:
               var10000 = 185;
               break;
            case 124:
               var10000 = 133;
               break;
            case 125:
               var10000 = 107;
               break;
            case 126:
               var10000 = 92;
               break;
            case 127:
               var10000 = 61;
               break;
            case 128:
               var10000 = 108;
               break;
            case 129:
               var10000 = 113;
               break;
            case 130:
               var10000 = 79;
               break;
            case 131:
               var10000 = 157;
               break;
            case 132:
               var10000 = 248;
               break;
            case 133:
               var10000 = 136;
               break;
            case 134:
               var10000 = 126;
               break;
            case 135:
               var10000 = 2;
               break;
            case 136:
               var10000 = 3;
               break;
            case 137:
               var10000 = 27;
               break;
            case 138:
               var10000 = 42;
               break;
            case 139:
               var10000 = 247;
               break;
            case 140:
               var10000 = 37;
               break;
            case 141:
               var10000 = 18;
               break;
            case 142:
               var10000 = 55;
               break;
            case 143:
               var10000 = 153;
               break;
            case 144:
               var10000 = 217;
               break;
            case 145:
               var10000 = 14;
               break;
            case 146:
               var10000 = 207;
               break;
            case 147:
               var10000 = 78;
               break;
            case 148:
               var10000 = 201;
               break;
            case 149:
               var10000 = 106;
               break;
            case 150:
               var10000 = 210;
               break;
            case 151:
               var10000 = 52;
               break;
            case 152:
               var10000 = 226;
               break;
            case 153:
               var10000 = 162;
               break;
            case 154:
               var10000 = 143;
               break;
            case 155:
               var10000 = 82;
               break;
            case 156:
               var10000 = 170;
               break;
            case 157:
               var10000 = 194;
               break;
            case 158:
               var10000 = 204;
               break;
            case 159:
               var10000 = 135;
               break;
            case 160:
               var10000 = 4;
               break;
            case 161:
               var10000 = 47;
               break;
            case 162:
               var10000 = 236;
               break;
            case 163:
               var10000 = 33;
               break;
            case 164:
               var10000 = 121;
               break;
            case 165:
               var10000 = 90;
               break;
            case 166:
               var10000 = 72;
               break;
            case 167:
               var10000 = 166;
               break;
            case 168:
               var10000 = 120;
               break;
            case 169:
               var10000 = 186;
               break;
            case 170:
               var10000 = 167;
               break;
            case 171:
               var10000 = 16;
               break;
            case 172:
               var10000 = 224;
               break;
            case 173:
               var10000 = 65;
               break;
            case 174:
               var10000 = 22;
               break;
            case 175:
               var10000 = 86;
               break;
            case 176:
               var10000 = 41;
               break;
            case 177:
               var10000 = 235;
               break;
            case 178:
               var10000 = 56;
               break;
            case 179:
               var10000 = 134;
               break;
            case 180:
               var10000 = 206;
               break;
            case 181:
               var10000 = 169;
               break;
            case 182:
               var10000 = 214;
               break;
            case 183:
               var10000 = 164;
               break;
            case 184:
               var10000 = 57;
               break;
            case 185:
               var10000 = 13;
               break;
            case 186:
               var10000 = 165;
               break;
            case 187:
               var10000 = 125;
               break;
            case 188:
               var10000 = 142;
               break;
            case 189:
               var10000 = 150;
               break;
            case 190:
               var10000 = 147;
               break;
            case 191:
               var10000 = 105;
               break;
            case 192:
               var10000 = 50;
               break;
            case 193:
               var10000 = 115;
               break;
            case 194:
               var10000 = 180;
               break;
            case 195:
               var10000 = 77;
               break;
            case 196:
               var10000 = 96;
               break;
            case 197:
               var10000 = 209;
               break;
            case 198:
               var10000 = 227;
               break;
            case 199:
               var10000 = 76;
               break;
            case 200:
               var10000 = 128;
               break;
            case 201:
               var10000 = 132;
               break;
            case 202:
               var10000 = 83;
               break;
            case 203:
               var10000 = 251;
               break;
            case 204:
               var10000 = 58;
               break;
            case 205:
               var10000 = 31;
               break;
            case 206:
               var10000 = 196;
               break;
            case 207:
               var10000 = 200;
               break;
            case 208:
               var10000 = 232;
               break;
            case 209:
               var10000 = 198;
               break;
            case 210:
               var10000 = 9;
               break;
            case 211:
               var10000 = 197;
               break;
            case 212:
               var10000 = 19;
               break;
            case 213:
               var10000 = 152;
               break;
            case 214:
               var10000 = 190;
               break;
            case 215:
               var10000 = 151;
               break;
            case 216:
               var10000 = 161;
               break;
            case 217:
               var10000 = 88;
               break;
            case 218:
               var10000 = 244;
               break;
            case 219:
               var10000 = 191;
               break;
            case 220:
               var10000 = 102;
               break;
            case 221:
               var10000 = 168;
               break;
            case 222:
               var10000 = 253;
               break;
            case 223:
               var10000 = 230;
               break;
            case 224:
               var10000 = 93;
               break;
            case 225:
               var10000 = 213;
               break;
            case 226:
               var10000 = 172;
               break;
            case 227:
               var10000 = 45;
               break;
            case 228:
               var10000 = 110;
               break;
            case 229:
               var10000 = 35;
               break;
            case 230:
               var10000 = 84;
               break;
            case 231:
               var10000 = 154;
               break;
            case 232:
               var10000 = 127;
               break;
            case 233:
               var10000 = 98;
               break;
            case 234:
               var10000 = 184;
               break;
            case 235:
               var10000 = 70;
               break;
            case 236:
               var10000 = 28;
               break;
            case 237:
               var10000 = 40;
               break;
            case 238:
               var10000 = 29;
               break;
            case 239:
               var10000 = 139;
               break;
            case 240:
               var10000 = 173;
               break;
            case 241:
               var10000 = 193;
               break;
            case 242:
               var10000 = 195;
               break;
            case 243:
               var10000 = 104;
               break;
            case 244:
               var10000 = 63;
               break;
            case 245:
               var10000 = 208;
               break;
            case 246:
               var10000 = 148;
               break;
            case 247:
               var10000 = 30;
               break;
            case 248:
               var10000 = 222;
               break;
            case 249:
               var10000 = 60;
               break;
            case 250:
               var10000 = 225;
               break;
            case 251:
               var10000 = 233;
               break;
            case 252:
               var10000 = 117;
               break;
            case 253:
               var10000 = 176;
               break;
            case 254:
               var10000 = 130;
               break;
            default:
               var10000 = 177;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17026;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[39];
      int var11 = 0;
      String var10 = "áì&Ä¸3\u009a\u0007\u001c\u0088\u0099HI¢`\u0003>@Ø\u0007B®R\u008c6:K\u0002yù\u0003ò\u0081Á\u00035ó÷\u0007\u0090*\u000e\u001c}(â\u0002\u0017\u0098\u0004õôæÚ\u0004±\u0001ng\u0002q\u0005\u001aY²Í/©LXõZÀzÔ\u0080ÀÅÇTÃº±\u0006\u0000u\u0017\u0083Z\u0003F'S\u0003ð\b\u0005\u0003ñÆ¡\u0007þwÍ·Ê]\u001a\u0002}\u0086\u0003U.ñ\u0003yö<\u0003\u008c\u007fÈ\u0004\u0097°ªS\u0003ò<ê\u0003\u009c\u000f\u0088\u0003ºvã\u0003;\">\u001b¯}\u0013Örs#\u00125<\u0097K=3r¹¢\fdHÉ2\u0017ý~\u000e;\u0003À®E\u001a\u0013\u001d\u0084Ú\u0080ò}\"þ:î\u008b\u0012+\u0097º\u001elóD/·QÅ0\u0084\u0007\u0097Gï±f\u009dF\u0003\u0007·ù\u0004À\u0091\u0002w\u0004sÚt\u001f\u0019ø\"ù=/\u000e\u0088½@É9õèäÈCõS\u008e£\u0091O¨X \u0003\u0091é¯\u00024¶\u0004ÞóÁ9";
      int var12 = "áì&Ä¸3\u009a\u0007\u001c\u0088\u0099HI¢`\u0003>@Ø\u0007B®R\u008c6:K\u0002yù\u0003ò\u0081Á\u00035ó÷\u0007\u0090*\u000e\u001c}(â\u0002\u0017\u0098\u0004õôæÚ\u0004±\u0001ng\u0002q\u0005\u001aY²Í/©LXõZÀzÔ\u0080ÀÅÇTÃº±\u0006\u0000u\u0017\u0083Z\u0003F'S\u0003ð\b\u0005\u0003ñÆ¡\u0007þwÍ·Ê]\u001a\u0002}\u0086\u0003U.ñ\u0003yö<\u0003\u008c\u007fÈ\u0004\u0097°ªS\u0003ò<ê\u0003\u009c\u000f\u0088\u0003ºvã\u0003;\">\u001b¯}\u0013Örs#\u00125<\u0097K=3r¹¢\fdHÉ2\u0017ý~\u000e;\u0003À®E\u001a\u0013\u001d\u0084Ú\u0080ò}\"þ:î\u008b\u0012+\u0097º\u001elóD/·QÅ0\u0084\u0007\u0097Gï±f\u009dF\u0003\u0007·ù\u0004À\u0091\u0002w\u0004sÚt\u001f\u0019ø\"ù=/\u000e\u0088½@É9õèäÈCõS\u008e£\u0091O¨X \u0003\u0091é¯\u00024¶\u0004ÞóÁ9"
         .length();
      L(0);
      char var9 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 106;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 83;
                        break;
                     case 1:
                        var65 = 30;
                        break;
                     case 2:
                        var65 = 80;
                        break;
                     case 3:
                        var65 = 56;
                        break;
                     case 4:
                        var65 = 114;
                        break;
                     case 5:
                        var65 = 14;
                        break;
                     default:
                        var65 = 103;
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
                     c = new String[39];
                     long var0 = 2422906105422922351L;
                     long[] var6 = new long[18];
                     int var3 = 0;
                     String var4 = "»\u0083×d\u000eèP\u0000úRìÚ'7FB\u009d\u009eÞkóOó[ê{\u009eB¾\u0016Ú&Mª\u0002*D\u0094\u0080¡¤\u008d,8hEiW¾\u008dä3=è|\u008af7ë\u0005æ\u0017ù óõÏf\u008aæF9\u007f+-\u0094³Úgê,\u008e²á\u0095\u0088¶-\u001fo.g\u0098Üå\u008a 8³GKe#èÇc\u0002Y\u0019\u0001L\u001c*É/\u0013¯Õri*^,\u0085Ö\u0011\u0081\u008e";
                     int var5 = "»\u0083×d\u000eèP\u0000úRìÚ'7FB\u009d\u009eÞkóOó[ê{\u009eB¾\u0016Ú&Mª\u0002*D\u0094\u0080¡¤\u008d,8hEiW¾\u008dä3=è|\u008af7ë\u0005æ\u0017ù óõÏf\u008aæF9\u007f+-\u0094³Úgê,\u008e²á\u0095\u0088¶-\u001fo.g\u0098Üå\u008a 8³GKe#èÇc\u0002Y\u0019\u0001L\u001c*É/\u0013¯Õri*^,\u0085Ö\u0011\u0081\u008e"
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
                                    d = var6;
                                    f = new Integer[18];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\bæN~¡Ç\u0000ôE\u0085\rº\u0082ûº\u00ad";
                                 var5 = "\bæN~¡Ç\u0000ôE\u0085\rº\u0082ûº\u00ad".length();
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

                  var10 = "VZ_\u0099\u009e\u0013\u0017\u0002\u000b\u0012";
                  var12 = "VZ_\u0099\u009e\u0013\u0017\u0002\u000b\u0012".length();
                  var9 = 7;
                  var17 = -1;
            }

            var10000 = 13;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





