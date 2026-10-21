import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

class T6 implements ActionListener {
   final kr_4 C;

   T6(kr_4 var1) {
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = var1.getSource();
      Object[] var10001 = com.c.a(com.c.c(537831880566615041L).get(this));
      Method var9 = com.c.d(574713033516699292L);
      Object[] var19 = var10001;
      Object var15 = null;

      try {
         var10001 = (JButton)var9.invoke(var15, var19);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      if (var2 == var10001) {
         Object[] var10000 = com.c.a(com.c.c(537831880566615041L).get(this));
         Method var6 = com.c.d(566647182507619895L);
         var15 = var10000;
         var10001 = null;

         try {
            var10000 = (Object[])var6.invoke(var10001, (Object[])var15);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var10001 = com.c.f();
         Method var20 = com.c.d(229529583799900928L);
         var15 = var10001;
         var10001 = var10000;
         Method var8 = var20;

         try {
            var8.invoke(var10001, (Object[])var15);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }
}





