import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JSplitPane;

class tR_3 implements PropertyChangeListener {
   final yB_3 Y;

   tR_3(yB_3 var1) {
      this.Y = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      Object[] var10000 = com.c.f();
      Method var7 = com.c.d(270389152141252877L);
      Object[] var17 = var10000;
      Object var12 = null;

      try {
         var10000 = (Object[])var7.invoke(var12, var17);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var12 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var17 = (Object[])var12;
      var12 = var10000;
      Method var9 = var10003;

      try {
         var10000 = (u6_2)var9.invoke(var12, var17);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      u6_2 var2 = var10000;
      int var3 = ((JSplitPane)com.c.c(256433469970092898L).get(com.c.c(219089076937185728L).get(this))).getDividerLocation();
      var12 = com.c.a(var3);
      var10003 = com.c.d(456655109771838364L);
      var17 = (Object[])var12;
      var12 = var2;
      Method var11 = var10003;

      try {
         var11.invoke(var12, var17);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





