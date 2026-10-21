package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.C42;
import com.finalshell.core.Ck4;
import com.finalshell.core.Cz2;
import com.finalshell.core.DE;
import com.finalshell.core.Ex2;
import com.finalshell.core.FN;
import com.finalshell.core.GO;
import com.finalshell.core.GR;
import com.finalshell.core.Is4;
import com.finalshell.core.KD;
import com.finalshell.core.Kn2_2;
import com.finalshell.core.Ne4;
import com.finalshell.core.ON;
import com.finalshell.core.QO;
import com.finalshell.core.QW;
import com.finalshell.core.Qe2_2;
import com.finalshell.core.TJ;
import com.finalshell.core.V3;
import com.finalshell.core.W62;
import com.finalshell.core.Wx2;
import com.finalshell.ui.listener.Cr4;
import com.finalshell.ui.listener.E7;
import com.finalshell.ui.listener.I6;
import com.finalshell.ui.listener.Ic2;
import com.finalshell.ui.listener.Ir4;
import com.finalshell.ui.listener.Kz2;
import com.finalshell.ui.listener.Ou2;
import com.finalshell.ui.listener.PC3;
import com.finalshell.ui.listener.QA;
import com.finalshell.ui.listener.RJ3;
import com.finalshell.ui.listener.R_;
import com.finalshell.ui.listener.SF;
import com.finalshell.ui.listener.XJ3;
import com.finalshell.ui.listener.Y22;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.filechooser.FileSystemView;

public class Kz4 extends Ky4 {
   protected static ImageIcon Q;
   protected static ImageIcon p;
   protected static ImageIcon M;
   protected static FileSystemView U;
   protected List Y = new ArrayList(1);
   protected Ky4 k;
   protected Ne4 Z;
   protected FocusAdapter s;
   protected KD D = null;
   protected boolean u = true;
   protected JWindow d = null;
   protected int v = 0;
   protected Pb4 S = null;
   protected Qe2_2 W = null;
   protected V3 e = DE.Y;
   protected int r = -1;
   protected boolean y = true;
   protected java.io.File b;
   protected final C42 c;
   protected boolean o = false;
   public static String g;
   public static String[] a;
   public static String[] f;

   public Kz4() {
      this(Cz2.z()[0]);
   }

   public Kz4(String var1) {
      this(new java.io.File(var1));
   }

   public Kz4(java.io.File var1) {
      super(true);
      this.C(-1);
      this.setOpaque(false);
      this.i(true);
      this.u(false);
      this.setBackground(Color.WHITE);
      this.setForeground(QO.V);
      this.setTransferHandler(new Ex2(this));
      this.k = new Ky4();
      this.k.setOpaque(false);
      this.k.setLayout(new TJ(0, true));
      this.add(this.k, b(11997, -12308));
      this.Z = Ne4.k(false);
      this.Z.setForeground(QO.V);
      this.Z.n(2);
      this.Z.addActionListener(new XJ3(this));
      this.Z.addKeyListener(new Ou2(this));
      this.s = new R_(this);
      this.Z.addCaretListener(new Ic2(this));
      this.k.addMouseListener(new PC3(this));
      W62.h(this, this, GR.lR, new Is4(this), true);
      this.addComponentListener(new Y22(this));
      this.c = new Ck4(this);
      ON.b(this, this.c);
      this.N(var1);
   }

   protected void m() {
      String var1 = M();
      Ne4 var10000 = this.Z;
      if (var1 != null) {
         if (this.Z.isFocusOwner()) {
            return;
         }

         var10000 = this.Z;
      }

      label19: {
         var10000.setPreferredSize(new Dimension(1, this.k.getHeight()));
         this.k.removeAll();
         Kz4 var2 = this;
         if (var1 != null) {
            if (this.b != null) {
               this.Z.setText(this.y());
               if (var1 != null) {
                  break label19;
               }
            }

            var2 = this;
         }

         var2.Z.setText("");
      }

      this.Z.selectAll();
      this.k.add(this.Z);
      this.k.revalidate();
      this.k.repaint();
      this.transferFocus();
      this.Z.addFocusListener(this.s);
   }

   protected String y() {
      String var10000 = M();
      String var2 = this.b.getAbsolutePath();
      String var1 = var10000;
      var10000 = var2;
      if (var1 != null) {
         var10000 = var2.endsWith(java.io.File.separator) ? var2 : var2 + java.io.File.separator;
      }

      return var10000;
   }

   public boolean V() {
      return this.Z.isFocusOwner();
   }

   @Override
   public void setForeground(Color var1) {
      String var10000 = M();
      super.setForeground(var1);
      String var2 = var10000;
      Kz4 var3 = this;
      if (var2 != null) {
         if (!this.isShowing()) {
            return;
         }

         FN.v(this.k, var1);
         var3 = this;
      }

      var3.Z.setForeground(var1);
   }

   public boolean A() {
      return this.u;
   }

   public void W(boolean var1) {
      this.u = var1;
   }

   public V3 O$V() {
      return this.e;
   }

   public void F(V3 var1) {
      this.s(var1, true);
   }

   public void s(V3 var1, boolean var2) {
      String var3 = M();
      Kz4 var10000 = this;
      if (var3 != null) {
         this.e = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.P();
   }

   public boolean G$boolean() {
      return this.y;
   }

   public void q(boolean var1) {
      this.y = var1;
   }

   public java.io.File G$File() {
      return this.b;
   }

   public void E(java.io.File var1) {
      this.N(var1);
   }

   public Ne4 H() {
      return this.Z;
   }

   public void P() {
      this.N(this.b);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected synchronized void N(java.io.File var1) {
      this.b = var1;
      this.Z.removeFocusListener(this.s);
      String var10000 = M();
      this.k.removeAll();
      String var2 = var10000;
      boolean var3 = this.getComponentOrientation().isLeftToRight();
      if (Wx2.t()) {
         KD var4 = this.l();
         this.k.add(var4);
         this.k.add(this.B(var3));
      }

      label179:
      if (var2 != null) {
         if (this.b != null) {
            java.io.File var18 = new java.io.File(this.b.getAbsolutePath());
            ArrayList var5 = new ArrayList();
            var5.add(0, var18);

            while (var18.getParent() != null) {
               var18 = var18.getParentFile();
               var5.add(0, var18);
               if (var2 == null) {
                  break label179;
               }

               if (var2 == null) {
                  break;
               }
            }

            byte var6 = 1;

            for (java.io.File var8 : var5) {
               KD var9 = new KD();
               if (var2 == null) {
                  break label179;
               }

               int var10001;
               label131: {
                  label187: {
                     var10001 = (Wx2.t()) ? 1 : 0;
                     if (var2 != null) {
                        if (var10001 != 0) {
                           break label187;
                        }

                        var10001 = var6;
                     }

                     if (var2 == null) {
                        break label131;
                     }

                     if (var10001 != 0) {
                        var10001 = GO.Fx;
                        break label131;
                     }
                  }

                  var10001 = 0;
               }

               label139: {
                  var9.s(var10001);
                  var9.f(0);
                  var9.O$KD(0);
                  var9.K(true);
                  var9.g(false);
                  var9.setFocusable(false);
                  var9.setForeground(this.getForeground());
                  if (var2 != null) {
                     if (!Wx2.t() && var6 != 0) {
                        var9.setIcon(Cz2.C());
                        var9.putClientProperty(b(11999, 3101), Cz2.C());
                        if (var2 != null) {
                           break label139;
                        }
                     }

                     var9.setText(U.getSystemDisplayName(var8));
                  }

                  var9.putClientProperty(b(11995, 25946), Cz2.U(var8, false));
               }

               int var10;
               Pb4 var11;
               label157: {
                  label188: {
                     var9.addActionListener(new SF(this, var8));
                     this.k.add(var9);
                     var10 = 0;
                     var11 = new Pb4();
                     java.io.File[] var12 = Cz2.C(this.p(var8));
                     java.io.File[] var22 = var12;
                     if (var2 != null) {
                        if (var12 == null) {
                           break label188;
                        }

                        var22 = var12;
                     }

                     java.io.File[] var13 = var22;
                     int var14 = var13.length;
                     int var15 = 0;

                     while (var15 < var14) {
                        java.io.File var16 = var13[var15];
                        if (var2 != null) {
                           var23 = var16.isDirectory();
                           if (var2 == null) {
                              break label157;
                           }

                           if (var23 != 0) {
                              QW var17 = new QW(Cz2.X(var16));
                              var17.setIcon(Cz2.U(var16, false));
                              var17.addActionListener(new Kz2(this, var16));
                              var11.add(var17);
                              var10++;
                           }

                           var15++;
                        }

                        if (var2 == null) {
                           break;
                        }
                     }
                  }

                  var23 = Wx2.t();
               }

               label164: {
                  if (var2 != null) {
                     if (var23 != 0) {
      byte var23;
      byte var23;
                        break label164;
                     }

                     var23 = var6;
                  }

                  if (var23 != 0) {
                     this.z(var11, var10);
                  }
               }

               Qe2_2 var21 = new Qe2_2();
               var21.setIcon(var3 ? M : p);
               var21.setSelectedIcon(Q);
               var21.A(false);
               var21.k(0);
               var21.N(0);
               var21.G(true);
               var21.M(false);
               var21.setFocusable(false);
               var21.setComponentPopupMenu(var11);
               var21.t(0);
               var21.K(0);
               var10001 = var10;
               if (var2 != null) {
                  var10001 = var10 > 0 ? 1 : 0;
               }

               var21.setEnabled((boolean)var10001);
               var21.addActionListener(new RJ3(this, var11, var21));
               this.k.add(var21);
               var11.addPopupMenuListener(new Cr4(this, var21));
               var6 = 0;
               if (var2 == null) {
                  break;
               }
            }
         }

         this.k.add(new JLabel());
      }

      label109: {
         var24 = Wx2.t();
         if (var2 != null) {
            if (var24) {
               var24 = this.O$boolean();
            } else {
               label198: {
                  while (this.Q().getComponentCount() > this.Z()) {
                     this.Q().remove(0);
                     if (var2 == null) {
                        var24 = this.O$boolean();
                        break label109;
                     }

                     if (var2 == null) {
                        var24 = this.O$boolean();
                        break label198;
                     }
                  }

                  var24 = this.O$boolean();
               }
            }
         }

         if (var2 != null) {
            if (var24) {
               this.Q().o(0);
            }

            var24 = this.O$boolean();
         }
      }

      while (var24) {
         KD var19 = (KD)this.k.getComponent(2);
         QW var20 = new QW();
         var20.setIcon((Icon)var19.getClientProperty(b(11995, 25946)));
         var20.setText(var19.getText());
         var20.addActionListener(var19.getActionListeners()[0]);
         this.Q().add(var20, 0);
         this.k.remove(2);
         this.k.remove(2);
         if (var2 == null) {
            return;
         }

         if (var2 == null) {
            break;
         }

         var24 = this.O$boolean();
      }

      this.revalidate();
      this.repaint();
   }

   protected List q(java.io.File var1, String var2) {
      String var10000 = M();
      String var4 = var2.toLowerCase();
      java.io.File[] var5 = this.p(var1);
      String var3 = var10000;
      ArrayList var6 = new ArrayList();
      java.io.File[] var11 = var5;
      if (var3 != null) {
         if (var5 == null) {
            return var6;
         }

         var11 = var5;
      }

      java.io.File[] var7 = var11;
      int var8 = var7.length;
      int var9 = 0;

      while (var9 < var8) {
         java.io.File var10 = var7[var9];
         if (var3 != null) {
            if (var10.getName().toLowerCase().contains(var4)) {
               var6.add(var10);
            }

            var9++;
         }

         if (var3 == null) {
            break;
         }
      }

      return var6;
   }

   protected java.io.File[] p(java.io.File var1) {
      String var2 = M();
      java.io.File var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return Cz2.z();
         }

         var10000 = var1;
      }

      return var10000.listFiles(this.e);
   }

   protected boolean O$boolean() {
      String var1 = M();
      int var10000 = this.k.getPreferredSize().width;
      int var10001 = this.k.getWidth();
      if (var1 != null) {
         if (var10000 <= var10001) {
            return (boolean)0;
         }

         var10000 = this.k.getComponentCount();
         if (var1 == null) {
            return (boolean)var10000;
         }

         var10001 = 5;
      }

      return (boolean)(var10000 > var10001 ? 1 : 0);
   }

   protected KD l() {
      String var1 = M();
      KD var10000 = this.D;
      if (var1 != null) {
         if (this.D == null) {
            this.D = KD.y(Cz2.C());
            this.D.s(this.q());
            this.D.f(0);
            this.D.O$KD(0);
            this.D.K(true);
            this.D.g(false);
            this.D.r(false);
            this.D.X(false);
            this.D.u$KD(true);
            this.D.addActionListener(new I6(this));
         }

         var10000 = this.D;
      }

      return var10000;
   }

   public Pb4 Q() {
      return this.S;
   }

   public int Z() {
      return this.v;
   }

   public void z(Pb4 var1, int var2) {
      this.S = var1;
      this.v = var2;
   }

   protected Qe2_2 B(boolean var1) {
      String var2;
      label56: {
         var2 = M();
         Qe2_2 var10000 = this.W;
         if (var2 != null) {
            if (this.W == null) {
               this.S = new Pb4();
               java.io.File[] var3 = Cz2.z();
               java.io.File[] var4 = Cz2.C(var3);
               int var5 = var4.length;
               int var6 = 0;

               while (true) {
                  if (var6 < var5) {
                     java.io.File var7 = var4[var6];
                     QW var8 = new QW(Cz2.X(var7));
                     var8.setIcon(Cz2.U(var7, false));
                     var8.addActionListener(new E7(this, var7));
                     this.S.add(var8);
                     this.v++;
                     var6++;
                     if (var2 == null) {
                        break;
                     }

                     if (var2 != null) {
                        continue;
                     }
                  }

                  this.W = new Qe2_2();
                  break;
               }

               this.W.setIcon(var1 ? M : p);
               this.W.setSelectedIcon(Q);
               this.W.A(false);
               this.W.k(0);
               this.W.N(0);
               this.W.G(true);
               this.W.M(false);
               this.W.setFocusable(false);
               this.W.t(0);
               this.W.K(0);
               this.W.setComponentPopupMenu(this.S);
               this.W.addActionListener(new Ir4(this));
               this.S.addPopupMenuListener(new QA(this));
               if (var2 != null) {
                  break label56;
               }
            }

            var10000 = this.W;
         }

         var10000.setIcon(var1 ? M : p);
      }

      Kz4 var9;
      while (true) {
         if (this.S.getComponentCount() > this.v) {
            var9 = this;
            if (var2 == null) {
               break;
            }

            this.S.remove(0);
            if (var2 != null) {
               continue;
            }
         }

         var9 = this;
         break;
      }

      return var9.W;
   }

   protected void X(java.io.File var1) {
      var1 = Cz2.M(var1);
      this.N(var1);
      this.Q(var1);
      this.transferFocus();
   }

   public void z(Kn2_2 var1) {
      this.Y.add(var1);
   }

   public void B(Kn2_2 var1) {
      this.Y.remove(var1);
   }

   protected void Q(java.io.File var1) {
      String var10000 = M();
      Iterator var3 = AL_2.J((Collection)this.Y).iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         Kn2_2 var4 = (Kn2_2)var3.next();
         var4.r(var1);
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void applyComponentOrientation(ComponentOrientation var1) {
      super.applyComponentOrientation(var1);
      this.P();
   }

   static {
      __vfClinit__();
   }

   public static void r(String var0) {
      g = var0;
   }

   public static String M() {
      return g;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 11999) & 65535;
      if (f[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 209;
               break;
            case 1:
               var10000 = 116;
               break;
            case 2:
               var10000 = 104;
               break;
            case 3:
               var10000 = 76;
               break;
            case 4:
               var10000 = 121;
               break;
            case 5:
               var10000 = 91;
               break;
            case 6:
               var10000 = 35;
               break;
            case 7:
               var10000 = 181;
               break;
            case 8:
               var10000 = 161;
               break;
            case 9:
               var10000 = 130;
               break;
            case 10:
               var10000 = 17;
               break;
            case 11:
               var10000 = 220;
               break;
            case 12:
               var10000 = 7;
               break;
            case 13:
               var10000 = 236;
               break;
            case 14:
               var10000 = 105;
               break;
            case 15:
               var10000 = 193;
               break;
            case 16:
               var10000 = 238;
               break;
            case 17:
               var10000 = 80;
               break;
            case 18:
               var10000 = 18;
               break;
            case 19:
               var10000 = 46;
               break;
            case 20:
               var10000 = 99;
               break;
            case 21:
               var10000 = 78;
               break;
            case 22:
               var10000 = 227;
               break;
            case 23:
               var10000 = 89;
               break;
            case 24:
               var10000 = 182;
               break;
            case 25:
               var10000 = 120;
               break;
            case 26:
               var10000 = 160;
               break;
            case 27:
               var10000 = 110;
               break;
            case 28:
               var10000 = 55;
               break;
            case 29:
               var10000 = 28;
               break;
            case 30:
               var10000 = 189;
               break;
            case 31:
               var10000 = 97;
               break;
            case 32:
               var10000 = 186;
               break;
            case 33:
               var10000 = 22;
               break;
            case 34:
               var10000 = 0;
               break;
            case 35:
               var10000 = 32;
               break;
            case 36:
               var10000 = 244;
               break;
            case 37:
               var10000 = 156;
               break;
            case 38:
               var10000 = 164;
               break;
            case 39:
               var10000 = 98;
               break;
            case 40:
               var10000 = 228;
               break;
            case 41:
               var10000 = 250;
               break;
            case 42:
               var10000 = 232;
               break;
            case 43:
               var10000 = 25;
               break;
            case 44:
               var10000 = 234;
               break;
            case 45:
               var10000 = 101;
               break;
            case 46:
               var10000 = 108;
               break;
            case 47:
               var10000 = 96;
               break;
            case 48:
               var10000 = 223;
               break;
            case 49:
               var10000 = 169;
               break;
            case 50:
               var10000 = 20;
               break;
            case 51:
               var10000 = 4;
               break;
            case 52:
               var10000 = 103;
               break;
            case 53:
               var10000 = 174;
               break;
            case 54:
               var10000 = 150;
               break;
            case 55:
               var10000 = 127;
               break;
            case 56:
               var10000 = 201;
               break;
            case 57:
               var10000 = 214;
               break;
            case 58:
               var10000 = 249;
               break;
            case 59:
               var10000 = 230;
               break;
            case 60:
               var10000 = 36;
               break;
            case 61:
               var10000 = 192;
               break;
            case 62:
               var10000 = 65;
               break;
            case 63:
               var10000 = 159;
               break;
            case 64:
               var10000 = 239;
               break;
            case 65:
               var10000 = 19;
               break;
            case 66:
               var10000 = 177;
               break;
            case 67:
               var10000 = 194;
               break;
            case 68:
               var10000 = 67;
               break;
            case 69:
               var10000 = 170;
               break;
            case 70:
               var10000 = 171;
               break;
            case 71:
               var10000 = 163;
               break;
            case 72:
               var10000 = 179;
               break;
            case 73:
               var10000 = 31;
               break;
            case 74:
               var10000 = 106;
               break;
            case 75:
               var10000 = 40;
               break;
            case 76:
               var10000 = 75;
               break;
            case 77:
               var10000 = 51;
               break;
            case 78:
               var10000 = 226;
               break;
            case 79:
               var10000 = 198;
               break;
            case 80:
               var10000 = 77;
               break;
            case 81:
               var10000 = 221;
               break;
            case 82:
               var10000 = 215;
               break;
            case 83:
               var10000 = 216;
               break;
            case 84:
               var10000 = 148;
               break;
            case 85:
               var10000 = 152;
               break;
            case 86:
               var10000 = 5;
               break;
            case 87:
               var10000 = 240;
               break;
            case 88:
               var10000 = 149;
               break;
            case 89:
               var10000 = 39;
               break;
            case 90:
               var10000 = 246;
               break;
            case 91:
               var10000 = 9;
               break;
            case 92:
               var10000 = 207;
               break;
            case 93:
               var10000 = 107;
               break;
            case 94:
               var10000 = 206;
               break;
            case 95:
               var10000 = 94;
               break;
            case 96:
               var10000 = 33;
               break;
            case 97:
               var10000 = 241;
               break;
            case 98:
               var10000 = 58;
               break;
            case 99:
               var10000 = 146;
               break;
            case 100:
               var10000 = 251;
               break;
            case 101:
               var10000 = 142;
               break;
            case 102:
               var10000 = 129;
               break;
            case 103:
               var10000 = 44;
               break;
            case 104:
               var10000 = 199;
               break;
            case 105:
               var10000 = 82;
               break;
            case 106:
               var10000 = 167;
               break;
            case 107:
               var10000 = 245;
               break;
            case 108:
               var10000 = 125;
               break;
            case 109:
               var10000 = 74;
               break;
            case 110:
               var10000 = 140;
               break;
            case 111:
               var10000 = 29;
               break;
            case 112:
               var10000 = 172;
               break;
            case 113:
               var10000 = 124;
               break;
            case 114:
               var10000 = 154;
               break;
            case 115:
               var10000 = 253;
               break;
            case 116:
               var10000 = 157;
               break;
            case 117:
               var10000 = 204;
               break;
            case 118:
               var10000 = 34;
               break;
            case 119:
               var10000 = 27;
               break;
            case 120:
               var10000 = 218;
               break;
            case 121:
               var10000 = 229;
               break;
            case 122:
               var10000 = 112;
               break;
            case 123:
               var10000 = 165;
               break;
            case 124:
               var10000 = 138;
               break;
            case 125:
               var10000 = 15;
               break;
            case 126:
               var10000 = 176;
               break;
            case 127:
               var10000 = 134;
               break;
            case 128:
               var10000 = 14;
               break;
            case 129:
               var10000 = 16;
               break;
            case 130:
               var10000 = 118;
               break;
            case 131:
               var10000 = 133;
               break;
            case 132:
               var10000 = 115;
               break;
            case 133:
               var10000 = 61;
               break;
            case 134:
               var10000 = 243;
               break;
            case 135:
               var10000 = 86;
               break;
            case 136:
               var10000 = 155;
               break;
            case 137:
               var10000 = 211;
               break;
            case 138:
               var10000 = 187;
               break;
            case 139:
               var10000 = 231;
               break;
            case 140:
               var10000 = 47;
               break;
            case 141:
               var10000 = 144;
               break;
            case 142:
               var10000 = 41;
               break;
            case 143:
               var10000 = 210;
               break;
            case 144:
               var10000 = 63;
               break;
            case 145:
               var10000 = 224;
               break;
            case 146:
               var10000 = 70;
               break;
            case 147:
               var10000 = 212;
               break;
            case 148:
               var10000 = 72;
               break;
            case 149:
               var10000 = 190;
               break;
            case 150:
               var10000 = 185;
               break;
            case 151:
               var10000 = 21;
               break;
            case 152:
               var10000 = 54;
               break;
            case 153:
               var10000 = 128;
               break;
            case 154:
               var10000 = 217;
               break;
            case 155:
               var10000 = 90;
               break;
            case 156:
               var10000 = 137;
               break;
            case 157:
               var10000 = 13;
               break;
            case 158:
               var10000 = 188;
               break;
            case 159:
               var10000 = 180;
               break;
            case 160:
               var10000 = 1;
               break;
            case 161:
               var10000 = 132;
               break;
            case 162:
               var10000 = 60;
               break;
            case 163:
               var10000 = 95;
               break;
            case 164:
               var10000 = 113;
               break;
            case 165:
               var10000 = 219;
               break;
            case 166:
               var10000 = 123;
               break;
            case 167:
               var10000 = 79;
               break;
            case 168:
               var10000 = 247;
               break;
            case 169:
               var10000 = 45;
               break;
            case 170:
               var10000 = 195;
               break;
            case 171:
               var10000 = 92;
               break;
            case 172:
               var10000 = 52;
               break;
            case 173:
               var10000 = 2;
               break;
            case 174:
               var10000 = 147;
               break;
            case 175:
               var10000 = 222;
               break;
            case 176:
               var10000 = 100;
               break;
            case 177:
               var10000 = 126;
               break;
            case 178:
               var10000 = 166;
               break;
            case 179:
               var10000 = 196;
               break;
            case 180:
               var10000 = 173;
               break;
            case 181:
               var10000 = 141;
               break;
            case 182:
               var10000 = 254;
               break;
            case 183:
               var10000 = 69;
               break;
            case 184:
               var10000 = 111;
               break;
            case 185:
               var10000 = 68;
               break;
            case 186:
               var10000 = 66;
               break;
            case 187:
               var10000 = 122;
               break;
            case 188:
               var10000 = 252;
               break;
            case 189:
               var10000 = 81;
               break;
            case 190:
               var10000 = 136;
               break;
            case 191:
               var10000 = 203;
               break;
            case 192:
               var10000 = 87;
               break;
            case 193:
               var10000 = 12;
               break;
            case 194:
               var10000 = 84;
               break;
            case 195:
               var10000 = 59;
               break;
            case 196:
               var10000 = 237;
               break;
            case 197:
               var10000 = 131;
               break;
            case 198:
               var10000 = 119;
               break;
            case 199:
               var10000 = 178;
               break;
            case 200:
               var10000 = 184;
               break;
            case 201:
               var10000 = 88;
               break;
            case 202:
               var10000 = 24;
               break;
            case 203:
               var10000 = 143;
               break;
            case 204:
               var10000 = 8;
               break;
            case 205:
               var10000 = 205;
               break;
            case 206:
               var10000 = 85;
               break;
            case 207:
               var10000 = 6;
               break;
            case 208:
               var10000 = 117;
               break;
            case 209:
               var10000 = 208;
               break;
            case 210:
               var10000 = 145;
               break;
            case 211:
               var10000 = 57;
               break;
            case 212:
               var10000 = 248;
               break;
            case 213:
               var10000 = 183;
               break;
            case 214:
               var10000 = 11;
               break;
            case 215:
               var10000 = 10;
               break;
            case 216:
               var10000 = 50;
               break;
            case 217:
               var10000 = 56;
               break;
            case 218:
               var10000 = 109;
               break;
            case 219:
               var10000 = 48;
               break;
            case 220:
               var10000 = 153;
               break;
            case 221:
               var10000 = 38;
               break;
            case 222:
               var10000 = 102;
               break;
            case 223:
               var10000 = 135;
               break;
            case 224:
               var10000 = 151;
               break;
            case 225:
               var10000 = 49;
               break;
            case 226:
               var10000 = 73;
               break;
            case 227:
               var10000 = 62;
               break;
            case 228:
               var10000 = 213;
               break;
            case 229:
               var10000 = 3;
               break;
            case 230:
               var10000 = 23;
               break;
            case 231:
               var10000 = 93;
               break;
            case 232:
               var10000 = 37;
               break;
            case 233:
               var10000 = 202;
               break;
            case 234:
               var10000 = 242;
               break;
            case 235:
               var10000 = 42;
               break;
            case 236:
               var10000 = 168;
               break;
            case 237:
               var10000 = 30;
               break;
            case 238:
               var10000 = 233;
               break;
            case 239:
               var10000 = 71;
               break;
            case 240:
               var10000 = 43;
               break;
            case 241:
               var10000 = 200;
               break;
            case 242:
               var10000 = 158;
               break;
            case 243:
               var10000 = 53;
               break;
            case 244:
               var10000 = 139;
               break;
            case 245:
               var10000 = 114;
               break;
            case 246:
               var10000 = 64;
               break;
            case 247:
               var10000 = 255;
               break;
            case 248:
               var10000 = 191;
               break;
            case 249:
               var10000 = 197;
               break;
            case 250:
               var10000 = 225;
               break;
            case 251:
               var10000 = 26;
               break;
            case 252:
               var10000 = 83;
               break;
            case 253:
               var10000 = 162;
               break;
            case 254:
               var10000 = 175;
               break;
            default:
               var10000 = 235;
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

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[6];
      int var3 = 0;
      r("exYf7b");
      String var2 = "¶ÃR\"Ï\u0002P\u0086\u000føÒv@\u0012h\u008b\tdO\b\u008fgÒR\u0006J`NÊ\"=\u000eçP\u0095\u0010nb\u001aD\u008aw®I¼\u0096";
      int var4 = "¶ÃR\"Ï\u0002P\u0086\u000føÒv@\u0012h\u008b\tdO\b\u008fgÒR\u0006J`NÊ\"=\u000eçP\u0095\u0010nb\u001aD\u008aw®I¼\u0096".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 19;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 81;
                        break;
                     case 1:
                        var46 = 56;
                        break;
                     case 2:
                        var46 = 25;
                        break;
                     case 3:
                        var46 = 13;
                        break;
                     case 4:
                        var46 = 127;
                        break;
                     case 5:
                        var46 = 60;
                        break;
                     default:
                        var46 = 56;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     f = new String[6];
                     Q = new ImageIcon(Kz4.class.getResource(b(11994, 759)));
                     p = new ImageIcon(Kz4.class.getResource(b(11996, -3161)));
                     M = new ImageIcon(Kz4.class.getResource(b(11998, -9195)));
                     U = FileSystemView.getFileSystemView();
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0082ïÞ\u00adTù)ó\u000ek\u0007\u000eð\u0017t7\u0086=tazOú";
                  var4 = "\u0082ïÞ\u00adTù)ó\u000ek\u0007\u000eð\u0017t7\u0086=tazOú".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 81;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}






