import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class xB {
   ServerSocket y;
   int d;
   String H;
   int x;
   String p;
   int F;
   Object v;
   lv_4 R;
   int g;

   xB(int var1, String var2, int var3, String var4, int var5, lv_4 var6, int var7) {
      com.c.c(488475715146941343L).set(this, new Object());
      com.c.c(336797495140939972L).set(this, var2);
      com.c.c(450411236977093372L).setInt(this, var3);
      com.c.c(460017230843248271L).set(this, var4);
      com.c.c(440223267543010105L).setInt(this, var5);
      com.c.c(385199164122983902L).setInt(this, var1);
      com.c.c(257654343460162399L).set(this, var6);
      com.c.c(256861225427482174L).setInt(this, var7);

      try {
         com.c.c(451006777344254157L).set(this, new ServerSocket(var1));
      } catch (IOException var12) {
         var12.printStackTrace();
         return;
      }

      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new ga_2(this));
      Method var10003 = com.c.d(434592463220957006L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      synchronized ((Object)com.c.c(488475715146941343L).get(this)) {
         com.c.c(488475715146941343L).get(this).notifyAll();
      }
   }

   void Y(Socket var1) {
      tb_4 var2 = new tb_4(
         (String)com.c.c(336797495140939972L).get(this),
         com.c.c(450411236977093372L).getInt(this),
         (String)com.c.c(460017230843248271L).get(this),
         com.c.c(440223267543010105L).getInt(this),
         (lv_4)com.c.c(257654343460162399L).get(this),
         com.c.c(256861225427482174L).getInt(this)
      );
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(477058552633814652L);
      Object[] var10002 = var10001;
      tb_4 var4 = var2;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public int H() {
      return com.c.c(385199164122983902L).getInt(this);
   }

   public void X(int var1) {
      com.c.c(385199164122983902L).setInt(this, var1);
   }
}





