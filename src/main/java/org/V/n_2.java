package org.V;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.zip.ZipFile;

class n_2 extends org.l.O {
   final org.V.y_2 Z;

   n_2(org.V.y_2 var1, Iterator var2) {
      super(var2);
      this.Z = var1;
   }

   protected J c(Object var1) {
      File var2 = (File)var1;

      try {
         return new org.V.t_2(new ZipFile(var2));
      } catch (IOException var4) {
         return J.a;
      }
   }

   @Override
   protected Object w(Object var1) {
      return this.c(var1);
   }
}





