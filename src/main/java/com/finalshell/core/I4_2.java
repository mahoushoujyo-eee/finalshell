package com.finalshell.core;

import java.net.URL;
import java.util.Map;
import java.util.jar.JarFile;

public class I4_2 implements S_6 {
   final URL q;
   final JarFile E;

   I4_2(URL var1, JarFile var2) {
      this.q = var1;
      this.E = var2;
   }

   @Override
   public Map T(String var1, boolean var2, boolean var3) {
      return K2_5.Z(this.q, this.E, var1, var2, var3);
   }
}





