package com.finalshell.ui.listener;

import com.finalshell.core.Az2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Nn2 extends FocusAdapter {
   public final Az2 S;

   public Nn2(Az2 var1) {
      this.S = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.S.N(var1);
   }
}





