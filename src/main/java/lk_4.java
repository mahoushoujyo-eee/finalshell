import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class lk_4 implements MouseListener {
   final FK d;

   lk_4(FK var1) {
      this.d = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var10000 = FK.i();
      int var3 = ((tq_4)com.c.c(618427502576624312L).get(com.c.c(489298198098055579L).get(this))).getSelectedRow();
      com.c.c(461146548297071424L).setBoolean(com.c.c(489298198098055579L).get(this), false);
      String[] var2 = var10000;
      int var13 = var3;
      if (var2 == null) {
         if (var3 <= -1) {
            return;
         }

         var13 = ((tq_4)com.c.c(618427502576624312L).get(com.c.c(489298198098055579L).get(this))).convertRowIndexToModel(var3);
      }

      int var4 = var13;
      var10000 = (String[])com.c.c(598800499692003827L).get(com.c.c(489298198098055579L).get(this));
      Object[] var10001 = com.c.a(var4, 0);
      Method var10003 = com.c.d(130061847059020450L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var15 = var10003;

      try {
         var10000 = (String[])var15.invoke(var10001, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      L1 var5 = (L1)var10000;
      FK var17 = (FK)com.c.c(489298198098055579L).get(this);
      if (var2 == null) {
         com.c.c(251701947004354642L).setLong(var17, System.currentTimeMillis());
         if (var1.getButton() != 1) {
            return;
         }

         var17 = (FK)com.c.c(489298198098055579L).get(this);
      }

      int var32 = ((tq_4)com.c.c(618427502576624312L).get(com.c.c(489298198098055579L).get(this))).getRowCount() - var4;
      if (var2 == null) {
         var32 = var32 < com.c.c(231094135750452722L).getInt(null) ? 1 : 0;
      }

      label84: {
         com.c.c(461146548297071424L).setBoolean(var17, (boolean)var32);
         if (var2 == null) {
            Object[] var18 = com.c.f();
            Method var19 = com.c.d(270389152141252877L);
            var10002 = var18;
            var10001 = null;

            try {
               var10000 = (String[])var19.invoke(var10001, var10002);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            var10001 = com.c.f();
            var10003 = com.c.d(163462326892114024L);
            var10002 = var10001;
            var10001 = var10000;
            Method var21 = var10003;

            try {
               var10000 = (String[])var21.invoke(var10001, var10002);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            var10001 = com.c.f();
            var10003 = com.c.d(633712494917113170L);
            var10002 = var10001;
            var10001 = var10000;
            Method var23 = var10003;

            try {
               var24 = (Boolean)var23.invoke(var10001, var10002);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            if (!var24) {
               var25 = (FK)com.c.c(489298198098055579L).get(this);
               if (var2 != null) {
                  break label84;
               }

               if (((tq_4)com.c.c(618427502576624312L).get(var25)).getRowCount() - var4 > com.c.c(231094135750452722L).getInt(null)) {
                  Object[] var28 = com.c.f();
                  Method var29 = com.c.d(128283426706089385L);
                  var10002 = var28;
                  var10001 = null;

                  try {
                     var29.invoke(var10001, var10002);
                     return;
                  } catch (InvocationTargetException var6) {
                     throw var6.getTargetException();
                  }
               }
            }

            var10000 = (String[])com.c.c(489298198098055579L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(496821856781947383L);
            var10002 = var10001;
            var10001 = var10000;
            Method var27 = var10003;

            try {
               var27.invoke(var10001, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }
         }

         var25 = (FK)com.c.c(489298198098055579L).get(this);
      }

      var10001 = com.c.a(var5);
      var10003 = com.c.d(345502075173010592L);
      var10002 = var10001;
      FK var44 = var25;
      Method var30 = var10003;

      try {
         var30.invoke(var44, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





