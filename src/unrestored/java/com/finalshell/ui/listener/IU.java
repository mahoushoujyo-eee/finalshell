package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Bq_2;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IU implements ActionListener {
   public final ConnectionProperty Y;
   public final Bq_2 z;

   public IU(Bq_2 var1, ConnectionProperty var2) {
      this.z = var1;
      this.Y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.Y.w();
   }
}





