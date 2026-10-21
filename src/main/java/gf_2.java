import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class gf_2 implements ListSelectionListener {
   final zn_2 B;

   gf_2(zn_2 var1) {
      this.B = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int[] var10000 = zn_2.g();
      int var3 = ((JTable)com.c.c(610095513804326521L).get(com.c.c(146602892415704347L).get(this))).getSelectedRow();
      int[] var2 = var10000;
      int var9 = var3;
      if (var2 == null) {
         if (var3 <= -1) {
            return;
         }

         var9 = ((JTable)com.c.c(610095513804326521L).get(com.c.c(146602892415704347L).get(this))).convertRowIndexToModel(var3);
      }

      int var4 = var9;
      var10000 = (int[])com.c.c(237503863821638476L).get(com.c.c(146602892415704347L).get(this));
      Object[] var10001 = com.c.a(var4, 0);
      Method var10003 = com.c.d(385417986641683923L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var11 = var10003;

      try {
         var10000 = (int[])var11.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      String var5 = (String)var10000;
      String var6 = (String)((HashMap)com.c.c(329000354706190097L).get(com.c.c(146602892415704347L).get(this))).get(var5);
      com.c.c(162058560421645924L).set(com.c.c(146602892415704347L).get(this), var6);
      var10000 = (int[])com.c.c(146602892415704347L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(450058049632895301L);
      var10002 = var10001;
      var10001 = var10000;
      Method var14 = var10003;

      try {
         var14.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





