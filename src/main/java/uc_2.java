import com._y_2;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public class Uc_2 {
   BufferedImage K;
   BufferedImage u;
   HashMap N;
   HashMap t;
   HashMap s;
   HashMap T;
   HashSet X;
   int F;
   int U;

   public Uc_2() {
      com.c.c(245071723849229959L).set(this, new HashMap());
      com.c.c(139412945941179877L).set(this, new HashMap());
      com.c.c(279324076707364922L).set(this, new HashMap());
      com.c.c(137749546150850589L).set(this, new HashMap());
      com.c.c(236986923043582334L).set(this, new HashSet());
   }

   public void q() {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(514459637192101058L);
      Object[] var10002 = var10001;
      Uc_2 var22 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var22, var10002);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      BufferedImage var2;
      BufferedImage var3;
      RenderingHints var4;
      int var9;
      int var10;
      int var18;
      int var19;
      label39: {
         var2 = _y_2.z;
         var3 = _y_2.Y;
         var4 = _y_2.n;
         int var5 = var2.getWidth();
         int var6 = var2.getHeight();
         String[] var20 = F8.y();
         float var7 = (float)var5 / (float)var6;
         String[] var1 = var20;
         float var8 = (float)com.c.c(331345675446116425L).getInt(this) / (float)com.c.c(224601074955414455L).getInt(this);
         boolean var11 = false;
         boolean var12 = false;
         float var37;
         int var21 = (var37 = var7 - var8) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
         if (var1 == null) {
            if (var21 > 0) {
               var10 = com.c.c(224601074955414455L).getInt(this);
               var9 = (int)(var7 * (float)com.c.c(224601074955414455L).getInt(this));
               var18 = -(var9 - com.c.c(331345675446116425L).getInt(this)) / 2;
               var19 = 0;
               if (var1 == null) {
                  break label39;
               }
            }

            var21 = com.c.c(331345675446116425L).getInt(this);
         }

         var9 = var21;
         var10 = (int)((float)com.c.c(331345675446116425L).getInt(this) / var7);
         var19 = -(var10 - com.c.c(224601074955414455L).getInt(this)) / 2;
         var18 = 0;
      }

      var10001 = com.c.a(com.c.c(331345675446116425L).getInt(this), com.c.c(224601074955414455L).getInt(this));
      Method var24 = com.c.d(401056956354921780L);
      Object[] var34 = var10001;
      var10002 = null;

      try {
         var10001 = (Object[])var24.invoke(var10002, var34);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      com.c.c(397735871884542340L).set(this, var10001);
      Graphics2D var13 = (Graphics2D)((BufferedImage)com.c.c(397735871884542340L).get(this)).getGraphics();
      var13.setRenderingHints(var4);
      var13.drawImage(var3, var18, var19, var9, var10, null);
      var13.dispose();
      var10001 = com.c.a(com.c.c(331345675446116425L).getInt(this), com.c.c(224601074955414455L).getInt(this));
      Method var27 = com.c.d(401056956354921780L);
      Object[] var36 = var10001;
      var10002 = null;

      try {
         var10001 = (Object[])var27.invoke(var10002, var36);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      com.c.c(413300341277906215L).set(this, var10001);
      Graphics2D var14 = (Graphics2D)((BufferedImage)com.c.c(413300341277906215L).get(this)).getGraphics();
      var14.setRenderingHints(var4);
      var14.drawImage(var2, var18, var19, var9, var10, null);
      var14.dispose();
   }

   public void E() {
      Uc_2 var3;
      label23: {
         String[] var10000 = F8.y();
         ((HashMap)com.c.c(245071723849229959L).get(this)).clear();
         String[] var1 = var10000;
         ((HashMap)com.c.c(139412945941179877L).get(this)).clear();
         ((HashMap)com.c.c(279324076707364922L).get(this)).clear();
         ((HashMap)com.c.c(137749546150850589L).get(this)).clear();
         BufferedImage var2 = (BufferedImage)com.c.c(397735871884542340L).get(this);
         if (var1 == null) {
            if (var2 != null) {
               ((BufferedImage)com.c.c(397735871884542340L).get(this)).getGraphics().dispose();
            }

            var3 = this;
            if (var1 != null) {
               break label23;
            }

            var2 = (BufferedImage)com.c.c(413300341277906215L).get(this);
         }

         if (var2 != null) {
            ((BufferedImage)com.c.c(413300341277906215L).get(this)).getGraphics().dispose();
         }

         com.c.c(397735871884542340L).set(this, null);
         var3 = this;
      }

      com.c.c(413300341277906215L).set(var3, null);
   }

   public void a() {
      ((HashSet)com.c.c(236986923043582334L).get(this)).clear();
   }

   public void T(int var1) {
      ((HashSet)com.c.c(236986923043582334L).get(this)).add(var1);
   }

   public void P(int var1) {
      ((HashSet)com.c.c(236986923043582334L).get(this)).remove(var1);
   }

   public int M() {
      return ((HashSet)com.c.c(236986923043582334L).get(this)).size();
   }

   public BufferedImage V() {
      return (BufferedImage)com.c.c(397735871884542340L).get(this);
   }

   public void D(BufferedImage var1) {
      com.c.c(397735871884542340L).set(this, var1);
   }

   public BufferedImage D() {
      return (BufferedImage)com.c.c(413300341277906215L).get(this);
   }

   public void s(BufferedImage var1) {
      com.c.c(413300341277906215L).set(this, var1);
   }

   public HashMap S() {
      return (HashMap)com.c.c(245071723849229959L).get(this);
   }

   public HashMap g() {
      return (HashMap)com.c.c(139412945941179877L).get(this);
   }

   public HashMap u() {
      return (HashMap)com.c.c(279324076707364922L).get(this);
   }

   public HashMap o() {
      return (HashMap)com.c.c(137749546150850589L).get(this);
   }
}





