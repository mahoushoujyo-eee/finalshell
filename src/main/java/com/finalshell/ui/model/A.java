package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class A implements Comparator {
   public int Q(File var1, File var2) {
      return var1.getName().compareTo(var2.getName());
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((File)var1, (File)var2);
      long var4 = 488550066188234368L;
      Object[] var3 = var10001;
      var10001 = Ref.h(488550066188234368L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





