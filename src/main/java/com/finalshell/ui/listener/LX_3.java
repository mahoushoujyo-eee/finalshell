package com.finalshell.ui.listener;

import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.EnvironmentVariablePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

public class LX_3 extends MouseAdapter {
   public final JPopupMenu e;
   public final EnvironmentVariablePanel A;

   public LX_3(EnvironmentVariablePanel var1, JPopupMenu var2) {
      this.A = var1;
      this.e = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var10000 = Uo2.k();
      super.mousePressed(var1);
      boolean var2 = var10000;
      LX_3 var23 = var1.getButton();
      if (var2) {
         if (var23 != null) {
            return;
         }

         var23 = this;
         Object var5 = 413667648482217310L;
         Ref.g(413667648482217310L, var5);
         Object var7 = 166263389195533693L;
         ((JTable)Ref.g(166263389195533693L, var7)).rowAtPoint(var1.getPoint());
      }

      LX_3 var3 = var23;
      Object var9 = 413667648482217310L;
      Ref.g(413667648482217310L, var9);
      Object var11 = 166263389195533693L;
      int var4 = ((JTable)Ref.g(166263389195533693L, var11)).convertRowIndexToModel((int)var3);
      Object var13 = 413667648482217310L;
      Ref.g(413667648482217310L, var13);
      Object var15 = 166263389195533693L;
      ((JTable)Ref.g(166263389195533693L, var15)).getSelectionModel().setSelectionInterval(var4, var4);
      Object var17 = 253282387591500605L;
      JPopupMenu var10005 = (JPopupMenu)Ref.g(253282387591500605L, var17);
      Object var19 = 413667648482217310L;
      Object var10007 = Ref.g(413667648482217310L, var19);
      Object var21 = 166263389195533693L;
      var10007.show((JTable)Ref.g(166263389195533693L, var21), var1.getX(), var1.getY());
   }
}





