package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class S0 {
   public static Logger L;
   public final Future j;
   public final BlockingQueue F;
   public static Ky4[] D;

   public void S() {
      this.j.cancel(true);
   }

   public S0(Fv2_2 var1, ExecutorService var2) {
      Ky4[] var10000 = p();
      super();
      Ky4[] var3 = var10000;
      this.F = new ArrayBlockingQueue(1);
      this.j = var2.submit(new com.finalshell.task.N2(this, var1));
      if (var3 != null) {
         Ky4.K(new String[3]);
      }
   }

   public void J(Predicate var1) {
      this.F.offer(var1);
   }

   static Logger g() {
      return L;
   }

   static Future P(S0 var0) {
      return var0.j;
   }

   static BlockingQueue a(S0 var0) {
      return var0.F;
   }

   static {
      __vfClinit__();
   }

   public static void q(Ky4[] var0) {
      D = var0;
   }

   public static Ky4[] p() {
      return D;
   }

   public static void __vfClinit__() {
      L = LoggerFactory.getLogger(S0.class);
      q(null);
   }
}





