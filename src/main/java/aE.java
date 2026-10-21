import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JSplitPane;

public class aE extends JSplitPane {
   boolean N;
   int s;

   public aE(int var1) {
      super(var1);
      com.c.c(290595356218507398L).setBoolean(this, false);
   }

   @Override
   public int getDividerLocation() {
      int var1 = super.getDividerLocation();
      if (com.c.c(290595356218507398L).getBoolean(this)) {
      }

      return var1;
   }

   public boolean b() {
      return com.c.c(290595356218507398L).getBoolean(this);
   }

   public void B(boolean var1) {
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(608818074819783119L);
      Object[] var10003 = var10002;
      aE var4 = this;
      Method var10001 = var10004;

      try {
         var3 = (Integer)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      com.c.c(535667801898263180L).setInt(this, var3);
      com.c.c(290595356218507398L).setBoolean(this, var1);
   }
}





