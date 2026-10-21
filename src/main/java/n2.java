import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class n2 implements AdjustmentListener {
   final oG_3 S;
   final FK G;

   n2(FK var1, oG_3 var2) {
      this.G = var1;
      this.S = var2;
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent var1) {
      Method var10000 = (Method)com.c.c(266620224043742390L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(494456998971578926L);
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





