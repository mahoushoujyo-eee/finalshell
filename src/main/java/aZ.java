import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class aZ implements ActionListener {
   final nx_2 H;

   aZ(nx_2 var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      File var10000;
      Method var10002 = (Method)com.c.c(450156560726681374L).get(com.c.c(238068443595657962L).get(this));
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(605430732347023634L);
      Object[] var10004 = var10003;
      var10003 = var10002;
      var10002 = var10005;

      try {
         var37 = (String)var10002.invoke(var10003, var10004);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10000 = new File(var37);
      Object[] var11 = com.c.a(var10000.getName());
      Method var12 = com.c.d(353935338506646766L);
      Object[] var39 = var11;
      Object var25 = null;

      try {
         var13 = (String)var12.invoke(var25, var39);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      String var2 = var13;
      Method var14 = (Method)com.c.c(571912682165835448L).get(com.c.c(238068443595657962L).get(this));
      var25 = com.c.f();
      Method var47 = com.c.d(339037510611298074L);
      Object[] var40 = (Object[])var25;
      var25 = var14;
      var14 = var47;

      try {
         var16 = (ArrayList)var14.invoke(var25, var40);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      ArrayList var3 = var16;
      var3.add(var2);
      Object[] var17 = com.c.f();
      var14 = com.c.d(270389152141252877L);
      Object[] var42 = var17;
      var25 = null;

      try {
         var14 = (Method)var14.invoke(var25, var42);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var25 = com.c.f();
      Method var48 = com.c.d(578864097947885485L);
      Object[] var43 = (Object[])var25;
      var25 = var14;
      var14 = var48;

      try {
         var14.invoke(var25, var43);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var14 = (Method)com.c.c(166731455568463101L).get(com.c.c(238068443595657962L).get(this));
      var25 = com.c.f();
      Method var49 = com.c.d(386440316720074980L);
      Object[] var44 = (Object[])var25;
      var25 = var14;
      var14 = var49;

      try {
         var14 = (Method)var14.invoke(var25, var44);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var25 = com.c.a(true);
      Method var50 = com.c.d(238680660514778174L);
      Object[] var45 = (Object[])var25;
      var25 = var14;
      var14 = var50;

      try {
         var14.invoke(var25, var45);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





