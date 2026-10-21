import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.ExpandVetoException;

class LD implements TreeWillExpandListener {
   final a3 Y;

   LD(a3 var1) {
      this.Y = var1;
   }

   @Override
   public void treeWillExpand(TreeExpansionEvent var1) throws ExpandVetoException {
      Method var10000 = (Method)com.c.c(607072940737459709L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(521558993785244327L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void treeWillCollapse(TreeExpansionEvent var1) throws ExpandVetoException {
   }
}





