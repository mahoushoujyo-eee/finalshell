package com.finalshell.ui.panel;

import com.finalshell.core.TT;
import com.finalshell.core.W2_3;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;

public class Qt2 extends Ky4 {
   public Qt2() {
      this(new TT());
   }

   public Qt2(LayoutManager var1) {
      super(var1);
      this.setOpaque(false);
   }

   public TT V() {
      return (TT)this.getLayout();
   }

   public void V(LayoutManager var1) {
      this.V().S(var1);
   }

   public void C(LayoutManager var1) {
      this.V().X(var1);
   }

   public void s() {
      this.removeAll();
      this.setVisible(false);
   }

   public void h(QX var1) {
      var1.X();
      this.setBounds(new Rectangle(0, 0, this.getParent().getWidth(), this.getParent().getHeight()));
      this.add(var1, 0);
      this.setVisible(true);
      var1.revalidate();
      var1.repaint();
   }

   public void S(QX var1) {
      QX var4;
      label24: {
         String[] var2 = QX.Y();
         Object var10000 = var1;
         if (var2 == null) {
            if (!var1.isShowing()) {
               return;
            }

            var4 = var1;
            if (var2 != null) {
               break label24;
            }

            var10000 = var1.getParent();
         }

         if (var10000 != this) {
            return;
         }

         var1.e();
         var4 = var1;
      }

      Rectangle var3 = var4.getBounds();
      this.remove(var1);
      this.revalidate();
      this.repaint(var3);
   }

   @Override
   public boolean contains(int var1, int var2) {
      String[] var10000 = QX.Y();
      Component[] var4 = this.getComponents();
      int var5 = var4.length;
      String[] var3 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            Component var7 = var4[var6];
            Point var8 = var7.getLocation();
            var10 = var7 instanceof W2_3;
            if (var3 != null) {
               break;
            }

            label62: {
               if (var3 == null) {
                  if (var10) {
                     label64: {
                        Shape var9 = ((W2_3)var7).B();
                        Shape var11 = var9;
                        if (var3 == null) {
                           if (var9 == null) {
                              break label64;
                           }

                           var11 = var9;
                        }

                        boolean var12 = var11.contains((double)(var1 - var8.x), (double)(var2 - var8.y));
                        if (var3 != null) {
                           return var12;
                        }

                        if (var12) {
                           return true;
                        }
                     }

                     if (var3 == null) {
                        break label62;
                     }
                  }

                  var10 = var7.getBounds().contains(var1, var2);
               }

               if (var3 != null) {
                  return var10;
               }

               if (var10) {
                  return true;
               }
            }

            var6++;
            if (var3 == null) {
               continue;
            }
         }

         var10 = false;
         break;
      }

      return var10;
   }

   public boolean J(int var1, int var2) {
      return super.contains(var1, var2);
   }
}





