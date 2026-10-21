package com.finalshell.core;

import com.finalshell.ui.listener.DD;
import com.finalshell.ui.listener.El4;
import com.finalshell.ui.listener.NV3;
import com.finalshell.ui.listener.X5;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

public abstract class WO3 implements K3_2 {
   public int f = -1;
   public Object b;
   public Component d;
   public ComponentAdapter j;
   public MouseAdapter Y = null;
   public int R;
   public KeyAdapter Q;
   public static int k;
   public static long a;

   public WO3() {
      this.R = (int)a;
      this.Q = null;
   }

   @Override
   public void V(JList var1) {
      this.j = new NV3(this, var1);
      var1.addComponentListener(this.j);
      this.W(var1);
   }

   public void W(JList var1) {
      int var10000 = f();
      this.Y = new DD(this, var1);
      var1.addMouseListener(this.Y);
      int var2 = var10000;
      this.Q = new com.finalshell.ui.listener.HW(this, var1);
      var1.addKeyListener(this.Q);
      if (var2 != 0) {
         Ky4.K(new String[4]);
      }
   }

   @Override
   public void S(JList var1) {
      var1.removeComponentListener(this.j);
      this.H(var1);
   }

   public void H(JList var1) {
      int var2 = f();
      WO3 var10000 = this;
      if (var2 == 0) {
         if (this.Y != null) {
            var1.removeMouseListener(this.Y);
         }

         var10000 = this;
      }

      if (var10000.Q != null) {
         var1.removeKeyListener(this.Q);
      }
   }

   @Override
   public boolean T(JList var1, int var2, Object var3) {
      int var4 = H();
      boolean var10000 = var1 instanceof com.finalshell.ui.panel.CI;
      if (var4 != 0) {
         if (var10000) {
            var10000 = ((com.finalshell.ui.panel.CI)var1).z();
            if (var4 != 0) {
               if (!var10000) {
                  return false;
               }

               var10000 = var1.isEnabled();
            }

            if (var4 == 0) {
               return var10000;
            }

            if (var10000) {
               return true;
            }

            return false;
         }

         var10000 = var1.isEnabled();
      }

      return var10000;
   }

   @Override
   public Component I(JList var1, int var2, Object var3) {
      this.d = this.j(var1, var2, var3);
      this.b(var1, var2, var3);
      return this.d;
   }

   public abstract Component j(JList var1, int var2, Object var3);

   public void b(JList var1, int var2, Object var3) {
      El4 var5 = new El4(this, var1);
      int var10000 = f();
      this.d.addFocusListener(var5);
      int var4 = var10000;
      this.d.addKeyListener(new X5(this, var5, var1));
      if (Ky4.F$arrString() != null) {
         S(++var4);
      }
   }

   @Override
   public void N(JList var1, int var2) {
      int var3 = f();
      int var10000 = var2;
      if (var3 == 0) {
         if (var2 == -1) {
            return;
         }

         this.b = var1.getModel().getElementAt(var2);
         var10000 = (this.T(var1, var2, this.b)) ? 1 : 0;
      }

      label32: {
         if (var3 == 0) {
            if (var10000 == 0) {
               this.b = null;
               return;
            }

            this.d = this.I(var1, var2, this.b);
            this.d.setBounds(this.n(var1, var2, this.b));
            this.d(var1);
            var4 = this;
            if (var3 != 0) {
               break label32;
            }

            var10000 = (this.d.isFocusable()) ? 1 : 0;
         }

         if (var10000 != 0) {
            this.d.requestFocusInWindow();
         }

         var4 = this;
      }

      var4.n(var1, var2);
   }

   @Override
   public void w(JList var1) {
      this.k(var1);
      this.X(var1, this.f);
   }

   @Override
   public boolean C(JList var1) {
      int var2 = f();
      boolean var10000 = this.D();
      if (var2 == 0) {
         if (var10000) {
            int[] var3 = var1.getSelectedIndices();
            Object var4 = this.E(var1, this.f, this.b);
            boolean var5 = this.U(var1, this.f, this.b, var4, true);
            WO3 var6 = this;
            JList var10001 = var1;
            if (var2 == 0) {
               this.k(var1);
               if (var5) {
                  var1.setSelectedIndices(var3);
                  this.q(var1, this.f, this.b, var4);
                  if (var2 == 0) {
                     return true;
                  }
               }

               var6 = this;
               var10001 = var1;
            }

            var6.X(var10001, this.f);
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public void d(JList var1) {
      var1.add(this.d);
      var1.revalidate();
      var1.repaint();
   }

   public void k(JList var1) {
      var1.remove(this.d);
      var1.revalidate();
      var1.repaint();
   }

   public Rectangle O(JList var1, int var2, Object var3, Rectangle var4) {
      return new Rectangle(0, 0, var4.width, var4.height);
   }

   public Rectangle n(JList var1, int var2, Object var3) {
      int var10000 = f();
      Rectangle var5 = var1.getCellBounds(var2, var2);
      int var4 = var10000;
      Rectangle var7 = var5;
      if (var4 == 0) {
         if (var5 == null) {
            return null;
         }

         var7 = this.O(var1, var2, var3, var5);
      }

      Rectangle var6 = var7;
      return new Rectangle(var5.x + var6.x, var5.y + var6.y, var6.width, var6.height);
   }

   @Override
   public boolean U(JList var1, int var2, Object var3, Object var4, boolean var5) {
      int var6 = f();
      int var10000 = (Ax2.Z(var3, new Object[]{var4})) ? 1 : 0;
      if (var6 == 0) {
         if (!var10000) {
            ListModel var7 = var1.getModel();
            var10000 = (var7 instanceof DefaultListModel) ? 1 : 0;
            if (var6 == 0) {
               if (var10000) {
                  DefaultListModel var10 = (DefaultListModel)var7;
                  var10.setElementAt(var4, var2);
                  return true;
               }

               var10000 = (var7 instanceof AbstractListModel) ? 1 : 0;
            }

            if (var6 == 0) {
               if (var10000) {
                  Object[] var8 = new Object[var7.getSize()];
                  int var9 = 0;

                  while (true) {
                     if (var9 < var7.getSize()) {
                        var10000 = this.f;
                        if (var6 != 0) {
                           break;
                        }

                        label34: {
                           if (this.f != var9) {
                              var8[var9] = var7.getElementAt(var9);
                              if (var6 == 0) {
                                 break label34;
                              }
                           }

                           var8[var9] = var4;
                        }

                        var9++;
                        if (var6 == 0) {
                           continue;
                        }
                     }

                     var1.setModel(new Wz2(this, var8));
                     var10000 = 1;
                     break;
                  }

                  return var10000 != 0;
               }

               var10000 = (((((boolean)0) != 0) != 0) != 0) != 0;
            }

            return var10000;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }

   @Override
   public void n(JList var1, int var2) {
      int var10000 = f();
      this.f = var2;
      int var3 = var10000;
      JList var4 = var1;
      if (var3 == 0) {
         if (!(var1 instanceof com.finalshell.ui.panel.CI)) {
            return;
         }

         var4 = var1;
      }

      ((com.finalshell.ui.panel.CI)var4).D$void(var2);
   }

   @Override
   public void q(JList var1, int var2, Object var3, Object var4) {
      int var10000 = H();
      this.f = -1;
      int var5 = var10000;
      JList var6 = var1;
      if (var5 != 0) {
         if (!(var1 instanceof com.finalshell.ui.panel.CI)) {
            return;
         }

         var6 = var1;
      }

      ((com.finalshell.ui.panel.CI)var6).h(var2, var3, var4);
   }

   @Override
   public void X(JList var1, int var2) {
      int var10000 = H();
      this.f = -1;
      int var3 = var10000;
      JList var4 = var1;
      if (var3 != 0) {
         if (!(var1 instanceof com.finalshell.ui.panel.CI)) {
            return;
         }

         var4 = var1;
      }

      ((com.finalshell.ui.panel.CI)var4).M(var2);
   }

   @Override
   public boolean D() {
      int var1 = f();
      int var10000 = this.f;
      if (var1 == 0) {
         var10000 = this.f != -1 ? 1 : 0;
      }

      return var10000 != 0;
   }

   public int x() {
      return this.R;
   }

   public void x(int var1) {
      this.R = var1;
   }

   public static void S(int var0) {
      k = var0;
   }

   public static int H() {
      return k;
   }

   public static int f() {
      int var0 = H();
      return var0 == 0 ? 49 : 0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (H() == 0) {
         S(87);
      }

      long var0 = 1741073322583063234L;
      long var10002 = 1458275976981576384L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





