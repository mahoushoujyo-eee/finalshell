import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JComboBox;

class kN_3 implements ActionListener {
   final nO b;

   kN_3(nO var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = Km_2.U();
      nO var10000 = (nO)com.c.c(530654625003956107L).get(this);
      JComboBox var10001 = com.c.a(com.c.c(530654625003956107L).get(this));
      Method var7 = com.c.d(134739056112489376L);
      Object[] var15 = var10001;
      Object var12 = null;

      try {
         var10001 = (JComboBox)var7.invoke(var12, var15);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      int var9 = var10001.getSelectedIndex();
      if (var2 == null) {
         var9 = var9 == 2 ? 1 : 0;
      }

      Object[] var5 = com.c.a(var10000, (boolean)var9);
      Method var6 = com.c.d(364338532999266861L);
      var12 = var5;
      var10001 = null;

      try {
         var6.invoke(var10001, (Object[])var12);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





