import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class m5 implements Qa_2 {
   boolean B;
   boolean c;
   String d;
   boolean m;
   final yT_3 J;

   m5(yT_3 var1) {
      this.J = var1;
      com.c.c(351602801032386416L).setBoolean(this, false);
      com.c.c(267771528325621470L).setBoolean(this, false);
   }

   @Override
   public void j(boolean var1, String var2, boolean var3, boolean var4) {
      label38: {
         m5 var10;
         boolean var10001;
         label41: {
            com.ky_4[] var10000 = yT_3.c();
            com.c.c(441830192243335566L).setBoolean(this, var1);
            com.ky_4[] var5 = var10000;
            boolean var9 = var1;
            if (var5 != null) {
               if (!var1) {
                  break label38;
               }

               com.c.c(351602801032386416L).setBoolean(this, var3);
               var10 = this;
               var10001 = var4;
               if (var5 == null) {
                  break label41;
               }

               com.c.c(267771528325621470L).setBoolean(this, var4);
               var9 = var4;
            }

            if (!var9) {
               break label38;
            }

            var10 = this;
            var10001 = true;
         }

         com.c.c(351602801032386416L).setBoolean(var10, var10001);
      }

      ty_4 var6 = new ty_4(com.c.c(146259046198212012L).getInt(null));
      Object[] var14 = com.c.a(var2);
      Method var10003 = com.c.d(350719173176424084L);
      Object[] var10002 = var14;
      ty_4 var15 = var6;
      Method var11 = var10003;

      try {
         var11.invoke(var15, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Method var12 = (Method)com.c.c(403610705477780429L).get(this);
      var14 = com.c.a(var6);
      var10003 = com.c.d(473928376202613579L);
      var10002 = var14;
      var14 = var12;
      var12 = var10003;

      try {
         var12.invoke(var14, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   @Override
   public boolean v() {
      return com.c.c(351602801032386416L).getBoolean(this);
   }

   @Override
   public boolean w() {
      return com.c.c(267771528325621470L).getBoolean(this);
   }

   @Override
   public String f() {
      return (String)com.c.c(335642054769008471L).get(this);
   }

   @Override
   public boolean l() {
      return com.c.c(441830192243335566L).getBoolean(this);
   }
}





