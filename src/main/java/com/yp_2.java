package com;

import com.C.v_2;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Yp_2 extends v_2 {
   protected boolean J = false;
   protected boolean s = false;
   protected pF_3 b = null;
   protected pF_3 R = null;
   protected p6_2 u;
   protected boolean G = false;
   private static int X;

   public Yp_2() {
   }

   public Yp_2(pF_3 var1) {
      this.s(var1);
   }

   public Yp_2(pF_3 var1, pF_3 var2) {
      this.s(var1);
      this.x(var2);
   }

   public void v(JLabel var1) {
      super.A((JComponent)var1);
      this.u = new com.cP_3(this);
      com.ON.b(var1, this.u);
   }

   public void B(JLabel var1) {
      com.ON.i(this.u);
      this.u = null;
      super.X(var1);
   }

   public boolean k() {
      return this.J;
   }

   public void s(boolean var1) {
      int var2 = T();
      com.Yp_2 var10000 = this;
      if (var2 != 0) {
         if (this.J == var1) {
            return;
         }

         this.J = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean e() {
      return this.s;
   }

   public void S(boolean var1) {
      int var2 = T();
      com.Yp_2 var10000 = this;
      if (var2 != 0) {
         if (this.s == var1) {
            return;
         }

         this.s = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public pF_3 b() {
      return this.b;
   }

   public void s(pF_3 var1) {
      com.Yp_2 var4;
      label30: {
         int var10000 = T();
         this.b = var1;
         int var2 = var10000;
         boolean var3 = this.J;
         if (var2 != 0) {
            if (this.J) {
               return;
            }

            var4 = this;
            if (var2 == 0) {
               break label30;
            }

            var3 = this.s;
         }

         if (var3) {
            var4 = this;
            if (var2 == 0) {
               break label30;
            }

            if (this.G) {
               return;
            }
         }

         var4 = this;
      }

      var4.Z();
   }

   public pF_3 v() {
      return this.R;
   }

   public void x(pF_3 var1) {
      int var10000 = f();
      this.R = var1;
      int var2 = var10000;
      boolean var3 = this.J;
      if (var2 == 0) {
         if (this.J) {
            return;
         }

         var3 = this.s;
      }

      label33: {
         if (var2 == 0) {
            if (!var3) {
               return;
            }

            var4 = this;
            if (var2 != 0) {
               break label33;
            }

            var3 = this.G;
         }

         if (!var3) {
            return;
         }

         var4 = this;
      }

      var4.Z();
   }

   @Override
   public Insets Q(JLabel var1) {
      int var10000 = T();
      pF_3 var3 = this.Q();
      int var2 = var10000;
      com.Yp_2 var4 = this;
      if (var2 != 0) {
         if (!this.J) {
            if (var2 == 0) {
               return var3.U();
            }

            if (var3 != null) {
               return var3.U();
            }
         }

         var4 = this;
      }

      return var4.Q(var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JLabel var3) {
      com.Yp_2 var6;
      label37: {
         int var4;
         var4 = T();
         var10000 = this.J;
         label33:
         if (var4 != 0) {
            if (this.J) {
               var10000 = var3.isOpaque();
               if (var4 == 0) {
                  break label33;
               }

               if (var10000) {
                  var1.setPaint(var3.getBackground());
                  var1.fillRect(var2.x, var2.y, var2.width, var2.height);
               }
            }

            var6 = this;
            if (var4 == 0) {
               break label37;
            }

            var10000 = this.J;
         }

         if (!var10000) {
            pF_3 var5 = this.Q();
            if (var4 == 0) {
               return;
            }

            if (var5 != null) {
               var5.n(var1, var2);
            }
         }

         var6 = this;
      }

      var6.u(var1, var2, var3);
   }

   protected pF_3 Q() {
      int var1 = f();
      com.Yp_2 var10000 = this;
      if (var1 == 0) {
         if (this.G) {
            if (var1 != 0) {
               return this.b;
            }

            if (this.R != null) {
               return this.R;
            }
         }

         var10000 = this;
      }

      return var10000.b;
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.u(var1, var2, (JLabel)var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.Q((JLabel)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.B((JLabel)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.v((JLabel)var1);
   }

   public static void u(int var0) {
      X = var0;
   }

   public static int T() {
      return X;
   }

   public static int f() {
      int var0 = T();
      return var0 == 0 ? 91 : 0;
   }

   static {
      if (T() == 0) {
         u(44);
      }
   }
}





