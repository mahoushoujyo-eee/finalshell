package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.TextEditorFrame;
import com.finalshell.ui.panel.TextFileEditorPanel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;

public class FT3 implements WindowFocusListener {
   public final TextEditorFrame q;

   public FT3(TextEditorFrame var1) {
      this.q = var1;
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
      int[] var2 = TextEditorFrame.m();
      Object var3 = 382511049032296034L;
      Ref.g(382511049032296034L, var3);
      Object var5 = 247518897504885985L;
      TextFileEditorPanel var10002 = (TextFileEditorPanel)Ref.g(247518897504885985L, var5);
      if (var2 == null) {
         if (var10002 == null) {
            return;
         }

         Object var7 = 382511049032296034L;
         Ref.g(382511049032296034L, var7);
         Object var9 = 247518897504885985L;
         TextFileEditorPanel var10004 = (TextFileEditorPanel)Ref.g(247518897504885985L, var9);
      }

      Object[] var10003 = Registry.emptyArgs();
      long var12 = 155099205039445149L;
      Object[] var11 = var10003;
      Ref.h(155099205039445149L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }
}





