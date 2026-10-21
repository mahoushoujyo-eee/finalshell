import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class xL implements Runnable {
   final DefaultMutableTreeNode q;
   final TM T;

   xL(TM var1, DefaultMutableTreeNode var2) {
      this.T = var1;
      this.q = var2;
   }

   @Override
   public void run() {
      aJ var10000 = (aJ)com.c.c(593306439561595691L).get(com.c.c(123645524365861271L).get(com.c.c(431359221943885318L).get(this)));
      Method var10001 = (Method)com.c.c(593306439561595691L).get(com.c.c(123645524365861271L).get(com.c.c(431359221943885318L).get(this)));
      Object[] var10002 = com.c.a(com.c.c(150670608442302480L).get(this));
      Method var10004 = com.c.d(263865946362642439L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var3 = (TreePath)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      var10000.setSelectionPath(var3);
   }
}





