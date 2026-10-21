import java.awt.Graphics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

public class JO extends JLabel implements D2 {
   lt_4 D;
   private static int[] p;

   public JO() {
      z();
      super();
      com.c.c(143260386411168928L).set(this, new lt_4(this, this));
      this.setOpaque(false);
      if (com.ky_4.F() != null) {
         X(new int[4]);
      }
   }

   public JO(String var1) {
      int[] var10000 = z();
      super(var1);
      int[] var2 = var10000;
      com.c.c(143260386411168928L).set(this, new lt_4(this, this));
      this.setOpaque(false);
      if (var2 == null) {
         com.ky_4.K(new String[4]);
      }
   }

   @Override
   public void paintComponent(Graphics var1) {
      label29: {
         int[] var2 = z();
         if (var2 != null) {
            if (!com.c.c(413132319533195410L).getBoolean(null)) {
               break label29;
            }

            Method var10000 = (Method)com.c.c(143260386411168928L).get(this);
            Object[] var10001 = com.c.a(var1);
            Method var10003 = com.c.d(478374544918577864L);
            Object[] var10002 = var10001;
            var10001 = var10000;
            var10000 = var10003;

            try {
               var10000.invoke(var10001, var10002);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }
         }

         if (var2 != null) {
            return;
         }
      }

      Object[] var8 = com.c.a(var1);
      Method var11 = com.c.d(518428765726666319L);
      Object[] var10 = var8;
      JO var9 = this;
      Method var6 = var11;

      try {
         var6.invoke(var9, var10);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public void h(Graphics var1) {
      super.paintComponent(var1);
   }

   public static void X(int[] var0) {
      p = var0;
   }

   public static int[] z() {
      return p;
   }

   static {
      if (z() == null) {
         X(new int[2]);
      }
   }
}





