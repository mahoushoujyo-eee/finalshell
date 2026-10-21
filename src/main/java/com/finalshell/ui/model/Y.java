package com.finalshell.ui.model;

import com.finalshell.core.A_5;
import com.finalshell.core.J_5;
import java.io.File;
import java.util.Iterator;

public class Y extends O_3 {
   Y(Iterator var1) {
      super(var1);
   }

   protected J_5 g(Object var1) {
      return A_5.c((File)var1);
   }

   @Override
   protected Object w(Object var1) {
      return this.g(var1);
   }
}





