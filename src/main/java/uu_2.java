import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Uu_2 extends MouseAdapter {
   final JR Z;

   Uu_2(JR var1) {
      this.Z = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2 = ((JR)com.c.c(581801849132350805L).get(this)).columnAtPoint(var1.getPoint());
      String var3 = ((JR)com.c.c(581801849132350805L).get(this)).getColumnName(var2);
      Object[] var10000 = com.c.f();
      Method var11 = com.c.d(270389152141252877L);
      Object[] var34 = var10000;
      Object var23 = null;

      try {
         var10000 = (Object[])var11.invoke(var23, var34);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var23 = com.c.f();
      Method var10003 = com.c.d(634817973682994708L);
      var34 = (Object[])var23;
      var23 = var10000;
      Method var13 = var10003;

      try {
         var10000 = (Object[])var13.invoke(var23, var34);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var23 = com.c.f();
      var10003 = com.c.d(240567170779145617L);
      var34 = (Object[])var23;
      var23 = var10000;
      Method var15 = var10003;

      try {
         var10000 = (Object[])var15.invoke(var23, var34);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var23 = com.c.f();
      var10003 = com.c.d(226341449505323490L);
      var34 = (Object[])var23;
      var23 = var10000;
      Method var17 = var10003;

      try {
         var10000 = (Object[])var17.invoke(var23, var34);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var23 = com.c.f();
      var10003 = com.c.d(153346140499032202L);
      var34 = (Object[])var23;
      var23 = var10000;
      Method var19 = var10003;

      try {
         var10000 = (Object[])var19.invoke(var23, var34);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var23 = com.c.f();
      var10003 = com.c.d(588059759001940511L);
      var34 = (Object[])var23;
      var23 = var10000;
      Method var21 = var10003;

      try {
         n_2 var22 = (n_2)var21.invoke(var23, var34);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





