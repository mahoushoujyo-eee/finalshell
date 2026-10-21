package com;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JComponent;
import javax.swing.JToolBar;

public class LC extends com.Lz_2 {
   protected Map N;

   public LC() {
      this.N = new HashMap();
   }

   public LC(Map var1) {
      this.N = var1;
   }

   public Map N() {
      return this.N;
   }

   public void b(Map var1) {
      this.N = var1;
      this.Z();
   }

   public void C(String var1, pF_3 var2) {
      this.N.put(var1, var2);
      this.Z();
   }

   public void d(String var1) {
      this.N.remove(var1);
      this.Z();
   }

   public boolean Q() {
      int[] var1 = com.Lz_2.M();
      Map var10000 = this.N;
      if (var1 == null) {
         if (this.N == null) {
            return (boolean)0;
         }

         var10000 = this.N;
      }

      int var2 = var10000.size();
      if (var1 != null) {
         return (boolean)var2;
      } else {
         return (boolean)(var2 > 0 ? 1 : 0);
      }
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = com.Lz_2.M();
      if (this.Q()) {
         JComponent var10000 = var3;
         if (var4 == null) {
            if (var3 == null) {
               return;
            }

            var10000 = var3;
         }

         pF_3 var5;
         label61: {
            boolean var7 = var10000 instanceof AbstractButton;
            if (var4 == null) {
               if (var7) {
                  var5 = this.P((AbstractButton)var3);
                  if (var4 == null) {
                     break label61;
                  }
               }

               var7 = var3 instanceof JToolBar;
            }

            if (var7) {
               var5 = this.U((JToolBar)var3);
               if (var4 == null) {
                  break label61;
               }
            }

            var5 = this.p(var3);
         }

         label41: {
            pF_3 var8 = var5;
            if (var4 == null) {
               if (var5 == null) {
                  break label41;
               }

               var5.k(var3);
               var8 = var5;
            }

            var8.n(var1, var2);
         }

         com.LC var9 = this;
         if (var4 == null) {
            if (!this.p(var3)) {
               return;
            }

            var9 = this;
         }

         pF_3 var6 = var9.r(Ey_2.F);
         pF_3 var10 = var6;
         if (var4 == null) {
            if (var6 == null) {
               return;
            }

            var6.k(var3);
            var10 = var6;
         }

         var10.n(var1, var2);
      }
   }

   protected boolean p(JComponent var1) {
      return var1.isFocusOwner();
   }

   protected pF_3 p$pF_3(JComponent var1) {
      return this.u(var1.isEnabled() ? Ey_2.t : Ey_2.q);
   }

   protected pF_3 P(AbstractButton var1) {
      int[] var10000 = com.Lz_2.M();
      ButtonModel var3 = var1.getModel();
      int[] var2 = var10000;
      boolean var4 = var3.isPressed();
      if (var2 == null) {
         if (var4) {
            return this.u(var3.isSelected() ? Ey_2.i : Ey_2.z);
         }

         var4 = var3.isSelected();
      }

      if (var2 == null) {
         if (var4) {
            if (var3.isEnabled()) {
               return this.u(var3.isRollover() ? Ey_2.L : Ey_2.T);
            }

            return this.u(Ey_2.R);
         }

         var4 = var3.isEnabled();
      }

      return var4 ? this.u(var3.isRollover() ? Ey_2.O : Ey_2.t) : this.u(Ey_2.q);
   }

   protected pF_3 U(JToolBar var1) {
      int[] var2 = com.Lz_2.M();
      boolean var10000 = var1 instanceof xT_3;
      if (var2 == null) {
         if (!var10000) {
            return this.u(var1.isEnabled() ? Ey_2.t : Ey_2.q);
         }

         var10000 = ((xT_3)var1).V();
      }

      return var10000 ? this.u(var1.isEnabled() ? Ey_2.V : Ey_2.W) : this.u(var1.isEnabled() ? Ey_2.t : Ey_2.q);
   }

   public pF_3 r(String var1) {
      return (pF_3)this.N.get(var1);
   }

   public pF_3 u(String var1) {
      int[] var2 = com.Lz_2.M();
      boolean var10000 = var1.equals(Ey_2.t);
      if (var2 == null) {
         if (var10000) {
            Map var23 = this.N;
            String var25 = var1;
            if (var2 == null) {
               if (!this.N.containsKey(var1)) {
                  return null;
               }

               var23 = this.N;
               var25 = var1;
            }

            return (pF_3)var23.get(var25);
         }

         var10000 = var1.equals(Ey_2.O);
      }

      if (var2 == null) {
         if (var10000) {
            com.LC var21 = this;
            if (var2 == null) {
               if (this.N.containsKey(var1)) {
                  return (pF_3)this.N.get(var1);
               }

               var21 = this;
            }

            return var21.u(Ey_2.t);
         }

         var10000 = var1.equals(Ey_2.q);
      }

      if (var2 == null) {
         if (var10000) {
            com.LC var19 = this;
            if (var2 == null) {
               if (this.N.containsKey(var1)) {
                  return (pF_3)this.N.get(var1);
               }

               var19 = this;
            }

            return var19.u(Ey_2.t);
         }

         var10000 = var1.equals(Ey_2.z);
      }

      if (var2 == null) {
         if (var10000) {
            com.LC var17 = this;
            if (var2 == null) {
               if (this.N.containsKey(var1)) {
                  return (pF_3)this.N.get(var1);
               }

               var17 = this;
            }

            return var17.u(Ey_2.T);
         }

         var10000 = var1.equals(Ey_2.T);
      }

      if (var2 == null) {
         if (var10000) {
            com.LC var15 = this;
            if (var2 == null) {
               if (this.N.containsKey(var1)) {
                  return (pF_3)this.N.get(var1);
               }

               var15 = this;
            }

            return var15.u(Ey_2.t);
         }

         var10000 = var1.equals(Ey_2.L);
      }

      if (var2 == null) {
         if (var10000) {
            com.LC var13 = this;
            if (var2 == null) {
               if (this.N.containsKey(var1)) {
                  return (pF_3)this.N.get(var1);
               }

               var13 = this;
            }

            return var13.u(Ey_2.T);
         }

         var10000 = var1.equals(Ey_2.R);
      }

      if (var2 == null) {
         if (var10000) {
            com.LC var11 = this;
            if (var2 == null) {
               if (this.N.containsKey(var1)) {
                  return (pF_3)this.N.get(var1);
               }

               var11 = this;
            }

            return var11.u(Ey_2.T);
         }

         var10000 = var1.equals(Ey_2.i);
      }

      if (var2 == null) {
         if (var10000) {
            com.LC var9 = this;
            if (var2 == null) {
               if (this.N.containsKey(var1)) {
                  return (pF_3)this.N.get(var1);
               }

               var9 = this;
            }

            return var9.u(Ey_2.z);
         }

         var10000 = var1.equals(Ey_2.F);
      }

      if (var2 == null) {
         if (var10000) {
            Map var7 = this.N;
            String var10001 = var1;
            if (var2 == null) {
               if (!this.N.containsKey(var1)) {
                  return null;
               }

               var7 = this.N;
               var10001 = var1;
            }

            return (pF_3)var7.get(var10001);
         }

         var10000 = var1.equals(Ey_2.V);
      }

      if (var2 == null) {
         if (var10000) {
            com.LC var5 = this;
            if (var2 == null) {
               if (this.N.containsKey(var1)) {
                  return (pF_3)this.N.get(var1);
               }

               var5 = this;
            }

            return var5.u(Ey_2.t);
         }

         var10000 = var1.equals(Ey_2.W);
      }

      if (var2 == null) {
         if (!var10000) {
            return null;
         }

         if (var2 != null) {
            return this.u(Ey_2.V);
         }

         var10000 = this.N.containsKey(var1);
      }

      return var10000 ? (pF_3)this.N.get(var1) : this.u(Ey_2.V);
   }

   @Override
   public Dimension d(JComponent var1) {
      int[] var2 = com.Lz_2.M();
      com.LC var10000 = this;
      if (var2 == null) {
         if (this.Q()) {
            Dimension var3 = new Dimension(0, 0);
            Iterator var4 = this.N.values().iterator();

            while (true) {
               if (var4.hasNext()) {
                  pF_3 var5 = (pF_3)var4.next();
                  var5.k(var1);
                  var6 = com.FN.h(var3, var5.R());
                  if (var2 != null) {
                     break;
                  }

                  var3 = var6;
                  if (var2 == null) {
                     continue;
                  }
               }

               var6 = var3;
               break;
            }

            return var6;
         }

         var10000 = this;
      }

      return var10000.d(var1);
   }

   @Override
   public Insets B(JComponent var1) {
      int[] var10000 = com.Lz_2.M();
      Insets var3 = super.B(var1);
      int[] var2 = var10000;
      if (!this.Q()) {
         return var3;
      } else {
         Insets var4 = new Insets(0, 0, 0, 0);
         Iterator var5 = this.N.values().iterator();

         while (true) {
            if (var5.hasNext()) {
               pF_3 var6 = (pF_3)var5.next();
               var6.k(var1);
               var7 = com.FN.Z(var4, var6.U());
               if (var2 != null) {
                  break;
               }

               var4 = var7;
               if (var2 == null) {
                  continue;
               }
            }

            var7 = com.FN.Z(var3, var4);
            break;
         }

         return var7;
      }
   }
}





