import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBox;

class bM_3 implements ActionListener {
   final JCheckBox u;
   final nj_2 L;

   bM_3(nj_2 var1, JCheckBox var2) {
      this.L = var1;
      this.u = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = F8.y();
      Method var10000 = (Method)com.c.c(354859781990372885L).get(com.c.c(615289893081121817L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(258495433430833129L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var6 = (aJ)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      boolean var9 = ((JCheckBox)com.c.c(526023401269638701L).get(this)).isSelected();
      if (var2 == null) {
         var9 = !var9;
      }

      var10001 = com.c.a(var9);
      var10003 = com.c.d(422508769180655952L);
      var10002 = var10001;
      aJ var11 = var6;
      var10000 = var10003;

      try {
         var10000.invoke(var11, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





