import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;

class cW_3 implements Runnable {
   final aJ Y;

   cW_3(aJ var1) {
      this.Y = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(376877632371517990L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(574561945876230577L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      ((yo_4)com.c.c(571388131590801605L).get(com.c.c(376877632371517990L).get(this)))
         .nodeStructureChanged((DefaultMutableTreeNode)com.c.c(312919167011526763L).get(com.c.c(376877632371517990L).get(this)));
      Object[] var4 = com.c.a(com.c.c(376877632371517990L).get(this));
      var10000 = com.c.d(425714381873688660L);
      var10002 = var4;
      var10001 = null;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





