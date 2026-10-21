package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.M1;
import com.finalshell.ui.panel.PathPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;

public class LG implements KeyListener {
   public final PathPanel s;
   public static long a;

   public LG(PathPanel var1) {
      this.s = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == (int)a) {
         Object var3 = 414662050894156863L;
         Ref.g(414662050894156863L, var3);
         Object var5 = 626158744249045388L;
         String var2 = ((JTextField)Ref.g(626158744249045388L, var5)).getText().trim();
         Object var7 = 414662050894156863L;
         Ref.g(414662050894156863L, var7);
         Object var9 = 626158744249045388L;
         JTextField var10004 = (JTextField)Ref.g(626158744249045388L, var9);
         Object var11 = 414662050894156863L;
         Object var10006 = Ref.g(414662050894156863L, var11);
         Object var13 = 626158744249045388L;
         var10006.setCaretPosition(((JTextField)Ref.g(626158744249045388L, var13)).getDocument().getLength());
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10007 = Registry.packArgs(new M1(this, var2));
         long var16 = 434592463220957006L;
         Object[] var15 = var10007;
         Ref.h(434592463220957006L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8164457927423876175L;
      long var10002 = -4441011223634846651L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





