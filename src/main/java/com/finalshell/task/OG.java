package com.finalshell.task;

import com.finalshell.core.CB;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class OG implements Runnable {
   public final ArrayList R;
   public final CB V;

   public OG(CB var1, ArrayList var2) {
      this.V = var1;
      this.R = var2;
   }

   @Override
   public void run() {
      Object var1 = 351102513610977778L;
      Ref.g(351102513610977778L, var1);
      Object var3 = 414347828709011535L;
      Ref.g(414347828709011535L, var3);
      Object var5 = 228277604966097106L;
      Object[] var10004 = Registry.packArgs(Ref.g(228277604966097106L, var5));
      long var8 = 228073642375378428L;
      Object[] var7 = var10004;
      Ref.h(228073642375378428L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }
}





