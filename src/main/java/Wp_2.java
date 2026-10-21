import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Wp_2 implements ActionListener {
   final aW C;

   Wp_2(aW var1) {
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = JOptionPane.showInputDialog((aW)com.c.c(239736049163801477L).get(this), "");
      if (var2 != null) {
         JTextField var10000 = (JTextField)com.c.c(220378371334645424L).get(com.c.c(239736049163801477L).get(this));
         Object[] var10001 = com.c.a(var2);
         Method var4 = com.c.d(492016222988846142L);
         Object[] var7 = var10001;
         Object var6 = null;

         try {
            var10001 = (String)var4.invoke(var6, var7);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var10000.setText(var10001);
      }
   }
}





