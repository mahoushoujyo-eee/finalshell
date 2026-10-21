package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class AB {
   public ArrayList h;
   public N a;

   public N q(String var1) {
      String var10000 = W2.F();
      N var3 = null;
      String var2 = var10000;
      Object var6 = 246866782302869295L;
      Iterator var4 = ((ArrayList)Ref.g(246866782302869295L, var6)).iterator();

      N var10001;
      while (true) {
         if (var4.hasNext()) {
            var10001 = (N)var4.next();
            if (var2 == null) {
               break;
            }

            N var5 = var10001;
            String var10003 = (String)(Registry.emptyArgs());
            long var9 = 325825537657373656L;
            Object[] var8 = var10003;
            var10003 = Ref.h(325825537657373656L, var8, var9);

            try {
               var10003 = (String)var10003;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (var5.equals(var10003)) {
               var3 = var5;
            }

            if (var2 != null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return var10001;
   }

   public ArrayList q() {
      Object var1 = 246866782302869295L;
      return (ArrayList)Ref.g(246866782302869295L, var1);
   }

   public void r(ArrayList var1) {
      long var3 = 246866782302869295L;
      Ref.s(246866782302869295L, var1, var3);
   }

   public N x() {
      Object var1 = 619718667615599045L;
      return (N)Ref.g(619718667615599045L, var1);
   }

   public void S(N var1) {
      long var3 = 619718667615599045L;
      Ref.s(619718667615599045L, var1, var3);
   }
}





