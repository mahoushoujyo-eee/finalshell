import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class f6_2 extends WindowAdapter {
   final U a;

   f6_2(U var1) {
      this.a = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
   }

   @Override
   public void windowOpened(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(127681907499659113L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(636780886022823652L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void windowIconified(WindowEvent var1) {
   }

   @Override
   public void windowDeiconified(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(127681907499659113L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(636780886022823652L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void windowDeactivated(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(127681907499659113L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(636780886022823652L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(127681907499659113L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(636780886022823652L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(127681907499659113L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(636780886022823652L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(494886012324216737L).get(com.c.c(127681907499659113L).get(this));
      Object[] var10001 = com.c.a(com.c.c(127681907499659113L).get(this));
      Method var10003 = com.c.d(416713388134175022L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000 = (Method)com.c.c(127681907499659113L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(636780886022823652L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





