import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class m9 implements MouseListener {
   final Jx_2 P;
   final fr_4 m;
   final DT T;

   m9(DT var1, Jx_2 var2, fr_4 var3) {
      this.T = var1;
      this.P = var2;
      this.m = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int[] var10000 = Jx_2.O();
      int var3 = ((DT)com.c.c(256408289213989983L).get(this)).rowAtPoint(var1.getPoint());
      int[] var2 = var10000;
      int var6 = var1.getButton();
      byte var10001 = 3;
      if (var2 == null) {
         if (var6 == 3) {
            label38: {
               DT var7 = (DT)com.c.c(256408289213989983L).get(this);
               if (var2 == null) {
                  if (var7.isRowSelected(var3)) {
                     break label38;
                  }

                  var7 = (DT)com.c.c(256408289213989983L).get(this);
               }

               var7.getSelectionModel().setSelectionInterval(var3, var3);
            }

            Yj_2 var4 = new Yj_2(
               (Jx_2)com.c.c(199773765280877583L).get(this),
               (DT)com.c.c(520595572764773303L).get(com.c.c(256408289213989983L).get(this)),
               (fr_4)com.c.c(504540812240479562L).get(this)
            );
            var4.show((DT)com.c.c(520595572764773303L).get(com.c.c(256408289213989983L).get(this)), var1.getX(), var1.getY());
         }

         var6 = var1.getButton();
         var10001 = 1;
      }

      if (var2 == null) {
         if (var6 != var10001) {
            return;
         }

         var6 = var1.getClickCount();
         var10001 = 2;
      }

      if (var6 == var10001) {
         var10000 = (int[])com.c.c(199773765280877583L).get(this);
         Object[] var10 = com.c.f();
         Method var10003 = com.c.d(506366507584924367L);
         Object[] var10002 = var10;
         Object var11 = var10000;
         Method var9 = var10003;

         try {
            var9.invoke(var11, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





