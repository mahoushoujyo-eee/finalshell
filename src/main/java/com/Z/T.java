package com.Z;

import com.G6;
import com.GO;
import com.GR;
import com.NE;
import com.Pg_2;
import com.Pl_2;
import com.SZ;
import com.i2_2;
import com.ne_4;
import com.u2;
import com.w6_2;
import com.wT_3;
import com.wb_4;
import com.xT_3;
import com.b.a;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.TableRowSorter;

public class T extends com.ky_4 {
   public static final ImageIcon x;
   public static final ImageIcon h9;
   public static final ImageIcon f;
   public static final ImageIcon G;
   public static final ImageIcon C;
   public static final ImageIcon P;
   public static final ImageIcon Y;
   public static final ImageIcon o;
   public static final ImageIcon w;
   public static final ImageIcon V;
   public static final ImageIcon b;
   public static final ImageIcon hk;
   public static final ImageIcon r;
   public static final ImageIcon hw;
   public static final ImageIcon j;
   public static final com.lV_3 X;
   protected boolean Z;
   protected com.Z.P B;
   protected boolean v = false;
   protected com.b.V O;
   protected List hM;
   protected com.Z.m_2 T = com.Z.m_2.tiles;
   protected boolean y = false;
   protected File S = null;
   protected int e = -1;
   protected List d = new ArrayList();
   protected ActionListener h6;
   protected ActionListener k;
   protected List u = new ArrayList(1);
   protected int h2 = com.Z.p_2.Q;
   protected com.KD hf;
   protected com.KD A;
   protected com.KD g;
   protected com.kz_4 D;
   protected com.Kn_2 Q;
   protected com.KD s;
   protected com.KD p;
   protected com.KD h;
   protected com.KD m;
   protected com.KD M;
   protected com.KD q;
   protected com.ky_4 hp;
   protected com.U.O K;
   protected u2 H;
   protected TreeSelectionListener U;
   protected SZ h4;
   protected com.Co_2 E;
   protected SZ c;
   protected Pg_2 hD;
   protected SZ t;
   protected com.k4_2 l;
   protected ne_4 R;
   protected com.ky_4 W;
   protected com.ky_4 n;
   protected com.L.X i;
   protected com.KD I;
   protected com.KD a;
   protected JComponent J;
   protected com.E N = new com.Z.M(this);
   protected I z = new I(this);
   private static String F;
   private static final String[] cb;
   private static final String[] db;
   private static final long[] eb;
   private static final Integer[] fb;

   public T() {
      this(com.Z.P.open, false);
   }

   public T(com.Z.P var1) {
      this(var1, false);
   }

   public T(boolean var1) {
      this(com.Z.P.open, var1);
   }

   public T(com.Z.P var1, boolean var2) {
      this.Z = var2;
      this.B = var1;
      this.setOpaque(false);
      this.setLayout(new BorderLayout(0, 0));
      this.add(this.l(), b(-20725, -27638));
      this.add(this.p(), b(-20703, -32116));
      this.add(this.F(), b(-20731, -17519));
      this.F();
      this.v();
      this.K(com.DE.F);
      this.b();
   }

   protected Component l() {
      xT_3 var2 = new xT_3(0);
      var2.X(com.LS.attached);
      var2.Z(0);
      var2.setFloatable(false);
      var2.addAncestorListener(new com.Z.n_2(this, var2));
      this.add(var2, b(-20724, 8388));
      this.hf = new com.KD(x);
      this.hf.u(b(-20728, 294), new Object[0]);
      this.hf.Y(this, GR.S).T(com.WF.down);
      this.hf.K(true);
      this.hf.setFocusable(false);
      this.hf.addActionListener(new com.Z.U(this));
      this.A = new com.KD(h9);
      this.A.u(b(-20705, -10193), new Object[0]);
      this.A.Y(this, GR.lJ).T(com.WF.trailing);
      this.A.K(true);
      this.A.setFocusable(false);
      this.A.addActionListener(new B(this));
      this.g = new com.KD(f);
      this.g.u(b(-20732, -21129), new Object[0]);
      this.g.K(true);
      this.g.setFocusable(false);
      this.g.addActionListener(new i_2(this));
      this.D = new com.kz_4();
      this.Q = new J(this);
      this.D.z(this.Q);
      this.s = new com.KD(G);
      this.s.u(b(-20707, 17440), new Object[0]);
      this.s.Y(this, GR.ra).T(com.WF.down);
      this.s.K(true);
      String var10000 = v();
      this.s.setFocusable(false);
      this.s.addActionListener(new V(this));
      this.p = new com.KD(C);
      this.p.u(b(-20729, -17566), new Object[0]);
      this.p.Y(this, GR.lu).T(com.WF.down);
      this.p.K(true);
      this.p.setFocusable(false);
      this.p.addActionListener(new com.Z.E(this));
      this.m = new com.KD(Y);
      this.m.u(b(-20712, 27366), new Object[0]);
      this.m.Y(this, GR.c).T(com.WF.down);
      this.m.K(true);
      this.m.setFocusable(false);
      this.m.addActionListener(new j_2(this));
      this.h = new com.KD(P);
      this.h.u(b(-20690, 27597), new Object[0]);
      this.h.Y(this, GR.lr).T(com.WF.down);
      this.h.K(true);
      this.h.setFocusable(false);
      this.h.addActionListener(new com.Z.g_2(this));
      this.M = new com.KD(o);
      this.M.u(b(-20720, 16324), new Object[0]);
      this.M.Y(this, GR.v).T(com.WF.down);
      this.M.K(true);
      this.M.setEnabled(false);
      String var1 = var10000;
      this.M.setFocusable(false);
      this.M.addActionListener(new com.Z.y_2(this));
      this.q = new com.KD(w);
      this.q.u(b(-20693, -28858), new Object[0]);
      this.q.K(true);
      this.q.setFocusable(false);
      this.q.addActionListener(new com.Z.Y(this));
      var2.add(this.hf);
      var2.add(this.A);
      var2.add(this.g);
      var2.r(this.D);
      var2.D(this.s);
      var2.D(this.p);
      var2.D(this.m);
      var2.M();
      var2.D(this.h);
      var2.D(this.M);
      var2.M();
      var2.D(this.q);
      if (var1 != null) {
         com.ky_4.K(new String[3]);
      }

      return var2;
   }

   protected void a(int var1) {
      String var2 = v();
      int var10000 = var1;
      if (var2 == null) {
         if (var1 < 0) {
            return;
         }

         var10000 = var1;
      }

      if (var10000 < this.d.size()) {
         this.e = var1;
         this.M((File)this.d.get(var1), d_2.history);
      }
   }

   protected Component p() {
      this.G();
      this.j();
      this.a();
      this.K = new com.U.O(1);
      this.K.setOneTouchExpandable(true);
      this.K.setLeftComponent(this.h4);
      this.K.setRightComponent(this.c);
      this.K.setDividerLocation(this.h2);
      this.hp = new com.ky_4(new BorderLayout(4, 0));
      this.hp.C(4);
      this.hp.add(this.K);
      return this.hp;
   }

   protected void G() {
      this.H = new u2();
      this.H.o(true);
      this.H.T(1);
      this.U = new s_2(this);
      this.H.addTreeSelectionListener(this.U);
      this.h4 = new SZ(this.H, true);
      this.h4.setPreferredSize(new Dimension(this.h2, 1));
   }

   protected void j() {
      this.E = new com.Co_2();
      this.E.y(true);
      this.E.setDropMode(DropMode.ON);
      this.E.M(true);
      this.E.g(3);
      this.E.m(5);
      this.E.setTransferHandler(new com.Z.q_2(this, d_2.list));
      this.E.getInputMap().put(KeyStroke.getKeyStroke(a(16724, 1360730222492915341L), 0), b(-20710, -10069));
      this.E.getActionMap().put(b(-20736, 6969), new com.Z.N(this));
      this.E.addMouseListener(new com.Z.h_2(this));
      this.E.addListSelectionListener(new c_2(this));
      this.E.c(new com.Z.H(this));
      this.c = this.E.x();
      this.c.setHorizontalScrollBarPolicy(a(15131, 1745935781627391177L));
      this.c.setVerticalScrollBarPolicy(a(15672, 4719930615273581291L));
   }

   protected void a() {
      this.hD = new Pg_2();
      this.hD.setOpaque(false);
      this.hD.setRowSorter(this.Q());
      this.hD.setTransferHandler(new com.Z.q_2(this, d_2.table));
      this.hD.getInputMap().put(KeyStroke.getKeyStroke(a(21809, 958757106686231271L), 0), b(-20736, 6969));
      this.hD.getActionMap().put(b(-20736, 6969), new z_2(this));
      this.hD.addMouseListener(new com.Z.w_2(this));
      this.hD.getSelectionModel().addListSelectionListener(new com.Z.r_2(this));
      this.hD.getDefaultEditor(File.class).addCellEditorListener(new com.Z.L(this));
      this.t = new SZ(this.hD, true);
      this.t.getViewport().setOpaque(true);
      this.t.getViewport().setBackground(Color.WHITE);
      this.t.setHorizontalScrollBarPolicy(a(26266, 2183272341484745039L));
      this.t.setVerticalScrollBarPolicy(a(8630, 7914268820569290337L));
   }

   protected TableRowSorter Q() {
      Pl_2 var2 = this.hD.G();
      TableRowSorter var3 = new TableRowSorter(var2);
      String var10000 = v();
      int var4 = 0;
      String var1 = var10000;

      while (var4 < var2.getColumnCount()) {
         Object var6;
         label63: {
            String var5 = var2.z(var4);
            boolean var7 = var5.equals(b(-20701, -25904));
            if (var1 == null) {
               if (var7) {
                  var6 = com.DE.n;
                  if (var1 == null) {
                     break label63;
                  }
               }

               var7 = var5.equals(b(-20697, 5759));
            }

            if (var1 == null) {
               if (var7) {
                  var6 = new F(this);
                  if (var1 == null) {
                     break label63;
                  }
               }

               var7 = var5.equals(b(-20734, 9969));
            }

            if (var1 == null) {
               if (var7) {
                  var6 = new S(this);
                  if (var1 == null) {
                     break label63;
                  }
               }

               var7 = var5.equals(b(-20708, 26800));
            }

            if (var7) {
               var6 = new com.Z.u_2(this);
               if (var1 == null) {
                  break label63;
               }
            }

            var6 = null;
         }

         label32: {
            if (var6 == null) {
               var3.setSortable(var4, false);
               if (var1 == null) {
                  break label32;
               }
            }

            var3.setComparator(var4, (Comparator<?>)var6);
         }

         var4++;
         if (var1 != null) {
            break;
         }
      }

      return var3;
   }

   protected Component F() {
      v();
      com.ky_4 var2 = new com.ky_4();
      var2.setLayout(new com.TA(4));
      var2.setOpaque(false);
      var2.N(0, 4, 4, 4);
      this.add(var2, b(-20718, 28849));
      com.O_ var3 = new com.O_();
      var3.u(b(-20700, 26574), new Object[0]);
      var3.D(true);
      var3.G(0, 4, 0, 0);
      var2.add(var3);
      this.l = new com.k4_2(false);
      this.l.v(false);
      this.l.N(true);
      this.l.n(false);
      this.R = new ne_4(0, true);
      this.R.addCaretListener(new C(this));
      this.R.addActionListener(new com.Z.k_2(this));
      this.W = new com.ky_4((Component)(this.B == com.Z.P.save ? this.R : this.l));
      var2.add(this.W, b(-20715, -9153));
      this.i = new com.L.X();
      this.i.setRenderer(new wT_3());
      this.i.addActionListener(new com.Z.G(this));
      this.I = new com.KD("", hw);
      w6_2.k(this, this.I, GR.ru, new wb_4(this.I, a(11208, 1400398337422621720L)), false, com.WF.up);
      this.I.S(GO.A);
      this.I.u(GO.Fv);
      this.I.putClientProperty(b(-20704, 26036), Boolean.valueOf(true));
      this.I.setEnabled(false);
      this.I.addActionListener(new com.Z.x_2(this));
      this.a = new com.KD("", j);
      this.a.u(b(-20706, -2257), new Object[0]);
      w6_2.k(this, this.a, GR.lD, new wb_4(this.a, a(12409, 7674510418498086824L)), false, com.WF.up);
      this.a.S(GO.A);
      this.a.u(GO.FN);
      this.a.putClientProperty(b(-20726, -22920), Boolean.valueOf(true));
      this.a.addActionListener(new v_2(this));
      this.n = new com.ky_4();
      this.B();
      var2.add(this.n, b(-20714, -15959));
      com.FN.b(new Component[]{this.I, this.a});
      com.Z.l_2 var4 = new com.Z.l_2(this, var2);
      this.I.addPropertyChangeListener(b(-20698, -8302), var4);
      this.a.addPropertyChangeListener(b(-20692, 32549), var4);
      if (com.ky_4.F() != null) {
         O("F5aJtb");
      }

      return var2;
   }

   public void B(JComponent var1) {
      String var2 = v();
      com.ky_4 var10000 = this.J;
      if (var2 == null) {
         if (this.J == var1) {
            return;
         }

         var10000 = this.J;
      }

      label34: {
         if (var2 == null) {
            if (var10000 != null) {
               this.hp.remove(this.J);
            }

            var10000 = this;
            if (var2 != null) {
               break label34;
            }

            this.J = var1;
            var10000 = var1;
         }

         if (var10000 != null) {
            this.hp.add(var1, b(-20721, 31277));
         }

         var10000 = this.hp;
      }

      var10000.revalidate();
   }

   public u2 T() {
      return this.H;
   }

   public com.Co_2 w() {
      return this.E;
   }

   public JComponent z() {
      return this.J;
   }

   public com.Z.m_2 R() {
      return this.T;
   }

   public void M(com.Z.m_2 var1) {
      String var2 = v();
      int var10000 = var1.w();
      if (var2 == null) {
         var10000 = var10000 != this.T.w() ? 1 : 0;
      }

      int var3 = var10000;
      this.T = var1;
      int var4 = this.K.getDividerLocation();
      if (var2 == null) {
         switch (com.Z.W.z[var1.ordinal()]) {
            case 1:
               this.E.g(a(9069, 2198598104277218489L));
               this.E.m(4);
               this.E.l(G6.icons);
               this.K.setRightComponent(this.c);
               if (var2 != null) {
                  return;
               }

               if (var3 == 0) {
                  break;
               }

               this.E.J(this.hD.P());
               this.E.requestFocusInWindow();
               if (var2 == null) {
                  break;
               }
            case 2:
               this.E.g(3);
               this.E.m(a(10899, 3822390436243176779L));
               this.E.l(G6.tiles);
               this.K.setRightComponent(this.c);
               if (var2 != null) {
                  return;
               }

               if (var3 == 0) {
                  break;
               }

               this.E.J(this.hD.P());
               this.E.requestFocusInWindow();
               if (var2 == null) {
                  break;
               }
            case 3:
               this.K.setRightComponent(this.t);
               if (var2 != null) {
                  return;
               }

               if (var3 != 0) {
                  this.hD.B(this.E.U());
                  this.hD.requestFocusInWindow();
               }
         }

         this.K.setDividerLocation(var4);
         this.K.revalidate();
      }
   }

   public void c(File var1) {
      this.M(var1, d_2.other);
   }

   protected void M(File var1, d_2 var2) {
      String var3;
      File var4;
      label105: {
         String var10000 = v();
         var4 = null;
         var3 = var10000;
         File var5 = var1;
         if (var3 == null) {
            if (var1 == null) {
               break label105;
            }

            var5 = var1;
         }

         if (var3 == null) {
            if (com.Cz_2.z(var5)) {
               break label105;
            }

            var5 = var1;
         }

         var4 = var5;
         var1 = var1.getParentFile();
      }

      File var6;
      label106: {
         label107: {
            var6 = var1;
            if (var3 == null) {
               if (var1 == null) {
                  var7 = com.Wx_2.t();
                  if (var3 != null) {
                     break label107;
                  }

                  if (!var7) {
                     var1 = com.Cz_2.z()[0];
                  }
               }

               var6 = this.S;
            }

            if (var3 != null) {
               break label106;
            }

            var7 = com.Cz_2.n(var6, var1);
         }

         if (!var7) {
            d_2 var8 = var2;
            d_2 var10001 = d_2.history;
            if (var3 == null) {
               if (var2 != d_2.history) {
                  label72:
                  if (var3 == null) {
                     if (this.e > -1) {
                        while (this.e + 1 < this.d.size()) {
                           this.d.remove(this.e + 1);
                           if (var3 != null) {
                              break label72;
                           }

                           if (var3 != null) {
                              break;
                           }
                        }
                     }

                     this.d.add(var1);
                  }

                  this.e = this.d.size() - 1;
               }

               var8 = var2;
               var10001 = d_2.path;
            }

            if (var3 == null) {
               if (var8 != var10001) {
                  this.U(var1);
               }

               var8 = var2;
               var10001 = d_2.tree;
            }

            if (var8 != var10001) {
               this.o(var1);
            }

            this.J(var1);
            this.d(var1);
            this.S = var1;
            this.S();
            if (var3 == null) {
               if (var4 != null) {
                  this.T(var4);
               }

               this.G(this.S);
            }

            return;
         }

         var6 = var4;
      }

      if (var6 != null) {
         this.T(var4);
      }

      this.S();
   }

   protected void S() {
      String var1 = v();
      int var10001 = this.e;
      if (var1 == null) {
         var10001 = this.e > 0 ? 1 : 0;
      }

      this.hf.setEnabled((boolean)var10001);
      var10001 = this.e + 1;
      if (var1 == null) {
         var10001 = var10001 < this.d.size() ? 1 : 0;
      }

      this.A.setEnabled((boolean)var10001);
      this.h.setEnabled(this.S != null);
      com.KD var10000 = this.s;
      boolean var3;
      if (com.Wx_2.t()) {
         var3 = this.S != null;
      } else {
         label40: {
            label39: {
               File var4 = this.S;
               if (var1 == null) {
                  if (this.S == null) {
                     break label39;
                  }

                  var4 = this.S.getParentFile();
               }

               if (var4 != null) {
                  var3 = true;
                  break label40;
               }
            }

            var3 = false;
         }
      }

      var10000.setEnabled(var3);
   }

   public List s() {
      String var1 = v();
      com.Z.T var10000 = this;
      if (var1 == null) {
         if (this.B == com.Z.P.save) {
            return Arrays.asList(new File(this.S, this.R.getText()));
         }

         var10000 = this;
      }

      List var2 = var10000.N();
      return this.F(var2);
   }

   protected List F(Collection var1) {
      return com.Cz_2.F(var1, this.O);
   }

   protected List N() {
      String var1;
      com.Z.T var3;
      label30: {
         var1 = v();
         int var10000 = this.T.w();
         if (var1 == null) {
            if (var10000 == 0) {
               List var2 = this.E.U();
               if (var1 == null) {
                  return var2;
               }
            }

            var3 = this;
            if (var1 != null) {
               break label30;
            }

            var10000 = this.T.w();
         }

         if (var10000 != 1) {
            return new ArrayList(0);
         }

         var3 = this;
      }

      List var4 = var3.hD.P();
      return (List)(var1 == null ? var4 : new ArrayList(0));
   }

   public void T(File var1) {
      String var2;
      label39: {
         com.Z.T var3;
         label42: {
            var2 = v();
            int var10000 = this.T.w();
            if (var2 == null) {
               if (var10000 == 0) {
                  this.E.P(var1);
               }

               var3 = this;
               if (var2 != null) {
                  break label42;
               }

               var10000 = this.T.w();
            }

            if (var10000 != 1) {
               break label39;
            }

            var3 = this;
         }

         var3.hD.D(var1);
      }

      label27: {
         File var4 = var1;
         if (var2 == null) {
            if (var1 == null) {
               break label27;
            }

            var4 = var1;
         }

         if (!var4.exists()) {
            this.Z(Arrays.asList(var1));
            if (var2 == null) {
               return;
            }
         }
      }

      this.Z(Collections.EMPTY_LIST);
   }

   public void g(File[] var1) {
      this.S(com.aL.o(var1));
   }

   public void S(Collection var1) {
      com.Z.T var3;
      label23: {
         String var2 = v();
         int var10000 = this.T.w();
         if (var2 == null) {
            if (var10000 == 0) {
               this.E.J(var1);
            }

            var3 = this;
            if (var2 != null) {
               break label23;
            }

            var10000 = this.T.w();
         }

         if (var10000 == 1) {
            this.hD.B(var1);
         }

         var3 = this;
      }

      var3.Z(var1);
   }

   protected void f() {
      List var1 = this.N();
      this.Z(var1);
   }

   protected void Z(Collection var1) {
      String var2;
      List var3;
      int var10001;
      label53: {
         String var10000 = v();
         var3 = this.F(var1);
         var2 = var10000;
         this.h.setEnabled(this.S != null);
         if (this.S != null) {
            var10001 = var1.size();
            if (var2 != null) {
               break label53;
            }

            if (var10001 > 0) {
               var10001 = 1;
               break label53;
            }
         }

         var10001 = 0;
      }

      label46: {
         this.M.setEnabled((boolean)var10001);
         com.Z.T var5 = this;
         if (var2 == null) {
            if (this.B == com.Z.P.save) {
               var5 = var3;
               if (var2 == null) {
                  if (var3.size() <= 0) {
                     break label46;
                  }

                  var5 = (com.Z.T)var3.get(0);
               }

               label41: {
                  File var4 = (File)var5;
                  if (var2 == null) {
                     if (var4.exists() && !com.Cz_2.V(var4)) {
                        break label41;
                     }

                     this.l.B(var4);
                  }

                  this.R.setText(this.p(var4));
               }

               if (var2 == null) {
                  break label46;
               }
            }

            this.l.l(var3);
            var5 = this;
         }

         var5.R.setText(this.V(var3));
      }

      this.b(var3);
      this.K(var3);
   }

   private String V(List var1) {
      String var2 = v();
      int var10000 = var1.size();
      byte var10001 = 1;
      if (var2 == null) {
         if (var10000 > 1) {
            return this.s(var1);
         }

         var10000 = var1.size();
         var10001 = 1;
      }

      return var10000 == var10001 ? this.p((File)var1.get(0)) : "";
   }

   protected String p(File var1) {
      return var1.getName();
   }

   protected String s(List var1) {
      return NE.b(var1, b(-20695, 12991), X);
   }

   protected void b(List var1) {
      String var2;
      label46: {
         var2 = v();
         com.Z.T var10000 = this;
         if (var2 == null) {
            if (this.B != com.Z.P.save) {
               break label46;
            }

            var10000 = this;
         }

         com.KD var3 = var10000.I;
         boolean var10001 = this.R.getText().trim().equals("");
         if (var2 == null) {
            var10001 = !var10001;
         }

         var3.setEnabled(var10001);
         if (var2 == null) {
            return;
         }
      }

      label33: {
         List var4 = var1;
         if (var2 == null) {
            if (var1 != null) {
               break label33;
            }

            var4 = this.F(this.N());
         }

         var1 = var4;
      }

      com.KD var5 = this.I;
      int var6 = var1.size();
      if (var2 == null) {
         var6 = var6 > 0 ? 1 : 0;
      }

      var5.setEnabled((boolean)var6);
   }

   protected void o() {
      com.Z.T var2;
      label14: {
         String var10000 = v();
         this.W.removeAll();
         String var1 = var10000;
         var2 = this;
         if (var1 == null) {
            if (this.B == com.Z.P.save) {
               var2 = this.R;
               break label14;
            }

            var2 = this;
         }

         var2 = var2.l;
      }

      this.W.add(var2);
      this.W.revalidate();
   }

   protected void U(File var1) {
      this.D.B(this.Q);
      this.D.E(var1);
      this.D.z(this.Q);
   }

   protected void o(File var1) {
      String var2 = v();
      if (var2 == null) {
         if (var1 != null) {
            this.H.l(var1, false, false, new com.Z.a_2(this, var1));
            if (var2 == null) {
               return;
            }
         }

         this.H.clearSelection();
      }

      this.H.J();
   }

   protected void J(File var1) {
      this.E.e(var1);
   }

   protected void d(File var1) {
      this.hD.k(var1);
   }

   protected void c() {
      this.i.setModel(new DefaultComboBoxModel(this.hM.toArray()));
   }

   public void D(com.b.V var1) {
      this.R(var1, true);
   }

   protected void R(com.b.V var1, boolean var2) {
      String var3 = v();
      boolean var10000 = this.hM.contains(var1);
      if (var3 == null) {
         if (!var10000) {
            var1 = (com.b.V)this.hM.get(0);
         }

         this.O = var1;
         if (var3 != null) {
            return;
         }

         var10000 = var2;
      }

      if (var10000) {
         this.i.setSelectedItem(var1);
      }

      this.s();
   }

   protected void s$void() {
      this.E.N(this.O(this.x(this.O)));
      this.hD.V(this.O(this.x(this.O)));
   }

   protected void v() {
      this.D.F(this.O(com.DE.Y));
      this.H.M(this.O(com.DE.Y));
   }

   protected com.b.f x(com.b.V var1) {
      return new com.b.f(com.b.a.OR, new FileFilter[]{var1, com.DE.Y});
   }

   protected com.b.f O(com.b.V var1) {
      return new com.b.f(com.b.a.AND, new FileFilter[]{var1, this.z});
   }

   public void T() {
      String var1 = v();
      com.Z.T var10000 = this;
      if (var1 == null) {
         if (this.S != null) {
            com.Cz_2.s(this.S.listFiles());
         }

         this.D.P();
         this.H.s(this.S);
         this.E.I();
         var10000 = this;
      }

      var10000.hD.Z();
   }

   public void w$void() {
      String var1 = v();
      int var10000 = this.T.w();
      if (var1 == null) {
         if (var10000 == 0) {
            this.E.R();
         }

         var10000 = this.T.w();
      }

      if (var1 == null && var10000 == 1) {
         this.hD.o();
      }
   }

   public void x() {
      String var10000 = v();
      List var2 = this.N();
      String var1 = var10000;
      if (!var2.isEmpty()) {
         com.ky_4 var3 = new com.ky_4(new BorderLayout(0, 5));
         var3.add(new com.O_(i2_2.O(b(-20699, 20294))), b(-20725, -27638));
         com.ky_4 var4 = new com.ky_4(new com.TO(0, 0, 5, true, false));
         var4.C(3);
         var4.setBackground(Color.WHITE);

         for (File var6 : var2) {
            var4.add(new com.O_(var6.getName(), com.Cz_2.B(var6), 2, new Object[0]));
            if (var1 != null) {
               break;
            }
         }

         b_2 var8 = new b_2(this, var4);
         var3.add(var8, b(-20717, 11083));
         String var9 = i2_2.O(b(-20735, 14641));
         int var7 = com.T.E.showConfirmDialog(this, var3, var9, 0, 3);
         if (var1 == null) {
            if (var7 != 0) {
               return;
            }

            com.Cz_2.r(var2);
         }

         this.T();
      }
   }

   public ActionListener C() {
      return this.h6;
   }

   public void O(ActionListener var1) {
      this.h6 = var1;
   }

   public ActionListener R$ActionListener() {
      return this.k;
   }

   public void D(ActionListener var1) {
      this.k = var1;
   }

   protected void v(ActionEvent var1) {
      String var2 = v();
      ActionListener var10000 = this.h6;
      if (var2 == null) {
         if (this.h6 == null) {
            return;
         }

         var10000 = this.h6;
      }

      var10000.actionPerformed(var1);
   }

   protected void h(ActionEvent var1) {
      String var2 = v();
      ActionListener var10000 = this.k;
      if (var2 == null) {
         if (this.k == null) {
            return;
         }

         var10000 = this.k;
      }

      var10000.actionPerformed(var1);
   }

   public List q() {
      return this.hM;
   }

   public com.b.V b() {
      return this.O;
   }

   public void D(FileFilter var1) {
      this.K(com.Cz_2.c(var1));
   }

   public void U(javax.swing.filechooser.FileFilter var1) {
      this.K(com.Cz_2.S(var1));
   }

   public void K(com.b.V var1) {
      this.hM = Arrays.asList(var1);
      this.c();
      this.D(var1);
   }

   public void t(FileFilter[] var1) {
      this.Q(0, var1);
   }

   public void Q(int var1, FileFilter[] var2) {
      this.hM = new ArrayList(var2.length);
      String var10000 = v();
      FileFilter[] var4 = var2;
      int var5 = var2.length;
      String var3 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            FileFilter var7 = var4[var6];
            this.hM.add(com.Cz_2.c(var7));
            var6++;
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         this.c();
         this.D((com.b.V)this.hM.get(var1));
         break;
      }
   }

   public void A(javax.swing.filechooser.FileFilter[] var1) {
      this.z(0, var1);
   }

   public void z(int var1, javax.swing.filechooser.FileFilter[] var2) {
      String var10000 = v();
      this.hM = new ArrayList(var2.length);
      String var3 = var10000;
      javax.swing.filechooser.FileFilter[] var4 = var2;
      int var5 = var2.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            javax.swing.filechooser.FileFilter var7 = var4[var6];
            this.hM.add(com.Cz_2.S(var7));
            var6++;
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         this.c();
         this.D((com.b.V)this.hM.get(var1));
         break;
      }
   }

   public void Z(com.b.V[] var1) {
      this.R(0, var1);
   }

   public void R(int var1, com.b.V[] var2) {
      this.hM = Arrays.asList(var2);
      this.c();
      this.D((com.b.V)this.hM.get(var1));
   }

   public void H(List var1) {
      this.E(0, var1);
   }

   public void E(int var1, List var2) {
      this.hM = com.aL.J((Collection)var2);
      this.c();
      this.D((com.b.V)this.hM.get(var1));
   }

   public boolean J() {
      return this.Z;
   }

   public void F(boolean var1) {
      this.Z = var1;
      this.B();
   }

   protected void B() {
      com.Z.T var2;
      label14: {
         String var10000 = v();
         this.n.removeAll();
         String var1 = var10000;
         var2 = this;
         if (var1 == null) {
            if (this.Z) {
               var2 = new com.kl_4(4, new Component[]{this.i, this.I, this.a});
               break label14;
            }

            var2 = this;
         }

         var2 = var2.i;
      }

      this.n.add(var2);
   }

   public String p$String() {
      return this.I.getText();
   }

   public void b$void() {
      this.q((String)null);
   }

   public void q(String var1) {
      String var2 = v();
      if (var2 == null) {
         if (var1 == null) {
            com.Z.O var3;
            label26: {
               com.Z.P var10001 = this.B;
               com.Z.P var10002 = com.Z.P.save;
               if (var2 == null) {
                  if (this.B == com.Z.P.save) {
                     var3 = com.Z.O.save;
                     break label26;
                  }

                  var10001 = this.B;
                  var10002 = com.Z.P.open;
               }

               var3 = var10001 == var10002 ? com.Z.O.open : com.Z.O.choose;
            }

            this.E(var3);
            if (var2 == null) {
               return;
            }
         }

         this.I.M();
      }

      this.I.setText(var1);
   }

   public void E(com.Z.O var1) {
      this.Z(var1.X());
   }

   public void Z(String var1) {
      this.I.u(var1, new Object[0]);
   }

   public com.Z.P o$comZP() {
      return this.B;
   }

   public void H(com.Z.P var1) {
      this.B = var1;
      this.F();
      this.o();
      this.f();
      this.b();
   }

   public boolean w$boolean() {
      return this.v;
   }

   public void t(boolean var1) {
      this.v = var1;
      this.v();
      this.s();
   }

   public void d(com.Z.o_2 var1) {
      this.u.add(var1);
   }

   public void a(com.Z.o_2 var1) {
      this.u.remove(var1);
   }

   protected void G(File var1) {
      String var10000 = v();
      Iterator var3 = com.aL.J((Collection)this.u).iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         com.Z.o_2 var4 = (com.Z.o_2)var3.next();
         var4.W(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   protected void K(List var1) {
      String var10000 = v();
      Iterator var3 = com.aL.J((Collection)this.u).iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         com.Z.o_2 var4 = (com.Z.o_2)var3.next();
         var4.D(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   public boolean B$boolean() {
      return this.y;
   }

   public void z(boolean var1) {
      this.y = var1;
      this.F();
   }

   protected void F$void() {
      String var1;
      byte var4;
      label26: {
         label25: {
            var1 = v();
            com.Z.T var10000 = this;
            if (var1 == null) {
               if (!this.y) {
                  break label25;
               }

               var10000 = this;
            }

            if (var10000.B != com.Z.P.save) {
               var4 = 1;
               break label26;
            }
         }

         var4 = 0;
      }

      byte var2 = (byte)var4;
      var4 = var2;
      if (var1 == null) {
         var4 = var2 != 0 ? 2 : 0;
      }

      int var3 = var4;
      this.E.setSelectionMode(var3);
      this.hD.setSelectionMode(var3);
      this.l.g((boolean)var2);
   }

   public boolean M() {
      return this.E.R();
   }

   public void O(boolean var1) {
      this.E.y(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[48];
      int var11 = 0;
      O(null);
      String var10 = "%ØßÇØ\u0000«Ë.?\u009d\tm\u0092 zsYå\u0000ë\u000fC\u000f_\f@\u0099\u0095À\b¼N6\"MVÿÔ\u0005PLÆ\u0006\u0007\u001a\u008bY\n÷b\u0006ü\u000bÄ'À\nÆòÕvÝØ00W\u0017\u0003\u0010\u0091\u0095\u0014¸Q¼2\nµé\u0014\"ä¹jÞÌ\r\u0094Æ\u00021&)*ù>ãä\u0084,[Þ-\u0083K®ÚØs|x\u00048Ù\u0098ÃØÎÝ\"\u000b´4£\u0011ÞÎµÌû£ÌjÌ'áíGaËÔÉQbl\u0014c\\ß\u0086Ó·l}ªòÖ+Ï°AÃ\u007f\u001eÒ\u0089ût\u0012éÇjP«\n\u001f4\u0084ïsN_(¶\u001f\u0005o\u0003pÖê\u0010¸Ç¼à\nïýU7\u008c)\u001aÌ)\u001bå\u0011Íê\u0012Eß[SÉkLI\u000e\u007f\u0000p\\\u0097\u0005Z\u0011>\u00adÿ\u0005Gê\u009dÒ\u008b\u0013ø³Y'\u0088\u0019FFãç\u0015w\u0010\u0080\u0088P\u001f\u0010*\u000eT\u009f!ë¹\u008e\u008fuõ\u001d &þ\u000e\u0017u\u0096Õ\u000e\u00999\u0083ì+Û=\u0095y\u0001\"\b#\u0017ïÃ¤2k\u000få\u0012\u0017Z\u007f¸U»ëÖOy/yû\u0003âçu\u0004Þb\u0099\u0019\u0011ç\u008fWéwÎH}Æ\u001fÓ\u0007þ!þxF\u0006\u008bÛ´¿<\u0000\u0005ÿ\u001a3Ì¹\u000fk\nÆYEØ\u000fµ\u0013Wê\u000bO7÷\u0019êc&°çîL\u0016Ò\u0084\u0002~\u009e|Þ§¼â\u001c{Þì®\u0088\u0000\u001ai´VJé±\u008dýêù\u0005Ñ~\u0089Â\u0019?5l\u0083Ú¯w(|@\u0019¯Ó\u008e¦ò,îN\u0086\u008f\u0088\u001fÏPô\"ùR´jÏ+\u000e#Û\u001b¢\u0082/\u008cÆihæV\u009a\u0092½\u008c\u0004\u009c¨ô\u0003\u0015Eõi\u0081)ÓõI1\u0081ÝKgJ\u0014ùIdoÔ\u0003DÓ\u0085R×\\q¼w\b\u0016Êt\u009fuC^=þ0}ýØSLÇ9±#ÁöËòÇ¸\u001bì\u0011í¬\u0016\u008d_BDõl2å`$I:uÞ\n?ã\u0080\u0015ó\u0011OÃ´b\u0013| $\f\u0019r\u008bìnû0\u0089ï«>YI×\\\u001a\u001c\u0084øL<q7å½úï±#\u0085i\u0098J\u0005Â\u0091\u0005oÂ¢n\u0099$¼\u0011ìþ¾'g/·£®\u009a\u000bàl4ê\u0090Ö%\u0083;\u0088¬§S\u000fÚ\u0011\u000e\u0017V^7\u007fÀ\u0004ô¦\u009c\u0010&Ä·ã*_½[|0É^×\u0015I¯\u0001\u00926Ùáf¿¹ââä\u0089ËWD )QHM\u0080ò-!\u0003~\u001b\u0013@\u009a¸\u0098LUÑDä;\u0091OUÿ!Úu\u009aVAT*{çÄ§¥çF$M\u007fÒ3y\u009e\u009f\u0018¨EMFw{ãG\u001bþèèD\u0082p\u009b¸µì\u0006m\u0095\u0098%²QK\u0005\u0015\u0080:»_ê\u0018õ¡¡RÉ¼Ð\u0010ÆÓ¿í\"G\u008e\u0006\u0090º×\u0093P\u0085\u0013?u¡ÿ\u0097\u0002¥%\u009f\u008b\u009aúá1¶fØÖÒ\u0011G\u001fCûõ\u008c\u00029Ã\u001cÎ \u0007ôòÂÇ\u001cÙ?@;+\u009fÕ8áAdÆRkGE\u008f¾zú\u0012\u008c4ç9vÜ\u0087\u0012E®\u0003ÍýJ\u0013åö\u001aßHoóø?\u001a\u0087\u0004u(¬Á\u0017\u0019ÄXD(pµÅíþå1b\u0095A\u009aOEb\u009d\u001diI\u0010ì\u00816([öÆr`à³\u0013î _Ä";
      int var12 = "%ØßÇØ\u0000«Ë.?\u009d\tm\u0092 zsYå\u0000ë\u000fC\u000f_\f@\u0099\u0095À\b¼N6\"MVÿÔ\u0005PLÆ\u0006\u0007\u001a\u008bY\n÷b\u0006ü\u000bÄ'À\nÆòÕvÝØ00W\u0017\u0003\u0010\u0091\u0095\u0014¸Q¼2\nµé\u0014\"ä¹jÞÌ\r\u0094Æ\u00021&)*ù>ãä\u0084,[Þ-\u0083K®ÚØs|x\u00048Ù\u0098ÃØÎÝ\"\u000b´4£\u0011ÞÎµÌû£ÌjÌ'áíGaËÔÉQbl\u0014c\\ß\u0086Ó·l}ªòÖ+Ï°AÃ\u007f\u001eÒ\u0089ût\u0012éÇjP«\n\u001f4\u0084ïsN_(¶\u001f\u0005o\u0003pÖê\u0010¸Ç¼à\nïýU7\u008c)\u001aÌ)\u001bå\u0011Íê\u0012Eß[SÉkLI\u000e\u007f\u0000p\\\u0097\u0005Z\u0011>\u00adÿ\u0005Gê\u009dÒ\u008b\u0013ø³Y'\u0088\u0019FFãç\u0015w\u0010\u0080\u0088P\u001f\u0010*\u000eT\u009f!ë¹\u008e\u008fuõ\u001d &þ\u000e\u0017u\u0096Õ\u000e\u00999\u0083ì+Û=\u0095y\u0001\"\b#\u0017ïÃ¤2k\u000få\u0012\u0017Z\u007f¸U»ëÖOy/yû\u0003âçu\u0004Þb\u0099\u0019\u0011ç\u008fWéwÎH}Æ\u001fÓ\u0007þ!þxF\u0006\u008bÛ´¿<\u0000\u0005ÿ\u001a3Ì¹\u000fk\nÆYEØ\u000fµ\u0013Wê\u000bO7÷\u0019êc&°çîL\u0016Ò\u0084\u0002~\u009e|Þ§¼â\u001c{Þì®\u0088\u0000\u001ai´VJé±\u008dýêù\u0005Ñ~\u0089Â\u0019?5l\u0083Ú¯w(|@\u0019¯Ó\u008e¦ò,îN\u0086\u008f\u0088\u001fÏPô\"ùR´jÏ+\u000e#Û\u001b¢\u0082/\u008cÆihæV\u009a\u0092½\u008c\u0004\u009c¨ô\u0003\u0015Eõi\u0081)ÓõI1\u0081ÝKgJ\u0014ùIdoÔ\u0003DÓ\u0085R×\\q¼w\b\u0016Êt\u009fuC^=þ0}ýØSLÇ9±#ÁöËòÇ¸\u001bì\u0011í¬\u0016\u008d_BDõl2å`$I:uÞ\n?ã\u0080\u0015ó\u0011OÃ´b\u0013| $\f\u0019r\u008bìnû0\u0089ï«>YI×\\\u001a\u001c\u0084øL<q7å½úï±#\u0085i\u0098J\u0005Â\u0091\u0005oÂ¢n\u0099$¼\u0011ìþ¾'g/·£®\u009a\u000bàl4ê\u0090Ö%\u0083;\u0088¬§S\u000fÚ\u0011\u000e\u0017V^7\u007fÀ\u0004ô¦\u009c\u0010&Ä·ã*_½[|0É^×\u0015I¯\u0001\u00926Ùáf¿¹ââä\u0089ËWD )QHM\u0080ò-!\u0003~\u001b\u0013@\u009a¸\u0098LUÑDä;\u0091OUÿ!Úu\u009aVAT*{çÄ§¥çF$M\u007fÒ3y\u009e\u009f\u0018¨EMFw{ãG\u001bþèèD\u0082p\u009b¸µì\u0006m\u0095\u0098%²QK\u0005\u0015\u0080:»_ê\u0018õ¡¡RÉ¼Ð\u0010ÆÓ¿í\"G\u008e\u0006\u0090º×\u0093P\u0085\u0013?u¡ÿ\u0097\u0002¥%\u009f\u008b\u009aúá1¶fØÖÒ\u0011G\u001fCûõ\u008c\u00029Ã\u001cÎ \u0007ôòÂÇ\u001cÙ?@;+\u009fÕ8áAdÆRkGE\u008f¾zú\u0012\u008c4ç9vÜ\u0087\u0012E®\u0003ÍýJ\u0013åö\u001aßHoóø?\u001a\u0087\u0004u(¬Á\u0017\u0019ÄXD(pµÅíþå1b\u0095A\u009aOEb\u009d\u001diI\u0010ì\u00816([öÆr`à³\u0013î _Ä"
         .length();
      char var9 = 23;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 12;
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
                        var65 = 8;
                        break;
                     case 1:
                        var65 = 30;
                        break;
                     case 2:
                        var65 = 12;
                        break;
                     case 3:
                        var65 = 55;
                        break;
                     case 4:
                        var65 = 96;
                        break;
                     case 5:
                        var65 = 20;
                        break;
                     default:
                        var65 = 82;
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
                     cb = var13;
                     db = new String[48];
                     long var0 = 4615155253308516895L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "\fÔ§\"v¤\u0016Ï\u0018\u009dM³G'\u008d\u007fç\u0096 9à0\u0006É\u008aú\u0012T\u0017d\u0000â:A\u001c\u008fññ\u001e¡Ãc]Îº\u0099[O+Ä ÝqQhòc [jº@\u001ch";
                     int var5 = "\fÔ§\"v¤\u0016Ï\u0018\u009dM³G'\u008d\u007fç\u0096 9à0\u0006É\u008aú\u0012T\u0017d\u0000â:A\u001c\u008fññ\u001e¡Ãc]Îº\u0099[O+Ä ÝqQhòc [jº@\u001ch"
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
                                    eb = var6;
                                    fb = new Integer[10];
                                    x = new ImageIcon(com.Z.T.class.getResource(b(-20691, 21147)));
                                    h9 = new ImageIcon(com.Z.T.class.getResource(b(-20723, -11047)));
                                    f = new ImageIcon(com.Z.T.class.getResource(b(-20716, -13224)));
                                    G = new ImageIcon(com.Z.T.class.getResource(b(-20711, 23708)));
                                    C = new ImageIcon(com.Z.T.class.getResource(b(-20702, -8319)));
                                    P = new ImageIcon(com.Z.T.class.getResource(b(-20733, 3779)));
                                    Y = new ImageIcon(com.Z.T.class.getResource(b(-20689, 27431)));
                                    o = new ImageIcon(com.Z.T.class.getResource(b(-20722, -23357)));
                                    w = new ImageIcon(com.Z.T.class.getResource(b(-20727, -25626)));
                                    V = new ImageIcon(com.Z.T.class.getResource(b(-20719, -31215)));
                                    b = new ImageIcon(com.Z.T.class.getResource(b(-20730, -15753)));
                                    hk = new ImageIcon(com.Z.T.class.getResource(b(-20713, -28234)));
                                    r = new ImageIcon(com.Z.T.class.getResource(b(-20696, 24668)));
                                    hw = new ImageIcon(com.Z.T.class.getResource(b(-20709, -11145)));
                                    j = new ImageIcon(com.Z.T.class.getResource(b(-20694, 4000)));
                                    X = new MK();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u008d½p\\¡¤\u0097R\u0083Ì|!ºo|\u0098";
                                 var5 = "\u008d½p\\¡¤\u0097R\u0083Ì|!ºo|\u0098".length();
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

                  var10 = "Û²\u0012¸¨¡\u0010´ì6(k%\u009aA\u00126ýo§\u0090";
                  var12 = "Û²\u0012¸¨¡\u0010´ì6(k%\u009aA\u00126ýo§\u0090".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 127;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   public static void O(String var0) {
      F = var0;
   }

   public static String v$String() {
      return F;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -20729) & 65535;
      if (db[var2] == null) {
         char[] var3 = cb[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 15;
               break;
            case 1:
               var10000 = 114;
               break;
            case 2:
               var10000 = 81;
               break;
            case 3:
               var10000 = 241;
               break;
            case 4:
               var10000 = 203;
               break;
            case 5:
               var10000 = 215;
               break;
            case 6:
               var10000 = 118;
               break;
            case 7:
               var10000 = 94;
               break;
            case 8:
               var10000 = 178;
               break;
            case 9:
               var10000 = 93;
               break;
            case 10:
               var10000 = 233;
               break;
            case 11:
               var10000 = 245;
               break;
            case 12:
               var10000 = 185;
               break;
            case 13:
               var10000 = 230;
               break;
            case 14:
               var10000 = 137;
               break;
            case 15:
               var10000 = 221;
               break;
            case 16:
               var10000 = 103;
               break;
            case 17:
               var10000 = 207;
               break;
            case 18:
               var10000 = 240;
               break;
            case 19:
               var10000 = 121;
               break;
            case 20:
               var10000 = 84;
               break;
            case 21:
               var10000 = 217;
               break;
            case 22:
               var10000 = 25;
               break;
            case 23:
               var10000 = 28;
               break;
            case 24:
               var10000 = 119;
               break;
            case 25:
               var10000 = 160;
               break;
            case 26:
               var10000 = 80;
               break;
            case 27:
               var10000 = 197;
               break;
            case 28:
               var10000 = 237;
               break;
            case 29:
               var10000 = 220;
               break;
            case 30:
               var10000 = 45;
               break;
            case 31:
               var10000 = 236;
               break;
            case 32:
               var10000 = 55;
               break;
            case 33:
               var10000 = 12;
               break;
            case 34:
               var10000 = 225;
               break;
            case 35:
               var10000 = 175;
               break;
            case 36:
               var10000 = 132;
               break;
            case 37:
               var10000 = 100;
               break;
            case 38:
               var10000 = 239;
               break;
            case 39:
               var10000 = 210;
               break;
            case 40:
               var10000 = 61;
               break;
            case 41:
               var10000 = 72;
               break;
            case 42:
               var10000 = 26;
               break;
            case 43:
               var10000 = 98;
               break;
            case 44:
               var10000 = 67;
               break;
            case 45:
               var10000 = 251;
               break;
            case 46:
               var10000 = 152;
               break;
            case 47:
               var10000 = 110;
               break;
            case 48:
               var10000 = 166;
               break;
            case 49:
               var10000 = 50;
               break;
            case 50:
               var10000 = 227;
               break;
            case 51:
               var10000 = 200;
               break;
            case 52:
               var10000 = 201;
               break;
            case 53:
               var10000 = 73;
               break;
            case 54:
               var10000 = 102;
               break;
            case 55:
               var10000 = 194;
               break;
            case 56:
               var10000 = 20;
               break;
            case 57:
               var10000 = 49;
               break;
            case 58:
               var10000 = 135;
               break;
            case 59:
               var10000 = 87;
               break;
            case 60:
               var10000 = 54;
               break;
            case 61:
               var10000 = 183;
               break;
            case 62:
               var10000 = 105;
               break;
            case 63:
               var10000 = 232;
               break;
            case 64:
               var10000 = 149;
               break;
            case 65:
               var10000 = 115;
               break;
            case 66:
               var10000 = 235;
               break;
            case 67:
               var10000 = 253;
               break;
            case 68:
               var10000 = 130;
               break;
            case 69:
               var10000 = 19;
               break;
            case 70:
               var10000 = 17;
               break;
            case 71:
               var10000 = 214;
               break;
            case 72:
               var10000 = 75;
               break;
            case 73:
               var10000 = 146;
               break;
            case 74:
               var10000 = 120;
               break;
            case 75:
               var10000 = 153;
               break;
            case 76:
               var10000 = 1;
               break;
            case 77:
               var10000 = 228;
               break;
            case 78:
               var10000 = 199;
               break;
            case 79:
               var10000 = 44;
               break;
            case 80:
               var10000 = 173;
               break;
            case 81:
               var10000 = 111;
               break;
            case 82:
               var10000 = 99;
               break;
            case 83:
               var10000 = 116;
               break;
            case 84:
               var10000 = 138;
               break;
            case 85:
               var10000 = 202;
               break;
            case 86:
               var10000 = 112;
               break;
            case 87:
               var10000 = 171;
               break;
            case 88:
               var10000 = 91;
               break;
            case 89:
               var10000 = 78;
               break;
            case 90:
               var10000 = 62;
               break;
            case 91:
               var10000 = 69;
               break;
            case 92:
               var10000 = 68;
               break;
            case 93:
               var10000 = 131;
               break;
            case 94:
               var10000 = 180;
               break;
            case 95:
               var10000 = 16;
               break;
            case 96:
               var10000 = 122;
               break;
            case 97:
               var10000 = 187;
               break;
            case 98:
               var10000 = 243;
               break;
            case 99:
               var10000 = 219;
               break;
            case 100:
               var10000 = 0;
               break;
            case 101:
               var10000 = 33;
               break;
            case 102:
               var10000 = 204;
               break;
            case 103:
               var10000 = 65;
               break;
            case 104:
               var10000 = 64;
               break;
            case 105:
               var10000 = 209;
               break;
            case 106:
               var10000 = 195;
               break;
            case 107:
               var10000 = 3;
               break;
            case 108:
               var10000 = 128;
               break;
            case 109:
               var10000 = 21;
               break;
            case 110:
               var10000 = 24;
               break;
            case 111:
               var10000 = 11;
               break;
            case 112:
               var10000 = 89;
               break;
            case 113:
               var10000 = 32;
               break;
            case 114:
               var10000 = 133;
               break;
            case 115:
               var10000 = 22;
               break;
            case 116:
               var10000 = 86;
               break;
            case 117:
               var10000 = 165;
               break;
            case 118:
               var10000 = 223;
               break;
            case 119:
               var10000 = 226;
               break;
            case 120:
               var10000 = 139;
               break;
            case 121:
               var10000 = 82;
               break;
            case 122:
               var10000 = 179;
               break;
            case 123:
               var10000 = 5;
               break;
            case 124:
               var10000 = 172;
               break;
            case 125:
               var10000 = 193;
               break;
            case 126:
               var10000 = 157;
               break;
            case 127:
               var10000 = 184;
               break;
            case 128:
               var10000 = 56;
               break;
            case 129:
               var10000 = 248;
               break;
            case 130:
               var10000 = 191;
               break;
            case 131:
               var10000 = 169;
               break;
            case 132:
               var10000 = 148;
               break;
            case 133:
               var10000 = 190;
               break;
            case 134:
               var10000 = 13;
               break;
            case 135:
               var10000 = 51;
               break;
            case 136:
               var10000 = 104;
               break;
            case 137:
               var10000 = 188;
               break;
            case 138:
               var10000 = 108;
               break;
            case 139:
               var10000 = 229;
               break;
            case 140:
               var10000 = 53;
               break;
            case 141:
               var10000 = 156;
               break;
            case 142:
               var10000 = 36;
               break;
            case 143:
               var10000 = 127;
               break;
            case 144:
               var10000 = 126;
               break;
            case 145:
               var10000 = 129;
               break;
            case 146:
               var10000 = 213;
               break;
            case 147:
               var10000 = 95;
               break;
            case 148:
               var10000 = 181;
               break;
            case 149:
               var10000 = 244;
               break;
            case 150:
               var10000 = 167;
               break;
            case 151:
               var10000 = 198;
               break;
            case 152:
               var10000 = 174;
               break;
            case 153:
               var10000 = 189;
               break;
            case 154:
               var10000 = 125;
               break;
            case 155:
               var10000 = 37;
               break;
            case 156:
               var10000 = 40;
               break;
            case 157:
               var10000 = 250;
               break;
            case 158:
               var10000 = 85;
               break;
            case 159:
               var10000 = 109;
               break;
            case 160:
               var10000 = 211;
               break;
            case 161:
               var10000 = 76;
               break;
            case 162:
               var10000 = 92;
               break;
            case 163:
               var10000 = 136;
               break;
            case 164:
               var10000 = 48;
               break;
            case 165:
               var10000 = 52;
               break;
            case 166:
               var10000 = 79;
               break;
            case 167:
               var10000 = 212;
               break;
            case 168:
               var10000 = 90;
               break;
            case 169:
               var10000 = 205;
               break;
            case 170:
               var10000 = 70;
               break;
            case 171:
               var10000 = 83;
               break;
            case 172:
               var10000 = 63;
               break;
            case 173:
               var10000 = 96;
               break;
            case 174:
               var10000 = 2;
               break;
            case 175:
               var10000 = 144;
               break;
            case 176:
               var10000 = 30;
               break;
            case 177:
               var10000 = 42;
               break;
            case 178:
               var10000 = 158;
               break;
            case 179:
               var10000 = 59;
               break;
            case 180:
               var10000 = 224;
               break;
            case 181:
               var10000 = 147;
               break;
            case 182:
               var10000 = 142;
               break;
            case 183:
               var10000 = 208;
               break;
            case 184:
               var10000 = 176;
               break;
            case 185:
               var10000 = 249;
               break;
            case 186:
               var10000 = 101;
               break;
            case 187:
               var10000 = 39;
               break;
            case 188:
               var10000 = 238;
               break;
            case 189:
               var10000 = 145;
               break;
            case 190:
               var10000 = 162;
               break;
            case 191:
               var10000 = 66;
               break;
            case 192:
               var10000 = 143;
               break;
            case 193:
               var10000 = 150;
               break;
            case 194:
               var10000 = 8;
               break;
            case 195:
               var10000 = 7;
               break;
            case 196:
               var10000 = 74;
               break;
            case 197:
               var10000 = 252;
               break;
            case 198:
               var10000 = 218;
               break;
            case 199:
               var10000 = 27;
               break;
            case 200:
               var10000 = 155;
               break;
            case 201:
               var10000 = 57;
               break;
            case 202:
               var10000 = 41;
               break;
            case 203:
               var10000 = 88;
               break;
            case 204:
               var10000 = 113;
               break;
            case 205:
               var10000 = 106;
               break;
            case 206:
               var10000 = 231;
               break;
            case 207:
               var10000 = 182;
               break;
            case 208:
               var10000 = 124;
               break;
            case 209:
               var10000 = 161;
               break;
            case 210:
               var10000 = 29;
               break;
            case 211:
               var10000 = 60;
               break;
            case 212:
               var10000 = 47;
               break;
            case 213:
               var10000 = 246;
               break;
            case 214:
               var10000 = 168;
               break;
            case 215:
               var10000 = 164;
               break;
            case 216:
               var10000 = 134;
               break;
            case 217:
               var10000 = 97;
               break;
            case 218:
               var10000 = 163;
               break;
            case 219:
               var10000 = 192;
               break;
            case 220:
               var10000 = 23;
               break;
            case 221:
               var10000 = 35;
               break;
            case 222:
               var10000 = 170;
               break;
            case 223:
               var10000 = 38;
               break;
            case 224:
               var10000 = 107;
               break;
            case 225:
               var10000 = 46;
               break;
            case 226:
               var10000 = 18;
               break;
            case 227:
               var10000 = 206;
               break;
            case 228:
               var10000 = 141;
               break;
            case 229:
               var10000 = 159;
               break;
            case 230:
               var10000 = 6;
               break;
            case 231:
               var10000 = 71;
               break;
            case 232:
               var10000 = 31;
               break;
            case 233:
               var10000 = 247;
               break;
            case 234:
               var10000 = 4;
               break;
            case 235:
               var10000 = 154;
               break;
            case 236:
               var10000 = 10;
               break;
            case 237:
               var10000 = 58;
               break;
            case 238:
               var10000 = 43;
               break;
            case 239:
               var10000 = 234;
               break;
            case 240:
               var10000 = 14;
               break;
            case 241:
               var10000 = 254;
               break;
            case 242:
               var10000 = 177;
               break;
            case 243:
               var10000 = 140;
               break;
            case 244:
               var10000 = 242;
               break;
            case 245:
               var10000 = 77;
               break;
            case 246:
               var10000 = 216;
               break;
            case 247:
               var10000 = 123;
               break;
            case 248:
               var10000 = 255;
               break;
            case 249:
               var10000 = 117;
               break;
            case 250:
               var10000 = 186;
               break;
            case 251:
               var10000 = 9;
               break;
            case 252:
               var10000 = 222;
               break;
            case 253:
               var10000 = 151;
               break;
            case 254:
               var10000 = 34;
               break;
            default:
               var10000 = 196;
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

         db[var2] = new String(var3).intern();
      }

      return db[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22480;
      if (fb[var3] == null) {
         fb[var3] = (int)(eb[var3] ^ var1);
      }

      return fb[var3];
   }
}





