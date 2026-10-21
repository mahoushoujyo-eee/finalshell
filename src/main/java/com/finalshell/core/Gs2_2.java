package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class Gs2_2 {
   public String s;
   public int w;
   public int k;
   public String C;
   public long o;
   public boolean i;
   public static long a;

   public Gs2_2(String var1, int var2, String var3) {
      long var10000 = a;
      Registry.lookupField(469201803606960035L).setLong(this, var10000);
      long var5 = 198028181287977443L;
      Ref.s(198028181287977443L, var1, var5);
      Registry.lookupField(436768864367161834L).setInt(this, var2);
      long var7 = 568291323577419766L;
      Ref.s(568291323577419766L, var3, var7);
      Registry.lookupField(227903047376725437L).setInt(this, (var3 + var1 + var2).hashCode());
   }

   public String V() {
      Object var1 = 198028181287977443L;
      return (String)Ref.g(198028181287977443L, var1);
   }

   public void f(String var1) {
      long var3 = 198028181287977443L;
      Ref.s(198028181287977443L, var1, var3);
   }

   public int l() {
      return Registry.lookupField(436768864367161834L).getInt(this);
   }

   public void c(int var1) {
      Registry.lookupField(436768864367161834L).setInt(this, var1);
   }

   public int H$int() {
      return Registry.lookupField(227903047376725437L).getInt(this);
   }

   public String H$String() {
      Object var1 = 568291323577419766L;
      return (String)Ref.g(568291323577419766L, var1);
   }

   public void n(String var1) {
      long var3 = 568291323577419766L;
      Ref.s(568291323577419766L, var1, var3);
   }

   public boolean x() {
      return Registry.lookupField(480737096959815985L).getBoolean(this);
   }

   public void Q(boolean var1) {
      Registry.lookupField(480737096959815985L).setBoolean(this, var1);
   }

   public long C() {
      return Registry.lookupField(469201803606960035L).getLong(this);
   }

   public void p(long var1) {
      Registry.lookupField(469201803606960035L).setLong(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2800751769422750593L;
      long var10002 = -2800751769422750594L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





