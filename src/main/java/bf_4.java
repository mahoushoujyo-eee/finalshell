import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bf_4 extends MouseAdapter {
   final n_2 G;
   final JR C;

   bf_4(JR var1, n_2 var2) {
      this.C = var1;
      this.G = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var3 = ((JR)com.c.c(635938733199465863L).get(this)).columnAtPoint(var1.getPoint());
      com.ky_4[] var10000 = kA_3.y();
      int var4 = ((JR)com.c.c(635938733199465863L).get(this)).convertColumnIndexToModel(var3);
      String var5 = ((JR)com.c.c(635938733199465863L).get(this)).getColumnName(var3);
      com.ky_4[] var2 = var10000;
      var10000 = (com.ky_4[])com.c.c(319342635679894398L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(589871071857415373L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var11 = var10003;

      try {
         var12 = (Integer)var11.invoke(var10001, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      int var6 = var12;
      int var13 = var4;
      if (var2 == null) {
         if (var4 == 0) {
            if (var6 == com.c.c(189389645615350517L).getInt(null)) {
               return;
            }

            var10000 = (com.ky_4[])com.c.c(319342635679894398L).get(this);
            var10001 = com.c.a(com.c.c(189389645615350517L).getInt(null));
            var10003 = com.c.d(294889698174931697L);
            var10002 = var10001;
            var10001 = var10000;
            Method var15 = var10003;

            try {
               var15.invoke(var10001, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            if (var2 == null) {
               return;
            }
         }

         var13 = var4;
      }

      int var21 = 1;
      if (var2 == null) {
         if (var13 != 1) {
            return;
         }

         var13 = var6;
         var21 = com.c.c(149407827136588388L).getInt(null);
      }

      if (var13 != var21) {
         var10000 = (com.ky_4[])com.c.c(319342635679894398L).get(this);
         var10001 = com.c.a(com.c.c(149407827136588388L).getInt(null));
         var10003 = com.c.d(294889698174931697L);
         var10002 = var10001;
         var10001 = var10000;
         Method var17 = var10003;

         try {
            var17.invoke(var10001, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }
   }
}





