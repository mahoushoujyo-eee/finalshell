package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;

public class M5 implements Qa2 {
   public boolean B;
   public boolean c;
   public String d;
   public boolean m;
   public final YT3_2 J;

   public M5(YT3_2 var1) {
      this.J = var1;
      Registry.lookupField(351602801032386416L).setBoolean(this, false);
      Registry.lookupField(267771528325621470L).setBoolean(this, false);
   }

   @Override
   public void j(boolean var1, String var2, boolean var3, boolean var4) {
      label38: {
         M5 var16;
         boolean var10001;
         label41: {
            Ky4[] var10000 = YT3_2.c();
            Registry.lookupField(441830192243335566L).setBoolean(this, var1);
            Ky4[] var5 = var10000;
            boolean var15 = var1;
            if (var5 != null) {
               if (!var1) {
                  break label38;
               }

               Registry.lookupField(351602801032386416L).setBoolean(this, var3);
               var16 = this;
               var10001 = var4;
               if (var5 == null) {
                  break label41;
               }

               Registry.lookupField(267771528325621470L).setBoolean(this, var4);
               var15 = var4;
            }

            if (!var15) {
               break label38;
            }

            var16 = this;
            var10001 = true;
         }

         Registry.lookupField(351602801032386416L).setBoolean(var16, var10001);
      }

      Ty4 var6 = new Ty4(Registry.lookupField(146259046198212012L).getInt(null));
      Object[] var17 = Registry.packArgs(var2);
      long var8 = 350719173176424084L;
      Object[] var7 = var17;
      Ref.h(350719173176424084L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object var9 = 403610705477780429L;
      Ref.g(403610705477780429L, var9);
      Object[] var10003 = Registry.packArgs(var6);
      long var12 = 473928376202613579L;
      Object[] var11 = var10003;
      Ref.h(473928376202613579L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }

   @Override
   public boolean v() {
      return Registry.lookupField(351602801032386416L).getBoolean(this);
   }

   @Override
   public boolean w() {
      return Registry.lookupField(267771528325621470L).getBoolean(this);
   }

   @Override
   public String f() {
      Object var1 = 335642054769008471L;
      return (String)Ref.g(335642054769008471L, var1);
   }

   @Override
   public boolean l() {
      return Registry.lookupField(441830192243335566L).getBoolean(this);
   }
}





