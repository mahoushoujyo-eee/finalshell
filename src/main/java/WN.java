import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class WN extends MouseAdapter {
   final Uo_2 w;

   WN(Uo_2 var1) {
      this.w = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var3 = ((Uo_2)com.c.c(178668013303736722L).get(this)).columnAtPoint(var1.getPoint());
      int var10000 = Uo_2.i();
      String var4 = ((Uo_2)com.c.c(178668013303736722L).get(this)).getColumnName(var3);
      boolean var2 = (boolean)var10000;
      Object[] var14 = com.c.f();
      Method var15 = com.c.d(270389152141252877L);
      Object[] var46 = var14;
      Object var30 = null;

      try {
         var16 = var15.invoke(var30, var46);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var30 = com.c.f();
      Method var10003 = com.c.d(634817973682994708L);
      var46 = (Object[])var30;
      var30 = var16;
      Method var17 = var10003;

      try {
         var18 = var17.invoke(var30, var46);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var30 = com.c.f();
      var10003 = com.c.d(240567170779145617L);
      var46 = (Object[])var30;
      var30 = var18;
      Method var19 = var10003;

      try {
         var20 = var19.invoke(var30, var46);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var30 = com.c.f();
      var10003 = com.c.d(226341449505323490L);
      var46 = (Object[])var30;
      var30 = var20;
      Method var21 = var10003;

      try {
         var22 = var21.invoke(var30, var46);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var30 = com.c.f();
      var10003 = com.c.d(153346140499032202L);
      var46 = (Object[])var30;
      var30 = var22;
      Method var23 = var10003;

      try {
         var24 = var23.invoke(var30, var46);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var30 = com.c.f();
      var10003 = com.c.d(588059759001940511L);
      var46 = (Object[])var30;
      var30 = var24;
      Method var25 = var10003;

      try {
         var26 = (n_2)var25.invoke(var30, var46);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      n_2 var5 = var26;
      var10000 = var3;
      byte var41 = 2;
      if (!var2) {
         if (var3 == 2) {
            if (com.c.c(532627492453842802L).getInt(com.c.c(178668013303736722L).get(this)) == 2) {
               return;
            }

            var30 = com.c.a(com.c.c(189389645615350517L).getInt(null));
            var10003 = com.c.d(294889698174931697L);
            var46 = (Object[])var30;
            var30 = var5;
            Method var28 = var10003;

            try {
               var28.invoke(var30, var46);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            if (!var2) {
               return;
            }
         }

         var10000 = var3;
         var41 = 3;
      }

      if (!var2) {
         if (var10000 != var41) {
            return;
         }

         var10000 = com.c.c(532627492453842802L).getInt(com.c.c(178668013303736722L).get(this));
         var41 = 3;
      }

      if (var10000 != var41) {
         var30 = com.c.a(com.c.c(149407827136588388L).getInt(null));
         var10003 = com.c.d(294889698174931697L);
         var46 = (Object[])var30;
         var30 = var5;
         Method var29 = var10003;

         try {
            var29.invoke(var30, var46);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }
}





