package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CustomAcceleratePanel;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;

public class A2 implements ActionListener {
   public final JFrame V;
   public final CustomAcceleratePanel i;

   public A2(CustomAcceleratePanel var1, JFrame var2) {
      this.i = var1;
      this.V = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ky4[] var2 = CustomAcceleratePanel.N();
      Object var3 = 465568518119497731L;
      Object var10001 = (JFrame)Ref.g(465568518119497731L, var3);
      if (var2 != null) {
         if (!var10001.isVisible()) {
            Object var5 = 465568518119497731L;
            ((JFrame)Ref.g(465568518119497731L, var5)).pack();
            Object var7 = 465568518119497731L;
            JFrame var10003 = (JFrame)Ref.g(465568518119497731L, var7);
            Registry.emptyArgs();
            long var9 = 270389152141252877L;
            Ref.h2(270389152141252877L, var9);
            Object[] var10006 = Registry.emptyArgs();
            long var12 = 634817973682994708L;
            Object[] var11 = var10006;
            Ref.h(634817973682994708L, var11, var12);
            JFrame var10007 = Registry.emptyArgs();
            long var14 = 240567170779145617L;
            Object var13 = var10007;
            var10007 = (JFrame)Ref.h(240567170779145617L, var13, var14);
            Object var10008 = Registry.emptyArgs();
            long var16 = 226341449505323490L;
            Object var15 = var10008;
            var10008 = Ref.h(226341449505323490L, var15, var16);

            try {
               var10008 = (com.finalshell.ui.frame.MainFrame)var10008;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            var10007.setLocationRelativeTo(var10008);
         }

         var10001 = this;
         Object var17 = 465568518119497731L;
         ((JFrame)Ref.g(465568518119497731L, var17)).setVisible(true);
         Object var19 = 465568518119497731L;
         JFrame var22 = (JFrame)Ref.g(465568518119497731L, var19);
      }

      var10001.toFront();
   }
}





