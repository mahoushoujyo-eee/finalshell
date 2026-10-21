package com.finalshell.ui.listener;

import com.finalshell.core.Ig2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class X32 extends FocusAdapter {
   public final Ig2 Z;

   public X32(Ig2 var1) {
      this.Z = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.Z.M();
   }
}





