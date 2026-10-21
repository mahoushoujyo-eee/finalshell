package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.Serializable;
import java.net.ServerSocket;

public class BS implements Serializable {
   public int F;
   public int J;
   public String P;
   public String C;
   boolean Y;
   ServerSocket u;
   public static int l;

   public BS() {
      Registry.lookupField(119164611987165839L).setBoolean(this, false);
   }

   public int n() {
      return Registry.lookupField(152188236116144859L).getInt(this);
   }

   public void j(int var1) {
      Registry.lookupField(152188236116144859L).setInt(this, var1);
   }

   public int b() {
      return Registry.lookupField(624294956745947517L).getInt(this);
   }

   public void W(int var1) {
      Registry.lookupField(624294956745947517L).setInt(this, var1);
   }

   public String c() {
      Object var1 = 611732392331370513L;
      return (String)Ref.g(611732392331370513L, var1);
   }

   public void D(String var1) {
      long var3 = 611732392331370513L;
      Ref.s(611732392331370513L, var1, var3);
   }

   public String f() {
      Object var1 = 512189539626964799L;
      return (String)Ref.g(512189539626964799L, var1);
   }

   public void m(String var1) {
      long var3 = 512189539626964799L;
      Ref.s(512189539626964799L, var1, var3);
   }

   public static void q(int var0) {
      l = var0;
   }

   public static int s() {
      return l;
   }

   public static int t() {
      int var0 = s();
      return var0 == 0 ? 122 : 0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (t() != 0) {
         q(121);
      }
   }
}





