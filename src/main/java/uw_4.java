import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class uw_4 implements ActionListener {
   final zb_2 U;

   uw_4(zb_2 var1) {
      this.U = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var10000 = z7.M();
      Window var3 = SwingUtilities.getWindowAncestor((zb_2)com.c.c(590487090493354324L).get(this));
      int var2 = var10000;
      on_4 var4 = new on_4(var3);
      var4.setLocationRelativeTo(var3);
      var4.setVisible(true);
      if (var2 == 0) {
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(232671688978587550L);
         Object[] var10002 = var10001;
         on_4 var13 = var4;
         Method var8 = var10003;

         try {
            var9 = (Boolean)var8.invoke(var13, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         if (!var9) {
            return;
         }

         Object var10 = com.c.c(590487090493354324L).get(this);
         var10002 = com.c.f();
         Method var10004 = com.c.d(354630440848279501L);
         Object[] var23 = var10002;
         on_4 var20 = var4;
         Method var14 = var10004;

         try {
            var10001 = (Object[])var14.invoke(var20, var23);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         com.c.c(581836656594480986L).set(var10, var10001);
      }

      zb_2 var11 = (zb_2)com.c.c(590487090493354324L).get(this);
      if (var2 == 0) {
         if ((lN_3)com.c.c(581836656594480986L).get(var11) == null) {
            return;
         }

         var11 = (zb_2)com.c.c(590487090493354324L).get(this);
      }

      JTextField var12 = (JTextField)com.c.c(132310058849395865L).get(var11);
      Method var16 = (Method)com.c.c(581836656594480986L).get(com.c.c(590487090493354324L).get(this));
      Object[] var21 = com.c.f();
      Method var25 = com.c.d(286931176286176762L);
      Object[] var24 = var21;
      var21 = var16;
      var16 = var25;

      try {
         var18 = (String)var16.invoke(var21, var24);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var12.setText(var18);
   }
}





