package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CompleteFullPathPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class ON implements ActionListener {
   final CompleteFullPathPanel v;

   ON(CompleteFullPathPanel var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 434618117288135903L;
      Ref.g(434618117288135903L, var2);
      Object var4 = 269701149216436117L;
      Ref.g(269701149216436117L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 178763011854806787L;
      Object[] var6 = var10003;
      Ref.h(178763011854806787L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





