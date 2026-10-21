import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

class Qq_2 implements ActionListener {
   final y1_2 A;
   final mi_2 O;

   Qq_2(mi_2 var1, y1_2 var2) {
      this.O = var1;
      this.A = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = L9.X();
      Qq_2 var10000 = this;
      if (var2 == null) {
         var10000 = (Qq_2)com.c.c(527490353373132568L).get(this);
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
            Dimension var3 = ((JPopupMenu)com.c.c(243859269374928732L).get(com.c.c(557893344996906004L).get(this))).getPreferredSize();
            ((JPopupMenu)com.c.c(243859269374928732L).get(com.c.c(557893344996906004L).get(this)))
               .show(
                  (JTextField)com.c.c(248665380297112060L).get(com.c.c(557893344996906004L).get(this)),
                  1,
                  ((JTextField)com.c.c(248665380297112060L).get(com.c.c(557893344996906004L).get(this))).getHeight() + 2
               );
            if (var2 == null) {
               return;
            }
         }

         var10000 = this;
      }

      ((JPopupMenu)com.c.c(243859269374928732L).get(com.c.c(557893344996906004L).get(var10000))).setVisible(false);
   }
}





