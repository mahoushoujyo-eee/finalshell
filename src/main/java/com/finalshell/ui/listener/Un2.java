package com.finalshell.ui.listener;

import com.finalshell.crypto.User;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

public class Un2 implements ActionListener {
   public final JCheckBox z;
   public final User F;

   public Un2(User var1, JCheckBox var2) {
      this.F = var1;
      this.z = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 375944019649708240L;
      Object[] var4 = var10002;
      Ref.h(375944019649708240L, var4, var5);
      Object var6 = 591609370857660649L;
      Object[] var10004 = Registry.packArgs(((JCheckBox)Ref.g(591609370857660649L, var6)).isSelected());
      long var9 = 218221305626362745L;
      Object[] var8 = var10004;
      Ref.h(218221305626362745L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10006 = Registry.emptyArgs();
      long var13 = 578864097947885485L;
      Object[] var12 = var10006;
      Ref.h(578864097947885485L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }
}





