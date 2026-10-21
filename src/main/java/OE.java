import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;

class OE implements Runnable {
   final DefaultMutableTreeNode n;
   final aJ t;

   OE(aJ var1, DefaultMutableTreeNode var2) {
      this.t = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(326519614582835010L).get(this);
      Object[] var10001 = com.c.a(com.c.c(499259076160994603L).get(this));
      Method var10003 = com.c.d(276002133797788160L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





