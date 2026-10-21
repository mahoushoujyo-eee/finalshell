import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Os_2 implements ActionListener {
   final Y_ x;

   Os_2(Y_ var1) {
      this.x = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(587689868050151523L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(457204009113929650L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var6 = (lN_3)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      lN_3 var2 = var6;
      if (var2 != null) {
         var10000 = (Method)com.c.c(587689868050151523L).get(this);
         var10001 = com.c.a(var2);
         var10003 = com.c.d(306838697711798482L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }
}





