import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import javax.swing.tree.DefaultMutableTreeNode;

class g0 implements Runnable {
   final String u;
   final aJ n;

   g0(aJ var1, String var2) {
      this.n = var1;
      this.u = var2;
   }

   @Override
   public void run() {
      DefaultMutableTreeNode var1 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(com.c.c(160513236134927191L).get(this)))
         .get((String)com.c.c(414267653523382186L).get(this));
      Method var10000 = (Method)com.c.c(160513236134927191L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(276002133797788160L);
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





