import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

class dR_3 implements FocusListener {
   boolean r;
   final JTextComponent O;

   dR_3(JTextComponent var1) {
      this.O = var1;
      com.c.c(404708917332303584L).setBoolean(this, false);
   }

   @Override
   public void focusLost(FocusEvent var1) {
      label25: {
         String[] var2 = F8.y();
         if (var2 == null) {
            Object[] var10000 = com.c.f();
            Method var4 = com.c.d(310867573767805863L);
            Object[] var7 = var10000;
            Object var6 = null;

            try {
               var10000 = (YJ)var4.invoke(var6, var7);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }

            if (var10000.isVisible()) {
               break label25;
            }

            com.c.c(404708917332303584L).setBoolean(this, false);
         }

         if (var2 == null) {
            return;
         }
      }

      com.c.c(404708917332303584L).setBoolean(this, true);
   }

   @Override
   public void focusGained(FocusEvent var1) {
      String[] var2;
      boolean var6;
      label48: {
         boolean var3;
         label51: {
            String[] var10000 = F8.y();
            var3 = false;
            var2 = var10000;
            Component var5 = var1.getOppositeComponent();
            if (var2 == null) {
               if (var5 == null) {
                  break label51;
               }

               var5 = var1.getOppositeComponent();
            }

            var6 = var5.getClass().equals(JRootPane.class);
            if (var2 != null) {
               break label48;
            }

            if (!var6) {
               var3 = true;
            }
         }

         var6 = var3;
      }

      if (var2 == null) {
         if (!var6) {
            return;
         }

         Object[] var7 = com.c.a(com.c.c(442490695944429197L).get(this));
         Method var8 = com.c.d(620575814828970493L);
         Object[] var10 = var7;
         Object var9 = null;

         try {
            var6 = (Boolean)var8.invoke(var9, var10);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }

      if (var2 == null) {
         if (!var6) {
            return;
         }

         var6 = com.c.c(404708917332303584L).getBoolean(this);
      }

      if (!var6) {
         SwingUtilities.invokeLater(new Tk_2(this));
      }
   }
}





