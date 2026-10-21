package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.AW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;

public class Ds2 implements ActionListener {
   public final AW N;

   public Ds2(AW var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 235696660045219451L;
      Ref.g(235696660045219451L, var2);
      Object var4 = 184823010927613107L;
      Registry.packArgs(((JTextField)Ref.g(184823010927613107L, var4)).getText());
      long var6 = 139122500711711222L;
      Registry.packArgs(Ref.h2(139122500711711222L, var6));
      long var8 = 396962080382410298L;
      Ref.h2(396962080382410298L, var8);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw new RuntimeException(var10.getTargetException());
      }
   }
}





