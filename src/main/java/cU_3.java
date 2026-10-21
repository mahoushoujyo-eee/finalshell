import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

public class cU_3 extends JLabel {
   boolean e;
   boolean U;
   boolean x;
   boolean r;
   lI_3 W;

   public cU_3() {
      com.c.c(597442836434941703L).setBoolean(this, false);
      com.c.c(427953968743962803L).setBoolean(this, false);
      com.c.c(498389665108960086L).setBoolean(this, false);
   }

   @Override
   public void paint(Graphics var1) {
      String[] var10000 = F8.y();
      super.paint(var1);
      Graphics2D var3 = (Graphics2D)var1;
      String[] var2 = var10000;
      boolean var19 = com.c.c(597442836434941703L).getBoolean(this);
      if (var2 == null) {
         if (var19) {
            return;
         }

         var19 = com.c.c(498389665108960086L).getBoolean(this);
      }

      label110: {
         if (var2 == null) {
            if (var19) {
               var3.setColor((Color)com.c.c(591222373387230919L).get(null));
               var10000 = (String[])com.c.c(148570893766943457L).get(this);
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(331249694259892086L);
               Object[] var10002 = var10001;
               var10001 = var10000;
               Method var21 = var10003;

               try {
                  var22 = (Float)var21.invoke(var10001, var10002);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               double var4 = (double)(var22 * 0.01F);
               byte var6 = 3;
               byte var7 = 0;
               byte var8 = 5;
               int var9 = (int)((double)((float)this.getWidth() - (float)var8) * var4) + var7;
               var10000 = (String[])com.c.c(148570893766943457L).get(this);
               var10001 = com.c.f();
               var10003 = com.c.d(225195147661966806L);
               var10002 = var10001;
               var10001 = var10000;
               Method var24 = var10003;

               try {
                  var25 = (Long)var24.invoke(var10001, var10002);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               long var41;
               var26 = (var41 = var25 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
               label96:
               if (var2 == null) {
                  if (var26 > 0) {
                     var26 = var9;
                     if (var2 != null) {
                        break label96;
                     }

                     if (var9 == 0) {
                        var9 = 1;
                     }
                  }

                  double var42;
                  var26 = (var42 = var4 - 0.0) == 0.0 ? 0 : (var42 < 0.0 ? -1 : 1);
               }

               label89: {
                  if (var26 > 0) {
                     var3.fillRect(this.getWidth() - var9, var6, var9, this.getHeight() - 2 * var6);
                     if (var2 == null) {
                        break label89;
                     }
                  }

                  var3.setColor((Color)com.c.c(591222373387230919L).get(null));
                  var3.fillRect(this.getWidth() - var9, var6, var9, this.getHeight() - 2 * var6);
               }

               if (var2 == null) {
                  return;
               }
            }

            var27 = this;
            if (var2 != null) {
               break label110;
            }

            var19 = com.c.c(427953968743962803L).getBoolean(this);
         }

         if (!var19) {
            return;
         }

         var3.setColor((Color)com.c.c(234687022816751977L).get(null));
         var27 = this;
      }

      var10000 = (String[])com.c.c(148570893766943457L).get(var27);
      Object[] var35 = com.c.f();
      Method var40 = com.c.d(218205101142805647L);
      Object[] var38 = var35;
      var35 = var10000;
      Method var29 = var40;

      try {
         var30 = (Float)var29.invoke(var35, var38);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      byte var5;
      float var14;
      int var17;
      var14 = var30 * 0.01F;
      var5 = 3;
      byte var15 = 0;
      byte var16 = 5;
      var17 = (int)(((float)this.getWidth() - (float)var16) * var14) + var15;
      float var43;
      var31 = (var43 = var14 - 0.0F) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
      label72:
      if (var2 == null) {
         if (var31 > 0) {
            var31 = var17;
            if (var2 != null) {
               break label72;
            }

            if (var17 == 0) {
               var17 = 1;
            }
         }

         var31 = var5;
      }

      int var18 = var31;
      if (var2 == null) {
         if (var14 > 0.0F) {
            var3.fillRect(this.getWidth() - var17, var18, var17, this.getHeight() - 2 * var5);
            if (var2 == null) {
               return;
            }
         }

         var3.setColor((Color)com.c.c(234687022816751977L).get(null));
      }

      var3.fillRect(this.getWidth() - var17, var18, var17, this.getHeight() - 2 * var5);
   }

   public boolean Y() {
      return com.c.c(561413895985324618L).getBoolean(this);
   }

   public void L(boolean var1) {
      com.c.c(561413895985324618L).setBoolean(this, var1);
   }

   public boolean D() {
      return com.c.c(597442836434941703L).getBoolean(this);
   }

   public void x(boolean var1) {
      com.c.c(597442836434941703L).setBoolean(this, var1);
   }

   public lI_3 x() {
      return (lI_3)com.c.c(148570893766943457L).get(this);
   }

   public void n(lI_3 var1) {
      com.c.c(148570893766943457L).set(this, var1);
   }

   public boolean d() {
      return com.c.c(427953968743962803L).getBoolean(this);
   }

   public void w(boolean var1) {
      com.c.c(427953968743962803L).setBoolean(this, var1);
   }

   public boolean W() {
      return com.c.c(498389665108960086L).getBoolean(this);
   }

   public void Z(boolean var1) {
      com.c.c(498389665108960086L).setBoolean(this, var1);
   }

   public lI_3 w() {
      return (lI_3)com.c.c(148570893766943457L).get(this);
   }

   public void i(lI_3 var1) {
      com.c.c(148570893766943457L).set(this, var1);
   }
}





