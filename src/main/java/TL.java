import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class TL implements ActionListener {
   final F6 W;

   TL(F6 var1) {
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = F6.g();
      Method var10000 = (ArrayList)com.c.c(625337668494616580L).get(com.c.c(285052103515156702L).get(this));
      if (!var2) {
         if (var10000.size() <= 1) {
            return;
         }

         var10000 = (Method)((ArrayList)com.c.c(625337668494616580L).get(com.c.c(285052103515156702L).get(this)))
            .get(((ArrayList)com.c.c(625337668494616580L).get(com.c.c(285052103515156702L).get(this))).size() - 2);
      }

      String var3 = (String)var10000;
      com.c.c(575820630826541433L).set(com.c.c(285052103515156702L).get(this), var3);
      ((Dv_2)com.c.c(426888588741823559L).get(com.c.c(285052103515156702L).get(this)))
         .setCaretPosition(((Dv_2)com.c.c(426888588741823559L).get(com.c.c(285052103515156702L).get(this))).getDocument().getLength());
      var10000 = com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new Yq_2(this, var3));
      Method var10003 = com.c.d(434592463220957006L);
      Object[] var10002 = var10001;
      var10001 = (Object[])var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





