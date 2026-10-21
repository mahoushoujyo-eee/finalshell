package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

public class WO implements ActionListener {
   final com.finalshell.ui.frame.U H;

   WO(com.finalshell.ui.frame.U var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = com.finalshell.ui.panel.F8.y();
      Object var3 = 313561084464947367L;
      Ref.g(313561084464947367L, var3);
      Object var5 = 208444474277099894L;
      ConnectionProperty var10002 = (ConnectionProperty)Ref.g(208444474277099894L, var5);
      if (var2 == null) {
         if (var10002 == null) {
            return;
         }

         Object var7 = 313561084464947367L;
         Ref.g(313561084464947367L, var7);
         Object var9 = 208444474277099894L;
         ConnectionProperty var10004 = (ConnectionProperty)Ref.g(208444474277099894L, var9);
      }

      Object var11 = 313561084464947367L;
      Object var15 = Ref.g(313561084464947367L, var11);
      Object var13 = 465653008199209678L;
      ((ConnectionProperty)var15).h(((JToggleButton)Ref.g(465653008199209678L, var13)).isSelected());
   }
}





