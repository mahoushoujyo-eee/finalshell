package com.finalshell.ui.listener;

import com.finalshell.core.Lj4_2;
import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.Bq2;
import com.finalshell.ui.panel.CommandListPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Kp2 implements ActionListener {
   public final AM d;
   public final T32 o;
   public final Bq2 a;

   public Kp2(Bq2 var1, AM var2, T32 var3) {
      this.a = var1;
      this.d = var2;
      this.o = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = AM.s$arrString();
      Object var5 = 302403976541003261L;
      Ref.g(302403976541003261L, var5);
      CommandListPanel var10002 = (CommandListPanel)(Registry.emptyArgs());
      long var8 = 226533083820217405L;
      Object var7 = var10002;
      var10002 = Ref.h(226533083820217405L, var7, var8);

      try {
         var10002 = (CommandListPanel)var10002;
      } catch (InvocationTargetException var24) {
         throw new RuntimeException(var24.getTargetException());
      }

      if (var2 != null) {
         Object[] var10003 = Registry.emptyArgs();
         long var14 = 436219151453922381L;
         Object[] var13 = var10003;
         Ref.h(436219151453922381L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var22) {
            throw new RuntimeException(var22.getTargetException());
         }

         Object var15 = 335518349467554626L;
         Ref.g(335518349467554626L, var15);
         Object[] var10005 = Registry.emptyArgs();
         long var18 = 348047003824927685L;
         Object[] var17 = var10005;
         Lj4_2 var4 = (Lj4_2)Ref.h(348047003824927685L, var17, var18);
         Object[] var10006 = Registry.packArgs(var4);
         long var20 = 268892086263649472L;
         Object[] var19 = var10006;
         Ref.h(268892086263649472L, var19, var20);

         try {
            ;
         } catch (InvocationTargetException var21) {
            throw new RuntimeException(var21.getTargetException());
         }
      } else if (var10002 != null) {
         Object var9 = 302403976541003261L;
         Ref.g(302403976541003261L, var9);
         Object[] var10004 = Registry.emptyArgs();
         long var12 = 226533083820217405L;
         Object[] var11 = var10004;
         Ref.h(226533083820217405L, var11, var12);

         label36:
         try {
            break label36;
         } catch (InvocationTargetException var23) {
            throw new RuntimeException(var23.getTargetException());
         }
      }
   }
}





