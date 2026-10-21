package com.finalshell.ui.panel;

import com.finalshell.core.LI3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class CU3 extends JLabel {
   public boolean e;
   public boolean U;
   public boolean x;
   public boolean r;
   public LI3_2 W;

   public CU3() {
      Registry.lookupField(597442836434941703L).setBoolean(this, false);
      Registry.lookupField(427953968743962803L).setBoolean(this, false);
      Registry.lookupField(498389665108960086L).setBoolean(this, false);
   }

   @Override
   public void paint(Graphics var1) {
      Float var33;
      Float var36;
      Long var39;
      String[] var10000 = F8.y();
      super.paint(var1);
      Graphics2D var3 = (Graphics2D)var1;
      String[] var2 = var10000;
      boolean var31 = Registry.lookupField(597442836434941703L).getBoolean(this);
      if (var2 == null) {
         if (var31) {
            return;
         }

         var31 = Registry.lookupField(498389665108960086L).getBoolean(this);
      }

      label110: {
         if (var2 == null) {
            if (var31) {
               var3.setColor((Color)Registry.lookupField(591222373387230919L).get(null));
               Object var11 = 148570893766943457L;
               Ref.g(148570893766943457L, var11);
               Object var10002 = Registry.emptyArgs();
               long var14 = 331249694259892086L;
               Object var13 = var10002;
               var10002 = Ref.h(331249694259892086L, var13, var14);

               try {
                  var33 = (Float)var10002;
               } catch (InvocationTargetException var25) {
                  throw var25.getTargetException();
               }

               double var4 = (double)(var33 * 0.01F);
               byte var6 = 3;
               byte var7 = 0;
               byte var8 = 5;
               int var9 = (int)((double)((float)this.getWidth() - (float)var8) * var4) + var7;
               Object var15 = 148570893766943457L;
               Ref.g(148570893766943457L, var15);
               Object var10004 = Registry.emptyArgs();
               long var18 = 225195147661966806L;
               Object var17 = var10004;
               var10004 = Ref.h(225195147661966806L, var17, var18);

               try {
                  var39 = (Long)var10004;
               } catch (InvocationTargetException var24) {
                  throw var24.getTargetException();
               }

               long var41;
               var40 = (var41 = var39 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
               label96:
               if (var2 == null) {
                  if (var40 > 0) {
      int var40;
                     var40 = var9;
                     if (var2 != null) {
                        break label96;
                     }

                     if (var9 == 0) {
                        var9 = 1;
                     }
                  }

                  double var42;
                  var40 = (var42 = var4 - 0.0) == 0.0 ? 0 : (var42 < 0.0 ? -1 : 1);
               }

               label89: {
                  if (var40 > 0) {
                     var3.fillRect(this.getWidth() - var9, var6, var9, this.getHeight() - 2 * var6);
                     if (var2 == null) {
                        break label89;
                     }
                  }

                  var3.setColor((Color)Registry.lookupField(591222373387230919L).get(null));
                  var3.fillRect(this.getWidth() - var9, var6, var9, this.getHeight() - 2 * var6);
               }

               if (var2 == null) {
                  return;
               }
            }

            if (var2 != null) {
               break label110;
            }

            var31 = Registry.lookupField(427953968743962803L).getBoolean(this);
         }

         if (!var31) {
            return;
         }

         var3.setColor((Color)Registry.lookupField(234687022816751977L).get(null));
      }

      Object var19 = 148570893766943457L;
      Ref.g(148570893766943457L, var19);
      Object var34 = Registry.emptyArgs();
      long var22 = 218205101142805647L;
      Object var21 = var34;
      var34 = Ref.h(218205101142805647L, var21, var22);

      try {
         var36 = (Float)var34;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      byte var5;
      float var26;
      int var29;
      var26 = var36 * 0.01F;
      var5 = 3;
      byte var27 = 0;
      byte var28 = 5;
      var29 = (int)(((float)this.getWidth() - (float)var28) * var26) + var27;
      float var43;
      var37 = (var43 = var26 - 0.0F) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
      label72:
      if (var2 == null) {
         if (var37 > 0) {
            var37 = var29;
            if (var2 != null) {
               break label72;
            }

            if (var29 == 0) {
               var29 = 1;
            }
         }

         var37 = var5;
      }

      int var30 = var37;
      if (var2 == null) {
         if (var26 > 0.0F) {
            var3.fillRect(this.getWidth() - var29, var30, var29, this.getHeight() - 2 * var5);
            if (var2 == null) {
               return;
            }
         }

         var3.setColor((Color)Registry.lookupField(234687022816751977L).get(null));
      }

      var3.fillRect(this.getWidth() - var29, var30, var29, this.getHeight() - 2 * var5);
   }

   public boolean Y() {
      return Registry.lookupField(561413895985324618L).getBoolean(this);
   }

   public void L(boolean var1) {
      Registry.lookupField(561413895985324618L).setBoolean(this, var1);
   }

   public boolean D() {
      return Registry.lookupField(597442836434941703L).getBoolean(this);
   }

   public void x(boolean var1) {
      Registry.lookupField(597442836434941703L).setBoolean(this, var1);
   }

   public LI3_2 x() {
      Object var1 = 148570893766943457L;
      return (LI3_2)Ref.g(148570893766943457L, var1);
   }

   public void n(LI3_2 var1) {
      long var3 = 148570893766943457L;
      Ref.s(148570893766943457L, var1, var3);
   }

   public boolean d() {
      return Registry.lookupField(427953968743962803L).getBoolean(this);
   }

   public void w(boolean var1) {
      Registry.lookupField(427953968743962803L).setBoolean(this, var1);
   }

   public boolean W() {
      return Registry.lookupField(498389665108960086L).getBoolean(this);
   }

   public void Z(boolean var1) {
      Registry.lookupField(498389665108960086L).setBoolean(this, var1);
   }

   public LI3_2 w() {
      Object var1 = 148570893766943457L;
      return (LI3_2)Ref.g(148570893766943457L, var1);
   }

   public void i(LI3_2 var1) {
      long var3 = 148570893766943457L;
      Ref.s(148570893766943457L, var1, var3);
   }
}





