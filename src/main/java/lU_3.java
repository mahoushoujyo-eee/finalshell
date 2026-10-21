import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class lU_3 implements ActionListener {
   final Cg_2 t;

   lU_3(Cg_2 var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = KV.b();
      KV var10000 = (KV)com.c.c(586501992965272398L).get(com.c.c(433441373524080022L).get(this));
      if (var2 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = (KV)com.c.c(586501992965272398L).get(com.c.c(433441373524080022L).get(this));
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(136645563955095288L);
      Object[] var10002 = var10001;
      KV var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





