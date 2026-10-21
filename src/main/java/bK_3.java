import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bK_3 implements ActionListener {
   final U I;
   private static final long a;

   bK_3(U var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var10000 = F8.y();
      Object[] var10001 = com.c.f();
      Method var13 = com.c.d(270389152141252877L);
      Object[] var27 = var10001;
      Object var21 = null;

      try {
         var10001 = (Object[])var13.invoke(var21, var27);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var21 = com.c.f();
      Method var10004 = com.c.d(284609497308396758L);
      var27 = (Object[])var21;
      var21 = var10001;
      Method var15 = var10004;

      try {
         var15.invoke(var21, var27);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      label48: {
         String[] var2 = var10000;
         C5 var9 = (C5)com.c.c(222367947831078517L).get(null);
         if (var2 == null) {
            if (!var9.isVisible()) {
               break label48;
            }

            var9 = (C5)com.c.c(222367947831078517L).get(null);
         }

         var9.setVisible(false);
         if (var2 == null) {
            return;
         }
      }

      long var10 = System.currentTimeMillis();
      var10001 = (Object[])com.c.c(222367947831078517L).get(null);
      var21 = com.c.f();
      var10004 = com.c.d(134055940149281481L);
      var27 = (Object[])var21;
      var21 = var10001;
      Method var17 = var10004;

      try {
         var18 = (Long)var17.invoke(var21, var27);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      long var3 = var10 - var18;
      if (var3 > a) {
         var10000 = (String[])com.c.c(220616095453048644L).get(this);
         var10001 = com.c.f();
         Method var30 = com.c.d(402347743199818669L);
         var21 = var10001;
         var10001 = var10000;
         Method var12 = var30;

         try {
            var12.invoke(var10001, (Object[])var21);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }

   static {
      long var0 = 7221976951569528976L;
      long var10002 = 7221976951569528938L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





