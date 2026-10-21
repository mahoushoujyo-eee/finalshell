package com.finalshell.ui.listener;

import com.finalshell.core.L9;
import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel3;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class Qq2 implements ActionListener {
   final Y12_2 A;
   final RouteTracePanel3 O;

   Qq2(RouteTracePanel3 var1, Y12_2 var2) {
      this.O = var1;
      this.A = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = L9.X();
      if (var2 == null) {
         Object var4 = 527490353373132568L;
         Ref.g(527490353373132568L, var4);
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 410760064034581011L;
         Object[] var6 = var10002;
         var10002 = Ref.h(410760064034581011L, var6, var7);

         try {
            var30 = (Boolean)var10002;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }

         if (!var30) {
            Object var8 = 557893344996906004L;
            Ref.g(557893344996906004L, var8);
            Object var10 = 243859269374928732L;
            Dimension var3 = ((JPopupMenu)Ref.g(243859269374928732L, var10)).getPreferredSize();
            Object var12 = 557893344996906004L;
            Ref.g(557893344996906004L, var12);
            Object var14 = 243859269374928732L;
            JPopupMenu var10006 = (JPopupMenu)Ref.g(243859269374928732L, var14);
            Object var16 = 557893344996906004L;
            Ref.g(557893344996906004L, var16);
            Object var18 = 248665380297112060L;
            JTextField var10009 = (JTextField)Ref.g(248665380297112060L, var18);
            Object var20 = 557893344996906004L;
            Object var10012 = Ref.g(557893344996906004L, var20);
            Object var22 = 248665380297112060L;
            true.show(this, (int)var10012, ((JTextField)Ref.g(248665380297112060L, var22)).getHeight() + 2);
            if (var2 == null) {
               return;
            }
         }
      }

      Object var24 = 557893344996906004L;
      Ref.g(557893344996906004L, var24);
      Object var26 = 243859269374928732L;
      ((JPopupMenu)Ref.g(243859269374928732L, var26)).setVisible(false);
   }
}





