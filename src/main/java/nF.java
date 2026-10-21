import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPopupMenu;

class nF implements ActionListener {
   final y1_2 b;
   final C_ M;
   final tE_3 u;

   nF(tE_3 var1, y1_2 var2, C_ var3) {
      this.u = var1;
      this.b = var2;
      this.M = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = tE_3.i();
      nF var10000 = this;
      if (var2 == 0) {
         var10000 = (nF)com.c.c(234982775223540525L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(410760064034581011L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var6 = var10003;

         try {
            var7 = (Boolean)var6.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         if (!var7) {
            var10000 = (nF)com.c.c(400719048193878452L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(381833051543402638L);
            var10002 = var10001;
            var10001 = var10000;
            Method var9 = var10003;

            try {
               var9.invoke(var10001, var10002);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }

            ((JPopupMenu)com.c.c(533402787991075064L).get(com.c.c(400719048193878452L).get(this)))
               .show((C_)com.c.c(550036671749391890L).get(this), 2, ((C_)com.c.c(550036671749391890L).get(this)).getHeight());
            if (var2 == 0) {
               return;
            }
         }

         var10000 = this;
      }

      ((JPopupMenu)com.c.c(533402787991075064L).get(com.c.c(400719048193878452L).get(var10000))).setVisible(false);
   }
}





