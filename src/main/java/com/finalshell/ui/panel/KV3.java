package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Ax2;
import com.finalshell.core.CH3_2;
import com.finalshell.core.FN;
import com.finalshell.core.GO;
import com.finalshell.core.Gk2;
import com.finalshell.core.KD;
import com.finalshell.core.Lk4;
import com.finalshell.core.Pu4;
import com.finalshell.core.Qe2_2;
import com.finalshell.core.UM;
import com.finalshell.core.X6;
import com.finalshell.core.ZzzzN1Customizer;
import com.finalshell.ui.listener.Di2;
import com.finalshell.ui.listener.Et4;
import com.finalshell.ui.listener.N82;
import com.finalshell.ui.listener.PH3;
import com.finalshell.ui.listener.PL3;
import com.finalshell.ui.listener.Sp2;
import com.finalshell.ui.listener.Yl2;
import com.finalshell.ui.model.DR3;
import com.finalshell.ui.model.Eg4;
import com.finalshell.ui.model.IX3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class KV3 extends Ky4 {
   public static ImageIcon E;
   public static ImageIcon V;
   public static ImageIcon d;
   public static ImageIcon t;
   public List Y;
   public SimpleDateFormat z;
   public boolean B;
   public boolean R;
   public boolean h;
   public Color O;
   public Color o;
   public Color S;
   public ZzzzN1Customizer u;
   public Date x;
   public Date k;
   public Date l;
   public KD i;
   public KD I;
   public O j;
   public KD T;
   public KD A;
   public Ky4 C;
   public Ky4 F;
   public Qj2 f;
   public Qe2_2 p;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public KV3() {
      this(null);
   }

   public KV3(Date var1) {
      super(true);
      Ky4 var5;
      String[] var10000 = Lk4.N();
      this.Y = new ArrayList(1);
      String[] var2 = var10000;
      this.z = new SimpleDateFormat(b(-6393, -3611));
      this.B = false;
      this.R = true;
      this.h = true;
      this.O = new Color(a(21608, 7800393622263842356L), a(7254, 7964819955327733263L), a(7254, 7964819955327733263L));
      this.o = Color.BLACK;
      this.S = new Color(a(8684, 960162542884598692L), 0, 0);
      Date var10001 = var1;
      if (var2 == null) {
         var10001 = var1 != null ? new Date(var1.getTime()) : null;
      }

      this.x = var10001;
      var10001 = var1;
      if (var2 == null) {
         var10001 = var1 != null ? new Date(var1.getTime()) : new Date();
      }

      this.k = var10001;
      this.i(true);
      this.Y(GO.Fx);
      this.setLayout(new BorderLayout(0, 0));
      this.putClientProperty(b(-6376, -31162), Boolean.valueOf(true));
      Ky4 var3 = new Ky4();
      var3.setOpaque(false);
      this.add(var3, b(-6383, 9595));
      Ky4 var4 = new Ky4();
      var4.setOpaque(false);
      this.add(var4, b(-6374, -9119));
      this.i = KD.K(E, GO.Fx, true);
      this.i.r(false);
      this.i.addActionListener(new N82(this));
      this.I = KD.K(V, GO.Fx, true);
      this.I.r(false);
      this.I.addActionListener(new Yl2(this));
      var5 = new Ky4(new BorderLayout());
      var5.setOpaque(false);
      var5.add(this.i, b(-6371, -30694));
      var5.add(this.I, b(-6375, 7461));
      var4.add(var5, b(-6370, 16677));
      this.j = new O();
      this.X$void();
      this.j.A$O_();
      this.j.D(true);
      this.j.setHorizontalAlignment(0);
      this.j.setVerticalAlignment(0);
      var4.add(this.j, b(-6400, 22669));
      this.T = KD.K(d, GO.Fx, true);
      this.T.r(false);
      this.T.addActionListener(new PH3(this));
      this.A = KD.K(t, GO.Fx, true);
      this.A.r(false);
      this.A.addActionListener(new Di2(this));
      Ky4 var6 = new Ky4(new BorderLayout());
      var6.setOpaque(false);
      var6.add(this.T, b(-6370, 16677));
      var6.add(this.A, b(-6372, -8272));
      var4.add(var6, b(-6372, -8272));
      this.C = new Ky4();
      this.C.T(false);
      this.C.I(true, false, true, false);
      this.C.D$ky_4(0);
      this.C.setOpaque(false);
      this.C.N(GO.FG, GO.FG - 1, GO.FG + 1, GO.FG - 1);
      Ky4 var7 = this.C;
      double[][] var10003 = new double[2][];
      double[] var10006 = new double[a(20797, 6819977196517409644L)];
      var10006[0] = -1.0;
      var10006[1] = -2.0;
      var10006[2] = -1.0;
      var10006[3] = -2.0;
      var10006[4] = -1.0;
      var10006[5] = -2.0;
      var10006[a(18816, 2232308165756541907L)] = -1.0;
      var10006[a(578, 1244756124417691666L)] = -2.0;
      var10006[a(7947, 2056726305626131793L)] = -1.0;
      var10006[a(9302, 3088318622700844553L)] = -2.0;
      var10006[a(23244, 8381553973203421313L)] = -1.0;
      var10006[a(2330, 1724842783892773703L)] = -2.0;
      var10006[a(32063, 943965830966275946L)] = -1.0;
      var10003[0] = var10006;
      var10003[1] = new double[]{-2.0};
      var7.setLayout(new IX3(var10003));
      var3.add(this.C, b(-6397, -25689));
      this.o();
      this.F = this.G();
      this.o(this.F);
      this.f = new Qj2(this.F);
      this.f.setOpaque(false);
      this.f.R(new UM(this));
      var3.add(this.f, b(-6400, 22669));
      if (var2 != null) {
         Ky4.K(new String[4]);
      }
   }

   public void X$void() {
      this.j.setText(this.z.format(this.k));
   }

   public void S(boolean var1) {
      KV3 var10000;
      label36: {
         String[] var2 = Lk4.N();
         if (var2 == null) {
            if (var1) {
               var10000 = this;
               if (var2 != null) {
                  break label36;
               }

               if (this.O()) {
                  X6 var4;
                  DR3 var5;
                  label31: {
                     this.F = this.G();
                     this.o(this.F);
                     boolean var3 = this.getComponentOrientation().isLeftToRight();
                     var4 = new X6();
                     var4.r(Eg4.moveBoth);
                     KV3 var10001 = this;
                     if (var2 == null) {
                        if (this.l.getTime() > this.k.getTime()) {
                           var5 = this.q(var3);
                           break label31;
                        }

                        var10001 = this;
                     }

                     var5 = var10001.l(var3);
                  }

                  var4.q(var5);
                  var4.o(a(16444, 7852523885285998L));
                  this.f.N(var4);
                  this.f.L(this.F);
                  if (var2 == null) {
                     return;
                  }
               }
            }

            this.o(this.F);
         }

         var10000 = this;
      }

      var10000.l$void();
   }

   public void P(int var1) {
      label13: {
         String[] var2 = Lk4.N();
         int var10000 = (this.getComponentOrientation().isLeftToRight()) ? 1 : 0;
         if (var2 == null) {
            if (var10000 != 0) {
               break label13;
            }

            var10000 = -var1;
         }

         var1 = var10000;
      }

      Calendar var3 = Calendar.getInstance();
      var3.setTime(this.k);
      var3.set(5, 1);
      var3.set(2, var3.get(2) + var1);
      this.a(var3.getTime());
   }

   public void S(int var1) {
      label13: {
         String[] var2 = Lk4.N();
         int var10000 = (this.getComponentOrientation().isLeftToRight()) ? 1 : 0;
         if (var2 == null) {
            if (var10000 != 0) {
               break label13;
            }

            var10000 = -var1;
         }

         var1 = var10000;
      }

      Calendar var3 = Calendar.getInstance();
      var3.setTime(this.k);
      var3.set(5, 1);
      var3.set(1, var3.get(1) + var1);
      this.a(var3.getTime());
   }

   public Ky4 G() {
      Ky4 var1 = new Ky4();
      var1.setOpaque(false);
      var1.N(GO.FG - 1, GO.FG - 1, GO.FG - 1, GO.FG - 1);
      double[][] var10002 = new double[2][];
      double[] var10005 = new double[a(6491, 4578116751186594581L)];
      var10005[0] = -1.0;
      var10005[1] = -2.0;
      var10005[2] = -1.0;
      var10005[3] = -2.0;
      var10005[4] = -1.0;
      var10005[5] = -2.0;
      var10005[a(27608, 1088758563212917143L)] = -1.0;
      var10005[a(16086, 5825112431313923201L)] = -2.0;
      var10005[a(20356, 7062502137131621842L)] = -1.0;
      var10005[a(7618, 6470853900303732636L)] = -2.0;
      var10005[a(18369, 8480760900821374349L)] = -1.0;
      var10005[a(1574, 8110339029497091186L)] = -2.0;
      var10005[a(25759, 4318800780094994116L)] = -1.0;
      var10002[0] = var10005;
      var10005 = new double[a(18816, 2232308165756541907L)];
      var10005[0] = -1.0;
      var10005[1] = -1.0;
      var10005[2] = -1.0;
      var10005[3] = -1.0;
      var10005[4] = -1.0;
      var10005[5] = -1.0;
      var10002[1] = var10005;
      IX3 var2 = new IX3(var10002);
      var2.q(0);
      var2.p(0);
      var1.setLayout(var2);
      return var1;
   }

   public void l$void() {
      String[] var1 = Lk4.N();
      Qe2_2 var10000 = this.p;
      if (var1 == null) {
         if (this.p == null) {
            return;
         }

         var10000 = this.p;
      }

      var10000.requestFocusInWindow();
   }

   public DR3 q(boolean var1) {
      String[] var2 = Lk4.N();
      boolean var10000 = this.h;
      if (var2 == null) {
         if (!this.h) {
            return DR3.up;
         }

         var10000 = var1;
      }

      return var10000 ? DR3.right : DR3.left;
   }

   public DR3 l(boolean var1) {
      String[] var2 = Lk4.N();
      boolean var10000 = this.h;
      if (var2 == null) {
         if (!this.h) {
            return DR3.down;
         }

         var10000 = var1;
      }

      return var10000 ? DR3.left : DR3.right;
   }

   public void o() {
      KV3 var5;
      int var7;
      String[] var10000 = Lk4.N();
      this.C.removeAll();
      String[] var1 = var10000;
      int var2 = 1;

      while (true) {
         if (var2 <= a(578, 1244756124417691666L)) {
            var5 = this;
            if (var1 != null) {
               break;
            }

            label48: {
               int var6 = (this.B) ? 1 : 0;
               if (var1 == null) {
                  if (!this.B) {
                     var7 = var2;
                     break label48;
                  }

                  var6 = var2;
               }

               byte var10001 = 1;
               if (var1 == null) {
                  if (var6 == 1) {
                     var7 = a(578, 1244756124417691666L);
                     break label48;
                  }

                  var6 = var2;
                  var10001 = 1;
               }

               var7 = var6 - var10001;
            }

            int var3 = var7;
            O var4 = new O();
            var4.u(b(-6378, -18671) + var3, new Object[0]);
            var4.D(true);
            var4.setHorizontalAlignment(0);
            var4.E(a(23244, 8381553973203421313L), 1);
            this.C.add(var4, (var2 - 1) * 2 + b(-6380, -21944));
            if (var1 == null) {
               if (var2 < a(578, 1244756124417691666L)) {
                  this.C.add(new CH3_2(1), (var2 - 1) * 2 + 1 + b(-6399, -7103));
               }

               var2++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var5 = this.C;
         break;
      }

      ((Ky4)var5).revalidate();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void o(JPanel var1) {
      JPanel var33;
      int var5;
      int var7;
      String[] var2;
      ButtonGroup var3;
      Calendar var4;
      int var6;
      int var8;
      label240: {
         var1.removeAll();
         this.p = null;
         var1.add(new CH3_2(1), b(-6395, -17000));
         var1.add(new CH3_2(1), b(-6377, 25775));
         var1.add(new CH3_2(1), b(-6369, -8109));
         var1.add(new CH3_2(1), b(-6384, 907));
         var1.add(new CH3_2(1), b(-6381, -21635));
         var1.add(new CH3_2(1), b(-6382, 17272));
         var3 = new ButtonGroup();
         var4 = Calendar.getInstance();
         var4.setTime(this.k);
         String[] var10000 = Lk4.N();
         var4.set(5, 1);
         var5 = 0;
         var6 = 0;
         var7 = var4.get(a(578, 1244756124417691666L));
         var2 = var10000;
         int var19 = var7;
         if (var2 == null) {
            switch (var7) {
               case 2:
                  int var20 = (this.B) ? 1 : 0;
                  if (var2 == null) {
                     var20 = this.B ? 1 : a(578, 1244756124417691666L);
                  }

                  var8 = var20;
                  if (var2 == null) {
                     break label240;
                  }
               case 3:
                  int var21 = (this.B) ? 1 : 0;
                  if (var2 == null) {
                     var21 = this.B ? 2 : 1;
                  }

                  var8 = var21;
                  if (var2 == null) {
                     break label240;
                  }
               case 4:
                  int var22 = (this.B) ? 1 : 0;
                  if (var2 == null) {
                     var22 = this.B ? 3 : 2;
                  }

                  var8 = var22;
                  if (var2 == null) {
                     break label240;
                  }
               case 5:
                  int var23 = (this.B) ? 1 : 0;
                  if (var2 == null) {
                     var23 = this.B ? 4 : 3;
                  }

                  var8 = var23;
                  if (var2 == null) {
                     break label240;
                  }
               case 6:
                  int var24 = (this.B) ? 1 : 0;
                  if (var2 == null) {
                     var24 = this.B ? 5 : 4;
                  }

                  var8 = var24;
                  if (var2 == null) {
                     break label240;
                  }
               case 7:
                  int var25 = (this.B) ? 1 : 0;
                  if (var2 == null) {
                     var25 = this.B ? a(18816, 2232308165756541907L) : 5;
                  }

                  var8 = var25;
                  if (var2 == null) {
                     break label240;
                  }
               case 1:
                  int var26 = (this.B) ? 1 : 0;
                  if (var2 == null) {
                     var26 = this.B ? a(578, 1244756124417691666L) : a(18816, 2232308165756541907L);
                  }

                  var8 = var26;
                  if (var2 == null) {
                     break label240;
                  }
               default:
                  var19 = 0;
            }
         }

         var8 = var19;
      }

      Gk2.p(var4, -var8);

      while (true) {
         int var29;
         if (var4.get(5) > 1) {
            Date var9 = var4.getTime();
            Qe2_2 var10 = new Qe2_2();
            var10.setForeground(this.O);
            var10.setText("" + var4.get(5));
            var10.G(true);
            var10.setHorizontalAlignment(4);
            var10.k(GO.Fx);
            var10.setFocusable(false);
            var10.addItemListener(new Sp2(this, var9));
            if (var2 == null) {
               Object var27 = this;
               if (var2 == null) {
                  if (this.u != null) {
                     this.u.g(var10, var9);
                  }

                  var27 = var1;
               }

               label161: {
                  var27.add(var10, var5 * 2 + "," + var6);
                  var3.add(var10);
                  Gk2.o(var4);
                  var29 = ++var5;
                  if (var2 == null) {
                     if (var5 <= a(18816, 2232308165756541907L)) {
                        break label161;
                     }

                     var29 = 0;
                  }

                  var5 = var29;
                  var6++;
               }

               if (var2 == null) {
                  continue;
               }

               if (var4.get(a(578, 1244756124417691666L)) != 1) {
                  var29 = var4.get(a(578, 1244756124417691666L));
                  if (var2 == null) {
                     var29 = var29 == a(578, 1244756124417691666L) ? 1 : 0;
                  }
               } else {
                  var29 = 1;
               }
            } else {
               var29 = 1;
            }
         } else if (var4.get(a(578, 1244756124417691666L)) != 1) {
            var29 = var4.get(a(578, 1244756124417691666L));
            if (var2 == null) {
               var29 = var29 == a(578, 1244756124417691666L) ? 1 : 0;
            }
         } else {
            var29 = 1;
         }

         while (true) {
            int var13 = var29;
            if (this.x != null) {
               var29 = (Gk2.i(var4, this.x.getTime())) ? 1 : 0;
               if (var2 == null) {
                  var29 = var29 != 0 ? 1 : 0;
               }
            } else {
               var29 = 0;
            }

            int var15 = var29;
            Date var11 = var4.getTime();
            Qe2_2 var12 = new Qe2_2();
            var12.setForeground(var13 != 0 ? this.S : this.o);
            var12.setText("" + var4.get(5));
            var12.setSelected(var15);
            var12.G(true);
            var12.setHorizontalAlignment(4);
            var12.k(GO.Fx);
            var12.setFocusable(false);
            var12.addActionListener(new PL3(this, var11));
            Object var31 = this;
            if (var2 == null) {
               if (this.u != null) {
                  this.u.g(var12, var11);
               }

               var31 = var1;
            }

            var31.add(var12, var5 * 2 + "," + var6);
            var3.add(var12);
            var29 = var15;
            int var10001;
            if (var2 == null) {
               if (var15 != 0) {
                  this.p = var12;
               }

               Gk2.o(var4);
               var29 = ++var5;
               var10001 = a(18816, 2232308165756541907L);
               if (var2 == null) {
                  if (var5 > var10001) {
                     var5 = 0;
                     var6++;
                  }

                  var29 = var4.get(5);
                  var10001 = 1;
               }
            } else {
               var10001 = a(18816, 2232308165756541907L);
               if (var2 == null) {
                  if (var15 > var10001) {
                     var5 = 0;
                     var6++;
                  }

                  var29 = var4.get(5);
                  var10001 = 1;
               }
            }

            if (var29 <= var10001) {
               var13 = a(350, 2056532868058485510L) - (var1.getComponentCount() - a(18816, 2232308165756541907L));
               var29 = 1;
               if (var2 == null) {
                  var15 = 1;

                  while (true) {
                     if (var15 <= var13) {
                        var11 = var4.getTime();
                        var12 = new Qe2_2();
                        var12.setForeground(this.O);
                        var12.setText("" + var4.get(5));
                        var12.G(true);
                        var12.setHorizontalAlignment(4);
                        var12.k(GO.Fx);
                        var12.setFocusable(false);
                        var12.addItemListener(new Et4(this, var11));
                        var33 = this;
                        if (var2 != null) {
                           break;
                        }

                        if (var2 == null) {
                           if (this.u != null) {
                              this.u.g(var12, var11);
                           }

                           var33 = var1;
                        }

                        var33.add(var12, var5 * 2 + "," + var6);
                        var3.add(var12);
                        Gk2.o(var4);
                        var5++;
                        if (var2 == null) {
                           if (var5 > a(18816, 2232308165756541907L)) {
                              var5 = 0;
                              var6++;
                           }

                           var15++;
                        }

                        if (var2 == null) {
                           continue;
                        }
                     }

                     var33 = var1;
                     break;
                  }

                  var33.revalidate();
                  if (Ky4.F$arrString() != null) {
                     Lk4.l(new String[2]);
                  }

                  return;
               }

               if (var2 == null) {
                  var29 = 1 == a(578, 1244756124417691666L) ? 1 : 0;
               }
            } else if (var4.get(a(578, 1244756124417691666L)) != 1) {
               var29 = var4.get(a(578, 1244756124417691666L));
               if (var2 == null) {
                  var29 = var29 == a(578, 1244756124417691666L) ? 1 : 0;
               }
            } else {
               var29 = 1;
            }
         }
      }
   }

   public SimpleDateFormat u() {
      return this.z;
   }

   public void i(SimpleDateFormat var1) {
      this.z = var1;
      this.X$void();
   }

   public Date I() {
      return this.x;
   }

   public void N(Date var1) {
      this.B(var1, this.O());
   }

   public void B(Date var1, boolean var2) {
      String[] var3 = Lk4.N();
      KV3 var10000 = this;
      if (var3 == null) {
         if (Ax2.Z(this.x, new Object[]{var1})) {
            return;
         }

         var10000 = this;
      }

      var10000.q(var1, var2);
   }

   public void J(Date var1) {
      this.q(var1, this.O());
   }

   public void q(Date var1, boolean var2) {
      this.x = var1;
      this.w(var1, var2);
      this.Z(var1);
   }

   public Date l$Date() {
      return this.k;
   }

   public void a(Date var1) {
      this.w(var1, this.O());
   }

   public void w(Date var1, boolean var2) {
      String[] var3 = Lk4.N();
      if (var3 == null) {
         if (var1 == null) {
            var1 = new Date();
         }

         this.l = this.k;
         this.k = var1;
      }

      Calendar var4 = Calendar.getInstance();
      var4.setTime(this.l);
      int var5 = var4.get(2);
      int var6 = var4.get(1);
      var4.setTime(var1);
      int var7 = var4.get(2);
      int var8 = var4.get(1);
      if (var3 == null) {
         if (var5 == var7 && var6 == var8) {
            return;
         }

         this.X$void();
      }

      this.S(var2);
   }

   public boolean A() {
      return this.B;
   }

   public void J(boolean var1) {
      this.B = var1;
      this.o();
      this.o(this.F);
   }

   public boolean O() {
      return this.R;
   }

   public void y(boolean var1) {
      this.R = var1;
   }

   public boolean D() {
      return this.h;
   }

   public void T(boolean var1) {
      this.h = var1;
   }

   public Color Z() {
      return this.O;
   }

   public void P(Color var1) {
      this.O = var1;
      this.o(this.F);
   }

   public Color b() {
      return this.o;
   }

   public void R(Color var1) {
      this.o = var1;
      this.o(this.F);
   }

   public Color X$Color() {
      return this.S;
   }

   public void p(Color var1) {
      this.S = var1;
      this.o(this.F);
   }

   public ZzzzN1Customizer v() {
      return this.u;
   }

   public void A(ZzzzN1Customizer var1) {
      this.u = var1;
      this.o(this.F);
   }

   @Override
   public void setEnabled(boolean var1) {
      super.setEnabled(var1);
      FN.o(this, var1, true);
   }

   public void J(Pu4 var1) {
      this.Y.add(var1);
   }

   public void z(Pu4 var1) {
      this.Y.remove(var1);
   }

   public void Z(Date var1) {
      String[] var10000 = Lk4.N();
      Iterator var3 = AL_2.J((Collection)this.Y).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         Pu4 var4 = (Pu4)var3.next();
         var4.i(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -6383) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 134;
               break;
            case 1:
               var10000 = 159;
               break;
            case 2:
               var10000 = 117;
               break;
            case 3:
               var10000 = 124;
               break;
            case 4:
               var10000 = 210;
               break;
            case 5:
               var10000 = 71;
               break;
            case 6:
               var10000 = 14;
               break;
            case 7:
               var10000 = 9;
               break;
            case 8:
               var10000 = 116;
               break;
            case 9:
               var10000 = 208;
               break;
            case 10:
               var10000 = 56;
               break;
            case 11:
               var10000 = 182;
               break;
            case 12:
               var10000 = 96;
               break;
            case 13:
               var10000 = 174;
               break;
            case 14:
               var10000 = 34;
               break;
            case 15:
               var10000 = 77;
               break;
            case 16:
               var10000 = 113;
               break;
            case 17:
               var10000 = 76;
               break;
            case 18:
               var10000 = 132;
               break;
            case 19:
               var10000 = 172;
               break;
            case 20:
               var10000 = 13;
               break;
            case 21:
               var10000 = 191;
               break;
            case 22:
               var10000 = 196;
               break;
            case 23:
               var10000 = 192;
               break;
            case 24:
               var10000 = 179;
               break;
            case 25:
               var10000 = 185;
               break;
            case 26:
               var10000 = 183;
               break;
            case 27:
               var10000 = 225;
               break;
            case 28:
               var10000 = 110;
               break;
            case 29:
               var10000 = 211;
               break;
            case 30:
               var10000 = 173;
               break;
            case 31:
               var10000 = 84;
               break;
            case 32:
               var10000 = 229;
               break;
            case 33:
               var10000 = 171;
               break;
            case 34:
               var10000 = 220;
               break;
            case 35:
               var10000 = 181;
               break;
            case 36:
               var10000 = 123;
               break;
            case 37:
               var10000 = 44;
               break;
            case 38:
               var10000 = 130;
               break;
            case 39:
               var10000 = 244;
               break;
            case 40:
               var10000 = 178;
               break;
            case 41:
               var10000 = 145;
               break;
            case 42:
               var10000 = 2;
               break;
            case 43:
               var10000 = 50;
               break;
            case 44:
               var10000 = 189;
               break;
            case 45:
               var10000 = 205;
               break;
            case 46:
               var10000 = 126;
               break;
            case 47:
               var10000 = 46;
               break;
            case 48:
               var10000 = 111;
               break;
            case 49:
               var10000 = 144;
               break;
            case 50:
               var10000 = 218;
               break;
            case 51:
               var10000 = 81;
               break;
            case 52:
               var10000 = 93;
               break;
            case 53:
               var10000 = 226;
               break;
            case 54:
               var10000 = 21;
               break;
            case 55:
               var10000 = 224;
               break;
            case 56:
               var10000 = 142;
               break;
            case 57:
               var10000 = 48;
               break;
            case 58:
               var10000 = 45;
               break;
            case 59:
               var10000 = 15;
               break;
            case 60:
               var10000 = 31;
               break;
            case 61:
               var10000 = 78;
               break;
            case 62:
               var10000 = 19;
               break;
            case 63:
               var10000 = 152;
               break;
            case 64:
               var10000 = 198;
               break;
            case 65:
               var10000 = 8;
               break;
            case 66:
               var10000 = 203;
               break;
            case 67:
               var10000 = 58;
               break;
            case 68:
               var10000 = 115;
               break;
            case 69:
               var10000 = 184;
               break;
            case 70:
               var10000 = 69;
               break;
            case 71:
               var10000 = 232;
               break;
            case 72:
               var10000 = 63;
               break;
            case 73:
               var10000 = 252;
               break;
            case 74:
               var10000 = 254;
               break;
            case 75:
               var10000 = 51;
               break;
            case 76:
               var10000 = 108;
               break;
            case 77:
               var10000 = 104;
               break;
            case 78:
               var10000 = 143;
               break;
            case 79:
               var10000 = 106;
               break;
            case 80:
               var10000 = 175;
               break;
            case 81:
               var10000 = 95;
               break;
            case 82:
               var10000 = 38;
               break;
            case 83:
               var10000 = 149;
               break;
            case 84:
               var10000 = 238;
               break;
            case 85:
               var10000 = 250;
               break;
            case 86:
               var10000 = 98;
               break;
            case 87:
               var10000 = 53;
               break;
            case 88:
               var10000 = 24;
               break;
            case 89:
               var10000 = 148;
               break;
            case 90:
               var10000 = 188;
               break;
            case 91:
               var10000 = 27;
               break;
            case 92:
               var10000 = 43;
               break;
            case 93:
               var10000 = 101;
               break;
            case 94:
               var10000 = 66;
               break;
            case 95:
               var10000 = 147;
               break;
            case 96:
               var10000 = 88;
               break;
            case 97:
               var10000 = 239;
               break;
            case 98:
               var10000 = 118;
               break;
            case 99:
               var10000 = 55;
               break;
            case 100:
               var10000 = 73;
               break;
            case 101:
               var10000 = 222;
               break;
            case 102:
               var10000 = 107;
               break;
            case 103:
               var10000 = 135;
               break;
            case 104:
               var10000 = 41;
               break;
            case 105:
               var10000 = 245;
               break;
            case 106:
               var10000 = 234;
               break;
            case 107:
               var10000 = 214;
               break;
            case 108:
               var10000 = 133;
               break;
            case 109:
               var10000 = 57;
               break;
            case 110:
               var10000 = 109;
               break;
            case 111:
               var10000 = 129;
               break;
            case 112:
               var10000 = 37;
               break;
            case 113:
               var10000 = 228;
               break;
            case 114:
               var10000 = 86;
               break;
            case 115:
               var10000 = 10;
               break;
            case 116:
               var10000 = 230;
               break;
            case 117:
               var10000 = 20;
               break;
            case 118:
               var10000 = 249;
               break;
            case 119:
               var10000 = 137;
               break;
            case 120:
               var10000 = 60;
               break;
            case 121:
               var10000 = 91;
               break;
            case 122:
               var10000 = 213;
               break;
            case 123:
               var10000 = 158;
               break;
            case 124:
               var10000 = 202;
               break;
            case 125:
               var10000 = 223;
               break;
            case 126:
               var10000 = 251;
               break;
            case 127:
               var10000 = 4;
               break;
            case 128:
               var10000 = 0;
               break;
            case 129:
               var10000 = 253;
               break;
            case 130:
               var10000 = 22;
               break;
            case 131:
               var10000 = 204;
               break;
            case 132:
               var10000 = 248;
               break;
            case 133:
               var10000 = 68;
               break;
            case 134:
               var10000 = 42;
               break;
            case 135:
               var10000 = 231;
               break;
            case 136:
               var10000 = 80;
               break;
            case 137:
               var10000 = 12;
               break;
            case 138:
               var10000 = 25;
               break;
            case 139:
               var10000 = 146;
               break;
            case 140:
               var10000 = 40;
               break;
            case 141:
               var10000 = 187;
               break;
            case 142:
               var10000 = 87;
               break;
            case 143:
               var10000 = 195;
               break;
            case 144:
               var10000 = 28;
               break;
            case 145:
               var10000 = 177;
               break;
            case 146:
               var10000 = 221;
               break;
            case 147:
               var10000 = 167;
               break;
            case 148:
               var10000 = 233;
               break;
            case 149:
               var10000 = 241;
               break;
            case 150:
               var10000 = 54;
               break;
            case 151:
               var10000 = 105;
               break;
            case 152:
               var10000 = 18;
               break;
            case 153:
               var10000 = 186;
               break;
            case 154:
               var10000 = 49;
               break;
            case 155:
               var10000 = 90;
               break;
            case 156:
               var10000 = 99;
               break;
            case 157:
               var10000 = 1;
               break;
            case 158:
               var10000 = 131;
               break;
            case 159:
               var10000 = 39;
               break;
            case 160:
               var10000 = 23;
               break;
            case 161:
               var10000 = 114;
               break;
            case 162:
               var10000 = 102;
               break;
            case 163:
               var10000 = 74;
               break;
            case 164:
               var10000 = 161;
               break;
            case 165:
               var10000 = 100;
               break;
            case 166:
               var10000 = 164;
               break;
            case 167:
               var10000 = 30;
               break;
            case 168:
               var10000 = 16;
               break;
            case 169:
               var10000 = 32;
               break;
            case 170:
               var10000 = 70;
               break;
            case 171:
               var10000 = 157;
               break;
            case 172:
               var10000 = 240;
               break;
            case 173:
               var10000 = 153;
               break;
            case 174:
               var10000 = 33;
               break;
            case 175:
               var10000 = 197;
               break;
            case 176:
               var10000 = 5;
               break;
            case 177:
               var10000 = 209;
               break;
            case 178:
               var10000 = 180;
               break;
            case 179:
               var10000 = 212;
               break;
            case 180:
               var10000 = 92;
               break;
            case 181:
               var10000 = 127;
               break;
            case 182:
               var10000 = 136;
               break;
            case 183:
               var10000 = 243;
               break;
            case 184:
               var10000 = 47;
               break;
            case 185:
               var10000 = 190;
               break;
            case 186:
               var10000 = 165;
               break;
            case 187:
               var10000 = 255;
               break;
            case 188:
               var10000 = 163;
               break;
            case 189:
               var10000 = 235;
               break;
            case 190:
               var10000 = 200;
               break;
            case 191:
               var10000 = 6;
               break;
            case 192:
               var10000 = 169;
               break;
            case 193:
               var10000 = 3;
               break;
            case 194:
               var10000 = 65;
               break;
            case 195:
               var10000 = 83;
               break;
            case 196:
               var10000 = 236;
               break;
            case 197:
               var10000 = 199;
               break;
            case 198:
               var10000 = 62;
               break;
            case 199:
               var10000 = 36;
               break;
            case 200:
               var10000 = 194;
               break;
            case 201:
               var10000 = 215;
               break;
            case 202:
               var10000 = 82;
               break;
            case 203:
               var10000 = 162;
               break;
            case 204:
               var10000 = 139;
               break;
            case 205:
               var10000 = 141;
               break;
            case 206:
               var10000 = 154;
               break;
            case 207:
               var10000 = 85;
               break;
            case 208:
               var10000 = 247;
               break;
            case 209:
               var10000 = 125;
               break;
            case 210:
               var10000 = 201;
               break;
            case 211:
               var10000 = 72;
               break;
            case 212:
               var10000 = 121;
               break;
            case 213:
               var10000 = 94;
               break;
            case 214:
               var10000 = 140;
               break;
            case 215:
               var10000 = 89;
               break;
            case 216:
               var10000 = 227;
               break;
            case 217:
               var10000 = 35;
               break;
            case 218:
               var10000 = 207;
               break;
            case 219:
               var10000 = 237;
               break;
            case 220:
               var10000 = 97;
               break;
            case 221:
               var10000 = 242;
               break;
            case 222:
               var10000 = 150;
               break;
            case 223:
               var10000 = 26;
               break;
            case 224:
               var10000 = 155;
               break;
            case 225:
               var10000 = 61;
               break;
            case 226:
               var10000 = 122;
               break;
            case 227:
               var10000 = 29;
               break;
            case 228:
               var10000 = 176;
               break;
            case 229:
               var10000 = 119;
               break;
            case 230:
               var10000 = 156;
               break;
            case 231:
               var10000 = 120;
               break;
            case 232:
               var10000 = 67;
               break;
            case 233:
               var10000 = 79;
               break;
            case 234:
               var10000 = 52;
               break;
            case 235:
               var10000 = 217;
               break;
            case 236:
               var10000 = 128;
               break;
            case 237:
               var10000 = 206;
               break;
            case 238:
               var10000 = 75;
               break;
            case 239:
               var10000 = 166;
               break;
            case 240:
               var10000 = 168;
               break;
            case 241:
               var10000 = 193;
               break;
            case 242:
               var10000 = 59;
               break;
            case 243:
               var10000 = 219;
               break;
            case 244:
               var10000 = 103;
               break;
            case 245:
               var10000 = 160;
               break;
            case 246:
               var10000 = 151;
               break;
            case 247:
               var10000 = 11;
               break;
            case 248:
               var10000 = 7;
               break;
            case 249:
               var10000 = 64;
               break;
            case 250:
               var10000 = 17;
               break;
            case 251:
               var10000 = 216;
               break;
            case 252:
               var10000 = 170;
               break;
            case 253:
               var10000 = 112;
               break;
            case 254:
               var10000 = 246;
               break;
            default:
               var10000 = 138;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4700;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      boolean var5;
      byte[] var7;
      String[] var13 = new String[23];
      int var11 = 0;
      String var10 = "8Ù¨\u007f\u0002D\u0007\u0017åéÀí¾»\u0007/¹!KúÏ\u0096\t5\u000fw?ºÃ-6«\u0013¹xö\u0097þ]Nq>y\u0016w>xÄI|UG\u0002ÛÐ\u0007éJ²5\u0082\u0000Ò\u001d ©\u0015i<\u0089\u0006\u008b\u007f|\u0002Ô\u0000Pú\u008bw\u0012\\9ãÃR¢BJ³\tä\u0004ºç#<\u0014Vî/\tÿ\u008b\u008b¶!ÆqÌ(4ê\u0014W\u0003±o\u000eÅ¢yÌ\u000f6p\u001cùÔ\u009fÁUÃ\u0005Õ\u0000¥\u000f1\u0004=ì\u0083Ù\u0004-/Ñ%\u0007Ê1\u0010ZÐí^\u0004p\u000f*¥\u0002\u0089A\u0006qq\u0081j'æ\u0005M\u0001¶/S\u0017Ô²[ÎKvæ\u0003ëÀ$\u001e\u0096Ð#XQ\u0086\u008d\u0099]Ã\u009e\u0007(»È\u000bÏÇ9";
      int var12 = "8Ù¨\u007f\u0002D\u0007\u0017åéÀí¾»\u0007/¹!KúÏ\u0096\t5\u000fw?ºÃ-6«\u0013¹xö\u0097þ]Nq>y\u0016w>xÄI|UG\u0002ÛÐ\u0007éJ²5\u0082\u0000Ò\u001d ©\u0015i<\u0089\u0006\u008b\u007f|\u0002Ô\u0000Pú\u008bw\u0012\\9ãÃR¢BJ³\tä\u0004ºç#<\u0014Vî/\tÿ\u008b\u008b¶!ÆqÌ(4ê\u0014W\u0003±o\u000eÅ¢yÌ\u000f6p\u001cùÔ\u009fÁUÃ\u0005Õ\u0000¥\u000f1\u0004=ì\u0083Ù\u0004-/Ñ%\u0007Ê1\u0010ZÐí^\u0004p\u000f*¥\u0002\u0089A\u0006qq\u0081j'æ\u0005M\u0001¶/S\u0017Ô²[ÎKvæ\u0003ëÀ$\u001e\u0096Ð#XQ\u0086\u008d\u0099]Ã\u009e\u0007(»È\u000bÏÇ9"
         .length();
      char var9 = 6;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 82;
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
                        var65 = 38;
                        break;
                     case 1:
                        var65 = 87;
                        break;
                     case 2:
                        var65 = 54;
                        break;
                     case 3:
                        var65 = 11;
                        break;
                     case 4:
                        var65 = 15;
                        break;
                     case 5:
                        var65 = 90;
                        break;
                     default:
                        var65 = 27;
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
                     b = new String[23];
                     long var0 = 278386161558749845L;
                     long[] var6 = new long[21];
                     int var3 = 0;
                     String var4 = "LTKÞýZDû!è\u0085D½K\u0019Ù´úV1·\u0016\r\u0000×\u0081ñ°\u0095V´\u0095r\u008b\nÛs\u0092\u0091¹=D\u00adÒçX\u008cÀ$ób4¡\u0014\u000fÌÙu\u000b\b_%ô]'y\u008f S1\u0016ìÆ\nQ\u001c,Áíó\u0093ÖÁ%K2ßOº;\u0092_\u00935®\u0013læ\u001bÔ\u008dð\u0092\u0080\u00960\u0004ép·AôÜã3C\u001eÝÐïZÉ\u0001\u0006?\u0007Y@JNÏ\u0019\u0018b×\u0012\u001a%ï<H\u0095Ê\u001eÈfwÎÈ¦\t\u008d";
                     var5 = "LTKÞýZDû!è\u0085D½K\u0019Ù´úV1·\u0016\r\u0000×\u0081ñ°\u0095V´\u0095r\u008b\nÛs\u0092\u0091¹=D\u00adÒçX\u008cÀ$ób4¡\u0014\u000fÌÙu\u000b\b_%ô]'y\u008f S1\u0016ìÆ\nQ\u001c,Áíó\u0093ÖÁ%K2ßOº;\u0092_\u00935®\u0013læ\u001bÔ\u008dð\u0092\u0080\u00960\u0004ép·AôÜã3C\u001eÝÐïZÉ\u0001\u0006?\u0007Y@JNÏ\u0019\u0018b×\u0012\u001a%ï<H\u0095Ê\u001eÈfwÎÈ¦\t\u008d";
                        // [VF] .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
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
                                    c = var6;
                                    e = new Integer[21];
                                    E = new ImageIcon(KV3.class.getResource(b(-6398, -5152)));
                                    V = new ImageIcon(KV3.class.getResource(b(-6396, 30469)));
                                    d = new ImageIcon(KV3.class.getResource(b(-6373, -27223)));
                                    t = new ImageIcon(KV3.class.getResource(b(-6379, -21711)));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Éö·ü `{\u0004L\u0089Lªñ]±\u0091";
                                 var5 = ("Éö·ü `{\u0004L\u0089Lªñ]±\u0091".length()) != 0;
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

                  var10 = "\u0097\u009a\u0012êCÓÆ\u0096ÎS¡M\u0007\u009bA\u0013f£\t÷\u0092\u009c#§ûj\u0004o";
                  var12 = "\u0097\u009a\u0012êCÓÆ\u0096ÎS¡M\u0007\u009bA\u0013f£\t÷\u0092\u009c#§ûj\u0004o".length();
                  var9 = 18;
                  var17 = -1;
            }

            var10000 = 83;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





