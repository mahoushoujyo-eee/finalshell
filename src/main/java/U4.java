import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class U4 implements ActionListener {
   final Jr_2 w;

   U4(Jr_2 var1) {
      this.w = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = KV.b();
      Method var10000 = (Method)com.c.c(487595327584450503L).get(com.c.c(546998639759791835L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(292557478156152530L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var7 = (String)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      if (var2 != null) {
         Object[] var10 = com.c.a(var7);
         var10000 = com.c.d(486102265744107756L);
         var10002 = var10;
         var10001 = null;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      } else if (var7 != null) {
         var10000 = (Method)com.c.c(487595327584450503L).get(com.c.c(546998639759791835L).get(this));
         var10001 = com.c.f();
         var10003 = com.c.d(292557478156152530L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         label25:
         try {
            var7 = (String)var10000.invoke(var10001, var10002);
            break label25;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }
}





