import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class dI_3 implements ActionListener {
   final Ty_2 f;
   final C4 h;

   dI_3(C4 var1, Ty_2 var2) {
      this.h = var1;
      this.f = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = C4.K();
      dI_3 var10000 = this;
      if (var2 != null) {
         var10000 = (dI_3)com.c.c(355739198731336221L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(121632250293569146L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var8 = var10003;

         try {
            var10000 = (dI_3)var8.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(209547680018014679L);
         var10002 = var10001;
         var10001 = var10000;
         Method var10 = var10003;

         try {
            var11 = (Long)var10.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         if (var11 <= 0L) {
            return;
         }

         var10000 = this;
      }

      var10000 = (dI_3)com.c.c(506915673809516939L).get(var10000);
      Method var17 = (Method)com.c.c(355739198731336221L).get(this);
      Object[] var23 = com.c.f();
      Method var10004 = com.c.d(121632250293569146L);
      Object[] var27 = var23;
      var23 = var17;
      var17 = var10004;

      try {
         var17 = (Method)var17.invoke(var23, var27);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Object[] var20 = com.c.a(var17);
      Method var28 = com.c.d(540897424776196125L);
      var23 = var20;
      var17 = var10000;
      Method var13 = var28;

      try {
         var13.invoke(var17, var23);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





