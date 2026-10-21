package com.finalshell.ui.panel;

import com.finalshell.core.AD_2;
import com.finalshell.core.Ar2;
import com.finalshell.core.CS3_2;
import com.finalshell.core.DV3;
import com.finalshell.core.FM;
import com.finalshell.core.Fv2_2;
import com.finalshell.core.PN3;
import com.finalshell.core.S0;
import com.finalshell.core.UR_2;
import com.finalshell.core.W82;
import com.finalshell.core.WH3;
import com.finalshell.core.Xn4;
import com.finalshell.core.ZK;
import com.finalshell.ui.model.WF3;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.DefaultFocusTraversalPolicy;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.function.Function;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jetbrains.annotations.NotNull;

public abstract class Cn2 extends JPanel implements FM, CS3_2 {
   public final Object p = new Object();
   public Xn4 V = null;
   public ConnectionProperty M = null;
   public WH3 Z;
   public final PN3 F;
   public final List D = new ArrayList();
   public CS3_2 g;
   public final Function o;
   public final JPanel U;
   public static String[] b;
   public static String[] c;
   public static String[] d;
   public static long[] a;
   public static Integer[] e;

   public Cn2(@NotNull PN3 var1, @NotNull Function var2) {
      super(new BorderLayout());
      Q$arrString();
      this.F = var1;
      this.o = var2;
      this.setFocusTraversalPolicy(new DefaultFocusTraversalPolicy());
      this.U = new JPanel(new BorderLayout());
      this.U.add(this, a(15628, -8935));
      if (Ky4.F$arrString() != null) {
         X(new String[1]);
      }
   }

   @Override
   public ConnectionProperty f(Fv2_2 var1) {
      ConnectionProperty var2 = this.R();
      this.z(var1, var2);
      return var2;
   }

   public void z(Fv2_2 var1, ConnectionProperty var2) {
      Cn2 var5;
      String[] var10000 = Q$arrString();
      var2.f(var1);
      String[] var3 = var10000;
      var5 = this;
      if (var3 != null) {
         if (this.Z != null) {
            int var4 = this.Z.S$int(var2);
            if (var3 == null) {
               return;
            }

            if (var4 != -1) {
               this.Z.R(var4, this.t(var2, this.Z));
            }
         }

         var5 = this;
      }

      var5.w(var1, var2);
   }

   public ConnectionProperty R() {
      String[] var10000 = Q$arrString();
      ConnectionProperty var2 = this.x();
      String[] var1 = var10000;
      var2.Y(this);
      Cn2 var4 = this;
      if (var1 != null) {
         if (this.V != null) {
            var2.W(this.V);
         }

         var4 = this;
      }

      label52: {
         label53: {
            if (var1 != null) {
               if (var4.M == null) {
                  var5 = this.Z;
                  if (var1 == null) {
                     break label53;
                  }

                  if (this.Z == null) {
                     this.M = var2;
                     Dimension var3 = var2.M$JComponent().getSize();
                     this.add(this.M.M$JComponent(), a(15630, 16688));
                     this.setSize(var3);
                     Cn2 var6 = this;
                     if (var1 != null) {
                        if (this.V != null) {
                           this.V.c(WF3.User);
                        }

                        var6 = this;
                     }

                     var6.J();
                     if (var1 != null) {
                        return var2;
                     }
                  }
               }

               var4 = this;
            }

            if (var1 == null) {
               break label52;
            }

            var5 = var4.Z;
         }

         if (var5 == null) {
            this.Z = this.u();
         }

         var4 = this;
      }

      var4.m(var2, this.Z);
      return var2;
   }

   public abstract ConnectionProperty x();

   public void w(Fv2_2 var1, ConnectionProperty var2) {
      new S0(var1, Executors.newSingleThreadExecutor()).J(this::lambda$setupTtyConnectorWaitFor$0);
   }

   public void m(ConnectionProperty var1, WH3 var2) {
      String var3 = this.t(var1, var2);
      this.s(var1, var2, var3);
   }

   @NotNull
   public String J(@NotNull ConnectionProperty var1) {
      String[] var10000 = Q$arrString();
      Fv2_2 var3 = var1.s$Fv_2();
      String[] var2 = var10000;
      Fv2_2 var4 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return a(15631, 9645);
         }

         var4 = var3;
      }

      return var4.b();
   }

   public String t(ConnectionProperty var1, WH3 var2) {
      return this.f(this.F.m(var1.s$Fv_2(), this.J(var1)), var2);
   }

   public void s(ConnectionProperty var1, WH3 var2, String var3) {
      var2.G(var3, var1);
      var2.v(var2.n() - 1, this.Z(var2, var1));
      var2.i(var1);
   }

   public String f(String var1, WH3 var2) {
      int var5;
      String var10000 = Q$arrString();
      HashSet var4 = new HashSet();
      String[] var3 = var10000;
      var5 = 0;

      while (var5 < var2.n()) {
         var4.add(var2.r(var5));
         var5++;
         if (var3 == null) {
            break;
         }
      }

      String var7 = var1;
      int var6 = 0;

      while (true) {
         if (var4.contains(var7)) {
            var10000 = var1 + a(15629, 14597) + ++var6 + ")";
            if (var3 == null) {
               break;
            }

            var7 = var10000;
            if (var3 != null) {
               continue;
            }
         }

         var10000 = var7;
         break;
      }

      return var10000;
   }

   public WH3 u() {
      WH3 var1 = this.m();
      var1.C(new ZK(this));
      this.remove(this.M);
      this.m(this.M, var1);
      this.M = null;
      this.add(var1.z$JComponent(), a(15630, 16688));
      return var1;
   }

   public void J() {
      String[] var10000 = Q$arrString();
      ConnectionProperty var2 = this.T();
      Iterator var3 = this.D.iterator();
      String[] var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            Ar2 var4 = (Ar2)var3.next();
            var4.T(var2);
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         var2.O$pA_3().requestFocusInWindow();
         break;
      }
   }

   public abstract WH3 m();

   public Component Z(WH3 var1, ConnectionProperty var2) {
      return new XW3(this, var1, var2, null);
   }

   public void R(ConnectionProperty var1) {
      String[] var2 = Q$arrString();
      if (var1 != null) {
         Cn2 var10000;
         var10000 = this;
         label29:
         if (var2 != null) {
            if (this.Z != null) {
               var10000 = this;
               if (var2 == null) {
                  break label29;
               }

               if (this.Z.S$int(var1) != -1) {
                  SwingUtilities.invokeLater(this::lambda$closeTab$1);
                  this.l(var1);
                  if (var2 != null) {
                     return;
                  }
               }
            }

            var10000 = this;
         }

         if (var2 != null) {
            if (var10000.M != var1) {
               return;
            }

            this.M = null;
            var10000 = this;
         }

         var10000.l(var1);
      }
   }

   public void e() {
      ConnectionProperty var1 = this.T();
      var1.q$void();
      this.R(var1);
   }

   public void Q$void() {
      String[] var10000 = Q$arrString();
      Iterator var2 = this.j().iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         label19: {
            W82 var3 = (W82)var2.next();
            W82 var4 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  break label19;
               }

               var4 = var3;
            }

            var4.q();
         }

         if (var1 == null) {
            break;
         }
      }
   }

   public List j() {
      String[] var10000 = Q$arrString();
      ArrayList var2 = new ArrayList();
      String[] var1 = var10000;
      Cn2 var4 = this;
      if (var1 != null) {
         if (this.Z != null) {
            int var3 = 0;

            while (var3 < this.Z.n()) {
               var2.add(this.M(var3));
               var3++;
               if (var1 == null) {
                  return var2;
               }

               if (var1 == null) {
                  break;
               }
            }

            if (var1 != null) {
               return var2;
            }
         }

         var4 = this;
      }

      if (var4.M != null) {
         var2.add(this.M);
      }

      return var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void o(ConnectionProperty var1) {
      String[] var10000 = Q$arrString();
      Object var3 = this.p;
      synchronized (this.p){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         var10000 = (String[])(this.Z);
         if (var2 != null) {
            if (this.Z != null) {
               this.Z.S$void(var1);
            }

            this.J();
            var10000 = (String[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public void p() {
      this.M = this.M(0);
      this.Z.o();
      this.remove(this.Z.z$JComponent());
      this.Z = null;
      this.add(this.M.M$JComponent(), a(15630, 16688));
   }

   @Override
   public List n() {
      return List.of(
         new AD_2(this.F.c(), this::lambda$getActions$2).u(a(20991, 4676639260673416930L)),
         new AD_2(this.F.t(), this::lambda$getActions$3).u(a(11485, 1367516689157383105L)),
         new AD_2(this.F.b(), this::lambda$getActions$4).c(this::lambda$getActions$5),
         new AD_2(this.F.W(), this::lambda$getActions$6).c(this::lambda$getActions$7)
      );
   }

   public void H() {
      this.Z.k(this.Z.z$int() - 1);
   }

   public void O() {
      this.Z.k(this.Z.z$int() + 1);
   }

   @Override
   public CS3_2 c() {
      return this.g;
   }

   @Override
   public void Y(CS3_2 var1) {
      this.g = var1;
   }

   public void G() {
      this.o.apply(this);
   }

   public WH3 I() {
      return this.Z;
   }

   @Override
   public JComponent M() {
      return this.U;
   }

   public JComponent d() {
      String[] var1 = Q$arrString();
      Cn2 var10000 = this;
      if (var1 != null) {
         if (this.Z != null) {
            return this.Z.z$JComponent();
         }

         var10000 = this;
      }

      Object var2 = var10000.M;
      if (var1 != null) {
         var2 = var10000.M != null ? this.M : this;
      }

      return (JComponent)var2;
   }

   @Override
   public JComponent h() {
      return this.d();
   }

   @Override
   public boolean v() {
      return true;
   }

   @Override
   public void W(Xn4 var1) {
      Cn2 var10000;
      label40: {
         label43: {
            String[] var2 = Q$arrString();
            var10000 = this;
            if (var2 != null) {
               if (this.Z != null) {
                  int var3 = 0;

                  while (var3 < this.Z.n()) {
                     this.M(var3).W(var1);
                     var3++;
                     if (var2 == null) {
                        return;
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  if (var2 != null) {
                     break label43;
                  }
               }

               var10000 = this;
            }

            if (var2 == null) {
               break label40;
            }

            if (var10000.M != null) {
               this.M.W(var1);
            }
         }

         var10000 = this;
      }

      var10000.V = var1;
   }

   @NotNull
   public ConnectionProperty T() {
      String[] var1 = Q$arrString();
      Object var10000 = this.Z;
      if (var1 != null) {
         if (this.Z != null) {
            return this.M(this.Z.z$int());
         }

         var10000 = Objects.requireNonNull(this.M);
      }

      return (ConnectionProperty)var10000;
   }

   @Override
   public DV3 g() {
      return this.T().g$dV_3();
   }

   @NotNull
   public ConnectionProperty M(int var1) {
      Objects.checkIndex(var1, this.Z.n());
      return (ConnectionProperty)this.Z.u(var1);
   }

   public void x(Ar2 var1) {
      this.D.add(var1);
   }

   public void l(ConnectionProperty var1) {
      String[] var10000 = Q$arrString();
      Iterator var3 = this.D.iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         Ar2 var4 = (Ar2)var3.next();
         var4.E(var1);
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void r(UR_2 var1) {
   }

   @Override
   public void T(UR_2 var1) {
   }

   public PN3 f() {
      return this.F;
   }

   public Boolean lambda$getActions$7() {
      String[] var1 = Q$arrString();
      WH3 var10000 = this.Z;
      if (var1 != null) {
         if (this.Z == null) {
            return false;
         }

         var10000 = this.Z;
      }

      int var2 = var10000.z$int();
      if (var1 == null) {
         return Boolean.valueOf(var2);
      } else {
         return var2 > 0 ? true : false;
      }
   }

   public boolean lambda$getActions$6(KeyEvent var1) {
      this.H();
      return true;
   }

   public Boolean lambda$getActions$5() {
      String[] var1 = Q$arrString();
      WH3 var10000 = this.Z;
      if (var1 != null) {
         if (this.Z == null) {
            return false;
         }

         var10000 = this.Z;
      }

      int var2 = var10000.z$int();
      if (var1 == null) {
         return Boolean.valueOf(var2);
      } else {
         return var2 < this.Z.n() - 1 ? true : false;
      }
   }

   public boolean lambda$getActions$4(KeyEvent var1) {
      this.O();
      return true;
   }

   public boolean lambda$getActions$3(KeyEvent var1) {
      this.e();
      return true;
   }

   public boolean lambda$getActions$2(KeyEvent var1) {
      this.G();
      return true;
   }

   public void lambda$closeTab$1(ConnectionProperty var1) {
      this.o(var1);
   }

   public boolean lambda$setupTtyConnectorWaitFor$0(Fv2_2 var1, ConnectionProperty var2, Integer var3) {
      String[] var4 = Q$arrString();
      boolean var10000 = this.F.H(var1);
      if (var4 != null) {
         if (var10000) {
            this.R(var2);
         }

         var10000 = true;
      }

      return var10000;
   }

   public static WH3 l(Cn2 var0) {
      return var0.Z;
   }

   public static void T(Cn2 var0) {
      var0.p();
   }

   public static void b(Cn2 var0) {
      var0.J();
   }

   public static void X(String[] var0) {
      b = var0;
   }

   public static String[] Q$arrString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 15631) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 107;
               break;
            case 1:
               var10000 = 119;
               break;
            case 2:
               var10000 = 15;
               break;
            case 3:
               var10000 = 214;
               break;
            case 4:
               var10000 = 162;
               break;
            case 5:
               var10000 = 159;
               break;
            case 6:
               var10000 = 77;
               break;
            case 7:
               var10000 = 139;
               break;
            case 8:
               var10000 = 57;
               break;
            case 9:
               var10000 = 12;
               break;
            case 10:
               var10000 = 46;
               break;
            case 11:
               var10000 = 93;
               break;
            case 12:
               var10000 = 103;
               break;
            case 13:
               var10000 = 41;
               break;
            case 14:
               var10000 = 244;
               break;
            case 15:
               var10000 = 251;
               break;
            case 16:
               var10000 = 201;
               break;
            case 17:
               var10000 = 68;
               break;
            case 18:
               var10000 = 229;
               break;
            case 19:
               var10000 = 58;
               break;
            case 20:
               var10000 = 130;
               break;
            case 21:
               var10000 = 219;
               break;
            case 22:
               var10000 = 230;
               break;
            case 23:
               var10000 = 89;
               break;
            case 24:
               var10000 = 237;
               break;
            case 25:
               var10000 = 221;
               break;
            case 26:
               var10000 = 50;
               break;
            case 27:
               var10000 = 182;
               break;
            case 28:
               var10000 = 170;
               break;
            case 29:
               var10000 = 131;
               break;
            case 30:
               var10000 = 70;
               break;
            case 31:
               var10000 = 240;
               break;
            case 32:
               var10000 = 74;
               break;
            case 33:
               var10000 = 59;
               break;
            case 34:
               var10000 = 84;
               break;
            case 35:
               var10000 = 49;
               break;
            case 36:
               var10000 = 199;
               break;
            case 37:
               var10000 = 133;
               break;
            case 38:
               var10000 = 113;
               break;
            case 39:
               var10000 = 72;
               break;
            case 40:
               var10000 = 167;
               break;
            case 41:
               var10000 = 192;
               break;
            case 42:
               var10000 = 48;
               break;
            case 43:
               var10000 = 254;
               break;
            case 44:
               var10000 = 158;
               break;
            case 45:
               var10000 = 90;
               break;
            case 46:
               var10000 = 71;
               break;
            case 47:
               var10000 = 112;
               break;
            case 48:
               var10000 = 245;
               break;
            case 49:
               var10000 = 173;
               break;
            case 50:
               var10000 = 255;
               break;
            case 51:
               var10000 = 52;
               break;
            case 52:
               var10000 = 11;
               break;
            case 53:
               var10000 = 61;
               break;
            case 54:
               var10000 = 53;
               break;
            case 55:
               var10000 = 24;
               break;
            case 56:
               var10000 = 76;
               break;
            case 57:
               var10000 = 75;
               break;
            case 58:
               var10000 = 235;
               break;
            case 59:
               var10000 = 34;
               break;
            case 60:
               var10000 = 14;
               break;
            case 61:
               var10000 = 136;
               break;
            case 62:
               var10000 = 78;
               break;
            case 63:
               var10000 = 232;
               break;
            case 64:
               var10000 = 205;
               break;
            case 65:
               var10000 = 203;
               break;
            case 66:
               var10000 = 206;
               break;
            case 67:
               var10000 = 108;
               break;
            case 68:
               var10000 = 101;
               break;
            case 69:
               var10000 = 238;
               break;
            case 70:
               var10000 = 31;
               break;
            case 71:
               var10000 = 207;
               break;
            case 72:
               var10000 = 2;
               break;
            case 73:
               var10000 = 23;
               break;
            case 74:
               var10000 = 224;
               break;
            case 75:
               var10000 = 248;
               break;
            case 76:
               var10000 = 9;
               break;
            case 77:
               var10000 = 37;
               break;
            case 78:
               var10000 = 218;
               break;
            case 79:
               var10000 = 99;
               break;
            case 80:
               var10000 = 227;
               break;
            case 81:
               var10000 = 228;
               break;
            case 82:
               var10000 = 0;
               break;
            case 83:
               var10000 = 147;
               break;
            case 84:
               var10000 = 129;
               break;
            case 85:
               var10000 = 250;
               break;
            case 86:
               var10000 = 118;
               break;
            case 87:
               var10000 = 226;
               break;
            case 88:
               var10000 = 21;
               break;
            case 89:
               var10000 = 171;
               break;
            case 90:
               var10000 = 123;
               break;
            case 91:
               var10000 = 180;
               break;
            case 92:
               var10000 = 105;
               break;
            case 93:
               var10000 = 106;
               break;
            case 94:
               var10000 = 63;
               break;
            case 95:
               var10000 = 20;
               break;
            case 96:
               var10000 = 97;
               break;
            case 97:
               var10000 = 153;
               break;
            case 98:
               var10000 = 32;
               break;
            case 99:
               var10000 = 239;
               break;
            case 100:
               var10000 = 80;
               break;
            case 101:
               var10000 = 157;
               break;
            case 102:
               var10000 = 98;
               break;
            case 103:
               var10000 = 69;
               break;
            case 104:
               var10000 = 243;
               break;
            case 105:
               var10000 = 54;
               break;
            case 106:
               var10000 = 73;
               break;
            case 107:
               var10000 = 142;
               break;
            case 108:
               var10000 = 187;
               break;
            case 109:
               var10000 = 126;
               break;
            case 110:
               var10000 = 141;
               break;
            case 111:
               var10000 = 200;
               break;
            case 112:
               var10000 = 194;
               break;
            case 113:
               var10000 = 110;
               break;
            case 114:
               var10000 = 145;
               break;
            case 115:
               var10000 = 168;
               break;
            case 116:
               var10000 = 91;
               break;
            case 117:
               var10000 = 86;
               break;
            case 118:
               var10000 = 169;
               break;
            case 119:
               var10000 = 197;
               break;
            case 120:
               var10000 = 225;
               break;
            case 121:
               var10000 = 17;
               break;
            case 122:
               var10000 = 166;
               break;
            case 123:
               var10000 = 121;
               break;
            case 124:
               var10000 = 87;
               break;
            case 125:
               var10000 = 249;
               break;
            case 126:
               var10000 = 38;
               break;
            case 127:
               var10000 = 51;
               break;
            case 128:
               var10000 = 6;
               break;
            case 129:
               var10000 = 149;
               break;
            case 130:
               var10000 = 252;
               break;
            case 131:
               var10000 = 42;
               break;
            case 132:
               var10000 = 127;
               break;
            case 133:
               var10000 = 83;
               break;
            case 134:
               var10000 = 222;
               break;
            case 135:
               var10000 = 148;
               break;
            case 136:
               var10000 = 163;
               break;
            case 137:
               var10000 = 102;
               break;
            case 138:
               var10000 = 174;
               break;
            case 139:
               var10000 = 209;
               break;
            case 140:
               var10000 = 247;
               break;
            case 141:
               var10000 = 164;
               break;
            case 142:
               var10000 = 111;
               break;
            case 143:
               var10000 = 40;
               break;
            case 144:
               var10000 = 45;
               break;
            case 145:
               var10000 = 161;
               break;
            case 146:
               var10000 = 181;
               break;
            case 147:
               var10000 = 44;
               break;
            case 148:
               var10000 = 64;
               break;
            case 149:
               var10000 = 47;
               break;
            case 150:
               var10000 = 135;
               break;
            case 151:
               var10000 = 66;
               break;
            case 152:
               var10000 = 241;
               break;
            case 153:
               var10000 = 16;
               break;
            case 154:
               var10000 = 28;
               break;
            case 155:
               var10000 = 210;
               break;
            case 156:
               var10000 = 154;
               break;
            case 157:
               var10000 = 82;
               break;
            case 158:
               var10000 = 67;
               break;
            case 159:
               var10000 = 155;
               break;
            case 160:
               var10000 = 152;
               break;
            case 161:
               var10000 = 39;
               break;
            case 162:
               var10000 = 85;
               break;
            case 163:
               var10000 = 30;
               break;
            case 164:
               var10000 = 233;
               break;
            case 165:
               var10000 = 177;
               break;
            case 166:
               var10000 = 22;
               break;
            case 167:
               var10000 = 88;
               break;
            case 168:
               var10000 = 124;
               break;
            case 169:
               var10000 = 175;
               break;
            case 170:
               var10000 = 117;
               break;
            case 171:
               var10000 = 196;
               break;
            case 172:
               var10000 = 176;
               break;
            case 173:
               var10000 = 43;
               break;
            case 174:
               var10000 = 165;
               break;
            case 175:
               var10000 = 60;
               break;
            case 176:
               var10000 = 220;
               break;
            case 177:
               var10000 = 223;
               break;
            case 178:
               var10000 = 185;
               break;
            case 179:
               var10000 = 120;
               break;
            case 180:
               var10000 = 29;
               break;
            case 181:
               var10000 = 81;
               break;
            case 182:
               var10000 = 4;
               break;
            case 183:
               var10000 = 146;
               break;
            case 184:
               var10000 = 193;
               break;
            case 185:
               var10000 = 183;
               break;
            case 186:
               var10000 = 18;
               break;
            case 187:
               var10000 = 213;
               break;
            case 188:
               var10000 = 115;
               break;
            case 189:
               var10000 = 137;
               break;
            case 190:
               var10000 = 188;
               break;
            case 191:
               var10000 = 7;
               break;
            case 192:
               var10000 = 116;
               break;
            case 193:
               var10000 = 8;
               break;
            case 194:
               var10000 = 140;
               break;
            case 195:
               var10000 = 36;
               break;
            case 196:
               var10000 = 186;
               break;
            case 197:
               var10000 = 94;
               break;
            case 198:
               var10000 = 19;
               break;
            case 199:
               var10000 = 27;
               break;
            case 200:
               var10000 = 216;
               break;
            case 201:
               var10000 = 10;
               break;
            case 202:
               var10000 = 217;
               break;
            case 203:
               var10000 = 189;
               break;
            case 204:
               var10000 = 236;
               break;
            case 205:
               var10000 = 198;
               break;
            case 206:
               var10000 = 62;
               break;
            case 207:
               var10000 = 178;
               break;
            case 208:
               var10000 = 1;
               break;
            case 209:
               var10000 = 35;
               break;
            case 210:
               var10000 = 65;
               break;
            case 211:
               var10000 = 92;
               break;
            case 212:
               var10000 = 208;
               break;
            case 213:
               var10000 = 95;
               break;
            case 214:
               var10000 = 100;
               break;
            case 215:
               var10000 = 134;
               break;
            case 216:
               var10000 = 242;
               break;
            case 217:
               var10000 = 96;
               break;
            case 218:
               var10000 = 195;
               break;
            case 219:
               var10000 = 204;
               break;
            case 220:
               var10000 = 211;
               break;
            case 221:
               var10000 = 138;
               break;
            case 222:
               var10000 = 160;
               break;
            case 223:
               var10000 = 151;
               break;
            case 224:
               var10000 = 25;
               break;
            case 225:
               var10000 = 253;
               break;
            case 226:
               var10000 = 234;
               break;
            case 227:
               var10000 = 56;
               break;
            case 228:
               var10000 = 3;
               break;
            case 229:
               var10000 = 231;
               break;
            case 230:
               var10000 = 184;
               break;
            case 231:
               var10000 = 172;
               break;
            case 232:
               var10000 = 144;
               break;
            case 233:
               var10000 = 26;
               break;
            case 234:
               var10000 = 55;
               break;
            case 235:
               var10000 = 191;
               break;
            case 236:
               var10000 = 104;
               break;
            case 237:
               var10000 = 122;
               break;
            case 238:
               var10000 = 128;
               break;
            case 239:
               var10000 = 109;
               break;
            case 240:
               var10000 = 156;
               break;
            case 241:
               var10000 = 190;
               break;
            case 242:
               var10000 = 132;
               break;
            case 243:
               var10000 = 79;
               break;
            case 244:
               var10000 = 150;
               break;
            case 245:
               var10000 = 33;
               break;
            case 246:
               var10000 = 202;
               break;
            case 247:
               var10000 = 114;
               break;
            case 248:
               var10000 = 143;
               break;
            case 249:
               var10000 = 13;
               break;
            case 250:
               var10000 = 125;
               break;
            case 251:
               var10000 = 212;
               break;
            case 252:
               var10000 = 179;
               break;
            case 253:
               var10000 = 5;
               break;
            case 254:
               var10000 = 215;
               break;
            default:
               var10000 = 246;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20252;
      if (e[var3] == null) {
         e[var3] = (int)(a[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var31;
      String[] var13 = new String[4];
      int var11 = 0;
      String[] var10000 = new String[4];
      String var10 = "JÄ\u0003\u0005úf8\u0006öÁ\u009b¢[h";
      int var12 = "JÄ\u0003\u0005úf8\u0006öÁ\u009b¢[h".length();
      X(var10000);
      char var9 = 7;
      int var16 = -1;

      label61:
      while (true) {
         byte var17 = 6;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var35 = var10001.toCharArray();
               int var10004 = var35.length;
               int var14 = 0;
               byte var38 = var17;
               var31 = var35;
               int var23 = var10004;
               byte var44;
               char[] var49;
               int var10006;
               if (var10004 <= 1) {
                  var49 = var35;
                  var44 = var17;
                  var10006 = var14;
               } else {
                  var38 = var17;
                  var23 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var49 = var35;
                  var44 = var17;
                  var10006 = var14;
               }

               while (true) {
                  char var58 = var49[var10006];
                  byte var59;
                  switch (var14 % 7) {
                     case 0:
                        var59 = 109;
                        break;
                     case 1:
                        var59 = 77;
                        break;
                     case 2:
                        var59 = 107;
                        break;
                     case 3:
                        var59 = 72;
                        break;
                     case 4:
                        var59 = 69;
                        break;
                     case 5:
                        var59 = 123;
                        break;
                     default:
                        var59 = 35;
                  }

                  var49[var10006] = (char)(var58 ^ var44 ^ var59);
                  var14++;
                  if (var38 == 0) {
                     var10006 = var38;
                     var49 = var31;
                     var44 = var38;
                  } else {
                     if (var23 <= var14) {
                        break;
                     }

                     var49 = var31;
                     var44 = var38;
                     var10006 = var14;
                  }
               }
            }

            String var40 = new String(var31).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var40;
                  if ((var16 += var9) >= var12) {
                     c = var13;
                     d = new String[4];
                     long var0 = 3389687952227779110L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u0087+~bBQ¡´\u008dñSÞ\u0080àÜ\u008a";
                     int var5 = "\u0087+~bBQ¡´\u008dñSÞ\u0080àÜ\u008a".length();
                     byte var2 = 0;

                     do {
                        byte var25 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                        int var26 = var3++;
                        long var48 = (
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
                        byte var41 = -1;
                        var6[var26] = var48;
                     } while (var2 < var5);

                     a = var6;
                     e = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var40;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "v\n\u0006É\u0083¿)\u001cÚ";
                  var12 = "v\n\u0006É\u0083¿)\u001cÚ".length();
                  var9 = 2;
                  var16 = -1;
            }

            var17 = 33;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





