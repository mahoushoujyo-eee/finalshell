package com.finalshell.ui.listener;

import com.finalshell.core.Kr4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

public class T6 implements ActionListener {
   public final Kr4 C;

   public T6(Kr4 var1) {
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = var1.getSource();
      Object var3 = 537831880566615041L;
      Object[] var10002 = Registry.packArgs(Ref.g(537831880566615041L, var3));
      long var5 = 574713033516699292L;
      Object var10003 = Ref.h2(574713033516699292L, var5);

      try {
         var10003 = (JButton)var10003;
      } catch (InvocationTargetException var14) {
         throw new RuntimeException(var14.getTargetException());
      }

      if (var10002 == var10003) {
         Object var7 = 537831880566615041L;
         Registry.packArgs(Ref.g(537831880566615041L, var7));
         long var9 = 566647182507619895L;
         Ref.h2(566647182507619895L, var9);
         Object[] var10005 = Registry.emptyArgs();
         long var12 = 229529583799900928L;
         Object[] var11 = var10005;
         Ref.h(229529583799900928L, var11, var12);

         try {
            ;
         } catch (InvocationTargetException var13) {
            throw new RuntimeException(var13.getTargetException());
         }
      }
   }
}





