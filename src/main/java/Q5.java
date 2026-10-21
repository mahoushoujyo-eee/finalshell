import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class Q5 implements ActionListener {
   final xc_2 i;

   Q5(xc_2 var1) {
      this.i = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = ((Uo_2)com.c.c(342129762932297171L).get(com.c.c(158542760097367785L).get(this))).getSelectedRow();
      int var3 = ((Uo_2)com.c.c(342129762932297171L).get(com.c.c(158542760097367785L).get(this))).convertRowIndexToModel(var2);
      Method var10000 = (Method)com.c.c(435109479173232140L).get(com.c.c(158542760097367785L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(245965692335108743L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var11 = (ArrayList)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      lI_3 var4 = (lI_3)var11.get(var3);
      var10001 = com.c.f();
      var10003 = com.c.d(382054480216091309L);
      var10002 = var10001;
      lI_3 var19 = var4;
      var10000 = var10003;

      try {
         var13 = (u8_2)var10000.invoke(var19, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      u8_2 var5 = var13;
      StringBuilder var14 = new StringBuilder();
      var10002 = com.c.f();
      Method var10004 = com.c.d(340521912883652737L);
      Object[] var30 = var10002;
      u8_2 var26 = var5;
      Method var20 = var10004;

      try {
         var21 = (Integer)var20.invoke(var26, var30);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var15 = com.c.a(var14.append(var21).append("").toString());
      var10000 = com.c.d(396962080382410298L);
      var10002 = var15;
      var10001 = null;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





