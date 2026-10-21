package com.finalshell.core;

import com.finalshell.reflect.Ref;
import java.util.ArrayList;

public class FX3 {
   ArrayList O;

   FX3() {
      ArrayList var10001 = new ArrayList();
      long var2 = 172806526899489275L;
      ArrayList var1 = var10001;
      Ref.s(172806526899489275L, var1, var2);
   }

   public boolean C(String var1) {
      boolean var2 = false;
      Object var3 = 172806526899489275L;
      return ((ArrayList)Ref.g(172806526899489275L, var3)).contains(var1);
   }

   public int i() {
      Object var1 = 172806526899489275L;
      return ((ArrayList)Ref.g(172806526899489275L, var1)).size();
   }

   public void f(String var1) {
      Object var2 = 172806526899489275L;
      ((ArrayList)Ref.g(172806526899489275L, var2)).remove(var1);
      Object var4 = 172806526899489275L;
      ((ArrayList)Ref.g(172806526899489275L, var4)).add(0, var1);
   }

   public void o(String var1) {
      Object var2 = 172806526899489275L;
      ((ArrayList)Ref.g(172806526899489275L, var2)).remove(var1);
   }

   public void F(String var1) {
      Object var2 = 172806526899489275L;
      ((ArrayList)Ref.g(172806526899489275L, var2)).add(var1);
   }

   public ArrayList x() {
      Object var1 = 172806526899489275L;
      return (ArrayList)Ref.g(172806526899489275L, var1);
   }

   public void K(ArrayList var1) {
      long var3 = 172806526899489275L;
      Ref.s(172806526899489275L, var1, var3);
   }
}





