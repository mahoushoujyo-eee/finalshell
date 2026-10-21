import java.awt.Dimension;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JComponent;

class YS implements Runnable {
   final gE C;
   private static final long a;

   YS(gE var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      String[] var10000 = aM.s();
      JComponent var2 = (JComponent)((aM)com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this))).getParent();
      String[] var1 = var10000;
      if (var2 != null) {
         Dimension var3;
         int var11;
         label32: {
            var3 = ((aM)com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this))).getPreferredSize();
            Dimension var4 = ((aM)com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this))).getSize();
            Insets var5 = ((aM)com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this)))
               .getBorder()
               .getBorderInsets((aM)com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this)));
            var11 = var5.bottom + var5.top;
            int var13 = ((ArrayList)com.c.c(417119238929760524L).get(com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this)))).size();
            if (var1 == null) {
               if (var13 > 0) {
                  t3_2 var7 = (t3_2)((ArrayList)com.c.c(417119238929760524L).get(com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this))))
                     .get(((ArrayList)com.c.c(417119238929760524L).get(com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this)))).size() - 1);
                  Object[] var10001 = com.c.f();
                  Method var10003 = com.c.d(584096728105558414L);
                  Object[] var10002 = var10001;
                  t3_2 var18 = var7;
                  Method var14 = var10003;

                  try {
                     var15 = (Bq_2)var14.invoke(var18, var10002);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }

                  Bq_2 var8 = var15;
                  var11 = (int)((double)var11 + var8.getLocation().getY() + (double)var8.getHeight());
                  if (var1 == null) {
                     break label32;
                  }
               }

               var13 = (int)var3.getHeight();
            }

            var11 = var13;
         }

         Dimension var12 = new Dimension((int)var3.getWidth(), (int)a);
         var12.setSize((int)var3.getWidth(), var11);
         ((aM)com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this))).setMinimumSize(var12);
         var2.validate();
         var2.revalidate();
         var2.doLayout();
         var2.repaint();
         var10000 = (String[])com.c.c(360214337880907660L).get(com.c.c(328471596695417534L).get(this));
         Object[] var19 = com.c.f();
         Method var22 = com.c.d(174626021968043090L);
         Object[] var21 = var19;
         var19 = var10000;
         Method var17 = var22;

         try {
            var17.invoke(var19, var21);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }
      }
   }

   static {
      long var0 = 1129047837595683427L;
      long var10002 = 1341826856811252305L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





