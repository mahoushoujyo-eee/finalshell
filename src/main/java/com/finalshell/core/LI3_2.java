package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class LI3_2 {
   public int w;
   public String W;
   public float N;
   public float b;
   public long G;
   public String z;
   public int i;
   public String Y;
   public String Q;
   public String n;
   public ProcessMonitorService R;
   public static int p;
   public boolean y;

   public LI3_2() {
      Registry.lookupField(155314488367693094L).setBoolean(this, false);
   }

   public U82 P() {
      Integer var34;
      KV.b$arrString();
      ProcessMonitorService var10002 = (ProcessMonitorService)(Registry.emptyArgs());
      long var7 = 196459487770318525L;
      Object var6 = var10002;
      var10002 = Ref.h(196459487770318525L, var6, var7);

      try {
         var10002 = (ProcessMonitorService)var10002;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      ProcessMonitorService var2 = var10002;
      Object var3 = null;
      Object var4 = null;
      U82 var5 = null;
      if (this != null || var2 != null) {
         var10002 = Registry.emptyArgs();
         long var9 = 310731453486523656L;
         Object var8 = var10002;
         var10002 = Ref.h(310731453486523656L, var8, var9);

         try {
            var10002 = (RemoteProcessManager)var10002;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         var3 = var10002;
         if (this != null || var3 != null) {
            KV var10003 = (KV)(Registry.emptyArgs());
            long var11 = 121632250293569146L;
            Object var10 = var10003;
            var10003 = Ref.h(121632250293569146L, var10, var11);

            try {
               var10003 = (KV)var10003;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            var4 = var10003;
            if (this != null || var4 != null) {
               Object var10005 = Registry.emptyArgs();
               long var13 = 419335026051024288L;
               Object var12 = var10005;
               var10005 = Ref.h(419335026051024288L, var12, var13);

               try {
                  var34 = (Integer)var10005;
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               var10005 = Registry.packArgs(var34);
               long var15 = 397583903343830359L;
               Object var14 = var10005;
               var10005 = Ref.h(397583903343830359L, var14, var15);

               try {
                  var10005 = (U82)var10005;
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               var5 = var10005;
               if (this != null) {
                  return var5;
               }

               if (var5 != null) {
                  Object[] var10006 = Registry.packArgs(this);
                  long var17 = 527303333672155887L;
                  Object[] var16 = var10006;
                  Ref.h(527303333672155887L, var16, var17);

                  try {
                     ;
                  } catch (InvocationTargetException var18) {
                     throw var18.getTargetException();
                  }
               }
            }
         }
      }

      return var5;
   }

   public int m() {
      return Registry.lookupField(192095600120270773L).getInt(this);
   }

   public void F(int var1) {
      Registry.lookupField(192095600120270773L).setInt(this, var1);
   }

   public String R() {
      Object var1 = 353381875203849568L;
      return (String)Ref.g(353381875203849568L, var1);
   }

   public void X(String var1) {
      long var3 = 353381875203849568L;
      Ref.s(353381875203849568L, var1, var3);
   }

   public float r() {
      return Registry.lookupField(608416061655776219L).getFloat(this);
   }

   public void j(float var1) {
      Registry.lookupField(608416061655776219L).setFloat(this, var1);
   }

   public float c$float() {
      return Registry.lookupField(189697109435936400L).getFloat(this);
   }

   public void M(float var1) {
      Registry.lookupField(189697109435936400L).setFloat(this, var1);
   }

   public long c$long() {
      return Registry.lookupField(242945970997122331L).getLong(this);
   }

   public void P(long var1) {
      Registry.lookupField(242945970997122331L).setLong(this, var1);
   }

   public String B() {
      Object var1 = 514305275477685282L;
      return (String)Ref.g(514305275477685282L, var1);
   }

   public void H(String var1) {
      long var3 = 514305275477685282L;
      Ref.s(514305275477685282L, var1, var3);
   }

   public int G() {
      return Registry.lookupField(508417423651300428L).getInt(this);
   }

   public void O(int var1) {
      Registry.lookupField(508417423651300428L).setInt(this, var1);
   }

   public String y() {
      Object var1 = 621212418855419396L;
      return (String)Ref.g(621212418855419396L, var1);
   }

   public void V(String var1) {
      long var3 = 621212418855419396L;
      Ref.s(621212418855419396L, var1, var3);
   }

   public ProcessMonitorService L$CB() {
      Object var1 = 582665518836830900L;
      return (ProcessMonitorService)Ref.g(582665518836830900L, var1);
   }

   public void H(ProcessMonitorService var1) {
      long var3 = 582665518836830900L;
      Ref.s(582665518836830900L, var1, var3);
   }

   public String L$String() {
      Object var1 = 532230736649289867L;
      return (String)Ref.g(532230736649289867L, var1);
   }

   public void d(String var1) {
      long var3 = 532230736649289867L;
      Ref.s(532230736649289867L, var1, var3);
   }

   public String g() {
      Object var1 = 241783373111094041L;
      return (String)Ref.g(241783373111094041L, var1);
   }

   public void D(String var1) {
      long var3 = 241783373111094041L;
      Ref.s(241783373111094041L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 2892425092713227975L;
      long var10002 = 1343427008358288270L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      Registry.lookupField(438127421029105876L).setInt(null, (int)var0);
   }
}





