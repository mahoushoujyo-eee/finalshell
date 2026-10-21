import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class xX implements ActionListener {
   final Wx_2 h;

   xX(Wx_2 var1) {
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(305402254993059552L).get(com.c.c(445491176920083315L).get(this));
      Object[] var10001 = com.c.a(com.c.c(520425198075199721L).get(com.c.c(445491176920083315L).get(this)));
      Method var10003 = com.c.d(574420144857961258L);
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





