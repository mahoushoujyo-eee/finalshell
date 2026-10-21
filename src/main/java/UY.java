import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;

class UY implements ActionListener {
   final l5_2 b;

   UY(l5_2 var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = aA.z();
      Object var3 = ((DefaultMutableTreeNode)com.c.c(520858298081292913L).get(com.c.c(167792870332698444L).get(this))).getUserObject();
      String var2 = var10000;
      boolean var6 = var3.getClass().equals(ck_4.class);
      if (var2 == null) {
         if (var6) {
            var10000 = (String)com.c.c(131037384951395357L).get(com.c.c(167792870332698444L).get(this));
            Object[] var10001 = com.c.a(
               (DefaultMutableTreeNode)((DefaultMutableTreeNode)com.c.c(520858298081292913L).get(com.c.c(167792870332698444L).get(this))).getParent()
            );
            Method var10003 = com.c.d(276002133797788160L);
            Object[] var10002 = var10001;
            var10001 = var10000;
            Method var8 = var10003;

            try {
               var8.invoke(var10001, var10002);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            if (var2 == null) {
               return;
            }
         }

         var6 = var3.getClass().equals(tf_4.class);
      }

      if (var6) {
         var10000 = (String)com.c.c(131037384951395357L).get(com.c.c(167792870332698444L).get(this));
         Object[] var12 = com.c.a(com.c.c(520858298081292913L).get(com.c.c(167792870332698444L).get(this)));
         Method var15 = com.c.d(276002133797788160L);
         Object[] var14 = var12;
         var12 = var10000;
         Method var10 = var15;

         try {
            var10.invoke(var12, var14);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }
}





