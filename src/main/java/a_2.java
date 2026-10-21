import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JFrame;

class a_2 implements ActionListener {
   final JFrame V;
   final Ka_2 i;

   a_2(Ka_2 var1, JFrame var2) {
      this.i = var1;
      this.V = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.ky_4[] var2 = Ka_2.N();
      JFrame var10000 = (JFrame)com.c.c(465568518119497731L).get(this);
      if (var2 != null) {
         if (!var10000.isVisible()) {
            ((JFrame)com.c.c(465568518119497731L).get(this)).pack();
            var10000 = (JFrame)com.c.c(465568518119497731L).get(this);
            Object[] var10001 = com.c.f();
            Method var8 = com.c.d(270389152141252877L);
            Object[] var23 = var10001;
            Object var16 = null;

            try {
               var10001 = (Object[])var8.invoke(var16, var23);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var16 = com.c.f();
            Method var10004 = com.c.d(634817973682994708L);
            var23 = (Object[])var16;
            var16 = var10001;
            Method var10 = var10004;

            try {
               var10001 = (Object[])var10.invoke(var16, var23);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            var16 = com.c.f();
            var10004 = com.c.d(240567170779145617L);
            var23 = (Object[])var16;
            var16 = var10001;
            Method var12 = var10004;

            try {
               var10001 = (Object[])var12.invoke(var16, var23);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            var16 = com.c.f();
            var10004 = com.c.d(226341449505323490L);
            var23 = (Object[])var16;
            var16 = var10001;
            Method var14 = var10004;

            try {
               var10001 = (U)var14.invoke(var16, var23);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }

            var10000.setLocationRelativeTo(var10001);
         }

         ((JFrame)com.c.c(465568518119497731L).get(this)).setVisible(true);
         var10000 = (JFrame)com.c.c(465568518119497731L).get(this);
      }

      var10000.toFront();
   }
}





