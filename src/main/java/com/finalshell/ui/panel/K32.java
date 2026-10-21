package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Au2;
import com.finalshell.core.Cl4_2;
import com.finalshell.core.E_2;
import com.finalshell.core.Eh2;
import com.finalshell.core.GO;
import com.finalshell.core.I22;
import com.finalshell.core.IB;
import com.finalshell.core.KD;
import com.finalshell.core.Ld4;
import com.finalshell.core.Pv2;
import com.finalshell.core.W2_3;
import com.finalshell.core.WC_2;
import com.finalshell.core.Xg2;
import com.finalshell.core.Xk4;
import com.finalshell.core.YA_2;
import com.finalshell.ui.listener.C_J;
import com.finalshell.ui.listener.LP3;
import com.finalshell.ui.listener.R92;
import com.finalshell.ui.listener.RQ;
import com.finalshell.ui.listener.Tn2;
import com.finalshell.ui.listener.X72;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class K32 extends Ky4 implements SwingConstants, W2_3, Au2, Eh2 {
   public boolean Q;
   public ImageIcon U;
   public ImageIcon v;
   public Insets x;
   public boolean G;
   public boolean S;
   public int E;
   public int r;
   public Insets t;
   public List P;
   public ImageIcon X;
   public ImageIcon R;
   public ImageIcon s;
   public ImageIcon i;
   public E_2 h;
   public boolean C;
   public float k;
   public float H;
   public WC_2 p;
   public boolean K;
   public Ky4 j;
   public Component M;
   public KD g;
   public Ky4 Z;
   public Component Y;
   public static int[] A;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public K32() {
      this("");
   }

   public K32(String var1) {
      this(null, var1);
   }

   public K32(ImageIcon var1, String var2) {
      this(var1, var2, null);
   }

   public K32(String var1, Component var2) {
      this(null, var1, var2);
   }

   public K32(Icon var1, String var2, Component var3) {
   super();
      int[] var10000 = L$arrint();
      this.Q = YA_2.K;
      this.U = YA_2.C;
      int[] var4 = var10000;
      this.v = YA_2.h;
      this.x = YA_2.W;
      this.G = YA_2.o;
      this.S = YA_2.x;
      this.E = YA_2.i;
      this.r = YA_2.w;
      this.t = YA_2.V;
      this.P = new ArrayList(1);
      this.X = null;
      this.R = null;
      this.s = null;
      this.i = null;
      this.h = null;
      this.C = true;
      this.k = 1.0F;
      this.H = 0.1F;
      this.p = null;
      this.K = false;
      this.Y = null;
      this.Y = var3;
      this.setFocusable(true);
      this.i(true);
      this.T(false);
      this.u(false);
      this.Y(GO.Fx);
      this.setLayout(new BorderLayout(0, 0));
      this.j = new Ky4();
      this.j.setOpaque(true);
      this.j.T(false);
      this.j.D$ky_4(0);
      this.j.setLayout(new BorderLayout());
      this.j.addMouseListener(new Tn2(this));
      this.j.addKeyListener(new RQ(this));
      this.c();
      this.K(var1, var2);
      this.J();
      this.g = new KD(this.v);
      this.g.G(true);
      this.g.setFocusable(false);
      this.g.t(false);
      this.g.addActionListener(new X72(this));
      this.r();
      this.L$void();
      this.z();
      this.Z = new KI3(this);
      this.Z.setOpaque(false);
      this.Z.setLayout(new BorderLayout(0, 0));
      this.Z.b(this.t);
      this.add(this.Z, b(-74, 11445));
      K32 var5 = this;
      if (var4 != null) {
         if (this.Y != null) {
            this.Z.add(this.Y, b(-73, -20720));
         }

         var5 = this;
      }

      var5.addPropertyChangeListener(b(-79, -1081), new LP3(this));
      if (var4 == null) {
         Ky4.K(new String[2]);
      }
   }

   public void o() {
      int[] var1 = L$arrint();
      boolean var10000 = this.isShowing();
      if (var1 != null) {
         if (!var10000) {
            return;
         }

         var10000 = this.isEnabled();
      }

      label35: {
         if (var1 != null) {
            if (!var10000) {
               return;
            }

            var2 = this;
            if (var1 == null) {
               break label35;
            }

            var10000 = this.isFocusable();
         }

         if (var10000) {
            this.requestFocusInWindow();
            if (var1 != null) {
               return;
            }
         }

         var2 = this;
      }

      var2.transferFocus();
   }

   public void D$void() {
      this.K(this.u$Icon(), this.Q());
   }

   public void K(Icon var1, String var2) {
      Object var4;
      label25: {
         int[] var3 = L$arrint();
         var4 = this;
         if (var3 != null) {
            if (this.K) {
               return;
            }

            var4 = this;
            if (var3 == null) {
               break label25;
            }

            var4 = this.M;
         }

         if (var4 != null) {
            this.j.remove(this.M);
         }

         this.M = this.C(var1, var2);
         var4 = this.j;
      }

      ((Ky4)var4).add(this.M, b(-73, -20720));
   }

   public void J() {
      int[] var1 = L$arrint();
      K32 var10000 = this;
      if (var1 != null) {
         if (this.M == null) {
            return;
         }

         var10000 = this;
      }

      if (var1 != null) {
         if (var10000.K) {
            return;
         }

         var10000 = this;
      }

      label53: {
         label67: {
            if (var1 != null) {
               if (var10000.u$Icon() != null) {
                  break label67;
               }

               var10000 = this;
            }

            int var3 = var10000.r;
            byte var10001 = 2;
            if (var1 != null) {
               if (var10000.r != 2) {
                  break label67;
               }

               var3 = this.r;
               var10001 = 4;
            }

            if (var3 != var10001) {
               var4 = new Insets(2, 4, 2, 2);
               break label53;
            }
         }

         var4 = new Insets(2, 2, 2, 2);
      }

      Insets var2;
      label39: {
         label38: {
            var2 = var4;
            int var5 = this.r;
            byte var7 = 2;
            if (var1 != null) {
               if (this.r == 2) {
                  var2 = new Insets(var2.right, var2.top, var2.left, var2.bottom);
                  if (var1 != null) {
                     break label38;
                  }
               }

               var6 = this;
               if (var1 == null) {
                  break label39;
               }

               var5 = this.r;
               var7 = 4;
            }

            if (var5 == var7) {
               var2 = new Insets(var2.left, var2.bottom, var2.right, var2.top);
            }
         }

         var6 = this.M;
      }

      ((O)var6).S(var2);
   }

   public void c() {
      K32 var3;
      label43: {
         label45: {
            int[] var10000 = L$arrint();
            this.v();
            int[] var1 = var10000;
            int var2 = this.r;
            byte var10001 = 1;
            if (var1 != null) {
               if (this.r == 1) {
                  this.add(this.j, b(-76, -4305));
                  if (var1 != null) {
                     break label45;
                  }
               }

               var2 = this.r;
               var10001 = 3;
            }

            if (var1 != null) {
               if (var2 == var10001) {
                  this.add(this.j, b(-69, 25372));
                  if (var1 != null) {
                     break label45;
                  }
               }

               var2 = this.r;
               var10001 = 2;
            }

            if (var1 != null) {
               if (var2 == var10001) {
                  this.add(this.j, b(-70, 21403));
                  if (var1 != null) {
                     break label45;
                  }
               }

               var3 = this;
               if (var1 == null) {
                  break label43;
               }

               var2 = this.r;
               var10001 = 4;
            }

            if (var2 == var10001) {
               this.add(this.j, b(-67, -14514));
            }
         }

         var3 = this;
      }

      var3.revalidate();
   }

   public void v() {
      int[] var1;
      int var10001;
      label79: {
         label82: {
            var1 = L$arrint();
            var10001 = (this.C) ? 1 : 0;
            if (var1 != null) {
               if (!this.C) {
                  break label82;
               }

               var10001 = this.r;
            }

            if (var1 == null) {
               break label79;
            }

            if (var10001 == 3) {
               var10001 = 1;
               break label79;
            }
         }

         var10001 = 0;
      }

      int var10002;
      label68: {
         label83: {
            var10002 = (this.C) ? 1 : 0;
            if (var1 != null) {
               if (!this.C) {
                  break label83;
               }

               var10002 = this.r;
            }

            if (var1 == null) {
               break label68;
            }

            if (var10002 == 4) {
               var10002 = 1;
               break label68;
            }
         }

         var10002 = 0;
      }

      int var10003;
      label57: {
         label84: {
            var10003 = (this.C) ? 1 : 0;
            if (var1 != null) {
               if (!this.C) {
                  break label84;
               }

               var10003 = this.r;
            }

            if (var1 == null) {
               break label57;
            }

            if (var10003 == 1) {
               var10003 = 1;
               break label57;
            }
         }

         var10003 = 0;
      }

      int var10004;
      label46: {
         label85: {
            var10004 = (this.C) ? 1 : 0;
            if (var1 != null) {
               if (!this.C) {
                  break label85;
               }

               var10004 = this.r;
            }

            if (var1 == null) {
               break label46;
            }

            if (var10004 == 2) {
               var10004 = 1;
               break label46;
            }
         }

         var10004 = 0;
      }

      this.j.I((boolean)var10001, (boolean)((((var10002 != 0) != 0) != 0) != 0), (boolean)(var10003 != 0), (boolean)((var10004 != 0) != 0));
   }

   public void z() {
      Object var4;
      label69: {
         label68: {
            int[] var1 = L$arrint();
            var4 = this;
            if (var1 != null) {
               if (this.S) {
                  byte var10001;
                  label63: {
                     label72: {
                        var4 = this;
                        if (var1 != null) {
                           if (this.r != 1) {
                              var3 = this.r;
                              var10001 = 3;
                              if (var1 == null) {
                                 break label63;
                              }

                              if (this.r != 3) {
                                 break label72;
                              }
                           }

                           var4 = this.j;
                        }

                        ((Ky4)var4).add(this.g, this.E == 4 ? b(-80, -11735) : b(-72, 13545));
                        if (var1 != null) {
                           break label68;
                        }
                     }

                     var3 = this.r;
                     var10001 = 2;
                  }

                  if (var1 != null) {
                     if (var3 == var10001) {
                        this.j.add(this.g, this.E == 4 ? b(-68, -21518) : b(-78, -23822));
                        if (var1 != null) {
                           break label68;
                        }
                     }

                     var4 = this;
                     if (var1 == null) {
                        break label69;
                     }

                     var3 = this.r;
                     var10001 = 4;
                  }

                  if (var3 != var10001) {
                     break label68;
                  }

                  this.j.add(this.g, this.E == 4 ? b(-71, 4570) : b(-77, 17959));
                  if (var1 != null) {
                     break label68;
                  }
               }

               var4 = this.j;
            }

            ((Ky4)var4).remove(this.g);
         }

         var4 = this.j;
      }

      ((Ky4)var4).revalidate();
   }

   public void L$void() {
      this.g.setMargin(this.x);
   }

   public JComponent C(Icon var1, String var2) {
      Object var4;
      label23: {
         int[] var3 = L$arrint();
         int var10000 = this.r;
         byte var10001 = 2;
         if (var3 != null) {
            if (this.r == 2) {
               var4 = new O6(var2, var1, a(6164, 4125383535685872407L), false);
               if (var3 != null) {
                  break label23;
               }
            }

            var10000 = this.r;
            var10001 = 4;
         }

         if (var10000 == var10001) {
            var4 = new O6(var2, var1, a(7403, 4557693452061224937L), true);
            if (var3 != null) {
               break label23;
            }
         }

         var4 = new O(var2, var1, a(7403, 4557693452061224937L), new Object[0]);
      }

      ((O)var4).D(true);
      return (JComponent)var4;
   }

   public E_2 y$E() {
      return this.h;
   }

   public void B(E_2 var1) {
      this.h = var1;
   }

   public boolean W() {
      int[] var1 = L$arrint();
      Object var10000 = this.h;
      if (var1 != null) {
         if (this.h == null) {
            return true;
         }

         var10000 = this.h.J();
      }

      boolean var2 = (Boolean)var10000;
      return var1 == null ? var2 : var2;
   }

   public boolean K$boolean() {
      int[] var1 = L$arrint();
      WC_2 var10000 = this.p;
      if (var1 != null) {
         if (this.p == null) {
            return false;
         }

         var10000 = this.p;
      }

      boolean var2 = var10000.i();
      return var1 == null ? var2 : var2;
   }

   public boolean q$boolean() {
      return this.W(this.Q);
   }

   public boolean W(boolean var1) {
      int[] var2 = L$arrint();
      boolean var10001 = this.Y$boolean();
      if (var2 != null) {
         var10001 = !var10001;
      }

      return this.x(var10001, var1);
   }

   public boolean Y$boolean() {
      return this.C;
   }

   public boolean u(boolean var1) {
      int[] var2 = L$arrint();
      boolean var10002 = this.isShowing();
      if (var2 != null) {
         if (!var10002) {
            return this.x(var1, false);
         }

         var10002 = this.Q;
      }

      if (var2 == null) {
         return this.x(var1, var10002);
      } else {
         return var10002 ? this.x(var1, true) : this.x(var1, false);
      }
   }

   public boolean x(boolean var1, boolean var2) {
      int[] var3 = L$arrint();
      boolean var10000 = this.isEnabled();
      if (var3 != null) {
         if (var10000) {
            var10000 = var1;
            if (var3 != null) {
               if (var1) {
                  return this.e(var2);
               }

               var10000 = this.n(var2);
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   public boolean X() {
      return this.n(this.Q);
   }

   public boolean n(boolean var1) {
      int[] var2 = L$arrint();
      boolean var10000 = this.C;
      if (var2 != null) {
         label25:
         if (this.C) {
            label40: {
               label49: {
                  var10000 = this.W();
                  if (var2 != null) {
                     if (!var10000) {
                        break label25;
                     }

                     this.n();
                     this.C = false;
                     this.r();
                     this.f();
                     if (var2 == null) {
                        break label49;
                     }

                     var10000 = var1;
                  }

                  if (var10000) {
                     var4 = this;
                     if (var2 == null) {
                        break label40;
                     }

                     if (this.isShowing()) {
                        this.p = new WC_2(b(-75, -30534), GO.L, new C_J(this));
                        this.p.u$WC();
                        if (var2 != null) {
                           return true;
                        }
                     }
                  }

                  this.k = 0.0F;
               }

               var4 = this;
            }

            var4.u$void();
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public void u$void() {
      int[] var10000 = L$arrint();
      this.v();
      int[] var1 = var10000;
      K32 var2 = this;
      if (var1 != null) {
         if (this.Y != null) {
            this.Y.setVisible(false);
         }

         this.revalidate();
         this.repaint();
         var2 = this;
      }

      var2.G$void();
   }

   public boolean l() {
      return this.e(this.Q);
   }

   public boolean e(boolean var1) {
      int[] var2 = L$arrint();
      boolean var10000 = this.C;
      if (var2 != null) {
         label43:
         if (!this.C) {
            label57: {
               Object var3 = this;
               if (var2 != null) {
                  if (!this.W()) {
                     break label43;
                  }

                  this.n();
                  this.C = true;
                  this.r();
                  var4 = this;
                  if (var2 == null) {
                     break label57;
                  }

                  var3 = this.Y;
               }

               if (var3 != null) {
                  this.Y.setVisible(true);
               }

               this.v();
               var4 = this;
            }

            label35: {
               var4.P();
               if (var2 != null) {
                  if (var1) {
                     var5 = this;
                     if (var2 == null) {
                        break label35;
                     }

                     if (this.isShowing()) {
                        this.p = new WC_2(b(-65, -11696), GO.L, new R92(this));
                        this.p.u$WC();
                        if (var2 != null) {
                           return true;
                        }
                     }
                  }

                  this.k = 1.0F;
               }

               var5 = this;
            }

            var5.K$void();
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public void K$void() {
      this.revalidate();
      this.repaint();
      this.Z();
   }

   public void n() {
      int[] var1 = L$arrint();
      WC_2 var10000 = this.p;
      if (var1 != null) {
         if (this.p == null) {
            return;
         }

         var10000 = this.p;
      }

      if (var1 != null && var10000.i()) {
         this.p.Y();
      }
   }

   public int N() {
      return this.r;
   }

   public void D(int var1) {
      this.r = var1;
      this.D$void();
      this.J();
      this.c();
      this.V();
      this.z();
   }

   public Insets h$Insets() {
      return this.t;
   }

   public void j(Insets var1) {
      this.t = var1;
      this.Z.b(var1);
      this.revalidate();
   }

   public void h(int var1, int var2, int var3, int var4) {
      this.j(new Insets(var1, var2, var3, var4));
   }

   public void h(int var1) {
      this.h(var1, var1, var1, var1);
   }

   public boolean O() {
      return this.Q;
   }

   public void l(boolean var1) {
      this.Q = var1;
   }

   public Icon u$Icon() {
      int[] var1 = L$arrint();
      Object var10000 = this;
      if (var1 != null) {
         if (this.K) {
            return null;
         }

         var10000 = this.M;
      }

      return ((O)var10000).getIcon();
   }

   public void C(Icon var1) {
      int[] var2 = L$arrint();
      K32 var10000 = this;
      if (var2 != null) {
         if (this.K) {
            return;
         }

         ((O)this.M).setIcon(var1);
         var10000 = this;
      }

      var10000.J();
   }

   public String Q() {
      int[] var1 = L$arrint();
      Object var10000 = this;
      if (var1 != null) {
         if (this.K) {
            return null;
         }

         var10000 = this.M;
      }

      return ((O)var10000).getText();
   }

   public void u(String var1) {
      int[] var2 = L$arrint();
      Object var10000 = this;
      if (var2 != null) {
         if (this.K) {
            return;
         }

         var10000 = this.M;
      }

      ((O)var10000).setText(var1);
   }

   public void b(int var1) {
      int[] var2 = L$arrint();
      Object var10000 = this;
      if (var2 != null) {
         if (this.K) {
            return;
         }

         var10000 = this.M;
      }

      ((O)var10000).setHorizontalAlignment(var1);
   }

   public ImageIcon D$ImageIcon() {
      return this.v;
   }

   public void I(ImageIcon var1) {
      this.v = var1;
      this.t$void();
      this.r();
   }

   public ImageIcon i$ImageIcon() {
      return this.U;
   }

   public void x(ImageIcon var1) {
      this.U = var1;
      this.A$void();
      this.r();
   }

   public Insets G$Insets() {
      return this.x;
   }

   public void h(Insets var1) {
      this.x = var1;
      this.L$void();
   }

   public boolean A$boolean() {
      return this.G;
   }

   public void q(boolean var1) {
      this.G = var1;
      this.V();
   }

   public boolean B() {
      return this.S;
   }

   public void S(boolean var1) {
      this.S = var1;
      this.z();
   }

   public int U() {
      return this.E;
   }

   public void g(int var1) {
      this.E = var1;
      this.z();
   }

   public void V() {
      this.t$void();
      this.A$void();
      this.r();
   }

   public void r() {
      int[] var1 = L$arrint();
      K32 var10000 = this;
      if (var1 != null) {
         if (this.C) {
            this.g.setIcon(this.y$ImageIcon());
            this.g.setDisabledIcon(this.E());
            if (var1 != null) {
               return;
            }
         }

         this.g.setIcon(this.a());
         var10000 = this;
      }

      var10000.g.setDisabledIcon(this.h$ImageIcon());
   }

   public void t$void() {
      this.s = null;
      this.i = null;
   }

   public ImageIcon y$ImageIcon() {
      int[] var1 = L$arrint();
      ImageIcon var10000 = this.s;
      if (var1 != null) {
         label53: {
            label52:
            if (this.s == null) {
               byte var10001;
               label50: {
                  label49: {
                     var2 = this;
                     label48:
                     if (var1 != null) {
                        if (this.G) {
                           var2 = this;
                           if (var1 == null) {
                              break label48;
                           }

                           if (this.r != 1) {
                              var3 = this.r;
                              var10001 = 3;
                              if (var1 == null) {
                                 break label50;
                              }

                              if (this.r != 3) {
                                 break label49;
                              }
                           }
                        }

                        var2 = this;
                     }

                     var2.s = new Xk4(this.v);
                     if (var1 != null) {
                        break label52;
                     }
                  }

                  var3 = this.r;
                  var10001 = 2;
               }

               if (var1 != null) {
                  if (var3 == var10001) {
                     this.s = Xg2.h(this.v);
                     if (var1 != null) {
                        break label52;
                     }
                  }

                  var4 = this;
                  if (var1 == null) {
                     break label53;
                  }

                  var3 = this.r;
                  var10001 = 4;
               }

               if (var3 == var10001) {
                  this.s = Xg2.U(this.v);
               }
            }

            var4 = this;
         }

         var10000 = var4.s;
      }

      return var10000;
   }

   public ImageIcon E() {
      int[] var1 = L$arrint();
      ImageIcon var10000 = this.i;
      if (var1 != null) {
         if (this.i == null) {
            this.i = Xg2.J(this.y$ImageIcon());
         }

         var10000 = this.i;
      }

      return var10000;
   }

   public void A$void() {
      this.X = null;
      this.R = null;
   }

   public ImageIcon a() {
      int[] var1 = L$arrint();
      ImageIcon var10000 = this.X;
      if (var1 != null) {
         label87: {
            label86:
            if (this.X == null) {
               byte var2;
               label84: {
                  label83: {
                     var2 = (this.getComponentOrientation().isLeftToRight()) ? 1 : 0;
                     var3 = this;
                     label82:
                     if (var1 != null) {
                        if (this.G) {
                           var3 = this;
                           if (var1 == null) {
                              break label82;
                           }

                           if (this.r != 1) {
                              var4 = this.r;
                              if (var1 == null) {
                                 break label84;
                              }

                              if (this.r != 3) {
                                 break label83;
                              }
                           }
                        }

                        var3 = this;
                     }

                     var3.X = this.U;
                     if (var1 != null) {
      Insets var4;
      Insets var4;
                        break label86;
                     }
                  }

                  var4 = var2;
               }

               label67: {
                  label66: {
                     label92: {
                        if (var1 != null) {
                           if (var4 != 0) {
                              var4 = this.r;
                              if (var1 == null) {
                                 break label67;
                              }

                              if (this.r != 2) {
                                 break label66;
                              }
                              break label92;
                           }

                           var4 = this.r;
                        }

                        if (var1 == null) {
                           break label67;
                        }

                        if (var4 != 4) {
                           break label66;
                        }
                     }

                     this.X = Xg2.h(this.U);
                     if (var1 != null) {
                        break label86;
                     }
                  }

                  var4 = var2;
               }

               label49: {
                  if (var1 != null) {
                     if (var4 != 0) {
                        var5 = this;
                        if (var1 == null) {
                           break label87;
                        }

                        if (this.r != 4) {
                           break label86;
                        }
                        break label49;
                     }

                     var5 = this;
                     if (var1 == null) {
                        break label87;
                     }

                     var4 = this.r;
                  }

                  if (var4 != 2) {
                     break label86;
                  }
               }

               this.X = Xg2.U(this.U);
            }

            var5 = this;
         }

         var10000 = var5.X;
      }

      return var10000;
   }

   public ImageIcon h$ImageIcon() {
      int[] var1 = L$arrint();
      ImageIcon var10000 = this.R;
      if (var1 != null) {
         if (this.R == null) {
            this.R = Xg2.J(this.a());
         }

         var10000 = this.R;
      }

      return var10000;
   }

   public Ky4 g() {
      return this.j;
   }

   public KD m$KD() {
      return this.g;
   }

   public Component t$Component() {
      return this.M;
   }

   public void u(Component var1) {
      int[] var2 = L$arrint();
      Component var10000 = this.M;
      if (var2 != null) {
         if (this.M != null) {
            this.j.remove(this.M);
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         this.j.add(var1, b(-73, -20720));
      }

      this.M = var1;
      this.K = true;
   }

   public Component F() {
      return this.Y;
   }

   public void V(Component var1) {
      int[] var2 = L$arrint();
      Component var10000 = this.Y;
      if (var2 != null) {
         if (this.Y != null) {
            this.Z.remove(this.Y);
         }

         this.Y = var1;
         var10000 = var1;
      }

      float var3;
      int var10001 = (var3 = this.k - 0.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var10001 = var10001 > 0 ? 1 : 0;
      }

      var10000.setVisible((boolean)var10001);
      this.Z.add(var1, b(-73, -20720));
      this.revalidate();
   }

   public List Y$List() {
      return AL_2.J((Collection)this.P);
   }

   public void u(List var1) {
      this.P = var1;
   }

   public void m(Pv2 var1) {
      this.P.add(var1);
   }

   public void B(Pv2 var1) {
      this.P.remove(var1);
   }

   public void P() {
      int[] var10000 = L$arrint();
      Iterator var2 = AL_2.J((Collection)this.P).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Pv2 var3 = (Pv2)var2.next();
         var3.q(this);
         if (var1 == null) {
            break;
         }
      }
   }

   public void Z() {
      int[] var10000 = L$arrint();
      Iterator var2 = AL_2.J((Collection)this.P).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Pv2 var3 = (Pv2)var2.next();
         var3.E(this);
         if (var1 == null) {
            break;
         }
      }
   }

   public void f() {
      int[] var10000 = L$arrint();
      Iterator var2 = AL_2.J((Collection)this.P).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Pv2 var3 = (Pv2)var2.next();
         var3.A(this);
         if (var1 == null) {
            break;
         }
      }
   }

   public void G$void() {
      int[] var10000 = L$arrint();
      Iterator var2 = AL_2.J((Collection)this.P).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Pv2 var3 = (Pv2)var2.next();
         var3.D(this);
         if (var1 == null) {
            break;
         }
      }
   }

   public float q$float() {
      return this.k;
   }

   public Dimension u$Dimension() {
      int[] var10000 = L$arrint();
      Dimension var2 = this.getPreferredSize();
      int[] var1 = var10000;
      Object var4 = this;
      if (var1 != null) {
         if (this.Y == null) {
            return var2;
         }

         var4 = this;
      }

      if (var1 != null) {
         if (((K32)var4).k <= 0.0F) {
            return var2;
         }

         var4 = this.Y;
      }

      Dimension var3 = var4.getPreferredSize();
      int var5 = this.r;
      byte var10001 = 1;
      if (var1 != null) {
         if (this.r == 1) {
            return new Dimension(var2.width, var2.height - Math.round((float)var3.height * this.k));
         }

         var5 = this.r;
         var10001 = 3;
      }

      return var5 != var10001
         ? new Dimension(var2.width - Math.round((float)var3.width * this.k), var2.height)
         : new Dimension(var2.width, var2.height - Math.round((float)var3.height * this.k));
   }

   @Override
   public void u(String var1, Object[] var2) {
      I22.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      I22.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      I22.q(this, var1, var2);
   }

   @Override
   public void M() {
      I22.L(this);
   }

   @Override
   public boolean k() {
      return I22.Z(this);
   }

   @Override
   public void M(Ld4 var1) {
      I22.g(this, var1);
   }

   public void i$void() {
      I22.o(this);
   }

   @Override
   public void p(String var1) {
      Cl4_2.c(this, var1);
   }

   @Override
   public void a(String var1, Class var2) {
      Cl4_2.x(this, var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      Cl4_2.e(this, var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      Cl4_2.B(this, var1, var2);
   }

   @Override
   public void I(String var1, String var2, Class var3) {
      Cl4_2.t(this, var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      Cl4_2.a(this, var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      Cl4_2.l(this, var1, var2, var3);
   }

   @Override
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      Cl4_2.X(this, var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      Cl4_2.A(this, var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
      Cl4_2.L(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      Cl4_2.y(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      Cl4_2.a(this, var1);
   }

   @Override
   public void w() {
      Cl4_2.O(this);
   }

   public void m$void() {
      Cl4_2.G(this);
   }

   @Override
   public void e() {
      Cl4_2.H(this);
   }

   public static void x(int[] var0) {
      A = var0;
   }

   public static int[] L$arrint() {
      return A;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -79) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 220;
               break;
            case 1:
               var10000 = 53;
               break;
            case 2:
               var10000 = 74;
               break;
            case 3:
               var10000 = 103;
               break;
            case 4:
               var10000 = 128;
               break;
            case 5:
               var10000 = 183;
               break;
            case 6:
               var10000 = 93;
               break;
            case 7:
               var10000 = 157;
               break;
            case 8:
               var10000 = 12;
               break;
            case 9:
               var10000 = 86;
               break;
            case 10:
               var10000 = 239;
               break;
            case 11:
               var10000 = 79;
               break;
            case 12:
               var10000 = 222;
               break;
            case 13:
               var10000 = 232;
               break;
            case 14:
               var10000 = 197;
               break;
            case 15:
               var10000 = 23;
               break;
            case 16:
               var10000 = 52;
               break;
            case 17:
               var10000 = 3;
               break;
            case 18:
               var10000 = 191;
               break;
            case 19:
               var10000 = 106;
               break;
            case 20:
               var10000 = 78;
               break;
            case 21:
               var10000 = 111;
               break;
            case 22:
               var10000 = 214;
               break;
            case 23:
               var10000 = 38;
               break;
            case 24:
               var10000 = 144;
               break;
            case 25:
               var10000 = 177;
               break;
            case 26:
               var10000 = 168;
               break;
            case 27:
               var10000 = 5;
               break;
            case 28:
               var10000 = 205;
               break;
            case 29:
               var10000 = 66;
               break;
            case 30:
               var10000 = 90;
               break;
            case 31:
               var10000 = 174;
               break;
            case 32:
               var10000 = 238;
               break;
            case 33:
               var10000 = 137;
               break;
            case 34:
               var10000 = 123;
               break;
            case 35:
               var10000 = 24;
               break;
            case 36:
               var10000 = 138;
               break;
            case 37:
               var10000 = 77;
               break;
            case 38:
               var10000 = 17;
               break;
            case 39:
               var10000 = 224;
               break;
            case 40:
               var10000 = 215;
               break;
            case 41:
               var10000 = 30;
               break;
            case 42:
               var10000 = 98;
               break;
            case 43:
               var10000 = 223;
               break;
            case 44:
               var10000 = 198;
               break;
            case 45:
               var10000 = 148;
               break;
            case 46:
               var10000 = 195;
               break;
            case 47:
               var10000 = 110;
               break;
            case 48:
               var10000 = 184;
               break;
            case 49:
               var10000 = 84;
               break;
            case 50:
               var10000 = 217;
               break;
            case 51:
               var10000 = 94;
               break;
            case 52:
               var10000 = 219;
               break;
            case 53:
               var10000 = 176;
               break;
            case 54:
               var10000 = 130;
               break;
            case 55:
               var10000 = 182;
               break;
            case 56:
               var10000 = 201;
               break;
            case 57:
               var10000 = 112;
               break;
            case 58:
               var10000 = 221;
               break;
            case 59:
               var10000 = 251;
               break;
            case 60:
               var10000 = 21;
               break;
            case 61:
               var10000 = 22;
               break;
            case 62:
               var10000 = 48;
               break;
            case 63:
               var10000 = 46;
               break;
            case 64:
               var10000 = 179;
               break;
            case 65:
               var10000 = 107;
               break;
            case 66:
               var10000 = 18;
               break;
            case 67:
               var10000 = 81;
               break;
            case 68:
               var10000 = 229;
               break;
            case 69:
               var10000 = 160;
               break;
            case 70:
               var10000 = 49;
               break;
            case 71:
               var10000 = 247;
               break;
            case 72:
               var10000 = 210;
               break;
            case 73:
               var10000 = 202;
               break;
            case 74:
               var10000 = 11;
               break;
            case 75:
               var10000 = 135;
               break;
            case 76:
               var10000 = 118;
               break;
            case 77:
               var10000 = 213;
               break;
            case 78:
               var10000 = 70;
               break;
            case 79:
               var10000 = 146;
               break;
            case 80:
               var10000 = 101;
               break;
            case 81:
               var10000 = 163;
               break;
            case 82:
               var10000 = 54;
               break;
            case 83:
               var10000 = 88;
               break;
            case 84:
               var10000 = 211;
               break;
            case 85:
               var10000 = 124;
               break;
            case 86:
               var10000 = 243;
               break;
            case 87:
               var10000 = 147;
               break;
            case 88:
               var10000 = 203;
               break;
            case 89:
               var10000 = 141;
               break;
            case 90:
               var10000 = 33;
               break;
            case 91:
               var10000 = 115;
               break;
            case 92:
               var10000 = 234;
               break;
            case 93:
               var10000 = 0;
               break;
            case 94:
               var10000 = 173;
               break;
            case 95:
               var10000 = 248;
               break;
            case 96:
               var10000 = 109;
               break;
            case 97:
               var10000 = 190;
               break;
            case 98:
               var10000 = 83;
               break;
            case 99:
               var10000 = 161;
               break;
            case 100:
               var10000 = 63;
               break;
            case 101:
               var10000 = 108;
               break;
            case 102:
               var10000 = 237;
               break;
            case 103:
               var10000 = 196;
               break;
            case 104:
               var10000 = 172;
               break;
            case 105:
               var10000 = 43;
               break;
            case 106:
               var10000 = 188;
               break;
            case 107:
               var10000 = 113;
               break;
            case 108:
               var10000 = 31;
               break;
            case 109:
               var10000 = 200;
               break;
            case 110:
               var10000 = 175;
               break;
            case 111:
               var10000 = 9;
               break;
            case 112:
               var10000 = 185;
               break;
            case 113:
               var10000 = 7;
               break;
            case 114:
               var10000 = 204;
               break;
            case 115:
               var10000 = 155;
               break;
            case 116:
               var10000 = 25;
               break;
            case 117:
               var10000 = 60;
               break;
            case 118:
               var10000 = 4;
               break;
            case 119:
               var10000 = 37;
               break;
            case 120:
               var10000 = 166;
               break;
            case 121:
               var10000 = 152;
               break;
            case 122:
               var10000 = 119;
               break;
            case 123:
               var10000 = 145;
               break;
            case 124:
               var10000 = 140;
               break;
            case 125:
               var10000 = 206;
               break;
            case 126:
               var10000 = 165;
               break;
            case 127:
               var10000 = 167;
               break;
            case 128:
               var10000 = 139;
               break;
            case 129:
               var10000 = 153;
               break;
            case 130:
               var10000 = 226;
               break;
            case 131:
               var10000 = 2;
               break;
            case 132:
               var10000 = 249;
               break;
            case 133:
               var10000 = 212;
               break;
            case 134:
               var10000 = 126;
               break;
            case 135:
               var10000 = 99;
               break;
            case 136:
               var10000 = 169;
               break;
            case 137:
               var10000 = 45;
               break;
            case 138:
               var10000 = 55;
               break;
            case 139:
               var10000 = 15;
               break;
            case 140:
               var10000 = 57;
               break;
            case 141:
               var10000 = 62;
               break;
            case 142:
               var10000 = 68;
               break;
            case 143:
               var10000 = 250;
               break;
            case 144:
               var10000 = 181;
               break;
            case 145:
               var10000 = 253;
               break;
            case 146:
               var10000 = 171;
               break;
            case 147:
               var10000 = 136;
               break;
            case 148:
               var10000 = 87;
               break;
            case 149:
               var10000 = 233;
               break;
            case 150:
               var10000 = 29;
               break;
            case 151:
               var10000 = 120;
               break;
            case 152:
               var10000 = 129;
               break;
            case 153:
               var10000 = 193;
               break;
            case 154:
               var10000 = 100;
               break;
            case 155:
               var10000 = 19;
               break;
            case 156:
               var10000 = 20;
               break;
            case 157:
               var10000 = 170;
               break;
            case 158:
               var10000 = 132;
               break;
            case 159:
               var10000 = 10;
               break;
            case 160:
               var10000 = 16;
               break;
            case 161:
               var10000 = 199;
               break;
            case 162:
               var10000 = 44;
               break;
            case 163:
               var10000 = 189;
               break;
            case 164:
               var10000 = 133;
               break;
            case 165:
               var10000 = 194;
               break;
            case 166:
               var10000 = 56;
               break;
            case 167:
               var10000 = 14;
               break;
            case 168:
               var10000 = 236;
               break;
            case 169:
               var10000 = 34;
               break;
            case 170:
               var10000 = 89;
               break;
            case 171:
               var10000 = 178;
               break;
            case 172:
               var10000 = 156;
               break;
            case 173:
               var10000 = 41;
               break;
            case 174:
               var10000 = 252;
               break;
            case 175:
               var10000 = 246;
               break;
            case 176:
               var10000 = 235;
               break;
            case 177:
               var10000 = 187;
               break;
            case 178:
               var10000 = 82;
               break;
            case 179:
               var10000 = 104;
               break;
            case 180:
               var10000 = 231;
               break;
            case 181:
               var10000 = 40;
               break;
            case 182:
               var10000 = 134;
               break;
            case 183:
               var10000 = 209;
               break;
            case 184:
               var10000 = 85;
               break;
            case 185:
               var10000 = 228;
               break;
            case 186:
               var10000 = 95;
               break;
            case 187:
               var10000 = 116;
               break;
            case 188:
               var10000 = 225;
               break;
            case 189:
               var10000 = 36;
               break;
            case 190:
               var10000 = 72;
               break;
            case 191:
               var10000 = 6;
               break;
            case 192:
               var10000 = 114;
               break;
            case 193:
               var10000 = 96;
               break;
            case 194:
               var10000 = 143;
               break;
            case 195:
               var10000 = 75;
               break;
            case 196:
               var10000 = 69;
               break;
            case 197:
               var10000 = 186;
               break;
            case 198:
               var10000 = 142;
               break;
            case 199:
               var10000 = 150;
               break;
            case 200:
               var10000 = 42;
               break;
            case 201:
               var10000 = 91;
               break;
            case 202:
               var10000 = 50;
               break;
            case 203:
               var10000 = 131;
               break;
            case 204:
               var10000 = 105;
               break;
            case 205:
               var10000 = 255;
               break;
            case 206:
               var10000 = 122;
               break;
            case 207:
               var10000 = 59;
               break;
            case 208:
               var10000 = 227;
               break;
            case 209:
               var10000 = 67;
               break;
            case 210:
               var10000 = 216;
               break;
            case 211:
               var10000 = 180;
               break;
            case 212:
               var10000 = 102;
               break;
            case 213:
               var10000 = 230;
               break;
            case 214:
               var10000 = 151;
               break;
            case 215:
               var10000 = 65;
               break;
            case 216:
               var10000 = 92;
               break;
            case 217:
               var10000 = 127;
               break;
            case 218:
               var10000 = 162;
               break;
            case 219:
               var10000 = 32;
               break;
            case 220:
               var10000 = 26;
               break;
            case 221:
               var10000 = 27;
               break;
            case 222:
               var10000 = 47;
               break;
            case 223:
               var10000 = 149;
               break;
            case 224:
               var10000 = 76;
               break;
            case 225:
               var10000 = 39;
               break;
            case 226:
               var10000 = 28;
               break;
            case 227:
               var10000 = 125;
               break;
            case 228:
               var10000 = 158;
               break;
            case 229:
               var10000 = 64;
               break;
            case 230:
               var10000 = 71;
               break;
            case 231:
               var10000 = 1;
               break;
            case 232:
               var10000 = 73;
               break;
            case 233:
               var10000 = 242;
               break;
            case 234:
               var10000 = 51;
               break;
            case 235:
               var10000 = 154;
               break;
            case 236:
               var10000 = 159;
               break;
            case 237:
               var10000 = 80;
               break;
            case 238:
               var10000 = 241;
               break;
            case 239:
               var10000 = 8;
               break;
            case 240:
               var10000 = 208;
               break;
            case 241:
               var10000 = 192;
               break;
            case 242:
               var10000 = 244;
               break;
            case 243:
               var10000 = 207;
               break;
            case 244:
               var10000 = 117;
               break;
            case 245:
               var10000 = 245;
               break;
            case 246:
               var10000 = 121;
               break;
            case 247:
               var10000 = 240;
               break;
            case 248:
               var10000 = 58;
               break;
            case 249:
               var10000 = 13;
               break;
            case 250:
               var10000 = 164;
               break;
            case 251:
               var10000 = 218;
               break;
            case 252:
               var10000 = 254;
               break;
            case 253:
               var10000 = 35;
               break;
            case 254:
               var10000 = 97;
               break;
            default:
               var10000 = 61;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13058;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[15];
      int[] var10000 = new int[1];
      int var11 = 0;
      String var10 = "(7óQ¡r\u0013ø\u008bg¼S\u0086\u0080\u0016\u0086Ø±þT\u0005OL`\u0003ô\u0005c \u0004v¸\u0004[IIU Na\u0082ãas\u0002\u0095\u0085\u0018â\f<\nM½\tÚÜ¹ß/AñüpÌ\u0087B\u0017ý\u0015\u0005Hfh\u007f)\u0006m¥|L9I\u0006.Ü\u0014c4¬\u0004\f'£\u0098\u0006\u0018%ûG×G\u0005\u008b±©\u0085ö\u0006ú*§¦\\{\u0005\u000bøè\u0095å";
      int var12 = "(7óQ¡r\u0013ø\u008bg¼S\u0086\u0080\u0016\u0086Ø±þT\u0005OL`\u0003ô\u0005c \u0004v¸\u0004[IIU Na\u0082ãas\u0002\u0095\u0085\u0018â\f<\nM½\tÚÜ¹ß/AñüpÌ\u0087B\u0017ý\u0015\u0005Hfh\u007f)\u0006m¥|L9I\u0006.Ü\u0014c4¬\u0004\f'£\u0098\u0006\u0018%ûG×G\u0005\u008b±©\u0085ö\u0006ú*§¦\\{\u0005\u000bøè\u0095å"
         .length();
      x(var10000);
      char var9 = 20;
      int var16 = -1;

      label61:
      while (true) {
         byte var17 = 101;
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
                        var59 = 26;
                        break;
                     case 1:
                        var59 = 85;
                        break;
                     case 2:
                        var59 = 30;
                        break;
                     case 3:
                        var59 = 38;
                        break;
                     case 4:
                        var59 = 122;
                        break;
                     case 5:
                        var59 = 69;
                        break;
                     default:
                        var59 = 70;
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
                     a = var13;
                     b = new String[15];
                     long var0 = 8995761735352616496L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "J\u009eB\u009aú\u0085)ÓOü¼Â\u0011s\u00ad-";
                     int var5 = "J\u009eB\u009aú\u0085)ÓOü¼Â\u0011s\u00ad-".length();
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

                     c = var6;
                     d = new Integer[2];
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

                  var10 = "ZcRo\u0003\u001eô\u0017¤\\ÔõÅ4\f]¢ÕE@\u0013\u0085³¬ú\u0000}³\u009c\u0083\u008e\u0086iÒ\u0006Í";
                  var12 = "ZcRo\u0003\u001eô\u0017¤\\ÔõÅ4\f]¢ÕE@\u0013\u0085³¬ú\u0000}³\u009c\u0083\u008e\u0086iÒ\u0006Í".length();
                  var9 = 5;
                  var16 = -1;
            }

            var17 = 118;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}






