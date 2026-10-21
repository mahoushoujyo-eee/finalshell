package com;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class S0 {
   private static final Logger L = LoggerFactory.getLogger(S0.class);
   private final Future j;
   private final BlockingQueue F;
   private static com.ky_4[] D;

   public void S() {
      this.j.cancel(true);
   }

   public S0(com.Fv_2 var1, ExecutorService var2) {
      com.ky_4[] var10000 = p();
      super();
      com.ky_4[] var3 = var10000;
      this.F = new ArrayBlockingQueue(1);
      this.j = var2.submit(new N2(this, var1));
      if (var3 != null) {
         com.ky_4.K(new String[3]);
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
      q(null);
   }

   public static void q(com.ky_4[] var0) {
      D = var0;
   }

   public static com.ky_4[] p() {
      return D;
   }
}





