package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.LocalMachinePanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Lz4 implements MouseListener {
   public final LocalMachinePanel H;

   public Lz4(LocalMachinePanel var1) {
      this.H = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 1) {
         Object var2 = 567895785615318652L;
         Ref.g(567895785615318652L, var2);
         Object var4 = 412103333330765630L;
         Ref.g(412103333330765630L, var4);
         Object var6 = 567895785615318652L;
         Object var10004 = Ref.g(567895785615318652L, var6);
         Object var8 = 177705260303572150L;
         Registry.packArgs(var10004, Ref.g(177705260303572150L, var8));
         long var10 = 499557154371623443L;
         Ref.h2(499557154371623443L, var10);

         try {
            ;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }
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





