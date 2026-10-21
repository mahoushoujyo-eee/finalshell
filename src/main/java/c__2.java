import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class c__2 implements ActionListener {
   final F6 B;

   c__2(F6 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = F6.g();
      String var10000 = (String)com.c.c(130333487516543213L).get(com.c.c(544299623884011127L).get(this));
      if (var2) {
         String var3 = var10000;
         if (!var2) {
            if (var3 == null) {
               return;
            }

            ((Dv_2)com.c.c(426888588741823559L).get(com.c.c(544299623884011127L).get(this))).setText(var3);
            ((Dv_2)com.c.c(426888588741823559L).get(com.c.c(544299623884011127L).get(this)))
               .setCaretPosition(((Dv_2)com.c.c(426888588741823559L).get(com.c.c(544299623884011127L).get(this))).getDocument().getLength());
         }

         var10000 = (String)com.c.c(544299623884011127L).get(this);
         Object[] var11 = com.c.a(var3, true, true);
         Method var10003 = com.c.d(324338769529465951L);
         Object[] var14 = var11;
         var11 = var10000;
         Method var9 = var10003;

         try {
            var9.invoke(var11, var14);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      } else if (var10000 != null) {
         Object[] var6 = com.c.a(com.c.c(130333487516543213L).get(com.c.c(544299623884011127L).get(this)));
         Method var7 = com.c.d(405430188584561323L);
         Object[] var13 = var6;
         Object var10 = null;

         label23:
         try {
            var10000 = (String)var7.invoke(var10, var13);
            break label23;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }
}





