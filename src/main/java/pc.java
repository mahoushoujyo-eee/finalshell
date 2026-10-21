import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

class pc implements ActionListener {
   final JLabel F;
   final Color U;
   final W8 K;
   final String I;
   final Jx_2 z;

   pc(Jx_2 var1, JLabel var2, Color var3, W8 var4, String var5) {
      this.z = var1;
      this.F = var2;
      this.U = var3;
      this.K = var4;
      this.I = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      ((JLabel)com.c.c(266813260529737153L).get(this)).setBackground((Color)com.c.c(376475672846154025L).get(this));
      ((W8)com.c.c(437054913838482762L).get(this)).setBackground((Color)com.c.c(376475672846154025L).get(this));
      Object[] var10000 = com.c.a(com.c.c(541906194858714572L).get(this));
      Method var3 = com.c.d(555473894912140963L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         var3.invoke(var4, var5);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





