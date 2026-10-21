package com.finalshell.ui.listener;

import com.finalshell.core.Qe2_2;
import com.finalshell.ui.panel.KV3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PL3 implements ActionListener {
   public final Date l;
   public final KV3 m;

   public PL3(KV3 var1, Date var2) {
      this.m = var1;
      this.l = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.m.p = (Qe2_2)var1.getSource();
      this.m.J(this.l);
   }
}





