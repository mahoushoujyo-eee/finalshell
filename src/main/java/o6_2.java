import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.SwingUtilities;

class o6_2 extends MouseAdapter {
   final t3_2 s;
   final aM W;
   final Bq_2 e;

   o6_2(Bq_2 var1, t3_2 var2, aM var3) {
      this.e = var1;
      this.s = var2;
      this.W = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var10000 = aM.s();
      super.mouseReleased(var1);
      String[] var2 = var10000;
      if (var2 == null) {
         if (SwingUtilities.isRightMouseButton(var1)) {
            Y9 var3 = new Y9((t3_2)com.c.c(387610970704879223L).get(this), com.c.c(454291477903395804L).getInt(null));
            Object[] var10001 = com.c.a(var1);
            Method var10003 = com.c.d(236847225442494468L);
            Object[] var10002 = var10001;
            Y9 var12 = var3;
            Method var7 = var10003;

            try {
               var7.invoke(var12, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var10000 = (String[])com.c.c(342651914901974595L).get(this);
            var10001 = com.c.a(var3);
            var10003 = com.c.d(484591085759846041L);
            var10002 = var10001;
            var10001 = var10000;
            Method var9 = var10003;

            try {
               var9.invoke(var10001, var10002);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }
         }

         var10000 = (String[])com.c.c(342651914901974595L).get(this);
         Object[] var15 = com.c.a(com.c.c(387610970704879223L).get(this));
         Method var20 = com.c.d(176011466134249595L);
         Object[] var18 = var15;
         var15 = var10000;
         Method var11 = var20;

         try {
            var11.invoke(var15, var18);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }
}





