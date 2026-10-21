import com.ne_4;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class yE_3 implements Runnable {
   final String t;
   final aJ I;
   final nj_2 R;

   yE_3(nj_2 var1, String var2, aJ var3) {
      this.R = var1;
      this.t = var2;
      this.I = var3;
   }

   @Override
   public void run() {
      String[] var10000 = F8.y();
      String var2 = (String)com.c.c(544368388325236100L).get(this);
      String[] var1 = var10000;
      var10000 = (String[])com.c.c(492207895670547820L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(606838486540289950L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var8 = var10003;

      try {
         var8.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      ((nj_2)com.c.c(583933236218406261L).get(this)).repaint();
      var10000 = (String[])com.c.c(257294914128163735L).get(com.c.c(354859781990372885L).get(com.c.c(583933236218406261L).get(this)));
      var10001 = com.c.f();
      var10003 = com.c.d(149160680229662748L);
      var10002 = var10001;
      var10001 = var10000;
      Method var10 = var10003;

      try {
         var10000 = (String[])var10.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(615229640085119640L);
      var10002 = var10001;
      var10001 = var10000;
      Method var12 = var10003;

      try {
         var12.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      nj_2 var13 = (nj_2)com.c.c(583933236218406261L).get(this);
      if (var1 == null) {
         com.c.c(576761866492028513L).setBoolean(var13, false);
         if (var2.equals(((ne_4)com.c.c(503453149395465632L).get(com.c.c(583933236218406261L).get(this))).getText().trim())) {
            return;
         }

         var13 = (nj_2)com.c.c(583933236218406261L).get(this);
      }

      var10001 = com.c.f();
      var10003 = com.c.d(428473676051130971L);
      var10002 = var10001;
      nj_2 var21 = var13;
      Method var14 = var10003;

      try {
         var14.invoke(var21, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





