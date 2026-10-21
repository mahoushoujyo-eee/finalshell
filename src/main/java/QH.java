import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class QH extends MouseAdapter {
   final FK w;

   QH(FK var1) {
      this.w = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 3) {
         Method var10000 = (Method)com.c.c(312692875209881956L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(261923787966152983L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }
   }
}





