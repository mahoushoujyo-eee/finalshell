import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTextField;

class Lw_2 implements ActionListener {
   final xl_2 Z;

   Lw_2(xl_2 var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = F6.g();
      String var10000 = (String)com.c.c(291327501867436911L).get(com.c.c(257342744894307012L).get(this));
      if (var2) {
         String var3 = var10000;
         if (!var2) {
            if (var3 == null) {
               return;
            }

            ((JTextField)com.c.c(626158744249045388L).get(com.c.c(257342744894307012L).get(this))).setText(var3);
            ((JTextField)com.c.c(626158744249045388L).get(com.c.c(257342744894307012L).get(this)))
               .setCaretPosition(((JTextField)com.c.c(626158744249045388L).get(com.c.c(257342744894307012L).get(this))).getDocument().getLength());
         }

         var10000 = (String)com.c.c(388376917454860932L).get(null);
         Object[] var11 = com.c.a(new BT(this, var3));
         Method var10003 = com.c.d(434592463220957006L);
         Object[] var14 = var11;
         var11 = var10000;
         Method var9 = var10003;

         try {
            var9.invoke(var11, var14);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      } else if (var10000 != null) {
         Object[] var6 = com.c.a(com.c.c(291327501867436911L).get(com.c.c(257342744894307012L).get(this)));
         Method var7 = com.c.d(405430188584561323L);
         Object[] var13 = var6;
         Object var10 = null;

         label23:
         try {
            var10000 = (String)var7.invoke(var10, var13);
            break label23;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }
}





