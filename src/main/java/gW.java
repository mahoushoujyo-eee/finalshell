import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class gW implements ListSelectionListener {
   final FK n;

   gW(FK var1) {
      this.n = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int var8;
      label40: {
         String[] var10000 = FK.i();
         int var3 = ((tq_4)com.c.c(618427502576624312L).get(com.c.c(366138084933061716L).get(this))).getSelectedRow();
         String[] var2 = var10000;
         var8 = var3;
         int var10001 = -1;
         if (var2 == null) {
            if (var3 <= -1) {
               return;
            }

            var8 = ((tq_4)com.c.c(618427502576624312L).get(com.c.c(366138084933061716L).get(this))).getModel().getRowCount();
            if (var2 != null) {
               break label40;
            }

            var10001 = var3;
         }

         if (var8 <= var10001) {
            return;
         }

         var8 = ((tq_4)com.c.c(618427502576624312L).get(com.c.c(366138084933061716L).get(this))).convertRowIndexToModel(var3);
      }

      int var4 = var8;
      Object var9 = com.c.c(598800499692003827L).get(com.c.c(366138084933061716L).get(this));
      Object[] var14 = com.c.a(var4, 0);
      Method var10003 = com.c.d(130061847059020450L);
      Object[] var10002 = var14;
      var14 = (Object[])var9;
      Method var10 = var10003;

      try {
         var11 = var10.invoke(var14, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      L1 var5 = (L1)var11;
      Object var12 = com.c.c(308394982418497131L).get(com.c.c(366138084933061716L).get(this));
      var14 = com.c.f();
      var10003 = com.c.d(348033953102046715L);
      var10002 = var14;
      var14 = (Object[])var12;
      Method var13 = var10003;

      try {
         var13.invoke(var14, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





