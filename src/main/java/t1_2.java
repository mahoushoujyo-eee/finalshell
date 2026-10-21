import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class t1_2 implements ActionListener {
   final CG N;

   t1_2(CG var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = ((y6_2)com.c.c(406455305964270214L).get(com.c.c(564871536108432265L).get(this))).getSelectedRow();
      int var3 = ((y6_2)com.c.c(406455305964270214L).get(com.c.c(564871536108432265L).get(this))).convertRowIndexToModel(var2);
      Method var10000 = (Method)com.c.c(347284645451059683L).get(com.c.c(564871536108432265L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(530247999995353660L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var9 = (ArrayList)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      yA_3 var4 = (yA_3)var9.get(var3);
      StringBuilder var10 = new StringBuilder();
      var10002 = com.c.f();
      Method var10004 = com.c.d(593117720967762508L);
      Object[] var22 = var10002;
      yA_3 var19 = var4;
      Method var14 = var10004;

      try {
         var10001 = (String)var14.invoke(var19, var22);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var11 = com.c.a(var10.append((String)var10001).append("").toString());
      var10000 = com.c.d(396962080382410298L);
      var10002 = var11;
      var10001 = null;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





