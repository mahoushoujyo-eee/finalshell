package com.finalshell.ui.listener;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.Vn2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Qz2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

public class D92 implements MouseListener {
   public final Vn2 c;

   public D92(Vn2 var1) {
      this.c = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String var2 = Vn2.C();
      if (var2 == null) {
         if (var1.getButton() == 1) {
            Object var8 = 483663784764278403L;
            int var3 = ((Vn2)Ref.g(483663784764278403L, var8)).rowAtPoint(var1.getPoint());
            if (var2 != null) {
               return;
            }

            if (var3 > -1) {
               Object var10 = 483663784764278403L;
               int var4 = ((Vn2)Ref.g(483663784764278403L, var10)).convertRowIndexToModel(var3);
               Object var12 = 483663784764278403L;
               Lv4_2 var5 = (Lv4_2)((Vn2)Ref.g(483663784764278403L, var12)).getModel().getValueAt(var4, 0);
               File var10004;
               String var10006 = (String)(Registry.emptyArgs());
               long var15 = 432693308750455264L;
               Object var14 = var10006;
               var10006 = Ref.h(432693308750455264L, var14, var15);

               try {
                  var10006 = (String)var10006;
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

var5 = (Vn2)(new D92(var10006));
               File var6 = var10004;
               Object var16 = 483663784764278403L;
               com.finalshell.ui.frame.MainFrame var7 = (com.finalshell.ui.frame.MainFrame)SwingUtilities.windowForComponent((Vn2)Ref.g(483663784764278403L, var16));
               SwingUtilities.invokeLater(new Qz2(this, var6, var7));
            }
         }

         Object var18 = 483663784764278403L;
         Registry.lookupField(506848354576877670L).setInt(Ref.g(483663784764278403L, var18), -1);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





