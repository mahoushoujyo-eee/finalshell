import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class J9 implements ActionListener {
   final Kb_2 E;

   J9(Kb_2 var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         Method var10000 = (Method)com.c.c(434123145510264621L).get(this);
         Object[] var10001 = com.c.a(com.c.c(473641348993414305L).get(com.c.c(434123145510264621L).get(this)), false);
         Method var10003 = com.c.d(235982160539264686L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }
}





