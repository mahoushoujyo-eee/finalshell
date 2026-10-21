import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPopupMenu;

class Qi_2 implements ActionListener {
   final y1_2 Y;
   final C_ Z;
   final Cg_2 R;

   Qi_2(Cg_2 var1, y1_2 var2, C_ var3) {
      this.R = var1;
      this.Y = var2;
      this.Z = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = KV.b();
      Qi_2 var10000 = this;
      if (var2 == null) {
         var10000 = (Qi_2)com.c.c(237790637254787750L).get(this);
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
            var10000 = (Qi_2)com.c.c(592211566194312411L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(208504098353916469L);
            var10002 = var10001;
            var10001 = var10000;
            Method var9 = var10003;

            try {
               var9.invoke(var10001, var10002);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }

            ((JPopupMenu)com.c.c(635187916850230994L).get(com.c.c(592211566194312411L).get(this)))
               .show((C_)com.c.c(406703713933802543L).get(this), 2, ((C_)com.c.c(406703713933802543L).get(this)).getHeight());
            if (var2 == null) {
               return;
            }
         }

         var10000 = this;
      }

      ((JPopupMenu)com.c.c(635187916850230994L).get(com.c.c(592211566194312411L).get(var10000))).setVisible(false);
   }
}





