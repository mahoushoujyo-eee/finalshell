package com.finalshell.ui.model;

import com.finalshell.core.J_5;
import com.finalshell.core.T2_5;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.zip.ZipFile;

public class N2 extends O_3 {
   final Y2 Z;

   N2(Y2 var1, Iterator var2) {
      super(var2);
      this.Z = var1;
   }

   protected J_5 c(Object var1) {
      File var2 = (File)var1;

      try {
         return new T2_5(new ZipFile(var2));
      } catch (IOException var4) {
         return J_5.a;
      }
   }

   @Override
   protected Object w(Object var1) {
      return this.c(var1);
   }
}





