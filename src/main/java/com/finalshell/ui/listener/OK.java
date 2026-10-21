package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SetByKeyboardDialog;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class OK implements KeyListener {
   final SetByKeyboardDialog R;

   OK(SetByKeyboardDialog var1) {
      this.R = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      Object var2 = 606863927096470668L;
      Ref.g(606863927096470668L, var2);
      KeyStroke var10002 = KeyStroke.getKeyStrokeForEvent(var1);
      long var5 = 225851015118401415L;
      KeyStroke var4 = var10002;
      Ref.s(225851015118401415L, var4, var5);
      Object var6 = 606863927096470668L;
      Ref.g(606863927096470668L, var6);
      Object var8 = 429365332657596163L;
      JTextField var10004 = (JTextField)Ref.g(429365332657596163L, var8);
      Object var10 = 606863927096470668L;
      Ref.g(606863927096470668L, var10);
      Object var12 = 225851015118401415L;
      Object[] var10007 = Registry.packArgs(Ref.g(225851015118401415L, var12));
      long var14 = 214304962730069281L;
      Object var10008 = Ref.h2(214304962730069281L, var14);

      try {
         var10008 = (String)var10008;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var10007.setText((String)var10008);
   }
}





