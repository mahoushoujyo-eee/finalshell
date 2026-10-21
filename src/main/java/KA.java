import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JScrollPane;

class KA implements ComponentListener {
   final as_2 e;
   final nj_2 X;
   final uV_3 t;

   KA(uV_3 var1, as_2 var2, nj_2 var3) {
      this.t = var1;
      this.e = var2;
      this.X = var3;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      JScrollPane var10000 = (JScrollPane)com.c.c(245865577968263330L).get(com.c.c(516811165826976343L).get(this));
      Method var10001 = (Method)com.c.c(581273268055337842L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(560618790206606193L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var7 = (Dimension)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000.setPreferredSize(var7);
      ((uV_3)com.c.c(516811165826976343L).get(this)).getParent().validate();
      Method var4 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var8 = com.c.a(new g_(this));
      Method var12 = com.c.d(434592463220957006L);
      var10002 = var8;
      var10001 = var4;
      var4 = var12;

      try {
         var4.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
   }
}





