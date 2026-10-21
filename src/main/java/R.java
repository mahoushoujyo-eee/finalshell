import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

class R implements ActionListener {
   final Jr_2 N;

   R(Jr_2 var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var10000 = KV.b();
      String var3 = ((JLabel)com.c.c(138927541502642713L).get(com.c.c(444956171457752336L).get(this))).getText();
      String[] var2 = var10000;
      String var5 = var3;
      if (var2 == null) {
         if (var3.equals("-")) {
            return;
         }

         var5 = var3;
      }

      Object[] var6 = com.c.a(var5);
      Method var7 = com.c.d(396962080382410298L);
      Object[] var9 = var6;
      Object var8 = null;

      try {
         var7.invoke(var8, var9);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





