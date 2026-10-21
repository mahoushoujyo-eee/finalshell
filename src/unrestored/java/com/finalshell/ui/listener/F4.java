package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Zn2;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComboBox;

public class F4 implements ItemListener {
   public final Zn2 v;

   public F4(Zn2 var1) {
      this.v = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      int[] var2 = Zn2.g();
      if (var2 == null) {
         if (var1.getStateChange() != 1) {
            return;
         }

         Object var3 = 273404959419733099L;
         Ref.g(273404959419733099L, var3);
         Object var5 = 273404959419733099L;
         Object var10003 = Ref.g(273404959419733099L, var5);
         Object var7 = 164806858731042884L;
         Ref.setInt(362807796445170916L, var10003, Integer.parseInt((String)((JComboBox)Ref.g(164806858731042884L, var7)).getSelectedItem()));
      }

      Object var9 = 273404959419733099L;
      Ref.g(273404959419733099L, var9);
      Object[] var10002 = Registry.emptyArgs();
      long var12 = 450058049632895301L;
      Object[] var11 = var10002;
      Ref.h(450058049632895301L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw new RuntimeException(var13.getTargetException());
      }
   }
}





